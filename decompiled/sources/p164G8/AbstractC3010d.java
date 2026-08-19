package p164G8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.os.StrictMode;
import com.google.protobuf.AbstractC12107L1;
import hm.InterfaceC14536a;
import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import hm.InterfaceC14540e;
import im.C15039a;
import io.sentry.protocol.DebugImage;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentSkipListSet;
import jm.C16270a;
import jm.InterfaceC16271b;
import p003A1.C0195P;
import p031B3.C0805i;
import p062C8.C1614b;
import p062C8.EnumC1613a;
import p088D8.InterfaceC1980a;
import p114E8.C2354a;
import p114E8.C2355b;
import p114E8.C2356c;
import p114E8.InterfaceC2357d;
import p114E8.InterfaceC2358e;
import p138F8.InterfaceC2677a;
import p187H8.AbstractC3263a;
import p187H8.C3264b;
import p187H8.C3265c;
import p211I8.C3652b;
import p228J.AbstractC3794B0;
import p237J8.C4284a;
import p237J8.C4285b;
import p237J8.C4288e;
import p262K8.C4550a;
import p262K8.C4551b;
import p262K8.C4553d;
import p262K8.InterfaceC4552c;
import p285L8.C4961d;
import p285L8.C4962e;
import p544W9.AbstractC8608b3;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: G8.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3010d implements InterfaceC14540e, Closeable {

    /* JADX INFO: renamed from: B0 */
    public static final BigInteger f9060B0;

    /* JADX INFO: renamed from: C0 */
    public static final BigInteger f9061C0;

    /* JADX INFO: renamed from: D0 */
    public static final BigInteger f9062D0;

    /* JADX INFO: renamed from: A0 */
    public final SecureRandom f9063A0;

    /* JADX INFO: renamed from: Y */
    public final String f9064Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC2677a f9065Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC2358e f9066o0;

    /* JADX INFO: renamed from: p0 */
    public final C4550a f9067p0;

    /* JADX INFO: renamed from: q0 */
    public final Map f9068q0;

    /* JADX INFO: renamed from: r0 */
    public final Map f9069r0;

    /* JADX INFO: renamed from: s0 */
    public final Map f9070s0;

    /* JADX INFO: renamed from: t0 */
    public final int f9071t0;

    /* JADX INFO: renamed from: u0 */
    public final C0805i f9072u0;

    /* JADX INFO: renamed from: v0 */
    public final ConcurrentHashMap f9073v0;

    /* JADX INFO: renamed from: w0 */
    public final ConcurrentSkipListSet f9074w0;

    /* JADX INFO: renamed from: x0 */
    public final C4288e f9075x0;

    /* JADX INFO: renamed from: y0 */
    public final C4284a f9076y0;

    /* JADX INFO: renamed from: z0 */
    public final AbstractC8608b3 f9077z0;

    static {
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(128);
        BigInteger bigInteger = BigInteger.ONE;
        f9060B0 = bigIntegerPow.subtract(bigInteger);
        f9061C0 = BigInteger.valueOf(2L).pow(64).subtract(bigInteger);
        f9062D0 = BigInteger.ZERO;
    }

    public AbstractC3010d(C1614b c1614b, InterfaceC2677a interfaceC2677a, SecureRandom secureRandom) {
        InterfaceC2358e c2356c;
        EnumC1613a enumC1613a;
        EnumC1613a enumC1613a2;
        EnumC1613a enumC1613a3;
        EnumC1613a enumC1613a4;
        EnumC1613a enumC1613a5;
        C3652b c3652b;
        AbstractC8608b3 c4961d;
        String hostName;
        int i10 = 2;
        int i11 = 3;
        int i12 = 1;
        int i13 = 0;
        if (c1614b.f4545j) {
            Double d10 = c1614b.f4524X;
            c2356c = d10 != null ? new C2356c(d10) : new C2356c(Double.valueOf(1.0d));
        } else {
            C2354a c2354a = new C2354a(0);
            c2354a.f7308b = new HashMap();
            c2356c = c2354a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c1614b.f4503C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC1613a = EnumC1613a.f4492q0;
            enumC1613a2 = EnumC1613a.f4491p0;
            enumC1613a3 = EnumC1613a.f4490o0;
            enumC1613a4 = EnumC1613a.f4489Z;
            enumC1613a5 = EnumC1613a.f4488Y;
            if (!zHasNext) {
                break;
            }
            EnumC1613a enumC1613a6 = (EnumC1613a) it.next();
            if (enumC1613a6 == enumC1613a5) {
                arrayList.add(new C4288e());
            } else if (enumC1613a6 == enumC1613a4) {
                arrayList.add(new C4285b(i13));
            } else if (enumC1613a6 == enumC1613a3) {
                arrayList.add(new C4285b(i12));
            } else if (enumC1613a6 == enumC1613a2) {
                arrayList.add(new C4285b(i11));
            } else if (enumC1613a6 == enumC1613a) {
                arrayList.add(new C4285b(i10));
            }
        }
        C4288e c4288e = new C4288e(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (EnumC1613a enumC1613a7 : c1614b.f4502B) {
            Map map = c1614b.f4558q;
            if (enumC1613a7 == enumC1613a5) {
                arrayList2.add(new C4284a(i10, map));
            } else if (enumC1613a7 == enumC1613a4) {
                arrayList2.add(new C4284a(0, map));
            } else {
                if (enumC1613a7 == enumC1613a3) {
                    arrayList2.add(new C4284a(1, map));
                } else if (enumC1613a7 == enumC1613a2) {
                    arrayList2.add(new C4284a(4, map));
                } else if (enumC1613a7 == enumC1613a) {
                    arrayList2.add(new C4284a(3, map));
                }
                i10 = 2;
            }
        }
        C4284a c4284a = new C4284a(arrayList2);
        int iIntValue = C1614b.f4500v0.f4566y.intValue();
        try {
            c3652b = (C3652b) Class.forName("com.datadog.opentracing.jfr.openjdk.ScopeEventFactory").newInstance();
        } catch (ClassFormatError | NoClassDefFoundError | ReflectiveOperationException unused) {
            c3652b = new C3652b();
        }
        C4550a c4550a = new C4550a(iIntValue, c3652b);
        HashMap map2 = new HashMap(3, 1.0f);
        map2.put("runtime-id", c1614b.f4527a);
        HashMap map3 = new HashMap(DesugarCollections.unmodifiableMap(map2));
        map3.put("language", DebugImage.JVM);
        if (c1614b.f4516P) {
            String line = System.getProperty("os.name").startsWith("Windows") ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
            if (line == null || line.isEmpty()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                }
                if (line == null || line.isEmpty()) {
                    try {
                        hostName = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException unused3) {
                        hostName = null;
                    }
                } else {
                    hostName = line.trim();
                }
            } else {
                hostName = line.trim();
            }
            if (hostName != null && !hostName.isEmpty()) {
                map3.put("_dd.hostname", hostName);
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map3);
        Map map4 = c1614b.f4551m;
        int size = map4.size();
        Map map5 = c1614b.f4553n;
        HashMap map6 = new HashMap(map5.size() + size + 1, 1.0f);
        map6.putAll(map4);
        map6.putAll(map5);
        Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(map6);
        int iIntValue2 = c1614b.f4567z.intValue();
        this.f9073v0 = new ConcurrentHashMap();
        this.f9074w0 = new ConcurrentSkipListSet(new C0195P(this, 3));
        String upperCase = "SECURE_RANDOM".toUpperCase(Locale.US);
        upperCase.getClass();
        switch (upperCase) {
            case "RANDOM":
                c4961d = new C4961d();
                break;
            case "SEQUENTIAL":
                c4961d = new C4962e(1);
                break;
            case "SECURE_RANDOM":
                c4961d = new C4962e(0);
                break;
            default:
                c4961d = null;
                break;
        }
        this.f9077z0 = c4961d;
        this.f9063A0 = secureRandom;
        this.f9064Y = c1614b.f4531c;
        this.f9065Z = interfaceC2677a;
        this.f9066o0 = c2356c;
        this.f9075x0 = c4288e;
        this.f9076y0 = c4284a;
        this.f9067p0 = c4550a;
        this.f9068q0 = mapUnmodifiableMap;
        this.f9069r0 = mapUnmodifiableMap2;
        this.f9070s0 = c1614b.f4549l;
        this.f9071t0 = iIntValue2;
        C0805i c0805i = new C0805i(this);
        this.f9072u0 = c0805i;
        try {
            Runtime.getRuntime().addShutdownHook(c0805i);
        } catch (IllegalStateException unused4) {
        }
        ArrayList<AbstractC3263a> arrayList3 = new ArrayList();
        C3264b c3264b = new C3264b(i13);
        c3264b.f9936a = "manual.drop";
        C3264b c3264b2 = new C3264b(1);
        c3264b2.f9936a = "manual.keep";
        C3264b c3264b3 = new C3264b(2);
        c3264b3.f9936a = "peer.service";
        for (AbstractC3263a abstractC3263a : Arrays.asList(c3264b, c3264b2, c3264b3, new C3265c("service.name", false), new C3265c(ReferencesHeader.SERVICE, false))) {
            C1614b c1614b2 = C1614b.f4500v0;
            String simpleName = abstractC3263a.getClass().getSimpleName();
            c1614b2.getClass();
            String strM11054l = AbstractC10763a.m11054l("trace.", simpleName, ".enabled");
            Boolean bool = Boolean.TRUE;
            if (C1614b.m2455b(bool, strM11054l).booleanValue()) {
                if (C1614b.m2455b(bool, "trace." + simpleName.toLowerCase(Locale.US) + ".enabled").booleanValue()) {
                    arrayList3.add(abstractC3263a);
                }
            }
        }
        Iterator it2 = C1614b.f4500v0.f4565x.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C3265c((String) it2.next(), true));
        }
        for (AbstractC3263a abstractC3263a2 : arrayList3) {
            String str = abstractC3263a2.f9936a;
            ConcurrentHashMap concurrentHashMap = this.f9073v0;
            List arrayList4 = (List) concurrentHashMap.get(str);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
            }
            arrayList4.add(abstractC3263a2);
            concurrentHashMap.put(abstractC3263a2.f9936a, arrayList4);
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        try {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            Iterator it3 = ServiceLoader.load(InterfaceC1980a.class, systemClassLoader).iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                this.f9074w0.add(null);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (ServiceConfigurationError unused5) {
        }
        RunnableC3011e runnableC3011e = (RunnableC3011e) C3013g.f9080w0.getAndSet(new RunnableC3011e());
        if (runnableC3011e != null) {
            runnableC3011e.run();
        }
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: R0 */
    public final InterfaceC14536a mo3850R0(InterfaceC14537b interfaceC14537b) {
        C4550a c4550a = this.f9067p0;
        InterfaceC14536a interfaceC14536aM5317a = c4550a.m5317a();
        if (interfaceC14536aM5317a instanceof InterfaceC4552c) {
            if (c4550a.f14875c <= ((InterfaceC4552c) interfaceC14536aM5317a).mo5319o0()) {
                return C15039a.f46758Y;
            }
        }
        synchronized (c4550a.f14873a) {
            Iterator it = c4550a.f14873a.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        return interfaceC14537b instanceof C3007a ? new C4551b(c4550a, (C3007a) interfaceC14537b, c4550a.f14876d) : new C4553d(c4550a, interfaceC14537b);
    }

    /* JADX INFO: renamed from: a */
    public final void m3851a(C3007a c3007a) {
        if ((this.f9066o0 instanceof C2356c) && c3007a != null && c3007a.f9032a.m3840c() == Integer.MIN_VALUE) {
            C2356c c2356c = (C2356c) this.f9066o0;
            c2356c.getClass();
            String strM11055m = AbstractC10763a.m11055m("service:", c3007a.f9032a.f9045h, ",env:", c3007a.m3837g().get("env") == null ? "" : String.valueOf(c3007a.m3837g().get("env")));
            Map map = c2356c.f7314a;
            InterfaceC2357d interfaceC2357d = (InterfaceC2357d) c2356c.f7314a.get(strM11055m);
            if (interfaceC2357d == null) {
                interfaceC2357d = (InterfaceC2357d) map.get("service:,env:");
            }
            C2355b c2355b = (C2355b) interfaceC2357d;
            if (c2355b.mo3438a(c3007a) ? c3007a.f9032a.m3843f(1) : c3007a.f9032a.m3843f(0)) {
                c3007a.f9032a.m3842e(Double.valueOf(c2355b.f7313b), "_dd.agent_psr");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC3011e runnableC3011e = (RunnableC3011e) C3013g.f9080w0.getAndSet(null);
        if (runnableC3011e != null) {
            runnableC3011e.run();
        }
        this.f9065Z.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m3852e(AbstractList abstractList) {
        ArrayList arrayList;
        if (abstractList.isEmpty()) {
            return;
        }
        ConcurrentSkipListSet concurrentSkipListSet = this.f9074w0;
        if (concurrentSkipListSet.isEmpty()) {
            arrayList = new ArrayList(abstractList);
        } else {
            ArrayList<C3007a> arrayList2 = new ArrayList(abstractList);
            Iterator it = concurrentSkipListSet.iterator();
            if (it.hasNext()) {
                throw AbstractC3794B0.m4497v(it);
            }
            arrayList = new ArrayList(arrayList2.size());
            for (C3007a c3007a : arrayList2) {
                if (c3007a instanceof C3007a) {
                    arrayList.add(c3007a);
                }
            }
        }
        InterfaceC2677a interfaceC2677a = this.f9065Z;
        interfaceC2677a.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        C3007a c3007aM3858p = ((C3007a) arrayList.get(0)).f9032a.f9039b.m3858p();
        m3851a(c3007aM3858p);
        if (c3007aM3858p == null) {
            c3007aM3858p = (C3007a) arrayList.get(0);
        }
        if (this.f9066o0.mo3438a(c3007aM3858p)) {
            interfaceC2677a.mo3654P0(arrayList);
        }
    }

    public final void finalize() {
        try {
            Runtime runtime = Runtime.getRuntime();
            C0805i c0805i = this.f9072u0;
            runtime.removeShutdownHook(c0805i);
            c0805i.run();
        } catch (Exception unused) {
        }
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC14538c mo3853m0(C16270a c16270a) {
        return this.f9076y0.m5037a(c16270a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DDTracer-");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append("{ serviceName=");
        sb2.append(this.f9064Y);
        sb2.append(", writer=");
        sb2.append(this.f9065Z);
        sb2.append(", sampler=");
        sb2.append(this.f9066o0);
        sb2.append(", defaultSpanTags=");
        return AbstractC12107L1.m13827r(sb2, this.f9069r0, '}');
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: y */
    public final void mo3854y(InterfaceC14538c interfaceC14538c, InterfaceC16271b interfaceC16271b) {
        C3008b c3008b = (C3008b) interfaceC14538c;
        m3851a(c3008b.f9039b.m3858p());
        this.f9075x0.mo5038a(c3008b, interfaceC16271b);
    }
}
