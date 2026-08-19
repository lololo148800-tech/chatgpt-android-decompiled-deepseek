package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p040Bd.C0937I1;
import p1081wc.AbstractC20882b;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {478, 478}, m20658m = "logBrowseEvent-Q8xTQ0A")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$logBrowseEvent$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38534Y;

    /* JADX INFO: renamed from: Z */
    public C0937I1 f38535Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC20882b f38536o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38537p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessagesViewModelImpl f38538q0;

    /* JADX INFO: renamed from: r0 */
    public int f38539r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$logBrowseEvent$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38538q0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38537p0 = obj;
        this.f38539r0 |= Integer.MIN_VALUE;
        return this.f38538q0.m14304x(null, null, null, this);
    }
}
