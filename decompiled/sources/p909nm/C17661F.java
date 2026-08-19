package p909nm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import p586Y0.C9545D;

/* JADX INFO: renamed from: nm.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C17661F extends AbstractC17673g {

    /* JADX INFO: renamed from: Y */
    public final ArrayList f56447Y;

    public C17661F(ArrayList arrayList) {
        this.f56447Y = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f56447Y.add(AbstractC17680n.m19327G(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f56447Y.clear();
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: f */
    public final int mo7371f() {
        return this.f56447Y.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f56447Y.get(AbstractC17680n.m19325F(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C9545D(this, 0);
    }

    @Override // p909nm.AbstractC17673g
    /* JADX INFO: renamed from: j */
    public final Object mo7372j(int i10) {
        return this.f56447Y.remove(AbstractC17680n.m19325F(i10, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C9545D(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f56447Y.set(AbstractC17680n.m19325F(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C9545D(this, i10);
    }
}
