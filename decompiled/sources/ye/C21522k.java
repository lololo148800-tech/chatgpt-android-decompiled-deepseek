package ye;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ye.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21522k {

    /* JADX INFO: renamed from: a */
    public final C21523l f68152a;

    /* JADX INFO: renamed from: b */
    public final boolean f68153b;

    /* JADX INFO: renamed from: c */
    public final C21523l f68154c;

    public C21522k(C21523l c21523l, boolean z6, C21523l c21523l2) {
        this.f68152a = c21523l;
        this.f68153b = z6;
        this.f68154c = c21523l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21522k)) {
            return false;
        }
        C21522k c21522k = (C21522k) obj;
        return AbstractC16544l.m18089b(this.f68152a, c21522k.f68152a) && this.f68153b == c21522k.f68153b && AbstractC16544l.m18089b(this.f68154c, c21522k.f68154c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f68152a.hashCode() * 31) + (this.f68153b ? 1231 : 1237)) * 31;
        C21523l c21523l = this.f68154c;
        return iHashCode + (c21523l == null ? 0 : c21523l.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
