package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.google.protobuf.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12187r0 extends AbstractC12141c implements InterfaceC12190s0, RandomAccess {

    /* JADX INFO: renamed from: Z */
    public final ArrayList f37096Z;

    static {
        new C12187r0(10).f37021Y = false;
    }

    public C12187r0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m13936f();
        this.f37096Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f37096Z.size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC12172m0
    /* JADX INFO: renamed from: b */
    public final InterfaceC12172m0 mo13855b(int i10) {
        ArrayList arrayList = this.f37096Z;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new C12187r0(arrayList2);
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m13936f();
        this.f37096Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    /* JADX INFO: renamed from: d */
    public final Object mo14090d(int i10) {
        return this.f37096Z.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f37096Z;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC12171m) {
            AbstractC12171m abstractC12171m = (AbstractC12171m) obj;
            str = abstractC12171m.m14012w();
            if (abstractC12171m.mo14003r()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC12175n0.f37050a);
            AbstractC12153g abstractC12153g = AbstractC12077B1.f36870a;
            if (AbstractC12077B1.f36870a.mo13994X(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f37096Z);
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    public final InterfaceC12190s0 getUnmodifiableView() {
        return this.f37021Y ? new C12194t1(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    /* JADX INFO: renamed from: k */
    public final void mo14091k(AbstractC12171m abstractC12171m) {
        m13936f();
        this.f37096Z.add(abstractC12171m);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m13936f();
        Object objRemove = this.f37096Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof AbstractC12171m ? ((AbstractC12171m) objRemove).m14012w() : new String((byte[]) objRemove, AbstractC12175n0.f37050a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m13936f();
        Object obj2 = this.f37096Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof AbstractC12171m ? ((AbstractC12171m) obj2).m14012w() : new String((byte[]) obj2, AbstractC12175n0.f37050a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37096Z.size();
    }

    public C12187r0(ArrayList arrayList) {
        this.f37096Z = arrayList;
    }

    @Override // com.google.protobuf.AbstractC12141c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m13936f();
        if (collection instanceof InterfaceC12190s0) {
            collection = ((InterfaceC12190s0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f37096Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
