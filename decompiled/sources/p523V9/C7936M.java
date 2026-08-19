package p523V9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p544W9.C8585X4;
import p544W9.C8591Y4;
import p544W9.C8597Z4;
import p571X9.C9389x;
import p571X9.C9395y;
import p571X9.C9401z;
import p594Y9.C9693A;
import p594Y9.C9699B;
import p594Y9.C9705C;

/* JADX INFO: renamed from: V9.M */
/* JADX INFO: loaded from: classes.dex */
public final class C7936M implements Map, Serializable, p817j$.util.Map {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25162Y;

    /* JADX INFO: renamed from: Z */
    public final transient Object[] f25163Z;

    /* JADX INFO: renamed from: o0 */
    public transient AbstractCollection f25164o0;

    /* JADX INFO: renamed from: p0 */
    public transient AbstractCollection f25165p0;

    /* JADX INFO: renamed from: q0 */
    public transient AbstractCollection f25166q0;

    public /* synthetic */ C7936M(int i10, Object[] objArr) {
        this.f25162Y = i10;
        this.f25163Z = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f25162Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f25162Y) {
            case 0:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            case 2:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f25162Y) {
            case 0:
                C7928L c7928l = (C7928L) this.f25166q0;
                if (c7928l == null) {
                    c7928l = new C7928L(1, this.f25163Z);
                    this.f25166q0 = c7928l;
                }
                return c7928l.contains(obj);
            case 1:
                C8597Z4 c8597z4 = (C8597Z4) this.f25166q0;
                if (c8597z4 == null) {
                    c8597z4 = new C8597Z4(1, this.f25163Z);
                    this.f25166q0 = c8597z4;
                }
                return c8597z4.contains(obj);
            case 2:
                C9401z c9401z = (C9401z) this.f25166q0;
                if (c9401z == null) {
                    c9401z = new C9401z(1, this.f25163Z);
                    this.f25166q0 = c9401z;
                }
                return c9401z.contains(obj);
            default:
                C9705C c9705c = (C9705C) this.f25166q0;
                if (c9705c == null) {
                    c9705c = new C9705C(1, this.f25163Z);
                    this.f25166q0 = c9705c;
                }
                return c9705c.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f25162Y) {
            case 0:
                C7912J c7912j = (C7912J) this.f25164o0;
                if (c7912j != null) {
                    return c7912j;
                }
                C7912J c7912j2 = new C7912J(this, this.f25163Z);
                this.f25164o0 = c7912j2;
                return c7912j2;
            case 1:
                C8585X4 c8585x4 = (C8585X4) this.f25164o0;
                if (c8585x4 != null) {
                    return c8585x4;
                }
                C8585X4 c8585x5 = new C8585X4(this, this.f25163Z);
                this.f25164o0 = c8585x5;
                return c8585x5;
            case 2:
                C9389x c9389x = (C9389x) this.f25164o0;
                if (c9389x != null) {
                    return c9389x;
                }
                C9389x c9389x2 = new C9389x(this, this.f25163Z);
                this.f25164o0 = c9389x2;
                return c9389x2;
            default:
                C9693A c9693a = (C9693A) this.f25164o0;
                if (c9693a != null) {
                    return c9693a;
                }
                C9693A c9693a2 = new C9693A(this, this.f25163Z);
                this.f25164o0 = c9693a2;
                return c9693a2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f25162Y) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        int i10 = this.f25162Y;
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        switch (this.f25162Y) {
            case 0:
                if (obj == null) {
                    obj2 = null;
                } else {
                    Object[] objArr = this.f25163Z;
                    Object obj6 = objArr[0];
                    obj6.getClass();
                    if (obj6.equals(obj)) {
                        obj2 = objArr[1];
                        obj2.getClass();
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else {
                    Object[] objArr2 = this.f25163Z;
                    Object obj7 = objArr2[0];
                    obj7.getClass();
                    if (obj7.equals(obj)) {
                        obj3 = objArr2[1];
                        obj3.getClass();
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            case 2:
                if (obj == null) {
                    obj4 = null;
                } else {
                    Object[] objArr3 = this.f25163Z;
                    Object obj8 = objArr3[0];
                    obj8.getClass();
                    if (obj8.equals(obj)) {
                        obj4 = objArr3[1];
                        obj4.getClass();
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
            default:
                if (obj == null) {
                    obj5 = null;
                } else {
                    Object[] objArr4 = this.f25163Z;
                    Object obj9 = objArr4[0];
                    obj9.getClass();
                    if (obj9.equals(obj)) {
                        obj5 = objArr4[1];
                        obj5.getClass();
                    } else {
                        obj5 = null;
                    }
                }
                if (obj5 == null) {
                    return null;
                }
                return obj5;
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f25162Y) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            case 2:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
            default:
                Object obj6 = get(obj);
                return obj6 != null ? obj6 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f25162Y) {
            case 0:
                C7912J c7912j = (C7912J) this.f25164o0;
                if (c7912j == null) {
                    c7912j = new C7912J(this, this.f25163Z);
                    this.f25164o0 = c7912j;
                }
                Iterator it = c7912j.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                C8585X4 c8585x4 = (C8585X4) this.f25164o0;
                if (c8585x4 == null) {
                    c8585x4 = new C8585X4(this, this.f25163Z);
                    this.f25164o0 = c8585x4;
                }
                Iterator it2 = c8585x4.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            case 2:
                C9389x c9389x = (C9389x) this.f25164o0;
                if (c9389x == null) {
                    c9389x = new C9389x(this, this.f25163Z);
                    this.f25164o0 = c9389x;
                }
                Iterator it3 = c9389x.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
            default:
                C9693A c9693a = (C9693A) this.f25164o0;
                if (c9693a == null) {
                    c9693a = new C9693A(this, this.f25163Z);
                    this.f25164o0 = c9693a;
                }
                Iterator it4 = c9693a.iterator();
                int iHashCode4 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    iHashCode4 += next4 != null ? next4.hashCode() : 0;
                }
                return iHashCode4;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f25162Y) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f25162Y) {
            case 0:
                C7920K c7920k = (C7920K) this.f25165p0;
                if (c7920k != null) {
                    return c7920k;
                }
                C7920K c7920k2 = new C7920K(this, new C7928L(0, this.f25163Z));
                this.f25165p0 = c7920k2;
                return c7920k2;
            case 1:
                C8591Y4 c8591y4 = (C8591Y4) this.f25165p0;
                if (c8591y4 != null) {
                    return c8591y4;
                }
                C8591Y4 c8591y5 = new C8591Y4(this, new C8597Z4(0, this.f25163Z));
                this.f25165p0 = c8591y5;
                return c8591y5;
            case 2:
                C9395y c9395y = (C9395y) this.f25165p0;
                if (c9395y != null) {
                    return c9395y;
                }
                C9395y c9395y2 = new C9395y(this, new C9401z(0, this.f25163Z));
                this.f25165p0 = c9395y2;
                return c9395y2;
            default:
                C9699B c9699b = (C9699B) this.f25165p0;
                if (c9699b != null) {
                    return c9699b;
                }
                C9699B c9699b2 = new C9699B(this, new C9705C(0, this.f25163Z));
                this.f25165p0 = c9699b2;
                return c9699b2;
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f25162Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f25162Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i10 = this.f25162Y;
        p817j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f25162Y) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.f25162Y) {
            case 0:
                boolean z6 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry : (C7912J) entrySet()) {
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
            case 1:
                boolean z10 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry2 : (C8585X4) entrySet()) {
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 2:
                boolean z11 = true;
                StringBuilder sb4 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb4.append('{');
                for (Map.Entry entry3 : (C9389x) entrySet()) {
                    if (!z11) {
                        sb4.append(", ");
                    }
                    sb4.append(entry3.getKey());
                    sb4.append('=');
                    sb4.append(entry3.getValue());
                    z11 = false;
                }
                sb4.append('}');
                return sb4.toString();
            default:
                boolean z12 = true;
                StringBuilder sb5 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb5.append('{');
                for (Map.Entry entry4 : (C9693A) entrySet()) {
                    if (!z12) {
                        sb5.append(", ");
                    }
                    sb5.append(entry4.getKey());
                    sb5.append('=');
                    sb5.append(entry4.getValue());
                    z12 = false;
                }
                sb5.append('}');
                return sb5.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f25162Y) {
            case 0:
                C7928L c7928l = (C7928L) this.f25166q0;
                if (c7928l != null) {
                    return c7928l;
                }
                C7928L c7928l2 = new C7928L(1, this.f25163Z);
                this.f25166q0 = c7928l2;
                return c7928l2;
            case 1:
                C8597Z4 c8597z4 = (C8597Z4) this.f25166q0;
                if (c8597z4 != null) {
                    return c8597z4;
                }
                C8597Z4 c8597z5 = new C8597Z4(1, this.f25163Z);
                this.f25166q0 = c8597z5;
                return c8597z5;
            case 2:
                C9401z c9401z = (C9401z) this.f25166q0;
                if (c9401z != null) {
                    return c9401z;
                }
                C9401z c9401z2 = new C9401z(1, this.f25163Z);
                this.f25166q0 = c9401z2;
                return c9401z2;
            default:
                C9705C c9705c = (C9705C) this.f25166q0;
                if (c9705c != null) {
                    return c9705c;
                }
                C9705C c9705c2 = new C9705C(1, this.f25163Z);
                this.f25166q0 = c9705c2;
                return c9705c2;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f25162Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i10 = this.f25162Y;
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
