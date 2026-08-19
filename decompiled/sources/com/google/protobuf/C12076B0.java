package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12076B0 extends LinkedHashMap {

    /* JADX INFO: renamed from: Z */
    public static final C12076B0 f36868Z;

    /* JADX INFO: renamed from: Y */
    public boolean f36869Y = true;

    static {
        C12076B0 c12076b0 = new C12076B0();
        f36868Z = c12076b0;
        c12076b0.f36869Y = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m13717a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC12151f0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC12175n0.f37050a;
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
    public final void m13718b() {
        if (!this.f36869Y) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C12076B0 m13719c() {
        if (isEmpty()) {
            return new C12076B0();
        }
        C12076B0 c12076b0 = new C12076B0(this);
        c12076b0.f36869Y = true;
        return c12076b0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13718b();
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
        int iM13717a = 0;
        for (Map.Entry entry : entrySet()) {
            iM13717a += m13717a(entry.getValue()) ^ m13717a(entry.getKey());
        }
        return iM13717a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m13718b();
        Charset charset = AbstractC12175n0.f37050a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m13718b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC12175n0.f37050a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m13718b();
        return super.remove(obj);
    }
}
