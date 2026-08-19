package p1048uo;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17356w;
import p1068vo.AbstractC20653c;
import p1068vo.C20654d;
import p1136yo.C21559a;
import p1136yo.C21560b;
import p1136yo.InterfaceC21562d;
import p523V9.AbstractC8152n6;
import p882m1.clb.WGTYqNchEpHca;
import p885m4.C17152b;

/* JADX INFO: renamed from: uo.n */
/* JADX INFO: loaded from: classes2.dex */
public class C20407n {

    /* JADX INFO: renamed from: a */
    public static volatile C20407n f64525a;

    /* JADX INFO: renamed from: b */
    public static final Logger f64526b;

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[PHI: r3
      0x0072: PHI (r3v3 uo.n) = (r3v1 uo.n), (r3v4 uo.n) binds: [B:65:0x0156, B:25:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[PHI: r2
      0x0094: PHI (r2v26 uo.n) = (r2v15 uo.n), (r2v20 uo.n), (r2v24 uo.n), (r2v29 uo.n) binds: [B:55:0x00e2, B:49:0x00d4, B:41:0x00b4, B:33:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    static {
        C20407n c20404k;
        String jvmVersion;
        C20407n c20407n;
        C20407n c20403j = null;
        if (C17152b.m18912i()) {
            for (Map.Entry entry : AbstractC20653c.f65532b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC20653c.f65531a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C20654d.f65533a);
                }
            }
            c20407n = C20394a.f64502d ? new C20394a() : null;
            if (c20407n == null) {
                c20403j = C20396c.f64506e ? new C20396c() : null;
                AbstractC16544l.m18091d(c20403j);
                c20407n = c20403j;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            c20404k = C20401h.f64512d ? new C20401h() : null;
            if (c20404k != null) {
                c20407n = c20404k;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (C20398e.f64509d) {
                    c20404k = new C20398e();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (C20406m.f64523d) {
                        c20404k = new C20406m();
                    } else {
                        c20404k = null;
                    }
                    if (c20404k != null) {
                        c20407n = c20404k;
                    } else {
                        if (C20404k.f64522c) {
                            c20404k = new C20404k();
                        } else {
                            c20404k = null;
                        }
                        if (c20404k != null) {
                            c20407n = c20404k;
                        } else {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                Method getMethod = cls.getMethod("get", SSLSocket.class);
                                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                AbstractC16544l.m18093f(putMethod, "putMethod");
                                AbstractC16544l.m18093f(getMethod, "getMethod");
                                AbstractC16544l.m18093f(removeMethod, "removeMethod");
                                AbstractC16544l.m18093f(clientProviderClass, "clientProviderClass");
                                AbstractC16544l.m18093f(serverProviderClass, "serverProviderClass");
                                c20403j = new C20403j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                            }
                            if (c20403j != null) {
                                c20407n = c20403j;
                            } else {
                                c20407n = new C20407n();
                            }
                        }
                    }
                } else {
                    if (C20404k.f64522c) {
                        c20404k = new C20404k();
                    } else {
                        c20404k = null;
                    }
                    if (c20404k != null) {
                        c20407n = c20404k;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                            Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                            Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                            AbstractC16544l.m18093f(putMethod2, "putMethod");
                            AbstractC16544l.m18093f(getMethod2, "getMethod");
                            AbstractC16544l.m18093f(removeMethod2, "removeMethod");
                            AbstractC16544l.m18093f(clientProviderClass2, "clientProviderClass");
                            AbstractC16544l.m18093f(serverProviderClass2, "serverProviderClass");
                            c20403j = new C20403j(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                        }
                        if (c20403j != null) {
                            c20407n = c20403j;
                        } else {
                            c20407n = new C20407n();
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (C20404k.f64522c) {
                    c20404k = new C20404k();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                        Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                        Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                        AbstractC16544l.m18093f(putMethod3, "putMethod");
                        AbstractC16544l.m18093f(getMethod3, "getMethod");
                        AbstractC16544l.m18093f(removeMethod3, "removeMethod");
                        AbstractC16544l.m18093f(clientProviderClass3, "clientProviderClass");
                        AbstractC16544l.m18093f(serverProviderClass3, "serverProviderClass");
                        c20403j = new C20403j(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                    }
                    if (c20403j != null) {
                        c20407n = c20403j;
                    } else {
                        c20407n = new C20407n();
                    }
                }
            } else {
                if (C20406m.f64523d) {
                    c20404k = new C20406m();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else {
                    if (C20404k.f64522c) {
                        c20404k = new C20404k();
                    } else {
                        c20404k = null;
                    }
                    if (c20404k != null) {
                        c20407n = c20404k;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                            Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                            Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                            AbstractC16544l.m18093f(putMethod4, "putMethod");
                            AbstractC16544l.m18093f(getMethod4, "getMethod");
                            AbstractC16544l.m18093f(removeMethod4, "removeMethod");
                            AbstractC16544l.m18093f(clientProviderClass4, "clientProviderClass");
                            AbstractC16544l.m18093f(serverProviderClass4, "serverProviderClass");
                            c20403j = new C20403j(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                        }
                        if (c20403j != null) {
                            c20407n = c20403j;
                        } else {
                            c20407n = new C20407n();
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (C20398e.f64509d) {
                c20404k = new C20398e();
            } else {
                c20404k = null;
            }
            if (c20404k != null) {
                c20407n = c20404k;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (C20404k.f64522c) {
                    c20404k = new C20404k();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                        Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                        AbstractC16544l.m18093f(putMethod5, "putMethod");
                        AbstractC16544l.m18093f(getMethod5, "getMethod");
                        AbstractC16544l.m18093f(removeMethod5, "removeMethod");
                        AbstractC16544l.m18093f(clientProviderClass5, "clientProviderClass");
                        AbstractC16544l.m18093f(serverProviderClass5, "serverProviderClass");
                        c20403j = new C20403j(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                    }
                    if (c20403j != null) {
                        c20407n = c20403j;
                    } else {
                        c20407n = new C20407n();
                    }
                }
            } else {
                if (C20406m.f64523d) {
                    c20404k = new C20406m();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else {
                    if (C20404k.f64522c) {
                        c20404k = new C20404k();
                    } else {
                        c20404k = null;
                    }
                    if (c20404k != null) {
                        c20407n = c20404k;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                            Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                            Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                            AbstractC16544l.m18093f(putMethod6, "putMethod");
                            AbstractC16544l.m18093f(getMethod6, "getMethod");
                            AbstractC16544l.m18093f(removeMethod6, "removeMethod");
                            AbstractC16544l.m18093f(clientProviderClass6, "clientProviderClass");
                            AbstractC16544l.m18093f(serverProviderClass6, "serverProviderClass");
                            c20403j = new C20403j(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                        }
                        if (c20403j != null) {
                            c20407n = c20403j;
                        } else {
                            c20407n = new C20407n();
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (C20404k.f64522c) {
                c20404k = new C20404k();
            } else {
                c20404k = null;
            }
            if (c20404k != null) {
                c20407n = c20404k;
            } else {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            AbstractC16544l.m18093f(putMethod7, "putMethod");
                            AbstractC16544l.m18093f(getMethod7, "getMethod");
                            AbstractC16544l.m18093f(removeMethod7, "removeMethod");
                            AbstractC16544l.m18093f(clientProviderClass7, "clientProviderClass");
                            AbstractC16544l.m18093f(serverProviderClass7, "serverProviderClass");
                            c20403j = new C20403j(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (c20403j != null) {
                    c20407n = c20403j;
                } else {
                    c20407n = new C20407n();
                }
            }
        } else {
            if (C20406m.f64523d) {
                c20404k = new C20406m();
            } else {
                c20404k = null;
            }
            if (c20404k != null) {
                c20407n = c20404k;
            } else {
                if (C20404k.f64522c) {
                    c20404k = new C20404k();
                } else {
                    c20404k = null;
                }
                if (c20404k != null) {
                    c20407n = c20404k;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    AbstractC16544l.m18093f(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        AbstractC16544l.m18093f(putMethod8, "putMethod");
                        AbstractC16544l.m18093f(getMethod8, "getMethod");
                        AbstractC16544l.m18093f(removeMethod8, "removeMethod");
                        AbstractC16544l.m18093f(clientProviderClass8, "clientProviderClass");
                        AbstractC16544l.m18093f(serverProviderClass8, "serverProviderClass");
                        c20403j = new C20403j(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (c20403j != null) {
                        c20407n = c20403j;
                    } else {
                        c20407n = new C20407n();
                    }
                }
            }
        }
        f64525a = c20407n;
        f64526b = Logger.getLogger(C17356w.class.getName());
    }

    /* JADX INFO: renamed from: i */
    public static void m21074i(String message, int i10, Throwable th2) {
        AbstractC16544l.m18094g(message, "message");
        f64526b.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m21075j(C20407n c20407n, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        c20407n.getClass();
        m21074i(str, i10, null);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC8152n6 mo21050b(X509TrustManager x509TrustManager) {
        return new C21559a(mo21055c(x509TrustManager));
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC21562d mo21055c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC16544l.m18093f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C21560b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: d */
    public void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
    }

    /* JADX INFO: renamed from: e */
    public void mo21056e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC16544l.m18094g(address, "address");
        socket.connect(address, i10);
    }

    /* JADX INFO: renamed from: f */
    public String mo21052f(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Object mo21057g() {
        if (f64526b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo21053h(String hostname) {
        AbstractC16544l.m18094g(hostname, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void mo21058k(Object obj, String message) {
        AbstractC16544l.m18094g(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m21074i(message, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public SSLContext mo21064l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC16544l.m18093f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX INFO: renamed from: m */
    public SSLSocketFactory mo21068m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo21064l = mo21064l();
            sSLContextMo21064l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo21064l.getSocketFactory();
            AbstractC16544l.m18093f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: n */
    public X509TrustManager mo21065n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC16544l.m18091d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC16544l.m18092e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC16544l.m18093f(string, "toString(this)");
        throw new IllegalStateException(WGTYqNchEpHca.HpzdZceeieQ.concat(string).toString());
    }

    /* JADX INFO: renamed from: a */
    public void mo21069a(SSLSocket sSLSocket) {
    }
}
