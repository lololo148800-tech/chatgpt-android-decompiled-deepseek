package bb;

import android.gov.nist.core.Separators;
import java.util.Map;
import p499U9.AbstractC7589s;

/* JADX INFO: renamed from: bb.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11317j implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC7589s.m7931f(getKey(), entry.getKey()) && AbstractC7589s.m7931f(getValue(), entry.getValue());
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
