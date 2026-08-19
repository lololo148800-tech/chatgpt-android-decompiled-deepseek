package io.sentry.android.replay;

import android.gov.nist.core.Separators;
import io.sentry.C15345d;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15119E0;
import io.sentry.rrweb.AbstractC15461b;
import io.sentry.rrweb.C15460a;
import io.sentry.rrweb.C15470k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p138F8.vJO.vRJidSveZHcTw;
import p571X9.AbstractC9227W;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.replay.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15269c implements InterfaceC15119E0 {

    /* JADX INFO: renamed from: Z */
    public static final Object f47685Z = AbstractC9227W.m9799b(EnumC17307j.f55134Z, C15267a.f47669Z);

    /* JADX INFO: renamed from: o0 */
    public static final HashSet f47686o0;

    /* JADX INFO: renamed from: Y */
    public String f47687Y;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f47686o0 = hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, mm.i] */
    @Override // io.sentry.InterfaceC15119E0
    /* JADX INFO: renamed from: q */
    public final AbstractC15461b mo16261q(C15345d c15345d) {
        String str;
        EnumC15375i1 enumC15375i1;
        Object obj;
        String strM21703k0;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AbstractC16544l.m18089b(c15345d.f47909r0, "http")) {
            V v2 = c15345d.f47908q0.get("url");
            String str2 = v2 instanceof String ? (String) v2 : null;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            ConcurrentHashMap data = c15345d.f47908q0;
            AbstractC16544l.m18093f(data, "data");
            if (!data.containsKey("http.start_timestamp")) {
                return null;
            }
            ConcurrentHashMap data2 = c15345d.f47908q0;
            AbstractC16544l.m18093f(data2, "data");
            if (!data2.containsKey("http.end_timestamp")) {
                return null;
            }
            V v10 = c15345d.f47908q0.get("http.start_timestamp");
            V v11 = c15345d.f47908q0.get("http.end_timestamp");
            C15470k c15470k = new C15470k();
            c15470k.f48291Z = c15345d.m16573a().getTime();
            c15470k.f48315p0 = "resource.http";
            V v12 = c15345d.f47908q0.get("url");
            AbstractC16544l.m18092e(v12, "null cannot be cast to non-null type kotlin.String");
            c15470k.f48316q0 = (String) v12;
            if (v10 instanceof Double) {
                dLongValue = ((Number) v10).doubleValue();
            } else {
                AbstractC16544l.m18092e(v10, "null cannot be cast to non-null type kotlin.Long");
                dLongValue = ((Long) v10).longValue();
            }
            c15470k.f48317r0 = dLongValue / 1000.0d;
            if (v11 instanceof Double) {
                dLongValue2 = ((Number) v11).doubleValue();
            } else {
                AbstractC16544l.m18092e(v11, "null cannot be cast to non-null type kotlin.Long");
                dLongValue2 = ((Long) v11).longValue();
            }
            c15470k.f48318s0 = dLongValue2 / 1000.0d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ConcurrentHashMap concurrentHashMap = c15345d.f47908q0;
            AbstractC16544l.m18093f(concurrentHashMap, "breadcrumb.data");
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                if (f47686o0.contains(key)) {
                    AbstractC16544l.m18093f(key, "key");
                    linkedHashMap2.put(((C21319m) f47685Z.getValue()).m21666f(AbstractC21322p.m21702j0(AbstractC21329w.m21731r(key, "content_length", "body_size"), Separators.DOT), C15268b.f47682Z), value);
                }
            }
            c15470k.f48319t0 = new ConcurrentHashMap(linkedHashMap2);
            return c15470k;
        }
        String str3 = "navigation";
        if (AbstractC16544l.m18089b(c15345d.f47907p0, "navigation") && AbstractC16544l.m18089b(c15345d.f47909r0, "app.lifecycle")) {
            str3 = "app." + c15345d.f47908q0.get("state");
        } else if (AbstractC16544l.m18089b(c15345d.f47907p0, "navigation") && AbstractC16544l.m18089b(c15345d.f47909r0, "device.orientation")) {
            str3 = c15345d.f47909r0;
            AbstractC16544l.m18091d(str3);
            V v13 = c15345d.f47908q0.get("position");
            if (!AbstractC16544l.m18089b(v13, "landscape") && !AbstractC16544l.m18089b(v13, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", v13);
        } else {
            if (!AbstractC16544l.m18089b(c15345d.f47907p0, "navigation")) {
                if (AbstractC16544l.m18089b(c15345d.f47909r0, "ui.click")) {
                    Object obj2 = c15345d.f47908q0.get("view.id");
                    if (obj2 == null && (obj2 = c15345d.f47908q0.get("view.tag")) == null) {
                        obj2 = c15345d.f47908q0.get("view.class");
                    }
                    str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        return null;
                    }
                    ConcurrentHashMap concurrentHashMap2 = c15345d.f47908q0;
                    AbstractC16544l.m18093f(concurrentHashMap2, "breadcrumb.data");
                    linkedHashMap.putAll(concurrentHashMap2);
                    str3 = "ui.tap";
                    enumC15375i1 = null;
                } else if (AbstractC16544l.m18089b(c15345d.f47907p0, "system") && AbstractC16544l.m18089b(c15345d.f47909r0, "network.event")) {
                    if (!AbstractC16544l.m18089b(c15345d.f47908q0.get("action"), "NETWORK_LOST")) {
                        ConcurrentHashMap concurrentHashMap3 = c15345d.f47908q0;
                        AbstractC16544l.m18093f(concurrentHashMap3, "breadcrumb.data");
                        if (concurrentHashMap3.containsKey("network_type")) {
                            V v14 = c15345d.f47908q0.get("network_type");
                            String str4 = v14 instanceof String ? (String) v14 : null;
                            obj = (str4 == null || str4.length() == 0) ? "offline" : c15345d.f47908q0.get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (AbstractC16544l.m18089b(this.f47687Y, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj3 = linkedHashMap.get("state");
                    this.f47687Y = obj3 instanceof String ? (String) obj3 : null;
                    str3 = "device.connectivity";
                } else if (AbstractC16544l.m18089b(c15345d.f47908q0.get("action"), "BATTERY_CHANGED")) {
                    ConcurrentHashMap concurrentHashMap4 = c15345d.f47908q0;
                    AbstractC16544l.m18093f(concurrentHashMap4, "breadcrumb.data");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it2 = concurrentHashMap4.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        String str5 = (String) entry2.getKey();
                        if (AbstractC16544l.m18089b(str5, "level") || AbstractC16544l.m18089b(str5, vRJidSveZHcTw.yrzbQuRCXOdcUe)) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str3 = "device.battery";
                } else {
                    str3 = c15345d.f47909r0;
                    str = c15345d.f47906o0;
                    enumC15375i1 = c15345d.f47911t0;
                    ConcurrentHashMap concurrentHashMap5 = c15345d.f47908q0;
                    AbstractC16544l.m18093f(concurrentHashMap5, "breadcrumb.data");
                    linkedHashMap.putAll(concurrentHashMap5);
                }
                if (str3 == null && str3.length() != 0) {
                    C15460a c15460a = new C15460a();
                    c15460a.f48291Z = c15345d.m16573a().getTime();
                    c15460a.f48281p0 = c15345d.m16573a().getTime() / 1000.0d;
                    c15460a.f48282q0 = "default";
                    c15460a.f48283r0 = str3;
                    c15460a.f48284s0 = str;
                    c15460a.f48285t0 = enumC15375i1;
                    c15460a.f48286u0 = new ConcurrentHashMap(linkedHashMap);
                    return c15460a;
                }
            }
            if (AbstractC16544l.m18089b(c15345d.f47908q0.get("state"), "resumed")) {
                V v15 = c15345d.f47908q0.get("screen");
                String str6 = v15 instanceof String ? (String) v15 : null;
                if (str6 != null) {
                    strM21703k0 = AbstractC21322p.m21703k0('.', str6, str6);
                } else {
                    strM21703k0 = null;
                }
            } else {
                ConcurrentHashMap concurrentHashMap6 = c15345d.f47908q0;
                AbstractC16544l.m18093f(concurrentHashMap6, "breadcrumb.data");
                if (concurrentHashMap6.containsKey("to")) {
                    V v16 = c15345d.f47908q0.get("to");
                    if (v16 instanceof String) {
                        strM21703k0 = (String) v16;
                    } else {
                        strM21703k0 = null;
                    }
                } else {
                    strM21703k0 = null;
                }
            }
            if (strM21703k0 == null) {
                return null;
            }
            linkedHashMap.put("to", strM21703k0);
        }
        str = null;
        enumC15375i1 = null;
        return str3 == null ? null : null;
    }
}
