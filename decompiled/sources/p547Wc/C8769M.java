package p547Wc;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p860l0.C16782u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8769M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26742Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f26743Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8769M(C16782u c16782u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26743Z = c16782u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8769M(this.f26743Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8769M) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26742Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC8776U enumC8776U = EnumC8776U.f26769Y;
            this.f26742Y = 1;
            if (AbstractC10840a.m11219e(this.f26743Z, enumC8776U, this) == enumC19250a) {
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
