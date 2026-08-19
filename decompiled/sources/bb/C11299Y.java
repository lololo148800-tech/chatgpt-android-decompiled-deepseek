package bb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p013Ab.C0420b;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C11299Y implements Map, Serializable, p817j$.util.Map {

    /* JADX INFO: renamed from: s0 */
    public static final C11299Y f34197s0 = new C11299Y(0, null, new Object[0]);

    /* JADX INFO: renamed from: Y */
    public transient C11296V f34198Y;

    /* JADX INFO: renamed from: Z */
    public transient C11297W f34199Z;

    /* JADX INFO: renamed from: o0 */
    public transient C11298X f34200o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object f34201p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f34202q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int f34203r0;

    public C11299Y(int i10, Object obj, Object[] objArr) {
        this.f34201p0 = obj;
        this.f34202q0 = objArr;
        this.f34203r0 = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C11299Y m12713a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z6 = setEntrySet instanceof Collection;
        C0420b c0420b = new C0420b(z6 ? setEntrySet.size() : 4);
        if (z6) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) c0420b.f1382o0;
            if (size > objArr.length) {
                c0420b.f1382o0 = Arrays.copyOf(objArr, AbstractC11330w.m12760e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c0420b.m1038A(entry.getKey(), entry.getValue());
        }
        return c0420b.m1052g();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC11281F entrySet() {
        C11296V c11296v = this.f34198Y;
        if (c11296v != null) {
            return c11296v;
        }
        C11296V c11296v2 = new C11296V(this, this.f34202q0, this.f34203r0);
        this.f34198Y = c11296v2;
        return c11296v2;
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
        C11298X c11298x = this.f34200o0;
        if (c11298x == null) {
            c11298x = new C11298X(this.f34202q0, 1, this.f34203r0);
            this.f34200o0 = c11298x;
        }
        return c11298x.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC11320m.m12726f(this, obj);
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
            Object[] objArr = this.f34202q0;
            if (this.f34203r0 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f34201p0;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM12736p = AbstractC11320m.m12736p(obj.hashCode());
                    while (true) {
                        int i10 = iM12736p & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iM12736p = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM12736p2 = AbstractC11320m.m12736p(obj.hashCode());
                    while (true) {
                        int i12 = iM12736p2 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iM12736p2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM12736p3 = AbstractC11320m.m12736p(obj.hashCode());
                    while (true) {
                        int i14 = iM12736p3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iM12736p3 = i14 + 1;
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
        return AbstractC11320m.m12730j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C11297W c11297w = this.f34199Z;
        if (c11297w != null) {
            return c11297w;
        }
        C11297W c11297w2 = new C11297W(this, new C11298X(this.f34202q0, 0, this.f34203r0));
        this.f34199Z = c11297w2;
        return c11297w2;
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
        return this.f34203r0;
    }

    public final String toString() {
        int i10 = this.f34203r0;
        AbstractC11320m.m12724c(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        AbstractC11314g0 it = ((C11296V) entrySet()).iterator();
        boolean z6 = true;
        while (true) {
            C11276A c11276a = (C11276A) it;
            if (!c11276a.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) c11276a.next();
            if (!z6) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z6 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C11298X c11298x = this.f34200o0;
        if (c11298x != null) {
            return c11298x;
        }
        C11298X c11298x2 = new C11298X(this.f34202q0, 1, this.f34203r0);
        this.f34200o0 = c11298x2;
        return c11298x2;
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
