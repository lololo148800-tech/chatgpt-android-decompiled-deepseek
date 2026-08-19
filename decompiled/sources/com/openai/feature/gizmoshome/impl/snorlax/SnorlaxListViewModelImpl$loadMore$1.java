package com.openai.feature.gizmoshome.impl.snorlax;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModelImpl", m20656f = "SnorlaxListViewModel.kt", m20657l = {92}, m20658m = "loadMore")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SnorlaxListViewModelImpl$loadMore$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SnorlaxListViewModelImpl f38413Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38414Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SnorlaxListViewModelImpl f38415o0;

    /* JADX INFO: renamed from: p0 */
    public int f38416p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxListViewModelImpl$loadMore$1(SnorlaxListViewModelImpl snorlaxListViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38415o0 = snorlaxListViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38414Z = obj;
        this.f38416p0 |= Integer.MIN_VALUE;
        return SnorlaxListViewModelImpl.m14292n(this.f38415o0, null, this);
    }
}
