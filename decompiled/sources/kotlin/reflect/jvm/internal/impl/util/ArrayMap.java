package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076Cm.InterfaceC1723a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArrayMap<T> implements Iterable<T>, InterfaceC1723a {
    public ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract T get(int i10);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i10, T t10);
}
