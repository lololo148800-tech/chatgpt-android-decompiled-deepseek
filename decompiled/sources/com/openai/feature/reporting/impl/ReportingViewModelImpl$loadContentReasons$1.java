package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.reporting.impl.ReportingViewModelImpl", m20656f = "ReportingViewModelImpl.kt", m20657l = {101}, m20658m = "loadContentReasons")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ReportingViewModelImpl$loadContentReasons$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ReportingViewModelImpl f39375Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39376Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ReportingViewModelImpl f39377o0;

    /* JADX INFO: renamed from: p0 */
    public int f39378p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$loadContentReasons$1(ReportingViewModelImpl reportingViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39377o0 = reportingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39376Z = obj;
        this.f39378p0 |= Integer.MIN_VALUE;
        return ReportingViewModelImpl.m14339n(this.f39377o0, null, this);
    }
}
