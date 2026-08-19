package p179H0;

import p003A1.C0292u;
import p1001s1.InterfaceC19431a;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3193k implements InterfaceC19431a {

    /* JADX INFO: renamed from: Y */
    public final C0292u f9629Y;

    /* JADX INFO: renamed from: Z */
    public final C3191i f9630Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f9631o0;

    public C3193k(C0292u c0292u, C3191i c3191i, boolean z6) {
        this.f9629Y = c0292u;
        this.f9630Z = c3191i;
        this.f9631o0 = z6;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final long mo4038K(int i10, long j10) {
        if (!this.f9631o0 || !AbstractC8226x0.m8860a(i10, 1) || C13800b.m15307h(j10) >= 0.0f) {
            return 0L;
        }
        return AbstractC8088f6.m8536b(0.0f, ((Number) this.f9629Y.invoke(Float.valueOf(C13800b.m15307h(j10)))).floatValue());
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        return new C7550o(0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        C3192j c3192j;
        if (interfaceC18770c instanceof C3192j) {
            c3192j = (C3192j) interfaceC18770c;
            int i10 = c3192j.f9628o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3192j.f9628o0 = i10 - Integer.MIN_VALUE;
            } else {
                c3192j = new C3192j(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c3192j = new C3192j(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objInvoke = c3192j.f9626Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3192j.f9628o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            Float f10 = new Float(C7550o.m7903d(j10));
            c3192j.f9628o0 = 1;
            objInvoke = this.f9630Z.invoke(f10, c3192j);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objInvoke);
        }
        return new C7550o(AbstractC9125E4.m9659a(0.0f, ((Number) objInvoke).floatValue()));
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        if (!this.f9631o0 || !AbstractC8226x0.m8860a(i10, 1) || C13800b.m15307h(j11) <= 0.0f) {
            return 0L;
        }
        return AbstractC8088f6.m8536b(0.0f, ((Number) this.f9629Y.invoke(Float.valueOf(C13800b.m15307h(j11)))).floatValue());
    }
}
