package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel", m20656f = "VerifyPhoneViewModel.kt", m20657l = {105}, m20658m = "requestOtpCode")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VerifyPhoneViewModel$requestOtpCode$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VerifyPhoneViewModel f39341Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39342Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VerifyPhoneViewModel f39343o0;

    /* JADX INFO: renamed from: p0 */
    public int f39344p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPhoneViewModel$requestOtpCode$1(VerifyPhoneViewModel verifyPhoneViewModel, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39343o0 = verifyPhoneViewModel;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39342Z = obj;
        this.f39344p0 |= Integer.MIN_VALUE;
        return VerifyPhoneViewModel.m14337n(this.f39343o0, this);
    }
}
