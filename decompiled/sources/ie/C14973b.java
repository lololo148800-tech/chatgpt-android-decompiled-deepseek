package ie;

import android.app.Application;
import mm.C17296C;
import mm.C17314q;
import p049Bm.InterfaceC1436k;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ie.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14973b extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14975d f46628Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Application f46629Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14973b(C14975d c14975d, Application application, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f46628Y = c14975d;
        this.f46629Z = application;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C14973b(this.f46628Y, this.f46629Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C14973b c14973b = (C14973b) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c14973b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C14975d c14975d = this.f46628Y;
        C3430e c3430e = c14975d.f46631b;
        C17314q c17314q = c14975d.f46632c;
        AbstractC8160o6.m8726a(c3430e, "Deleting database " + ((String) c17314q.getValue()), null, 6);
        this.f46629Z.deleteDatabase((String) c17314q.getValue());
        return C17296C.f55119a;
    }
}
