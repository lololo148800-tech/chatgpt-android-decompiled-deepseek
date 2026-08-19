package p294Li;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p341Ni.C5781g;
import p341Ni.C5785i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Li.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5080b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f16636Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f16637Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5080b(C5785i c5785i, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16636Y = c5785i;
        this.f16637Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5080b(this.f16636Y, this.f16637Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5080b c5080b = (C5080b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5080b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C5785i c5785i = this.f16636Y;
        AbstractC0575H.m1156D(c5785i.f18875a, null, null, new C5781g(c5785i, this.f16637Z, null), 3);
        return C17296C.f55119a;
    }
}
