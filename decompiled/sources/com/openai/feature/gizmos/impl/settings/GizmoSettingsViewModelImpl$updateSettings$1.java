package com.openai.feature.gizmos.impl.settings;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl", m20656f = "GizmoSettingsViewModel.kt", m20657l = {81}, m20658m = "updateSettings")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmoSettingsViewModelImpl$updateSettings$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmoSettingsViewModelImpl f38176Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38177Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmoSettingsViewModelImpl f38178o0;

    /* JADX INFO: renamed from: p0 */
    public int f38179p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$updateSettings$1(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38178o0 = gizmoSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38177Z = obj;
        this.f38179p0 |= Integer.MIN_VALUE;
        return this.f38178o0.m14279p(this);
    }
}
