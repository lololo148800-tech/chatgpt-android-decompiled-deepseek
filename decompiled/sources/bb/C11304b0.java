package bb;

import java.io.Serializable;

/* JADX INFO: renamed from: bb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11304b0 extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11293S f34218Y;

    public C11304b0(AbstractC11293S abstractC11293S) {
        this.f34218Y = abstractC11293S;
    }

    @Override // bb.AbstractC11293S
    /* JADX INFO: renamed from: a */
    public final AbstractC11293S mo12712a() {
        return this.f34218Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f34218Y.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11304b0) {
            return this.f34218Y.equals(((C11304b0) obj).f34218Y);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f34218Y.hashCode();
    }

    public final String toString() {
        return this.f34218Y + ".reverse()";
    }
}
