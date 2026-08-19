package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1081wc.C20888g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import sg.C19540D;
import sg.C19556U;
import sg.C19575q;
import sg.C19578t;
import sg.InterfaceC19558W;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lsg/D;", "invoke", "(Lsg/D;)Lsg/D;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ReportingViewModelImpl f39384Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19558W f39385Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$onIntent$2(ReportingViewModelImpl reportingViewModelImpl, InterfaceC19558W interfaceC19558W) {
        super(1);
        this.f39384Y = reportingViewModelImpl;
        this.f39385Z = interfaceC19558W;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19540D setState = (C19540D) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C20888g c20888g = C20888g.f66543f;
        C19556U c19556u = (C19556U) this.f39385Z;
        C19578t c19578t = c19556u.f62112b;
        C17309l c17309l = new C17309l("reason_id", c19578t.f62167a);
        String str = c19578t.f62169c;
        if (str == null) {
            str = "";
        }
        C17309l c17309l2 = new C17309l("reason_explanation", str);
        C19575q c19575q = c19556u.f62111a;
        ReportingViewModelImpl reportingViewModelImpl = this.f39384Y;
        String strM14343a = ReportingViewModelImplKt.m14343a(c19575q, ((C19540D) reportingViewModelImpl.m14391f()).f62070a);
        reportingViewModelImpl.m14342q(c20888g, AbstractC17659D.m19244f(c17309l, c17309l2, new C17309l("content_id", strM14343a != null ? strM14343a : "")));
        return C19540D.m20625e(setState, null, null, AbstractC17680n.m19362l0(setState.f62072c, c19556u.f62112b), false, null, 27);
    }
}
