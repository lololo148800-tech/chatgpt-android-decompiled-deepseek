package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {761, 762, 763}, m20658m = "refresh-_VSqRpo")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$refresh$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f40190Y;

    /* JADX INFO: renamed from: Z */
    public String f40191Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40192o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VoiceModeViewModelImpl f40193p0;

    /* JADX INFO: renamed from: q0 */
    public int f40194q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$refresh$1(VoiceModeViewModelImpl voiceModeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40193p0 = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40192o0 = obj;
        this.f40194q0 |= Integer.MIN_VALUE;
        return VoiceModeViewModelImpl.m14376o(this.f40193p0, null, this);
    }
}
