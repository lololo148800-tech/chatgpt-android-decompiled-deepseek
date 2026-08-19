package p523V9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p025An.AbstractC0575H;
import p025An.C0642v;
import p042Bf.C1268j;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.C2939q;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7302f;
import p479Td.AbstractC7343b0;
import p537W0.AbstractC8411c;
import p635a1.InterfaceC10459q;
import p754fl.C13693c;
import p857kl.AbstractC16435B;
import p857kl.C16460h;
import p953q0.C18557O;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: V9.b6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8056b6 {
    /* JADX INFO: renamed from: a */
    public static final void m8450a(AbstractC7343b0 content, String messageId, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-555121280);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(content) : c6021p.m6545h(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4767a(C3582M.m4274b(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12156l, AbstractC7302f.m7772a(c6021p), 0L, null, null, 0L, null, 3, 0, 0L, null, null, 16744446), AbstractC8411c.m8969c(1407440369, c6021p, new C1268j((Object) content, interfaceC10459q, (Object) messageId, (InterfaceC17302e) onIntent, 22)), c6021p, 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(content, messageId, onIntent, interfaceC10459q, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8451b(C13693c c13693c, C16460h contentType) {
        AbstractC16544l.m18094g(c13693c, "<this>");
        AbstractC16544l.m18094g(contentType, "contentType");
        List list = AbstractC16435B.f50983a;
        c13693c.f43197c.m4529e(SIPHeaderNames.ACCEPT, contentType.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m8452c(C13693c c13693c, String key, Object obj) {
        AbstractC16544l.m18094g(c13693c, "<this>");
        AbstractC16544l.m18094g(key, "key");
        if (obj != null) {
            c13693c.f43195a.f51027j.m10672u(key, obj.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m8453d(C2939q c2939q, C2939q c2939q2, InterfaceC1439n interfaceC1439n) {
        Object c0642v;
        Object objM1299Q;
        try {
            AbstractC16529F.m18081e(2, interfaceC1439n);
            c0642v = interfaceC1439n.invoke(c2939q2, c2939q);
        } catch (Throwable th2) {
            c0642v = new C0642v(th2, false);
        }
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (c0642v == enumC19250a || (objM1299Q = c2939q.m1299Q(c0642v)) == AbstractC0575H.f1800e) {
            return enumC19250a;
        }
        c2939q.mo1206k0();
        if (objM1299Q instanceof C0642v) {
            throw ((C0642v) objM1299Q).f1900a;
        }
        return AbstractC0575H.m1166N(objM1299Q);
    }
}
