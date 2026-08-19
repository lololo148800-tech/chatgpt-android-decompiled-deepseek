package p690cp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;
import p817j$.util.Objects;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: cp.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C12940z {

    /* JADX INFO: renamed from: a */
    public final int f41103a;

    /* JADX INFO: renamed from: b */
    public final int f41104b;

    /* JADX INFO: renamed from: c */
    public final int f41105c;

    /* JADX INFO: renamed from: d */
    public final int f41106d;

    public C12940z(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "lineIndex ", " must be >= 0"));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i11, "columnIndex ", " must be >= 0"));
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i12, "inputIndex ", " must be >= 0"));
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i13, "length ", " must be >= 0"));
        }
        this.f41103a = i10;
        this.f41104b = i11;
        this.f41105c = i12;
        this.f41106d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C12940z m14600a(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i10, "beginIndex ", " + must be >= 0"));
        }
        int i12 = this.f41106d;
        if (i10 > i12) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("beginIndex ", i10, i12, " must be <= length "));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i11, "endIndex ", " + must be >= 0"));
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("endIndex ", i11, i12, " must be <= length "));
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("beginIndex ", i10, i11, " must be <= endIndex "));
        }
        if (i10 == 0 && i11 == i12) {
            return this;
        }
        return new C12940z(this.f41103a, this.f41104b + i10, this.f41105c + i10, i11 - i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12940z.class != obj.getClass()) {
            return false;
        }
        C12940z c12940z = (C12940z) obj;
        return this.f41103a == c12940z.f41103a && this.f41104b == c12940z.f41104b && this.f41105c == c12940z.f41105c && this.f41106d == c12940z.f41106d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f41103a), Integer.valueOf(this.f41104b), Integer.valueOf(this.f41105c), Integer.valueOf(this.f41106d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SourceSpan{line=");
        sb2.append(this.f41103a);
        sb2.append(", column=");
        sb2.append(this.f41104b);
        sb2.append(", input=");
        sb2.append(this.f41105c);
        sb2.append(", length=");
        return AbstractC10763a.m11056n(sb2, this.f41106d, "}");
    }
}
