package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10972m0 extends AbstractList implements InterfaceC10924C, RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final C10923B f33071Y;

    public C10972m0(C10923B c10923b) {
        this.f33071Y = c10923b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    /* JADX INFO: renamed from: d */
    public final Object mo11432d(int i10) {
        return this.f33071Y.f32965Z.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f33071Y.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f33071Y.f32965Z);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    public final InterfaceC10924C getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C10970l0 c10970l0 = new C10970l0();
        c10970l0.f33070Y = this.f33071Y.iterator();
        return c10970l0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    /* JADX INFO: renamed from: l */
    public final void mo11433l(C10957f c10957f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        C10968k0 c10968k0 = new C10968k0();
        c10968k0.f33066Y = this.f33071Y.listIterator(i10);
        return c10968k0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33071Y.size();
    }
}
