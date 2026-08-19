package p484Ti;

import android.app.Activity;
import android.os.Bundle;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p530Vi.C8312h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7481j extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7491t f23751Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Activity f23752Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Bundle f23753o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7481j(C7491t c7491t, Activity activity, Bundle bundle, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f23751Y = c7491t;
        this.f23752Z = activity;
        this.f23753o0 = bundle;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C7481j(this.f23751Y, this.f23752Z, this.f23753o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C7481j c7481j = (C7481j) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c7481j.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8312h c8312hMo7804c = this.f23751Y.mo7804c();
        c8312hMo7804c.m8933c().m9555b(new C7477f(1, 1));
        return C17296C.f55119a;
    }
}
