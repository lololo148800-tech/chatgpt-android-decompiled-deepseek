package p523V9;

import bb.C11290O;
import bb.C11311f;
import bb.C11316i;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p571X9.C9275e;
import p571X9.C9281f;
import p571X9.C9299i;
import p594Y9.C9869d;
import p594Y9.C9876e;
import p594Y9.C9896h;

/* JADX INFO: renamed from: V9.o */
/* JADX INFO: loaded from: classes.dex */
public class C8153o extends AbstractCollection implements List {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25577Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f25578Z;

    /* JADX INFO: renamed from: o0 */
    public Collection f25579o0;

    /* JADX INFO: renamed from: p0 */
    public final Collection f25580p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractCollection f25581q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Serializable f25582r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Serializable f25583s0;

    public C8153o(C8177r c8177r, Object obj, List list, C8153o c8153o) {
        this.f25583s0 = c8177r;
        this.f25582r0 = c8177r;
        this.f25578Z = obj;
        this.f25579o0 = list;
        this.f25581q0 = c8153o;
        this.f25580p0 = c8153o == null ? null : c8153o.f25579o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                boolean zIsEmpty = this.f25579o0.isEmpty();
                boolean zAdd = this.f25579o0.add(obj);
                if (!zAdd) {
                    return zAdd;
                }
                ((C8177r) this.f25582r0).getClass();
                if (!zIsEmpty) {
                    return zAdd;
                }
                m8707m();
                return true;
            case 1:
                m8708p();
                boolean zIsEmpty2 = this.f25579o0.isEmpty();
                boolean zAdd2 = this.f25579o0.add(obj);
                if (!zAdd2) {
                    return zAdd2;
                }
                ((C9299i) this.f25582r0).f28089p0++;
                if (!zIsEmpty2) {
                    return zAdd2;
                }
                m8707m();
                return true;
            case 2:
                m8708p();
                boolean zIsEmpty3 = this.f25579o0.isEmpty();
                boolean zAdd3 = this.f25579o0.add(obj);
                if (!zAdd3) {
                    return zAdd3;
                }
                ((C9896h) this.f25582r0).f29411p0++;
                if (!zIsEmpty3) {
                    return zAdd3;
                }
                m8707m();
                return true;
            default:
                m8705i();
                boolean zIsEmpty4 = this.f25579o0.isEmpty();
                boolean zAdd4 = this.f25579o0.add(obj);
                if (zAdd4) {
                    ((C11290O) this.f25582r0).f34182q0++;
                    if (zIsEmpty4) {
                        m8704f();
                    }
                }
                return zAdd4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.f25577Y) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.f25579o0.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                this.f25579o0.size();
                ((C8177r) this.f25582r0).getClass();
                if (size != 0) {
                    return zAddAll;
                }
                m8707m();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = this.f25579o0.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                ((C9299i) this.f25582r0).f28089p0 += this.f25579o0.size() - size2;
                if (size2 != 0) {
                    return zAddAll2;
                }
                m8707m();
                return true;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll3 = this.f25579o0.addAll(collection);
                if (!zAddAll3) {
                    return zAddAll3;
                }
                ((C9896h) this.f25582r0).f29411p0 += this.f25579o0.size() - size3;
                if (size3 != 0) {
                    return zAddAll3;
                }
                m8707m();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean zAddAll4 = this.f25579o0.addAll(collection);
                if (!zAddAll4) {
                    return zAddAll4;
                }
                ((C11290O) this.f25582r0).f34182q0 += this.f25579o0.size() - size4;
                if (size4 != 0) {
                    return zAddAll4;
                }
                m8704f();
                return zAddAll4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.f25577Y) {
            case 0:
                if (size() != 0) {
                    this.f25579o0.clear();
                    ((C8177r) this.f25582r0).getClass();
                    m8709q();
                    break;
                }
                break;
            case 1:
                int size = size();
                if (size != 0) {
                    this.f25579o0.clear();
                    ((C9299i) this.f25582r0).f28089p0 -= size;
                    m8709q();
                    break;
                }
                break;
            case 2:
                int size2 = size();
                if (size2 != 0) {
                    this.f25579o0.clear();
                    ((C9896h) this.f25582r0).f29411p0 -= size2;
                    m8709q();
                    break;
                }
                break;
            default:
                int size3 = size();
                if (size3 != 0) {
                    this.f25579o0.clear();
                    ((C11290O) this.f25582r0).f34182q0 -= size3;
                    m8706j();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return this.f25579o0.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return this.f25579o0.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.f25577Y) {
            case 0:
                if (obj == this) {
                    return true;
                }
                m8708p();
                return this.f25579o0.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                m8708p();
                return this.f25579o0.equals(obj);
            case 2:
                if (obj == this) {
                    return true;
                }
                m8708p();
                return this.f25579o0.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                m8705i();
                return this.f25579o0.equals(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8704f() {
        C8153o c8153o = (C8153o) this.f25581q0;
        if (c8153o != null) {
            c8153o.m8704f();
        } else {
            ((C11290O) this.f25582r0).f34181p0.put(this.f25578Z, this.f25579o0);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return ((List) this.f25579o0).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                return this.f25579o0.hashCode();
            case 1:
                m8708p();
                return this.f25579o0.hashCode();
            case 2:
                m8708p();
                return this.f25579o0.hashCode();
            default:
                m8705i();
                return this.f25579o0.hashCode();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m8705i() {
        Collection collection;
        C8153o c8153o = (C8153o) this.f25581q0;
        if (c8153o != null) {
            c8153o.m8705i();
            if (c8153o.f25579o0 != this.f25580p0) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f25579o0.isEmpty() || (collection = (Collection) ((C11290O) this.f25582r0).f34181p0.get(this.f25578Z)) == null) {
                return;
            }
            this.f25579o0 = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return ((List) this.f25579o0).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                return new C8113j(this);
            case 1:
                m8708p();
                return new C8113j(this, (byte) 0);
            case 2:
                m8708p();
                return new C8113j(this, (char) 0);
            default:
                m8705i();
                return new C8113j(this, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8706j() {
        C8153o c8153o = (C8153o) this.f25581q0;
        if (c8153o != null) {
            c8153o.m8706j();
        } else if (this.f25579o0.isEmpty()) {
            ((C11290O) this.f25582r0).f34181p0.remove(this.f25578Z);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return ((List) this.f25579o0).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                return new C8145n(this);
            case 1:
                m8708p();
                return new C9281f(this);
            case 2:
                m8708p();
                return new C9876e(this);
            default:
                m8705i();
                return new C11316i(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8707m() {
        switch (this.f25577Y) {
            case 0:
                C8153o c8153o = (C8153o) this.f25581q0;
                if (c8153o == null) {
                    ((C8177r) this.f25582r0).f25620o0.put(this.f25578Z, this.f25579o0);
                } else {
                    c8153o.m8707m();
                }
                break;
            case 1:
                C8153o c8153o2 = (C8153o) this.f25581q0;
                if (c8153o2 == null) {
                    ((C9299i) this.f25582r0).f28088o0.put(this.f25578Z, this.f25579o0);
                } else {
                    c8153o2.m8707m();
                }
                break;
            default:
                C8153o c8153o3 = (C8153o) this.f25581q0;
                if (c8153o3 == null) {
                    ((C9896h) this.f25582r0).f29410o0.put(this.f25578Z, this.f25579o0);
                } else {
                    c8153o3.m8707m();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m8708p() {
        Collection collection;
        Collection collection2;
        Collection collection3;
        switch (this.f25577Y) {
            case 0:
                C8153o c8153o = (C8153o) this.f25581q0;
                if (c8153o != null) {
                    c8153o.m8708p();
                    if (c8153o.f25579o0 != this.f25580p0) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.f25579o0.isEmpty() || (collection = (Collection) ((C8177r) this.f25582r0).f25620o0.get(this.f25578Z)) == null) {
                        return;
                    }
                    this.f25579o0 = collection;
                    return;
                }
            case 1:
                C8153o c8153o2 = (C8153o) this.f25581q0;
                if (c8153o2 != null) {
                    c8153o2.m8708p();
                    if (c8153o2.f25579o0 != this.f25580p0) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.f25579o0.isEmpty() || (collection2 = (Collection) ((C9299i) this.f25582r0).f28088o0.get(this.f25578Z)) == null) {
                        return;
                    }
                    this.f25579o0 = collection2;
                    return;
                }
            default:
                C8153o c8153o3 = (C8153o) this.f25581q0;
                if (c8153o3 != null) {
                    c8153o3.m8708p();
                    if (c8153o3.f25579o0 != this.f25580p0) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.f25579o0.isEmpty() || (collection3 = (Collection) ((C9896h) this.f25582r0).f29410o0.get(this.f25578Z)) == null) {
                        return;
                    }
                    this.f25579o0 = collection3;
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8709q() {
        switch (this.f25577Y) {
            case 0:
                C8153o c8153o = (C8153o) this.f25581q0;
                if (c8153o != null) {
                    c8153o.m8709q();
                } else if (this.f25579o0.isEmpty()) {
                    ((C8177r) this.f25582r0).f25620o0.remove(this.f25578Z);
                }
                break;
            case 1:
                C8153o c8153o2 = (C8153o) this.f25581q0;
                if (c8153o2 != null) {
                    c8153o2.m8709q();
                } else if (this.f25579o0.isEmpty()) {
                    ((C9299i) this.f25582r0).f28088o0.remove(this.f25578Z);
                }
                break;
            default:
                C8153o c8153o3 = (C8153o) this.f25581q0;
                if (c8153o3 != null) {
                    c8153o3.m8709q();
                } else if (this.f25579o0.isEmpty()) {
                    ((C9896h) this.f25582r0).f29410o0.remove(this.f25578Z);
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                boolean zRemove = this.f25579o0.remove(obj);
                if (zRemove) {
                    ((C8177r) this.f25582r0).getClass();
                    m8709q();
                }
                return zRemove;
            case 1:
                m8708p();
                boolean zRemove2 = this.f25579o0.remove(obj);
                if (zRemove2) {
                    ((C9299i) this.f25582r0).f28089p0--;
                    m8709q();
                }
                return zRemove2;
            case 2:
                m8708p();
                boolean zRemove3 = this.f25579o0.remove(obj);
                if (zRemove3) {
                    ((C9896h) this.f25582r0).f29411p0--;
                    m8709q();
                }
                return zRemove3;
            default:
                m8705i();
                boolean zRemove4 = this.f25579o0.remove(obj);
                if (zRemove4) {
                    ((C11290O) this.f25582r0).f34182q0--;
                    m8706j();
                }
                return zRemove4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.f25577Y) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean zRemoveAll = this.f25579o0.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                this.f25579o0.size();
                ((C8177r) this.f25582r0).getClass();
                m8709q();
                return zRemoveAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll2 = this.f25579o0.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                ((C9299i) this.f25582r0).f28089p0 += this.f25579o0.size() - size;
                m8709q();
                return zRemoveAll2;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zRemoveAll3 = this.f25579o0.removeAll(collection);
                if (!zRemoveAll3) {
                    return zRemoveAll3;
                }
                ((C9896h) this.f25582r0).f29411p0 += this.f25579o0.size() - size2;
                m8709q();
                return zRemoveAll3;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zRemoveAll4 = this.f25579o0.removeAll(collection);
                if (!zRemoveAll4) {
                    return zRemoveAll4;
                }
                ((C11290O) this.f25582r0).f34182q0 += this.f25579o0.size() - size3;
                m8706j();
                return zRemoveAll4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.f25577Y) {
            case 0:
                collection.getClass();
                size();
                boolean zRetainAll = this.f25579o0.retainAll(collection);
                if (zRetainAll) {
                    this.f25579o0.size();
                    ((C8177r) this.f25582r0).getClass();
                    m8709q();
                }
                return zRetainAll;
            case 1:
                collection.getClass();
                int size = size();
                boolean zRetainAll2 = this.f25579o0.retainAll(collection);
                if (zRetainAll2) {
                    ((C9299i) this.f25582r0).f28089p0 += this.f25579o0.size() - size;
                    m8709q();
                }
                return zRetainAll2;
            case 2:
                collection.getClass();
                int size2 = size();
                boolean zRetainAll3 = this.f25579o0.retainAll(collection);
                if (zRetainAll3) {
                    ((C9896h) this.f25582r0).f29411p0 += this.f25579o0.size() - size2;
                    m8709q();
                }
                return zRetainAll3;
            default:
                collection.getClass();
                int size3 = size();
                boolean zRetainAll4 = this.f25579o0.retainAll(collection);
                if (zRetainAll4) {
                    ((C11290O) this.f25582r0).f34182q0 += this.f25579o0.size() - size3;
                    m8706j();
                }
                return zRetainAll4;
        }
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return ((List) this.f25579o0).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return this.f25579o0.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                List listSubList = ((List) this.f25579o0).subList(i10, i11);
                C8153o c8153o = (C8153o) this.f25581q0;
                if (c8153o == null) {
                    c8153o = this;
                }
                C8177r c8177r = (C8177r) this.f25583s0;
                c8177r.getClass();
                boolean z6 = listSubList instanceof RandomAccess;
                Object obj = this.f25578Z;
                return z6 ? new C8137m(c8177r, obj, listSubList, c8153o) : new C8153o(c8177r, obj, listSubList, c8153o);
            case 1:
                m8708p();
                List listSubList2 = ((List) this.f25579o0).subList(i10, i11);
                C8153o c8153o2 = (C8153o) this.f25581q0;
                if (c8153o2 == null) {
                    c8153o2 = this;
                }
                C9299i c9299i = (C9299i) this.f25583s0;
                c9299i.getClass();
                boolean z10 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.f25578Z;
                return z10 ? new C9275e(c9299i, obj2, listSubList2, c8153o2) : new C8153o(c9299i, obj2, listSubList2, c8153o2);
            case 2:
                m8708p();
                List listSubList3 = ((List) this.f25579o0).subList(i10, i11);
                C8153o c8153o3 = (C8153o) this.f25581q0;
                if (c8153o3 == null) {
                    c8153o3 = this;
                }
                C9896h c9896h = (C9896h) this.f25583s0;
                c9896h.getClass();
                boolean z11 = listSubList3 instanceof RandomAccess;
                Object obj3 = this.f25578Z;
                return z11 ? new C9869d(c9896h, obj3, listSubList3, c8153o3) : new C8153o(c9896h, obj3, listSubList3, c8153o3);
            default:
                m8705i();
                List listSubList4 = ((List) this.f25579o0).subList(i10, i11);
                C8153o c8153o4 = (C8153o) this.f25581q0;
                if (c8153o4 == null) {
                    c8153o4 = this;
                }
                C11290O c11290o = (C11290O) this.f25583s0;
                c11290o.getClass();
                boolean z12 = listSubList4 instanceof RandomAccess;
                Object obj4 = this.f25578Z;
                return z12 ? new C11311f(c11290o, obj4, listSubList4, c8153o4) : new C8153o(c11290o, obj4, listSubList4, c8153o4);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                break;
            case 1:
                m8708p();
                break;
            case 2:
                m8708p();
                break;
            default:
                m8705i();
                break;
        }
        return this.f25579o0.toString();
    }

    public C8153o(C9299i c9299i, Object obj, List list, C8153o c8153o) {
        this.f25583s0 = c9299i;
        this.f25582r0 = c9299i;
        this.f25578Z = obj;
        this.f25579o0 = list;
        this.f25581q0 = c8153o;
        this.f25580p0 = c8153o == null ? null : c8153o.f25579o0;
    }

    public C8153o(C9896h c9896h, Object obj, List list, C8153o c8153o) {
        this.f25583s0 = c9896h;
        this.f25582r0 = c9896h;
        this.f25578Z = obj;
        this.f25579o0 = list;
        this.f25581q0 = c8153o;
        this.f25580p0 = c8153o == null ? null : c8153o.f25579o0;
    }

    public C8153o(C11290O c11290o, Object obj, List list, C8153o c8153o) {
        this.f25583s0 = c11290o;
        this.f25582r0 = c11290o;
        this.f25578Z = obj;
        this.f25579o0 = list;
        this.f25581q0 = c8153o;
        this.f25580p0 = c8153o == null ? null : c8153o.f25579o0;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                return new C8145n(this, i10);
            case 1:
                m8708p();
                return new C9281f(this, i10);
            case 2:
                m8708p();
                return new C9876e(this, i10);
            default:
                m8705i();
                return new C11316i(this, i10);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                Object objRemove = ((List) this.f25579o0).remove(i10);
                ((C8177r) this.f25583s0).getClass();
                m8709q();
                return objRemove;
            case 1:
                m8708p();
                Object objRemove2 = ((List) this.f25579o0).remove(i10);
                ((C9299i) this.f25583s0).f28089p0--;
                m8709q();
                return objRemove2;
            case 2:
                m8708p();
                Object objRemove3 = ((List) this.f25579o0).remove(i10);
                ((C9896h) this.f25583s0).f29411p0--;
                m8709q();
                return objRemove3;
            default:
                m8705i();
                Object objRemove4 = ((List) this.f25579o0).remove(i10);
                ((C11290O) this.f25583s0).f34182q0--;
                m8706j();
                return objRemove4;
        }
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.f25577Y) {
            case 0:
                m8708p();
                boolean zIsEmpty = this.f25579o0.isEmpty();
                ((List) this.f25579o0).add(i10, obj);
                ((C8177r) this.f25583s0).getClass();
                if (zIsEmpty) {
                    m8707m();
                }
                break;
            case 1:
                m8708p();
                boolean zIsEmpty2 = this.f25579o0.isEmpty();
                ((List) this.f25579o0).add(i10, obj);
                ((C9299i) this.f25583s0).f28089p0++;
                if (zIsEmpty2) {
                    m8707m();
                }
                break;
            case 2:
                m8708p();
                boolean zIsEmpty3 = this.f25579o0.isEmpty();
                ((List) this.f25579o0).add(i10, obj);
                ((C9896h) this.f25583s0).f29411p0++;
                if (zIsEmpty3) {
                    m8707m();
                }
                break;
            default:
                m8705i();
                boolean zIsEmpty4 = this.f25579o0.isEmpty();
                ((List) this.f25579o0).add(i10, obj);
                ((C11290O) this.f25583s0).f34182q0++;
                if (zIsEmpty4) {
                    m8704f();
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f25577Y) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.f25579o0).addAll(i10, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                this.f25579o0.size();
                ((C8177r) this.f25583s0).getClass();
                if (size != 0) {
                    return zAddAll;
                }
                m8707m();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = ((List) this.f25579o0).addAll(i10, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                ((C9299i) this.f25583s0).f28089p0 += this.f25579o0.size() - size2;
                if (size2 != 0) {
                    return zAddAll2;
                }
                m8707m();
                return true;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll3 = ((List) this.f25579o0).addAll(i10, collection);
                if (!zAddAll3) {
                    return zAddAll3;
                }
                ((C9896h) this.f25583s0).f29411p0 += this.f25579o0.size() - size3;
                if (size3 != 0) {
                    return zAddAll3;
                }
                m8707m();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean zAddAll4 = ((List) this.f25579o0).addAll(i10, collection);
                if (!zAddAll4) {
                    return zAddAll4;
                }
                ((C11290O) this.f25583s0).f34182q0 += this.f25579o0.size() - size4;
                if (size4 != 0) {
                    return zAddAll4;
                }
                m8704f();
                return zAddAll4;
        }
    }
}
