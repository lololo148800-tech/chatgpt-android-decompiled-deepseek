package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModelImpl", m20656f = "CreateAccountViewModel.kt", m20657l = {63, 67, 70, 82, 91}, m20658m = "createAccount")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class CreateAccountViewModelImpl$createAccount$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f39088Y;

    /* JADX INFO: renamed from: Z */
    public CreateAccountViewModelImpl f39089Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f39090o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ CreateAccountViewModelImpl f39091p0;

    /* JADX INFO: renamed from: q0 */
    public int f39092q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAccountViewModelImpl$createAccount$1(CreateAccountViewModelImpl createAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39091p0 = createAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39090o0 = obj;
        this.f39092q0 |= Integer.MIN_VALUE;
        return CreateAccountViewModelImpl.m14323n(this.f39091p0, this);
    }
}
