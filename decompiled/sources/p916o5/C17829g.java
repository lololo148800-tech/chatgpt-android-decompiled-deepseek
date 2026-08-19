package p916o5;

import java.io.IOException;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p026Ao.AbstractC0668b;
import p026Ao.C0673g;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: o5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17829g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C17830h f56876Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17829g(C17830h c17830h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56876Y = c17830h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17829g(this.f56876Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17829g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17830h c17830h = this.f56876Y;
        synchronized (c17830h) {
            if (!c17830h.f56891x0 || c17830h.f56892y0) {
                return C17296C.f55119a;
            }
            try {
                c17830h.m19584j0();
            } catch (IOException unused) {
                c17830h.f56893z0 = true;
            }
            try {
                if (c17830h.f56888u0 >= 2000) {
                    c17830h.m19587v0();
                }
            } catch (IOException unused2) {
                c17830h.f56878A0 = true;
                c17830h.f56889v0 = AbstractC0668b.m1402b(new C0673g());
            }
            return C17296C.f55119a;
        }
    }
}
