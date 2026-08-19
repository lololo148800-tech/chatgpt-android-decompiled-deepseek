package p870le;

import com.openai.feature.messages.MessagesViewModel;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p926of.C18158V;

/* JADX INFO: renamed from: le.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C16901q extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54271Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModel f54272Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14111x0 f54273o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16901q(MessagesViewModel messagesViewModel, C14111x0 c14111x0, int i10) {
        super(0);
        this.f54271Y = i10;
        this.f54272Z = messagesViewModel;
        this.f54273o0 = c14111x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54271Y) {
            case 0:
                this.f54272Z.m14395k(new C18158V(this.f54273o0.f44409g0));
                break;
            default:
                this.f54272Z.m14395k(new C18158V(this.f54273o0.f44409g0));
                break;
        }
        return C17296C.f55119a;
    }
}
