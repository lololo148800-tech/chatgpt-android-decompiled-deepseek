package bb;

import java.io.Serializable;
import p001A.C0013G0;

/* JADX INFO: renamed from: bb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C11325r extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final C0013G0 f34254Y;

    public C11325r(C0013G0 c0013g0) {
        this.f34254Y = c0013g0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f34254Y.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11325r) {
            return this.f34254Y.equals(((C11325r) obj).f34254Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34254Y.hashCode();
    }

    public final String toString() {
        return this.f34254Y.toString();
    }
}
