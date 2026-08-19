package com.openai.feature.settings.impl.data;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.data.DataControlsViewModelImpl", m20656f = "DataControlsViewModel.kt", m20657l = {157}, m20658m = "clearHistory")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class DataControlsViewModelImpl$clearHistory$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public DataControlsViewModelImpl f39512Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39513Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ DataControlsViewModelImpl f39514o0;

    /* JADX INFO: renamed from: p0 */
    public int f39515p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataControlsViewModelImpl$clearHistory$1(DataControlsViewModelImpl dataControlsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39514o0 = dataControlsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39513Z = obj;
        this.f39515p0 |= Integer.MIN_VALUE;
        return DataControlsViewModelImpl.m14353o(this.f39514o0, this);
    }
}
