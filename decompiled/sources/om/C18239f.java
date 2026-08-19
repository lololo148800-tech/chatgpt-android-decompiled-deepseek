package om;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17674h;

/* JADX INFO: renamed from: om.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18239f extends AbstractC17674h {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58124Y;

    /* JADX INFO: renamed from: Z */
    public final C18238e f58125Z;

    public C18239f(C18238e backing, int i10) {
        this.f58124Y = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(backing, "backing");
                this.f58125Z = backing;
                break;
            default:
                AbstractC16544l.m18094g(backing, "backing");
                this.f58125Z = backing;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f58124Y) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                AbstractC16544l.m18094g(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f58124Y) {
            case 0:
                AbstractC16544l.m18094g(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC16544l.m18094g(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f58124Y) {
            case 0:
                this.f58125Z.clear();
                break;
            default:
                this.f58125Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f58124Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                AbstractC16544l.m18094g(element, "element");
                return this.f58125Z.m19759f(element);
            default:
                return this.f58125Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f58124Y) {
            case 0:
                AbstractC16544l.m18094g(elements, "elements");
                return this.f58125Z.m19758e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // p909nm.AbstractC17674h
    public final int getSize() {
        switch (this.f58124Y) {
            case 0:
                break;
        }
        return this.f58125Z.f58119u0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f58124Y) {
            case 0:
                break;
        }
        return this.f58125Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f58124Y) {
            case 0:
                C18238e c18238e = this.f58125Z;
                c18238e.getClass();
                return new C18236c(c18238e, 0);
            default:
                C18238e c18238e2 = this.f58125Z;
                c18238e2.getClass();
                return new C18236c(c18238e2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f58124Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                AbstractC16544l.m18094g(element, "element");
                C18238e c18238e = this.f58125Z;
                c18238e.getClass();
                c18238e.m19756c();
                int iM19761h = c18238e.m19761h(element.getKey());
                if (iM19761h < 0) {
                    return false;
                }
                Object[] objArr = c18238e.f58112Z;
                AbstractC16544l.m18091d(objArr);
                if (!AbstractC16544l.m18089b(objArr[iM19761h], element.getValue())) {
                    return false;
                }
                c18238e.m19765m(iM19761h);
                return true;
            default:
                C18238e c18238e2 = this.f58125Z;
                c18238e2.m19756c();
                int iM19761h2 = c18238e2.m19761h(obj);
                if (iM19761h2 < 0) {
                    return false;
                }
                c18238e2.m19765m(iM19761h2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f58124Y) {
            case 0:
                AbstractC16544l.m18094g(elements, "elements");
                this.f58125Z.m19756c();
                break;
            default:
                AbstractC16544l.m18094g(elements, "elements");
                this.f58125Z.m19756c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f58124Y) {
            case 0:
                AbstractC16544l.m18094g(elements, "elements");
                this.f58125Z.m19756c();
                break;
            default:
                AbstractC16544l.m18094g(elements, "elements");
                this.f58125Z.m19756c();
                break;
        }
        return super.retainAll(elements);
    }
}
