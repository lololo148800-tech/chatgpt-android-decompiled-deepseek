package p000;

import android.content.Context;
import mm.C17296C;
import p001A.RunnableC0074m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p747fb.InterfaceFutureC13608b;
import p913o2.AbstractC17803d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public final class C13192e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceFutureC13608b f41862Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f41863Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f41864o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13192e(InterfaceFutureC13608b interfaceFutureC13608b, Context context, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41862Y = interfaceFutureC13608b;
        this.f41863Z = context;
        this.f41864o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13192e(this.f41862Y, this.f41863Z, this.f41864o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C13192e c13192e = (C13192e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c13192e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC5985X interfaceC5985X = this.f41864o0;
        InterfaceFutureC13608b interfaceFutureC13608b = this.f41862Y;
        interfaceFutureC13608b.mo5766a(new RunnableC0074m(interfaceFutureC13608b, 12, interfaceC5985X), AbstractC17803d.m19557d(this.f41863Z));
        return C17296C.f55119a;
    }
}
