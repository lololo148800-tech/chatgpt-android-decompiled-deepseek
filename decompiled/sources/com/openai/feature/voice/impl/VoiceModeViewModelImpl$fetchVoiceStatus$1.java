package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {603}, m20658m = "fetchVoiceStatus")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$fetchVoiceStatus$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceModeViewModelImpl f40110Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f40111Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceModeViewModelImpl f40112o0;

    /* JADX INFO: renamed from: p0 */
    public int f40113p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$fetchVoiceStatus$1(VoiceModeViewModelImpl voiceModeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40112o0 = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40111Z = obj;
        this.f40113p0 |= Integer.MIN_VALUE;
        return this.f40112o0.m14380s(null, null, null, null, this);
    }
}
