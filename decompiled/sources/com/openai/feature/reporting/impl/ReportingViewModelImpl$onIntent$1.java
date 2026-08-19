package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1081wc.C20888g;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sg.C19540D;
import sg.C19554S;
import sg.C19575q;
import sg.InterfaceC19558W;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.reporting.impl.ReportingViewModelImpl$onIntent$1", m20656f = "ReportingViewModelImpl.kt", m20657l = {62}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39381Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ReportingViewModelImpl f39382Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19558W f39383o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$onIntent$1(ReportingViewModelImpl reportingViewModelImpl, InterfaceC19558W interfaceC19558W, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39382Z = reportingViewModelImpl;
        this.f39383o0 = interfaceC19558W;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ReportingViewModelImpl$onIntent$1(this.f39382Z, this.f39383o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ReportingViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39381Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20888g c20888g = C20888g.f66544g;
            C19554S c19554s = (C19554S) this.f39383o0;
            C17309l c17309l = new C17309l("reason_id", c19554s.f62107b);
            C19575q c19575q = c19554s.f62106a;
            ReportingViewModelImpl reportingViewModelImpl = this.f39382Z;
            String strM14343a = ReportingViewModelImplKt.m14343a(c19575q, ((C19540D) reportingViewModelImpl.m14391f()).f62070a);
            if (strM14343a == null) {
                strM14343a = "";
            }
            reportingViewModelImpl.m14342q(c20888g, AbstractC17659D.m19244f(c17309l, new C17309l("content_id", strM14343a)));
            this.f39381Y = 1;
            if (ReportingViewModelImpl.m14340o(reportingViewModelImpl, c19554s, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
