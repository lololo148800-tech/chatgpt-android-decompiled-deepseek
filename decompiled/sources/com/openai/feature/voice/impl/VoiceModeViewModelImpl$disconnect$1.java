package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p172Gi.EnumC3068a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {742, 748, 751, 752}, m20658m = "disconnect")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$disconnect$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceModeViewModelImpl f40103Y;

    /* JADX INFO: renamed from: Z */
    public EnumC3068a f40104Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40105o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VoiceModeViewModelImpl f40106p0;

    /* JADX INFO: renamed from: q0 */
    public int f40107q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$disconnect$1(VoiceModeViewModelImpl voiceModeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40106p0 = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40105o0 = obj;
        this.f40107q0 |= Integer.MIN_VALUE;
        return this.f40106p0.m14379r(null, this);
    }
}
