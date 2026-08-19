package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl", m20656f = "FinishAccountViewModel.kt", m20657l = {147}, m20658m = "fetchConfig")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class FinishAccountViewModelImpl$fetchConfig$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public FinishAccountViewModelImpl f39123Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39124Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ FinishAccountViewModelImpl f39125o0;

    /* JADX INFO: renamed from: p0 */
    public int f39126p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$fetchConfig$1(FinishAccountViewModelImpl finishAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39125o0 = finishAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39124Z = obj;
        this.f39126p0 |= Integer.MIN_VALUE;
        return FinishAccountViewModelImpl.m14326o(this.f39125o0, this);
    }
}
