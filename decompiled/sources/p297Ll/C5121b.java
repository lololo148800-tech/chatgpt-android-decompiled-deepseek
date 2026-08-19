package p297Ll;

import io.livekit.android.room.C15102a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p273Kl.C4727J0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ll.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5121b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f16742Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f16743Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15102a f16744o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5121b(C4727J0 c4727j0, C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16743Z = c4727j0;
        this.f16744o0 = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5121b(this.f16743Z, this.f16744o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5121b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16742Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f16742Y = 1;
            if (AbstractC5127h.m5674a(this.f16743Z, this.f16744o0, this) == enumC19250a) {
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
