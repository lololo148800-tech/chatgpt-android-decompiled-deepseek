package p571X9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p523V9.C8217w;
import p594Y9.AbstractC9860b4;
import p594Y9.AbstractC9867c4;
import p594Y9.AbstractC9881e4;

/* JADX INFO: renamed from: X9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9323m extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v0 */
    public static final Object f28134v0 = new Object();

    /* JADX INFO: renamed from: Y */
    public transient Object f28135Y;

    /* JADX INFO: renamed from: Z */
    public transient int[] f28136Z;

    /* JADX INFO: renamed from: o0 */
    public transient Object[] f28137o0;

    /* JADX INFO: renamed from: p0 */
    public transient Object[] f28138p0;

    /* JADX INFO: renamed from: q0 */
    public transient int f28139q0 = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: r0 */
    public transient int f28140r0;

    /* JADX INFO: renamed from: s0 */
    public transient C9311k f28141s0;

    /* JADX INFO: renamed from: t0 */
    public transient C9311k f28142t0;

    /* JADX INFO: renamed from: u0 */
    public transient C8217w f28143u0;

    /* JADX INFO: renamed from: a */
    public final Map m9914a() {
        Object obj = this.f28135Y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m9915b(int i10, int i11) {
        Object obj = this.f28135Y;
        obj.getClass();
        int[] iArr = this.f28136Z;
        iArr.getClass();
        Object[] objArr = this.f28137o0;
        objArr.getClass();
        Object[] objArr2 = this.f28138p0;
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
        int iM10522b = AbstractC9867c4.m10522b(obj2) & i11;
        int iM10514c = AbstractC9860b4.m10514c(iM10522b, obj);
        if (iM10514c == size) {
            AbstractC9860b4.m10516e(iM10522b, obj, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM10514c - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iM10514c = i15;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9916c() {
        return this.f28135Y == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m9916c()) {
            return;
        }
        this.f28139q0 += 32;
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            this.f28139q0 = Math.min(Math.max(size(), 3), 1073741823);
            mapM9914a.clear();
            this.f28135Y = null;
            this.f28140r0 = 0;
            return;
        }
        Object[] objArr = this.f28137o0;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f28140r0, (Object) null);
        Object[] objArr2 = this.f28138p0;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f28140r0, (Object) null);
        Object obj = this.f28135Y;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f28136Z;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f28140r0, 0);
        this.f28140r0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            return mapM9914a.containsKey(obj);
        }
        return m9918e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            return mapM9914a.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f28140r0; i10++) {
            Object[] objArr = this.f28138p0;
            objArr.getClass();
            if (AbstractC9881e4.m10535b(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m9917d() {
        return (1 << (this.f28139q0 & 31)) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final int m9918e(Object obj) {
        if (m9916c()) {
            return -1;
        }
        int iM10522b = AbstractC9867c4.m10522b(obj);
        int iM9917d = m9917d();
        Object obj2 = this.f28135Y;
        obj2.getClass();
        int iM10514c = AbstractC9860b4.m10514c(iM10522b & iM9917d, obj2);
        if (iM10514c != 0) {
            int i10 = ~iM9917d;
            int i11 = iM10522b & i10;
            do {
                int i12 = iM10514c - 1;
                int[] iArr = this.f28136Z;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f28137o0;
                    objArr.getClass();
                    if (AbstractC9881e4.m10535b(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iM10514c = i13 & iM9917d;
            } while (iM10514c != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C9311k c9311k = this.f28142t0;
        if (c9311k != null) {
            return c9311k;
        }
        C9311k c9311k2 = new C9311k(this, 0);
        this.f28142t0 = c9311k2;
        return c9311k2;
    }

    /* JADX INFO: renamed from: f */
    public final int m9919f(int i10, int i11, int i12, int i13) {
        Object objM10515d = AbstractC9860b4.m10515d(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC9860b4.m10516e(i12 & i14, objM10515d, i13 + 1);
        }
        Object obj = this.f28135Y;
        obj.getClass();
        int[] iArr = this.f28136Z;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM10514c = AbstractC9860b4.m10514c(i15, obj);
            while (iM10514c != 0) {
                int i16 = iM10514c - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM10514c2 = AbstractC9860b4.m10514c(i19, objM10515d);
                AbstractC9860b4.m10516e(i19, objM10515d, iM10514c);
                iArr[i16] = ((~i14) & i18) | (iM10514c2 & i14);
                iM10514c = i17 & i10;
            }
        }
        this.f28135Y = objM10515d;
        this.f28139q0 = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f28139q0 & (-32));
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public final Object m9920g(Object obj) {
        boolean zM9916c = m9916c();
        Object obj2 = f28134v0;
        if (zM9916c) {
            return obj2;
        }
        int iM9917d = m9917d();
        Object obj3 = this.f28135Y;
        obj3.getClass();
        int[] iArr = this.f28136Z;
        iArr.getClass();
        Object[] objArr = this.f28137o0;
        objArr.getClass();
        int iM10513b = AbstractC9860b4.m10513b(obj, null, iM9917d, obj3, iArr, objArr, null);
        if (iM10513b == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f28138p0;
        objArr2.getClass();
        Object obj4 = objArr2[iM10513b];
        m9915b(iM10513b, iM9917d);
        this.f28140r0--;
        this.f28139q0 += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            return mapM9914a.get(obj);
        }
        int iM9918e = m9918e(obj);
        if (iM9918e == -1) {
            return null;
        }
        Object[] objArr = this.f28138p0;
        objArr.getClass();
        return objArr[iM9918e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C9311k c9311k = this.f28141s0;
        if (c9311k != null) {
            return c9311k;
        }
        C9311k c9311k2 = new C9311k(this, 1);
        this.f28141s0 = c9311k2;
        return c9311k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i10 = -1;
        if (m9916c()) {
            if (!m9916c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.f28139q0;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f28135Y = AbstractC9860b4.m10515d(iMax2);
            this.f28139q0 = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f28139q0 & (-32));
            this.f28136Z = new int[i11];
            this.f28137o0 = new Object[i11];
            this.f28138p0 = new Object[i11];
        }
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            return mapM9914a.put(obj, obj2);
        }
        int[] iArr = this.f28136Z;
        iArr.getClass();
        Object[] objArr = this.f28137o0;
        objArr.getClass();
        Object[] objArr2 = this.f28138p0;
        objArr2.getClass();
        int i12 = this.f28140r0;
        int i13 = i12 + 1;
        int iM10522b = AbstractC9867c4.m10522b(obj);
        int iM9917d = m9917d();
        int i14 = iM10522b & iM9917d;
        Object obj3 = this.f28135Y;
        obj3.getClass();
        int iM10514c = AbstractC9860b4.m10514c(i14, obj3);
        if (iM10514c != 0) {
            int i15 = ~iM9917d;
            int i16 = iM10522b & i15;
            int i17 = 0;
            while (true) {
                int i18 = iM10514c + i10;
                int i19 = iArr[i18];
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC9881e4.m10535b(obj, objArr[i18])) {
                    Object obj4 = objArr2[i18];
                    objArr2[i18] = obj2;
                    return obj4;
                }
                int i21 = i19 & iM9917d;
                int i22 = i16;
                int i23 = i17 + 1;
                if (i21 == 0) {
                    if (i23 < 9) {
                        if (i13 <= iM9917d) {
                            iArr[i18] = (i13 & iM9917d) | i20;
                            break;
                        }
                        iM9917d = m9919f(iM9917d, (iM9917d + 1) * (iM9917d < 32 ? 4 : 2), iM10522b, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m9917d() + 1, 1.0f);
                    int i24 = isEmpty() ? -1 : 0;
                    while (i24 >= 0) {
                        Object[] objArr3 = this.f28137o0;
                        objArr3.getClass();
                        Object obj5 = objArr3[i24];
                        Object[] objArr4 = this.f28138p0;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i24]);
                        int i25 = i24 + 1;
                        i24 = i25 < this.f28140r0 ? i25 : -1;
                    }
                    this.f28135Y = linkedHashMap;
                    this.f28136Z = null;
                    this.f28137o0 = null;
                    this.f28138p0 = null;
                    this.f28139q0 += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iM10514c = i21;
                i17 = i23;
                i16 = i22;
                i10 = -1;
            }
        } else if (i13 > iM9917d) {
            iM9917d = m9919f(iM9917d, (iM9917d + 1) * (iM9917d < 32 ? 4 : 2), iM10522b, i12);
        } else {
            Object obj6 = this.f28135Y;
            obj6.getClass();
            AbstractC9860b4.m10516e(i14, obj6, i13);
        }
        int[] iArr2 = this.f28136Z;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            int[] iArr3 = this.f28136Z;
            iArr3.getClass();
            this.f28136Z = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f28137o0;
            objArr5.getClass();
            this.f28137o0 = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f28138p0;
            objArr6.getClass();
            this.f28138p0 = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.f28136Z;
        iArr4.getClass();
        iArr4[i12] = (~iM9917d) & iM10522b;
        Object[] objArr7 = this.f28137o0;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.f28138p0;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f28140r0 = i13;
        this.f28139q0 += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM9914a = m9914a();
        if (mapM9914a != null) {
            return mapM9914a.remove(obj);
        }
        Object objM9920g = m9920g(obj);
        if (objM9920g == f28134v0) {
            return null;
        }
        return objM9920g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM9914a = m9914a();
        return mapM9914a != null ? mapM9914a.size() : this.f28140r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f28143u0;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w((Serializable) this, 2);
        this.f28143u0 = c8217w2;
        return c8217w2;
    }
}
