package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {389}, m20658m = "showCode-Xin9Z_4")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$showCode$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38633Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38634Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessagesViewModelImpl f38635o0;

    /* JADX INFO: renamed from: p0 */
    public int f38636p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$showCode$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38635o0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38634Z = obj;
        this.f38636p0 |= Integer.MIN_VALUE;
        return this.f38635o0.m14305y(null, this);
    }
}
