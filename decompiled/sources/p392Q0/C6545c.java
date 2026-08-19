package p392Q0;

import java.util.List;
import java.util.ListIterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6545c implements ListIterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final Object f21180Y;

    /* JADX INFO: renamed from: Z */
    public int f21181Z;

    public C6545c(int i10, List list) {
        this.f21180Y = list;
        this.f21181Z = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f21180Y.add(this.f21181Z, obj);
        this.f21181Z++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21181Z < this.f21180Y.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21181Z > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f21181Z;
        this.f21181Z = i10 + 1;
        return this.f21180Y.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21181Z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f21181Z - 1;
        this.f21181Z = i10;
        return this.f21180Y.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21181Z - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f21181Z - 1;
        this.f21181Z = i10;
        this.f21180Y.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f21180Y.set(this.f21181Z, obj);
    }
}
