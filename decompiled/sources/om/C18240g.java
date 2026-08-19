package om;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17674h;

/* JADX INFO: renamed from: om.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18240g extends AbstractC17674h implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C18240g f58126Z;

    /* JADX INFO: renamed from: Y */
    public final C18238e f58127Y;

    static {
        C18238e c18238e = C18238e.f58110z0;
        f58126Z = new C18240g(C18238e.f58110z0);
    }

    public C18240g(C18238e backing) {
        AbstractC16544l.m18094g(backing, "backing");
        this.f58127Y = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f58127Y.m19754a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        this.f58127Y.m19756c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f58127Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f58127Y.containsKey(obj);
    }

    @Override // p909nm.AbstractC17674h
    public final int getSize() {
        return this.f58127Y.f58119u0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f58127Y.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C18238e c18238e = this.f58127Y;
        c18238e.getClass();
        return new C18236c(c18238e, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C18238e c18238e = this.f58127Y;
        c18238e.m19756c();
        int iM19761h = c18238e.m19761h(obj);
        if (iM19761h < 0) {
            return false;
        }
        c18238e.m19765m(iM19761h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        this.f58127Y.m19756c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        this.f58127Y.m19756c();
        return super.retainAll(elements);
    }

    public C18240g() {
        this(new C18238e());
    }
}
