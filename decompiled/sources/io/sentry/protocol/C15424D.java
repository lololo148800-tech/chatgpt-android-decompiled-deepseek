package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15360h0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15176Y;
import io.sentry.rrweb.C15460a;
import io.sentry.rrweb.C15466g;
import io.sentry.rrweb.C15467h;
import io.sentry.rrweb.C15468i;
import io.sentry.rrweb.C15469j;
import io.sentry.rrweb.C15470k;
import io.sentry.rrweb.C15471l;
import io.sentry.rrweb.EnumC15462c;
import io.sentry.rrweb.EnumC15463d;
import io.sentry.rrweb.EnumC15465f;
import io.sentry.vendor.gson.stream.EnumC15514b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8483G3;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C15424D implements InterfaceC15176Y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48061a;

    public /* synthetic */ C15424D(int i10) {
        this.f48061a = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static C15460a m16654b(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10 = 0;
        int i11 = 4;
        c15360h0.m16614e();
        C15460a c15460a = new C15460a();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    if (strM16613a1.equals("payload")) {
                        c15360h0.m16614e();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                            String strM16613a2 = c15360h0.m16613a0();
                            strM16613a2.getClass();
                            int i12 = -1;
                            switch (strM16613a2.hashCode()) {
                                case 3076010:
                                    if (strM16613a2.equals("data")) {
                                        i12 = i10;
                                    }
                                    break;
                                case 3575610:
                                    if (strM16613a2.equals("type")) {
                                        i12 = 1;
                                    }
                                    break;
                                case 50511102:
                                    if (strM16613a2.equals("category")) {
                                        i12 = 2;
                                    }
                                    break;
                                case 55126294:
                                    if (strM16613a2.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                                        i12 = 3;
                                    }
                                    break;
                                case 102865796:
                                    if (strM16613a2.equals("level")) {
                                        i12 = 4;
                                    }
                                    break;
                                case 954925063:
                                    if (strM16613a2.equals("message")) {
                                        i12 = 5;
                                    }
                                    break;
                            }
                            switch (i12) {
                                case 0:
                                    ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                                    if (concurrentHashMapM9064a != null) {
                                        c15460a.f48286u0 = concurrentHashMapM9064a;
                                    }
                                    break;
                                case 1:
                                    c15460a.f48282q0 = c15360h0.m16602N0();
                                    break;
                                case 2:
                                    c15460a.f48283r0 = c15360h0.m16602N0();
                                    break;
                                case 3:
                                    c15460a.f48281p0 = c15360h0.m16603O();
                                    break;
                                case 4:
                                    try {
                                        c15460a.f48285t0 = EnumC15375i1.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
                                    } catch (Exception e10) {
                                        interfaceC15127H.mo16296g(EnumC15375i1.DEBUG, e10, "Error when deserializing SentryLevel", new Object[i10]);
                                    }
                                    break;
                                case 5:
                                    c15460a.f48284s0 = c15360h0.m16602N0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a2);
                                    break;
                            }
                            i10 = 0;
                        }
                        c15460a.f48288w0 = concurrentHashMap2;
                        c15360h0.m16618k();
                    } else if (strM16613a1.equals(ParameterNames.TAG)) {
                        String strM16602N0 = c15360h0.m16602N0();
                        if (strM16602N0 == null) {
                            strM16602N0 = "";
                        }
                        c15460a.f48280o0 = strM16602N0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a1);
                    }
                    i10 = 0;
                }
                c15460a.f48289x0 = concurrentHashMap;
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(i11));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15460a.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15460a.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
            i10 = 0;
        }
        c15460a.f48287v0 = map;
        c15360h0.m16618k();
        return c15460a;
    }

    /* JADX INFO: renamed from: c */
    public static C15466g m16655c(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10 = 5;
        int i11 = 4;
        c15360h0.m16614e();
        C15466g c15466g = new C15466g();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                HashMap map2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    switch (strM16613a1) {
                        case "x":
                            c15466g.f48295r0 = c15360h0.m16605S();
                            break;
                        case "y":
                            c15466g.f48296s0 = c15360h0.m16605S();
                            break;
                        case "id":
                            c15466g.f48294q0 = c15360h0.m16616g0();
                            break;
                        case "type":
                            c15466g.f48293p0 = (EnumC15465f) c15360h0.m16601J0(interfaceC15127H, new C15424D(7));
                            break;
                        case "pointerType":
                            c15466g.f48297t0 = c15360h0.m16616g0();
                            break;
                        case "pointerId":
                            c15466g.f48298u0 = c15360h0.m16616g0();
                            break;
                        default:
                            if (!strM16613a1.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, map2, strM16613a1);
                                break;
                            } else {
                                EnumC15463d enumC15463d = (EnumC15463d) c15360h0.m16601J0(interfaceC15127H, new C15424D(i10));
                                AbstractC8483G3.m9133c(enumC15463d, "");
                                c15466g.f48292o0 = enumC15463d;
                                break;
                            }
                            break;
                    }
                }
                c15466g.f48300w0 = map2;
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(i11));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15466g.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15466g.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
        }
        c15466g.f48299v0 = map;
        c15360h0.m16618k();
        return c15466g;
    }

    /* JADX INFO: renamed from: d */
    public static C15468i m16656d(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        c15360h0.m16614e();
        C15468i c15468i = new C15468i();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                HashMap map2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    if (strM16613a1.equals("pointerId")) {
                        c15468i.f48306p0 = c15360h0.m16616g0();
                    } else if (strM16613a1.equals("positions")) {
                        c15468i.f48307q0 = c15360h0.m16617j0(interfaceC15127H, new C15424D(9));
                    } else if (strM16613a1.equals("source")) {
                        EnumC15463d enumC15463d = (EnumC15463d) c15360h0.m16601J0(interfaceC15127H, new C15424D(5));
                        AbstractC8483G3.m9133c(enumC15463d, "");
                        c15468i.f48292o0 = enumC15463d;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map2, strM16613a1);
                    }
                }
                c15468i.f48309s0 = map2;
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(4));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15468i.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15468i.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
        }
        c15468i.f48308r0 = map;
        c15360h0.m16618k();
        return c15468i;
    }

    /* JADX INFO: renamed from: e */
    public static C15469j m16657e(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        c15360h0.m16614e();
        C15469j c15469j = new C15469j();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                AbstractMap concurrentHashMap = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    switch (strM16613a1) {
                        case "height":
                            Integer numM16608W = c15360h0.m16608W();
                            c15469j.f48311p0 = numM16608W == null ? 0 : numM16608W.intValue();
                            break;
                        case "href":
                            String strM16602N0 = c15360h0.m16602N0();
                            if (strM16602N0 == null) {
                                strM16602N0 = "";
                            }
                            c15469j.f48310o0 = strM16602N0;
                            break;
                        case "width":
                            Integer numM16608W2 = c15360h0.m16608W();
                            c15469j.f48312q0 = numM16608W2 == null ? 0 : numM16608W2.intValue();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a1);
                            break;
                    }
                }
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(4));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15469j.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15469j.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
        }
        c15469j.f48313r0 = map;
        c15360h0.m16618k();
        return c15469j;
    }

    /* JADX INFO: renamed from: f */
    public static C15470k m16658f(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10 = 4;
        c15360h0.m16614e();
        C15470k c15470k = new C15470k();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    if (strM16613a1.equals("payload")) {
                        c15360h0.m16614e();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                            String strM16613a2 = c15360h0.m16613a0();
                            strM16613a2.getClass();
                            switch (strM16613a2) {
                                case "description":
                                    c15470k.f48316q0 = c15360h0.m16602N0();
                                    break;
                                case "endTimestamp":
                                    c15470k.f48318s0 = c15360h0.m16603O();
                                    break;
                                case "startTimestamp":
                                    c15470k.f48317r0 = c15360h0.m16603O();
                                    break;
                                case "op":
                                    c15470k.f48315p0 = c15360h0.m16602N0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                                    if (concurrentHashMapM9064a == null) {
                                        break;
                                    } else {
                                        c15470k.f48319t0 = concurrentHashMapM9064a;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a2);
                                    break;
                            }
                        }
                        c15470k.f48321v0 = concurrentHashMap2;
                        c15360h0.m16618k();
                    } else if (strM16613a1.equals(ParameterNames.TAG)) {
                        String strM16602N0 = c15360h0.m16602N0();
                        if (strM16602N0 == null) {
                            strM16602N0 = "";
                        }
                        c15470k.f48314o0 = strM16602N0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a1);
                    }
                }
                c15470k.f48322w0 = concurrentHashMap;
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(i10));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15470k.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15470k.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
        }
        c15470k.f48320u0 = map;
        c15360h0.m16618k();
        return c15470k;
    }

    /* JADX INFO: renamed from: g */
    public static C15471l m16659g(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10 = 4;
        c15360h0.m16614e();
        C15471l c15471l = new C15471l();
        HashMap map = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            if (strM16613a0.equals("data")) {
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    if (strM16613a1.equals("payload")) {
                        c15360h0.m16614e();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                            String strM16613a2 = c15360h0.m16613a0();
                            strM16613a2.getClass();
                            switch (strM16613a2) {
                                case "duration":
                                    c15471l.f48330r0 = c15360h0.m16599E0();
                                    break;
                                case "segmentId":
                                    c15471l.f48328p0 = c15360h0.m16616g0();
                                    break;
                                case "height":
                                    Integer numM16608W = c15360h0.m16608W();
                                    c15471l.f48333u0 = numM16608W == null ? 0 : numM16608W.intValue();
                                    break;
                                case "container":
                                    String strM16602N0 = c15360h0.m16602N0();
                                    if (strM16602N0 == null) {
                                        strM16602N0 = "";
                                    }
                                    c15471l.f48332t0 = strM16602N0;
                                    break;
                                case "frameCount":
                                    Integer numM16608W2 = c15360h0.m16608W();
                                    c15471l.f48335w0 = numM16608W2 == null ? 0 : numM16608W2.intValue();
                                    break;
                                case "top":
                                    Integer numM16608W3 = c15360h0.m16608W();
                                    c15471l.f48323A0 = numM16608W3 == null ? 0 : numM16608W3.intValue();
                                    break;
                                case "left":
                                    Integer numM16608W4 = c15360h0.m16608W();
                                    c15471l.f48338z0 = numM16608W4 == null ? 0 : numM16608W4.intValue();
                                    break;
                                case "size":
                                    Long lM16620r0 = c15360h0.m16620r0();
                                    c15471l.f48329q0 = lM16620r0 == null ? 0L : lM16620r0.longValue();
                                    break;
                                case "width":
                                    Integer numM16608W5 = c15360h0.m16608W();
                                    c15471l.f48334v0 = numM16608W5 == null ? 0 : numM16608W5.intValue();
                                    break;
                                case "frameRate":
                                    Integer numM16608W6 = c15360h0.m16608W();
                                    c15471l.f48337y0 = numM16608W6 == null ? 0 : numM16608W6.intValue();
                                    break;
                                case "encoding":
                                    String strM16602N1 = c15360h0.m16602N0();
                                    if (strM16602N1 == null) {
                                        strM16602N1 = "";
                                    }
                                    c15471l.f48331s0 = strM16602N1;
                                    break;
                                case "frameRateType":
                                    String strM16602N2 = c15360h0.m16602N0();
                                    if (strM16602N2 == null) {
                                        strM16602N2 = "";
                                    }
                                    c15471l.f48336x0 = strM16602N2;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a2);
                                    break;
                            }
                        }
                        c15471l.f48325C0 = concurrentHashMap2;
                        c15360h0.m16618k();
                    } else if (strM16613a1.equals(ParameterNames.TAG)) {
                        String strM16602N3 = c15360h0.m16602N0();
                        if (strM16602N3 == null) {
                            strM16602N3 = "";
                        }
                        c15471l.f48327o0 = strM16602N3;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a1);
                    }
                }
                c15471l.f48326D0 = concurrentHashMap;
                c15360h0.m16618k();
            } else if (strM16613a0.equals("type")) {
                EnumC15462c enumC15462c = (EnumC15462c) c15360h0.m16601J0(interfaceC15127H, new C15424D(i10));
                AbstractC8483G3.m9133c(enumC15462c, "");
                c15471l.f48290Y = enumC15462c;
            } else if (strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                c15471l.f48291Z = c15360h0.m16599E0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c15360h0.m16607V0(interfaceC15127H, map, strM16613a0);
            }
        }
        c15471l.f48324B0 = map;
        c15360h0.m16618k();
        return c15471l;
    }

    @Override // io.sentry.InterfaceC15176Y
    /* JADX INFO: renamed from: a */
    public final Object mo16359a(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        int i10 = 2;
        switch (this.f48061a) {
            case 0:
                c15360h0.m16614e();
                C15425E c15425e = new C15425E();
                ConcurrentHashMap concurrentHashMap = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a0 = c15360h0.m16613a0();
                    strM16613a0.getClass();
                    switch (strM16613a0) {
                        case "username":
                            c15425e.f48064o0 = c15360h0.m16602N0();
                            break;
                        case "id":
                            c15425e.f48063Z = c15360h0.m16602N0();
                            break;
                        case "geo":
                            c15360h0.m16614e();
                            C15434g c15434g = new C15434g();
                            ConcurrentHashMap concurrentHashMap2 = null;
                            while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                                String strM16613a1 = c15360h0.m16613a0();
                                strM16613a1.getClass();
                                switch (strM16613a1) {
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
                                        if (concurrentHashMap2 == null) {
                                            concurrentHashMap2 = new ConcurrentHashMap();
                                        }
                                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap2, strM16613a1);
                                        break;
                                }
                            }
                            c15434g.f48143p0 = concurrentHashMap2;
                            c15360h0.m16618k();
                            c15425e.f48068s0 = c15434g;
                            break;
                        case "data":
                            c15425e.f48069t0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "name":
                            c15425e.f48067r0 = c15360h0.m16602N0();
                            break;
                        case "email":
                            c15425e.f48062Y = c15360h0.m16602N0();
                            break;
                        case "other":
                            ConcurrentHashMap concurrentHashMap3 = c15425e.f48069t0;
                            if (concurrentHashMap3 != null && !concurrentHashMap3.isEmpty()) {
                                break;
                            } else {
                                c15425e.f48069t0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                                break;
                            }
                            break;
                        case "ip_address":
                            c15425e.f48066q0 = c15360h0.m16602N0();
                            break;
                        case "segment":
                            c15425e.f48065p0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                            break;
                    }
                }
                c15425e.f48070u0 = concurrentHashMap;
                c15360h0.m16618k();
                return c15425e;
            case 1:
                c15360h0.m16614e();
                String strM16602N0 = null;
                ArrayList arrayListM16617j0 = null;
                HashMap map = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a2 = c15360h0.m16613a0();
                    strM16613a2.getClass();
                    if (strM16613a2.equals("rendering_system")) {
                        strM16602N0 = c15360h0.m16602N0();
                    } else if (strM16613a2.equals("windows")) {
                        arrayListM16617j0 = c15360h0.m16617j0(interfaceC15127H, new C15424D(i10));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map, strM16613a2);
                    }
                }
                c15360h0.m16618k();
                C15426F c15426f = new C15426F(strM16602N0, arrayListM16617j0);
                c15426f.f48073o0 = map;
                return c15426f;
            case 2:
                C15427G c15427g = new C15427G();
                c15360h0.m16614e();
                HashMap map2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a3 = c15360h0.m16613a0();
                    strM16613a3.getClass();
                    switch (strM16613a3) {
                        case "rendering_system":
                            c15427g.f48074Y = c15360h0.m16602N0();
                            break;
                        case "identifier":
                            c15427g.f48076o0 = c15360h0.m16602N0();
                            break;
                        case "height":
                            c15427g.f48079r0 = c15360h0.m16604P();
                            break;
                        case "x":
                            c15427g.f48080s0 = c15360h0.m16604P();
                            break;
                        case "y":
                            c15427g.f48081t0 = c15360h0.m16604P();
                            break;
                        case "tag":
                            c15427g.f48077p0 = c15360h0.m16602N0();
                            break;
                        case "type":
                            c15427g.f48075Z = c15360h0.m16602N0();
                            break;
                        case "alpha":
                            c15427g.f48083v0 = c15360h0.m16604P();
                            break;
                        case "width":
                            c15427g.f48078q0 = c15360h0.m16604P();
                            break;
                        case "children":
                            c15427g.f48084w0 = c15360h0.m16617j0(interfaceC15127H, this);
                            break;
                        case "visibility":
                            c15427g.f48082u0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map2, strM16613a3);
                            break;
                    }
                }
                c15360h0.m16618k();
                c15427g.f48085x0 = map2;
                return c15427g;
            case 3:
                return m16654b(c15360h0, interfaceC15127H);
            case 4:
                return EnumC15462c.values()[c15360h0.m16616g0()];
            case 5:
                return EnumC15463d.values()[c15360h0.m16616g0()];
            case 6:
                return m16655c(c15360h0, interfaceC15127H);
            case 7:
                return EnumC15465f.values()[c15360h0.m16616g0()];
            case 8:
                return m16656d(c15360h0, interfaceC15127H);
            case 9:
                c15360h0.m16614e();
                C15467h c15467h = new C15467h();
                HashMap map3 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a4 = c15360h0.m16613a0();
                    strM16613a4.getClass();
                    switch (strM16613a4) {
                        case "x":
                            c15467h.f48302Z = c15360h0.m16605S();
                            break;
                        case "y":
                            c15467h.f48303o0 = c15360h0.m16605S();
                            break;
                        case "id":
                            c15467h.f48301Y = c15360h0.m16616g0();
                            break;
                        case "timeOffset":
                            c15467h.f48304p0 = c15360h0.m16599E0();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map3, strM16613a4);
                            break;
                    }
                }
                c15467h.f48305q0 = map3;
                c15360h0.m16618k();
                return c15467h;
            case 10:
                return m16657e(c15360h0, interfaceC15127H);
            case 11:
                return m16658f(c15360h0, interfaceC15127H);
            default:
                return m16659g(c15360h0, interfaceC15127H);
        }
    }
}
