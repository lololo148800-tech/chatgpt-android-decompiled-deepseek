package p1091wn;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0716A;
import p030B2.C0740V;
import p049Bm.InterfaceC1436k;
import p076Cm.InterfaceC1723a;
import p925oe.C18119j;

/* JADX INFO: renamed from: wn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C21025f implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f66896Y;

    /* JADX INFO: renamed from: Z */
    public final Iterator f66897Z;

    /* JADX INFO: renamed from: o0 */
    public int f66898o0;

    /* JADX INFO: renamed from: p0 */
    public Object f66899p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC21029j f66900q0;

    public C21025f(C21027h c21027h) {
        this.f66896Y = 1;
        this.f66900q0 = c21027h;
        this.f66897Z = c21027h.f66902a.iterator();
        this.f66898o0 = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m21477a() {
        Object next;
        C21027h c21027h;
        do {
            Iterator it = this.f66897Z;
            if (!it.hasNext()) {
                this.f66898o0 = 0;
                return;
            } else {
                next = it.next();
                c21027h = (C21027h) this.f66900q0;
            }
        } while (((Boolean) c21027h.f66904c.invoke(next)).booleanValue() != c21027h.f66903b);
        this.f66899p0 = next;
        this.f66898o0 = 1;
    }

    /* JADX INFO: renamed from: b */
    public void m21478b() {
        Iterator it = this.f66897Z;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((InterfaceC1436k) ((C21022c) this.f66900q0).f66892c).invoke(next)).booleanValue()) {
                this.f66898o0 = 1;
                this.f66899p0 = next;
                return;
            }
        }
        this.f66898o0 = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m21479c() {
        Object next;
        do {
            Iterator it = this.f66897Z;
            if (!it.hasNext()) {
                this.f66898o0 = 0;
                return;
            } else {
                next = it.next();
                ((C0740V) this.f66900q0).getClass();
            }
        } while (((Boolean) C18119j.f57795o0.invoke(next)).booleanValue());
        this.f66899p0 = next;
        this.f66898o0 = 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21480d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f66899p0;
        if (it2 != null && it2.hasNext()) {
            this.f66898o0 = 1;
            return true;
        }
        do {
            Iterator it3 = this.f66897Z;
            if (!it3.hasNext()) {
                this.f66898o0 = 2;
                this.f66899p0 = null;
                return false;
            }
            Object next = it3.next();
            C21028i c21028i = (C21028i) this.f66900q0;
            it = (Iterator) c21028i.f66907c.invoke(c21028i.f66906b.invoke(next));
        } while (!it.hasNext());
        this.f66899p0 = it;
        this.f66898o0 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f66896Y) {
            case 0:
                if (this.f66898o0 == -1) {
                    m21479c();
                }
                return this.f66898o0 == 1 || this.f66897Z.hasNext();
            case 1:
                if (this.f66898o0 == -1) {
                    m21477a();
                }
                return this.f66898o0 == 1;
            case 2:
                int i10 = this.f66898o0;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return m21480d();
            default:
                if (this.f66898o0 == -1) {
                    m21478b();
                }
                return this.f66898o0 == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f66896Y) {
            case 0:
                if (this.f66898o0 == -1) {
                    m21479c();
                }
                if (this.f66898o0 != 1) {
                    return this.f66897Z.next();
                }
                Object obj = this.f66899p0;
                this.f66899p0 = null;
                this.f66898o0 = 0;
                return obj;
            case 1:
                if (this.f66898o0 == -1) {
                    m21477a();
                }
                if (this.f66898o0 == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f66899p0;
                this.f66899p0 = null;
                this.f66898o0 = -1;
                return obj2;
            case 2:
                int i10 = this.f66898o0;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !m21480d()) {
                    throw new NoSuchElementException();
                }
                this.f66898o0 = 0;
                Iterator it = (Iterator) this.f66899p0;
                AbstractC16544l.m18091d(it);
                return it.next();
            default:
                if (this.f66898o0 == -1) {
                    m21478b();
                }
                if (this.f66898o0 == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f66899p0;
                this.f66899p0 = null;
                this.f66898o0 = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f66896Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C21025f(C21028i c21028i) {
        this.f66896Y = 2;
        this.f66900q0 = c21028i;
        this.f66897Z = c21028i.f66905a.iterator();
    }

    public C21025f(C21022c c21022c) {
        this.f66896Y = 3;
        this.f66900q0 = c21022c;
        this.f66897Z = ((InterfaceC21029j) c21022c.f66891b).iterator();
        this.f66898o0 = -1;
    }

    public C21025f(C0740V c0740v) {
        this.f66896Y = 0;
        this.f66900q0 = c0740v;
        this.f66897Z = new C0716A((C21036q) c0740v.f2104b);
        this.f66898o0 = -1;
    }
}
