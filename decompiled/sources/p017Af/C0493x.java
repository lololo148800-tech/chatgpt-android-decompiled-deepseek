package p017Af;

import com.openai.feature.messages.MessagesViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p926of.C18156T;

/* JADX INFO: renamed from: Af.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C0493x extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1611Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MessagesViewModel f1612Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f1613o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493x(MessagesViewModel messagesViewModel, String str, int i10) {
        super(0);
        this.f1611Y = i10;
        this.f1612Z = messagesViewModel;
        this.f1613o0 = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1611Y) {
            case 0:
                this.f1612Z.m14395k(new C18156T(this.f1613o0));
                break;
            default:
                this.f1612Z.m14395k(new C18156T(this.f1613o0));
                break;
        }
        return C17296C.f55119a;
    }
}
