package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p040Bd.C0937I1;
import p1081wc.AbstractC20882b;
import p403Qd.AbstractC6659u;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {485}, m20658m = "logBrowseEvent")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$logBrowseEvent$3 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38540Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6659u f38541Z;

    /* JADX INFO: renamed from: o0 */
    public C0937I1 f38542o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC20882b f38543p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f38544q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ MessagesViewModelImpl f38545r0;

    /* JADX INFO: renamed from: s0 */
    public int f38546s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$logBrowseEvent$3(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38545r0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38544q0 = obj;
        this.f38546s0 |= Integer.MIN_VALUE;
        return this.f38545r0.m14303w(null, null, null, this);
    }
}
