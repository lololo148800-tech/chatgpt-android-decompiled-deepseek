package p466T0;

import java.util.Iterator;
import java.util.Map;
import p909nm.AbstractC17674h;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7180g extends AbstractC17674h {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22826Y;

    /* JADX INFO: renamed from: Z */
    public final C7178e f22827Z;

    public /* synthetic */ C7180g(int i10, C7178e c7178e) {
        this.f22826Y = i10;
        this.f22827Z = c7178e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f22826Y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f22826Y) {
            case 0:
                this.f22827Z.clear();
                break;
            default:
                this.f22827Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f22826Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                C7178e c7178e = this.f22827Z;
                Object obj2 = c7178e.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && c7178e.containsKey(entry.getKey());
            default:
                return this.f22827Z.containsKey(obj);
        }
    }

    @Override // p909nm.AbstractC17674h
    public final int getSize() {
        switch (this.f22826Y) {
            case 0:
                C7178e c7178e = this.f22827Z;
                c7178e.getClass();
                return c7178e.f22821r0;
            default:
                C7178e c7178e2 = this.f22827Z;
                c7178e2.getClass();
                return c7178e2.f22821r0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f22826Y) {
            case 0:
                return new C7181h(this.f22827Z);
            default:
                AbstractC7188o[] abstractC7188oArr = new AbstractC7188o[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC7188oArr[i10] = new C7189p(1);
                }
                return new C7182i(this.f22827Z, abstractC7188oArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f22826Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                    return this.f22827Z.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                C7178e c7178e = this.f22827Z;
                if (!c7178e.containsKey(obj)) {
                    return false;
                }
                c7178e.remove(obj);
                return true;
        }
    }
}
