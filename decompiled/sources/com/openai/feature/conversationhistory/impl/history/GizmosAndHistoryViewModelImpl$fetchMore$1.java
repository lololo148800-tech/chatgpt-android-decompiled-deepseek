package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {318}, m20658m = "fetchMore")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmosAndHistoryViewModelImpl$fetchMore$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmosAndHistoryViewModelImpl f37406Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37407Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37408o0;

    /* JADX INFO: renamed from: p0 */
    public int f37409p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$fetchMore$1(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37408o0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37407Z = obj;
        this.f37409p0 |= Integer.MIN_VALUE;
        int i10 = GizmosAndHistoryViewModelImpl.f37368r;
        return this.f37408o0.m14243t(null, this);
    }
}
