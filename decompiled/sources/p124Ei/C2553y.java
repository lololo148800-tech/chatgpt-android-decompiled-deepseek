package p124Ei;

import java.util.Map;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20883b0;
import p1081wc.InterfaceC20904w;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C2553y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5985X f7972Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f7973Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2553y(InterfaceC5985X interfaceC5985X, InterfaceC20904w interfaceC20904w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7972Y = interfaceC5985X;
        this.f7973Z = interfaceC20904w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2553y(this.f7972Y, this.f7973Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C2553y c2553y = (C2553y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2553y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        Map map = (Map) this.f7972Y.getValue();
        if (map != null) {
            this.f7973Z.mo21447a(C20883b0.f66505f, map);
        }
        return C17296C.f55119a;
    }
}
