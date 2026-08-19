package p387Pl;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1440o;
import p101Dl.InterfaceC2111l;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6485e extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ InterfaceC2111l f21041Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ boolean f21042Z;

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C6485e c6485e = new C6485e(3, (InterfaceC18770c) obj3);
        c6485e.f21041Y = (InterfaceC2111l) obj;
        c6485e.f21042Z = zBooleanValue;
        return c6485e.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return new C17309l(this.f21041Y, Boolean.valueOf(this.f21042Z));
    }
}
