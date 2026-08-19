package com.openai.feature.conversations.impl.conversation;

import ge.C14111x0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl", m20656f = "ConversationViewModel.kt", m20657l = {1066, 1074, 1074}, m20658m = "enterVoiceMode")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ConversationViewModelImpl$enterVoiceMode$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ConversationViewModelImpl f37719Y;

    /* JADX INFO: renamed from: Z */
    public C14111x0 f37720Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37721o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ConversationViewModelImpl f37722p0;

    /* JADX INFO: renamed from: q0 */
    public int f37723q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$enterVoiceMode$1(ConversationViewModelImpl conversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37722p0 = conversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37721o0 = obj;
        this.f37723q0 |= Integer.MIN_VALUE;
        return this.f37722p0.m14257t(this);
    }
}
