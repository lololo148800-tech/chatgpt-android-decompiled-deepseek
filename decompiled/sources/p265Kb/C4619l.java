package p265Kb;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Kb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4619l extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15048Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4622o f15049Z;

    public /* synthetic */ C4619l(C4622o c4622o, int i10) {
        this.f15048Y = i10;
        this.f15049Z = c4622o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15048Y) {
            case 0:
                this.f15049Z.clear();
                break;
            default:
                this.f15049Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C4621n c4621nM5366a;
        switch (this.f15048Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C4622o c4622o = this.f15049Z;
                c4622o.getClass();
                Object key = entry.getKey();
                C4621n c4621n = null;
                if (key != null) {
                    try {
                        c4621nM5366a = c4622o.m5366a(key, false);
                    } catch (ClassCastException unused) {
                        c4621nM5366a = null;
                    }
                    break;
                } else {
                    c4621nM5366a = null;
                }
                if (c4621nM5366a != null && Objects.equals(c4621nM5366a.f15062t0, entry.getValue())) {
                    c4621n = c4621nM5366a;
                }
                return c4621n != null;
            default:
                return this.f15049Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15048Y) {
            case 0:
                return new C4618k(this.f15049Z, 0);
            default:
                return new C4618k(this.f15049Z, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C4621n c4621nM5366a;
        switch (this.f15048Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C4622o c4622o = this.f15049Z;
                c4622o.getClass();
                Object key = entry.getKey();
                C4621n c4621n = null;
                if (key != null) {
                    try {
                        c4621nM5366a = c4622o.m5366a(key, false);
                    } catch (ClassCastException unused) {
                        c4621nM5366a = null;
                    }
                    break;
                } else {
                    c4621nM5366a = null;
                }
                if (c4621nM5366a != null && Objects.equals(c4621nM5366a.f15062t0, entry.getValue())) {
                    c4621n = c4621nM5366a;
                }
                if (c4621n == null) {
                    return false;
                }
                c4622o.m5368c(c4621n, true);
                return true;
            default:
                C4622o c4622o2 = this.f15049Z;
                c4622o2.getClass();
                C4621n c4621nM5366a2 = null;
                if (obj != null) {
                    try {
                        c4621nM5366a2 = c4622o2.m5366a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c4621nM5366a2 != null) {
                    c4622o2.m5368c(c4621nM5366a2, true);
                }
                return c4621nM5366a2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f15048Y) {
            case 0:
                break;
        }
        return this.f15049Z.f15068p0;
    }
}
