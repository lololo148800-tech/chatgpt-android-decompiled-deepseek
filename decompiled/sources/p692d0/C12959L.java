package p692d0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.L */
/* JADX INFO: loaded from: classes.dex */
public class C12959L {

    /* JADX INFO: renamed from: Y */
    public int[] f41152Y;

    /* JADX INFO: renamed from: Z */
    public Object[] f41153Z;

    /* JADX INFO: renamed from: o0 */
    public int f41154o0;

    public C12959L(int i10) {
        this.f41152Y = i10 == 0 ? AbstractC13253a.f41865a : new int[i10];
        this.f41153Z = i10 == 0 ? AbstractC13253a.f41867c : new Object[i10 << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m14641a(Object obj) {
        int i10 = this.f41154o0 * 2;
        Object[] objArr = this.f41153Z;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m14642b(int i10) {
        int i11 = this.f41154o0;
        int[] iArr = this.f41152Y;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f41152Y = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41153Z, i10 * 2);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41153Z = objArrCopyOf;
        }
        if (this.f41154o0 != i11) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14643c(int i10, Object obj) {
        int i11 = this.f41154o0;
        if (i11 == 0) {
            return -1;
        }
        int iM14848a = AbstractC13253a.m14848a(i11, i10, this.f41152Y);
        if (iM14848a < 0 || AbstractC16544l.m18089b(obj, this.f41153Z[iM14848a << 1])) {
            return iM14848a;
        }
        int i12 = iM14848a + 1;
        while (i12 < i11 && this.f41152Y[i12] == i10) {
            if (AbstractC16544l.m18089b(obj, this.f41153Z[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM14848a - 1; i13 >= 0 && this.f41152Y[i13] == i10; i13--) {
            if (AbstractC16544l.m18089b(obj, this.f41153Z[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f41154o0 > 0) {
            this.f41152Y = AbstractC13253a.f41865a;
            this.f41153Z = AbstractC13253a.f41867c;
            this.f41154o0 = 0;
        }
        if (this.f41154o0 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m14644d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m14641a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m14644d(Object obj) {
        return obj == null ? m14645e() : m14643c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m14645e() {
        int i10 = this.f41154o0;
        if (i10 == 0) {
            return -1;
        }
        int iM14848a = AbstractC13253a.m14848a(i10, 0, this.f41152Y);
        if (iM14848a < 0 || this.f41153Z[iM14848a << 1] == null) {
            return iM14848a;
        }
        int i11 = iM14848a + 1;
        while (i11 < i10 && this.f41152Y[i11] == 0) {
            if (this.f41153Z[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM14848a - 1; i12 >= 0 && this.f41152Y[i12] == 0; i12--) {
            if (this.f41153Z[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C12959L) {
                int i10 = this.f41154o0;
                if (i10 != ((C12959L) obj).f41154o0) {
                    return false;
                }
                C12959L c12959l = (C12959L) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objM14646f = m14646f(i11);
                    Object objM14649j = m14649j(i11);
                    Object obj2 = c12959l.get(objM14646f);
                    if (objM14649j == null) {
                        if (obj2 != null || !c12959l.containsKey(objM14646f)) {
                            return false;
                        }
                    } else if (!objM14649j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f41154o0 != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f41154o0;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objM14646f2 = m14646f(i13);
                Object objM14649j2 = m14649j(i13);
                Object obj3 = ((Map) obj).get(objM14646f2);
                if (objM14649j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM14646f2)) {
                        return false;
                    }
                } else if (!objM14649j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m14646f(int i10) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f41154o0) {
            z6 = true;
        }
        if (z6) {
            return this.f41153Z[i10 << 1];
        }
        AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m14647g(int i10) {
        if (!(i10 >= 0 && i10 < this.f41154o0)) {
            AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f41153Z;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f41154o0;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f41152Y;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    AbstractC17678l.m19303j(i10, i14, i12, iArr, iArr);
                    Object[] objArr2 = this.f41153Z;
                    AbstractC17678l.m19304k(i11, i14 << 1, i12 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f41153Z;
                int i15 = i13 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
                AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
                this.f41152Y = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f41153Z, i16 << 1);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                this.f41153Z = objArrCopyOf;
                if (i12 != this.f41154o0) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    AbstractC17678l.m19303j(0, 0, i10, iArr, this.f41152Y);
                    AbstractC17678l.m19304k(0, 0, i11, objArr, this.f41153Z);
                }
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    AbstractC17678l.m19303j(i10, i17, i12, iArr, this.f41152Y);
                    AbstractC17678l.m19304k(i11, i17 << 1, i12 << 1, objArr, this.f41153Z);
                }
            }
            if (i12 != this.f41154o0) {
                throw new ConcurrentModificationException();
            }
            this.f41154o0 = i13;
        }
        return obj;
    }

    public Object get(Object obj) {
        int iM14644d = m14644d(obj);
        if (iM14644d >= 0) {
            return this.f41153Z[(iM14644d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM14644d = m14644d(obj);
        return iM14644d >= 0 ? this.f41153Z[(iM14644d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m14648h(int i10, Object obj) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f41154o0) {
            z6 = true;
        }
        if (!z6) {
            AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f41153Z;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f41152Y;
        Object[] objArr = this.f41153Z;
        int i10 = this.f41154o0;
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

    public final boolean isEmpty() {
        return this.f41154o0 <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m14649j(int i10) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f41154o0) {
            z6 = true;
        }
        if (z6) {
            return this.f41153Z[(i10 << 1) + 1];
        }
        AbstractC13253a.m14850c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f41154o0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM14643c = obj != null ? m14643c(iHashCode, obj) : m14645e();
        if (iM14643c >= 0) {
            int i11 = (iM14643c << 1) + 1;
            Object[] objArr = this.f41153Z;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iM14643c;
        int[] iArr = this.f41152Y;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f41152Y = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41153Z, i13 << 1);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41153Z = objArrCopyOf;
            if (i10 != this.f41154o0) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f41152Y;
            int i14 = i12 + 1;
            AbstractC17678l.m19303j(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f41153Z;
            AbstractC17678l.m19304k(i14 << 1, i12 << 1, this.f41154o0 << 1, objArr2, objArr2);
        }
        int i15 = this.f41154o0;
        if (i10 == i15) {
            int[] iArr3 = this.f41152Y;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f41153Z;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f41154o0 = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM14644d = m14644d(obj);
        if (iM14644d >= 0) {
            return m14647g(iM14644d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM14644d = m14644d(obj);
        if (iM14644d >= 0) {
            return m14648h(iM14644d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f41154o0;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f41154o0 * 28);
        sb2.append('{');
        int i10 = this.f41154o0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objM14646f = m14646f(i11);
            if (objM14646f != sb2) {
                sb2.append(objM14646f);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM14649j = m14649j(i11);
            if (objM14649j != sb2) {
                sb2.append(objM14649j);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM14644d = m14644d(obj);
        if (iM14644d < 0 || !AbstractC16544l.m18089b(obj2, m14649j(iM14644d))) {
            return false;
        }
        m14647g(iM14644d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM14644d = m14644d(obj);
        if (iM14644d < 0 || !AbstractC16544l.m18089b(obj2, m14649j(iM14644d))) {
            return false;
        }
        m14648h(iM14644d, obj3);
        return true;
    }
}
