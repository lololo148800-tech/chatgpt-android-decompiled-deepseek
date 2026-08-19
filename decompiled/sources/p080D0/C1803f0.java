package p080D0;

import android.view.ActionMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p003A1.C0195P;
import p003A1.C0256i;
import p003A1.C0278p0;
import p003A1.C0283r;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0303x1;
import p017Af.C0485p;
import p1071w0.EnumC20729S;
import p1095x1.InterfaceC21098s;
import p138F8.vJO.vRJidSveZHcTw;
import p204I1.C3578I;
import p204I1.C3587c;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8088f6;
import p530Vi.AbstractC8301I;
import p692d0.AbstractC12974m;
import p692d0.AbstractC12975n;
import p692d0.C12984w;
import p692d0.C12985x;
import p737f1.C13522n;
import p759g1.C13800b;
import p759g1.C13801c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;

/* JADX INFO: renamed from: D0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803f0 {

    /* JADX INFO: renamed from: a */
    public final C1821o0 f5178a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f5179b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f5180c;

    /* JADX INFO: renamed from: d */
    public AbstractC16546n f5181d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18285a f5182e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0172H0 f5183f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0303x1 f5184g;

    /* JADX INFO: renamed from: h */
    public final C13522n f5185h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f5186i;

    /* JADX INFO: renamed from: j */
    public C13800b f5187j;

    /* JADX INFO: renamed from: k */
    public InterfaceC21098s f5188k;

    /* JADX INFO: renamed from: l */
    public final C6002f0 f5189l;

    /* JADX INFO: renamed from: m */
    public final C6002f0 f5190m;

    /* JADX INFO: renamed from: n */
    public final C6002f0 f5191n;

    /* JADX INFO: renamed from: o */
    public final C6002f0 f5192o;

    /* JADX INFO: renamed from: p */
    public final C6002f0 f5193p;

    /* JADX INFO: renamed from: q */
    public final C6002f0 f5194q;

    /* JADX INFO: renamed from: r */
    public InterfaceC1784S f5195r;

    /* JADX INFO: renamed from: s */
    public boolean f5196s;

    public C1803f0(C1821o0 c1821o0) {
        this.f5178a = c1821o0;
        C5975S c5975s = C5975S.f19448r0;
        this.f5179b = C5997d.m6430Q(null, c5975s);
        this.f5180c = C5997d.m6430Q(Boolean.TRUE, c5975s);
        this.f5181d = new C1842z(this, 8);
        this.f5185h = new C13522n();
        this.f5186i = C5997d.m6430Q(Boolean.FALSE, c5975s);
        this.f5189l = C5997d.m6430Q(new C13800b(0L), c5975s);
        this.f5190m = C5997d.m6430Q(new C13800b(0L), c5975s);
        this.f5191n = C5997d.m6430Q(null, c5975s);
        this.f5192o = C5997d.m6430Q(null, c5975s);
        this.f5193p = C5997d.m6430Q(null, c5975s);
        this.f5194q = C5997d.m6430Q(null, c5975s);
        c1821o0.f5246e = new C1842z(this, 1);
        c1821o0.f5247f = new C0485p(this, 1);
        c1821o0.f5248g = new C1795b0(this);
        c1821o0.f5249h = new C1840y(this, 2);
        c1821o0.f5250i = new C1842z(this, 2);
        c1821o0.f5251j = new C1842z(this, 3);
    }

    /* JADX INFO: renamed from: a */
    public static final long m2589a(C1803f0 c1803f0, InterfaceC21098s interfaceC21098s, long j10) {
        InterfaceC21098s interfaceC21098s2 = c1803f0.f5188k;
        if (interfaceC21098s2 == null || !interfaceC21098s2.mo21522h()) {
            return 9205357640488583168L;
        }
        return c1803f0.m2598j().mo21521e(interfaceC21098s, j10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX INFO: renamed from: b */
    public final void m2590b() {
        C3590f c3590fM4297i;
        InterfaceC0172H0 interfaceC0172H0;
        if (m2593e() != null) {
            C1821o0 c1821o0 = this.f5178a;
            if (c1821o0.m2648a().f41225e == 0) {
                c3590fM4297i = null;
            } else {
                C3587c c3587c = new C3587c();
                ArrayList arrayListM2650c = c1821o0.m2650c(m2598j());
                int size = arrayListM2650c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1816m c1816m = (C1816m) arrayListM2650c.get(i10);
                    C1824q c1824q = (C1824q) c1821o0.m2648a().m14712e(c1816m.f5227a);
                    if (c1824q != null) {
                        C3590f c3590fM2645d = c1816m.m2645d();
                        boolean z6 = c1824q.f5259c;
                        C1822p c1822p = c1824q.f5257a;
                        C1822p c1822p2 = c1824q.f5258b;
                        c3587c.m4290b(z6 ? c3590fM2645d.subSequence(c1822p2.f5254b, c1822p.f5254b) : c3590fM2645d.subSequence(c1822p.f5254b, c1822p2.f5254b));
                    }
                }
                c3590fM4297i = c3587c.m4297i();
            }
        } else {
            c3590fM4297i = null;
        }
        if (c3590fM4297i != null) {
            C3590f c3590f = c3590fM4297i.f10934Y.length() > 0 ? c3590fM4297i : null;
            if (c3590f == null || (interfaceC0172H0 = this.f5183f) == null) {
                return;
            }
            ((C0256i) interfaceC0172H0).m827c(c3590f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final EnumC20729S m2591c() {
        return (EnumC20729S) this.f5193p.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2592d() {
        return ((Boolean) this.f5186i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final C1824q m2593e() {
        return (C1824q) this.f5179b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2594f() {
        C1824q c1824q;
        InterfaceC21098s interfaceC21098sM2598j = m2598j();
        C1821o0 c1821o0 = this.f5178a;
        ArrayList arrayListM2650c = c1821o0.m2650c(interfaceC21098sM2598j);
        if (arrayListM2650c.isEmpty()) {
            return true;
        }
        int size = arrayListM2650c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1816m c1816m = (C1816m) arrayListM2650c.get(i10);
            C3590f c3590fM2645d = c1816m.m2645d();
            if (c3590fM2645d.f10934Y.length() != 0 && ((c1824q = (C1824q) c1821o0.m2648a().m14712e(c1816m.f5227a)) == null || Math.abs(c1824q.f5257a.f5254b - c1824q.f5258b.f5254b) != c3590fM2645d.f10934Y.length())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2595g() {
        return ((Boolean) this.f5180c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2596h() {
        C1824q c1824qM2593e = m2593e();
        if (c1824qM2593e == null) {
            return false;
        }
        C1822p c1822p = c1824qM2593e.f5257a;
        C1822p c1822p2 = c1824qM2593e.f5258b;
        if (AbstractC16544l.m18089b(c1822p, c1822p2)) {
            return false;
        }
        if (c1822p.f5255c == c1822p2.f5255c) {
            return true;
        }
        InterfaceC21098s interfaceC21098sM2598j = m2598j();
        C1821o0 c1821o0 = this.f5178a;
        ArrayList arrayListM2650c = c1821o0.m2650c(interfaceC21098sM2598j);
        int size = arrayListM2650c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1824q c1824q = (C1824q) c1821o0.m2648a().m14712e(((C1816m) arrayListM2650c.get(i10)).f5227a);
            if (c1824q != null && c1824q.f5257a.f5254b != c1824q.f5258b.f5254b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: i */
    public final void m2597i() {
        InterfaceC18285a interfaceC18285a;
        C12985x c12985x = AbstractC12975n.f41185a;
        AbstractC16544l.m18092e(c12985x, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f5178a.f5252k.setValue(c12985x);
        this.f5196s = false;
        m2604p();
        if (m2593e() != null) {
            this.f5181d.invoke(null);
            if (!m2595g() || (interfaceC18285a = this.f5182e) == null) {
                return;
            }
            ((C18286b) interfaceC18285a).m19828a(9);
        }
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC21098s m2598j() {
        InterfaceC21098s interfaceC21098s = this.f5188k;
        if (interfaceC21098s == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if (interfaceC21098s.mo21522h()) {
            return interfaceC21098s;
        }
        throw new IllegalArgumentException("unattached coordinates");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: k */
    public final void m2599k() {
        C1824q c1824q;
        InterfaceC21098s interfaceC21098sM2598j = m2598j();
        C1821o0 c1821o0 = this.f5178a;
        ArrayList arrayListM2650c = c1821o0.m2650c(interfaceC21098sM2598j);
        if (arrayListM2650c.isEmpty()) {
            return;
        }
        C12985x c12985x = AbstractC12975n.f41185a;
        C12985x c12985x2 = new C12985x();
        int size = arrayListM2650c.size();
        int i10 = 0;
        C1824q c1824q2 = null;
        C1824q c1824q3 = null;
        while (i10 < size) {
            C1816m c1816m = (C1816m) arrayListM2650c.get(i10);
            C3578I c3578i = (C3578I) c1816m.f5229c.invoke();
            long j10 = c1816m.f5227a;
            if (c3578i == null) {
                c1824q = null;
            } else {
                int length = c3578i.f10892a.f10882a.f10934Y.length();
                c1824q = new C1824q(new C1822p(c3578i.m4251a(0), 0, j10), new C1822p(c3578i.m4251a(Math.max(length - 1, 0)), length, j10), false);
            }
            if (c1824q != null) {
                if (c1824q2 == null) {
                    c1824q2 = c1824q;
                }
                int iM14710c = c12985x2.m14710c(j10);
                Object[] objArr = c12985x2.f41223c;
                Object obj = objArr[iM14710c];
                c12985x2.f41222b[iM14710c] = j10;
                objArr[iM14710c] = c1824q;
                c1824q3 = c1824q;
            }
            i10++;
            arrayListM2650c = arrayListM2650c;
        }
        if (c12985x2.f41225e == 0) {
            return;
        }
        if (c1824q2 != c1824q3) {
            AbstractC16544l.m18091d(c1824q2);
            AbstractC16544l.m18091d(c1824q3);
            c1824q2 = new C1824q(c1824q2.f5257a, c1824q3.f5258b, false);
        }
        c1821o0.f5252k.setValue(c12985x2);
        this.f5181d.invoke(c1824q2);
        this.f5195r = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m2600l(boolean z6) {
        C6002f0 c6002f0 = this.f5180c;
        if (((Boolean) c6002f0.getValue()).booleanValue() != z6) {
            c6002f0.setValue(Boolean.valueOf(z6));
            m2604p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2601m(C1824q c1824q) {
        this.f5179b.setValue(c1824q);
        if (c1824q != null) {
            m2602n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX INFO: renamed from: n */
    public final void m2602n() {
        C13800b c13800b;
        C1822p c1822p;
        C1822p c1822p2;
        C1824q c1824qM2593e = m2593e();
        InterfaceC21098s interfaceC21098s = this.f5188k;
        C1821o0 c1821o0 = this.f5178a;
        C13800b c13800b2 = null;
        C1816m c1816m = (c1824qM2593e == null || (c1822p2 = c1824qM2593e.f5257a) == null) ? null : (C1816m) c1821o0.f5244c.m14712e(c1822p2.f5255c);
        C1816m c1816m2 = (c1824qM2593e == null || (c1822p = c1824qM2593e.f5258b) == null) ? null : (C1816m) c1821o0.f5244c.m14712e(c1822p.f5255c);
        InterfaceC21098s interfaceC21098sM2644c = c1816m != null ? c1816m.m2644c() : null;
        InterfaceC21098s interfaceC21098sM2644c2 = c1816m2 != null ? c1816m2.m2644c() : null;
        C6002f0 c6002f0 = this.f5192o;
        C6002f0 c6002f1 = this.f5191n;
        if (c1824qM2593e == null || interfaceC21098s == null || !interfaceC21098s.mo21522h() || (interfaceC21098sM2644c == null && interfaceC21098sM2644c2 == null)) {
            c6002f1.setValue(null);
            c6002f0.setValue(null);
            return;
        }
        C13801c c13801cM2611F = AbstractC1807h0.m2611F(interfaceC21098s);
        if (interfaceC21098sM2644c != null) {
            long jM2642a = c1816m.m2642a(c1824qM2593e, true);
            if (AbstractC8088f6.m8539e(jM2642a)) {
                c13800b = null;
            } else {
                long jMo21521e = interfaceC21098s.mo21521e(interfaceC21098sM2644c, jM2642a);
                c13800b = new C13800b(jMo21521e);
                if (m2591c() != EnumC20729S.f65725Z && !AbstractC1807h0.m2631t(jMo21521e, c13801cM2611F)) {
                    c13800b = null;
                }
            }
        } else {
            c13800b = null;
        }
        c6002f1.setValue(c13800b);
        if (interfaceC21098sM2644c2 != null) {
            long jM2642a2 = c1816m2.m2642a(c1824qM2593e, false);
            if (!AbstractC8088f6.m8539e(jM2642a2)) {
                long jMo21521e2 = interfaceC21098s.mo21521e(interfaceC21098sM2644c2, jM2642a2);
                C13800b c13800b3 = new C13800b(jMo21521e2);
                if (m2591c() == EnumC20729S.f65726o0 || AbstractC1807h0.m2631t(jMo21521e2, c13801cM2611F)) {
                    c13800b2 = c13800b3;
                }
            }
        }
        c6002f0.setValue(c13800b2);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: o */
    public final boolean m2603o(long j10, long j11, boolean z6, C1826r c1826r) {
        ArrayList arrayList;
        InterfaceC1784S c1829s0;
        C1821o0 c1821o0;
        C3578I c3578i;
        int iM2629r;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C1822p c1822p;
        int i16;
        C1822p c1822p2;
        int i17;
        int i18 = 2;
        int i19 = 1;
        this.f5193p.setValue(z6 ? EnumC20729S.f65725Z : EnumC20729S.f65726o0);
        this.f5194q.setValue(new C13800b(j10));
        InterfaceC21098s interfaceC21098sM2598j = m2598j();
        C1821o0 c1821o1 = this.f5178a;
        ArrayList arrayListM2650c = c1821o1.m2650c(interfaceC21098sM2598j);
        int i20 = AbstractC12974m.f41184a;
        C12984w c12984w = new C12984w(6);
        int size = arrayListM2650c.size();
        for (int i21 = 0; i21 < size; i21++) {
            c12984w.m14707d(i21, ((C1816m) arrayListM2650c.get(i21)).f5227a);
        }
        C1785T c1785t = new C1785T(j10, j11, interfaceC21098sM2598j, z6, AbstractC8088f6.m8539e(j11) ? null : m2593e(), new C0195P(c12984w, i18));
        int size2 = arrayListM2650c.size();
        int i22 = 0;
        while (true) {
            arrayList = c1785t.f5114h;
            if (i22 >= size2) {
                break;
            }
            C1816m c1816m = (C1816m) arrayListM2650c.get(i22);
            InterfaceC21098s interfaceC21098sM2644c = c1816m.m2644c();
            if (interfaceC21098sM2644c == null || (c3578i = (C3578I) c1816m.f5229c.invoke()) == null) {
                i17 = i19;
                i22 = i22;
                i16 = i18;
            } else {
                long jMo21521e = c1785t.f5109c.mo21521e(interfaceC21098sM2644c, 0L);
                long jM15310k = C13800b.m15310k(c1785t.f5107a, jMo21521e);
                long j12 = c1785t.f5108b;
                long jM15310k2 = AbstractC8088f6.m8539e(j12) ? 9205357640488583168L : C13800b.m15310k(j12, jMo21521e);
                long j13 = c3578i.f10894c;
                long j14 = jM15310k2;
                float f10 = (int) (4294967295L & j13);
                int i23 = 3;
                int i24 = C13800b.m15306g(jM15310k) < 0.0f ? 1 : C13800b.m15306g(jM15310k) > ((int) (j13 >> 32)) ? 3 : 2;
                if (C13800b.m15307h(jM15310k) < 0.0f) {
                    i23 = 1;
                } else if (C13800b.m15307h(jM15310k) <= f10) {
                    i23 = 2;
                }
                boolean z10 = c1785t.f5110d;
                long j15 = c1816m.f5227a;
                C1824q c1824q = c1785t.f5111e;
                if (z10) {
                    iM2629r = AbstractC1807h0.m2629r(i24, i23, c1785t, j15, c1824q != null ? c1824q.f5258b : null);
                    i13 = i24;
                    i12 = i23;
                    i10 = iM2629r;
                    i11 = i10;
                } else {
                    iM2629r = AbstractC1807h0.m2629r(i24, i23, c1785t, j15, c1824q != null ? c1824q.f5257a : null);
                    i10 = i24;
                    i11 = i23;
                    i12 = iM2629r;
                    i13 = i12;
                }
                int iM2610E = AbstractC1807h0.m2610E(i24, i23);
                if (iM2610E == 2 || iM2610E != iM2629r) {
                    int length = c3578i.f10892a.f10882a.f10934Y.length();
                    C0195P c0195p = c1785t.f5112f;
                    if (z10) {
                        int iM2636y = AbstractC1807h0.m2636y(jM15310k, c3578i);
                        if (c1824q == null || (c1822p2 = c1824q.f5258b) == null) {
                            length = iM2636y;
                        } else {
                            int iCompare = c0195p.compare(Long.valueOf(c1822p2.f5255c), Long.valueOf(j15));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = c1822p2.f5254b;
                            }
                        }
                        i15 = length;
                        i14 = iM2636y;
                    } else {
                        int iM2636y2 = AbstractC1807h0.m2636y(jM15310k, c3578i);
                        if (c1824q == null || (c1822p = c1824q.f5257a) == null) {
                            length = iM2636y2;
                        } else {
                            int iCompare2 = c0195p.compare(Long.valueOf(c1822p.f5255c), Long.valueOf(j15));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = c1822p.f5254b;
                            }
                        }
                        i14 = length;
                        i15 = iM2636y2;
                    }
                    int iM2636y3 = AbstractC8088f6.m8539e(j14) ? -1 : AbstractC1807h0.m2636y(j14, c3578i);
                    i16 = 2;
                    int i25 = c1785t.f5117k + 2;
                    c1785t.f5117k = i25;
                    C1820o c1820o = new C1820o(j15, i25, i14, i15, iM2636y3, c3578i);
                    c1785t.f5115i = c1785t.m2586a(c1785t.f5115i, i13, i12);
                    c1785t.f5116j = c1785t.m2586a(c1785t.f5116j, i10, i11);
                    c1785t.f5113g.m14707d(arrayList.size(), j15);
                    arrayList.add(c1820o);
                } else {
                    i16 = 2;
                }
                i17 = 1;
            }
            i22++;
            size2 = size2;
            arrayListM2650c = arrayListM2650c;
            i18 = i16;
            c1821o1 = c1821o1;
            i19 = i17;
        }
        int i26 = i19;
        C1821o0 c1821o2 = c1821o1;
        int i27 = c1785t.f5117k + i26;
        int size3 = arrayList.size();
        if (size3 == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size3 != i26) {
            int i28 = c1785t.f5115i;
            int i29 = i28 == -1 ? i27 : i28;
            int i30 = c1785t.f5116j;
            c1829s0 = new C1814l(c1785t.f5113g, arrayList, i29, i30 == -1 ? i27 : i30, c1785t.f5110d, c1785t.f5111e);
        } else {
            C1820o c1820o2 = (C1820o) AbstractC17680n.m19365o0(arrayList);
            int i31 = c1785t.f5115i;
            int i32 = i31 == -1 ? i27 : i31;
            int i33 = c1785t.f5116j;
            c1829s0 = new C1829s0(c1785t.f5110d, i32, i33 == -1 ? i27 : i33, c1785t.f5111e, c1820o2);
        }
        if (!c1829s0.mo2578f(this.f5195r)) {
            return false;
        }
        C1824q c1824qM2654a = c1826r.m2654a(c1829s0);
        if (!AbstractC16544l.m18089b(c1824qM2654a, m2593e())) {
            if (m2595g()) {
                c1821o0 = c1821o2;
                ArrayList arrayList2 = c1821o0.f5243b;
                int size4 = arrayList2.size();
                for (int i34 = 0; i34 < size4; i34++) {
                    if (((C1816m) arrayList2.get(i34)).m2645d().f10934Y.length() > 0) {
                        InterfaceC18285a interfaceC18285a = this.f5182e;
                        if (interfaceC18285a == null) {
                            break;
                        }
                        ((C18286b) interfaceC18285a).m19828a(9);
                        break;
                    }
                }
            } else {
                c1821o0 = c1821o2;
            }
            c1821o0.f5252k.setValue(c1829s0.mo2583k(c1824qM2654a));
            this.f5181d.invoke(c1824qM2654a);
        }
        this.f5195r = c1829s0;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX INFO: renamed from: p */
    public final void m2604p() {
        InterfaceC0303x1 interfaceC0303x1;
        InterfaceC21098s interfaceC21098s;
        List list;
        InterfaceC0303x1 interfaceC0303x2;
        C13801c c13801c;
        C13801c c13801c2;
        C13801c c13801c3;
        List list2;
        boolean z6;
        int[] iArr;
        C1816m c1816m;
        C13801c c13801c4;
        C13801c c13801cM4252b;
        C13801c c13801cM15314b;
        boolean z10 = false;
        int i10 = 1;
        if (m2592d() && (interfaceC0303x1 = this.f5184g) != null) {
            if (!this.f5196s || !m2595g()) {
                C0278p0 c0278p0 = (C0278p0) interfaceC0303x1;
                if (c0278p0.f1010d == 1) {
                    c0278p0.f1010d = 2;
                    ActionMode actionMode = c0278p0.f1008b;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    c0278p0.f1008b = null;
                    return;
                }
                return;
            }
            if (m2593e() == null || (interfaceC21098s = this.f5188k) == null || !interfaceC21098s.mo21522h()) {
                interfaceC0303x2 = interfaceC0303x1;
                c13801cM15314b = null;
            } else {
                InterfaceC21098s interfaceC21098sM2598j = m2598j();
                C1821o0 c1821o0 = this.f5178a;
                ArrayList arrayListM2650c = c1821o0.m2650c(interfaceC21098sM2598j);
                ArrayList arrayList = new ArrayList(arrayListM2650c.size());
                int size = arrayListM2650c.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C1816m c1816m2 = (C1816m) arrayListM2650c.get(i11);
                    C1824q c1824q = (C1824q) c1821o0.m2648a().m14712e(c1816m2.f5227a);
                    C17309l c17309l = c1824q != null ? new C17309l(c1816m2, c1824q) : null;
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                int size2 = arrayList.size();
                List listM19382k = arrayList;
                listM19382k = arrayList;
                if (size2 != 0 && size2 != 1) {
                    listM19382k = AbstractC17681o.m19382k(AbstractC17680n.m19341Q(arrayList), AbstractC17680n.m19351a0(arrayList));
                }
                if (listM19382k.isEmpty()) {
                    interfaceC0303x2 = interfaceC0303x1;
                } else {
                    boolean zIsEmpty = listM19382k.isEmpty();
                    C13801c c13801c5 = AbstractC1807h0.f5201a;
                    if (zIsEmpty) {
                        c13801c = c13801c5;
                        c13801c2 = c13801c;
                        interfaceC0303x2 = interfaceC0303x1;
                    } else {
                        int size3 = listM19382k.size();
                        int i12 = 0;
                        float fMax = Float.NEGATIVE_INFINITY;
                        float fMin = Float.POSITIVE_INFINITY;
                        float fMin2 = Float.POSITIVE_INFINITY;
                        float fMax2 = Float.NEGATIVE_INFINITY;
                        while (i12 < size3) {
                            C17309l c17309l2 = (C17309l) list.get(i12);
                            C1816m c1816m3 = (C1816m) c17309l2.f55136Y;
                            C1824q c1824q2 = (C1824q) c17309l2.f55137Z;
                            int i13 = c1824q2.f5257a.f5254b;
                            int i14 = c1824q2.f5258b.f5254b;
                            if (i13 != i14) {
                                InterfaceC21098s interfaceC21098sM2644c = c1816m3.m2644c();
                                if (interfaceC21098sM2644c == null) {
                                    list = listM19382k;
                                    c13801c3 = c13801c5;
                                    list2 = list;
                                    z6 = false;
                                } else {
                                    int iMin = Math.min(i13, i14);
                                    int iMax = Math.max(i13, i14) - i10;
                                    if (iMin == iMax) {
                                        list = listM19382k;
                                        iArr = new int[i10];
                                        iArr[0] = iMin;
                                    } else {
                                        list = listM19382k;
                                        iArr = new int[]{iMin, iMax};
                                    }
                                    int length = iArr.length;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    int i15 = 0;
                                    while (i15 < length) {
                                        int i16 = length;
                                        int i17 = iArr[i15];
                                        int[] iArr2 = iArr;
                                        C3578I c3578i = (C3578I) c1816m3.f5229c.invoke();
                                        C13801c c13801c6 = C13801c.f43585e;
                                        if (c3578i == null) {
                                            c13801c4 = c13801c5;
                                            c1816m = c1816m3;
                                        } else {
                                            c1816m = c1816m3;
                                            int length2 = c3578i.f10892a.f10882a.f10934Y.length();
                                            c13801c4 = c13801c5;
                                            if (length2 >= 1) {
                                                c13801cM4252b = c3578i.m4252b(AbstractC8301I.m8921l(i17, 0, length2 - 1));
                                            }
                                            fMin3 = Math.min(fMin3, c13801cM4252b.f43586a);
                                            fMin4 = Math.min(fMin4, c13801cM4252b.f43587b);
                                            fMax3 = Math.max(fMax3, c13801cM4252b.f43588c);
                                            fMax4 = Math.max(fMax4, c13801cM4252b.f43589d);
                                            i15++;
                                            length = i16;
                                            iArr = iArr2;
                                            c1816m3 = c1816m;
                                            c13801c5 = c13801c4;
                                        }
                                        c13801cM4252b = c13801c6;
                                        fMin3 = Math.min(fMin3, c13801cM4252b.f43586a);
                                        fMin4 = Math.min(fMin4, c13801cM4252b.f43587b);
                                        fMax3 = Math.max(fMax3, c13801cM4252b.f43588c);
                                        fMax4 = Math.max(fMax4, c13801cM4252b.f43589d);
                                        i15++;
                                        length = i16;
                                        iArr = iArr2;
                                        c1816m3 = c1816m;
                                        c13801c5 = c13801c4;
                                    }
                                    c13801c3 = c13801c5;
                                    z6 = false;
                                    long jM8536b = AbstractC8088f6.m8536b(fMin3, fMin4);
                                    long jM8536b2 = AbstractC8088f6.m8536b(fMax3, fMax4);
                                    long jMo21521e = interfaceC21098s.mo21521e(interfaceC21098sM2644c, jM8536b);
                                    long jMo21521e2 = interfaceC21098s.mo21521e(interfaceC21098sM2644c, jM8536b2);
                                    fMin = Math.min(fMin, C13800b.m15306g(jMo21521e));
                                    fMin2 = Math.min(fMin2, C13800b.m15307h(jMo21521e));
                                    fMax2 = Math.max(fMax2, C13800b.m15306g(jMo21521e2));
                                    fMax = Math.max(fMax, C13800b.m15307h(jMo21521e2));
                                    list2 = list;
                                }
                            } else {
                                list = listM19382k;
                                c13801c3 = c13801c5;
                                list2 = list;
                                z6 = z10;
                            }
                            i12++;
                            i10 = 1;
                            z10 = z6;
                            size3 = size3;
                            list = list2;
                            interfaceC0303x1 = interfaceC0303x1;
                            c13801c5 = c13801c3;
                        }
                        list = listM19382k;
                        interfaceC0303x2 = interfaceC0303x1;
                        c13801c = new C13801c(fMin, fMin2, fMax2, fMax);
                        c13801c2 = c13801c5;
                    }
                    if (!c13801c.equals(c13801c2)) {
                        C13801c c13801cM15322i = AbstractC1807h0.m2611F(interfaceC21098s).m15322i(c13801c);
                        if (c13801cM15322i.m15321h() >= 0.0f && c13801cM15322i.m15318e() >= 0.0f) {
                            C13801c c13801cM15326m = c13801cM15322i.m15326m(interfaceC21098s.mo21517D(0L));
                            c13801cM15314b = C13801c.m15314b(c13801cM15326m, 0.0f, 0.0f, (AbstractC1783Q.f5105b * 4) + c13801cM15326m.f43589d, 7);
                        }
                    }
                }
                c13801cM15314b = null;
            }
            if (c13801cM15314b == null) {
                return;
            }
            ((C0278p0) interfaceC0303x2).m863a(c13801cM15314b, m2596h() ? new C0283r(0, this, C1803f0.class, "toolbarCopy", "toolbarCopy()V", 0, 3) : null, null, null, m2594f() ? null : new C0283r(0, this, C1803f0.class, "selectAll", vRJidSveZHcTw.pUNvtZkZS, 0, 4));
        }
    }
}
