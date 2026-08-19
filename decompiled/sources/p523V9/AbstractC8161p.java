package p523V9;

import android.gov.nist.core.Separators;
import java.util.Map;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9762L2;

/* JADX INFO: renamed from: V9.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8161p implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC9762L2.m10365b(getKey(), entry.getKey()) && AbstractC9762L2.m10365b(getValue(), entry.getValue())) {
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
        return AbstractC9306j0.m9890i(String.valueOf(getKey()), Separators.EQUALS, String.valueOf(getValue()));
    }
}
