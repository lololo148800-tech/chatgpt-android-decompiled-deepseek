package p732en;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: renamed from: en.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13445b implements Map.Entry {

    /* JADX INFO: renamed from: Y */
    public Map.Entry f42570Y;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42570Y.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f42570Y.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.f42570Y.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
