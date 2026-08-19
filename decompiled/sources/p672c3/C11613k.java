package p672c3;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p437Rn.C6949g;
import p492U1.C7542g;
import p523V9.AbstractC8070d4;
import p523V9.AbstractC8094g4;
import p537W0.AbstractC8411c;
import p637a3.AbstractC10491h;

/* JADX INFO: renamed from: c3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C11613k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35153Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f35154Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f35155o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11613k(Context context, C11617m c11617m) {
        super(2);
        this.f35154Z = context;
        this.f35155o0 = c11617m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        C11617m c11617m = this.f35155o0;
        Context context = this.f35154Z;
        switch (this.f35153Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6525T(1881995740);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = C5997d.m6430Q(new C7542g(0L), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                    c6021p.m6553p(false);
                    Boolean bool = Boolean.FALSE;
                    c6021p.m6525T(1881999935);
                    boolean zM6542f = c6021p.m6542f(c11617m) | c6021p.m6542f(context) | c6021p.m6542f(interfaceC5985X);
                    Object objM6514H2 = c6021p.m6514H();
                    C17296C c17296c2 = null;
                    if (zM6542f || objM6514H2 == c5975s) {
                        objM6514H2 = new C11611j(c11617m, context, interfaceC5985X, null);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    if (((Boolean) C5997d.m6431R((InterfaceC1439n) objM6514H2, c6021p, bool).getValue()).booleanValue()) {
                        c6021p.m6525T(-1786326291);
                        c6021p.m6525T(1882039614);
                        Object objM6514H3 = c6021p.m6514H();
                        if (objM6514H3 == c5975s) {
                            objM6514H3 = AbstractC2124C.m3210i(new C11625q(c11617m.f35169d, context, c11617m.f35170e, null));
                            c6021p.m6537c0(objM6514H3);
                        }
                        c6021p.m6553p(false);
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) C5997d.m6468x((InterfaceC2184i) objM6514H3, null, null, c6021p, 48, 2).getValue();
                        c6021p.m6525T(1882043230);
                        if (interfaceC1439n != null) {
                            AbstractC8094g4.m8560a(0, ((C7542g) interfaceC5985X.getValue()).f23896a, interfaceC1439n, c6021p, c11617m.f35173h);
                            c17296c2 = c17296c;
                        }
                        c6021p.m6553p(false);
                        if (c17296c2 == null) {
                            AbstractC8070d4.m8474a(0, c6021p);
                        }
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6525T(-1786102688);
                        AbstractC8070d4.m8474a(0, c6021p);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6525T(1882053955);
                    boolean zM6542f2 = c6021p.m6542f(c11617m);
                    Object objM6514H4 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H4 == c5975s) {
                        objM6514H4 = new C6949g(c11617m, 26);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6454j((InterfaceC1426a) objM6514H4, c6021p);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C6014l0 c6014l0Mo6405a = AbstractC10491h.f31087b.mo6405a(context);
                    C6014l0 c6014l0Mo6405a2 = AbstractC10491h.f31089d.mo6405a(c11617m.f35170e);
                    C6037x c6037x = AbstractC11635v.f35260a;
                    Bundle bundle = (Bundle) c11617m.f35176k.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    C5997d.m6442b(new C6014l0[]{c6014l0Mo6405a, c6014l0Mo6405a2, c6037x.mo6405a(bundle), AbstractC10491h.f31088c.mo6405a(c11617m.f35175j.getValue())}, AbstractC8411c.m8968b(1688971311, c6021p2, new C11613k(c11617m, context)), c6021p2, 48);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11613k(C11617m c11617m, Context context) {
        super(2);
        this.f35155o0 = c11617m;
        this.f35154Z = context;
    }
}
