package p491U0;

import com.google.protobuf.AbstractC12107L1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0349j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p076Cm.InterfaceC1723a;
import p1091wn.C21022c;
import p1091wn.C21030k;
import p1091wn.C21035p;
import p1091wn.InterfaceC21029j;
import p523V9.AbstractC7846A5;
import p692d0.C12952E;
import p692d0.C12954G;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7535c implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23884Y;

    /* JADX INFO: renamed from: Z */
    public int f23885Z;

    /* JADX INFO: renamed from: o0 */
    public Object f23886o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f23887p0;

    public C7535c(Map map, Object obj) {
        this.f23884Y = 0;
        this.f23886o0 = obj;
        this.f23887p0 = map;
    }

    /* JADX INFO: renamed from: a */
    public void m7845a() {
        Object objInvoke;
        int i10 = this.f23885Z;
        C21022c c21022c = (C21022c) this.f23887p0;
        if (i10 == -2) {
            objInvoke = ((InterfaceC1426a) c21022c.f66891b).invoke();
        } else {
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c21022c.f66892c;
            Object obj = this.f23886o0;
            AbstractC16544l.m18091d(obj);
            objInvoke = interfaceC1436k.invoke(obj);
        }
        this.f23886o0 = objInvoke;
        this.f23885Z = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C21035p c21035p;
        Iterator it;
        switch (this.f23884Y) {
            case 0:
                return this.f23885Z < ((Map) this.f23887p0).size();
            case 1:
                return ((C21030k) this.f23886o0).hasNext();
            case 2:
                if (this.f23885Z < 0) {
                    m7845a();
                }
                return this.f23885Z == 1;
            case 3:
                break;
            default:
                return ((Iterator) this.f23886o0).hasNext();
        }
        while (true) {
            int i10 = this.f23885Z;
            c21035p = (C21035p) this.f23887p0;
            int i11 = c21035p.f66915b;
            it = (Iterator) this.f23886o0;
            if (i10 < i11 && it.hasNext()) {
                it.next();
                this.f23885Z++;
            }
        }
        return this.f23885Z < c21035p.f66916c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C21035p c21035p;
        Iterator it;
        switch (this.f23884Y) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f23886o0;
                this.f23885Z++;
                Object obj2 = ((Map) this.f23887p0).get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(AbstractC12107L1.m13824o(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.f23886o0 = ((C7533a) obj2).f23879b;
                return obj;
            case 1:
                return ((C21030k) this.f23886o0).next();
            case 2:
                if (this.f23885Z < 0) {
                    m7845a();
                }
                if (this.f23885Z == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f23886o0;
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f23885Z = -1;
                return obj3;
            case 3:
                break;
            default:
                C0349j c0349j = (C0349j) ((C21022c) this.f23887p0).f66892c;
                int i10 = this.f23885Z;
                this.f23885Z = i10 + 1;
                if (i10 >= 0) {
                    return c0349j.invoke(Integer.valueOf(i10), ((Iterator) this.f23886o0).next());
                }
                AbstractC17681o.m19388q();
                throw null;
        }
        while (true) {
            int i11 = this.f23885Z;
            c21035p = (C21035p) this.f23887p0;
            int i12 = c21035p.f66915b;
            it = (Iterator) this.f23886o0;
            if (i11 < i12 && it.hasNext()) {
                it.next();
                this.f23885Z++;
            }
        }
        int i13 = this.f23885Z;
        if (i13 >= c21035p.f66916c) {
            throw new NoSuchElementException();
        }
        this.f23885Z = i13 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23884Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i10 = this.f23885Z;
                if (i10 != -1) {
                    ((C12954G) this.f23887p0).m14634k(i10);
                    this.f23885Z = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7535c(C21022c c21022c) {
        this.f23884Y = 4;
        this.f23887p0 = c21022c;
        this.f23886o0 = ((InterfaceC21029j) c21022c.f66891b).iterator();
    }

    public C7535c(C21035p c21035p) {
        this.f23884Y = 3;
        this.f23887p0 = c21035p;
        this.f23886o0 = c21035p.f66914a.iterator();
    }

    public C7535c(C21022c c21022c, byte b) {
        this.f23884Y = 2;
        this.f23887p0 = c21022c;
        this.f23885Z = -2;
    }

    public C7535c(C12954G c12954g) {
        this.f23884Y = 1;
        this.f23887p0 = c12954g;
        this.f23885Z = -1;
        this.f23886o0 = AbstractC7846A5.m8098a(new C12952E(c12954g, this, null));
    }
}
