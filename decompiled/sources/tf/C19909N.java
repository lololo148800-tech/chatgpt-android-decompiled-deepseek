package tf;

import java.util.List;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;

/* JADX INFO: renamed from: tf.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C19909N {

    /* JADX INFO: renamed from: a */
    public final C2153Q0 f63106a;

    /* JADX INFO: renamed from: b */
    public final C2217y0 f63107b;

    public C19909N() {
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C19911P());
        this.f63106a = c2153q0M3204c;
        this.f63107b = new C2217y0(c2153q0M3204c);
    }

    /* JADX INFO: renamed from: a */
    public static void m20798a(C19909N c19909n, List list, int i10, boolean z6, boolean z10, boolean z11, int i11) {
        int i12 = (i11 & 2) != 0 ? 0 : i10;
        boolean z12 = (i11 & 4) != 0 ? false : z6;
        boolean z13 = (i11 & 8) != 0 ? true : z10;
        boolean z14 = (i11 & 16) != 0 ? true : z11;
        c19909n.getClass();
        C19911P c19911p = new C19911P(list, i12, z12, z13, z14);
        C2153Q0 c2153q0 = c19909n.f63106a;
        c2153q0.getClass();
        c2153q0.m3251l(null, c19911p);
    }
}
