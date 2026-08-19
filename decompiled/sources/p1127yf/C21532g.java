package p1127yf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p152Fm.AbstractC2922d;
import p349O0.C5996c0;
import p479Td.C7320F;
import p571X9.AbstractC9233X;
import p620Zc.InterfaceC10277b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: yf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C21532g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7320F f68205Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10277b f68206Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5996c0 f68207o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21532g(C7320F c7320f, InterfaceC10277b interfaceC10277b, C5996c0 c5996c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68205Y = c7320f;
        this.f68206Z = interfaceC10277b;
        this.f68207o0 = c5996c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21532g(this.f68205Y, this.f68206Z, this.f68207o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21532g c21532g = (C21532g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21532g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C7320F c7320f = this.f68205Y;
        int length = c7320f.f23219c.length();
        C5996c0 c5996c0 = this.f68207o0;
        if (length != c5996c0.m6412g()) {
            InterfaceC10277b interfaceC10277b = this.f68206Z;
            AbstractC2922d.f8758Y.getClass();
            interfaceC10277b.mo10875e(AbstractC2922d.f8759Z.mo3725f().nextFloat());
            c5996c0.m6413h(c7320f.f23219c.length());
        }
        return C17296C.f55119a;
    }
}
