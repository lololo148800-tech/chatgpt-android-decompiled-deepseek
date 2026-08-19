package p594Y9;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.C19461k;
import p1019t6.C19802a;
import p530Vi.C8312h;
import p775h2.AbstractC14376f;
import p917o6.C17852e;
import p917o6.C17867t;
import p917o6.InterfaceC17842J;

/* JADX INFO: renamed from: Y9.K4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9758K4 {
    /* JADX INFO: renamed from: a */
    public static Map m10360a(C17852e apolloRequest) {
        AbstractC16544l.m18094g(apolloRequest, "apolloRequest");
        Boolean bool = apolloRequest.f56926f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = apolloRequest.f56927g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        C17867t c17867t = (C17867t) apolloRequest.f56923c.mo4141d(C17867t.f56959e);
        if (c17867t == null) {
            c17867t = C17867t.f56960f;
        }
        InterfaceC17842J interfaceC17842J = apolloRequest.f56921a;
        String strMo19591d = zBooleanValue2 ? interfaceC17842J.mo19591d() : null;
        C19461k c19461k = new C19461k();
        String strMo19590c = interfaceC17842J.mo19590c();
        c19461k.mo20554o();
        c19461k.mo20545M0("operationName");
        c19461k.m20590k(interfaceC17842J.name());
        c19461k.mo20545M0("variables");
        C19802a c19802a = new C19802a(c19461k);
        c19802a.mo20554o();
        interfaceC17842J.mo19592e(c19802a, c17867t);
        c19802a.mo20551j();
        if (strMo19591d != null) {
            c19461k.mo20545M0("query");
            c19461k.m20590k(strMo19591d);
        }
        if (zBooleanValue) {
            c19461k.mo20545M0("extensions");
            c19461k.mo20554o();
            c19461k.mo20545M0("persistedQuery");
            c19461k.mo20554o();
            c19461k.mo20545M0("version");
            c19461k.mo20540C(1);
            c19461k.mo20545M0("sha256Hash");
            c19461k.m20590k(strMo19590c);
            c19461k.mo20551j();
            c19461k.mo20551j();
        }
        c19461k.mo20551j();
        Object objM20589e = c19461k.m20589e();
        AbstractC16544l.m18092e(objM20589e, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) objM20589e;
    }

    /* JADX INFO: renamed from: b */
    public static void m10361b(C8312h c8312h, String message) {
        AbstractC16544l.m18094g(c8312h, "<this>");
        AbstractC16544l.m18094g(message, "message");
        AbstractC14376f.m15825D(3, "kind");
        AbstractC9799R4.m10419a(C8312h.Companion, message, 3);
    }
}
