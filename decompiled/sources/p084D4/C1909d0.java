package p084D4;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: D4.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1909d0 {

    /* JADX INFO: renamed from: a */
    public SparseArray f5579a;

    /* JADX INFO: renamed from: b */
    public int f5580b;

    /* JADX INFO: renamed from: c */
    public Set f5581c;

    /* JADX INFO: renamed from: a */
    public final C1907c0 m3025a(int i10) {
        SparseArray sparseArray = this.f5579a;
        C1907c0 c1907c0 = (C1907c0) sparseArray.get(i10);
        if (c1907c0 != null) {
            return c1907c0;
        }
        C1907c0 c1907c1 = new C1907c0();
        sparseArray.put(i10, c1907c1);
        return c1907c1;
    }
}
