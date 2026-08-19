package p449S9;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: S9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7069g extends AbstractC7097w implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Comparator f22544Y;

    public C7069g(Comparator comparator) {
        comparator.getClass();
        this.f22544Y = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f22544Y.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7069g) {
            return this.f22544Y.equals(((C7069g) obj).f22544Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22544Y.hashCode();
    }

    public final String toString() {
        return this.f22544Y.toString();
    }
}
