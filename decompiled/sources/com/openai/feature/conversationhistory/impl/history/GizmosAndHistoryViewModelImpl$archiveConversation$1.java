package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1062vd.C20541V;
import p403Qd.C6636i;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {382}, m20658m = "archiveConversation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmosAndHistoryViewModelImpl$archiveConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmosAndHistoryViewModelImpl f37390Y;

    /* JADX INFO: renamed from: Z */
    public C20541V f37391Z;

    /* JADX INFO: renamed from: o0 */
    public C6636i f37392o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f37393p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37394q0;

    /* JADX INFO: renamed from: r0 */
    public int f37395r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$archiveConversation$1(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37394q0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37393p0 = obj;
        this.f37395r0 |= Integer.MIN_VALUE;
        return GizmosAndHistoryViewModelImpl.m14237n(this.f37394q0, null, this);
    }
}
