package p449S9;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import p817j$.util.SortedSet;

/* JADX INFO: renamed from: S9.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7093s extends AbstractC7085o implements NavigableSet, InterfaceC7035D, SortedSet {

    /* JADX INFO: renamed from: p0 */
    public final transient Comparator f22580p0;

    /* JADX INFO: renamed from: q0 */
    public transient AbstractC7093s f22581q0;

    public AbstractC7093s(Comparator comparator) {
        this.f22580p0 = comparator;
    }

    /* JADX INFO: renamed from: w */
    public static C7100z m7505w(Comparator comparator) {
        if (C7096v.f22584Y.equals(comparator)) {
            return C7100z.f22595s0;
        }
        C7073i c7073i = AbstractC7081m.f22562Z;
        return new C7100z(C7098x.f22585q0, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f22580p0;
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
        C7100z c7100z = (C7100z) this;
        return c7100z.m7511z(0, c7100z.m7509x(obj, false));
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

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        C7100z c7100z = (C7100z) this;
        return c7100z.m7511z(c7100z.m7510y(obj, true), c7100z.f22596r0.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC7093s descendingSet() {
        AbstractC7093s abstractC7093sM7505w = this.f22581q0;
        if (abstractC7093sM7505w == null) {
            C7100z c7100z = (C7100z) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c7100z.f22580p0);
            abstractC7093sM7505w = c7100z.isEmpty() ? m7505w(comparatorReverseOrder) : new C7100z(c7100z.f22596r0.mo7489q(), comparatorReverseOrder);
            this.f22581q0 = abstractC7093sM7505w;
            abstractC7093sM7505w.f22581q0 = this;
        }
        return abstractC7093sM7505w;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C7100z subSet(Object obj, boolean z6, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f22580p0.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        C7100z c7100z = (C7100z) this;
        C7100z c7100zM7511z = c7100z.m7511z(c7100z.m7510y(obj, z6), c7100z.f22596r0.size());
        return c7100zM7511z.m7511z(0, c7100zM7511z.m7509x(obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        obj.getClass();
        C7100z c7100z = (C7100z) this;
        return c7100z.m7511z(0, c7100z.m7509x(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        obj.getClass();
        C7100z c7100z = (C7100z) this;
        return c7100z.m7511z(c7100z.m7510y(obj, z6), c7100z.f22596r0.size());
    }
}
