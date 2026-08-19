package p556Wk;

import il.AbstractC15037b;
import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p754fl.InterfaceC13692b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C8941w extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27337Y;

    /* JADX INFO: renamed from: Z */
    public int f27338Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f27339o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Throwable f27340p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f27341q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8941w(List list, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f27337Y = i10;
        this.f27341q0 = list;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC13692b interfaceC13692b = (InterfaceC13692b) obj;
        Throwable th2 = (Throwable) obj2;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f27337Y) {
            case 0:
                C8941w c8941w = new C8941w(this.f27341q0, interfaceC18770c, 0);
                c8941w.f27339o0 = interfaceC13692b;
                c8941w.f27340p0 = th2;
                return c8941w.invokeSuspend(C17296C.f55119a);
            default:
                C8941w c8941w2 = new C8941w(this.f27341q0, interfaceC18770c, 1);
                c8941w2.f27339o0 = interfaceC13692b;
                c8941w2.f27340p0 = th2;
                return c8941w2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27337Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f27338Z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f27339o0;
                    AbstractC9233X.m9807c(obj);
                    return th2;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC13692b interfaceC13692b = (InterfaceC13692b) this.f27339o0;
                Throwable thM16170b = AbstractC15037b.m16170b(this.f27340p0);
                this.f27339o0 = thM16170b;
                this.f27338Z = 1;
                AbstractC8887A.m9557a(this.f27341q0, thM16170b, interfaceC13692b, this);
                return C17296C.f55119a == enumC19250a ? enumC19250a : thM16170b;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f27338Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.f27339o0;
                    AbstractC9233X.m9807c(obj);
                    return th3;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC13692b interfaceC13692b2 = (InterfaceC13692b) this.f27339o0;
                Throwable thM16170b2 = AbstractC15037b.m16170b(this.f27340p0);
                this.f27339o0 = thM16170b2;
                this.f27338Z = 1;
                AbstractC8887A.m9557a(this.f27341q0, thM16170b2, interfaceC13692b2, this);
                return C17296C.f55119a == enumC19250a2 ? enumC19250a2 : thM16170b2;
        }
    }
}
