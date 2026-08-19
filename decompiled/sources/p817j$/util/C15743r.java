package p817j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import p817j$.util.stream.AbstractC16012y0;
import p817j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.r */
/* JADX INFO: loaded from: classes4.dex */
final class C15743r extends C16023u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // p817j$.util.C15731l, java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.m17238a(this.f49002a, new C15737o(consumer));
    }

    @Override // p817j$.util.C15731l, java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public final Spliterator spliterator() {
        return new C15741q(Collection.EL.m17240c(this.f49002a));
    }

    @Override // p817j$.util.C15731l, java.util.Collection, p817j$.util.Collection
    public final Stream stream() {
        return AbstractC16012y0.m17556f0(spliterator(), false);
    }

    @Override // p817j$.util.C15731l, java.util.Collection, p817j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC16012y0.m17556f0(spliterator(), true);
    }

    @Override // p817j$.util.C15731l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C15729k(this);
    }

    @Override // p817j$.util.C15731l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f49002a.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new C15739p((Map.Entry) array[i10]);
        }
        return array;
    }

    @Override // p817j$.util.C15731l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f49002a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new C15739p((Map.Entry) array[i10]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // p817j$.util.C15731l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f49002a.contains(new C15739p((Map.Entry) obj));
    }

    @Override // p817j$.util.C15731l, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p817j$.util.C16023u, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.f49002a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
