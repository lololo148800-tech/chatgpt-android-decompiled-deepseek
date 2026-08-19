package p1075w5;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11111t;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1121y5.C21388a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C20841s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20842t f66269Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20841s(ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66269Y = viewOnAttachStateChangeListenerC20842t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20841s(this.f66269Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20841s c20841s = (C20841s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20841s.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842t = this.f66269Y;
        C20840r c20840r = viewOnAttachStateChangeListenerC20842t.f66273p0;
        if (c20840r != null) {
            c20840r.f66268q0.mo1275e(null);
            C21388a c21388a = c20840r.f66266o0;
            boolean z6 = c21388a instanceof InterfaceC11111t;
            AbstractC11105n abstractC11105n = c20840r.f66267p0;
            if (z6) {
                abstractC11105n.mo7808c(c21388a);
            }
            abstractC11105n.mo7808c(c20840r);
        }
        viewOnAttachStateChangeListenerC20842t.f66273p0 = null;
        return C17296C.f55119a;
    }
}
