package p291Lf;

import cd.C11709i;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p316Mf.InterfaceC5346m;

/* JADX INFO: renamed from: Lf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5014k extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16364Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessageFeedbackViewModel f16365Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11709i f16366o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5014k(MessageFeedbackViewModel messageFeedbackViewModel, C11709i c11709i, int i10) {
        super(1);
        this.f16364Y = i10;
        this.f16365Z = messageFeedbackViewModel;
        this.f16366o0 = c11709i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f16364Y) {
            case 0:
                InterfaceC5346m action = (InterfaceC5346m) obj;
                AbstractC16544l.m18094g(action, "action");
                this.f16365Z.m14395k(action);
                this.f16366o0.m13031a();
                break;
            default:
                InterfaceC5346m action2 = (InterfaceC5346m) obj;
                AbstractC16544l.m18094g(action2, "action");
                this.f16365Z.m14395k(action2);
                this.f16366o0.m13031a();
                break;
        }
        return C17296C.f55119a;
    }
}
