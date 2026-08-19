package sg;

import com.openai.feature.reporting.ReportingViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sg.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19548L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ReportingViewModel f62098Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19575q f62099Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19548L(ReportingViewModel reportingViewModel, C19575q c19575q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62098Y = reportingViewModel;
        this.f62099Z = c19575q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19548L(this.f62098Y, this.f62099Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19548L c19548l = (C19548L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19548l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f62098Y.m14395k(new C19553Q(this.f62099Z));
        return C17296C.f55119a;
    }
}
