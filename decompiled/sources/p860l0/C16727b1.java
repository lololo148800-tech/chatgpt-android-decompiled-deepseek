package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16727b1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16733d1 f53611Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f53612o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f53613p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16727b1(C16733d1 c16733d1, float f10, float f11, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53611Z = c16733d1;
        this.f53612o0 = f10;
        this.f53613p0 = f11;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16727b1(this.f53611Z, this.f53612o0, this.f53613p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16727b1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53610Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16757l1 c16757l1 = this.f53611Z.f53650O0;
            long jM8536b = AbstractC8088f6.m8536b(this.f53612o0, this.f53613p0);
            this.f53610Y = 1;
            if (AbstractC10840a.m11217c(c16757l1, jM8536b, this) == enumC19250a) {
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
