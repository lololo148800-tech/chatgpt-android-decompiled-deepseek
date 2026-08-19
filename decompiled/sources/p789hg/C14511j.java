package p789hg;

import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import kg.C16414t;
import kg.C16415u;
import kg.C16416v;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: hg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14511j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45736Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyPhoneViewModel f45737Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14511j(VerifyPhoneViewModel verifyPhoneViewModel, int i10) {
        super(0);
        this.f45736Y = i10;
        this.f45737Z = verifyPhoneViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f45736Y) {
            case 0:
                this.f45737Z.m14395k(C16416v.f50943a);
                break;
            case 1:
                this.f45737Z.m14395k(C16415u.f50942a);
                break;
            default:
                this.f45737Z.m14395k(C16414t.f50941a);
                break;
        }
        return C17296C.f55119a;
    }
}
