package p571X9;

import android.gov.nist.core.Separators;
import java.util.Map;
import p594Y9.AbstractC9881e4;

/* JADX INFO: renamed from: X9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9287g implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC9881e4.m10535b(getKey(), entry.getKey()) && AbstractC9881e4.m10535b(getValue(), entry.getValue())) {
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
