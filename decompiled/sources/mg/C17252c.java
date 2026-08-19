package mg;

import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17614e;
import ng.C17615f;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: mg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17252c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55041Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyEmailCodeViewModel f55042Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17252c(VerifyEmailCodeViewModel verifyEmailCodeViewModel, int i10) {
        super(0);
        this.f55041Y = i10;
        this.f55042Z = verifyEmailCodeViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f55041Y) {
            case 0:
                this.f55042Z.m14395k(C17615f.f56373a);
                break;
            default:
                this.f55042Z.m14395k(C17614e.f56372a);
                break;
        }
        return C17296C.f55119a;
    }
}
