package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel", m20656f = "VerifyEmailLinkViewModel.kt", m20657l = {85}, m20658m = "resendVerificationEmail")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VerifyEmailLinkViewModel$resendVerificationEmail$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VerifyEmailLinkViewModel f39310Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39311Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VerifyEmailLinkViewModel f39312o0;

    /* JADX INFO: renamed from: p0 */
    public int f39313p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailLinkViewModel$resendVerificationEmail$1(VerifyEmailLinkViewModel verifyEmailLinkViewModel, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39312o0 = verifyEmailLinkViewModel;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39311Z = obj;
        this.f39313p0 |= Integer.MIN_VALUE;
        return VerifyEmailLinkViewModel.m14335o(this.f39312o0, this);
    }
}
