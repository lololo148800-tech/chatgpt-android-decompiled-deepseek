package com.openai.feature.reporting.impl;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p092Dc.C1991h;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sg.C19578t;
import sg.C19581w;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.reporting.impl.ReportingViewModelImpl$onIntent$5", m20656f = "ReportingViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$onIntent$5 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ReportingViewModelImpl f39390Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$onIntent$5(ReportingViewModelImpl reportingViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39390Y = reportingViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ReportingViewModelImpl$onIntent$5(this.f39390Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ReportingViewModelImpl$onIntent$5 reportingViewModelImpl$onIntent$5 = (ReportingViewModelImpl$onIntent$5) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        reportingViewModelImpl$onIntent$5.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ReportingViewModelImpl reportingViewModelImpl = this.f39390Y;
        reportingViewModelImpl.getClass();
        C1991h c1991h = reportingViewModelImpl.f39369j;
        reportingViewModelImpl.m14397m(new ReportingViewModelImpl$loadAppReasons$1(new C19581w(c1991h.m3160b(R.string.report_content_header_app_issue), c1991h.m3160b(R.string.report_content_header_app_issue_explanation), AbstractC17681o.m19382k(new C19578t("app_bug", c1991h.m3160b(R.string.report_content_app_bug), c1991h.m3160b(R.string.report_content_app_bug_explanation), c1991h.m3160b(R.string.report_content_details_placeholder), null, null, null, null, 960), new C19578t("app_performance", c1991h.m3160b(R.string.report_content_app_performance), c1991h.m3160b(R.string.report_content_app_performance_explanation), c1991h.m3160b(R.string.report_content_details_placeholder), null, null, null, null, 960), new C19578t("chat_quality", c1991h.m3160b(R.string.report_content_chat_quality), c1991h.m3160b(R.string.report_content_chat_quality_explanation), c1991h.m3160b(R.string.report_content_details_placeholder), null, null, null, null, 960)))));
        return C17296C.f55119a;
    }
}
