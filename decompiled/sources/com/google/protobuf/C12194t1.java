package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.google.protobuf.t1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12194t1 extends AbstractList implements InterfaceC12190s0, RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final C12187r0 f37107Y;

    public C12194t1(C12187r0 c12187r0) {
        this.f37107Y = c12187r0;
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    /* JADX INFO: renamed from: d */
    public final Object mo14090d(int i10) {
        return this.f37107Y.f37096Z.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f37107Y.get(i10);
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f37107Y.f37096Z);
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    public final InterfaceC12190s0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C12191s1 c12191s1 = new C12191s1();
        c12191s1.f37101Y = this.f37107Y.iterator();
        return c12191s1;
    }

    @Override // com.google.protobuf.InterfaceC12190s0
    /* JADX INFO: renamed from: k */
    public final void mo14091k(AbstractC12171m abstractC12171m) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        C12188r1 c12188r1 = new C12188r1();
        c12188r1.f37097Y = this.f37107Y.listIterator(i10);
        return c12188r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37107Y.size();
    }
}
