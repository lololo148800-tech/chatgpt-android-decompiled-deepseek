package p817j$.util;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.p */
/* JADX INFO: loaded from: classes4.dex */
final class C15739p implements Map.Entry {

    /* JADX INFO: renamed from: a */
    private Map.Entry f49006a;

    C15739p(Map.Entry entry) {
        this.f49006a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f49006a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49006a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f49006a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = this.f49006a;
        Object key = entry2.getKey();
        Object key2 = entry.getKey();
        if (key == null) {
            zEquals = key2 == null;
        } else {
            zEquals = key.equals(key2);
        }
        if (zEquals) {
            Object value = entry2.getValue();
            Object value2 = entry.getValue();
            if (value == null) {
                zEquals2 = value2 == null;
            } else {
                zEquals2 = value.equals(value2);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f49006a.toString();
    }
}
