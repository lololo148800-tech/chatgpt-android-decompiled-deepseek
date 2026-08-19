package com.openai.feature.auth.impl;

import android.content.Context;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1149zc.C21842d;
import p1155zi.C22010h;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.SwitchAccountViewModelImpl", m20656f = "SwitchAccountViewModelImpl.kt", m20657l = {70, 72, 86}, m20658m = "loginWithSso")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SwitchAccountViewModelImpl$loginWithSso$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SwitchAccountViewModelImpl f37278Y;

    /* JADX INFO: renamed from: Z */
    public Context f37279Z;

    /* JADX INFO: renamed from: o0 */
    public C22010h f37280o0;

    /* JADX INFO: renamed from: p0 */
    public C21842d f37281p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f37282q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ SwitchAccountViewModelImpl f37283r0;

    /* JADX INFO: renamed from: s0 */
    public int f37284s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountViewModelImpl$loginWithSso$1(SwitchAccountViewModelImpl switchAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37283r0 = switchAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37282q0 = obj;
        this.f37284s0 |= Integer.MIN_VALUE;
        return SwitchAccountViewModelImpl.m14232p(this.f37283r0, null, null, this);
    }
}
