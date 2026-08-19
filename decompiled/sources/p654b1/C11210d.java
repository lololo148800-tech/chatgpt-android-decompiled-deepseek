package p654b1;

import android.view.ViewStructure;

/* JADX INFO: renamed from: b1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11210d {

    /* JADX INFO: renamed from: a */
    public static final C11210d f33884a = new C11210d();

    /* JADX INFO: renamed from: a */
    public final int m12394a(ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    /* JADX INFO: renamed from: b */
    public final ViewStructure m12395b(ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    /* JADX INFO: renamed from: c */
    public final void m12396c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    /* JADX INFO: renamed from: d */
    public final void m12397d(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }
}
