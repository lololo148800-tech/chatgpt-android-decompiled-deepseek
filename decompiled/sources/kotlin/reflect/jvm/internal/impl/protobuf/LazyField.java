package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(null);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
