package com.openai.feature.conversationhistory.impl.move;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.move.ConversationMoveViewModelImpl", m20656f = "ConversationMoveViewModelImpl.kt", m20657l = {56}, m20658m = "handleConfirmMove-gtZx9g0")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ConversationMoveViewModelImpl$handleConfirmMove$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ConversationMoveViewModelImpl f37518Y;

    /* JADX INFO: renamed from: Z */
    public String f37519Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37520o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ConversationMoveViewModelImpl f37521p0;

    /* JADX INFO: renamed from: q0 */
    public int f37522q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMoveViewModelImpl$handleConfirmMove$1(ConversationMoveViewModelImpl conversationMoveViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37521p0 = conversationMoveViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37520o0 = obj;
        this.f37522q0 |= Integer.MIN_VALUE;
        return ConversationMoveViewModelImpl.m14245n(this.f37521p0, null, null, this);
    }
}
