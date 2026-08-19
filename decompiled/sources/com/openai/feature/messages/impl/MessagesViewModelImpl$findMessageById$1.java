package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {536}, m20658m = "findMessageById-Xin9Z_4")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$findMessageById$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public String f38520Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38521Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessagesViewModelImpl f38522o0;

    /* JADX INFO: renamed from: p0 */
    public int f38523p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$findMessageById$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38522o0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38521Z = obj;
        this.f38523p0 |= Integer.MIN_VALUE;
        return this.f38522o0.m14302v(null, this);
    }
}
