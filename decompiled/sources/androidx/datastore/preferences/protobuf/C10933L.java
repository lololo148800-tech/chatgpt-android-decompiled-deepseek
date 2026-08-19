package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.L */
/* JADX INFO: loaded from: classes.dex */
public final class C10933L extends LinkedHashMap {

    /* JADX INFO: renamed from: Z */
    public static final C10933L f32976Z;

    /* JADX INFO: renamed from: Y */
    public boolean f32977Y = true;

    static {
        C10933L c10933l = new C10933L();
        f32976Z = c10933l;
        c10933l.f32977Y = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m11457a() {
        if (!this.f32977Y) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C10933L m11458b() {
        if (isEmpty()) {
            return new C10933L();
        }
        C10933L c10933l = new C10933L(this);
        c10933l.f32977Y = true;
        return c10933l;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11457a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z6;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                Iterator it = entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    } else {
                        z6 = true;
                    }
                }
            }
            z6 = false;
        } else {
            z6 = true;
        }
        return z6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC10993x.f33099a;
                iHashCode = bArr.length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC10993x.f33099a;
                iHashCode2 = bArr2.length;
                for (byte b10 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b10;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m11457a();
        Charset charset = AbstractC10993x.f33099a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m11457a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC10993x.f33099a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11457a();
        return super.remove(obj);
    }
}
