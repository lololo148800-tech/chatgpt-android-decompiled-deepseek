package p577Xf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p341Ni.C5784h0;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Xf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9503b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f28614Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9504c f28615Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7351f0 f28616o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9503b(C9504c c9504c, C7351f0 c7351f0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f28615Z = c9504c;
        this.f28616o0 = c7351f0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C9503b(this.f28615Z, this.f28616o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9503b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f28614Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5784h0 c5784h0 = (C5784h0) this.f28615Z.f28620d.getValue();
            this.f28614Y = 1;
            if (c5784h0.m6180m(this.f28616o0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
