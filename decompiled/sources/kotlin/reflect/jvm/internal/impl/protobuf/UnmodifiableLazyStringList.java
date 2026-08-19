package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p523V9.C7880F;
import p732en.C13452i;

/* JADX INFO: loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: Y */
    public final LazyStringList f52746Y;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f52746Y = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i10) {
        return this.f52746Y.getByteString(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.f52746Y.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        C7880F c7880f = new C7880F(3);
        c7880f.f24799Z = this.f52746Y.iterator();
        return c7880f;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        C13452i c13452i = new C13452i();
        c13452i.f42589Y = this.f52746Y.listIterator(i10);
        return c13452i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52746Y.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return this.f52746Y.get(i10);
    }
}
