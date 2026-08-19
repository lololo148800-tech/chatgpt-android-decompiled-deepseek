package p679ce;

import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import ge.C14108w;
import ge.C14110x;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ce.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11717h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35532Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationViewModel f35533Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11717h(ConversationViewModel conversationViewModel, int i10) {
        super(0);
        this.f35532Y = i10;
        this.f35533Z = conversationViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f35532Y) {
            case 0:
                this.f35533Z.m14395k(new C14110x());
                break;
            default:
                this.f35533Z.m14395k(C14108w.f44364a);
                break;
        }
        return C17296C.f55119a;
    }
}
