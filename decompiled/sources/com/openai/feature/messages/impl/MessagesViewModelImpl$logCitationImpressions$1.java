package com.openai.feature.messages.impl;

import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p403Qd.AbstractC6659u;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {466, 469}, m20658m = "logCitationImpressions-Xin9Z_4")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$logCitationImpressions$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38547Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6659u f38548Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f38549o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38550p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessagesViewModelImpl f38551q0;

    /* JADX INFO: renamed from: r0 */
    public int f38552r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$logCitationImpressions$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38551q0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38550p0 = obj;
        this.f38552r0 |= Integer.MIN_VALUE;
        return MessagesViewModelImpl.m14296p(this.f38551q0, null, this);
    }
}
