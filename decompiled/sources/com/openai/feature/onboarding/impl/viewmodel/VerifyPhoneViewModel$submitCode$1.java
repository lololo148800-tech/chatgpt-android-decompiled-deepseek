package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel", m20656f = "VerifyPhoneViewModel.kt", m20657l = {133, 137}, m20658m = "submitCode")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VerifyPhoneViewModel$submitCode$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f39346Y;

    /* JADX INFO: renamed from: Z */
    public VerifyPhoneViewModel f39347Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f39348o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VerifyPhoneViewModel f39349p0;

    /* JADX INFO: renamed from: q0 */
    public int f39350q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPhoneViewModel$submitCode$1(VerifyPhoneViewModel verifyPhoneViewModel, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39349p0 = verifyPhoneViewModel;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39348o0 = obj;
        this.f39350q0 |= Integer.MIN_VALUE;
        return VerifyPhoneViewModel.m14338o(this.f39349p0, this);
    }
}
