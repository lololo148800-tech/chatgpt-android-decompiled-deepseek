package com.openai.feature.voice.impl.settings;

import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1155zi.C21952P1;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.settings.VoiceModeSettingsViewModelImpl", m20656f = "VoiceModeSettingsViewModelImpl.kt", m20657l = {47, StatsigLoggerKt.MAX_EVENTS, StatsigLoggerKt.MAX_EVENTS, 52, 54}, m20658m = "updateOptions")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeSettingsViewModelImpl$updateOptions$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public VoiceModeSettingsViewModelImpl f40285Y;

    /* JADX INFO: renamed from: Z */
    public C21952P1 f40286Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f40287o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f40288p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ VoiceModeSettingsViewModelImpl f40289q0;

    /* JADX INFO: renamed from: r0 */
    public int f40290r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$updateOptions$1(VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f40289q0 = voiceModeSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40288p0 = obj;
        this.f40290r0 |= Integer.MIN_VALUE;
        return VoiceModeSettingsViewModelImpl.m14385n(this.f40289q0, this);
    }
}
