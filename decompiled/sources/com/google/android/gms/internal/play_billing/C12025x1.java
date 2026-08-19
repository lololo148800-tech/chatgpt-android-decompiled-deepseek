package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12025x1 extends LinkedHashMap {

    /* JADX INFO: renamed from: Z */
    public static final C12025x1 f36355Z;

    /* JADX INFO: renamed from: Y */
    public boolean f36356Y = true;

    static {
        C12025x1 c12025x1 = new C12025x1();
        f36355Z = c12025x1;
        c12025x1.f36356Y = false;
    }

    /* JADX INFO: renamed from: a */
    public static C12025x1 m13557a() {
        return f36355Z;
    }

    /* JADX INFO: renamed from: e */
    public static int m13558e(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC11942c2) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC11989o1.f36309a;
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
    public final C12025x1 m13559b() {
        if (isEmpty()) {
            return new C12025x1();
        }
        C12025x1 c12025x1 = new C12025x1(this);
        c12025x1.f36356Y = true;
        return c12025x1;
    }

    /* JADX INFO: renamed from: c */
    public final void m13560c() {
        this.f36356Y = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13562f();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13561d() {
        return this.f36356Y;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m13562f() {
        if (!this.f36356Y) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM13558e = 0;
        for (Map.Entry entry : entrySet()) {
            iM13558e += m13558e(entry.getValue()) ^ m13558e(entry.getKey());
        }
        return iM13558e;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m13562f();
        Charset charset = AbstractC11989o1.f36309a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m13562f();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC11989o1.f36309a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m13562f();
        return super.remove(obj);
    }
}
