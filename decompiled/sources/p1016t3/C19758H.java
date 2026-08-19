package p1016t3;

import android.util.SparseBooleanArray;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.H */
/* JADX INFO: loaded from: classes.dex */
public final class C19758H {

    /* JADX INFO: renamed from: a */
    public final C19786m f62567a;

    static {
        new SparseBooleanArray();
        AbstractC20800b.m21320h(!false);
        AbstractC20817s.m21425z(0);
    }

    public C19758H(C19786m c19786m) {
        this.f62567a = c19786m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19758H) {
            return this.f62567a.equals(((C19758H) obj).f62567a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62567a.hashCode();
    }
}
