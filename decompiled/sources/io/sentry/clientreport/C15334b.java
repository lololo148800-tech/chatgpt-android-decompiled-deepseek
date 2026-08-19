package io.sentry.clientreport;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15144M1;
import io.sentry.C15324c;
import io.sentry.C15360h0;
import io.sentry.C15396j1;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15176Y;
import io.sentry.profilemeasurements.C15419a;
import io.sentry.profilemeasurements.C15420b;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15422B;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15429b;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15431d;
import io.sentry.protocol.C15433f;
import io.sentry.protocol.C15434g;
import io.sentry.protocol.C15435h;
import io.sentry.protocol.C15436i;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15439l;
import io.sentry.protocol.C15440m;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15443p;
import io.sentry.protocol.C15444q;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15447t;
import io.sentry.protocol.C15448u;
import io.sentry.protocol.C15449v;
import io.sentry.protocol.C15450w;
import io.sentry.protocol.C15451x;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC15423C;
import io.sentry.protocol.EnumC15432e;
import io.sentry.vendor.gson.stream.C15513a;
import io.sentry.vendor.gson.stream.EnumC15514b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArraySet;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8662k3;
import p817j$.util.DesugarTimeZone;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.clientreport.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15334b implements InterfaceC15176Y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47886a;

    public /* synthetic */ C15334b(int i10) {
        this.f47886a = i10;
    }

    /* JADX INFO: renamed from: b */
    public static C15428a m16559b(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        c15360h0.m16614e();
        C15428a c15428a = new C15428a();
        ConcurrentHashMap concurrentHashMap = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            switch (strM16613a0) {
                case "device_app_hash":
                    c15428a.f48088o0 = c15360h0.m16602N0();
                    break;
                case "start_type":
                    c15428a.f48095v0 = c15360h0.m16602N0();
                    break;
                case "view_names":
                    List list = (List) c15360h0.m16600H0();
                    if (list == null) {
                        break;
                    } else {
                        c15428a.f48094u0 = list;
                        break;
                    }
                    break;
                case "app_version":
                    c15428a.f48091r0 = c15360h0.m16602N0();
                    break;
                case "in_foreground":
                    c15428a.f48096w0 = c15360h0.m16619m();
                    break;
                case "build_type":
                    c15428a.f48089p0 = c15360h0.m16602N0();
                    break;
                case "app_identifier":
                    c15428a.f48086Y = c15360h0.m16602N0();
                    break;
                case "app_start_time":
                    c15428a.f48087Z = c15360h0.m16598E(interfaceC15127H);
                    break;
                case "permissions":
                    c15428a.f48093t0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                    break;
                case "app_name":
                    c15428a.f48090q0 = c15360h0.m16602N0();
                    break;
                case "app_build":
                    c15428a.f48092s0 = c15360h0.m16602N0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                    break;
            }
        }
        c15428a.f48097x0 = concurrentHashMap;
        c15360h0.m16618k();
        return c15428a;
    }

    /* JADX INFO: renamed from: c */
    public static C15430c m16560c(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) {
        C15430c c15430c = new C15430c();
        c15360h0.m16614e();
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            switch (strM16613a0) {
                case "device":
                    c15430c.put("device", m16561d(c15360h0, interfaceC15127H));
                    break;
                case "response":
                    c15360h0.m16614e();
                    C15443p c15443p = new C15443p();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                        String strM16613a1 = c15360h0.m16613a0();
                        strM16613a1.getClass();
                        switch (strM16613a1) {
                            case "status_code":
                                c15443p.f48195o0 = c15360h0.m16608W();
                                break;
                            case "data":
                                c15443p.f48197q0 = c15360h0.m16600H0();
                                break;
                            case "headers":
                                Map map = (Map) c15360h0.m16600H0();
                                if (map == null) {
                                    break;
                                } else {
                                    c15443p.f48194Z = AbstractC8453B3.m9064a(map);
                                    break;
                                }
                                break;
                            case "cookies":
                                c15443p.f48193Y = c15360h0.m16602N0();
                                break;
                            case "body_size":
                                c15443p.f48196p0 = c15360h0.m16620r0();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a1);
                                break;
                        }
                    }
                    c15443p.f48198r0 = concurrentHashMap;
                    c15360h0.m16618k();
                    synchronized (c15430c.f48101Y) {
                        c15430c.put("response", c15443p);
                        break;
                    }
                    break;
                case "os":
                    c15430c.put("os", m16563f(c15360h0, interfaceC15127H));
                    break;
                case "app":
                    c15430c.m16661b(m16559b(c15360h0, interfaceC15127H));
                    break;
                case "gpu":
                    c15430c.put("gpu", m16562e(c15360h0, interfaceC15127H));
                    break;
                case "trace":
                    c15430c.m16662c(C15324c.m16531b(c15360h0, interfaceC15127H));
                    break;
                case "browser":
                    c15360h0.m16614e();
                    C15429b c15429b = new C15429b();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                        String strM16613a2 = c15360h0.m16613a0();
                        strM16613a2.getClass();
                        if (strM16613a2.equals(DiagnosticsEntry.NAME_KEY)) {
                            c15429b.f48098Y = c15360h0.m16602N0();
                        } else if (strM16613a2.equals("version")) {
                            c15429b.f48099Z = c15360h0.m16602N0();
                        } else {
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a2);
                        }
                    }
                    c15429b.f48100o0 = concurrentHashMap2;
                    c15360h0.m16618k();
                    c15430c.put("browser", c15429b);
                    break;
                case "runtime":
                    c15360h0.m16614e();
                    C15449v c15449v = new C15449v();
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                        String strM16613a3 = c15360h0.m16613a0();
                        strM16613a3.getClass();
                        switch (strM16613a3) {
                            case "raw_description":
                                c15449v.f48223o0 = c15360h0.m16602N0();
                                break;
                            case "name":
                                c15449v.f48221Y = c15360h0.m16602N0();
                                break;
                            case "version":
                                c15449v.f48222Z = c15360h0.m16602N0();
                                break;
                            default:
                                if (concurrentHashMap3 == null) {
                                    concurrentHashMap3 = new ConcurrentHashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, concurrentHashMap3, strM16613a3);
                                break;
                        }
                    }
                    c15449v.f48224p0 = concurrentHashMap3;
                    c15360h0.m16618k();
                    c15430c.put("runtime", c15449v);
                    break;
                default:
                    Object objM16600H0 = c15360h0.m16600H0();
                    if (objM16600H0 == null) {
                        break;
                    } else {
                        c15430c.put(strM16613a0, objM16600H0);
                        break;
                    }
                    break;
            }
        }
        c15360h0.m16618k();
        return c15430c;
    }

    /* JADX INFO: renamed from: e */
    public static C15435h m16562e(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        c15360h0.m16614e();
        C15435h c15435h = new C15435h();
        ConcurrentHashMap concurrentHashMap = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            switch (strM16613a0) {
                case "npot_support":
                    c15435h.f48152u0 = c15360h0.m16602N0();
                    break;
                case "vendor_id":
                    c15435h.f48146o0 = c15360h0.m16602N0();
                    break;
                case "multi_threaded_rendering":
                    c15435h.f48150s0 = c15360h0.m16619m();
                    break;
                case "id":
                    c15435h.f48145Z = c15360h0.m16608W();
                    break;
                case "name":
                    c15435h.f48144Y = c15360h0.m16602N0();
                    break;
                case "vendor_name":
                    c15435h.f48147p0 = c15360h0.m16602N0();
                    break;
                case "version":
                    c15435h.f48151t0 = c15360h0.m16602N0();
                    break;
                case "api_type":
                    c15435h.f48149r0 = c15360h0.m16602N0();
                    break;
                case "memory_size":
                    c15435h.f48148q0 = c15360h0.m16608W();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                    break;
            }
        }
        c15435h.f48153v0 = concurrentHashMap;
        c15360h0.m16618k();
        return c15435h;
    }

    /* JADX INFO: renamed from: f */
    public static C15440m m16563f(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        c15360h0.m16614e();
        C15440m c15440m = new C15440m();
        ConcurrentHashMap concurrentHashMap = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            switch (strM16613a0) {
                case "rooted":
                    c15440m.f48179r0 = c15360h0.m16619m();
                    break;
                case "raw_description":
                    c15440m.f48176o0 = c15360h0.m16602N0();
                    break;
                case "name":
                    c15440m.f48174Y = c15360h0.m16602N0();
                    break;
                case "build":
                    c15440m.f48177p0 = c15360h0.m16602N0();
                    break;
                case "version":
                    c15440m.f48175Z = c15360h0.m16602N0();
                    break;
                case "kernel_version":
                    c15440m.f48178q0 = c15360h0.m16602N0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                    break;
            }
        }
        c15440m.f48180s0 = concurrentHashMap;
        c15360h0.m16618k();
        return c15440m;
    }

    /* JADX INFO: renamed from: g */
    public static IllegalStateException m16564g(String str, InterfaceC15127H interfaceC15127H) {
        String strM11054l = AbstractC10763a.m11054l("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(strM11054l);
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, strM11054l, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: h */
    public static IllegalStateException m16565h(String str, InterfaceC15127H interfaceC15127H) {
        String strM11054l = AbstractC10763a.m11054l("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(strM11054l);
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, strM11054l, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: i */
    public static IllegalStateException m16566i(String str, InterfaceC15127H interfaceC15127H) {
        String strM11054l = AbstractC10763a.m11054l("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(strM11054l);
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, strM11054l, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.InterfaceC15176Y
    /* JADX INFO: renamed from: a */
    public final Object mo16359a(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10;
        int i11 = 13;
        int i12 = 16;
        int i13 = 10;
        int i14 = 3;
        AbstractMap concurrentHashMap = null;
        switch (this.f47886a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                c15360h0.m16614e();
                Date dateM16598E = null;
                HashMap map = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a0 = c15360h0.m16613a0();
                    strM16613a0.getClass();
                    if (strM16613a0.equals("discarded_events")) {
                        arrayList.addAll(c15360h0.m16617j0(interfaceC15127H, new C15334b(1)));
                    } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                        dateM16598E = c15360h0.m16598E(interfaceC15127H);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
                    }
                }
                c15360h0.m16618k();
                if (dateM16598E == null) {
                    throw m16564g(DiagnosticsEntry.TIMESTAMP_KEY, interfaceC15127H);
                }
                if (arrayList.isEmpty()) {
                    throw m16564g("discarded_events", interfaceC15127H);
                }
                C15335c c15335c = new C15335c(dateM16598E, arrayList);
                c15335c.f47889o0 = map;
                return c15335c;
            case 1:
                c15360h0.m16614e();
                String strM16602N0 = null;
                String strM16602N1 = null;
                Long lM16620r0 = null;
                HashMap map2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    switch (strM16613a1) {
                        case "quantity":
                            lM16620r0 = c15360h0.m16620r0();
                            break;
                        case "reason":
                            strM16602N0 = c15360h0.m16602N0();
                            break;
                        case "category":
                            strM16602N1 = c15360h0.m16602N0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map2, strM16613a1);
                            break;
                    }
                }
                c15360h0.m16618k();
                if (strM16602N0 == null) {
                    throw m16565h("reason", interfaceC15127H);
                }
                if (strM16602N1 == null) {
                    throw m16565h("category", interfaceC15127H);
                }
                if (lM16620r0 == null) {
                    throw m16565h("quantity", interfaceC15127H);
                }
                C15338f c15338f = new C15338f(strM16602N0, strM16602N1, lM16620r0);
                c15338f.f47895p0 = map2;
                return c15338f;
            case 2:
                c15360h0.m16614e();
                C15419a c15419a = new C15419a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a2 = c15360h0.m16613a0();
                    strM16613a2.getClass();
                    if (strM16613a2.equals("values")) {
                        ArrayList arrayListM16617j0 = c15360h0.m16617j0(interfaceC15127H, new C15334b(i14));
                        if (arrayListM16617j0 != null) {
                            c15419a.f48047o0 = arrayListM16617j0;
                        }
                    } else if (strM16613a2.equals("unit")) {
                        String strM16602N2 = c15360h0.m16602N0();
                        if (strM16602N2 != null) {
                            c15419a.f48046Z = strM16602N2;
                        }
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a2);
                    }
                }
                c15419a.f48045Y = concurrentHashMap2;
                c15360h0.m16618k();
                return c15419a;
            case 3:
                c15360h0.m16614e();
                C15420b c15420b = new C15420b(0L, 0);
                ConcurrentHashMap concurrentHashMap3 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a3 = c15360h0.m16613a0();
                    strM16613a3.getClass();
                    if (strM16613a3.equals("elapsed_since_start_ns")) {
                        String strM16602N3 = c15360h0.m16602N0();
                        if (strM16602N3 != null) {
                            c15420b.f48049Z = strM16602N3;
                        }
                    } else if (strM16613a3.equals("value")) {
                        Double dM16604P = c15360h0.m16604P();
                        if (dM16604P != null) {
                            c15420b.f48050o0 = dM16604P.doubleValue();
                        }
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap3, strM16613a3);
                    }
                }
                c15420b.f48048Y = concurrentHashMap3;
                c15360h0.m16618k();
                return c15420b;
            case 4:
                return m16559b(c15360h0, interfaceC15127H);
            case 5:
                c15360h0.m16614e();
                C15429b c15429b = new C15429b();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a4 = c15360h0.m16613a0();
                    strM16613a4.getClass();
                    if (strM16613a4.equals(DiagnosticsEntry.NAME_KEY)) {
                        c15429b.f48098Y = c15360h0.m16602N0();
                    } else if (strM16613a4.equals("version")) {
                        c15429b.f48099Z = c15360h0.m16602N0();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap4, strM16613a4);
                    }
                }
                c15429b.f48100o0 = concurrentHashMap4;
                c15360h0.m16618k();
                return c15429b;
            case 6:
                return m16560c(c15360h0, interfaceC15127H);
            case 7:
                DebugImage debugImage = new DebugImage();
                c15360h0.m16614e();
                AbstractMap map3 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a5 = c15360h0.m16613a0();
                    strM16613a5.getClass();
                    switch (strM16613a5) {
                        case "debug_file":
                            debugImage.debugFile = c15360h0.m16602N0();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = c15360h0.m16602N0();
                            break;
                        case "image_size":
                            debugImage.imageSize = c15360h0.m16620r0();
                            break;
                        case "code_file":
                            debugImage.codeFile = c15360h0.m16602N0();
                            break;
                        case "arch":
                            debugImage.arch = c15360h0.m16602N0();
                            break;
                        case "type":
                            debugImage.type = c15360h0.m16602N0();
                            break;
                        case "uuid":
                            debugImage.uuid = c15360h0.m16602N0();
                            break;
                        case "debug_id":
                            debugImage.debugId = c15360h0.m16602N0();
                            break;
                        case "code_id":
                            debugImage.codeId = c15360h0.m16602N0();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map3, strM16613a5);
                            break;
                    }
                }
                c15360h0.m16618k();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                C15431d c15431d = new C15431d();
                c15360h0.m16614e();
                HashMap map4 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a6 = c15360h0.m16613a0();
                    strM16613a6.getClass();
                    if (strM16613a6.equals("images")) {
                        c15431d.f48103Z = c15360h0.m16617j0(interfaceC15127H, new C15334b(7));
                    } else if (strM16613a6.equals("sdk_info")) {
                        c15431d.f48102Y = (C15444q) c15360h0.m16601J0(interfaceC15127H, new C15334b(19));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map4, strM16613a6);
                    }
                }
                c15360h0.m16618k();
                c15431d.f48104o0 = map4;
                return c15431d;
            case 9:
                return m16561d(c15360h0, interfaceC15127H);
            case 10:
                return EnumC15432e.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
            case 11:
                c15360h0.m16614e();
                C15434g c15434g = new C15434g();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a7 = c15360h0.m16613a0();
                    strM16613a7.getClass();
                    switch (strM16613a7) {
                        case "region":
                            c15434g.f48142o0 = c15360h0.m16602N0();
                            break;
                        case "city":
                            c15434g.f48140Y = c15360h0.m16602N0();
                            break;
                        case "country_code":
                            c15434g.f48141Z = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap5, strM16613a7);
                            break;
                    }
                }
                c15434g.f48143p0 = concurrentHashMap5;
                c15360h0.m16618k();
                return c15434g;
            case 12:
                return m16562e(c15360h0, interfaceC15127H);
            case 13:
                c15360h0.m16614e();
                Number number = null;
                String strM16602N4 = null;
                ConcurrentHashMap concurrentHashMap6 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a8 = c15360h0.m16613a0();
                    strM16613a8.getClass();
                    if (strM16613a8.equals("unit")) {
                        strM16602N4 = c15360h0.m16602N0();
                    } else if (strM16613a8.equals("value")) {
                        number = (Number) c15360h0.m16600H0();
                    } else {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap6, strM16613a8);
                    }
                }
                c15360h0.m16618k();
                if (number != null) {
                    C15436i c15436i = new C15436i(number, strM16602N4);
                    c15436i.f48156o0 = concurrentHashMap6;
                    return c15436i;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"value\"", illegalStateException);
                throw illegalStateException;
            case 14:
                C15437j c15437j = new C15437j();
                c15360h0.m16614e();
                HashMap map5 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a9 = c15360h0.m16613a0();
                    strM16613a9.getClass();
                    switch (strM16613a9) {
                        case "description":
                            c15437j.f48158Z = c15360h0.m16602N0();
                            break;
                        case "data":
                            c15437j.f48162r0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "meta":
                            c15437j.f48161q0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "type":
                            c15437j.f48157Y = c15360h0.m16602N0();
                            break;
                        case "handled":
                            c15437j.f48160p0 = c15360h0.m16619m();
                            break;
                        case "synthetic":
                            c15437j.f48163s0 = c15360h0.m16619m();
                            break;
                        case "help_link":
                            c15437j.f48159o0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map5, strM16613a9);
                            break;
                    }
                }
                c15360h0.m16618k();
                c15437j.f48164t0 = map5;
                return c15437j;
            case 15:
                c15360h0.m16614e();
                C15438k c15438k = new C15438k();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a10 = c15360h0.m16613a0();
                    strM16613a10.getClass();
                    switch (strM16613a10) {
                        case "params":
                            List list = (List) c15360h0.m16600H0();
                            if (list != null) {
                                c15438k.f48167o0 = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            c15438k.f48166Z = c15360h0.m16602N0();
                            break;
                        case "formatted":
                            c15438k.f48165Y = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap7, strM16613a10);
                            break;
                    }
                }
                c15438k.f48168p0 = concurrentHashMap7;
                c15360h0.m16618k();
                return c15438k;
            case 16:
                C15439l c15439l = new C15439l();
                c15360h0.m16614e();
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a11 = c15360h0.m16613a0();
                    strM16613a11.getClass();
                    switch (strM16613a11) {
                        case "max":
                            c15439l.f48170Z = c15360h0.m16603O();
                            break;
                        case "min":
                            c15439l.f48169Y = c15360h0.m16603O();
                            break;
                        case "sum":
                            c15439l.f48171o0 = c15360h0.m16603O();
                            break;
                        case "tags":
                            c15439l.f48173q0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "count":
                            c15439l.f48172p0 = c15360h0.m16616g0();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            AbstractMap abstractMap = concurrentHashMap;
                            c15360h0.m16607V0(interfaceC15127H, abstractMap, strM16613a11);
                            concurrentHashMap = abstractMap;
                            break;
                    }
                }
                c15360h0.m16618k();
                return c15439l;
            case 17:
                return m16563f(c15360h0, interfaceC15127H);
            case 18:
                c15360h0.m16614e();
                C15441n c15441n = new C15441n();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a12 = c15360h0.m16613a0();
                    strM16613a12.getClass();
                    switch (strM16613a12) {
                        case "fragment":
                            c15441n.f48190v0 = c15360h0.m16602N0();
                            break;
                        case "method":
                            c15441n.f48182Z = c15360h0.m16602N0();
                            break;
                        case "env":
                            Map map6 = (Map) c15360h0.m16600H0();
                            if (map6 != null) {
                                c15441n.f48187s0 = AbstractC8453B3.m9064a(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            c15441n.f48181Y = c15360h0.m16602N0();
                            break;
                        case "data":
                            c15441n.f48184p0 = c15360h0.m16600H0();
                            break;
                        case "other":
                            Map map7 = (Map) c15360h0.m16600H0();
                            if (map7 != null) {
                                c15441n.f48189u0 = AbstractC8453B3.m9064a(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) c15360h0.m16600H0();
                            if (map8 != null) {
                                c15441n.f48186r0 = AbstractC8453B3.m9064a(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            c15441n.f48185q0 = c15360h0.m16602N0();
                            break;
                        case "body_size":
                            c15441n.f48188t0 = c15360h0.m16620r0();
                            break;
                        case "query_string":
                            c15441n.f48183o0 = c15360h0.m16602N0();
                            break;
                        case "api_target":
                            c15441n.f48191w0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap8, strM16613a12);
                            break;
                    }
                }
                c15441n.f48192x0 = concurrentHashMap8;
                c15360h0.m16618k();
                return c15441n;
            case 19:
                C15444q c15444q = new C15444q();
                c15360h0.m16614e();
                HashMap map9 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a13 = c15360h0.m16613a0();
                    strM16613a13.getClass();
                    switch (strM16613a13) {
                        case "sdk_name":
                            c15444q.f48199Y = c15360h0.m16602N0();
                            break;
                        case "version_patchlevel":
                            c15444q.f48202p0 = c15360h0.m16608W();
                            break;
                        case "version_major":
                            c15444q.f48200Z = c15360h0.m16608W();
                            break;
                        case "version_minor":
                            c15444q.f48201o0 = c15360h0.m16608W();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map9, strM16613a13);
                            break;
                    }
                }
                c15360h0.m16618k();
                c15444q.f48203q0 = map9;
                return c15444q;
            case 20:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                c15360h0.m16614e();
                String strM16622x = null;
                String strM16622x2 = null;
                HashMap map10 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a14 = c15360h0.m16613a0();
                    strM16613a14.getClass();
                    switch (strM16613a14) {
                        case "name":
                            strM16622x = c15360h0.m16622x();
                            break;
                        case "version":
                            strM16622x2 = c15360h0.m16622x();
                            break;
                        case "packages":
                            ArrayList arrayListM16617j1 = c15360h0.m16617j0(interfaceC15127H, new C15334b(23));
                            if (arrayListM16617j1 != null) {
                                arrayList2.addAll(arrayListM16617j1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) c15360h0.m16600H0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map10, strM16613a14);
                            break;
                    }
                }
                c15360h0.m16618k();
                if (strM16622x == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"name\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (strM16622x2 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"version\"");
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"version\"", illegalStateException3);
                    throw illegalStateException3;
                }
                C15445r c15445r = new C15445r(strM16622x, strM16622x2);
                c15445r.f48206o0 = new CopyOnWriteArraySet(arrayList2);
                c15445r.f48207p0 = new CopyOnWriteArraySet(arrayList3);
                c15445r.f48208q0 = map10;
                return c15445r;
            case 21:
                C15446s c15446s = new C15446s();
                c15360h0.m16614e();
                HashMap map11 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a15 = c15360h0.m16613a0();
                    strM16613a15.getClass();
                    switch (strM16613a15) {
                        case "thread_id":
                            c15446s.f48212p0 = c15360h0.m16620r0();
                            break;
                        case "module":
                            c15446s.f48211o0 = c15360h0.m16602N0();
                            break;
                        case "type":
                            c15446s.f48209Y = c15360h0.m16602N0();
                            break;
                        case "value":
                            c15446s.f48210Z = c15360h0.m16602N0();
                            break;
                        case "mechanism":
                            c15446s.f48214r0 = (C15437j) c15360h0.m16601J0(interfaceC15127H, new C15334b(14));
                            break;
                        case "stacktrace":
                            c15446s.f48213q0 = (C15452y) c15360h0.m16601J0(interfaceC15127H, new C15334b(27));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map11, strM16613a15);
                            break;
                    }
                }
                c15360h0.m16618k();
                c15446s.f48215s0 = map11;
                return c15446s;
            case 22:
                return new C15447t(c15360h0.m16622x());
            case 23:
                c15360h0.m16614e();
                String strM16622x3 = null;
                String strM16622x4 = null;
                HashMap map12 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a16 = c15360h0.m16613a0();
                    strM16613a16.getClass();
                    if (strM16613a16.equals(DiagnosticsEntry.NAME_KEY)) {
                        strM16622x3 = c15360h0.m16622x();
                    } else if (strM16613a16.equals("version")) {
                        strM16622x4 = c15360h0.m16622x();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map12, strM16613a16);
                    }
                }
                c15360h0.m16618k();
                if (strM16622x3 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strM16622x4 != null) {
                    C15448u c15448u = new C15448u(strM16622x3, strM16622x4);
                    c15448u.f48220o0 = map12;
                    return c15448u;
                }
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"version\"", illegalStateException5);
                throw illegalStateException5;
            case 24:
                c15360h0.m16614e();
                C15449v c15449v = new C15449v();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a17 = c15360h0.m16613a0();
                    strM16613a17.getClass();
                    switch (strM16613a17) {
                        case "raw_description":
                            c15449v.f48223o0 = c15360h0.m16602N0();
                            break;
                        case "name":
                            c15449v.f48221Y = c15360h0.m16602N0();
                            break;
                        case "version":
                            c15449v.f48222Z = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap9, strM16613a17);
                            break;
                    }
                }
                c15449v.f48224p0 = concurrentHashMap9;
                c15360h0.m16618k();
                return c15449v;
            case 25:
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap10 = null;
                Map map13 = null;
                HashMap mapM16597C0 = null;
                Double dValueOf = null;
                Double dValueOf2 = null;
                C15447t c15447t = null;
                C15144M1 c15144m1 = null;
                C15144M1 c15144m2 = null;
                String strM16602N5 = null;
                String strM16602N6 = null;
                EnumC15147N1 enumC15147N1 = null;
                String strM16602N7 = null;
                HashMap mapM16621v0 = null;
                Map map14 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a18 = c15360h0.m16613a0();
                    strM16613a18.getClass();
                    switch (strM16613a18.hashCode()) {
                        case -2011840976:
                            i10 = !strM16613a18.equals("span_id") ? -1 : 0;
                            break;
                        case -1757797477:
                            i10 = !strM16613a18.equals("parent_span_id") ? -1 : 1;
                            break;
                        case -1724546052:
                            i10 = !strM16613a18.equals("description") ? -1 : 2;
                            break;
                        case -1526966919:
                            i10 = !strM16613a18.equals("start_timestamp") ? -1 : 3;
                            break;
                        case -1008619738:
                            i10 = !strM16613a18.equals("origin") ? -1 : 4;
                            break;
                        case -892481550:
                            i10 = !strM16613a18.equals("status") ? -1 : 5;
                            break;
                        case -682561045:
                            i10 = !strM16613a18.equals("_metrics_summary") ? -1 : 6;
                            break;
                        case -362243017:
                            i10 = !strM16613a18.equals("measurements") ? -1 : 7;
                            break;
                        case 3553:
                            i10 = !strM16613a18.equals("op") ? -1 : 8;
                            break;
                        case 3076010:
                            i10 = !strM16613a18.equals("data") ? -1 : 9;
                            break;
                        case 3552281:
                            i10 = !strM16613a18.equals("tags") ? -1 : i13;
                            break;
                        case 55126294:
                            i10 = !strM16613a18.equals(DiagnosticsEntry.TIMESTAMP_KEY) ? -1 : 11;
                            break;
                        case 1270300245:
                            i10 = !strM16613a18.equals("trace_id") ? -1 : 12;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    switch (i10) {
                        case 0:
                            c15144m1 = new C15144M1(c15360h0.m16622x());
                            break;
                        case 1:
                            c15144m2 = (C15144M1) c15360h0.m16601J0(interfaceC15127H, new C15324c(15));
                            break;
                        case 2:
                            strM16602N6 = c15360h0.m16602N0();
                            break;
                        case 3:
                            try {
                                dValueOf = c15360h0.m16604P();
                            } catch (NumberFormatException unused) {
                                Date dateM16598E2 = c15360h0.m16598E(interfaceC15127H);
                                dValueOf = dateM16598E2 == null ? null : Double.valueOf(dateM16598E2.getTime() / 1000.0d);
                            }
                            break;
                        case 4:
                            strM16602N7 = c15360h0.m16602N0();
                            break;
                        case 5:
                            enumC15147N1 = (EnumC15147N1) c15360h0.m16601J0(interfaceC15127H, new C15324c(i12));
                            break;
                        case 6:
                            mapM16621v0 = c15360h0.m16621v0(interfaceC15127H, new C15334b(i12));
                            break;
                        case 7:
                            mapM16597C0 = c15360h0.m16597C0(interfaceC15127H, new C15334b(i11));
                            break;
                        case 8:
                            strM16602N5 = c15360h0.m16602N0();
                            break;
                        case 9:
                            map14 = (Map) c15360h0.m16600H0();
                            break;
                        case 10:
                            map13 = (Map) c15360h0.m16600H0();
                            break;
                        case 11:
                            try {
                                dValueOf2 = c15360h0.m16604P();
                            } catch (NumberFormatException unused2) {
                                Date dateM16598E3 = c15360h0.m16598E(interfaceC15127H);
                                dValueOf2 = dateM16598E3 == null ? null : Double.valueOf(dateM16598E3.getTime() / 1000.0d);
                            }
                            break;
                        case 12:
                            c15447t = new C15447t(c15360h0.m16622x());
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap10, strM16613a18);
                            break;
                    }
                    i13 = 10;
                }
                if (dValueOf == null) {
                    throw m16566i("start_timestamp", interfaceC15127H);
                }
                if (c15447t == null) {
                    throw m16566i("trace_id", interfaceC15127H);
                }
                if (c15144m1 == null) {
                    throw m16566i("span_id", interfaceC15127H);
                }
                if (strM16602N5 == null) {
                    throw m16566i("op", interfaceC15127H);
                }
                C15450w c15450w = new C15450w(dValueOf, dValueOf2, c15447t, c15144m1, c15144m2, strM16602N5, strM16602N6, enumC15147N1, strM16602N7, map13 == null ? new HashMap() : map13, mapM16597C0 == null ? new HashMap() : mapM16597C0, mapM16621v0, map14);
                c15450w.f48238z0 = concurrentHashMap10;
                c15360h0.m16618k();
                return c15450w;
            case 26:
                C15451x c15451x = new C15451x();
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a19 = c15360h0.m16613a0();
                    strM16613a19.getClass();
                    switch (strM16613a19) {
                        case "image_addr":
                            c15451x.f48254x0 = c15360h0.m16602N0();
                            break;
                        case "in_app":
                            c15451x.f48250t0 = c15360h0.m16619m();
                            break;
                        case "raw_function":
                            c15451x.f48241C0 = c15360h0.m16602N0();
                            break;
                        case "lineno":
                            c15451x.f48246p0 = c15360h0.m16608W();
                            break;
                        case "module":
                            c15451x.f48245o0 = c15360h0.m16602N0();
                            break;
                        case "native":
                            c15451x.f48252v0 = c15360h0.m16619m();
                            break;
                        case "symbol":
                            c15451x.f48239A0 = c15360h0.m16602N0();
                            break;
                        case "package":
                            c15451x.f48251u0 = c15360h0.m16602N0();
                            break;
                        case "filename":
                            c15451x.f48243Y = c15360h0.m16602N0();
                            break;
                        case "symbol_addr":
                            c15451x.f48255y0 = c15360h0.m16602N0();
                            break;
                        case "lock":
                            c15451x.f48242D0 = (C15396j1) c15360h0.m16601J0(interfaceC15127H, new C15324c(i13));
                            break;
                        case "colno":
                            c15451x.f48247q0 = c15360h0.m16608W();
                            break;
                        case "instruction_addr":
                            c15451x.f48256z0 = c15360h0.m16602N0();
                            break;
                        case "context_line":
                            c15451x.f48249s0 = c15360h0.m16602N0();
                            break;
                        case "function":
                            c15451x.f48244Z = c15360h0.m16602N0();
                            break;
                        case "abs_path":
                            c15451x.f48248r0 = c15360h0.m16602N0();
                            break;
                        case "platform":
                            c15451x.f48253w0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap11, strM16613a19);
                            break;
                    }
                }
                c15451x.f48240B0 = concurrentHashMap11;
                c15360h0.m16618k();
                return c15451x;
            case 27:
                C15452y c15452y = new C15452y();
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a20 = c15360h0.m16613a0();
                    strM16613a20.getClass();
                    switch (strM16613a20) {
                        case "frames":
                            c15452y.f48257Y = c15360h0.m16617j0(interfaceC15127H, new C15334b(26));
                            break;
                        case "registers":
                            c15452y.f48258Z = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "snapshot":
                            c15452y.f48259o0 = c15360h0.m16619m();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap12, strM16613a20);
                            break;
                    }
                }
                c15452y.f48260p0 = concurrentHashMap12;
                c15360h0.m16618k();
                return c15452y;
            case 28:
                C15453z c15453z = new C15453z();
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap13 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a21 = c15360h0.m16613a0();
                    strM16613a21.getClass();
                    switch (strM16613a21) {
                        case "daemon":
                            c15453z.f48267s0 = c15360h0.m16619m();
                            break;
                        case "priority":
                            c15453z.f48262Z = c15360h0.m16608W();
                            break;
                        case "held_locks":
                            HashMap mapM16597C1 = c15360h0.m16597C0(interfaceC15127H, new C15324c(i13));
                            if (mapM16597C1 != null) {
                                c15453z.f48270v0 = new HashMap(mapM16597C1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            c15453z.f48261Y = c15360h0.m16620r0();
                            break;
                        case "main":
                            c15453z.f48268t0 = c15360h0.m16619m();
                            break;
                        case "name":
                            c15453z.f48263o0 = c15360h0.m16602N0();
                            break;
                        case "state":
                            c15453z.f48264p0 = c15360h0.m16602N0();
                            break;
                        case "crashed":
                            c15453z.f48265q0 = c15360h0.m16619m();
                            break;
                        case "current":
                            c15453z.f48266r0 = c15360h0.m16619m();
                            break;
                        case "stacktrace":
                            c15453z.f48269u0 = (C15452y) c15360h0.m16601J0(interfaceC15127H, new C15334b(27));
                            break;
                        default:
                            if (concurrentHashMap13 == null) {
                                concurrentHashMap13 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap13, strM16613a21);
                            break;
                    }
                }
                c15453z.f48271w0 = concurrentHashMap13;
                c15360h0.m16618k();
                return c15453z;
            default:
                c15360h0.m16614e();
                C15421A c15421a = new C15421A(new ArrayList(), new HashMap(), new C15422B(EnumC15423C.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap14 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a22 = c15360h0.m16613a0();
                    strM16613a22.getClass();
                    switch (strM16613a22) {
                        case "start_timestamp":
                            try {
                                Double dM16604P2 = c15360h0.m16604P();
                                if (dM16604P2 != null) {
                                    c15421a.f48052C0 = dM16604P2;
                                }
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateM16598E4 = c15360h0.m16598E(interfaceC15127H);
                                if (dateM16598E4 != null) {
                                    c15421a.f48052C0 = Double.valueOf(dateM16598E4.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "_metrics_summary":
                            c15421a.f48056G0 = c15360h0.m16621v0(interfaceC15127H, new C15334b(i12));
                            break;
                        case "measurements":
                            HashMap mapM16597C2 = c15360h0.m16597C0(interfaceC15127H, new C15334b(i11));
                            if (mapM16597C2 != null) {
                                c15421a.f48055F0.putAll(mapM16597C2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            c15360h0.m16622x();
                            break;
                        case "timestamp":
                            try {
                                Double dM16604P3 = c15360h0.m16604P();
                                if (dM16604P3 != null) {
                                    c15421a.f48053D0 = dM16604P3;
                                }
                                break;
                            } catch (NumberFormatException unused4) {
                                Date dateM16598E5 = c15360h0.m16598E(interfaceC15127H);
                                if (dateM16598E5 != null) {
                                    c15421a.f48053D0 = Double.valueOf(dateM16598E5.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListM16617j2 = c15360h0.m16617j0(interfaceC15127H, new C15334b(25));
                            if (arrayListM16617j2 != null) {
                                c15421a.f48054E0.addAll(arrayListM16617j2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            c15360h0.m16614e();
                            String strM16602N8 = null;
                            ConcurrentHashMap concurrentHashMap15 = null;
                            while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                                String strM16613a23 = c15360h0.m16613a0();
                                strM16613a23.getClass();
                                if (strM16613a23.equals("source")) {
                                    strM16602N8 = c15360h0.m16602N0();
                                } else {
                                    if (concurrentHashMap15 == null) {
                                        concurrentHashMap15 = new ConcurrentHashMap();
                                    }
                                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap15, strM16613a23);
                                }
                            }
                            C15422B c15422b = new C15422B(strM16602N8);
                            c15422b.f48060Z = concurrentHashMap15;
                            c15360h0.m16618k();
                            c15421a.f48057H0 = c15422b;
                            break;
                        case "transaction":
                            c15421a.f48051B0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (AbstractC8662k3.m9354e(c15421a, strM16613a22, c15360h0, interfaceC15127H)) {
                                break;
                            } else {
                                if (concurrentHashMap14 == null) {
                                    concurrentHashMap14 = new ConcurrentHashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, concurrentHashMap14, strM16613a22);
                                break;
                            }
                            break;
                    }
                }
                c15421a.f48058I0 = concurrentHashMap14;
                c15360h0.m16618k();
                return c15421a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C15433f m16561d(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        TimeZone timeZone;
        int i10 = 10;
        c15360h0.m16614e();
        C15433f c15433f = new C15433f();
        ConcurrentHashMap concurrentHashMap = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            byte b = -1;
            switch (strM16613a0.hashCode()) {
                case -2076227591:
                    if (strM16613a0.equals("timezone")) {
                        b = 0;
                    }
                    break;
                case -2012489734:
                    if (strM16613a0.equals("boot_time")) {
                        b = 1;
                    }
                    break;
                case -1981332476:
                    if (strM16613a0.equals("simulator")) {
                        b = 2;
                    }
                    break;
                case -1969347631:
                    if (strM16613a0.equals("manufacturer")) {
                        b = 3;
                    }
                    break;
                case -1613589672:
                    if (strM16613a0.equals("language")) {
                        b = 4;
                    }
                    break;
                case -1608004830:
                    if (strM16613a0.equals("processor_count")) {
                        b = 5;
                    }
                    break;
                case -1439500848:
                    if (strM16613a0.equals("orientation")) {
                        b = 6;
                    }
                    break;
                case -1410521534:
                    if (strM16613a0.equals("battery_temperature")) {
                        b = 7;
                    }
                    break;
                case -1281860764:
                    if (strM16613a0.equals("family")) {
                        b = 8;
                    }
                    break;
                case -1097462182:
                    if (strM16613a0.equals("locale")) {
                        b = 9;
                    }
                    break;
                case -1012222381:
                    if (strM16613a0.equals("online")) {
                        b = 10;
                    }
                    break;
                case -877252910:
                    if (strM16613a0.equals("battery_level")) {
                        b = 11;
                    }
                    break;
                case -619038223:
                    if (strM16613a0.equals("model_id")) {
                        b = 12;
                    }
                    break;
                case -568274923:
                    if (strM16613a0.equals("screen_density")) {
                        b = 13;
                    }
                    break;
                case -417046774:
                    if (strM16613a0.equals("screen_dpi")) {
                        b = 14;
                    }
                    break;
                case -136523212:
                    if (strM16613a0.equals("free_memory")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (strM16613a0.equals(ParameterNames.f31999ID)) {
                        b = 16;
                    }
                    break;
                case 3373707:
                    if (strM16613a0.equals(DiagnosticsEntry.NAME_KEY)) {
                        b = 17;
                    }
                    break;
                case 59142220:
                    if (strM16613a0.equals("low_memory")) {
                        b = 18;
                    }
                    break;
                case 93076189:
                    if (strM16613a0.equals("archs")) {
                        b = 19;
                    }
                    break;
                case 93997959:
                    if (strM16613a0.equals("brand")) {
                        b = 20;
                    }
                    break;
                case 104069929:
                    if (strM16613a0.equals("model")) {
                        b = 21;
                    }
                    break;
                case 115746789:
                    if (strM16613a0.equals("cpu_description")) {
                        b = 22;
                    }
                    break;
                case 244497903:
                    if (strM16613a0.equals(QzvfuIgrngtl.hcPWGUIxear)) {
                        b = 23;
                    }
                    break;
                case 731866107:
                    if (strM16613a0.equals("connection_type")) {
                        b = 24;
                    }
                    break;
                case 817830969:
                    if (strM16613a0.equals("screen_width_pixels")) {
                        b = 25;
                    }
                    break;
                case 823882553:
                    if (strM16613a0.equals("external_storage_size")) {
                        b = 26;
                    }
                    break;
                case 897428293:
                    if (strM16613a0.equals("storage_size")) {
                        b = 27;
                    }
                    break;
                case 1331465768:
                    if (strM16613a0.equals("usable_memory")) {
                        b = 28;
                    }
                    break;
                case 1418777727:
                    if (strM16613a0.equals("memory_size")) {
                        b = 29;
                    }
                    break;
                case 1436115569:
                    if (strM16613a0.equals("charging")) {
                        b = 30;
                    }
                    break;
                case 1450613660:
                    if (strM16613a0.equals("external_free_storage")) {
                        b = 31;
                    }
                    break;
                case 1524159400:
                    if (strM16613a0.equals("free_storage")) {
                        b = 32;
                    }
                    break;
                case 1556284978:
                    if (strM16613a0.equals("screen_height_pixels")) {
                        b = 33;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    switch (c15360h0.f47947Y) {
                        case 0:
                            C15513a c15513a = (C15513a) c15360h0.f47948Z;
                            if (c15513a.m16695C0() != EnumC15514b.NULL) {
                                try {
                                    timeZone = DesugarTimeZone.getTimeZone(c15513a.m16719x());
                                } catch (Exception e10) {
                                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error when deserializing TimeZone", e10);
                                }
                            } else {
                                c15513a.m16712e0();
                            }
                            break;
                        default:
                            String str = (String) c15360h0.m16609W0();
                            timeZone = str == null ? null : DesugarTimeZone.getTimeZone(str);
                            break;
                    }
                    c15433f.f48116L0 = timeZone;
                    break;
                case 1:
                    if (c15360h0.m16610X0() == EnumC15514b.STRING) {
                        c15433f.f48115K0 = c15360h0.m16598E(interfaceC15127H);
                    }
                    break;
                case 2:
                    c15433f.f48137x0 = c15360h0.m16619m();
                    break;
                case 3:
                    c15433f.f48127Z = c15360h0.m16602N0();
                    break;
                case 4:
                    c15433f.f48118N0 = c15360h0.m16602N0();
                    break;
                case 5:
                    c15433f.f48122R0 = c15360h0.m16608W();
                    break;
                case 6:
                    c15433f.f48136w0 = (EnumC15432e) c15360h0.m16601J0(interfaceC15127H, new C15334b(i10));
                    break;
                case 7:
                    c15433f.f48121Q0 = c15360h0.m16606T();
                    break;
                case 8:
                    c15433f.f48129p0 = c15360h0.m16602N0();
                    break;
                case 9:
                    c15433f.f48119O0 = c15360h0.m16602N0();
                    break;
                case 10:
                    c15433f.f48135v0 = c15360h0.m16619m();
                    break;
                case 11:
                    c15433f.f48133t0 = c15360h0.m16606T();
                    break;
                case 12:
                    c15433f.f48131r0 = c15360h0.m16602N0();
                    break;
                case 13:
                    c15433f.f48113I0 = c15360h0.m16606T();
                    break;
                case 14:
                    c15433f.f48114J0 = c15360h0.m16608W();
                    break;
                case 15:
                    c15433f.f48139z0 = c15360h0.m16620r0();
                    break;
                case 16:
                    c15433f.f48117M0 = c15360h0.m16602N0();
                    break;
                case 17:
                    c15433f.f48126Y = c15360h0.m16602N0();
                    break;
                case 18:
                    c15433f.f48106B0 = c15360h0.m16619m();
                    break;
                case 19:
                    List list = (List) c15360h0.m16600H0();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c15433f.f48132s0 = strArr;
                    }
                    break;
                case 20:
                    c15433f.f48128o0 = c15360h0.m16602N0();
                    break;
                case 21:
                    c15433f.f48130q0 = c15360h0.m16602N0();
                    break;
                case 22:
                    c15433f.f48124T0 = c15360h0.m16602N0();
                    break;
                case 23:
                    c15433f.f48123S0 = c15360h0.m16604P();
                    break;
                case 24:
                    c15433f.f48120P0 = c15360h0.m16602N0();
                    break;
                case 25:
                    c15433f.f48111G0 = c15360h0.m16608W();
                    break;
                case 26:
                    c15433f.f48109E0 = c15360h0.m16620r0();
                    break;
                case 27:
                    c15433f.f48107C0 = c15360h0.m16620r0();
                    break;
                case 28:
                    c15433f.f48105A0 = c15360h0.m16620r0();
                    break;
                case 29:
                    c15433f.f48138y0 = c15360h0.m16620r0();
                    break;
                case 30:
                    c15433f.f48134u0 = c15360h0.m16619m();
                    break;
                case 31:
                    c15433f.f48110F0 = c15360h0.m16620r0();
                    break;
                case 32:
                    c15433f.f48108D0 = c15360h0.m16620r0();
                    break;
                case 33:
                    c15433f.f48112H0 = c15360h0.m16608W();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                    break;
            }
        }
        c15433f.f48125U0 = concurrentHashMap;
        c15360h0.m16618k();
        return c15433f;
    }
}
