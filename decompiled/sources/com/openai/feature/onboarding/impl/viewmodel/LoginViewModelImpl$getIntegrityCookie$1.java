package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl", m20656f = "LoginViewModelImpl.kt", m20657l = {106, 110}, m20658m = "getIntegrityCookie")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class LoginViewModelImpl$getIntegrityCookie$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public LoginViewModelImpl f39179Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39180Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ LoginViewModelImpl f39181o0;

    /* JADX INFO: renamed from: p0 */
    public int f39182p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$getIntegrityCookie$1(LoginViewModelImpl loginViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39181o0 = loginViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39180Z = obj;
        this.f39182p0 |= Integer.MIN_VALUE;
        return LoginViewModelImpl.m14328o(this.f39181o0, this);
    }
}
