package p692d0;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12964c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: Y */
    public int f41167Y;

    /* JADX INFO: renamed from: Z */
    public int f41168Z = -1;

    /* JADX INFO: renamed from: o0 */
    public boolean f41169o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C12966e f41170p0;

    public C12964c(C12966e c12966e) {
        this.f41170p0 = c12966e;
        this.f41167Y = c12966e.f41154o0 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f41169o0) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f41168Z;
        C12966e c12966e = this.f41170p0;
        return AbstractC16544l.m18089b(key, c12966e.m14646f(i10)) && AbstractC16544l.m18089b(entry.getValue(), c12966e.m14649j(this.f41168Z));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f41169o0) {
            return this.f41170p0.m14646f(this.f41168Z);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f41169o0) {
            return this.f41170p0.m14649j(this.f41168Z);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41168Z < this.f41167Y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f41169o0) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f41168Z;
        C12966e c12966e = this.f41170p0;
        Object objM14646f = c12966e.m14646f(i10);
        Object objM14649j = c12966e.m14649j(this.f41168Z);
        return (objM14646f == null ? 0 : objM14646f.hashCode()) ^ (objM14649j != null ? objM14649j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41168Z++;
        this.f41169o0 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f41169o0) {
            throw new IllegalStateException();
        }
        this.f41170p0.m14647g(this.f41168Z);
        this.f41168Z--;
        this.f41167Y--;
        this.f41169o0 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f41169o0) {
            return this.f41170p0.m14648h(this.f41168Z, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + Separators.EQUALS + getValue();
    }
}
