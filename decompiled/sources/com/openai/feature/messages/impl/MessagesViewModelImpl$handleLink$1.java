package com.openai.feature.messages.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p040Bd.C0937I1;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {355, 356, 357, 359, 364}, m20658m = "handleLink-Q8xTQ0A")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$handleLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38524Y;

    /* JADX INFO: renamed from: Z */
    public String f38525Z;

    /* JADX INFO: renamed from: o0 */
    public String f38526o0;

    /* JADX INFO: renamed from: p0 */
    public C0937I1 f38527p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f38528q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f38529r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f38530s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ MessagesViewModelImpl f38531t0;

    /* JADX INFO: renamed from: u0 */
    public int f38532u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$handleLink$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38531t0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38530s0 = obj;
        this.f38532u0 |= Integer.MIN_VALUE;
        return MessagesViewModelImpl.m14295o(this.f38531t0, null, null, false, this);
    }
}
