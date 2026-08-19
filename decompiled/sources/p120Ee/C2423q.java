package p120Ee;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ie.C14975d;
import io.sentry.AbstractC15152P0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p008A6.C0387g;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p094De.C2018a;
import p1061vb.C20513d;
import p1155zi.C22011h0;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p290Ld.C5003f;
import p381Pe.C6393d;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p402Qc.C6589e;
import p402Qc.C6591g;
import p402Qc.C6593i;
import p403Qd.C6636i;
import p403Qd.EnumC6603I;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p559Wn.C8976h;
import p571X9.AbstractC9233X;
import p763g5.AbstractC13819d;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ee.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2423q {

    /* JADX INFO: renamed from: a */
    public final C3430e f7534a = AbstractC8168p6.m8749b("CompleteConversationQueries", null);

    /* JADX INFO: renamed from: b */
    public final C6589e f7535b;

    /* JADX INFO: renamed from: c */
    public final C6589e f7536c;

    public C2423q(C14975d c14975d, C20513d c20513d) {
        C17314q c17314q = c14975d.f46633d;
        this.f7535b = ((C5003f) c17314q.getValue()).f16320o0;
        this.f7536c = ((C5003f) c17314q.getValue()).f16321p0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: a */
    public static final Object m3576a(C2423q c2423q, C6636i c6636i, AbstractC19687c abstractC19687c) {
        C2417k c2417k;
        C6636i c6636i2;
        C6636i c6636i3;
        C6636i c6636iM7162a;
        c2423q.getClass();
        if (abstractC19687c instanceof C2417k) {
            c2417k = (C2417k) abstractC19687c;
            int i10 = c2417k.f7513p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2417k.f7513p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2417k = new C2417k(c2423q, abstractC19687c);
            }
        } else {
            c2417k = new C2417k(c2423q, abstractC19687c);
        }
        Object obj = c2417k.f7511Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2417k.f7513p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                C6589e c6589e = c2423q.f7536c;
                String conversationId = c6636i.f21379a;
                c6589e.getClass();
                AbstractC16544l.m18094g(conversationId, "conversationId");
                List listM784i = new C0387g(c6589e, conversationId, new C6593i(c6589e, 0)).m784i();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM784i, 10));
                Iterator it = listM784i.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6591g) it.next()).f21295c);
                }
                try {
                    c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, null, null, null, EnumC6603I.f21320o0, false, null, new C6394e(arrayList, c6636i.f21379a), 917503);
                } catch (Exception e10) {
                    e = e10;
                    AbstractC8160o6.m8727b(c2423q.f7534a, "Error hydrating conversation with messages", e, 4);
                    if ((e instanceof C8976h) || ((e instanceof C6393d) && ((C6393d) e).f20810Y == 0)) {
                        String str = c6636i.f21379a;
                        C2417k c2417k2 = c2417k;
                        c2417k2.f7510Y = c6636i;
                        c2417k2.f7513p0 = 1;
                        if (c2423q.f7535b.m7154R(str, c2417k2) == enumC19250a) {
                            return enumC19250a;
                        }
                        c6636i2 = c6636i;
                        c6636i3 = c6636i2;
                    } else {
                        AbstractC15152P0.m16331e().mo16250s(e);
                        c6636i3 = c6636i;
                    }
                    c6636iM7162a = C6636i.m7162a(c6636i3, null, null, null, null, null, null, null, null, null, null, null, EnumC6603I.f21321p0, false, null, null, 1966079);
                }
            } catch (Exception e11) {
                e = e11;
            }
            return c6636iM7162a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c6636i2 = c2417k.f7510Y;
        AbstractC9233X.m9807c(obj);
        c6636i3 = c6636i2;
        c6636iM7162a = C6636i.m7162a(c6636i3, null, null, null, null, null, null, null, null, null, null, null, EnumC6603I.f21321p0, false, null, null, 1966079);
        return c6636iM7162a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public static final Object m3577b(C2423q c2423q, C6636i c6636i, AbstractC19687c abstractC19687c) {
        C2421o c2421o;
        C2423q c2423q2;
        Iterator it;
        Object obj;
        if (abstractC19687c instanceof C2421o) {
            c2421o = (C2421o) abstractC19687c;
            int i10 = c2421o.f7528q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2421o.f7528q0 = i10 - Integer.MIN_VALUE;
                c2423q2 = c2423q;
            } else {
                c2423q2 = c2423q;
                c2421o = new C2421o(c2423q2, abstractC19687c);
            }
        } else {
            c2423q2 = c2423q;
            c2421o = new C2421o(c2423q2, abstractC19687c);
        }
        Object obj2 = c2421o.f7526o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2421o.f7528q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            Collection<C6397h> collectionValues = c6636i.f21399u.f20814b.values();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionValues, 10));
            for (C6397h c6397hM7033a : collectionValues) {
                String str = ((C7351f0) c6397hM7033a.f20822d).f23288c;
                String str2 = c6636i.f21379a;
                if (!(str == null ? false : str.equals(str2))) {
                    c6397hM7033a = C6397h.m7033a(c6397hM7033a, null, null, null, C7351f0.m7781a((C7351f0) c6397hM7033a.f20822d, str2, null, null, null, null, false, false, -5, 511), 7);
                }
                arrayList.add(c6397hM7033a);
            }
            it = arrayList.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c2421o.f7525Z;
            c2423q2 = c2421o.f7524Y;
            AbstractC9233X.m9807c(obj2);
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = C17296C.f55119a;
            if (!zHasNext) {
                return obj;
            }
            C6397h c6397h = (C6397h) it.next();
            C6589e c6589e = c2423q2.f7536c;
            c2421o.f7524Y = c2423q2;
            c2421o.f7525Z = it;
            c2421o.f7528q0 = 1;
            C7351f0 c7351f0 = (C7351f0) c6397h.f20822d;
            String str3 = c7351f0.f23286a;
            String str4 = c7351f0.f23288c;
            C22011h0 c22011h0 = str4 != null ? new C22011h0(str4) : null;
            if (c22011h0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objM7158V = c6589e.m7158V(new C6591g(str3, c22011h0.f69652a, c6397h), c2421o);
            if (objM7158V == EnumC19250a.f61036Y) {
                obj = objM7158V;
            }
        } while (obj != enumC19250a);
        return enumC19250a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: c */
    public static final Object m3578c(C2423q c2423q, AbstractC13819d abstractC13819d, String str, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C2422p c2422p;
        c2423q.getClass();
        if (abstractC19687c instanceof C2422p) {
            c2422p = (C2422p) abstractC19687c;
            int i10 = c2422p.f7533q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2422p.f7533q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2422p = new C2422p(c2423q, abstractC19687c);
            }
        } else {
            c2422p = new C2422p(c2423q, abstractC19687c);
        }
        Object objInvoke = c2422p.f7531o0;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c2422p.f7533q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objInvoke);
                AbstractC8160o6.m8726a(c2423q.f7534a, "Executing " + str, null, 6);
                c2422p.f7529Y = c2423q;
                c2422p.f7530Z = str;
                c2422p.f7533q0 = 1;
                objInvoke = interfaceC1439n.invoke(abstractC13819d, c2422p);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c2422p.f7530Z;
                c2423q = c2422p.f7529Y;
                AbstractC9233X.m9807c(objInvoke);
            }
            AbstractC8160o6.m8726a(c2423q.f7534a, "Successfully executed " + str, null, 6);
            return objInvoke;
        } catch (Throwable th2) {
            AbstractC8160o6.m8727b(c2423q.f7534a, AbstractC10763a.m11054l("CompleteConversationQueries ", str, " encountered error"), th2, 4);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m3579d(String str, AbstractC19687c abstractC19687c) {
        C3516e c3516e = AbstractC0593T.f1824a;
        Object objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2409c(this, str, null), abstractC19687c);
        return objM1168P == EnumC19250a.f61036Y ? objM1168P : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3580e(boolean z6, C2018a c2018a) {
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2416j(this, null, z6), c2018a);
    }
}
