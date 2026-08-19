package p860l0;

import p1001s1.InterfaceC19431a;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16711U0 implements InterfaceC19431a {

    /* JADX INFO: renamed from: Y */
    public final C16757l1 f53534Y;

    /* JADX INFO: renamed from: Z */
    public boolean f53535Z;

    public C16711U0(C16757l1 c16757l1, boolean z6) {
        this.f53534Y = c16757l1;
        this.f53535Z = z6;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ long mo4038K(int i10, long j10) {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        C16709T0 c16709t0;
        long jM7904e;
        if (interfaceC18770c instanceof C16709T0) {
            c16709t0 = (C16709T0) interfaceC18770c;
            int i10 = c16709t0.f53529p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16709t0.f53529p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16709t0 = new C16709T0(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c16709t0 = new C16709T0(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM18532b = c16709t0.f53527Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16709t0.f53529p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18532b);
            if (this.f53535Z) {
                c16709t0.f53526Y = j11;
                c16709t0.f53529p0 = 1;
                objM18532b = this.f53534Y.m18532b(j11, c16709t0);
                if (objM18532b == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                jM7904e = 0;
            }
            return new C7550o(jM7904e);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = c16709t0.f53526Y;
        AbstractC9233X.m9807c(objM18532b);
        jM7904e = C7550o.m7904e(j11, ((C7550o) objM18532b).f23912a);
        return new C7550o(jM7904e);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        return new C7550o(0L);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        if (!this.f53535Z) {
            return 0L;
        }
        C16757l1 c16757l1 = this.f53534Y;
        if (c16757l1.f53757a.mo5255a()) {
            return 0L;
        }
        return c16757l1.m18537g(c16757l1.m18533c(c16757l1.f53757a.mo5259e(c16757l1.m18533c(c16757l1.m18536f(j11)))));
    }
}
