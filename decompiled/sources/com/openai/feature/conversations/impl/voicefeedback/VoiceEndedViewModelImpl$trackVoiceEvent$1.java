package com.openai.feature.conversations.impl.voicefeedback;

import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p1081wc.AbstractC20882b;
import p172Gi.C3061C;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl", m20656f = "VoiceEndedViewModel.kt", m20657l = {208}, m20658m = "trackVoiceEvent")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceEndedViewModelImpl$trackVoiceEvent$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceEndedViewModelImpl f38069Y;

    /* JADX INFO: renamed from: Z */
    public C3061C f38070Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC20882b f38071o0;

    /* JADX INFO: renamed from: p0 */
    public C17309l[] f38072p0;

    /* JADX INFO: renamed from: q0 */
    public Map f38073q0;

    /* JADX INFO: renamed from: r0 */
    public C17309l[] f38074r0;

    /* JADX INFO: renamed from: s0 */
    public String f38075s0;

    /* JADX INFO: renamed from: t0 */
    public int f38076t0;

    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ Object f38077u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ VoiceEndedViewModelImpl f38078v0;

    /* JADX INFO: renamed from: w0 */
    public int f38079w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEndedViewModelImpl$trackVoiceEvent$1(VoiceEndedViewModelImpl voiceEndedViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38078v0 = voiceEndedViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38077u0 = obj;
        this.f38079w0 |= Integer.MIN_VALUE;
        return this.f38078v0.m14273n(null, null, null, this);
    }
}
