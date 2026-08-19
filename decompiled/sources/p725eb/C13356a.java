package p725eb;

import java.io.Serializable;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13356a implements Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f42393o0 = 0;

    /* JADX INFO: renamed from: Y */
    public final int[] f42394Y;

    /* JADX INFO: renamed from: Z */
    public final int f42395Z;

    static {
        new C13356a(new int[0]);
    }

    public C13356a(int[] iArr) {
        int length = iArr.length;
        this.f42394Y = iArr;
        this.f42395Z = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13356a)) {
            return false;
        }
        C13356a c13356a = (C13356a) obj;
        int i10 = c13356a.f42395Z;
        int i11 = this.f42395Z;
        if (i11 != i10) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC8020X.m8353c(i12, i11);
            int i13 = this.f42394Y[i12];
            AbstractC8020X.m8353c(i12, c13356a.f42395Z);
            if (i13 != c13356a.f42394Y[i12]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f42395Z; i11++) {
            i10 = (i10 * 31) + this.f42394Y[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f42395Z;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f42394Y;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
