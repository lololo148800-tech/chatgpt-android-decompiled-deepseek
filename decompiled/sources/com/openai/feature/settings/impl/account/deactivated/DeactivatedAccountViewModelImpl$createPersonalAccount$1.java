package com.openai.feature.settings.impl.account.deactivated;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModelImpl", m20656f = "DeactivatedAccountViewModel.kt", m20657l = {100, 101}, m20658m = "createPersonalAccount")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class DeactivatedAccountViewModelImpl$createPersonalAccount$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public DeactivatedAccountViewModelImpl f39478Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39479Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ DeactivatedAccountViewModelImpl f39480o0;

    /* JADX INFO: renamed from: p0 */
    public int f39481p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeactivatedAccountViewModelImpl$createPersonalAccount$1(DeactivatedAccountViewModelImpl deactivatedAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39480o0 = deactivatedAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39479Z = obj;
        this.f39481p0 |= Integer.MIN_VALUE;
        return this.f39480o0.m14350n(null, this);
    }
}
