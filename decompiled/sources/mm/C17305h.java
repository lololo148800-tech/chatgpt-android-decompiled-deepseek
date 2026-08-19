package mm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17305h implements Comparable {

    /* JADX INFO: renamed from: q0 */
    public static final C17305h f55128q0 = new C17305h(2, 1, 0);

    /* JADX INFO: renamed from: Y */
    public final int f55129Y;

    /* JADX INFO: renamed from: Z */
    public final int f55130Z;

    /* JADX INFO: renamed from: o0 */
    public final int f55131o0;

    /* JADX INFO: renamed from: p0 */
    public final int f55132p0;

    public C17305h(int i10, int i11, int i12) {
        this.f55129Y = i10;
        this.f55130Z = i11;
        this.f55131o0 = i12;
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            this.f55132p0 = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17305h other = (C17305h) obj;
        AbstractC16544l.m18094g(other, "other");
        return this.f55132p0 - other.f55132p0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C17305h c17305h = obj instanceof C17305h ? (C17305h) obj : null;
        return c17305h != null && this.f55132p0 == c17305h.f55132p0;
    }

    public final int hashCode() {
        return this.f55132p0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f55129Y);
        sb2.append('.');
        sb2.append(this.f55130Z);
        sb2.append('.');
        sb2.append(this.f55131o0);
        return sb2.toString();
    }
}
