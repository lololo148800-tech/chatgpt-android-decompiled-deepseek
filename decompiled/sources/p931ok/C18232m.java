package p931ok;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ok.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18232m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ThemeableLottieAnimationView f58085Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f58086Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18232m(ThemeableLottieAnimationView themeableLottieAnimationView, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58085Y = themeableLottieAnimationView;
        this.f58086Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18232m(this.f58085Y, this.f58086Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18232m c18232m = (C18232m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18232m.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f58085Y.m13146h(this.f58086Z);
        return C17296C.f55119a;
    }
}
