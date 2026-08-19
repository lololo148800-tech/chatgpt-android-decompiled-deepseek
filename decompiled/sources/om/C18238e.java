package om;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1727e;
import p466T0.C7183j;
import p594Y9.AbstractC9734G4;

/* JADX INFO: renamed from: om.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18238e implements Map, Serializable, InterfaceC1727e {

    /* JADX INFO: renamed from: z0 */
    public static final C18238e f58110z0;

    /* JADX INFO: renamed from: Y */
    public Object[] f58111Y;

    /* JADX INFO: renamed from: Z */
    public Object[] f58112Z;

    /* JADX INFO: renamed from: o0 */
    public int[] f58113o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f58114p0;

    /* JADX INFO: renamed from: q0 */
    public int f58115q0;

    /* JADX INFO: renamed from: r0 */
    public int f58116r0;

    /* JADX INFO: renamed from: s0 */
    public int f58117s0;

    /* JADX INFO: renamed from: t0 */
    public int f58118t0;

    /* JADX INFO: renamed from: u0 */
    public int f58119u0;

    /* JADX INFO: renamed from: v0 */
    public C18239f f58120v0;

    /* JADX INFO: renamed from: w0 */
    public C7183j f58121w0;

    /* JADX INFO: renamed from: x0 */
    public C18239f f58122x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f58123y0;

    static {
        C18238e c18238e = new C18238e(0);
        c18238e.f58123y0 = true;
        f58110z0 = c18238e;
    }

    public C18238e() {
        this(8);
    }

    /* JADX INFO: renamed from: a */
    public final int m19754a(Object obj) {
        m19756c();
        while (true) {
            int iM19763k = m19763k(obj);
            int i10 = this.f58115q0 * 2;
            int length = this.f58114p0.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f58114p0;
                int i12 = iArr[iM19763k];
                if (i12 <= 0) {
                    int i13 = this.f58116r0;
                    Object[] objArr = this.f58111Y;
                    if (i13 >= objArr.length) {
                        m19760g(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f58116r0 = i14;
                    objArr[i13] = obj;
                    this.f58113o0[i13] = iM19763k;
                    iArr[iM19763k] = i14;
                    this.f58119u0++;
                    this.f58118t0++;
                    if (i11 > this.f58115q0) {
                        this.f58115q0 = i11;
                    }
                    return i13;
                }
                if (AbstractC16544l.m18089b(this.f58111Y[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    m19764l(this.f58114p0.length * 2);
                    break;
                }
                iM19763k = iM19763k == 0 ? this.f58114p0.length - 1 : iM19763k - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C18238e m19755b() {
        m19756c();
        this.f58123y0 = true;
        if (this.f58119u0 > 0) {
            return this;
        }
        C18238e c18238e = f58110z0;
        AbstractC16544l.m18092e(c18238e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c18238e;
    }

    /* JADX INFO: renamed from: c */
    public final void m19756c() {
        if (this.f58123y0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m19756c();
        int i10 = this.f58116r0 - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f58113o0;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f58114p0[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC9734G4.m10324c(this.f58111Y, 0, this.f58116r0);
        Object[] objArr = this.f58112Z;
        if (objArr != null) {
            AbstractC9734G4.m10324c(objArr, 0, this.f58116r0);
        }
        this.f58119u0 = 0;
        this.f58116r0 = 0;
        this.f58118t0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m19761h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m19762j(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m19757d(boolean z6) {
        int i10;
        Object[] objArr = this.f58112Z;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f58116r0;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f58113o0;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f58111Y;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z6) {
                    iArr[i12] = i13;
                    this.f58114p0[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC9734G4.m10324c(this.f58111Y, i12, i10);
        if (objArr != null) {
            AbstractC9734G4.m10324c(objArr, i12, this.f58116r0);
        }
        this.f58116r0 = i12;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19758e(Collection m6) {
        AbstractC16544l.m18094g(m6, "m");
        for (Object obj : m6) {
            if (obj != null) {
                try {
                    if (!m19759f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C18239f c18239f = this.f58122x0;
        if (c18239f != null) {
            return c18239f;
        }
        C18239f c18239f2 = new C18239f(this, 0);
        this.f58122x0 = c18239f2;
        return c18239f2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f58119u0 != map.size() || !m19758e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19759f(Map.Entry entry) {
        AbstractC16544l.m18094g(entry, "entry");
        int iM19761h = m19761h(entry.getKey());
        if (iM19761h < 0) {
            return false;
        }
        Object[] objArr = this.f58112Z;
        AbstractC16544l.m18091d(objArr);
        return AbstractC16544l.m18089b(objArr[iM19761h], entry.getValue());
    }

    /* JADX INFO: renamed from: g */
    public final void m19760g(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f58111Y;
        int length = objArr.length;
        int i11 = this.f58116r0;
        int i12 = length - i11;
        int i13 = i11 - this.f58119u0;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            m19757d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(...)");
            this.f58111Y = objArrCopyOf2;
            Object[] objArr2 = this.f58112Z;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f58112Z = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f58113o0, i15);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            this.f58113o0 = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f58114p0.length) {
                m19764l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM19761h = m19761h(obj);
        if (iM19761h < 0) {
            return null;
        }
        Object[] objArr = this.f58112Z;
        AbstractC16544l.m18091d(objArr);
        return objArr[iM19761h];
    }

    /* JADX INFO: renamed from: h */
    public final int m19761h(Object obj) {
        int iM19763k = m19763k(obj);
        int i10 = this.f58115q0;
        while (true) {
            int i11 = this.f58114p0[iM19763k];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC16544l.m18089b(this.f58111Y[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM19763k = iM19763k == 0 ? this.f58114p0.length - 1 : iM19763k - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C18236c c18236c = new C18236c(this, 0);
        int i10 = 0;
        while (c18236c.hasNext()) {
            int i11 = c18236c.f2085Y;
            C18238e c18238e = (C18238e) c18236c.f2088p0;
            if (i11 >= c18238e.f58116r0) {
                throw new NoSuchElementException();
            }
            c18236c.f2085Y = i11 + 1;
            c18236c.f2086Z = i11;
            Object obj = c18238e.f58111Y[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c18238e.f58112Z;
            AbstractC16544l.m18091d(objArr);
            Object obj2 = objArr[c18236c.f2086Z];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c18236c.m1539e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f58119u0 == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m19762j(Object obj) {
        int i10 = this.f58116r0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f58113o0[i10] >= 0) {
                Object[] objArr = this.f58112Z;
                AbstractC16544l.m18091d(objArr);
                if (AbstractC16544l.m18089b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m19763k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f58117s0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C18239f c18239f = this.f58120v0;
        if (c18239f != null) {
            return c18239f;
        }
        C18239f c18239f2 = new C18239f(this, 1);
        this.f58120v0 = c18239f2;
        return c18239f2;
    }

    /* JADX INFO: renamed from: l */
    public final void m19764l(int i10) {
        int[] iArr;
        this.f58118t0++;
        int i11 = 0;
        if (this.f58116r0 > this.f58119u0) {
            m19757d(false);
        }
        this.f58114p0 = new int[i10];
        this.f58117s0 = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f58116r0) {
            int i12 = i11 + 1;
            int iM19763k = m19763k(this.f58111Y[i11]);
            int i13 = this.f58115q0;
            while (true) {
                iArr = this.f58114p0;
                if (iArr[iM19763k] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM19763k = iM19763k == 0 ? iArr.length - 1 : iM19763k - 1;
            }
            iArr[iM19763k] = i12;
            this.f58113o0[i11] = iM19763k;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m19765m(int i10) {
        Object[] objArr = this.f58111Y;
        AbstractC16544l.m18094g(objArr, "<this>");
        objArr[i10] = null;
        Object[] objArr2 = this.f58112Z;
        if (objArr2 != null) {
            objArr2[i10] = null;
        }
        int length = this.f58113o0[i10];
        int i11 = this.f58115q0 * 2;
        int length2 = this.f58114p0.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f58114p0.length - 1 : length - 1;
            i13++;
            if (i13 > this.f58115q0) {
                this.f58114p0[i14] = 0;
            } else {
                int[] iArr = this.f58114p0;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iM19763k = m19763k(this.f58111Y[i16]) - length;
                        int[] iArr2 = this.f58114p0;
                        if ((iM19763k & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f58113o0[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f58113o0[i10] = -1;
            this.f58119u0--;
            this.f58118t0++;
        } while (i12 >= 0);
        this.f58114p0[i14] = -1;
        this.f58113o0[i10] = -1;
        this.f58119u0--;
        this.f58118t0++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m19756c();
        int iM19754a = m19754a(obj);
        Object[] objArr = this.f58112Z;
        if (objArr == null) {
            int length = this.f58111Y.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f58112Z = objArr;
        }
        if (iM19754a >= 0) {
            objArr[iM19754a] = obj2;
            return null;
        }
        int i10 = (-iM19754a) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC16544l.m18094g(from, "from");
        m19756c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m19760g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM19754a = m19754a(entry.getKey());
            Object[] objArr = this.f58112Z;
            if (objArr == null) {
                int length = this.f58111Y.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f58112Z = objArr;
            }
            if (iM19754a >= 0) {
                objArr[iM19754a] = entry.getValue();
            } else {
                int i10 = (-iM19754a) - 1;
                if (!AbstractC16544l.m18089b(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m19756c();
        int iM19761h = m19761h(obj);
        if (iM19761h < 0) {
            return null;
        }
        Object[] objArr = this.f58112Z;
        AbstractC16544l.m18091d(objArr);
        Object obj2 = objArr[iM19761h];
        m19765m(iM19761h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f58119u0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f58119u0 * 3) + 2);
        sb2.append("{");
        C18236c c18236c = new C18236c(this, 0);
        int i10 = 0;
        while (c18236c.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = c18236c.f2085Y;
            C18238e c18238e = (C18238e) c18236c.f2088p0;
            if (i11 >= c18238e.f58116r0) {
                throw new NoSuchElementException();
            }
            c18236c.f2085Y = i11 + 1;
            c18236c.f2086Z = i11;
            Object obj = c18238e.f58111Y[i11];
            if (obj == c18238e) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = c18238e.f58112Z;
            AbstractC16544l.m18091d(objArr);
            Object obj2 = objArr[c18236c.f2086Z];
            if (obj2 == c18238e) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            c18236c.m1539e();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C7183j c7183j = this.f58121w0;
        if (c7183j != null) {
            return c7183j;
        }
        C7183j c7183j2 = new C7183j(this);
        this.f58121w0 = c7183j2;
        return c7183j2;
    }

    public C18238e(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f58111Y = objArr;
        this.f58112Z = null;
        this.f58113o0 = iArr;
        this.f58114p0 = new int[iHighestOneBit];
        this.f58115q0 = 2;
        this.f58116r0 = 0;
        this.f58117s0 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
