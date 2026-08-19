package com.openai.feature.conversations.impl.conversation;

import ge.C14078h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p853kd.C16366a;
import p853kd.C16368c;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationScreenKt$ConversationScreen$conversationViewModel$1$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lge/h;", "effect", "Lmm/C;", "invoke", "(Lge/h;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class C12259x4a8e5692 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16368c f37579Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractActivityC17375g f37580Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12259x4a8e5692(C16368c c16368c, AbstractActivityC17375g abstractActivityC17375g) {
        super(1);
        this.f37579Y = c16368c;
        this.f37580Z = abstractActivityC17375g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16368c c16368c;
        C14078h effect = (C14078h) obj;
        AbstractC16544l.m18094g(effect, "effect");
        if ((effect instanceof C14078h) && (c16368c = this.f37579Y) != null) {
            AbstractActivityC17375g activity = this.f37580Z;
            AbstractC16544l.m18094g(activity, "activity");
            if (c16368c.f50843d) {
                AbstractC0575H.m1156D(c16368c.f50840a, null, null, new C16366a(activity, c16368c, null), 3);
            }
        }
        return C17296C.f55119a;
    }
}
