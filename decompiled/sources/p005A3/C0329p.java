package p005A3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p644ab.AbstractC10531d;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: A3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0329p implements InterfaceC0328o {

    /* JADX INFO: renamed from: c */
    public static final C0329p f1144c = new C0329p(Collections.emptyMap());

    /* JADX INFO: renamed from: a */
    public int f1145a;

    /* JADX INFO: renamed from: b */
    public final Map f1146b;

    public C0329p(Map map) {
        this.f1146b = DesugarCollections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m966b(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final C0329p m967a(C0320g c0320g) {
        byte[] bytes;
        Map map = this.f1146b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList((ArrayList) c0320g.f1119b));
        for (int i10 = 0; i10 < listUnmodifiableList.size(); i10++) {
            map2.remove(listUnmodifiableList.get(i10));
        }
        HashMap map3 = new HashMap((HashMap) c0320g.f1118a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(AbstractC10531d.f31242c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return m966b(map, map2) ? this : new C0329p(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0329p.class != obj.getClass()) {
            return false;
        }
        return m966b(this.f1146b, ((C0329p) obj).f1146b);
    }

    public final int hashCode() {
        if (this.f1145a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f1146b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f1145a = iHashCode;
        }
        return this.f1145a;
    }
}
