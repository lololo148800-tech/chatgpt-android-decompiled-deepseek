package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p403Qd.C6636i;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {374}, m20658m = "renameConversation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmosAndHistoryViewModelImpl$renameConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmosAndHistoryViewModelImpl f37469Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f37470Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37471o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37472p0;

    /* JADX INFO: renamed from: q0 */
    public int f37473q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$renameConversation$1(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37472p0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37471o0 = obj;
        this.f37473q0 |= Integer.MIN_VALUE;
        return GizmosAndHistoryViewModelImpl.m14241r(this.f37472p0, null, null, this);
    }
}
