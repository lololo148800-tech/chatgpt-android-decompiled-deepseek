package com.openai.feature.sanction.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl", m20656f = "SanctionViewModel.kt", m20657l = {94, 96}, m20658m = "handleInitialInquiryStatus")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SanctionViewModelImpl$handleInitialInquiryStatus$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SanctionViewModelImpl f39420Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39421Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SanctionViewModelImpl f39422o0;

    /* JADX INFO: renamed from: p0 */
    public int f39423p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SanctionViewModelImpl$handleInitialInquiryStatus$1(SanctionViewModelImpl sanctionViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39422o0 = sanctionViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39421Z = obj;
        this.f39423p0 |= Integer.MIN_VALUE;
        return SanctionViewModelImpl.m14345o(this.f39422o0, this);
    }
}
