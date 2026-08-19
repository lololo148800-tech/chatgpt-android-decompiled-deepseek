package com.openai.feature.gizmos.impl.store;

import bf.C11367W;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoRatingViewModelImpl", m20656f = "GizmoRatingViewModel.kt", m20657l = {133}, m20658m = "submitRating")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class GizmoRatingViewModelImpl$submitRating$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public GizmoRatingViewModelImpl f38219Y;

    /* JADX INFO: renamed from: Z */
    public C11367W f38220Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38221o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmoRatingViewModelImpl f38222p0;

    /* JADX INFO: renamed from: q0 */
    public int f38223q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoRatingViewModelImpl$submitRating$1(GizmoRatingViewModelImpl gizmoRatingViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38222p0 = gizmoRatingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38221o0 = obj;
        this.f38223q0 |= Integer.MIN_VALUE;
        return GizmoRatingViewModelImpl.m14280n(this.f38222p0, this);
    }
}
