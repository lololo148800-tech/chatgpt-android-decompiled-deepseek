package p879lp;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mp.C17360a;
import mp.C17362c;

/* JADX INFO: renamed from: lp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C17119b implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final CharSequence f54722Y;

    /* JADX INFO: renamed from: Z */
    public final C17118a f54723Z;

    /* JADX INFO: renamed from: o0 */
    public int f54724o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public C17360a f54725p0 = null;

    public C17119b(CharSequence charSequence, C17118a c17118a) {
        this.f54722Y = charSequence;
        this.f54723Z = c17118a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f54724o0 < this.f54722Y.length();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.f54725p0 == null) {
            C17118a c17118a = this.f54723Z;
            if (!c17118a.hasNext()) {
                int length = this.f54722Y.length();
                C17362c c17362c = new C17362c(this.f54724o0, length);
                this.f54724o0 = length;
                return c17362c;
            }
            if (!c17118a.hasNext()) {
                throw new NoSuchElementException();
            }
            C17360a c17360a = c17118a.f54718Z;
            c17118a.f54718Z = null;
            this.f54725p0 = c17360a;
        }
        int i10 = this.f54724o0;
        C17360a c17360a2 = this.f54725p0;
        int i11 = c17360a2.f55389b;
        if (i10 < i11) {
            C17362c c17362c2 = new C17362c(i10, i11);
            this.f54724o0 = i11;
            return c17362c2;
        }
        this.f54724o0 = c17360a2.f55390c;
        this.f54725p0 = null;
        return c17360a2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
