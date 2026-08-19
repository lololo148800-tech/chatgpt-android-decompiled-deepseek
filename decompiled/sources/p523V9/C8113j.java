package p523V9;

import bb.C11290O;
import bb.C11305c;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import p037B9.MeDP.MpoABj;
import p571X9.C9263c;
import p571X9.C9269d;
import p571X9.C9275e;
import p571X9.C9299i;
import p571X9.C9335o;
import p594Y9.C9855b;
import p594Y9.C9862c;
import p594Y9.C9869d;
import p594Y9.C9896h;
import p594Y9.C9932n;

/* JADX INFO: renamed from: V9.j */
/* JADX INFO: loaded from: classes.dex */
public class C8113j implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25447Y;

    /* JADX INFO: renamed from: Z */
    public final Iterator f25448Z;

    /* JADX INFO: renamed from: o0 */
    public Object f25449o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f25450p0;

    public C8113j(C8153o c8153o, ListIterator listIterator) {
        this.f25447Y = 2;
        this.f25450p0 = c8153o;
        this.f25449o0 = c8153o.f25579o0;
        this.f25448Z = listIterator;
    }

    /* JADX INFO: renamed from: a */
    public void m8608a() {
        C8153o c8153o = (C8153o) this.f25450p0;
        c8153o.m8705i();
        if (c8153o.f25579o0 != ((Collection) this.f25449o0)) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8609b() {
        switch (this.f25447Y) {
            case 2:
                C8153o c8153o = (C8153o) this.f25450p0;
                c8153o.m8708p();
                if (c8153o.f25579o0 != ((Collection) this.f25449o0)) {
                    throw new ConcurrentModificationException();
                }
                return;
            case 5:
                C8153o c8153o2 = (C8153o) this.f25450p0;
                c8153o2.m8708p();
                if (c8153o2.f25579o0 != ((Collection) this.f25449o0)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                C8153o c8153o3 = (C8153o) this.f25450p0;
                c8153o3.m8708p();
                if (c8153o3.f25579o0 != ((Collection) this.f25449o0)) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25447Y) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                m8609b();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                m8609b();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                m8609b();
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                m8608a();
                break;
        }
        return this.f25448Z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25447Y) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = (Collection) entry.getValue();
                Object key = entry.getKey();
                C8177r c8177r = (C8177r) ((C8121k) this.f25450p0).f25459q0;
                List list = (List) ((Collection) entry.getValue());
                return new C8241z(key, list instanceof RandomAccess ? new C8137m(c8177r, key, list, null) : new C8153o(c8177r, key, list, (C8153o) null));
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = entry2;
                return entry2.getKey();
            case 2:
                m8609b();
                return this.f25448Z.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                C9299i c9299i = ((C9263c) this.f25450p0).f28049p0;
                List list2 = (List) ((Collection) entry3.getValue());
                return new C9335o(key2, list2 instanceof RandomAccess ? new C9275e(c9299i, key2, list2, null) : new C8153o(c9299i, key2, list2, (C8153o) null));
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = entry4;
                return entry4.getKey();
            case 5:
                m8609b();
                return this.f25448Z.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = (Collection) entry5.getValue();
                Object key3 = entry5.getKey();
                C9896h c9896h = ((C9855b) this.f25450p0).f29366p0;
                List list3 = (List) ((Collection) entry5.getValue());
                return new C9932n(key3, list3 instanceof RandomAccess ? new C9869d(c9896h, key3, list3, null) : new C8153o(c9896h, key3, list3, (C8153o) null));
            case 7:
                Map.Entry entry6 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = entry6;
                return entry6.getKey();
            case 8:
                m8609b();
                return this.f25448Z.next();
            case 9:
                Map.Entry entry7 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = (Collection) entry7.getValue();
                return ((C8121k) this.f25450p0).m8627a(entry7);
            case 10:
                Map.Entry entry8 = (Map.Entry) this.f25448Z.next();
                this.f25449o0 = entry8;
                return entry8.getKey();
            default:
                m8608a();
                return this.f25448Z.next();
        }
    }

    public C8113j(C8153o c8153o, ListIterator listIterator, byte b) {
        this.f25447Y = 5;
        this.f25450p0 = c8153o;
        this.f25449o0 = c8153o.f25579o0;
        this.f25448Z = listIterator;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25447Y) {
            case 0:
                if (!(((Collection) this.f25449o0) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25448Z.remove();
                Serializable serializable = ((C8121k) this.f25450p0).f25459q0;
                ((Collection) this.f25449o0).size();
                ((Collection) this.f25449o0).clear();
                this.f25449o0 = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f25449o0;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f25448Z.remove();
                C8177r c8177r = ((C8129l) this.f25450p0).f25464o0;
                collection.size();
                collection.clear();
                this.f25449o0 = null;
                return;
            case 2:
                this.f25448Z.remove();
                C8153o c8153o = (C8153o) this.f25450p0;
                ((C8177r) c8153o.f25582r0).getClass();
                c8153o.m8709q();
                return;
            case 3:
                if (!(((Collection) this.f25449o0) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25448Z.remove();
                ((C9263c) this.f25450p0).f28049p0.f28089p0 -= ((Collection) this.f25449o0).size();
                ((Collection) this.f25449o0).clear();
                this.f25449o0 = null;
                return;
            case 4:
                Map.Entry entry2 = (Map.Entry) this.f25449o0;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry2.getValue();
                this.f25448Z.remove();
                ((C9269d) this.f25450p0).f28056o0.f28089p0 -= collection2.size();
                collection2.clear();
                this.f25449o0 = null;
                return;
            case 5:
                this.f25448Z.remove();
                C8153o c8153o2 = (C8153o) this.f25450p0;
                ((C9299i) c8153o2.f25582r0).f28089p0--;
                c8153o2.m8709q();
                return;
            case 6:
                if (!(((Collection) this.f25449o0) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25448Z.remove();
                ((C9855b) this.f25450p0).f29366p0.f29411p0 -= ((Collection) this.f25449o0).size();
                ((Collection) this.f25449o0).clear();
                this.f25449o0 = null;
                return;
            case 7:
                Map.Entry entry3 = (Map.Entry) this.f25449o0;
                if (!(entry3 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection3 = (Collection) entry3.getValue();
                this.f25448Z.remove();
                ((C9862c) this.f25450p0).f29372o0.f29411p0 -= collection3.size();
                collection3.clear();
                this.f25449o0 = null;
                return;
            case 8:
                this.f25448Z.remove();
                C8153o c8153o3 = (C8153o) this.f25450p0;
                ((C9896h) c8153o3.f25582r0).f29411p0--;
                c8153o3.m8709q();
                return;
            case 9:
                if (!(((Collection) this.f25449o0) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25448Z.remove();
                ((C11290O) ((C8121k) this.f25450p0).f25459q0).f34182q0 -= ((Collection) this.f25449o0).size();
                ((Collection) this.f25449o0).clear();
                this.f25449o0 = null;
                return;
            case 10:
                Map.Entry entry4 = (Map.Entry) this.f25449o0;
                if (!(entry4 != null)) {
                    throw new IllegalStateException(MpoABj.ubspvFCKz);
                }
                Collection collection4 = (Collection) entry4.getValue();
                this.f25448Z.remove();
                ((C11305c) this.f25450p0).f34220o0.f34182q0 -= collection4.size();
                collection4.clear();
                this.f25449o0 = null;
                return;
            default:
                this.f25448Z.remove();
                C8153o c8153o4 = (C8153o) this.f25450p0;
                ((C11290O) c8153o4.f25582r0).f34182q0--;
                c8153o4.m8706j();
                return;
        }
    }

    public C8113j(C8153o c8153o, ListIterator listIterator, char c9) {
        this.f25447Y = 8;
        this.f25450p0 = c8153o;
        this.f25449o0 = c8153o.f25579o0;
        this.f25448Z = listIterator;
    }

    public /* synthetic */ C8113j(AbstractSet abstractSet, Iterator it, int i10) {
        this.f25447Y = i10;
        this.f25450p0 = abstractSet;
        this.f25448Z = it;
    }

    public C8113j(C8121k c8121k) {
        this.f25447Y = 0;
        this.f25450p0 = c8121k;
        this.f25448Z = ((C8225x) c8121k.f25458p0).entrySet().iterator();
    }

    public C8113j(C8153o c8153o) {
        Iterator it;
        this.f25447Y = 2;
        this.f25450p0 = c8153o;
        Collection collection = c8153o.f25579o0;
        this.f25449o0 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f25448Z = it;
    }

    public C8113j(C8153o c8153o, byte b) {
        Iterator it;
        this.f25447Y = 5;
        this.f25450p0 = c8153o;
        Collection collection = c8153o.f25579o0;
        this.f25449o0 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f25448Z = it;
    }

    public C8113j(C8153o c8153o, char c9) {
        Iterator it;
        this.f25447Y = 8;
        this.f25450p0 = c8153o;
        Collection collection = c8153o.f25579o0;
        this.f25449o0 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f25448Z = it;
    }

    public C8113j(C9263c c9263c) {
        this.f25447Y = 3;
        this.f25450p0 = c9263c;
        this.f25448Z = c9263c.f28048o0.entrySet().iterator();
    }

    public C8113j(C9855b c9855b) {
        this.f25447Y = 6;
        this.f25450p0 = c9855b;
        this.f25448Z = c9855b.f29365o0.entrySet().iterator();
    }

    public C8113j(C8153o c8153o, int i10) {
        Iterator it;
        this.f25447Y = 11;
        this.f25450p0 = c8153o;
        Collection collection = c8153o.f25579o0;
        this.f25449o0 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f25448Z = it;
    }

    public C8113j(C8153o c8153o, ListIterator listIterator, int i10) {
        this.f25447Y = 11;
        this.f25450p0 = c8153o;
        this.f25449o0 = c8153o.f25579o0;
        this.f25448Z = listIterator;
    }

    public C8113j(C8121k c8121k, byte b) {
        this.f25447Y = 9;
        this.f25450p0 = c8121k;
        this.f25448Z = c8121k.f25458p0.entrySet().iterator();
    }
}
