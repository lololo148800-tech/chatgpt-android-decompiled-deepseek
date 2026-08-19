package p200Hm;

import p076Cm.InterfaceC1723a;
import p523V9.AbstractC7965P4;

/* JADX INFO: renamed from: Hm.e */
/* JADX INFO: loaded from: classes3.dex */
public class C3506e implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final int f10591Y;

    /* JADX INFO: renamed from: Z */
    public final int f10592Z;

    /* JADX INFO: renamed from: o0 */
    public final int f10593o0;

    public C3506e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f10591Y = i10;
        this.f10592Z = AbstractC7965P4.m8252c(i10, i11, i12);
        this.f10593o0 = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3506e) {
            if (!isEmpty() || !((C3506e) obj).isEmpty()) {
                C3506e c3506e = (C3506e) obj;
                if (this.f10591Y != c3506e.f10591Y || this.f10592Z != c3506e.f10592Z || this.f10593o0 != c3506e.f10593o0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C3507f iterator() {
        return new C3507f(this.f10591Y, this.f10592Z, this.f10593o0);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f10591Y * 31) + this.f10592Z) * 31) + this.f10593o0;
    }

    public boolean isEmpty() {
        int i10 = this.f10593o0;
        int i11 = this.f10592Z;
        int i12 = this.f10591Y;
        if (i10 > 0) {
            if (i12 <= i11) {
                return false;
            }
        } else if (i12 >= i11) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f10592Z;
        int i11 = this.f10591Y;
        int i12 = this.f10593o0;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
