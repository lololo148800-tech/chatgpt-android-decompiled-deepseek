package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {348}, m20658m = "copy")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$copy$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public InterfaceC20904w f38503Y;

    /* JADX INFO: renamed from: Z */
    public C20857C f38504Z;

    /* JADX INFO: renamed from: o0 */
    public String f38505o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38506p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessagesViewModelImpl f38507q0;

    /* JADX INFO: renamed from: r0 */
    public int f38508r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$copy$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38507q0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38506p0 = obj;
        this.f38508r0 |= Integer.MIN_VALUE;
        return MessagesViewModelImpl.m14294n(this.f38507q0, null, this);
    }
}
