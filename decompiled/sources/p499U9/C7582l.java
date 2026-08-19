package p499U9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p013Ab.C0420b;
import p594Y9.AbstractC9777O;
import p594Y9.AbstractC9789Q;

/* JADX INFO: renamed from: U9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7582l implements Map, Serializable, p817j$.util.Map {

    /* JADX INFO: renamed from: s0 */
    public static final C7582l f23998s0 = new C7582l(0, null, new Object[0]);

    /* JADX INFO: renamed from: Y */
    public transient C7579i f23999Y;

    /* JADX INFO: renamed from: Z */
    public transient C7580j f24000Z;

    /* JADX INFO: renamed from: o0 */
    public transient C7581k f24001o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object f24002p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f24003q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int f24004r0;

    public C7582l(int i10, Object obj, Object[] objArr) {
        this.f24002p0 = obj;
        this.f24003q0 = objArr;
        this.f24004r0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0129 A[PHI: r3
      0x0129: PHI (r3v5 ??) = (r3v2 ??), (r3v6 short[]) binds: [B:74:0x018f, B:57:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: a */
    public static C7582l m7925a(int i10, Object[] objArr, C0420b c0420b) {
        int iHighestOneBit;
        short[] sArr;
        char c9;
        char c10;
        ?? r6;
        ?? r10;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return f23998s0;
        }
        int i12 = 1;
        C7575e c7575e = null;
        ?? r11 = 0;
        C7575e c7575e2 = null;
        C7575e c7575e3 = null;
        if (i11 == 1) {
            objArrCopyOf[0].getClass();
            objArrCopyOf[1].getClass();
            return new C7582l(1, null, objArrCopyOf);
        }
        AbstractC9777O.m10385c(i11, objArrCopyOf.length >> 1);
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            objArrCopyOf[0].getClass();
            objArrCopyOf[1].getClass();
            c9 = 1;
            c10 = 2;
        } else {
            int i13 = iHighestOneBit - 1;
            byte b = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj = objArrCopyOf[i17];
                    obj.getClass();
                    Object obj2 = objArrCopyOf[i17 ^ i12];
                    obj2.getClass();
                    int iM10408b = AbstractC9789Q.m10408b(obj.hashCode());
                    while (true) {
                        int i18 = iM10408b & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj;
                                objArrCopyOf[i16 ^ 1] = obj2;
                            }
                            i15++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj3 = objArrCopyOf[i20 == true ? 1 : 0];
                            obj3.getClass();
                            c7575e2 = new C7575e(obj, obj2, obj3);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM10408b = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r6 = bArr;
                } else {
                    r10 = new Object[]{bArr, Integer.valueOf(i15), c7575e2};
                    c10 = 2;
                }
                c9 = 1;
                r11 = r10;
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj4 = objArrCopyOf[i24];
                    obj4.getClass();
                    Object obj5 = objArrCopyOf[i24 ^ 1];
                    obj5.getClass();
                    int iM10408b2 = AbstractC9789Q.m10408b(obj4.hashCode());
                    while (true) {
                        int i25 = iM10408b2 & i13;
                        char c11 = (char) sArr[i25];
                        if (c11 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArrCopyOf[i23] = obj4;
                                objArrCopyOf[i23 ^ 1] = obj5;
                            }
                            i21++;
                            break;
                        }
                        if (obj4.equals(objArrCopyOf[c11])) {
                            int i26 = c11 ^ 1;
                            Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                            obj6.getClass();
                            C7575e c7575e4 = new C7575e(obj4, obj5, obj6);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                            c7575e3 = c7575e4;
                            break;
                        }
                        iM10408b2 = i25 + 1;
                    }
                }
                if (i21 == i11) {
                    r6 = sArr;
                } else {
                    c10 = 2;
                    r11 = new Object[]{sArr, Integer.valueOf(i21), c7575e3};
                    c9 = 1;
                }
            } else {
                int i27 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i28 = 0;
                int i29 = 0;
                while (i28 < i11) {
                    int i30 = i29 + i29;
                    int i31 = i28 + i28;
                    Object obj7 = objArrCopyOf[i31];
                    obj7.getClass();
                    Object obj8 = objArrCopyOf[i31 ^ i27];
                    obj8.getClass();
                    int iM10408b3 = AbstractC9789Q.m10408b(obj7.hashCode());
                    while (true) {
                        int i32 = iM10408b3 & i13;
                        ?? r15 = sArr[i32];
                        if (r15 == b) {
                            sArr[i32] = i30;
                            if (i29 < i28) {
                                objArrCopyOf[i30] = obj7;
                                objArrCopyOf[i30 ^ 1] = obj8;
                            }
                            i29++;
                            break;
                        }
                        if (obj7.equals(objArrCopyOf[r15])) {
                            int i33 = r15 ^ 1;
                            Object obj9 = objArrCopyOf[i33 == true ? 1 : 0];
                            obj9.getClass();
                            C7575e c7575e5 = new C7575e(obj7, obj8, obj9);
                            objArrCopyOf[i33 == true ? 1 : 0] = obj8;
                            c7575e = c7575e5;
                            break;
                        }
                        iM10408b3 = i32 + 1;
                        b = -1;
                    }
                    i28++;
                    b = -1;
                    i27 = 1;
                }
                if (i29 == i11) {
                    r6 = sArr;
                } else {
                    c9 = 1;
                    c10 = 2;
                    r11 = new Object[]{sArr, Integer.valueOf(i29), c7575e};
                }
            }
            c10 = 2;
            r10 = r6;
            c9 = 1;
            r11 = r10;
        }
        boolean z6 = r11 instanceof Object[];
        ?? r12 = r11;
        if (z6) {
            Object[] objArr2 = (Object[]) r11;
            C7575e c7575e6 = (C7575e) objArr2[c10];
            if (c0420b == null) {
                throw c7575e6.m7924a();
            }
            c0420b.f1383p0 = c7575e6;
            Object obj10 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c9]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r12 = obj10;
            i11 = iIntValue;
        }
        return new C7582l(i11, r12, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return p817j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C7581k c7581k = this.f24001o0;
        if (c7581k == null) {
            c7581k = new C7581k(this.f24003q0, 1, this.f24004r0);
            this.f24001o0 = c7581k;
        }
        return c7581k.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C7579i c7579i = this.f23999Y;
        if (c7579i != null) {
            return c7579i;
        }
        C7579i c7579i2 = new C7579i(this, this.f24003q0, this.f24004r0);
        this.f23999Y = c7579i2;
        return c7579i2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f24003q0;
            if (this.f24004r0 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f24002p0;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM10408b = AbstractC9789Q.m10408b(obj.hashCode());
                    while (true) {
                        int i10 = iM10408b & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iM10408b = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM10408b2 = AbstractC9789Q.m10408b(obj.hashCode());
                    while (true) {
                        int i12 = iM10408b2 & length2;
                        char c9 = (char) sArr[i12];
                        if (c9 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c9])) {
                            obj2 = objArr[c9 ^ 1];
                        } else {
                            iM10408b2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM10408b3 = AbstractC9789Q.m10408b(obj.hashCode());
                    while (true) {
                        int i13 = iM10408b3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iM10408b3 = i13 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C7579i c7579i = this.f23999Y;
        if (c7579i == null) {
            c7579i = new C7579i(this, this.f24003q0, this.f24004r0);
            this.f23999Y = c7579i;
        }
        Iterator it = c7579i.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C7580j c7580j = this.f24000Z;
        if (c7580j != null) {
            return c7580j;
        }
        C7580j c7580j2 = new C7580j(this, new C7581k(this.f24003q0, 0, this.f24004r0));
        this.f24000Z = c7580j2;
        return c7580j2;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        p817j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24004r0;
    }

    public final String toString() {
        int i10 = this.f24004r0;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        boolean z6 = true;
        for (Map.Entry entry : (C7579i) entrySet()) {
            if (!z6) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z6 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C7581k c7581k = this.f24001o0;
        if (c7581k != null) {
            return c7581k;
        }
        C7581k c7581k2 = new C7581k(this.f24003q0, 1, this.f24004r0);
        this.f24001o0 = c7581k2;
        return c7581k2;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
