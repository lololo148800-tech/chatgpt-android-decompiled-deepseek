package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {649, 650, 660, 661, 662, 669, 683, 706}, m20658m = "connectImpl")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$connectImpl$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: A0 */
    public int f40078A0;

    /* JADX INFO: renamed from: Y */
    public VoiceModeViewModelImpl f40079Y;

    /* JADX INFO: renamed from: Z */
    public Object f40080Z;

    /* JADX INFO: renamed from: o0 */
    public Object f40081o0;

    /* JADX INFO: renamed from: p0 */
    public Object f40082p0;

    /* JADX INFO: renamed from: q0 */
    public Object f40083q0;

    /* JADX INFO: renamed from: r0 */
    public Object f40084r0;

    /* JADX INFO: renamed from: s0 */
    public Object f40085s0;

    /* JADX INFO: renamed from: t0 */
    public Object f40086t0;

    /* JADX INFO: renamed from: u0 */
    public Object f40087u0;

    /* JADX INFO: renamed from: v0 */
    public Object f40088v0;

    /* JADX INFO: renamed from: w0 */
    public Object f40089w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f40090x0;

    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ Object f40091y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ VoiceModeViewModelImpl f40092z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connectImpl$1(VoiceModeViewModelImpl voiceModeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40092z0 = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40091y0 = obj;
        this.f40078A0 |= Integer.MIN_VALUE;
        return VoiceModeViewModelImpl.m14375n(this.f40092z0, null, null, false, this);
    }
}
