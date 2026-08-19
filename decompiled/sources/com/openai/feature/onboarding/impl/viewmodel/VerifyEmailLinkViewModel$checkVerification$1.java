package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel", m20656f = "VerifyEmailLinkViewModel.kt", m20657l = {106, 115, 123}, m20658m = "checkVerification")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VerifyEmailLinkViewModel$checkVerification$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f39292Y;

    /* JADX INFO: renamed from: Z */
    public VerifyEmailLinkViewModel f39293Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f39294o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f39295p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ VerifyEmailLinkViewModel f39296q0;

    /* JADX INFO: renamed from: r0 */
    public int f39297r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailLinkViewModel$checkVerification$1(VerifyEmailLinkViewModel verifyEmailLinkViewModel, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39296q0 = verifyEmailLinkViewModel;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39295p0 = obj;
        this.f39297r0 |= Integer.MIN_VALUE;
        return VerifyEmailLinkViewModel.m14334n(this.f39296q0, false, this);
    }
}
