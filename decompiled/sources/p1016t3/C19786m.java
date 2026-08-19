package p1016t3;

import android.util.SparseBooleanArray;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C19786m {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f62693a;

    public C19786m(SparseBooleanArray sparseBooleanArray) {
        this.f62693a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m20745a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f62693a;
        AbstractC20800b.m21318f(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19786m)) {
            return false;
        }
        C19786m c19786m = (C19786m) obj;
        int i10 = AbstractC20817s.f66106a;
        SparseBooleanArray sparseBooleanArray = this.f62693a;
        if (i10 >= 24) {
            return sparseBooleanArray.equals(c19786m.f62693a);
        }
        if (sparseBooleanArray.size() != c19786m.f62693a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            if (m20745a(i11) != c19786m.m20745a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = AbstractC20817s.f66106a;
        SparseBooleanArray sparseBooleanArray = this.f62693a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + m20745a(i11);
        }
        return size;
    }
}
