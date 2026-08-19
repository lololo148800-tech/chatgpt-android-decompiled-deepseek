package com.openai.feature.conversationhistory.impl.move;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl", m20656f = "ConversationMoveViewModelImpl.kt", m20657l = {69}, m20658m = "loadMoreProjects")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ConversationMoveViewModelImpl$loadMoreProjects$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ConversationMoveViewModelImpl f37526Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37527Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ConversationMoveViewModelImpl f37528o0;

    /* JADX INFO: renamed from: p0 */
    public int f37529p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMoveViewModelImpl$loadMoreProjects$1(ConversationMoveViewModelImpl conversationMoveViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37528o0 = conversationMoveViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37527Z = obj;
        this.f37529p0 |= Integer.MIN_VALUE;
        return ConversationMoveViewModelImpl.m14246o(this.f37528o0, null, this);
    }
}
