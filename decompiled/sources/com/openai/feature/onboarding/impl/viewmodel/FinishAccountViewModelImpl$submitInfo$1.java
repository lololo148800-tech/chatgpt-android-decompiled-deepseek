package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p324Mn.C5554x;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModelImpl", m20656f = "FinishAccountViewModel.kt", m20657l = {178, 184, 195, 209}, m20658m = "submitInfo")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class FinishAccountViewModelImpl$submitInfo$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public FinishAccountViewModelImpl f39138Y;

    /* JADX INFO: renamed from: Z */
    public Object f39139Z;

    /* JADX INFO: renamed from: o0 */
    public C5554x f39140o0;

    /* JADX INFO: renamed from: p0 */
    public C5554x f39141p0;

    /* JADX INFO: renamed from: q0 */
    public int f39142q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f39143r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ FinishAccountViewModelImpl f39144s0;

    /* JADX INFO: renamed from: t0 */
    public int f39145t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$submitInfo$1(FinishAccountViewModelImpl finishAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39144s0 = finishAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39143r0 = obj;
        this.f39145t0 |= Integer.MIN_VALUE;
        return FinishAccountViewModelImpl.m14327p(this.f39144s0, this);
    }
}
