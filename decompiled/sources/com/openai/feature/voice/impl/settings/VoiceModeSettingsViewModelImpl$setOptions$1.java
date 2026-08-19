package com.openai.feature.voice.impl.settings;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p148Fi.C2786R0;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.settings.VoiceModeSettingsViewModelImpl", m20656f = "VoiceModeSettingsViewModelImpl.kt", m20657l = {65}, m20658m = "setOptions")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeSettingsViewModelImpl$setOptions$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceModeSettingsViewModelImpl f40278Y;

    /* JADX INFO: renamed from: Z */
    public C2786R0 f40279Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40280o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VoiceModeSettingsViewModelImpl f40281p0;

    /* JADX INFO: renamed from: q0 */
    public int f40282q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$setOptions$1(VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40281p0 = voiceModeSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40280o0 = obj;
        this.f40282q0 |= Integer.MIN_VALUE;
        return this.f40281p0.m14386o(null, false, this);
    }
}
