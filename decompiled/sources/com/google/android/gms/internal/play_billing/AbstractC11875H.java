package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import p817j$.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11875H extends AbstractC11872G implements NavigableSet, InterfaceC11936b0, SortedSet {

    /* JADX INFO: renamed from: o0 */
    public final transient Comparator f36133o0;

    /* JADX INFO: renamed from: p0 */
    public transient AbstractC11875H f36134p0;

    public AbstractC11875H(Comparator comparator) {
        this.f36133o0 = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f36133o0;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC11875H c11928z = this.f36134p0;
        if (c11928z == null) {
            C11928Z c11928z2 = (C11928Z) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c11928z2.f36133o0);
            if (!c11928z2.isEmpty()) {
                c11928z = new C11928Z(c11928z2.f36226q0.mo13225r(), comparatorReverseOrder);
            } else if (C11890M.f36160Y.equals(comparatorReverseOrder)) {
                c11928z = C11928Z.f36225r0;
            } else {
                C12027y c12027y = AbstractC11857B.f36097Z;
                c11928z = new C11928Z(C11907S.f36188q0, comparatorReverseOrder);
            }
            this.f36134p0 = c11928z;
            c11928z.f36134p0 = this;
        }
        return c11928z;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        C11928Z c11928z = (C11928Z) this;
        return c11928z.m13373w(0, c11928z.m13371u(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f36133o0.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        C11928Z c11928z = (C11928Z) this;
        C11928Z c11928zM13373w = c11928z.m13373w(c11928z.m13372v(obj, z6), c11928z.f36226q0.size());
        return c11928zM13373w.m13373w(0, c11928zM13373w.m13371u(obj2, z10));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        C11928Z c11928z = (C11928Z) this;
        return c11928z.m13373w(c11928z.m13372v(obj, true), c11928z.f36226q0.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        obj.getClass();
        C11928Z c11928z = (C11928Z) this;
        return c11928z.m13373w(0, c11928z.m13371u(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        obj.getClass();
        C11928Z c11928z = (C11928Z) this;
        return c11928z.m13373w(c11928z.m13372v(obj, z6), c11928z.f36226q0.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f36133o0.compare(obj, obj2) <= 0) {
            C11928Z c11928z = (C11928Z) this;
            C11928Z c11928zM13373w = c11928z.m13373w(c11928z.m13372v(obj, true), c11928z.f36226q0.size());
            return c11928zM13373w.m13373w(0, c11928zM13373w.m13371u(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
