package p364Oh;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p432Rh.C6888a;
import p571X9.AbstractC9233X;
import p658b5.C11241l;
import p917o6.InterfaceC17838F;
import p917o6.InterfaceC17842J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Oh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6234h extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f20301Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6888a f20302Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17838F f20303o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6234h(C6888a c6888a, InterfaceC17838F interfaceC17838F, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f20302Z = c6888a;
        this.f20303o0 = interfaceC17838F;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C6234h(this.f20302Z, this.f20303o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C6234h) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f20301Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11241l c11241l = new C11241l(this.f20302Z.f22080a, (InterfaceC17842J) this.f20303o0);
            this.f20301Y = 1;
            obj = c11241l.m12591L(c11241l.m12593N(), this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
