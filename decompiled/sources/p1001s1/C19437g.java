package p1001s1;

import p025An.InterfaceC0571F;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21707n0;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10458p;
import p759g1.C13800b;
import p887m7.C17176b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19437g extends AbstractC10458p implements InterfaceC21707n0, InterfaceC19431a {

    /* JADX INFO: renamed from: A0 */
    public C19434d f61637A0;

    /* JADX INFO: renamed from: B0 */
    public final String f61638B0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC19431a f61639z0;

    public C19437g(InterfaceC19431a interfaceC19431a, C19434d c19434d) {
        this.f61639z0 = interfaceC19431a;
        this.f61637A0 = c19434d == null ? new C19434d() : c19434d;
        this.f61638B0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        C19434d c19434d = this.f61637A0;
        c19434d.f61623a = this;
        c19434d.f61624b = new C17176b(this, 18);
        c19434d.f61625c = m10935y0();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        C19434d c19434d = this.f61637A0;
        if (c19434d.f61623a == this) {
            c19434d.f61623a = null;
        }
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final long mo4038K(int i10, long j10) {
        boolean z6 = this.f30972y0;
        C19437g c19437g = null;
        if (z6 && z6) {
            c19437g = (C19437g) AbstractC21690f.m22206k(this);
        }
        long jMo4038K = c19437g != null ? c19437g.mo4038K(i10, j10) : 0L;
        return C13800b.m15311l(jMo4038K, this.f61639z0.mo4038K(i10, C13800b.m15310k(j10, jMo4038K)));
    }

    /* JADX INFO: renamed from: K0 */
    public final InterfaceC0571F m20515K0() {
        C19437g c19437g = this.f30972y0 ? (C19437g) AbstractC21690f.m22206k(this) : null;
        if (c19437g != null) {
            return c19437g.m20515K0();
        }
        InterfaceC0571F interfaceC0571F = this.f61637A0.f61625c;
        if (interfaceC0571F != null) {
            return interfaceC0571F;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        C19435e c19435e;
        long j12;
        long j13;
        C19437g c19437g;
        long j14;
        long j15;
        long j16;
        if (interfaceC18770c instanceof C19435e) {
            c19435e = (C19435e) interfaceC18770c;
            int i10 = c19435e.f61631r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19435e.f61631r0 = i10 - Integer.MIN_VALUE;
            } else {
                c19435e = new C19435e(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19435e = new C19435e(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objMo4039V = c19435e.f61629p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19435e.f61631r0;
        if (i11 != 0) {
            if (i11 == 1) {
                long j17 = c19435e.f61628o0;
                long j18 = c19435e.f61627Z;
                c19437g = c19435e.f61626Y;
                AbstractC9233X.m9807c(objMo4039V);
                j13 = j17;
                j12 = j18;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = c19435e.f61627Z;
                AbstractC9233X.m9807c(objMo4039V);
            }
            j15 = ((C7550o) objMo4039V).f23912a;
            j14 = j16;
            return new C7550o(C7550o.m7905f(j14, j15));
        }
        AbstractC9233X.m9807c(objMo4039V);
        InterfaceC19431a interfaceC19431a = this.f61639z0;
        c19435e.f61626Y = this;
        j12 = j10;
        c19435e.f61627Z = j12;
        j13 = j11;
        c19435e.f61628o0 = j13;
        c19435e.f61631r0 = 1;
        objMo4039V = interfaceC19431a.mo4039V(j10, j11, c19435e);
        if (objMo4039V == enumC19250a) {
            return enumC19250a;
        }
        c19437g = this;
        long j19 = ((C7550o) objMo4039V).f23912a;
        boolean z6 = c19437g.f30972y0;
        C19437g c19437g2 = (z6 && z6) ? (C19437g) AbstractC21690f.m22206k(c19437g) : null;
        if (c19437g2 != null) {
            long jM7905f = C7550o.m7905f(j12, j19);
            long jM7904e = C7550o.m7904e(j13, j19);
            c19435e.f61626Y = null;
            c19435e.f61627Z = j19;
            c19435e.f61631r0 = 2;
            objMo4039V = c19437g2.mo4039V(jM7905f, jM7904e, c19435e);
            if (objMo4039V == enumC19250a) {
                return enumC19250a;
            }
            j16 = j19;
            j15 = ((C7550o) objMo4039V).f23912a;
            j14 = j16;
        } else {
            j14 = j19;
            j15 = 0;
        }
        return new C7550o(C7550o.m7905f(j14, j15));
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final Object mo14727o() {
        return this.f61638B0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        C19436f c19436f;
        long j11;
        C19437g c19437g;
        long j12;
        if (interfaceC18770c instanceof C19436f) {
            c19436f = (C19436f) interfaceC18770c;
            int i10 = c19436f.f61636q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19436f.f61636q0 = i10 - Integer.MIN_VALUE;
            } else {
                c19436f = new C19436f(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19436f = new C19436f(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objMo4040p0 = c19436f.f61634o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19436f.f61636q0;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = c19436f.f61633Z;
                c19437g = c19436f.f61632Y;
                AbstractC9233X.m9807c(objMo4040p0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = c19436f.f61633Z;
                AbstractC9233X.m9807c(objMo4040p0);
            }
            return new C7550o(C7550o.m7905f(j12, ((C7550o) objMo4040p0).f23912a));
        }
        AbstractC9233X.m9807c(objMo4040p0);
        boolean z6 = this.f30972y0;
        C19437g c19437g2 = (z6 && z6) ? (C19437g) AbstractC21690f.m22206k(this) : null;
        if (c19437g2 != null) {
            c19436f.f61632Y = this;
            c19436f.f61633Z = j10;
            c19436f.f61636q0 = 1;
            objMo4040p0 = c19437g2.mo4040p0(j10, c19436f);
            if (objMo4040p0 == enumC19250a) {
                return enumC19250a;
            }
            c19437g = this;
        } else {
            j11 = 0;
            c19437g = this;
        }
        long j13 = j10;
        j12 = j11;
        InterfaceC19431a interfaceC19431a = c19437g.f61639z0;
        long jM7904e = C7550o.m7904e(j13, j12);
        c19436f.f61632Y = null;
        c19436f.f61633Z = j12;
        c19436f.f61636q0 = 2;
        objMo4040p0 = interfaceC19431a.mo4040p0(jM7904e, c19436f);
        if (objMo4040p0 == enumC19250a) {
            return enumC19250a;
        }
        return new C7550o(C7550o.m7905f(j12, ((C7550o) objMo4040p0).f23912a));
        j11 = ((C7550o) objMo4040p0).f23912a;
        long j14 = j10;
        j12 = j11;
        InterfaceC19431a interfaceC19431a2 = c19437g.f61639z0;
        long jM7904e2 = C7550o.m7904e(j14, j12);
        c19436f.f61632Y = null;
        c19436f.f61633Z = j12;
        c19436f.f61636q0 = 2;
        objMo4040p0 = interfaceC19431a2.mo4040p0(jM7904e2, c19436f);
        if (objMo4040p0 == enumC19250a) {
            return enumC19250a;
        }
        return new C7550o(C7550o.m7905f(j12, ((C7550o) objMo4040p0).f23912a));
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        long jMo4041x = this.f61639z0.mo4041x(j10, i10, j11);
        boolean z6 = this.f30972y0;
        C19437g c19437g = null;
        if (z6 && z6) {
            c19437g = (C19437g) AbstractC21690f.m22206k(this);
        }
        C19437g c19437g2 = c19437g;
        return C13800b.m15311l(jMo4041x, c19437g2 != null ? c19437g2.mo4041x(C13800b.m15311l(j10, jMo4041x), i10, C13800b.m15310k(j11, jMo4041x)) : 0L);
    }
}
