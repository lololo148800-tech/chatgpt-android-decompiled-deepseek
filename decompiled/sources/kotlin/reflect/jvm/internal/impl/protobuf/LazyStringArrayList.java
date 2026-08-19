package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public static final LazyStringList EMPTY = new LazyStringArrayList().getUnmodifiableView();

    /* JADX INFO: renamed from: Y */
    public final ArrayList f52745Y;

    public LazyStringArrayList() {
        this.f52745Y = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f52745Y.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i10) {
        ByteString byteStringCopyFromUtf8;
        ArrayList arrayList = this.f52745Y;
        Object obj = arrayList.get(i10);
        if (obj instanceof ByteString) {
            byteStringCopyFromUtf8 = (ByteString) obj;
        } else {
            byteStringCopyFromUtf8 = obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
        }
        if (byteStringCopyFromUtf8 != obj) {
            arrayList.set(i10, byteStringCopyFromUtf8);
        }
        return byteStringCopyFromUtf8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f52745Y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52745Y.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, String str) {
        this.f52745Y.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f52745Y.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        ArrayList arrayList = this.f52745Y;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                arrayList.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            arrayList.set(i10, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i10) {
        Object objRemove = this.f52745Y.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof ByteString ? ((ByteString) objRemove).toStringUtf8() : Internal.toStringUtf8((byte[]) objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i10, String str) {
        Object obj = this.f52745Y.set(i10, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f52745Y = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        this.f52745Y.add(byteString);
        ((AbstractList) this).modCount++;
    }
}
