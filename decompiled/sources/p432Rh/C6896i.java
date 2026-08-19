package p432Rh;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1149zc.AbstractC21864z;
import p571X9.AbstractC9233X;
import p905nd.C17589q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6896i extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f22105Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6900m f22106Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6896i(C6900m c6900m, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f22106Z = c6900m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C6896i(this.f22106Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C6896i) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22105Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC21864z abstractC21864z = (AbstractC21864z) this.f22106Z.f22116b.get();
            this.f22105Y = 1;
            Object objM19226l = ((C17589q) abstractC21864z).m19226l(this);
            if (objM19226l != enumC19250a) {
                objM19226l = c17296c;
            }
            if (objM19226l == enumC19250a) {
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
