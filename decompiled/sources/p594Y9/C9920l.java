package p594Y9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p523V9.C8217w;

/* JADX INFO: renamed from: Y9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9920l extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v0 */
    public static final Object f29455v0 = new Object();

    /* JADX INFO: renamed from: Y */
    public transient Object f29456Y;

    /* JADX INFO: renamed from: Z */
    public transient int[] f29457Z;

    /* JADX INFO: renamed from: o0 */
    public transient Object[] f29458o0;

    /* JADX INFO: renamed from: p0 */
    public transient Object[] f29459p0;

    /* JADX INFO: renamed from: q0 */
    public transient int f29460q0 = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: r0 */
    public transient int f29461r0;

    /* JADX INFO: renamed from: s0 */
    public transient C9908j f29462s0;

    /* JADX INFO: renamed from: t0 */
    public transient C9908j f29463t0;

    /* JADX INFO: renamed from: u0 */
    public transient C8217w f29464u0;

    /* JADX INFO: renamed from: a */
    public final Map m10575a() {
        Object obj = this.f29456Y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m10576b(int i10, int i11) {
        Object obj = this.f29456Y;
        obj.getClass();
        int[] iArr = this.f29457Z;
        iArr.getClass();
        Object[] objArr = this.f29458o0;
        objArr.getClass();
        Object[] objArr2 = this.f29459p0;
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
        int iM10299b = AbstractC9704B4.m10299b(obj2) & i11;
        int iM10293d = AbstractC9698A4.m10293d(iM10299b, obj);
        if (iM10293d == size) {
            AbstractC9698A4.m10295f(iM10299b, obj, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM10293d - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iM10293d = i15;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10577c() {
        return this.f29456Y == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m10577c()) {
            return;
        }
        this.f29460q0 += 32;
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            this.f29460q0 = Math.min(Math.max(size(), 3), 1073741823);
            mapM10575a.clear();
            this.f29456Y = null;
            this.f29461r0 = 0;
            return;
        }
        Object[] objArr = this.f29458o0;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f29461r0, (Object) null);
        Object[] objArr2 = this.f29459p0;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f29461r0, (Object) null);
        Object obj = this.f29456Y;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f29457Z;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f29461r0, 0);
        this.f29461r0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            return mapM10575a.containsKey(obj);
        }
        return m10579e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            return mapM10575a.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f29461r0; i10++) {
            Object[] objArr = this.f29459p0;
            objArr.getClass();
            if (AbstractC9728F4.m10319b(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m10578d() {
        return (1 << (this.f29460q0 & 31)) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final int m10579e(Object obj) {
        if (m10577c()) {
            return -1;
        }
        int iM10299b = AbstractC9704B4.m10299b(obj);
        int iM10578d = m10578d();
        Object obj2 = this.f29456Y;
        obj2.getClass();
        int iM10293d = AbstractC9698A4.m10293d(iM10299b & iM10578d, obj2);
        if (iM10293d != 0) {
            int i10 = ~iM10578d;
            int i11 = iM10299b & i10;
            do {
                int i12 = iM10293d - 1;
                int[] iArr = this.f29457Z;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f29458o0;
                    objArr.getClass();
                    if (AbstractC9728F4.m10319b(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iM10293d = i13 & iM10578d;
            } while (iM10293d != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C9908j c9908j = this.f29463t0;
        if (c9908j != null) {
            return c9908j;
        }
        C9908j c9908j2 = new C9908j(this, 0);
        this.f29463t0 = c9908j2;
        return c9908j2;
    }

    /* JADX INFO: renamed from: f */
    public final int m10580f(int i10, int i11, int i12, int i13) {
        Object objM10294e = AbstractC9698A4.m10294e(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC9698A4.m10295f(i12 & i14, objM10294e, i13 + 1);
        }
        Object obj = this.f29456Y;
        obj.getClass();
        int[] iArr = this.f29457Z;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM10293d = AbstractC9698A4.m10293d(i15, obj);
            while (iM10293d != 0) {
                int i16 = iM10293d - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM10293d2 = AbstractC9698A4.m10293d(i19, objM10294e);
                AbstractC9698A4.m10295f(i19, objM10294e, iM10293d);
                iArr[i16] = ((~i14) & i18) | (iM10293d2 & i14);
                iM10293d = i17 & i10;
            }
        }
        this.f29456Y = objM10294e;
        this.f29460q0 = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f29460q0 & (-32));
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public final Object m10581g(Object obj) {
        boolean zM10577c = m10577c();
        Object obj2 = f29455v0;
        if (zM10577c) {
            return obj2;
        }
        int iM10578d = m10578d();
        Object obj3 = this.f29456Y;
        obj3.getClass();
        int[] iArr = this.f29457Z;
        iArr.getClass();
        Object[] objArr = this.f29458o0;
        objArr.getClass();
        int iM10292c = AbstractC9698A4.m10292c(obj, null, iM10578d, obj3, iArr, objArr, null);
        if (iM10292c == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f29459p0;
        objArr2.getClass();
        Object obj4 = objArr2[iM10292c];
        m10576b(iM10292c, iM10578d);
        this.f29461r0--;
        this.f29460q0 += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            return mapM10575a.get(obj);
        }
        int iM10579e = m10579e(obj);
        if (iM10579e == -1) {
            return null;
        }
        Object[] objArr = this.f29459p0;
        objArr.getClass();
        return objArr[iM10579e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C9908j c9908j = this.f29462s0;
        if (c9908j != null) {
            return c9908j;
        }
        C9908j c9908j2 = new C9908j(this, 1);
        this.f29462s0 = c9908j2;
        return c9908j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i10 = -1;
        if (m10577c()) {
            if (!m10577c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.f29460q0;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f29456Y = AbstractC9698A4.m10294e(iMax2);
            this.f29460q0 = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f29460q0 & (-32));
            this.f29457Z = new int[i11];
            this.f29458o0 = new Object[i11];
            this.f29459p0 = new Object[i11];
        }
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            return mapM10575a.put(obj, obj2);
        }
        int[] iArr = this.f29457Z;
        iArr.getClass();
        Object[] objArr = this.f29458o0;
        objArr.getClass();
        Object[] objArr2 = this.f29459p0;
        objArr2.getClass();
        int i12 = this.f29461r0;
        int i13 = i12 + 1;
        int iM10299b = AbstractC9704B4.m10299b(obj);
        int iM10578d = m10578d();
        int i14 = iM10299b & iM10578d;
        Object obj3 = this.f29456Y;
        obj3.getClass();
        int iM10293d = AbstractC9698A4.m10293d(i14, obj3);
        if (iM10293d != 0) {
            int i15 = ~iM10578d;
            int i16 = iM10299b & i15;
            int i17 = 0;
            while (true) {
                int i18 = iM10293d + i10;
                int i19 = iArr[i18];
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC9728F4.m10319b(obj, objArr[i18])) {
                    Object obj4 = objArr2[i18];
                    objArr2[i18] = obj2;
                    return obj4;
                }
                int i21 = i19 & iM10578d;
                int i22 = i16;
                int i23 = i17 + 1;
                if (i21 == 0) {
                    if (i23 < 9) {
                        if (i13 <= iM10578d) {
                            iArr[i18] = (i13 & iM10578d) | i20;
                            break;
                        }
                        iM10578d = m10580f(iM10578d, (iM10578d + 1) * (iM10578d < 32 ? 4 : 2), iM10299b, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m10578d() + 1, 1.0f);
                    int i24 = isEmpty() ? -1 : 0;
                    while (i24 >= 0) {
                        Object[] objArr3 = this.f29458o0;
                        objArr3.getClass();
                        Object obj5 = objArr3[i24];
                        Object[] objArr4 = this.f29459p0;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i24]);
                        int i25 = i24 + 1;
                        i24 = i25 < this.f29461r0 ? i25 : -1;
                    }
                    this.f29456Y = linkedHashMap;
                    this.f29457Z = null;
                    this.f29458o0 = null;
                    this.f29459p0 = null;
                    this.f29460q0 += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iM10293d = i21;
                i17 = i23;
                i16 = i22;
                i10 = -1;
            }
        } else if (i13 > iM10578d) {
            iM10578d = m10580f(iM10578d, (iM10578d + 1) * (iM10578d < 32 ? 4 : 2), iM10299b, i12);
        } else {
            Object obj6 = this.f29456Y;
            obj6.getClass();
            AbstractC9698A4.m10295f(i14, obj6, i13);
        }
        int[] iArr2 = this.f29457Z;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            int[] iArr3 = this.f29457Z;
            iArr3.getClass();
            this.f29457Z = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f29458o0;
            objArr5.getClass();
            this.f29458o0 = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f29459p0;
            objArr6.getClass();
            this.f29459p0 = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.f29457Z;
        iArr4.getClass();
        iArr4[i12] = (~iM10578d) & iM10299b;
        Object[] objArr7 = this.f29458o0;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.f29459p0;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f29461r0 = i13;
        this.f29460q0 += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM10575a = m10575a();
        if (mapM10575a != null) {
            return mapM10575a.remove(obj);
        }
        Object objM10581g = m10581g(obj);
        if (objM10581g == f29455v0) {
            return null;
        }
        return objM10581g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM10575a = m10575a();
        return mapM10575a != null ? mapM10575a.size() : this.f29461r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f29464u0;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w((Serializable) this, 4);
        this.f29464u0 = c8217w2;
        return c8217w2;
    }
}
