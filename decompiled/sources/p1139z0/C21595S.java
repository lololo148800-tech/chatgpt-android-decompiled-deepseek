package p1139z0;

import p001A.AbstractC0010F;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: z0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C21595S {

    /* JADX INFO: renamed from: a */
    public final int f68401a;

    /* JADX INFO: renamed from: b */
    public final int f68402b;

    public C21595S(int i10) {
        this.f68401a = i10;
        this.f68402b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21595S)) {
            return false;
        }
        C21595S c21595s = (C21595S) obj;
        return this.f68401a == c21595s.f68401a && this.f68402b == c21595s.f68402b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f68402b) + (AbstractC0010F.m24h(this.f68401a) * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + AbstractC20734X.m21228E(this.f68401a) + ", endAffinity=" + AbstractC20734X.m21228E(this.f68402b) + ')';
    }
}
