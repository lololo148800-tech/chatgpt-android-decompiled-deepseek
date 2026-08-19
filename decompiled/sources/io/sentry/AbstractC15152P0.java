package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.android.core.C15216g;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.cache.C15329c;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.config.AbstractC15340a;
import io.sentry.config.C15341b;
import io.sentry.config.C15342c;
import io.sentry.config.C15344e;
import io.sentry.internal.debugmeta.C15383b;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.internal.modules.C15390c;
import io.sentry.internal.modules.C15392e;
import io.sentry.internal.modules.C15393f;
import io.sentry.internal.modules.InterfaceC15388a;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15447t;
import io.sentry.transport.C15485h;
import io.sentry.util.AbstractC15500e;
import io.sentry.util.thread.C15506b;
import io.sentry.util.thread.C15507c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import p1139z0.C21585H;
import p138F8.vJO.anhfj;
import p468T2.RunnableC7216h;
import p658b5.C11238i;
import p775h2.AbstractC14376f;
import p784hb.C14438g;
import p813ij.C15026j;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.P0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15152P0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f47164a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC15124G f47165b = C15458r0.f48278b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f47166c = false;

    /* JADX INFO: renamed from: d */
    public static final Charset f47167d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final long f47168e = System.currentTimeMillis();

    /* JADX INFO: renamed from: a */
    public static void m16327a(String str) {
        m16331e().mo16255x(str);
    }

    /* JADX INFO: renamed from: b */
    public static C15447t m16328b(EnumC15375i1 enumC15375i1) {
        return m16331e().mo16238E(enumC15375i1);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m16329c() {
        InterfaceC15124G interfaceC15124GM16331e = m16331e();
        f47165b = C15458r0.f48278b;
        f47164a.remove();
        interfaceC15124GM16331e.mo16242d(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m16330d(long j10) {
        m16331e().mo16249r(j10);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC15124G m16331e() {
        if (f47166c) {
            return f47165b;
        }
        ThreadLocal threadLocal = f47164a;
        InterfaceC15124G interfaceC15124G = (InterfaceC15124G) threadLocal.get();
        if (interfaceC15124G != null && !(interfaceC15124G instanceof C15458r0)) {
            return interfaceC15124G;
        }
        InterfaceC15124G interfaceC15124GClone = f47165b.m22571clone();
        threadLocal.set(interfaceC15124GClone);
        return interfaceC15124GClone;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC15154Q m16332f() {
        return (f47166c && AbstractC15500e.f48420a) ? m16331e().mo16256y() : m16331e().mo16243e();
    }

    /* JADX INFO: renamed from: g */
    public static void m16333g(C15476t0 c15476t0, C15216g c15216g) {
        int i10 = 0;
        int i11 = 1;
        C15524y1 c15524y1 = (C15524y1) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            c15216g.m16424a(c15524y1);
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        synchronized (AbstractC15152P0.class) {
            try {
                if (m16335i()) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (m16334h(c15524y1)) {
                    try {
                        c15524y1.getExecutorService().submit(new RunnableC15146N0(c15524y1, i10));
                    } catch (RejectedExecutionException e10) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                    }
                    c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    f47166c = true;
                    InterfaceC15124G interfaceC15124GM16331e = m16331e();
                    if (c15524y1.getDsn() == null || c15524y1.getDsn().isEmpty()) {
                        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                    }
                    f47165b = new C15106A(c15524y1, new C15026j(c15524y1.getLogger(), new C15150O1(c15524y1, new C11238i(c15524y1), new C15134J0(c15524y1))));
                    f47164a.set(f47165b);
                    interfaceC15124GM16331e.mo16242d(true);
                    if (c15524y1.getExecutorService().mo15969m()) {
                        c15524y1.setExecutorService(new C14438g(1));
                    }
                    Iterator<InterfaceC15171W> it = c15524y1.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().mo16343E(c15524y1);
                    }
                    try {
                        c15524y1.getExecutorService().submit(new RunnableC15146N0(c15524y1, 2));
                    } catch (Throwable th3) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to notify options observers.", th3);
                    }
                    try {
                        c15524y1.getExecutorService().submit(new RunnableC15110B0(c15524y1));
                    } catch (Throwable th4) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to finalize previous session.", th4);
                    }
                    try {
                        c15524y1.getExecutorService().submit(new RunnableC15146N0(c15524y1, i11));
                    } catch (Throwable th5) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th5);
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16334h(C15524y1 c15524y1) {
        InterfaceC15330d c15329c;
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Properties propertiesM21932v;
        Properties propertiesM21932v2;
        int i10 = 7;
        int i11 = 15;
        if (c15524y1.isEnableExternalConfiguration()) {
            String str = "sentry.properties";
            C15476t0 c15476t0 = new C15476t0(i10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C15344e("sentry.", System.getProperties()));
            arrayList.add(new C15342c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesM21932v2 = new C21585H(property, i11, c15476t0).m21932v()) != null) {
                arrayList.add(new C15344e(propertiesM21932v2));
            }
            String str2 = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str2 != null && (propertiesM21932v = new C21585H(str2, i11, c15476t0).m21932v()) != null) {
                arrayList.add(new C15344e(propertiesM21932v));
            }
            ClassLoader classLoader = AbstractC15340a.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Long lValueOf5 = null;
            try {
                InputStream resourceAsStream = classLoader.getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e10) {
                c15476t0.mo16296g(EnumC15375i1.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
                properties = null;
            }
            if (properties != null) {
                arrayList.add(new C15344e(properties));
            }
            Properties propertiesM21932v3 = new C21585H(str, i11, c15476t0).m21932v();
            if (propertiesM21932v3 != null) {
                arrayList.add(new C15344e(propertiesM21932v3));
            }
            C15341b c15341b = new C15341b(arrayList);
            InterfaceC15127H logger = c15524y1.getLogger();
            C15493u c15493u = new C15493u();
            c15493u.f48388a = c15341b.mo16569a("dsn");
            c15493u.f48389b = c15341b.mo16569a("environment");
            c15493u.f48390c = c15341b.mo16569a("release");
            c15493u.f48391d = c15341b.mo16569a("dist");
            c15493u.f48392e = c15341b.mo16569a("servername");
            c15493u.f48393f = c15341b.m16571c("uncaught.handler.enabled");
            c15493u.f48408u = c15341b.m16571c("uncaught.handler.print-stacktrace");
            c15493u.f48396i = c15341b.m16571c("enable-tracing");
            String strMo16569a = c15341b.mo16569a("traces-sample-rate");
            if (strMo16569a != null) {
                try {
                    dValueOf = Double.valueOf(strMo16569a);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            c15493u.f48397j = dValueOf;
            String strMo16569a2 = c15341b.mo16569a("profiles-sample-rate");
            if (strMo16569a2 != null) {
                try {
                    dValueOf2 = Double.valueOf(strMo16569a2);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            c15493u.f48398k = dValueOf2;
            c15493u.f48394g = c15341b.m16571c("debug");
            c15493u.f48395h = c15341b.m16571c("enable-deduplication");
            c15493u.f48409v = c15341b.m16571c("send-client-reports");
            String strMo16569a3 = c15341b.mo16569a("max-request-body-size");
            if (strMo16569a3 != null) {
                EnumC15518w1.valueOf(strMo16569a3.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) c15341b.mo16570b()).entrySet()) {
                c15493u.f48399l.put((String) entry.getKey(), (String) entry.getValue());
            }
            String strMo16569a4 = c15341b.mo16569a("proxy.host");
            String strMo16569a5 = c15341b.mo16569a("proxy.user");
            String strMo16569a6 = c15341b.mo16569a("proxy.pass");
            String strMo16569a7 = c15341b.mo16569a("proxy.port");
            if (strMo16569a7 == null) {
                strMo16569a7 = "80";
            }
            if (strMo16569a4 != null) {
                C15510v1 c15510v1 = new C15510v1();
                c15510v1.f48435a = strMo16569a4;
                c15510v1.f48436b = strMo16569a7;
                c15510v1.f48437c = strMo16569a5;
                c15510v1.f48438d = strMo16569a6;
                c15493u.f48400m = c15510v1;
            }
            Iterator it = AbstractC14376f.m15835a(c15341b, "in-app-includes").iterator();
            while (it.hasNext()) {
                c15493u.f48402o.add((String) it.next());
            }
            Iterator it2 = AbstractC14376f.m15835a(c15341b, "in-app-excludes").iterator();
            while (it2.hasNext()) {
                c15493u.f48401n.add((String) it2.next());
            }
            List<String> listM15835a = c15341b.mo16569a("trace-propagation-targets") != null ? AbstractC14376f.m15835a(c15341b, "trace-propagation-targets") : null;
            if (listM15835a == null && c15341b.mo16569a("tracing-origins") != null) {
                listM15835a = AbstractC14376f.m15835a(c15341b, "tracing-origins");
            }
            if (listM15835a != null) {
                for (String str3 : listM15835a) {
                    if (c15493u.f48403p == null) {
                        c15493u.f48403p = new CopyOnWriteArrayList();
                    }
                    if (!str3.isEmpty()) {
                        c15493u.f48403p.add(str3);
                    }
                }
            }
            Iterator it3 = AbstractC14376f.m15835a(c15341b, "context-tags").iterator();
            while (it3.hasNext()) {
                c15493u.f48404q.add((String) it3.next());
            }
            c15493u.f48405r = c15341b.mo16569a("proguard-uuid");
            Iterator it4 = AbstractC14376f.m15835a(c15341b, "bundle-ids").iterator();
            while (it4.hasNext()) {
                c15493u.f48410w.add((String) it4.next());
            }
            String strMo16569a8 = c15341b.mo16569a("idle-timeout");
            if (strMo16569a8 != null) {
                try {
                    lValueOf = Long.valueOf(strMo16569a8);
                } catch (NumberFormatException unused3) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            c15493u.f48406s = lValueOf;
            c15493u.f48411x = c15341b.m16571c("enabled");
            c15493u.f48412y = c15341b.m16571c("enable-pretty-serialization-output");
            c15493u.f48385A = c15341b.m16571c("send-modules");
            c15493u.f48413z = AbstractC14376f.m15835a(c15341b, "ignored-checkins");
            c15493u.f48386B = c15341b.m16571c("enable-backpressure-handling");
            for (String str4 : AbstractC14376f.m15835a(c15341b, "ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str4);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        c15493u.f48407t.add(cls);
                    } else {
                        logger.mo16298o(EnumC15375i1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str4, str4);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.mo16298o(EnumC15375i1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str4, str4);
                }
            }
            String strMo16569a9 = c15341b.mo16569a("cron.default-checkin-margin");
            if (strMo16569a9 != null) {
                try {
                    lValueOf2 = Long.valueOf(strMo16569a9);
                } catch (NumberFormatException unused5) {
                    lValueOf2 = null;
                }
            } else {
                lValueOf2 = null;
            }
            String strMo16569a10 = c15341b.mo16569a("cron.default-max-runtime");
            if (strMo16569a10 != null) {
                try {
                    lValueOf3 = Long.valueOf(strMo16569a10);
                } catch (NumberFormatException unused6) {
                    lValueOf3 = null;
                }
            } else {
                lValueOf3 = null;
            }
            String strMo16569a11 = c15341b.mo16569a("cron.default-timezone");
            String strMo16569a12 = c15341b.mo16569a("cron.default-failure-issue-threshold");
            if (strMo16569a12 != null) {
                try {
                    lValueOf4 = Long.valueOf(strMo16569a12);
                } catch (NumberFormatException unused7) {
                    lValueOf4 = null;
                }
            } else {
                lValueOf4 = null;
            }
            String strMo16569a13 = c15341b.mo16569a("cron.default-recovery-threshold");
            if (strMo16569a13 != null) {
                try {
                    lValueOf5 = Long.valueOf(strMo16569a13);
                } catch (NumberFormatException unused8) {
                }
            }
            if (lValueOf2 != null || lValueOf3 != null || strMo16569a11 != null || lValueOf4 != null || lValueOf5 != null) {
                C15477t1 c15477t1 = new C15477t1();
                c15477t1.f48347a = lValueOf2;
                c15477t1.f48348b = lValueOf3;
                c15477t1.f48349c = strMo16569a11;
                c15477t1.f48350d = lValueOf4;
                c15477t1.f48351e = lValueOf5;
                c15493u.f48387C = c15477t1;
            }
            c15524y1.merge(c15493u);
        }
        String dsn = c15524y1.getDsn();
        if (!c15524y1.isEnabled() || (dsn != null && dsn.isEmpty())) {
            m16329c();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        c15524y1.retrieveParsedDsn();
        InterfaceC15127H logger2 = c15524y1.getLogger();
        if (c15524y1.isDebug() && (logger2 instanceof C15473s0)) {
            c15524y1.setLogger(new C15476t0(i10));
            logger2 = c15524y1.getLogger();
        }
        EnumC15375i1 enumC15375i1 = EnumC15375i1.INFO;
        logger2.mo16298o(enumC15375i1, anhfj.wUU, c15524y1.getDsn());
        String outboxPath = c15524y1.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger2.mo16298o(enumC15375i1, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c15524y1.getEnvelopeDiskCache() instanceof C15485h) {
                Charset charset = C15329c.f47876s0;
                String cacheDirPath2 = c15524y1.getCacheDirPath();
                int maxCacheItems = c15524y1.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    c15329c = C15485h.f48373Y;
                } else {
                    c15329c = new C15329c(c15524y1, cacheDirPath2, maxCacheItems);
                }
                c15524y1.setEnvelopeDiskCache(c15329c);
            }
        }
        String profilingTracesDirPath = c15524y1.getProfilingTracesDirPath();
        if (c15524y1.isProfilingEnabled() && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                c15524y1.getExecutorService().submit(new RunnableC15149O0(file, 0));
            } catch (RejectedExecutionException e11) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e11);
            }
        }
        InterfaceC15388a modulesLoader = c15524y1.getModulesLoader();
        if (!c15524y1.isSendModules()) {
            c15524y1.setModulesLoader(C15392e.f47982a);
        } else if (modulesLoader instanceof C15392e) {
            c15524y1.setModulesLoader(new C15393f(Arrays.asList(new C15390c(c15524y1.getLogger()), new C15393f(c15524y1.getLogger())), c15524y1.getLogger()));
        }
        if (c15524y1.getDebugMetaLoader() instanceof C15383b) {
            c15524y1.setDebugMetaLoader(new C15384c(c15524y1.getLogger()));
        }
        List listMo16633h = c15524y1.getDebugMetaLoader().mo16633h();
        if (listMo16633h != null) {
            if (c15524y1.getBundleIds().isEmpty()) {
                Iterator it5 = listMo16633h.iterator();
                while (it5.hasNext()) {
                    String property2 = ((Properties) it5.next()).getProperty("io.sentry.bundle-ids");
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Bundle IDs found: %s", property2);
                    if (property2 != null) {
                        for (String str5 : property2.split(Separators.COMMA, -1)) {
                            c15524y1.addBundleId(str5);
                        }
                    }
                }
            }
            if (c15524y1.getProguardUuid() == null) {
                Iterator it6 = listMo16633h.iterator();
                while (it6.hasNext()) {
                    String property3 = ((Properties) it6.next()).getProperty("io.sentry.ProguardUuids");
                    if (property3 != null) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Proguard UUID found: %s", property3);
                        c15524y1.setProguardUuid(property3);
                        break;
                    }
                }
            }
        }
        if (c15524y1.getMainThreadChecker() instanceof C15507c) {
            c15524y1.setMainThreadChecker(C15506b.f48430b);
        }
        if (c15524y1.getPerformanceCollectors().isEmpty()) {
            c15524y1.addPerformanceCollector(new C15174X());
        }
        if (c15524y1.isEnableBackpressureHandling() && !AbstractC15500e.f48420a) {
            c15524y1.setBackpressureMonitor(new RunnableC7216h(c15524y1));
            c15524y1.getBackpressureMonitor().start();
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16335i() {
        return m16331e().isEnabled();
    }

    /* JADX INFO: renamed from: j */
    public static void m16336j(String str, String str2) {
        m16331e().mo16240a(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m16337k(C15425E c15425e) {
        m16331e().mo16247k(c15425e);
    }
}
