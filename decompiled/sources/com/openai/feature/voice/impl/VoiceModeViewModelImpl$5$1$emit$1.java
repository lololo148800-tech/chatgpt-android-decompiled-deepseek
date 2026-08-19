package com.openai.feature.voice.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p148Fi.AbstractC2841n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$5$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {211, 219, 223}, m20658m = "emit")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class VoiceModeViewModelImpl$5$1$emit$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f40055Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC2841n f40056Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40057o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VoiceModeViewModelImpl.C125535.AnonymousClass1 f40058p0;

    /* JADX INFO: renamed from: q0 */
    public int f40059q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$5$1$emit$1(VoiceModeViewModelImpl.C125535.AnonymousClass1 anonymousClass1, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f40058p0 = anonymousClass1;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f40057o0 = obj;
        this.f40059q0 |= Integer.MIN_VALUE;
        return this.f40058p0.mo395a(null, this);
    }
}
