package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailCodeViewModelLoggedInImpl", m20656f = "VerifyEmailCodeViewModelImpl.kt", m20657l = {177, 177}, m20658m = "handleEmailRefresh")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VerifyEmailCodeViewModelLoggedInImpl f39221Y;

    /* JADX INFO: renamed from: Z */
    public VerifyEmailCodeViewModelLoggedInImpl f39222Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f39223o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VerifyEmailCodeViewModelLoggedInImpl f39224p0;

    /* JADX INFO: renamed from: q0 */
    public int f39225q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39224p0 = verifyEmailCodeViewModelLoggedInImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39223o0 = obj;
        this.f39225q0 |= Integer.MIN_VALUE;
        return VerifyEmailCodeViewModelLoggedInImpl.m14332n(this.f39224p0, this);
    }
}
