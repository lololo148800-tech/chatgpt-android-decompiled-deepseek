package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sg.C19554S;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.reporting.impl.ReportingViewModelImpl", m20656f = "ReportingViewModelImpl.kt", m20657l = {163}, m20658m = "submitReport")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ReportingViewModelImpl$submitReport$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ReportingViewModelImpl f39392Y;

    /* JADX INFO: renamed from: Z */
    public C19554S f39393Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f39394o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ReportingViewModelImpl f39395p0;

    /* JADX INFO: renamed from: q0 */
    public int f39396q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$submitReport$1(ReportingViewModelImpl reportingViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39395p0 = reportingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39394o0 = obj;
        this.f39396q0 |= Integer.MIN_VALUE;
        return ReportingViewModelImpl.m14340o(this.f39395p0, null, this);
    }
}
