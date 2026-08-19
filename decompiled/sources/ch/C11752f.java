package ch;

import com.revenuecat.purchases.Purchases;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ch.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11752f extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11757k f35633Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11752f(C11757k c11757k, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f35633Y = c11757k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C11752f(this.f35633Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C11752f c11752f = (C11752f) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c11752f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f35633Y.getClass();
        Purchases.Companion companion = Purchases.INSTANCE;
        if (companion.isConfigured()) {
            companion.getSharedInstance().close();
        }
        return C17296C.f55119a;
    }
}
