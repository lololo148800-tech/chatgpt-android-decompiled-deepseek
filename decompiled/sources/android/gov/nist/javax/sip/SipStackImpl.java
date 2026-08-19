package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.LogWriter;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.core.net.DefaultSecurityManagerProvider;
import android.gov.nist.core.net.NetworkLayer;
import android.gov.nist.core.net.SecurityManagerProvider;
import android.gov.nist.core.net.SslNetworkLayer;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.clientauthutils.AccountManager;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelperImpl;
import android.gov.nist.javax.sip.clientauthutils.SecureAccountManager;
import android.gov.nist.javax.sip.parser.MessageParserFactory;
import android.gov.nist.javax.sip.parser.PostParseExecutorServices;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.parser.StringMsgParserFactory;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.ByteBufferFactory;
import android.gov.nist.javax.sip.stack.ClientAuthType;
import android.gov.nist.javax.sip.stack.DefaultMessageLogFactory;
import android.gov.nist.javax.sip.stack.DefaultRouter;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import android.gov.nist.javax.sip.stack.MessageProcessorFactory;
import android.gov.nist.javax.sip.stack.NIOMode;
import android.gov.nist.javax.sip.stack.OIOMessageProcessorFactory;
import android.gov.nist.javax.sip.stack.SIPEventInterceptor;
import android.gov.nist.javax.sip.stack.SIPMessageValve;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.timers.DefaultSipTimer;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.C10796c;
import android.javax.sip.C10800g;
import android.javax.sip.C10802i;
import android.javax.sip.C10803j;
import android.javax.sip.InterfaceC10801h;
import android.javax.sip.InterfaceC10809p;
import android.javax.sip.InterfaceC10810q;
import android.javax.sip.InterfaceC10811r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12944c;
import p713e.InterfaceC13252z;
import p817j$.util.DesugarCollections;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes.dex */
public class SipStackImpl extends SIPTransactionStack implements InterfaceC10811r, SipStackExt {
    private String[] cipherSuites;
    private Properties configurationProperties;
    private String[] enabledProtocols;
    private EventScanner eventScanner;
    protected Hashtable<String, ListeningPointImpl> listeningPoints;
    private boolean reEntrantListener;
    InterfaceC10809p sipListener;
    protected List<SipProviderImpl> sipProviders;
    private Semaphore stackSemaphore;
    TlsSecurityPolicy tlsSecurityPolicy;
    private static StackLogger logger = CommonLogger.getLogger(SipStackImpl.class);
    public static final Integer MAX_DATAGRAM_SIZE = 65536;
    public static final String[] DEFAULT_CIPHERS = {"TLS_RSA_WITH_AES_128_CBC_SHA", "SSL_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"};

    public SipStackImpl() {
        this.stackSemaphore = new Semaphore(1);
        this.cipherSuites = DEFAULT_CIPHERS;
        this.enabledProtocols = new String[]{"TLSv1.2", "TLSv1.1", "TLSv1"};
        super.setMessageFactory(new NistSipMessageFactoryImpl(this));
        this.eventScanner = new EventScanner(this);
        this.listeningPoints = new Hashtable<>();
        this.sipProviders = new CopyOnWriteArrayList();
        try {
            if (Charset.forName("UTF-8") != null) {
            } else {
                throw new UnsupportedCharsetException("Unsupported charset UTF-8");
            }
        } catch (Exception e10) {
            logger.logWarning("UTF-8 charset cannot be used this system. This will lead to unpredictable behavior when parsing SIP messages: " + e10.getMessage());
        }
    }

