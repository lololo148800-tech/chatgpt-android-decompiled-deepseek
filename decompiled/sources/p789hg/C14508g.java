package p789hg;

import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel;
import kg.C16406l;
import kg.C16407m;
import kg.C16408n;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: hg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14508g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45725Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyEmailLinkViewModel f45726Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14508g(VerifyEmailLinkViewModel verifyEmailLinkViewModel, int i10) {
        super(0);
        this.f45725Y = i10;
        this.f45726Z = verifyEmailLinkViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f45725Y) {
            case 0:
                this.f45726Z.m14395k(C16408n.f50933a);
                break;
            case 1:
                this.f45726Z.m14395k(C16406l.f50931a);
                break;
            default:
                this.f45726Z.m14395k(C16407m.f50932a);
                break;
        }
        return C17296C.f55119a;
    }
}
