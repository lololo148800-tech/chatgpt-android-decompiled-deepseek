package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.I */
/* JADX INFO: loaded from: classes.dex */
public final class C11013I extends LinkedHashMap {

    /* JADX INFO: renamed from: Z */
    public static final C11013I f33241Z;

    /* JADX INFO: renamed from: Y */
    public boolean f33242Y = true;

    static {
        C11013I c11013i = new C11013I();
        f33241Z = c11013i;
        c11013i.f33242Y = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m11870a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC11061w) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC11063y.f33343a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public final void m11871b() {
        if (!this.f33242Y) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C11013I m11872c() {
        if (isEmpty()) {
            return new C11013I();
        }
        C11013I c11013i = new C11013I(this);
        c11013i.f33242Y = true;
        return c11013i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11871b();
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
        int iM11870a = 0;
        for (Map.Entry entry : entrySet()) {
            iM11870a += m11870a(entry.getValue()) ^ m11870a(entry.getKey());
        }
        return iM11870a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m11871b();
        Charset charset = AbstractC11063y.f33343a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m11871b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC11063y.f33343a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11871b();
        return super.remove(obj);
    }
}
