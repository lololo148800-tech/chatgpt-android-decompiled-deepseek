package p769gj;

import androidx.lifecycle.C11082S;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p729ej.C13417h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14160b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44532Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11082S f44533Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14160b(C11082S c11082s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44533Z = c11082s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14160b c14160b = new C14160b(this.f44533Z, interfaceC18770c);
        c14160b.f44532Y = obj;
        return c14160b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14160b c14160b = (C14160b) create((C13417h) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14160b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C13417h c13417h = (C13417h) this.f44532Y;
        C11082S c11082s = this.f44533Z;
        if (c11082s != null) {
            c11082s.m12132c("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new C14175q(c13417h.f42498b));
        }
        return C17296C.f55119a;
    }
}
