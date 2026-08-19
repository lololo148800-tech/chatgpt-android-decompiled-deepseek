package bb;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: bb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11310e0 extends C11308d0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f34224Y).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f34224Y.iterator();
        it.getClass();
        InterfaceC10533f interfaceC10533f = this.f34225Z;
        interfaceC10533f.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC10533f.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C11310e0(((SortedSet) this.f34224Y).headSet(obj), this.f34225Z);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f34224Y;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f34225Z.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C11310e0(((SortedSet) this.f34224Y).subSet(obj, obj2), this.f34225Z);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C11310e0(((SortedSet) this.f34224Y).tailSet(obj), this.f34225Z);
    }
}
