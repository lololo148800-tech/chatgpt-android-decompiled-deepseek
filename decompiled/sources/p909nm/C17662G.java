package p909nm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p1113xn.C21317k;
import p586Y0.C9545D;

/* JADX INFO: renamed from: nm.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C17662G extends AbstractC17671e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56448Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f56449Z;

    public C17662G(List list) {
        this.f56449Z = list;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f56448Y) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        switch (this.f56448Y) {
            case 0:
                return ((List) this.f56449Z).size();
            default:
                return ((C21317k) this.f56449Z).f67753a.groupCount() + 1;
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f56448Y) {
            case 0:
                return ((List) this.f56449Z).get(AbstractC17680n.m19325F(i10, this));
            default:
                String strGroup = ((C21317k) this.f56449Z).f67753a.group(i10);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f56448Y) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p909nm.AbstractC17671e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f56448Y) {
            case 0:
                return new C9545D(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f56448Y) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public ListIterator listIterator() {
        switch (this.f56448Y) {
            case 0:
                return new C9545D(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C17662G(C21317k c21317k) {
        this.f56449Z = c21317k;
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f56448Y) {
            case 0:
                return new C9545D(this, i10);
            default:
                return super.listIterator(i10);
        }
    }
}
