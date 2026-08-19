package p273Kl;

import io.livekit.android.room.C15102a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9358r4;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4781k0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15587Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15102a f15588Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4781k0(C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15588Z = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4781k0(this.f15588Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4781k0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15587Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4756Y0 c4756y0 = this.f15588Z.f46957q;
            this.f15587Y = 1;
            if (AbstractC9358r4.m9948b(c4756y0, this) == enumC19250a) {
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
