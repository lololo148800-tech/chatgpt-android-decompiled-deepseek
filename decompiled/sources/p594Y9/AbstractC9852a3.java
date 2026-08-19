package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21329w;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p530Vi.C8300H;
import p530Vi.C8305a;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p919o8.C17928Q0;

/* JADX INFO: renamed from: Y9.a3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9852a3 {
    /* JADX INFO: renamed from: a */
    public static C17928Q0 m10500a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17928Q0(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ContainerView", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10501b(C8312h c8312h, Throwable error, String message, String str, String str2, InterfaceC1436k interfaceC1436k) {
        Map mapM19254p;
        C8317m c8317m;
        InterfaceC1436k interfaceC1436k2;
        AbstractC16544l.m18094g(error, "error");
        AbstractC16544l.m18094g(message, "message");
        if (c8312h != null && (c8317m = c8312h.f25902Y) != null && (interfaceC1436k2 = c8317m.f25930p) != null) {
            interfaceC1436k2.invoke(error);
        }
        String message2 = error.getMessage();
        if (message2 != null) {
            message = AbstractC9306j0.m9890i(message, ": ", message2);
        }
        AbstractC9799R4.m10419a(C8312h.Companion, message, 1);
        C8300H c8300h = C8300H.f25862Y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC1436k.invoke(linkedHashMap);
        if (C8300H.f25863Z != 0.0d && AbstractC21329w.m21734u(str, "analytics_mobile", false) && !linkedHashMap.isEmpty() && C8300H.f25869t0.size() < C8300H.f25867r0 && Math.random() <= C8300H.f25863Z) {
            if (C8300H.f25865p0) {
                mapM19254p = AbstractC17659D.m19254p(linkedHashMap);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (!lowerCase.equals("writekey")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                mapM19254p = linkedHashMap2;
            }
            C8300H.m8906a(c8300h, str, mapM19254p, 4);
            if (C8300H.f25873x0) {
                C8300H.f25873x0 = false;
                c8300h.m8908b();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10502c(C8305a c8305a, Throwable error) {
        AbstractC16544l.m18094g(c8305a, "<this>");
        AbstractC16544l.m18094g(error, "error");
        String message = error.getMessage();
        if (message != null) {
            AbstractC9799R4.m10419a(C8312h.Companion, message, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m10503d(C8312h c8312h, Throwable th2) {
        InterfaceC1436k interfaceC1436k = c8312h.f25902Y.f25930p;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(th2);
        }
        m10502c(C8312h.Companion, th2);
    }
}
