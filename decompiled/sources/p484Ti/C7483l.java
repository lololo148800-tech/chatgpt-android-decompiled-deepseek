package p484Ti;

import android.app.Activity;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p530Vi.C8312h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C7483l extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7491t f23756Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Activity f23757Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7483l(C7491t c7491t, Activity activity, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f23756Y = c7491t;
        this.f23757Z = activity;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C7483l(this.f23756Y, this.f23757Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C7483l c7483l = (C7483l) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c7483l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8312h c8312hMo7804c = this.f23756Y.mo7804c();
        c8312hMo7804c.m8933c().m9555b(new C7477f(1, 3));
        return C17296C.f55119a;
    }
}
