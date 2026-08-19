package com.openai.feature.gizmos.impl.store;

import bf.C11363S;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl", m20656f = "GizmoStoreViewModel.kt", m20657l = {190}, m20658m = "onSearchLoadMore")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmoStoreViewModelImpl$onSearchLoadMore$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmoStoreViewModelImpl f38282Y;

    /* JADX INFO: renamed from: Z */
    public C11363S f38283Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38284o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmoStoreViewModelImpl f38285p0;

    /* JADX INFO: renamed from: q0 */
    public int f38286q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$onSearchLoadMore$1(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38285p0 = gizmoStoreViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38284o0 = obj;
        this.f38286q0 |= Integer.MIN_VALUE;
        return GizmoStoreViewModelImpl.m14284q(this.f38285p0, null, this);
    }
}
