package p466T0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18236c;
import om.C18238e;
import p076Cm.InterfaceC1724b;

/* JADX INFO: renamed from: T0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7183j extends AbstractCollection implements Collection, InterfaceC1724b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22830Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f22831Z;

    public C7183j(C7178e c7178e) {
        this.f22831Z = c7178e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f22830Y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f22830Y) {
            case 1:
                AbstractC16544l.m18094g(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f22830Y) {
            case 0:
                ((C7178e) this.f22831Z).clear();
                break;
            default:
                ((C18238e) this.f22831Z).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f22830Y) {
            case 0:
                return ((C7178e) this.f22831Z).containsValue(obj);
            default:
                return ((C18238e) this.f22831Z).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f22830Y) {
            case 1:
                return ((C18238e) this.f22831Z).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f22830Y) {
            case 0:
                AbstractC7188o[] abstractC7188oArr = new AbstractC7188o[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC7188oArr[i10] = new C7189p(2);
                }
                return new C7182i((C7178e) this.f22831Z, abstractC7188oArr);
            default:
                C18238e c18238e = (C18238e) this.f22831Z;
                c18238e.getClass();
                return new C18236c(c18238e, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f22830Y) {
            case 1:
                C18238e c18238e = (C18238e) this.f22831Z;
                c18238e.m19756c();
                int iM19762j = c18238e.m19762j(obj);
                if (iM19762j < 0) {
                    return false;
                }
                c18238e.m19765m(iM19762j);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f22830Y) {
            case 1:
                AbstractC16544l.m18094g(elements, "elements");
                ((C18238e) this.f22831Z).m19756c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f22830Y) {
            case 1:
                AbstractC16544l.m18094g(elements, "elements");
                ((C18238e) this.f22831Z).m19756c();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f22830Y) {
            case 0:
                C7178e c7178e = (C7178e) this.f22831Z;
                c7178e.getClass();
                return c7178e.f22821r0;
            default:
                return ((C18238e) this.f22831Z).f58119u0;
        }
    }

    public C7183j(C18238e backing) {
        AbstractC16544l.m18094g(backing, "backing");
        this.f22831Z = backing;
    }
}
