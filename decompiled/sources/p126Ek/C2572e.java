package p126Ek;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ek.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2572e extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f8001Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2574g f8002Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2572e(C2574g c2574g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f8002Z = c2574g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2572e(this.f8002Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2572e) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8001Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2574g c2574g = this.f8002Z;
            InterfaceC2568a interfaceC2568a = (InterfaceC2568a) c2574g.f8008c;
            this.f8001Y = 1;
            obj = interfaceC2568a.m3606a((String) c2574g.f8009d, this);
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
