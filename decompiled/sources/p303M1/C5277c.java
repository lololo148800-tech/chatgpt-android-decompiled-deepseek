package p303M1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p328N1.C5593i;
import p328N1.C5594j;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: M1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5277c {

    /* JADX INFO: renamed from: a */
    public int[] f17352a;

    /* JADX INFO: renamed from: b */
    public Object[] f17353b;

    /* JADX INFO: renamed from: c */
    public int f17354c;

    /* JADX INFO: renamed from: a */
    public final Object m5794a(Object obj) {
        int iM5796c = obj == null ? m5796c() : m5795b(obj.hashCode(), obj);
        if (iM5796c >= 0) {
            return this.f17353b[(iM5796c << 1) + 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m5795b(int i10, Object obj) {
        int i11 = this.f17354c;
        if (i11 == 0) {
            return -1;
        }
        int iM5783a = AbstractC5275a.m5783a(i11, i10, this.f17352a);
        if (iM5783a < 0 || AbstractC16544l.m18089b(obj, this.f17353b[iM5783a << 1])) {
            return iM5783a;
        }
        int i12 = iM5783a + 1;
        while (i12 < i11 && this.f17352a[i12] == i10) {
            if (AbstractC16544l.m18089b(obj, this.f17353b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM5783a - 1; i13 >= 0 && this.f17352a[i13] == i10; i13--) {
            if (AbstractC16544l.m18089b(obj, this.f17353b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: c */
    public final int m5796c() {
        int i10 = this.f17354c;
        if (i10 == 0) {
            return -1;
        }
        int iM5783a = AbstractC5275a.m5783a(i10, 0, this.f17352a);
        if (iM5783a < 0 || this.f17353b[iM5783a << 1] == null) {
            return iM5783a;
        }
        int i11 = iM5783a + 1;
        while (i11 < i10 && this.f17352a[i11] == 0) {
            if (this.f17353b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM5783a - 1; i12 >= 0 && this.f17352a[i12] == 0; i12--) {
            if (this.f17353b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX INFO: renamed from: d */
    public final Object m5797d(C5594j c5594j, C5593i c5593i) {
        int iHashCode;
        int iM5795b;
        int i10 = this.f17354c;
        if (c5594j == null) {
            iM5795b = m5796c();
            iHashCode = 0;
        } else {
            iHashCode = c5594j.hashCode();
            iM5795b = m5795b(iHashCode, c5594j);
        }
        if (iM5795b >= 0) {
            int i11 = (iM5795b << 1) + 1;
            Object[] objArr = this.f17353b;
            Object obj = objArr[i11];
            objArr[i11] = c5593i;
            return obj;
        }
        int i12 = ~iM5795b;
        int[] iArr = this.f17352a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f17352a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f17353b, i13 << 1);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f17353b = objArrCopyOf;
            if (i10 != this.f17354c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f17352a;
            int i14 = i12 + 1;
            AbstractC17678l.m19303j(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f17353b;
            AbstractC17678l.m19304k(i14 << 1, i12 << 1, this.f17354c << 1, objArr2, objArr2);
        }
        int i15 = this.f17354c;
        if (i10 == i15) {
            int[] iArr3 = this.f17352a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f17353b;
                int i16 = i12 << 1;
                objArr3[i16] = c5594j;
                objArr3[i16 + 1] = c5593i;
                this.f17354c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C5277c) {
                C5277c c5277c = (C5277c) obj;
                int i10 = this.f17354c;
                if (i10 != c5277c.f17354c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr = this.f17353b;
                    int i12 = i11 << 1;
                    Object obj2 = objArr[i12];
                    Object obj3 = objArr[i12 + 1];
                    Object objM5794a = c5277c.m5794a(obj2);
                    if (obj3 == null) {
                        if (objM5794a == null) {
                            if ((obj2 == null ? c5277c.m5796c() : c5277c.m5795b(obj2.hashCode(), obj2)) >= 0) {
                            }
                        }
                        return false;
                    }
                    if (!obj3.equals(objM5794a)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f17354c != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f17354c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object[] objArr2 = this.f17353b;
                int i15 = i14 << 1;
                Object obj4 = objArr2[i15];
                Object obj5 = objArr2[i15 + 1];
                Object obj6 = ((Map) obj).get(obj4);
                if (obj5 == null) {
                    if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                        return false;
                    }
                } else if (!obj5.equals(obj6)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f17352a;
        Object[] objArr = this.f17353b;
        int i10 = this.f17354c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f17354c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f17354c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f17353b[i13];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f17353b[i13 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
