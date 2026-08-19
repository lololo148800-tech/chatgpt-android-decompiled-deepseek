package com.openai.feature.gizmos.impl.settings;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p550We.EnumC8830k;
import p622Ze.C10296n;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl", m20656f = "GizmoSettingsViewModel.kt", m20657l = {102}, m20658m = "updateOperation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmoSettingsViewModelImpl$updateOperation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmoSettingsViewModelImpl f38167Y;

    /* JADX INFO: renamed from: Z */
    public C10296n f38168Z;

    /* JADX INFO: renamed from: o0 */
    public EnumC8830k f38169o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38170p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ GizmoSettingsViewModelImpl f38171q0;

    /* JADX INFO: renamed from: r0 */
    public int f38172r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$updateOperation$1(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38171q0 = gizmoSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38170p0 = obj;
        this.f38172r0 |= Integer.MIN_VALUE;
        return GizmoSettingsViewModelImpl.m14278o(this.f38171q0, null, this);
    }
}
