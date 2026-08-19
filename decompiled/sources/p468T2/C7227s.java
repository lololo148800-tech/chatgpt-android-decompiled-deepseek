package p468T2;

import android.util.SparseArray;

/* JADX INFO: renamed from: T2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7227s {

    /* JADX INFO: renamed from: a */
    public final SparseArray f22926a;

    /* JADX INFO: renamed from: b */
    public C7230v f22927b;

    public C7227s(int i10) {
        this.f22926a = new SparseArray(i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m7625a(C7230v c7230v, int i10, int i11) {
        int iM7631a = c7230v.m7631a(i10);
        SparseArray sparseArray = this.f22926a;
        C7227s c7227s = sparseArray == null ? null : (C7227s) sparseArray.get(iM7631a);
        if (c7227s == null) {
            c7227s = new C7227s(1);
            sparseArray.put(c7230v.m7631a(i10), c7227s);
        }
        if (i11 > i10) {
            c7227s.m7625a(c7230v, i10 + 1, i11);
        } else {
            c7227s.f22927b = c7230v;
        }
    }
}
