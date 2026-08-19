package com.openai.feature.auth.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.SwitchAccountViewModelImpl", m20656f = "SwitchAccountViewModelImpl.kt", m20657l = {103}, m20658m = "login-J9LtGa8")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SwitchAccountViewModelImpl$login$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SwitchAccountViewModelImpl f37274Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37275Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SwitchAccountViewModelImpl f37276o0;

    /* JADX INFO: renamed from: p0 */
    public int f37277p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountViewModelImpl$login$1(SwitchAccountViewModelImpl switchAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37276o0 = switchAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37275Z = obj;
        this.f37277p0 |= Integer.MIN_VALUE;
        return this.f37276o0.m14234r(null, null, null, null, this);
    }
}
