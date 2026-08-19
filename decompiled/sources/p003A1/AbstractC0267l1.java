package p003A1;

import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p1140z1.AbstractC21690f;
import p349O0.C5984W0;
import p349O0.C5997d;
import p537W0.C8414f;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10458p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A1.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267l1 {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f979a = new C5984W0(C0244e0.f921P0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m858a(InterfaceC0258i1 interfaceC0258i1, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C0261j1 c0261j1;
        if (abstractC19687c instanceof C0261j1) {
            c0261j1 = (C0261j1) abstractC19687c;
            int i10 = c0261j1.f969Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0261j1.f969Z = i10 - Integer.MIN_VALUE;
            } else {
                c0261j1 = new C0261j1(abstractC19687c);
            }
        } else {
            c0261j1 = new C0261j1(abstractC19687c);
        }
        Object obj = c0261j1.f968Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0261j1.f969Z;
        if (i11 != 0) {
            if (i11 == 1) {
                throw AbstractC20734X.m21252w(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        if (!((AbstractC10458p) interfaceC0258i1).f30960Y.f30972y0) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        Owner ownerM22218w = AbstractC21690f.m22218w(interfaceC0258i1);
        C8414f c8414f = (C8414f) AbstractC21690f.m22217v(interfaceC0258i1).f68636G0;
        c8414f.getClass();
        if (C5997d.m6433T(c8414f, f979a) != null) {
            throw new ClassCastException();
        }
        c0261j1.f969Z = 1;
        m859b(ownerM22218w, interfaceC1439n, c0261j1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final void m859b(Owner owner, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C0264k1 c0264k1;
        if (abstractC19687c instanceof C0264k1) {
            c0264k1 = (C0264k1) abstractC19687c;
            int i10 = c0264k1.f975Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0264k1.f975Z = i10 - Integer.MIN_VALUE;
            } else {
                c0264k1 = new C0264k1(abstractC19687c);
            }
        } else {
            c0264k1 = new C0264k1(abstractC19687c);
        }
        Object obj = c0264k1.f974Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0264k1.f975Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c0264k1.f975Z = 1;
            ((AndroidComposeView) owner).m11337I(interfaceC1439n, c0264k1);
        } else {
            if (i11 == 1) {
                throw AbstractC20734X.m21252w(obj);
            }
            if (i11 == 2) {
                throw AbstractC20734X.m21252w(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
