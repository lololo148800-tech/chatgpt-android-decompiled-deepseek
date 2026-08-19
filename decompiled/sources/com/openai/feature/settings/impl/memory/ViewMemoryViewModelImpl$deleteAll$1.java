package com.openai.feature.settings.impl.memory;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl", m20656f = "ViewMemoryViewModel.kt", m20657l = {151}, m20658m = "deleteAll")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ViewMemoryViewModelImpl$deleteAll$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ViewMemoryViewModelImpl f39672Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39673Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ViewMemoryViewModelImpl f39674o0;

    /* JADX INFO: renamed from: p0 */
    public int f39675p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMemoryViewModelImpl$deleteAll$1(ViewMemoryViewModelImpl viewMemoryViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39674o0 = viewMemoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39673Z = obj;
        this.f39675p0 |= Integer.MIN_VALUE;
        return ViewMemoryViewModelImpl.m14360o(this.f39674o0, this);
    }
}
