package p878lo;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21690f;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9233X;
import p758g0.C13744U;
import p773h0.EnumC14284g0;
import p858ko.C16484C;
import p858ko.C16521x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C17098g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54640Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17100i f54641Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f54642o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17098g(C17100i c17100i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54641Z = c17100i;
        this.f54642o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17098g(this.f54641Z, this.f54642o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17098g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54640Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17100i c17100i = this.f54641Z;
            C16484C c16484c = c17100i.f54651z0;
            InterfaceC7537b interfaceC7537b = AbstractC21690f.m22217v(c17100i).f68633D0;
            long j10 = this.f54642o0;
            long jM8536b = AbstractC8088f6.m8536b(interfaceC7537b.mo7864b0(Float.intBitsToFloat((int) (j10 >> 32))), interfaceC7537b.mo7864b0(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            C13744U c13744u = new C13744U(0);
            this.f54640Y = 1;
            Object objM12542I0 = c16484c.f51149p.m12542I0(EnumC14284g0.f44822Z, new C16521x(jM8536b, c13744u, null), this);
            if (objM12542I0 != enumC19250a) {
                objM12542I0 = c17296c;
            }
            if (objM12542I0 == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
