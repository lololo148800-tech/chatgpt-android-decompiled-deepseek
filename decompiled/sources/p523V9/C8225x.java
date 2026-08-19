package p523V9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p594Y9.AbstractC9762L2;
import p594Y9.AbstractC9780O2;
import p594Y9.AbstractC9786P2;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: V9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8225x extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v0 */
    public static final Object f25679v0 = new Object();

    /* JADX INFO: renamed from: Y */
    public transient Object f25680Y;

    /* JADX INFO: renamed from: Z */
    public transient int[] f25681Z;

    /* JADX INFO: renamed from: o0 */
    public transient Object[] f25682o0;

    /* JADX INFO: renamed from: p0 */
    public transient Object[] f25683p0;

    /* JADX INFO: renamed from: q0 */
    public transient int f25684q0 = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: r0 */
    public transient int f25685r0;

    /* JADX INFO: renamed from: s0 */
    public transient C8193t f25686s0;

    /* JADX INFO: renamed from: t0 */
    public transient C8193t f25687t0;

    /* JADX INFO: renamed from: u0 */
    public transient C8217w f25688u0;

    /* JADX INFO: renamed from: a */
    public final Map m8853a() {
        Object obj = this.f25680Y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m8854b(int i10, int i11) {
        Object obj = this.f25680Y;
        obj.getClass();
        int[] iArr = this.f25681Z;
        iArr.getClass();
        Object[] objArr = this.f25682o0;
        objArr.getClass();
        Object[] objArr2 = this.f25683p0;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int iM10400b = AbstractC9786P2.m10400b(obj2) & i11;
        int iM10390c = AbstractC9780O2.m10390c(iM10400b, obj);
        if (iM10390c == size) {
            AbstractC9780O2.m10392e(iM10400b, obj, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM10390c - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iM10390c = i15;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8855c() {
        return this.f25680Y == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m8855c()) {
            return;
        }
        this.f25684q0 += 32;
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            this.f25684q0 = Math.min(Math.max(size(), 3), 1073741823);
            mapM8853a.clear();
            this.f25680Y = null;
            this.f25685r0 = 0;
            return;
        }
        Object[] objArr = this.f25682o0;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f25685r0, (Object) null);
        Object[] objArr2 = this.f25683p0;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f25685r0, (Object) null);
        Object obj = this.f25680Y;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f25681Z;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f25685r0, 0);
        this.f25685r0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            return mapM8853a.containsKey(obj);
        }
        return m8857e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            return mapM8853a.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f25685r0; i10++) {
            Object[] objArr = this.f25683p0;
            objArr.getClass();
            if (AbstractC9762L2.m10365b(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m8856d() {
        return (1 << (this.f25684q0 & 31)) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final int m8857e(Object obj) {
        if (m8855c()) {
            return -1;
        }
        int iM10400b = AbstractC9786P2.m10400b(obj);
        int iM8856d = m8856d();
        Object obj2 = this.f25680Y;
        obj2.getClass();
        int iM10390c = AbstractC9780O2.m10390c(iM10400b & iM8856d, obj2);
        if (iM10390c != 0) {
            int i10 = ~iM8856d;
            int i11 = iM10400b & i10;
            do {
                int i12 = iM10390c - 1;
                int[] iArr = this.f25681Z;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f25682o0;
                    objArr.getClass();
                    if (AbstractC9762L2.m10365b(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iM10390c = i13 & iM8856d;
            } while (iM10390c != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C8193t c8193t = this.f25687t0;
        if (c8193t != null) {
            return c8193t;
        }
        C8193t c8193t2 = new C8193t(this, 0);
        this.f25687t0 = c8193t2;
        return c8193t2;
    }

    /* JADX INFO: renamed from: f */
    public final int m8858f(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objM10391d = AbstractC9780O2.m10391d(i11);
        if (i13 != 0) {
            AbstractC9780O2.m10392e(i12 & i14, objM10391d, i13 + 1);
        }
        Object obj = this.f25680Y;
        obj.getClass();
        int[] iArr = this.f25681Z;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM10390c = AbstractC9780O2.m10390c(i15, obj);
            while (iM10390c != 0) {
                int i16 = iM10390c - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM10390c2 = AbstractC9780O2.m10390c(i19, objM10391d);
                AbstractC9780O2.m10392e(i19, objM10391d, iM10390c);
                iArr[i16] = ((~i14) & i18) | (iM10390c2 & i14);
                iM10390c = i17 & i10;
            }
        }
        this.f25680Y = objM10391d;
        this.f25684q0 = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f25684q0 & (-32));
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public final Object m8859g(Object obj) {
        boolean zM8855c = m8855c();
        Object obj2 = f25679v0;
        if (zM8855c) {
            return obj2;
        }
        int iM8856d = m8856d();
        Object obj3 = this.f25680Y;
        obj3.getClass();
        int[] iArr = this.f25681Z;
        iArr.getClass();
        Object[] objArr = this.f25682o0;
        objArr.getClass();
        int iM10389b = AbstractC9780O2.m10389b(obj, null, iM8856d, obj3, iArr, objArr, null);
        if (iM10389b == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f25683p0;
        objArr2.getClass();
        Object obj4 = objArr2[iM10389b];
        m8854b(iM10389b, iM8856d);
        this.f25685r0--;
        this.f25684q0 += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            return mapM8853a.get(obj);
        }
        int iM8857e = m8857e(obj);
        if (iM8857e == -1) {
            return null;
        }
        Object[] objArr = this.f25683p0;
        objArr.getClass();
        return objArr[iM8857e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C8193t c8193t = this.f25686s0;
        if (c8193t != null) {
            return c8193t;
        }
        C8193t c8193t2 = new C8193t(this, 1);
        this.f25686s0 = c8193t2;
        return c8193t2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            return mapM8853a.remove(obj);
        }
        Object objM8859g = m8859g(obj);
        if (objM8859g == f25679v0) {
            return null;
        }
        return objM8859g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM8853a = m8853a();
        return mapM8853a != null ? mapM8853a.size() : this.f25685r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f25688u0;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w((Serializable) this, 0);
        this.f25688u0 = c8217w2;
        return c8217w2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i10 = -1;
        if (m8855c()) {
            if (!m8855c()) {
                throw new IllegalStateException(suYVq.glnHIn);
            }
            int i11 = this.f25684q0;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f25680Y = AbstractC9780O2.m10391d(iMax2);
            this.f25684q0 = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f25684q0 & (-32));
            this.f25681Z = new int[i11];
            this.f25682o0 = new Object[i11];
            this.f25683p0 = new Object[i11];
        }
        Map mapM8853a = m8853a();
        if (mapM8853a != null) {
            return mapM8853a.put(obj, obj2);
        }
        int[] iArr = this.f25681Z;
        iArr.getClass();
        Object[] objArr = this.f25682o0;
        objArr.getClass();
        Object[] objArr2 = this.f25683p0;
        objArr2.getClass();
        int i12 = this.f25685r0;
        int i13 = i12 + 1;
        int iM10400b = AbstractC9786P2.m10400b(obj);
        int iM8856d = m8856d();
        int i14 = iM10400b & iM8856d;
        Object obj3 = this.f25680Y;
        obj3.getClass();
        int iM10390c = AbstractC9780O2.m10390c(i14, obj3);
        if (iM10390c != 0) {
            int i15 = ~iM8856d;
            int i16 = iM10400b & i15;
            int i17 = 0;
            while (true) {
                int i18 = iM10390c + i10;
                int i19 = iArr[i18];
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC9762L2.m10365b(obj, objArr[i18])) {
                    Object obj4 = objArr2[i18];
                    objArr2[i18] = obj2;
                    return obj4;
                }
                int i21 = i19 & iM8856d;
                int i22 = i15;
                int i23 = i17 + 1;
                if (i21 == 0) {
                    if (i23 < 9) {
                        if (i13 <= iM8856d) {
                            iArr[i18] = (i13 & iM8856d) | i20;
                            break;
                        }
                        iM8856d = m8858f(iM8856d, (iM8856d + 1) * (iM8856d < 32 ? 4 : 2), iM10400b, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m8856d() + 1, 1.0f);
                    int i24 = isEmpty() ? -1 : 0;
                    while (i24 >= 0) {
                        Object[] objArr3 = this.f25682o0;
                        objArr3.getClass();
                        Object obj5 = objArr3[i24];
                        Object[] objArr4 = this.f25683p0;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i24]);
                        int i25 = i24 + 1;
                        i24 = i25 < this.f25685r0 ? i25 : -1;
                    }
                    this.f25680Y = linkedHashMap;
                    this.f25681Z = null;
                    this.f25682o0 = null;
                    this.f25683p0 = null;
                    this.f25684q0 += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i17 = i23;
                iM10390c = i21;
                i15 = i22;
                i10 = -1;
            }
        } else if (i13 > iM8856d) {
            iM8856d = m8858f(iM8856d, (iM8856d + 1) * (iM8856d < 32 ? 4 : 2), iM10400b, i12);
        } else {
            Object obj6 = this.f25680Y;
            obj6.getClass();
            AbstractC9780O2.m10392e(i14, obj6, i13);
        }
        int[] iArr2 = this.f25681Z;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            int[] iArr3 = this.f25681Z;
            iArr3.getClass();
            this.f25681Z = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f25682o0;
            objArr5.getClass();
            this.f25682o0 = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f25683p0;
            objArr6.getClass();
            this.f25683p0 = Arrays.copyOf(objArr6, iMin);
        }
        int i26 = (~iM8856d) & iM10400b;
        int[] iArr4 = this.f25681Z;
        iArr4.getClass();
        iArr4[i12] = i26;
        Object[] objArr7 = this.f25682o0;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.f25683p0;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f25685r0 = i13;
        this.f25684q0 += 32;
        return null;
    }
}
