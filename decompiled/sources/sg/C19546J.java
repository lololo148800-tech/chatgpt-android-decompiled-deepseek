package sg;

import com.openai.feature.reporting.ReportingViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sg.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C19546J extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ReportingViewModel f62092Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19546J(ReportingViewModel reportingViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62092Y = reportingViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19546J(this.f62092Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19546J c19546j = (C19546J) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19546j.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f62092Y.m14395k(C19552P.f62104a);
        return C17296C.f55119a;
    }
}
