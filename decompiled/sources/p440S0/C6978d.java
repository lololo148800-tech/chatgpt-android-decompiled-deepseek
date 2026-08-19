package p440S0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6978d extends AbstractC6975a {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f22307o0 = 1;

    /* JADX INFO: renamed from: p0 */
    public final Object f22308p0;

    public C6978d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f22308p0 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f22307o0) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f22303Y;
                this.f22303Y = i10 + 1;
                return ((Object[]) this.f22308p0)[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f22303Y++;
                return this.f22308p0;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f22307o0) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f22303Y - 1;
                this.f22303Y = i10;
                return ((Object[]) this.f22308p0)[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f22303Y--;
                return this.f22308p0;
        }
    }

    public C6978d(Object obj, int i10) {
        super(i10, 1);
        this.f22308p0 = obj;
    }
}
