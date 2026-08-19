package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: loaded from: classes2.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: Y */
    public final Object f53293Y;

    /* JADX INFO: renamed from: Z */
    public final int f53294Z;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    public static final class C166381 implements Iterator<T>, InterfaceC1723a {

        /* JADX INFO: renamed from: Y */
        public boolean f53295Y = true;

        public C166381() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53295Y;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f53295Y) {
                throw new NoSuchElementException();
            }
            this.f53295Y = false;
            return (T) OneElementArrayMap.this.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T value, int i10) {
        super(null);
        AbstractC16544l.m18094g(value, "value");
        this.f53293Y = value;
        this.f53294Z = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i10) {
        if (i10 == this.f53294Z) {
            return (T) this.f53293Y;
        }
        return null;
    }

    public final int getIndex() {
        return this.f53294Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return (T) this.f53293Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C166381();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, T value) {
        AbstractC16544l.m18094g(value, "value");
        throw new IllegalStateException();
    }
}
