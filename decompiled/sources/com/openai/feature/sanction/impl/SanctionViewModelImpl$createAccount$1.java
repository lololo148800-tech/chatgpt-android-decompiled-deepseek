package com.openai.feature.sanction.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p623Zf.EnumC10304F;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sanction.impl.SanctionViewModelImpl", m20656f = "SanctionViewModel.kt", m20657l = {103}, m20658m = "createAccount")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SanctionViewModelImpl$createAccount$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SanctionViewModelImpl f39415Y;

    /* JADX INFO: renamed from: Z */
    public EnumC10304F f39416Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f39417o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ SanctionViewModelImpl f39418p0;

    /* JADX INFO: renamed from: q0 */
    public int f39419q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SanctionViewModelImpl$createAccount$1(SanctionViewModelImpl sanctionViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39418p0 = sanctionViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39417o0 = obj;
        this.f39419q0 |= Integer.MIN_VALUE;
        return SanctionViewModelImpl.m14344n(this.f39418p0, this);
    }
}
