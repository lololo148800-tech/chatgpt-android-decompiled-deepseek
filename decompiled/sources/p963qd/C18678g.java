package p963qd;

import com.openai.feature.conversationdetails.impl.ConversationDetailsViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: qd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18678g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59457Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationDetailsViewModel f59458Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18678g(ConversationDetailsViewModel conversationDetailsViewModel, int i10) {
        super(0);
        this.f59457Y = i10;
        this.f59458Z = conversationDetailsViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f59457Y) {
            case 0:
                this.f59458Z.m14395k(new C18676e(false));
                break;
            case 1:
                this.f59458Z.m14395k(C18674c.f59454a);
                break;
            case 2:
                this.f59458Z.m14395k(new C18676e(true));
                break;
            default:
                this.f59458Z.m14395k(C18675d.f59455a);
                break;
        }
        return C17296C.f55119a;
    }
}
