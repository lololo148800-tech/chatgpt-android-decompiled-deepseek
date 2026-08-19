package p953q0;

import p049Bm.InterfaceC1436k;
import p054C0.C1497j;
import p658b5.C11242m;
import p692d0.AbstractC12956I;
import p692d0.C12950C;

/* JADX INFO: renamed from: q0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C18566Y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18587j0 f59144a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f59145b;

    /* JADX INFO: renamed from: c */
    public final C1497j f59146c;

    /* JADX INFO: renamed from: d */
    public C11242m f59147d;

    public C18566Y(InterfaceC18587j0 interfaceC18587j0, InterfaceC1436k interfaceC1436k) {
        this.f59144a = interfaceC18587j0;
        this.f59145b = interfaceC1436k;
        C1497j c1497j = new C1497j();
        int i10 = AbstractC12956I.f41149a;
        c1497j.f3972o0 = new C12950C(6);
        c1497j.f3973p0 = new C12950C(6);
        this.f59146c = c1497j;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC18565X m19943a(int i10, long j10) {
        C11242m c11242m = this.f59147d;
        if (c11242m == null) {
            return C18578f.f59179a;
        }
        C18585i0 c18585i0 = new C18585i0(c11242m, i10, j10, this.f59146c);
        ((InterfaceC18587j0) c11242m.f34020o0).mo19935b(c18585i0);
        return c18585i0;
    }
}
