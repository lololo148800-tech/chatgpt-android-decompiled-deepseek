package p135F5;

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

/* JADX INFO: renamed from: F5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2668d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2669e f8188Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668d(C2669e c2669e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8188Y = c2669e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2668d(this.f8188Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2668d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C2669e c2669e = this.f8188Y;
        synchronized (c2669e.f8200t0) {
            if (!c2669e.f8205y0 || c2669e.f8206z0) {
                return C17296C.f55119a;
            }
            try {
                c2669e.m3649j0();
            } catch (IOException unused) {
                c2669e.f8190A0 = true;
            }
            try {
                if (c2669e.f8202v0 >= 2000) {
                    c2669e.m3652v0();
                }
            } catch (IOException unused2) {
                c2669e.f8191B0 = true;
                c2669e.f8203w0 = AbstractC0668b.m1402b(new C0673g());
            }
            return C17296C.f55119a;
        }
    }
}
