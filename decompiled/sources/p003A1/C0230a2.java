package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0230a2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f863Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0238c2 f864Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230a2(C0238c2 c0238c2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f864Z = c0238c2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0230a2(this.f864Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0230a2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f863Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AndroidComposeView androidComposeView = this.f864Z.f882Y;
            this.f863Y = 1;
            Object objM12955a = androidComposeView.contentCaptureManager.m12955a(this);
            if (objM12955a != enumC19250a) {
                objM12955a = c17296c;
            }
            if (objM12955a == enumC19250a) {
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
