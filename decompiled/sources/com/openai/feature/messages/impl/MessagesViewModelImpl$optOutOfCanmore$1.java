package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p479Td.C7351f0;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {499, 526, 527}, m20658m = "optOutOfCanmore")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$optOutOfCanmore$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38617Y;

    /* JADX INFO: renamed from: Z */
    public C7351f0 f38618Z;

    /* JADX INFO: renamed from: o0 */
    public C7351f0 f38619o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38620p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessagesViewModelImpl f38621q0;

    /* JADX INFO: renamed from: r0 */
    public int f38622r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$optOutOfCanmore$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38621q0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38620p0 = obj;
        this.f38622r0 |= Integer.MIN_VALUE;
        return MessagesViewModelImpl.m14297q(this.f38621q0, this);
    }
}
