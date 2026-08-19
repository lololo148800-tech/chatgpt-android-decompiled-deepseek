package com.openai.feature.gizmos.impl.settings;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl", m20656f = "GizmoSettingsViewModel.kt", m20657l = {143, 145, 145}, m20658m = "logout")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmoSettingsViewModelImpl$logout$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmoSettingsViewModelImpl f38153Y;

    /* JADX INFO: renamed from: Z */
    public String f38154Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38155o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmoSettingsViewModelImpl f38156p0;

    /* JADX INFO: renamed from: q0 */
    public int f38157q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$logout$1(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38156p0 = gizmoSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38155o0 = obj;
        this.f38157q0 |= Integer.MIN_VALUE;
        return GizmoSettingsViewModelImpl.m14277n(this.f38156p0, null, this);
    }
}
