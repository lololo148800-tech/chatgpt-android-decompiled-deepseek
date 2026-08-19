package p1000s0;

import java.util.Collection;
import mm.C17296C;
import p001A.C0042V0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p482Tg.C7443a0;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9388w4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p594Y9.C9895g4;
import p758g0.InterfaceC13772l;
import p759g1.C13800b;
import p773h0.EnumC14284g0;
import p784hb.C14438g;
import p858ko.C16482A;
import p860l0.C16696N;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16736e1;
import p894n0.C17407m;
import p909nm.AbstractC17680n;
import p936p0.C18275o;
import p953q0.AbstractC18551I;
import p953q0.C18561T;
import p953q0.C18563V;
import p953q0.C18566Y;
import p953q0.C18572c;
import p953q0.InterfaceC18565X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19397F implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: A */
    public final InterfaceC5985X f61432A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC5985X f61433B;

    /* JADX INFO: renamed from: C */
    public final C6002f0 f61434C;

    /* JADX INFO: renamed from: D */
    public final C6002f0 f61435D;

    /* JADX INFO: renamed from: E */
    public final C6002f0 f61436E;

    /* JADX INFO: renamed from: F */
    public final C6002f0 f61437F;

    /* JADX INFO: renamed from: a */
    public final C6002f0 f61438a;

    /* JADX INFO: renamed from: b */
    public final C9895g4 f61439b;

    /* JADX INFO: renamed from: c */
    public final C0042V0 f61440c;

    /* JADX INFO: renamed from: d */
    public int f61441d;

    /* JADX INFO: renamed from: e */
    public int f61442e;

    /* JADX INFO: renamed from: f */
    public long f61443f;

    /* JADX INFO: renamed from: g */
    public long f61444g;

    /* JADX INFO: renamed from: h */
    public float f61445h;

    /* JADX INFO: renamed from: i */
    public float f61446i;

    /* JADX INFO: renamed from: j */
    public final C16696N f61447j;

    /* JADX INFO: renamed from: k */
    public final boolean f61448k;

    /* JADX INFO: renamed from: l */
    public int f61449l;

    /* JADX INFO: renamed from: m */
    public InterfaceC18565X f61450m;

    /* JADX INFO: renamed from: n */
    public boolean f61451n;

    /* JADX INFO: renamed from: o */
    public final C6002f0 f61452o;

    /* JADX INFO: renamed from: p */
    public InterfaceC7537b f61453p;

    /* JADX INFO: renamed from: q */
    public final C17407m f61454q;

    /* JADX INFO: renamed from: r */
    public final C5996c0 f61455r;

    /* JADX INFO: renamed from: s */
    public final C5996c0 f61456s;

    /* JADX INFO: renamed from: t */
    public final C18566Y f61457t;

    /* JADX INFO: renamed from: u */
    public final C14438g f61458u;

    /* JADX INFO: renamed from: v */
    public final C18572c f61459v;

    /* JADX INFO: renamed from: w */
    public final C6002f0 f61460w;

    /* JADX INFO: renamed from: x */
    public final C18275o f61461x;

    /* JADX INFO: renamed from: y */
    public long f61462y;

    /* JADX INFO: renamed from: z */
    public final C18563V f61463z;

    public AbstractC19397F(int i10, float f10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        C13800b c13800b = new C13800b(0L);
        C5975S c5975s = C5975S.f19448r0;
        this.f61438a = C5997d.m6430Q(c13800b, c5975s);
        this.f61439b = new C9895g4(this);
        this.f61440c = new C0042V0(i10, f10, this);
        this.f61441d = i10;
        this.f61443f = Long.MAX_VALUE;
        this.f61447j = new C16696N(new C16482A(this, 22));
        this.f61448k = true;
        this.f61449l = -1;
        this.f61452o = C5997d.m6430Q(AbstractC19402K.f61475b, C5975S.f19445o0);
        this.f61453p = AbstractC19402K.f61476c;
        this.f61454q = new C17407m();
        this.f61455r = C5997d.m6429P(-1);
        this.f61456s = C5997d.m6429P(i10);
        C5997d.m6422I(new C19396E(this, 0), c5975s);
        C5997d.m6422I(new C19396E(this, 1), c5975s);
        this.f61457t = new C18566Y(null, null);
        this.f61458u = new C14438g(8);
        this.f61459v = new C18572c();
        this.f61460w = C5997d.m6430Q(null, c5975s);
        this.f61461x = new C18275o(this, 2);
        this.f61462y = AbstractC9388w4.m9959b(0, 0, 15);
        this.f61463z = new C18563V();
        this.f61432A = AbstractC18551I.m19927h();
        this.f61433B = AbstractC18551I.m19927h();
        Boolean bool = Boolean.FALSE;
        this.f61434C = C5997d.m6430Q(bool, c5975s);
        this.f61435D = C5997d.m6430Q(bool, c5975s);
        this.f61436E = C5997d.m6430Q(bool, c5975s);
        this.f61437F = C5997d.m6430Q(bool, c5975s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public static Object m20493r(AbstractC19397F abstractC19397F, EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C19394C c19394c;
        if (abstractC19687c instanceof C19394C) {
            c19394c = (C19394C) abstractC19687c;
            int i10 = c19394c.f61425r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19394c.f61425r0 = i10 - Integer.MIN_VALUE;
            } else {
                c19394c = new C19394C(abstractC19397F, abstractC19687c);
            }
        } else {
            c19394c = new C19394C(abstractC19397F, abstractC19687c);
        }
        Object obj = c19394c.f61423p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19394c.f61425r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC1439n = c19394c.f61422o0;
                enumC14284g0 = c19394c.f61421Z;
                abstractC19397F = c19394c.f61420Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC19397F = c19394c.f61420Y;
                AbstractC9233X.m9807c(obj);
            }
            abstractC19397F.f61455r.m6413h(-1);
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        c19394c.f61420Y = abstractC19397F;
        c19394c.f61421Z = enumC14284g0;
        c19394c.f61422o0 = interfaceC1439n;
        c19394c.f61425r0 = 1;
        Object objM19944a = abstractC19397F.f61459v.m19944a(c19394c);
        if (objM19944a != enumC19250a) {
            objM19944a = c17296c;
        }
        if (objM19944a == enumC19250a) {
            return enumC19250a;
        }
        if (!abstractC19397F.f61447j.mo5255a()) {
            abstractC19397F.f61456s.m6413h(abstractC19397F.m20498j());
        }
        c19394c.f61420Y = abstractC19397F;
        c19394c.f61421Z = null;
        c19394c.f61422o0 = null;
        c19394c.f61425r0 = 2;
        if (abstractC19397F.f61447j.mo5256b(enumC14284g0, interfaceC1439n, c19394c) == enumC19250a) {
            return enumC19250a;
        }
        abstractC19397F.f61455r.m6413h(-1);
        return c17296c;
    }

    /* JADX INFO: renamed from: s */
    public static Object m20494s(C19408d c19408d, int i10, AbstractC19694j abstractC19694j) {
        c19408d.getClass();
        Object objMo5256b = c19408d.mo5256b(EnumC14284g0.f44821Y, new C19395D(c19408d, 0.0f, i10, null), abstractC19694j);
        return objMo5256b == EnumC19250a.f61036Y ? objMo5256b : C17296C.f55119a;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return this.f61447j.mo5255a();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        return m20493r(this, enumC14284g0, interfaceC1439n, abstractC19687c);
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: c */
    public final boolean mo5257c() {
        return ((Boolean) this.f61435D.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: d */
    public final boolean mo5258d() {
        return ((Boolean) this.f61434C.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return this.f61447j.mo5259e(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: f */
    public final Object m20495f(int i10, float f10, InterfaceC13772l interfaceC13772l, AbstractC19687c abstractC19687c) {
        C19393B c19393b;
        AbstractC19397F abstractC19397F;
        InterfaceC13772l interfaceC13772l2;
        int i11 = i10;
        float f11 = f10;
        if (abstractC19687c instanceof C19393B) {
            c19393b = (C19393B) abstractC19687c;
            int i12 = c19393b.f61419s0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c19393b.f61419s0 = i12 - Integer.MIN_VALUE;
            } else {
                c19393b = new C19393B(this, abstractC19687c);
            }
        } else {
            c19393b = new C19393B(this, abstractC19687c);
        }
        Object obj = c19393b.f61417q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i13 = c19393b.f61419s0;
        C17296C c17296c = C17296C.f55119a;
        if (i13 != 0) {
            if (i13 == 1) {
                float f12 = c19393b.f61416p0;
                int i14 = c19393b.f61415o0;
                InterfaceC13772l interfaceC13772l3 = c19393b.f61414Z;
                abstractC19397F = c19393b.f61413Y;
                AbstractC9233X.m9807c(obj);
                interfaceC13772l2 = interfaceC13772l3;
                f11 = f12;
                i11 = i14;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        if ((i11 == m20498j() && ((C5994b0) this.f61440c.f207p0).m6409g() == f11) || mo20500l() == 0) {
            return c17296c;
        }
        c19393b.f61413Y = this;
        c19393b.f61414Z = interfaceC13772l;
        c19393b.f61415o0 = i11;
        c19393b.f61416p0 = f11;
        c19393b.f61419s0 = 1;
        Object objM19944a = this.f61459v.m19944a(c19393b);
        if (objM19944a != enumC19250a) {
            objM19944a = c17296c;
        }
        if (objM19944a == enumC19250a) {
            return enumC19250a;
        }
        abstractC19397F = this;
        interfaceC13772l2 = interfaceC13772l;
        double d10 = f11;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
        int iM20497i = abstractC19397F.m20497i(i11);
        float fM20502n = f11 * abstractC19397F.m20502n();
        C7443a0 c7443a0 = new C7443a0(abstractC19397F, 28);
        c19393b.f61413Y = null;
        c19393b.f61414Z = null;
        c19393b.f61419s0 = 2;
        float f13 = AbstractC19402K.f61474a;
        C9895g4 c9895g4 = abstractC19397F.f61439b;
        Object objMo5256b = ((AbstractC19397F) c9895g4.f29409Y).mo5256b(EnumC14284g0.f44821Y, new C19400I(c7443a0, iM20497i, c9895g4, fM20502n, interfaceC13772l2, null), c19393b);
        if (objMo5256b != enumC19250a) {
            objMo5256b = c17296c;
        }
        if (objMo5256b != enumC19250a) {
            objMo5256b = c17296c;
        }
        return objMo5256b == enumC19250a ? enumC19250a : c17296c;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m20496h(C19429y c19429y, boolean z6) {
        C0042V0 c0042v0 = this.f61440c;
        boolean z10 = true;
        if (z6) {
            ((C5994b0) c0042v0.f207p0).m6410h(c19429y.f61608l);
        } else {
            c0042v0.getClass();
            C19414j c19414j = c19429y.f61607k;
            c0042v0.f208q0 = c19414j != null ? c19414j.f61525e : null;
            boolean z11 = c0042v0.f204Y;
            ?? r6 = c19429y.f61597a;
            if (z11 || !((Collection) r6).isEmpty()) {
                c0042v0.f204Y = true;
                int i10 = c19414j != null ? c19414j.f61521a : 0;
                float f10 = c19429y.f61608l;
                ((C5996c0) c0042v0.f206o0).m6413h(i10);
                ((C18561T) c0042v0.f209r0).m19939c(i10);
                ((C5994b0) c0042v0.f207p0).m6410h(f10);
            }
            if (this.f61449l != -1 && !((Collection) r6).isEmpty()) {
                boolean z12 = this.f61451n;
                int i11 = c19429y.f61605i;
                if (this.f61449l != (z12 ? ((C19414j) AbstractC17680n.m19351a0(r6)).f61521a + i11 + 1 : (((C19414j) AbstractC17680n.m19341Q(r6)).f61521a - i11) - 1)) {
                    this.f61449l = -1;
                    InterfaceC18565X interfaceC18565X = this.f61450m;
                    if (interfaceC18565X != null) {
                        interfaceC18565X.cancel();
                    }
                    this.f61450m = null;
                }
            }
        }
        this.f61452o.setValue(c19429y);
        this.f61434C.setValue(Boolean.valueOf(c19429y.f61610n));
        C19414j c19414j2 = c19429y.f61606j;
        if ((c19414j2 != null ? c19414j2.f61521a : 0) == 0 && c19429y.f61609m == 0) {
            z10 = false;
        }
        this.f61435D.setValue(Boolean.valueOf(z10));
        if (c19414j2 != null) {
            this.f61441d = c19414j2.f61521a;
        }
        this.f61442e = c19429y.f61609m;
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            if (Math.abs(this.f61446i) > 0.5f && this.f61448k && m20504p(this.f61446i)) {
                m20505q(this.f61446i, c19429y);
            }
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            this.f61443f = AbstractC19402K.m20507a(c19429y, mo20500l());
            int iMo20500l = mo20500l();
            EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
            EnumC16673F0 enumC16673F1 = c19429y.f61601e;
            long jM20511d = c19429y.m20511d();
            int i12 = (int) (enumC16673F1 == enumC16673F0 ? jM20511d >> 32 : jM20511d & 4294967295L);
            this.f61444g = AbstractC8301I.m8921l(c19429y.f61611o.mo18903a(i12, c19429y.f61598b, -c19429y.f61602f, c19429y.f61600d, 0, iMo20500l), 0, i12);
        } catch (Throwable th2) {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m20497i(int i10) {
        if (mo20500l() > 0) {
            return AbstractC8301I.m8921l(i10, 0, mo20500l() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m20498j() {
        return ((C5996c0) this.f61440c.f206o0).m6412g();
    }

    /* JADX INFO: renamed from: k */
    public final C19429y m20499k() {
        return (C19429y) this.f61452o.getValue();
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo20500l();

    /* JADX INFO: renamed from: m */
    public final int m20501m() {
        return ((C19429y) this.f61452o.getValue()).f61598b;
    }

    /* JADX INFO: renamed from: n */
    public final int m20502n() {
        return ((C19429y) this.f61452o.getValue()).f61599c + m20501m();
    }

    /* JADX INFO: renamed from: o */
    public final long m20503o() {
        return ((C13800b) this.f61438a.getValue()).f43584a;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20504p(float f10) {
        if (m20499k().f61601e != EnumC16673F0.f53401Y ? Math.signum(f10) != Math.signum(-C13800b.m15306g(m20503o())) : Math.signum(f10) != Math.signum(-C13800b.m15307h(m20503o()))) {
            if (((int) C13800b.m15306g(m20503o())) != 0 || ((int) C13800b.m15307h(m20503o())) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: q */
    public final void m20505q(float f10, C19429y c19429y) {
        InterfaceC18565X interfaceC18565X;
        InterfaceC18565X interfaceC18565X2;
        InterfaceC18565X interfaceC18565X3;
        if (this.f61448k) {
            ?? r6 = c19429y.f61597a;
            if (((Collection) r6).isEmpty()) {
                return;
            }
            boolean z6 = f10 > 0.0f;
            int i10 = c19429y.f61605i;
            int i11 = z6 ? ((C19414j) AbstractC17680n.m19351a0(r6)).f61521a + i10 + 1 : (((C19414j) AbstractC17680n.m19341Q(r6)).f61521a - i10) - 1;
            if (i11 < 0 || i11 >= mo20500l()) {
                return;
            }
            if (i11 != this.f61449l) {
                if (this.f61451n != z6 && (interfaceC18565X3 = this.f61450m) != null) {
                    interfaceC18565X3.cancel();
                }
                this.f61451n = z6;
                this.f61449l = i11;
                this.f61450m = this.f61457t.m19943a(i11, this.f61462y);
            }
            if (z6) {
                if ((((C19414j) AbstractC17680n.m19351a0(r6)).f61533m + (c19429y.f61598b + c19429y.f61599c)) - c19429y.f61603g >= f10 || (interfaceC18565X2 = this.f61450m) == null) {
                    return;
                }
                interfaceC18565X2.mo19942a();
                return;
            }
            if (c19429y.f61602f - ((C19414j) AbstractC17680n.m19341Q(r6)).f61533m >= (-f10) || (interfaceC18565X = this.f61450m) == null) {
                return;
            }
            interfaceC18565X.mo19942a();
        }
    }
}
