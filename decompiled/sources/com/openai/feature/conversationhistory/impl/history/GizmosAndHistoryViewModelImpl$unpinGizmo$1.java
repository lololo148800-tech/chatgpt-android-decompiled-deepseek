package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {369}, m20658m = "unpinGizmo-LfrXLVc")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmosAndHistoryViewModelImpl$unpinGizmo$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmosAndHistoryViewModelImpl f37487Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37488Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37489o0;

    /* JADX INFO: renamed from: p0 */
    public int f37490p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$unpinGizmo$1(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37489o0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37488Z = obj;
        this.f37490p0 |= Integer.MIN_VALUE;
        return GizmosAndHistoryViewModelImpl.m14242s(this.f37489o0, null, this);
    }
}
