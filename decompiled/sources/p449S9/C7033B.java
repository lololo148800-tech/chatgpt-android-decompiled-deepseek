package p449S9;

import java.io.Serializable;

/* JADX INFO: renamed from: S9.B */
/* JADX INFO: loaded from: classes.dex */
public final class C7033B extends AbstractC7097w implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC7097w f22488Y;

    public C7033B(AbstractC7097w abstractC7097w) {
        this.f22488Y = abstractC7097w;
    }

    @Override // p449S9.AbstractC7097w
    /* JADX INFO: renamed from: a */
    public final AbstractC7097w mo7426a() {
        return this.f22488Y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f22488Y.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7033B) {
            return this.f22488Y.equals(((C7033B) obj).f22488Y);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f22488Y.hashCode();
    }

    public final String toString() {
        return this.f22488Y.toString().concat(".reverse()");
    }
}
