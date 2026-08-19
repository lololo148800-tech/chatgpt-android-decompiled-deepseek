package p594Y9;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: Y9.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9883f implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC9728F4.m10319b(getKey(), entry.getKey()) && AbstractC9728F4.m10319b(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + Separators.EQUALS + getValue();
    }
}
