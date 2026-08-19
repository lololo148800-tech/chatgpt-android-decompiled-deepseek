package com.openai.feature.auth.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.SwitchAccountViewModelImpl", m20656f = "SwitchAccountViewModelImpl.kt", m20657l = {124, 128}, m20658m = "getIntegrityCookie")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SwitchAccountViewModelImpl$getIntegrityCookie$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SwitchAccountViewModelImpl f37270Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37271Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SwitchAccountViewModelImpl f37272o0;

    /* JADX INFO: renamed from: p0 */
    public int f37273p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountViewModelImpl$getIntegrityCookie$1(SwitchAccountViewModelImpl switchAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37272o0 = switchAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37271Z = obj;
        this.f37273p0 |= Integer.MIN_VALUE;
        return this.f37272o0.m14233q(this);
    }
}
