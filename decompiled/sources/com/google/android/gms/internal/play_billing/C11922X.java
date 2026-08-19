package com.google.android.gms.internal.play_billing;

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
import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.X */
/* JADX INFO: loaded from: classes.dex */
public final class C11922X implements Map, Serializable, p817j$.util.Map {

    /* JADX INFO: renamed from: s0 */
    public static final C11922X f36210s0 = new C11922X(0, null, new Object[0]);

    /* JADX INFO: renamed from: Y */
    public transient C11913U f36211Y;

    /* JADX INFO: renamed from: Z */
    public transient C11916V f36212Z;

    /* JADX INFO: renamed from: o0 */
    public transient C11919W f36213o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object f36214p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f36215q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int f36216r0;

    public C11922X(int i10, Object obj, Object[] objArr) {
        this.f36214p0 = obj;
        this.f36215q0 = objArr;
        this.f36216r0 = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: a */
    public static C11922X m13361a(int i10, Object[] objArr, C0420b c0420b) {
        short[] sArr;
        char c9;
        char c10;
        ?? r6;
        ?? r10;
        ?? r11;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return f36210s0;
        }
        int i12 = 1;
        C11860C c11860c = null;
        ?? r12 = 0;
        C11860C c11860c2 = null;
        C11860C c11860c3 = null;
        if (i11 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C11922X(1, null, objArrCopyOf);
        }
        AbstractC11957g1.m13457u(i11, objArrCopyOf.length >> 1);
        int iM13263r = AbstractC11872G.m13263r(i10);
        if (i11 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i11 = 1;
            c9 = 1;
            c10 = 2;
        } else {
            int i13 = iM13263r - 1;
            byte b = -1;
            if (iM13263r <= 128) {
                byte[] bArr = new byte[iM13263r];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj = objArrCopyOf[i17];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj2);
                    int iM13442c = AbstractC11957g1.m13442c(obj.hashCode());
                    while (true) {
                        int i18 = iM13442c & i13;
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
                            Objects.requireNonNull(obj3);
                            c11860c2 = new C11860C(obj, obj2, obj3);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM13442c = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r10 = bArr;
                } else {
                    r11 = new Object[]{bArr, Integer.valueOf(i15), c11860c2};
                    c10 = 2;
                }
                c9 = 1;
                r12 = r11;
            } else {
                if (iM13263r <= 32768) {
                    sArr = new short[iM13263r];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj4 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM13442c2 = AbstractC11957g1.m13442c(obj4.hashCode());
                        while (true) {
                            int i25 = iM13442c2 & i13;
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
                                Objects.requireNonNull(obj6);
                                C11860C c11860c4 = new C11860C(obj4, obj5, obj6);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                                c11860c3 = c11860c4;
                                break;
                            }
                            iM13442c2 = i25 + 1;
                        }
                    }
                    if (i21 != i11) {
                        Integer numValueOf = Integer.valueOf(i21);
                        c9 = 1;
                        c10 = 2;
                        r6 = new Object[]{sArr, numValueOf, c11860c3};
                        r12 = r6;
                    }
                    r10 = sArr;
                } else {
                    int i27 = 1;
                    sArr = new int[iM13263r];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj7 = objArrCopyOf[i31];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i31 ^ i27];
                        Objects.requireNonNull(obj8);
                        int iM13442c3 = AbstractC11957g1.m13442c(obj7.hashCode());
                        while (true) {
                            int i32 = iM13442c3 & i13;
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
                                Objects.requireNonNull(obj9);
                                C11860C c11860c5 = new C11860C(obj7, obj8, obj9);
                                objArrCopyOf[i33 == true ? 1 : 0] = obj8;
                                c11860c = c11860c5;
                                break;
                            }
                            iM13442c3 = i32 + 1;
                            b = -1;
                        }
                        i28++;
                        i27 = 1;
                        b = -1;
                    }
                    if (i29 != i11) {
                        c9 = 1;
                        c10 = 2;
                        r6 = new Object[]{sArr, Integer.valueOf(i29), c11860c};
                        r12 = r6;
                    }
                    r10 = sArr;
                }
                c9 = 1;
                r12 = r11;
            }
            c10 = 2;
            r11 = r10;
            c9 = 1;
            r12 = r11;
        }
        boolean z6 = r12 instanceof Object[];
        ?? r13 = r12;
        if (z6) {
            Object[] objArr2 = (Object[]) r12;
            C11860C c11860c6 = (C11860C) objArr2[c10];
            if (c0420b == null) {
                throw c11860c6.m13258a();
            }
            c0420b.f1383p0 = c11860c6;
            Object obj10 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c9]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r13 = obj10;
            i11 = iIntValue;
        }
        return new C11922X(i11, r13, objArrCopyOf);
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
        C11919W c11919w = this.f36213o0;
        if (c11919w == null) {
            c11919w = new C11919W(this.f36215q0, 1, this.f36216r0);
            this.f36213o0 = c11919w;
        }
        return c11919w.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C11913U c11913u = this.f36211Y;
        if (c11913u != null) {
            return c11913u;
        }
        C11913U c11913u2 = new C11913U(this, this.f36215q0, this.f36216r0);
        this.f36211Y = c11913u2;
        return c11913u2;
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
            int i10 = this.f36216r0;
            Object[] objArr = this.f36215q0;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f36214p0;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM13442c = AbstractC11957g1.m13442c(obj.hashCode());
                    while (true) {
                        int i11 = iM13442c & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iM13442c = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM13442c2 = AbstractC11957g1.m13442c(obj.hashCode());
                    while (true) {
                        int i13 = iM13442c2 & length2;
                        char c9 = (char) sArr[i13];
                        if (c9 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c9])) {
                            obj2 = objArr[c9 ^ 1];
                        } else {
                            iM13442c2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM13442c3 = AbstractC11957g1.m13442c(obj.hashCode());
                    while (true) {
                        int i14 = iM13442c3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iM13442c3 = i14 + 1;
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
        C11913U c11913u = this.f36211Y;
        if (c11913u == null) {
            c11913u = new C11913U(this, this.f36215q0, this.f36216r0);
            this.f36211Y = c11913u;
        }
        Iterator it = c11913u.iterator();
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
        C11916V c11916v = this.f36212Z;
        if (c11916v != null) {
            return c11916v;
        }
        C11916V c11916v2 = new C11916V(this, new C11919W(this.f36215q0, 0, this.f36216r0));
        this.f36212Z = c11916v2;
        return c11916v2;
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
        return this.f36216r0;
    }

    public final String toString() {
        int i10 = this.f36216r0;
        AbstractC11957g1.m13448j(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        boolean z6 = true;
        for (Map.Entry entry : (C11913U) entrySet()) {
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
        C11919W c11919w = this.f36213o0;
        if (c11919w != null) {
            return c11919w;
        }
        C11919W c11919w2 = new C11919W(this.f36215q0, 1, this.f36216r0);
        this.f36213o0 = c11919w2;
        return c11919w2;
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
