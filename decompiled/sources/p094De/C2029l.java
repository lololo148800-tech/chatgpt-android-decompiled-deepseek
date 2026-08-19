package p094De;

import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2134H;
import p103Dn.C2153Q0;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p120Ee.C2412f;
import p120Ee.C2420n;
import p120Ee.C2423q;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: De.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C2029l {

    /* JADX INFO: renamed from: a */
    public final C2423q f6228a;

    /* JADX INFO: renamed from: b */
    public final C3430e f6229b = AbstractC8168p6.m8749b("ConversationCache", "Conversation");

    /* JADX INFO: renamed from: c */
    public final C17314q f6230c;

    /* JADX INFO: renamed from: d */
    public final C2153Q0 f6231d;

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f6232e;

    public C2029l(C2423q c2423q, InterfaceC13849E interfaceC13849E, C17627a c17627a) {
        this.f6228a = c2423q;
        this.f6230c = AbstractC9227W.m9800c(new C2021d(interfaceC13849E, 0));
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17690x.f56481Y);
        this.f6231d = c2153q0M3204c;
        this.f6232e = c2153q0M3204c;
        AbstractC0575H.m1156D(c17627a, null, null, new C2018a(this, null), 3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3172a(C2029l c2029l, C6636i c6636i) {
        C2153Q0 c2153q0 = c2029l.f6231d;
        c2153q0.m3251l(null, AbstractC17659D.m19249k((Map) c2153q0.getValue(), new C17309l(new C22011h0(c6636i.f21379a), c6636i)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m3173b(C6636i c6636i, AbstractC19687c abstractC19687c) {
        C2019b c2019b;
        C2029l c2029l;
        if (abstractC19687c instanceof C2019b) {
            c2019b = (C2019b) abstractC19687c;
            int i10 = c2019b.f6193q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2019b.f6193q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2019b = new C2019b(this, abstractC19687c);
            }
        } else {
            c2019b = new C2019b(this, abstractC19687c);
        }
        Object obj = c2019b.f6191o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2019b.f6193q0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6636i = c2019b.f6190Z;
            c2029l = c2019b.f6189Y;
            try {
                AbstractC9233X.m9807c(obj);
                C2153Q0 c2153q0 = c2029l.f6231d;
                c2153q0.m3251l(null, AbstractC17659D.m19245g((Map) c2153q0.getValue(), new C22011h0(c6636i.f21379a)));
                return new C21952P1(C17296C.f55119a);
            } catch (Exception e10) {
                e = e10;
                AbstractC8160o6.m8731f(c2029l.f6229b, "Delete exception", e, null, 4);
                return new C21945N1(e);
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            C2423q c2423q = this.f6228a;
            String str = c6636i.f21379a;
            c2019b.f6189Y = this;
            c2019b.f6190Z = c6636i;
            c2019b.f6193q0 = 1;
            if (c2423q.m3579d(str, c2019b) == enumC19250a) {
                return enumC19250a;
            }
            c2029l = this;
            C2153Q0 c2153q1 = c2029l.f6231d;
            c2153q1.m3251l(null, AbstractC17659D.m19245g((Map) c2153q1.getValue(), new C22011h0(c6636i.f21379a)));
            return new C21952P1(C17296C.f55119a);
        } catch (Exception e11) {
            e = e11;
            c2029l = this;
            AbstractC8160o6.m8731f(c2029l.f6229b, "Delete exception", e, null, 4);
            return new C21945N1(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m3174c(AbstractC19687c abstractC19687c) throws Throwable {
        C2020c c2020c;
        C2029l c2029l;
        if (abstractC19687c instanceof C2020c) {
            c2020c = (C2020c) abstractC19687c;
            int i10 = c2020c.f6197p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2020c.f6197p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2020c = new C2020c(this, abstractC19687c);
            }
        } else {
            c2020c = new C2020c(this, abstractC19687c);
        }
        Object obj = c2020c.f6195Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2020c.f6197p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2029l = c2020c.f6194Y;
            try {
                AbstractC9233X.m9807c(obj);
                C2153Q0 c2153q0 = c2029l.f6231d;
                C17690x c17690x = C17690x.f56481Y;
                c2153q0.getClass();
                c2153q0.m3251l(null, c17690x);
                return new C21952P1(c17296c);
            } catch (Exception e10) {
                e = e10;
                AbstractC8160o6.m8731f(c2029l.f6229b, "DeleteAll exception", e, null, 4);
                return new C21945N1(e);
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            C2423q c2423q = this.f6228a;
            c2020c.f6194Y = this;
            c2020c.f6197p0 = 1;
            C3516e c3516e = AbstractC0593T.f1824a;
            Object objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2412f(c2423q, null), c2020c);
            if (objM1168P != enumC19250a) {
                objM1168P = c17296c;
            }
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
            c2029l = this;
            C2153Q0 c2153q1 = c2029l.f6231d;
            C17690x c17690x2 = C17690x.f56481Y;
            c2153q1.getClass();
            c2153q1.m3251l(null, c17690x2);
            return new C21952P1(c17296c);
        } catch (Exception e11) {
            e = e11;
            c2029l = this;
            AbstractC8160o6.m8731f(c2029l.f6229b, "DeleteAll exception", e, null, 4);
            return new C21945N1(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1970n m3175d(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        return new C1970n(AbstractC2124C.m3215n(new C2134H(new C2022e(this, conversationId, null), new C2025h(new C1970n(this.f6232e, 1, conversationId), 0))), 5, new C2023f(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5, types: [Dn.Q0, Qd.i, java.util.Map, qm.c] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: e */
    public final Object m3176e(C6636i c6636i, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C2028k c2028k;
        C6636i c6636iM7162a;
        C2029l c2029l;
        C2028k c2028k2;
        Map map;
        C2153Q0 c2153q0;
        boolean z10;
        Object obj;
        C2029l c2029l2;
        String str;
        int i10;
        Map mapM19249k;
        String str2;
        C6636i c6636i2;
        C6636i c6636i3 = c6636i;
        if (abstractC19687c instanceof C2028k) {
            c2028k = (C2028k) abstractC19687c;
            int i11 = c2028k.f6227u0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2028k.f6227u0 = i11 - Integer.MIN_VALUE;
            } else {
                c2028k = new C2028k(this, abstractC19687c);
            }
        } else {
            c2028k = new C2028k(this, abstractC19687c);
        }
        C2028k c2028k3 = c2028k;
        Object obj2 = c2028k3.f6225s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c2028k3.f6227u0;
        ?? r11 = 0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj2);
            C2153Q0 c2153q1 = this.f6231d;
            Map map2 = (Map) c2153q1.getValue();
            C6636i c6636iM7162a2 = (C6636i) map2.get(new C22011h0(c6636i3.f21379a));
            if (c6636iM7162a2 == null || c6636iM7162a2.f21382d.compareTo(c6636i3.f21382d) <= 0 || c6636iM7162a2.m7165d().compareTo(c6636i.m7165d()) <= 0 || c6636iM7162a2.f21399u.f20815c <= c6636i3.f21399u.f20815c) {
                Map map3 = c6636iM7162a2 != null ? c6636iM7162a2.f21385g : null;
                if (map3 == null) {
                    map3 = C17690x.f56481Y;
                }
                c6636iM7162a2 = C6636i.m7162a(c6636i, null, null, null, null, null, AbstractC17659D.m19248j(c6636i3.f21385g, map3), null, null, null, null, null, null, false, null, null, 2097087);
            }
            String str3 = c6636iM7162a2.f21380b;
            if (str3 == null || AbstractC16544l.m18089b(c6636iM7162a2.f21379a, str3)) {
                c6636iM7162a = c6636iM7162a2;
            } else {
                Collection<C6397h> collectionValues = c6636iM7162a2.f21399u.f20814b.values();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionValues, 10));
                for (C6397h c6397h : collectionValues) {
                    arrayList.add(C6397h.m7033a(c6397h, null, null, null, C7351f0.m7781a((C7351f0) c6397h.f20822d, str3, null, null, null, null, false, false, -5, 511), 7));
                }
                c6636iM7162a = C6636i.m7162a(c6636iM7162a2, str3, null, null, null, null, null, null, null, null, null, null, null, false, null, new C6394e(arrayList, str3), 1048574);
            }
            String str4 = c6636iM7162a.f21379a;
            String str5 = c6636i3.f21379a;
            if (AbstractC16544l.m18089b(str4, str5)) {
                z10 = z6;
                c2153q0 = c2153q1;
                str = "Update exception";
                obj = enumC19250a;
                c2028k2 = c2028k3;
                i10 = 4;
                r11 = 0;
                mapM19249k = AbstractC17659D.m19249k(map2, new C17309l(new C22011h0(str4), c6636iM7162a));
                c2029l2 = this;
            } else {
                try {
                    C2423q c2423q = this.f6228a;
                    c2028k2 = c2028k3;
                    c2028k2.f6219Y = this;
                    c2028k2.f6220Z = c6636i3;
                    map = map2;
                    c2028k2.f6221o0 = map;
                    c2028k2.f6222p0 = c6636iM7162a;
                    c2153q0 = c2153q1;
                    c2028k2.f6223q0 = c2153q0;
                    z10 = z6;
                    c2028k2.f6224r0 = z10;
                    c2028k2.f6227u0 = 1;
                    Object objM3579d = c2423q.m3579d(str5, c2028k2);
                    obj = enumC19250a;
                    if (objM3579d == obj) {
                        return obj;
                    }
                    c2029l2 = this;
                    mapM19249k = AbstractC17659D.m19249k(AbstractC17659D.m19245g(map, new C22011h0(c6636i3.f21379a)), new C17309l(new C22011h0(c6636iM7162a.f21379a), c6636iM7162a));
                    str = str2;
                    i10 = 4;
                    r11 = 0;
                } catch (Exception e10) {
                    e = e10;
                    c2029l = this;
                    AbstractC8160o6.m8731f(c2029l.f6229b, str2, e, null, 4);
                    return new C21945N1(e);
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6636i2 = c2028k3.f6220Z;
                c2029l2 = c2028k3.f6219Y;
                try {
                    AbstractC9233X.m9807c(obj2);
                    c6636iM7162a = c6636i2;
                    return new C21952P1(new C22011h0(c6636iM7162a.f21379a));
                } catch (Exception e11) {
                    e = e11;
                    i10 = 4;
                    str = "Update exception";
                    AbstractC8160o6.m8731f(c2029l2.f6229b, str, e, r11, i10);
                    return new C21945N1(e);
                }
            }
            boolean z11 = c2028k3.f6224r0;
            C2153Q0 c2153q2 = c2028k3.f6223q0;
            c6636iM7162a = c2028k3.f6222p0;
            map = c2028k3.f6221o0;
            C6636i c6636i4 = c2028k3.f6220Z;
            c2029l = c2028k3.f6219Y;
            try {
                AbstractC9233X.m9807c(obj2);
                str2 = "Update exception";
                obj = enumC19250a;
                z10 = z11;
                c6636i3 = c6636i4;
                c2153q0 = c2153q2;
                c2028k2 = c2028k3;
                c2029l2 = c2029l;
                mapM19249k = AbstractC17659D.m19249k(AbstractC17659D.m19245g(map, new C22011h0(c6636i3.f21379a)), new C17309l(new C22011h0(c6636iM7162a.f21379a), c6636iM7162a));
                str = str2;
                i10 = 4;
                r11 = 0;
            } catch (Exception e12) {
                e = e12;
                str2 = "Update exception";
                AbstractC8160o6.m8731f(c2029l.f6229b, str2, e, null, 4);
                return new C21945N1(e);
            }
        }
        c2153q0.setValue(mapM19249k);
        if (z10 && !c6636iM7162a.f21397s) {
            try {
                C2423q c2423q2 = c2029l2.f6228a;
                c2028k2.f6219Y = c2029l2;
                c2028k2.f6220Z = c6636iM7162a;
                c2028k2.f6221o0 = r11;
                c2028k2.f6222p0 = r11;
                c2028k2.f6223q0 = r11;
                c2028k2.f6227u0 = 2;
                C3516e c3516e = AbstractC0593T.f1824a;
                Object objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2420n(c2423q2, c6636iM7162a, r11), c2028k2);
                if (objM1168P != EnumC19250a.f61036Y) {
                    objM1168P = C17296C.f55119a;
                }
                if (objM1168P == obj) {
                    return obj;
                }
                c6636i2 = c6636iM7162a;
                c6636iM7162a = c6636i2;
            } catch (Exception e13) {
                e = e13;
                AbstractC8160o6.m8731f(c2029l2.f6229b, str, e, r11, i10);
                return new C21945N1(e);
            }
        }
        return new C21952P1(new C22011h0(c6636iM7162a.f21379a));
    }
}
