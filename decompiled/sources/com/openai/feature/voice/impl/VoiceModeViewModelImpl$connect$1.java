package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p172Gi.EnumC3062D;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {634, 640}, m20658m = "connect")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$connect$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceModeViewModelImpl f40067Y;

    /* JADX INFO: renamed from: Z */
    public EnumC3062D f40068Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f40069o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f40070p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ VoiceModeViewModelImpl f40071q0;

    /* JADX INFO: renamed from: r0 */
    public int f40072r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connect$1(VoiceModeViewModelImpl voiceModeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40071q0 = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40070p0 = obj;
        this.f40072r0 |= Integer.MIN_VALUE;
        return this.f40071q0.m14378q(null, null, false, false, this);
    }
}
