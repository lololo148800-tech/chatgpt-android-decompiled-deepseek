package p101Dl;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2113n extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ boolean f6469Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ boolean f6470Z;

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        C2113n c2113n = new C2113n(3, (InterfaceC18770c) obj3);
        c2113n.f6469Y = zBooleanValue;
        c2113n.f6470Z = zBooleanValue2;
        return c2113n.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return new C17309l(Boolean.valueOf(this.f6469Y), Boolean.valueOf(this.f6470Z));
    }
}
