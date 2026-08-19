package p817j$.util;

import java.util.Set;

/* JADX INFO: renamed from: j$.util.j */
/* JADX INFO: loaded from: classes4.dex */
final class C15727j extends C15712f implements Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f48956b) {
            zEquals = this.f48955a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f48956b) {
            iHashCode = this.f48955a.hashCode();
        }
        return iHashCode;
    }
}
