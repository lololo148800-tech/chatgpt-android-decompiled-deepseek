package p124Ei;

import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p229J0.C3880A3;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.i1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2517i1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f7818Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f7819Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f7820o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2517i1(C3880A3 c3880a3, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f7819Z = c3880a3;
        this.f7820o0 = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2517i1(this.f7819Z, this.f7820o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2517i1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7818Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f7818Y = 1;
            if (this.f7819Z.m4603c(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f7820o0.invoke();
        return C17296C.f55119a;
    }
}