    private void reInitialize() {
        super.reInit();
        this.eventScanner = new EventScanner(this);
        this.listeningPoints = new Hashtable<>();
        this.sipProviders = new CopyOnWriteArrayList();
        this.sipListener = null;
        if (getTimer().isStarted()) {
            return;
        }
        try {
            setTimer((SipTimer) Class.forName(this.configurationProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
            getTimer().start(this, this.configurationProperties);
            if (getThreadAuditor() == null || !getThreadAuditor().isEnabled()) {
                return;
            }
            getTimer().schedule(new SIPTransactionStack.PingTimer(null), 0L);
        } catch (Exception e10) {
            logger.logError("Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME", e10);
        }
    }

    public boolean acquireSem() {
        try {
            return this.stackSemaphore.tryAcquire(10L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Deprecated
    public void addLogAppender(Appender appender) {
        StackLogger stackLogger = logger;
        if (stackLogger instanceof LogWriter) {
            ((LogWriter) stackLogger).addAppender(appender);
        }
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public synchronized InterfaceC10801h createListeningPoint(String str, int i10, String str2) {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("createListeningPoint : address = " + str + " port = " + i10 + " transport = " + str2);
            }
            if (str == null) {
                throw new NullPointerException("Address for listening point is null!");
            }
            if (str2 == null) {
                throw new NullPointerException("null transport");
            }
            if (i10 <= 0) {
                throw new C10800g("bad port");
            }
            if (!str2.equalsIgnoreCase("UDP") && !str2.equalsIgnoreCase("TLS") && !str2.equalsIgnoreCase("TCP") && !str2.equalsIgnoreCase("SCTP") && !str2.equalsIgnoreCase(ListeningPointExt.f31993WS) && !str2.equalsIgnoreCase(ListeningPointExt.WSS)) {
                throw new C10796c("bad transport ".concat(str2));
            }
            if (!isAlive()) {
                this.toExit = false;
                reInitialize();
            }
            String strMakeKey = ListeningPointImpl.makeKey(str, i10, str2);
            ListeningPointImpl listeningPointImpl = this.listeningPoints.get(strMakeKey);
            if (listeningPointImpl != null) {
                return listeningPointImpl;
            }
            try {
                MessageProcessor messageProcessorCreateMessageProcessor = createMessageProcessor(InetAddress.getByName(str), i10, str2);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Created Message Processor: " + str + " port = " + i10 + " transport = " + str2);
                }
                ListeningPointImpl listeningPointImpl2 = new ListeningPointImpl(this, i10, str2);
                listeningPointImpl2.messageProcessor = messageProcessorCreateMessageProcessor;
                messageProcessorCreateMessageProcessor.setListeningPoint(listeningPointImpl2);
                this.listeningPoints.put(strMakeKey, listeningPointImpl2);
                messageProcessorCreateMessageProcessor.start();
                return listeningPointImpl2;
            } catch (IOException e10) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Invalid argument address = " + str + " port = " + i10 + " transport = " + str2);
                }
                C10800g c10800g = new C10800g(e10.getMessage());
                c10800g.f32037Y = e10;
                throw c10800g;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public InterfaceC10810q createSipProvider(InterfaceC10801h interfaceC10801h) throws C10802i {
        if (interfaceC10801h == null) {
            throw new NullPointerException("null listeningPoint");
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("createSipProvider: " + interfaceC10801h);
        }
        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) interfaceC10801h;
        if (listeningPointImpl.sipProvider != null) {
            throw new C10802i("Provider already attached!");
        }
        SipProviderImpl sipProviderImpl = new SipProviderImpl(this);
        sipProviderImpl.setListeningPoint(listeningPointImpl);
        listeningPointImpl.sipProvider = sipProviderImpl;
        this.sipProviders.add(sipProviderImpl);
        return sipProviderImpl;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void deleteListeningPoint(InterfaceC10801h interfaceC10801h) {
        if (interfaceC10801h == null) {
            throw new NullPointerException("null listeningPoint arg");
        }
        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) interfaceC10801h;
        super.removeMessageProcessor(listeningPointImpl.messageProcessor);
        this.listeningPoints.remove(listeningPointImpl.getKey());
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void deleteSipProvider(InterfaceC10810q interfaceC10810q) throws C10802i {
        if (interfaceC10810q == null) {
            throw new NullPointerException("null provider arg");
        }
        SipProviderImpl sipProviderImpl = (SipProviderImpl) interfaceC10810q;
        if (sipProviderImpl.getSipListener() != null) {
            throw new C10802i("SipProvider still has an associated SipListener!");
        }
        sipProviderImpl.removeListeningPoints();
        sipProviderImpl.stop();
        this.sipProviders.remove(interfaceC10810q);
        if (this.sipProviders.isEmpty()) {
            stopStack();
        }
    }

    public void finalize() {
        stopStack();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public AuthenticationHelper getAuthenticationHelper(AccountManager accountManager, InterfaceC13252z interfaceC13252z) {
        return new AuthenticationHelperImpl(this, accountManager, interfaceC13252z);
    }

    public Properties getConfigurationProperties() {
        return this.configurationProperties;
    }

    public String[] getEnabledCipherSuites() {
        return this.cipherSuites;
    }

    public String[] getEnabledProtocols() {
        return this.enabledProtocols;
    }

    public EventScanner getEventScanner() {
        return this.eventScanner;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public String getIPAddress() {
        return super.getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public Iterator getListeningPoints() {
        Hashtable<String, ListeningPointImpl> hashtable = this.listeningPoints;
        return DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable).iterator();
    }

    public LogRecordFactory getLogRecordFactory() {
        return this.logRecordFactory;
    }

    @Deprecated
    public Logger getLogger() {
        StackLogger stackLogger = logger;
        if (stackLogger instanceof LogWriter) {
            return ((LogWriter) stackLogger).getLogger();
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public AuthenticationHelper getSecureAuthenticationHelper(SecureAccountManager secureAccountManager, InterfaceC13252z interfaceC13252z) {
        return new AuthenticationHelperImpl(this, secureAccountManager, interfaceC13252z);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionStack
    public InterfaceC10809p getSipListener() {
        return this.sipListener;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public Iterator<SipProviderImpl> getSipProviders() {
        return this.sipProviders.iterator();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public String getStackName() {
        return this.stackName;
    }

    public TlsSecurityPolicy getTlsSecurityPolicy() {
        return this.tlsSecurityPolicy;
    }

    public boolean isAutomaticDialogErrorHandlingEnabled() {
        return this.isAutomaticDialogErrorHandlingEnabled;
    }

    public boolean isAutomaticDialogSupportEnabled() {
        return this.isAutomaticDialogSupportEnabled;
    }

    public boolean isBackToBackUserAgent() {
        return this.isBackToBackUserAgent;
    }

    public boolean isReEntrantListener() {
        return this.reEntrantListener;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public boolean isRetransmissionFilterActive() {
        return true;
    }

    public void releaseSem() {
        this.stackSemaphore.release();
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void setEnabledCipherSuites(String[] strArr) {
        this.cipherSuites = strArr;
    }

    public void setEnabledProtocols(String[] strArr) {
        this.enabledProtocols = strArr;
    }

    public void setIsBackToBackUserAgent(boolean z6) {
        this.isBackToBackUserAgent = z6;
    }

    public void setTlsSecurityPolicy(TlsSecurityPolicy tlsSecurityPolicy) {
        this.tlsSecurityPolicy = tlsSecurityPolicy;
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void start() {
        if (this.eventScanner == null) {
            this.eventScanner = new EventScanner(this);
        }
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public void stop() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("stopStack -- stoppping the stack");
            logger.logStackTrace();
        }
        stopStack();
        if (this.sipMessageValves.size() != 0) {
            Iterator<SIPMessageValve> it = this.sipMessageValves.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        }
        SIPEventInterceptor sIPEventInterceptor = this.sipEventInterceptor;
        if (sIPEventInterceptor != null) {
            sIPEventInterceptor.destroy();
        }
        this.sipProviders = new CopyOnWriteArrayList();
        this.listeningPoints = new Hashtable<>();
        EventScanner eventScanner = this.eventScanner;
        if (eventScanner != null) {
            eventScanner.forceStop();
        }
        this.eventScanner = null;
        PostParseExecutorServices.shutdownThreadpool();
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0595  */
    /* JADX WARN: Instruction removed from duplicated block: B:227:0x0595, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v240, types: [android.gov.nist.javax.sip.stack.timers.SipTimer] */
    /* JADX WARN: Type inference failed for: r0v269, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v270, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v274, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v275, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v279, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v280, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v89, types: [android.gov.nist.core.net.SecurityManagerProvider] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.gov.nist.core.ThreadAuditor$ThreadHandle, java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.gov.nist.javax.sip.MergedSystemProperties, java.lang.Object, java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.gov.nist.core.ServerLogger] */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.gov.nist.core.StackLogger] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public SipStackImpl(Properties properties) throws C10803j {
        String str;
        String str2;
        String str3;
        String str4;
        ?? r14;
        boolean z6;
        boolean z10;
        Object obj;
        this();
        ?? mergedSystemProperties = new MergedSystemProperties(properties);
        this.configurationProperties = mergedSystemProperties;
        String property = mergedSystemProperties.getProperty("android.javax.sip.IP_ADDRESS");
        if (property != null) {
            try {
                super.setHostAddress(property);
            } catch (UnknownHostException unused) {
                throw new C10803j("bad address ".concat(property));
            }
        }
        String property2 = mergedSystemProperties.getProperty("android.javax.sip.STACK_NAME");
        if (property2 != null) {
            super.setStackName(property2);
            String property3 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.STACK_LOGGER");
            property3 = property3 == null ? "android.gov.nist.core.LogWriter" : property3;
            try {
                ?? r6 = (StackLogger) Class.forName(property3).getConstructor(null).newInstance(null);
                CommonLogger.legacyLogger = r6;
                r6.setStackProperties(mergedSystemProperties);
                String property4 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SERVER_LOGGER");
                try {
                    ServerLogger serverLogger = (ServerLogger) Class.forName(property4 == null ? "android.gov.nist.javax.sip.stack.ServerLog" : property4).getConstructor(null).newInstance(null);
                    this.serverLogger = serverLogger;
                    serverLogger.setSipStack(this);
                    this.serverLogger.setStackProperties(mergedSystemProperties);
                    super.setReliableConnectionKeepAliveTimeout(Integer.parseInt(mergedSystemProperties.getProperty(zakks.IUBxxTKcjpJFVOT, "-1")) * 1000);
                    super.setSslHandshakeTimeout(Long.parseLong(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_HANDSHAKE_TIMEOUT", "-1")));
                    super.setThreadPriority(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_PRIORITY", "10")));
                    this.outboundProxy = mergedSystemProperties.getProperty("android.javax.sip.OUTBOUND_PROXY");
                    ByteBufferFactory.getInstance().setUseDirect(Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.stack.USE_DIRECT_BUFFERS", Boolean.TRUE.toString())).booleanValue());
                    this.defaultRouter = new DefaultRouter(this, this.outboundProxy);
                    String property5 = mergedSystemProperties.getProperty("android.javax.sip.ROUTER_PATH");
                    try {
                        super.setRouter((InterfaceC12944c) Class.forName(property5 == null ? "android.gov.nist.javax.sip.stack.DefaultRouter" : property5).getConstructor(InterfaceC10811r.class, String.class).newInstance(this, this.outboundProxy));
                        String property6 = mergedSystemProperties.getProperty("android.javax.sip.USE_ROUTER_FOR_ALL_URIS");
                        this.useRouterForAll = true;
                        if (property6 != null) {
                            this.useRouterForAll = "true".equalsIgnoreCase(property6);
                        }
                        String property7 = mergedSystemProperties.getProperty("android.javax.sip.EXTENSION_METHODS");
                        if (property7 != null) {
                            StringTokenizer stringTokenizer = new StringTokenizer(property7);
                            while (stringTokenizer.hasMoreTokens()) {
                                String strNextToken = stringTokenizer.nextToken(":");
                                if (!strNextToken.equalsIgnoreCase(TokenNames.BYE) && !strNextToken.equalsIgnoreCase(TokenNames.INVITE) && !strNextToken.equalsIgnoreCase(TokenNames.SUBSCRIBE) && !strNextToken.equalsIgnoreCase(TokenNames.NOTIFY) && !strNextToken.equalsIgnoreCase(TokenNames.ACK) && !strNextToken.equalsIgnoreCase(TokenNames.OPTIONS)) {
                                    addExtensionMethod(strNextToken);
                                } else {
                                    throw new C10803j("Bad extension method ".concat(strNextToken));
                                }
                            }
                        }
                        String property8 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE");
                        if (property8 != null) {
                            this.clientAuth = ClientAuthType.valueOf(property8);
                            logger.logInfo("using " + property8 + " tls auth policy");
                        }
                        String property9 = mergedSystemProperties.getProperty("javax.net.ssl.keyStore");
                        String property10 = mergedSystemProperties.getProperty("javax.net.ssl.trustStore");
                        if (property9 == null) {
                            str = "true";
                            str2 = "Cound not instantiate TLS security policy ";
                            str3 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                            str4 = "-1";
                            r14 = 0;
                        } else {
                            String str5 = property10 == null ? property9 : property10;
                            String property11 = mergedSystemProperties.getProperty("javax.net.ssl.keyStorePassword");
                            String property12 = mergedSystemProperties.getProperty("javax.net.ssl.trustStorePassword", property11);
                            String property13 = mergedSystemProperties.getProperty("javax.net.ssl.keyStoreType");
                            String property14 = mergedSystemProperties.getProperty("javax.net.ssl.trustStoreType");
                            String str6 = property14 == null ? property13 : property14;
                            try {
                                str = "true";
                                str2 = "Cound not instantiate TLS security policy ";
                                str4 = "-1";
                                str3 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                                obj = null;
                                try {
                                    this.networkLayer = new SslNetworkLayer(this, str5, property9, property11 != null ? property11.toCharArray() : null, property12 != null ? property12.toCharArray() : null, property13, str6);
                                    r14 = obj;
                                } catch (Exception e10) {
                                    e = e10;
                                    logger.logError("could not instantiate SSL networking", e);
                                    r14 = obj;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                str = "true";
                                str2 = "Cound not instantiate TLS security policy ";
                                str3 = "- check that it is present on the classpath and that there is a no-args constructor defined";
                                str4 = "-1";
                                obj = null;
                            }
                        }
                        this.isAutomaticDialogSupportEnabled = mergedSystemProperties.getProperty("android.javax.sip.AUTOMATIC_DIALOG_SUPPORT", "on").equalsIgnoreCase("on");
                        this.isAutomaticDialogErrorHandlingEnabled = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTOMATIC_DIALOG_ERROR_HANDLING", str).equals(Boolean.TRUE.toString());
                        if (this.isAutomaticDialogSupportEnabled) {
                            this.isAutomaticDialogErrorHandlingEnabled = true;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME") != null) {
                            int i10 = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME"));
                            this.maxListenerResponseTime = i10;
                            if (i10 <= 0) {
                                throw new C10803j("Bad configuration parameter android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME : should be positive");
                            }
                        } else {
                            this.maxListenerResponseTime = -1;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE") != null) {
                            this.maxTxLifetimeInvite = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE"));
                            if (super.getMaxTxLifetimeInvite() <= 0) {
                                throw new C10803j("Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE : should be positive");
                            }
                        } else {
                            this.maxTxLifetimeInvite = -1;
                        }
                        if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE") != null) {
                            this.maxTxLifetimeNonInvite = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE"));
                            if (super.getMaxTxLifetimeNonInvite() <= 0) {
                                throw new C10803j("Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE : should be positive");
                            }
                        } else {
                            this.maxTxLifetimeNonInvite = -1;
                        }
                        setDeliverTerminatedEventForAck(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK", "false").equalsIgnoreCase(str));
                        super.setDeliverUnsolicitedNotify(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY", "false")));
                        String property15 = mergedSystemProperties.getProperty("android.javax.sip.FORKABLE_EVENTS");
                        if (property15 != null) {
                            StringTokenizer stringTokenizer2 = new StringTokenizer(property15);
                            while (stringTokenizer2.hasMoreTokens()) {
                                this.forkedEvents.add(stringTokenizer2.nextToken());
                            }
                        }
                        String property16 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_SECURITY_POLICY");
                        if (property16 == null) {
                            logger.logWarning("using default tls security policy");
                            property16 = "android.gov.nist.javax.sip.stack.DefaultTlsSecurityPolicy";
                        }
                        String str7 = property16;
                        try {
                            this.tlsSecurityPolicy = (TlsSecurityPolicy) Class.forName(str7).getConstructor(r14).newInstance(r14);
                            if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.NETWORK_LAYER")) {
                                String property17 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NETWORK_LAYER");
                                try {
                                    NetworkLayer networkLayer = (NetworkLayer) Class.forName(property17).getConstructor(r14).newInstance(r14);
                                    this.networkLayer = networkLayer;
                                    networkLayer.setSipStack(this);
                                } catch (Exception e12) {
                                    throw new C10803j(AbstractC9306j0.m9889h("can't find or instantiate NetworkLayer implementation: ", property17), e12);
                                }
                            }
                            if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.ADDRESS_RESOLVER")) {
                                String property18 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ADDRESS_RESOLVER");
                                try {
                                    this.addressResolver = (AddressResolver) Class.forName(property18).getConstructor(r14).newInstance(r14);
                                } catch (Exception e13) {
                                    throw new C10803j(AbstractC9306j0.m9889h("can't find or instantiate AddressResolver implementation: ", property18), e13);
                                }
                            }
                            String property19 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CONNECTIONS");
                            if (property19 != null) {
                                try {
                                    this.maxConnections = new Integer(property19).intValue();
                                } catch (NumberFormatException e14) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("max connections - bad value " + e14.getMessage());
                                    }
                                }
                            }
                            String property20 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_POOL_SIZE");
                            if (property20 != null) {
                                try {
                                    this.threadPoolSize = new Integer(property20).intValue();
                                } catch (NumberFormatException e15) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("thread pool size - bad value " + e15.getMessage());
                                    }
                                }
                            }
                            int i11 = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONGESTION_CONTROL_TIMEOUT", "8000"));
                            super.setStackCongestionControlTimeout(i11);
                            String property21 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TCP_POST_PARSING_THREAD_POOL_SIZE");
                            if (property21 != null) {
                                try {
                                    int iIntValue = new Integer(property21).intValue();
                                    super.setTcpPostParsingThreadPoolSize(iIntValue);
                                    PostParseExecutorServices.setPostParseExcutorSize(this, iIntValue, i11);
                                } catch (NumberFormatException e16) {
                                    if (logger.isLoggingEnabled()) {
                                        StackLogger stackLogger = logger;
                                        StringBuilder sbM11058p = AbstractC10763a.m11058p("TCP post-parse thread pool size - bad value ", property21, " : ");
                                        sbM11058p.append(e16.getMessage());
                                        stackLogger.logError(sbM11058p.toString());
                                    }
                                }
                            }
                            String property22 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS");
                            if (property22 != null) {
                                try {
                                    int iIntValue2 = new Integer(property22).intValue();
                                    this.serverTransactionTableHighwaterMark = iIntValue2;
                                    this.serverTransactionTableLowaterMark = (iIntValue2 * 80) / 100;
                                } catch (NumberFormatException e17) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("transaction table size - bad value " + e17.getMessage());
                                    }
                                }
                            } else {
                                this.unlimitedServerTransactionTableSize = true;
                            }
                            String property23 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_CLIENT_TRANSACTIONS");
                            if (property23 != null) {
                                try {
                                    this.clientTransactionTableHiwaterMark = new Integer(property23).intValue();
                                    this.clientTransactionTableLowaterMark = (this.clientTransactionTableLowaterMark * 80) / 100;
                                } catch (NumberFormatException e18) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("transaction table size - bad value " + e18.getMessage());
                                    }
                                }
                            } else {
                                this.unlimitedClientTransactionTableSize = true;
                            }
                            if (mergedSystemProperties.containsKey("android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER")) {
                                String property24 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER");
                                try {
                                    this.securityManagerProvider = (SecurityManagerProvider) Class.forName(property24).getConstructor(r14).newInstance(r14);
                                } catch (Exception e19) {
                                    throw new C10803j(AbstractC9306j0.m9889h("can't find or instantiate SecurityManagerProvider implementation: ", property24), e19);
                                }
                            } else {
                                this.securityManagerProvider = new DefaultSecurityManagerProvider();
                            }
                            try {
                                this.securityManagerProvider.init(mergedSystemProperties);
                                this.cacheServerConnections = true;
                                String property25 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS");
                                if (property25 == null || !"false".equalsIgnoreCase(property25.trim())) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                    this.cacheServerConnections = false;
                                }
                                this.cacheClientConnections = true;
                                String property26 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS");
                                if (property26 != null && "false".equalsIgnoreCase(property26.trim())) {
                                    this.cacheClientConnections = z6;
                                }
                                String property27 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.READ_TIMEOUT");
                                if (property27 != null) {
                                    try {
                                        int i12 = Integer.parseInt(property27);
                                        if (i12 >= 100) {
                                            this.readTimeout = i12;
                                        } else {
                                            System.err.println("Value too low " + property27);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Bad read timeout ".concat(property27));
                                        }
                                    }
                                }
                                String property28 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CONNECTION_TIMEOUT");
                                if (property28 != null) {
                                    try {
                                        int i13 = Integer.parseInt(property28);
                                        if (i13 >= 100) {
                                            this.connTimeout = i13;
                                        } else {
                                            System.err.println("Value too low " + property27);
                                        }
                                    } catch (NumberFormatException unused3) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Bad conn timeout " + property27);
                                        }
                                    }
                                }
                                if (mergedSystemProperties.getProperty("android.gov.nist.javax.sip.STUN_SERVER") != null) {
                                    logger.logWarning("Ignoring obsolete property android.gov.nist.javax.sip.STUN_SERVER");
                                }
                                String property29 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_MESSAGE_SIZE");
                                if (property29 != null) {
                                    try {
                                        int iIntValue3 = new Integer(property29).intValue();
                                        this.maxMessageSize = iIntValue3;
                                        if (iIntValue3 < 4096) {
                                            this.maxMessageSize = 4096;
                                        }
                                        z10 = false;
                                    } catch (NumberFormatException e20) {
                                        e = e20;
                                        z10 = false;
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("maxMessageSize - bad value " + e.getMessage());
                                        }
                                    }
                                } else {
                                    z10 = false;
                                    try {
                                        this.maxMessageSize = 0;
                                    } catch (NumberFormatException e21) {
                                        e = e21;
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("maxMessageSize - bad value " + e.getMessage());
                                        }
                                    }
                                }
                                String property30 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REENTRANT_LISTENER");
                                this.reEntrantListener = (property30 == null || !str.equalsIgnoreCase(property30)) ? z10 : true;
                                String property31 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.THREAD_AUDIT_INTERVAL_IN_MILLISECS");
                                if (property31 != null) {
                                    try {
                                        this.threadAuditor = new ThreadAuditor();
                                        getThreadAuditor().setPingIntervalInMillisecs(Long.valueOf(property31).longValue() / 2);
                                    } catch (NumberFormatException e22) {
                                        if (logger.isLoggingEnabled()) {
                                            StackLogger stackLogger2 = logger;
                                            StringBuilder sbM11058p2 = AbstractC10763a.m11058p("THREAD_AUDIT_INTERVAL_IN_MILLISECS - bad value [", property31, "] ");
                                            sbM11058p2.append(e22.getMessage());
                                            stackLogger2.logError(sbM11058p2.toString());
                                        }
                                    }
                                }
                                setNon2XXAckPassedToListener(Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PASS_INVITE_NON_2XX_ACK_TO_LISTENER", "false")).booleanValue());
                                this.generateTimeStampHeader = Boolean.valueOf(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AUTO_GENERATE_TIMESTAMP", "false")).booleanValue();
                                String property32 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_FACTORY");
                                if (property32 != null) {
                                    try {
                                        this.logRecordFactory = (LogRecordFactory) Class.forName(property32).getConstructor(r14).newInstance(r14);
                                    } catch (Exception unused4) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Bad configuration value for LOG_FACTORY -- using default logger");
                                        }
                                        this.logRecordFactory = new DefaultMessageLogFactory();
                                    }
                                } else {
                                    this.logRecordFactory = new DefaultMessageLogFactory();
                                }
                                StringMsgParser.setComputeContentLengthFromMessage(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.COMPUTE_CONTENT_LENGTH_FROM_MESSAGE_BODY", "false").equalsIgnoreCase(str));
                                String property33 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS");
                                if (property33 != null) {
                                    StringTokenizer stringTokenizer3 = new StringTokenizer(property33, "\" ,");
                                    String[] strArr = new String[stringTokenizer3.countTokens()];
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("TLS Client Protocols = ");
                                    }
                                    ?? r10 = z10;
                                    while (stringTokenizer3.hasMoreTokens()) {
                                        strArr[r10] = stringTokenizer3.nextToken();
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("TLS Client Protocol = " + strArr[r10]);
                                        }
                                        r10++;
                                    }
                                    this.enabledProtocols = strArr;
                                }
                                String property34 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ENABLED_CIPHER_SUITES");
                                if (property34 != null) {
                                    StringTokenizer stringTokenizer4 = new StringTokenizer(property34, "\" ,");
                                    String[] strArr2 = new String[stringTokenizer4.countTokens()];
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Cipher Suites = ");
                                    }
                                    ?? r11 = z10;
                                    while (stringTokenizer4.hasMoreTokens()) {
                                        strArr2[r11] = stringTokenizer4.nextToken();
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("Cipher Suite = " + strArr2[r11]);
                                        }
                                        r11++;
                                    }
                                    this.cipherSuites = strArr2;
                                }
                                this.rfc2543Supported = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RFC_2543_SUPPORT_ENABLED", str).equalsIgnoreCase(str);
                                super.setPatchWebSocketHeaders(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.PATCH_SIP_WEBSOCKETS_HEADERS", str))));
                                super.setPatchRport(Boolean.valueOf(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.ALWAYS_ADD_RPORT", "false"))));
                                super.setPatchReceivedRport(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NEVER_ADD_RECEIVED_RPORT", "false")));
                                this.cancelClientTransactionChecked = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.CANCEL_CLIENT_TRANSACTION_CHECKED", str).equalsIgnoreCase(str);
                                this.logStackTraceOnMessageSend = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LOG_STACK_TRACE_ON_MESSAGE_SEND", "false").equalsIgnoreCase(str);
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("created Sip stack. Properties = " + mergedSystemProperties);
                                }
                                InputStream resourceAsStream = getClass().getResourceAsStream("/TIMESTAMP");
                                if (resourceAsStream != null) {
                                    try {
                                        String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                                        resourceAsStream.close();
                                        logger.setBuildTimeStamp(line);
                                    } catch (IOException unused5) {
                                        logger.logError("Could not open build timestamp.");
                                    }
                                }
                                Integer num = MAX_DATAGRAM_SIZE;
                                super.setReceiveUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RECEIVE_UDP_BUFFER_SIZE", num.toString())).intValue());
                                super.setSendUdpBufferSize(new Integer(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SEND_UDP_BUFFER_SIZE", num.toString())).intValue());
                                super.setConnectionLingerTimer(Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.LINGER_TIMER", "8")));
                                Boolean bool = Boolean.FALSE;
                                this.isBackToBackUserAgent = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.IS_BACK_TO_BACK_USER_AGENT", bool.toString()));
                                this.checkBranchId = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.REJECT_STRAY_RESPONSES", bool.toString()));
                                this.isDialogTerminatedEventDeliveredForNullDialog = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_NULL_DIALOG", bool.toString()));
                                this.maxForkTime = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MAX_FORK_TIME_SECONDS", WebrtcBuildVersion.maint_version));
                                this.earlyDialogTimeout = Integer.parseInt(mergedSystemProperties.getProperty(CsqksqyPE.DHTp, "180"));
                                this.minKeepAliveInterval = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MIN_KEEPALIVE_TIME_SECONDS", str4));
                                this.deliverRetransmittedAckToListener = Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DELIVER_RETRANSMITTED_ACK_TO_LISTENER", "false"));
                                this.dialogTimeoutFactor = Integer.parseInt(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.DIALOG_TIMEOUT_FACTOR", "64"));
                                try {
                                    this.messageParserFactory = (MessageParserFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", StringMsgParserFactory.class.getName())).newInstance();
                                } catch (Exception e23) {
                                    logger.logError("Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY", e23);
                                }
                                try {
                                    this.messageProcessorFactory = (MessageProcessorFactory) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", OIOMessageProcessorFactory.class.getName())).newInstance();
                                } catch (Exception e24) {
                                    logger.logError("Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY", e24);
                                }
                                String property35 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME", "7200000");
                                try {
                                    this.nioSocketMaxIdleTime = Long.parseLong(property35);
                                } catch (Exception e25) {
                                    logger.logError("Bad configuration value for android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME=" + property35, e25);
                                }
                                String property36 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.NIO_BLOCKING_MODE", "BLOCKING");
                                try {
                                    this.nioMode = NIOMode.valueOf(property36);
                                } catch (Exception e26) {
                                    logger.logError("Bad configuration value for android.gov.nist.javax.sip.NIO_BLOCKING_MODE=" + property36, e26);
                                }
                                try {
                                    setTimer((SipTimer) Class.forName(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.TIMER_CLASS_NAME", DefaultSipTimer.class.getName())).newInstance());
                                    getTimer().start(this, mergedSystemProperties);
                                    if (getThreadAuditor() != null && getThreadAuditor().isEnabled()) {
                                        getTimer().schedule(new SIPTransactionStack.PingTimer(r14), 0L);
                                    }
                                } catch (Exception e27) {
                                    logger.logError("Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME", e27);
                                }
                                if (Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.AGGRESSIVE_CLEANUP", Boolean.FALSE.toString()))) {
                                    setReleaseReferencesStrategy(ReleaseReferencesStrategy.Normal);
                                }
                                String property37 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.RELEASE_REFERENCES_STRATEGY");
                                if (property37 != null) {
                                    setReleaseReferencesStrategy(ReleaseReferencesStrategy.valueOf(property37));
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Using following release references strategy " + getReleaseReferencesStrategy());
                                    }
                                }
                                String property38 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", r14);
                                if (property38 != null && !property38.equals("")) {
                                    String[] strArrSplit = property38.split(Separators.COMMA);
                                    int length = strArrSplit.length;
                                    for (?? r12 = z10; r12 < length; r12++) {
                                        try {
                                            SIPMessageValve sIPMessageValve = (SIPMessageValve) Class.forName(strArrSplit[r12]).newInstance();
                                            try {
                                                Thread.sleep(100L);
                                                sIPMessageValve.init(this);
                                            } catch (Exception e28) {
                                                logger.logError("Error intializing SIPMessageValve", e28);
                                            }
                                            this.sipMessageValves.add(sIPMessageValve);
                                        } catch (Exception e29) {
                                            logger.logError("Bad configuration value for android.gov.nist.javax.sip.SIP_MESSAGE_VALVE", e29);
                                        }
                                    }
                                }
                                String property39 = mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", r14);
                                if (property39 != null && !property39.equals("")) {
                                    try {
                                        this.sipEventInterceptor = (SIPEventInterceptor) Class.forName(property39).newInstance();
                                        new Thread() { // from class: android.gov.nist.javax.sip.SipStackImpl.1
                                            @Override // java.lang.Thread, java.lang.Runnable
                                            public void run() {
                                                try {
                                                    Thread.sleep(100L);
                                                    SipStackImpl.this.sipEventInterceptor.init(this);
                                                } catch (Exception e30) {
                                                    SipStackImpl.logger.logError("Error intializing SIPEventInterceptor", e30);
                                                }
                                            }
                                        }.start();
                                    } catch (Exception e30) {
                                        logger.logError("Bad configuration value for android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR", e30);
                                    }
                                }
                                setSslRenegotiationEnabled(Boolean.parseBoolean(mergedSystemProperties.getProperty("android.gov.nist.javax.sip.SSL_RENEGOTIATION_ENABLED", str)));
                                return;
                            } catch (IOException e31) {
                                throw new C10803j("Cannot initialize security manager provider", e31);
                            } catch (GeneralSecurityException e32) {
                                throw new C10803j("Cannot initialize security manager provider", e32);
                            }
                        } catch (InvocationTargetException e33) {
                            throw new IllegalArgumentException(AbstractC10763a.m11054l(str2, str7, str3), e33);
                        } catch (Exception e34) {
                            throw new IllegalArgumentException(AbstractC10763a.m11054l(str2, str7, str3), e34);
                        }
                    } catch (InvocationTargetException e35) {
                        logger.logError("could not instantiate router -- invocation target problem", (Exception) e35.getCause());
                        throw new C10803j("Cound not instantiate router - check constructor", e35);
                    } catch (Exception e36) {
                        logger.logError("could not instantiate router", (Exception) e36.getCause());
                        throw new C10803j("Could not instantiate router", e36);
                    }
                } catch (InvocationTargetException e37) {
                    throw new IllegalArgumentException(AbstractC10763a.m11054l("Cound not instantiate server logger ", property3, "- check that it is present on the classpath and that there is a no-args constructor defined"), e37);
                } catch (Exception e38) {
                    throw new IllegalArgumentException(AbstractC10763a.m11054l("Cound not instantiate server logger ", property3, "- check that it is present on the classpath and that there is a no-args constructor defined"), e38);
                }
            } catch (InvocationTargetException e39) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("Cound not instantiate stack logger ", property3, "- check that it is present on the classpath and that there is a no-args constructor defined"), e39);
            } catch (Exception e40) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("Cound not instantiate stack logger ", property3, "- check that it is present on the classpath and that there is a no-args constructor defined"), e40);
            }
        }
        throw new C10803j("stack name is missing");
    }

    @Override // android.gov.nist.javax.sip.SipStackExt
    public InterfaceC10801h createListeningPoint(int i10, String str) {
        String str2 = this.stackAddress;
        if (str2 != null) {
            return createListeningPoint(str2, i10, str);
        }
        throw new NullPointerException("Stack does not have a default IP Address!");
    }
}
