package p440S0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6981g extends AbstractC6975a {

    /* JADX INFO: renamed from: o0 */
    public final Object[] f22321o0;

    /* JADX INFO: renamed from: p0 */
    public final C6984j f22322p0;

    public C6981g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f22321o0 = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f22322p0 = new C6984j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C6984j c6984j = this.f22322p0;
        if (c6984j.hasNext()) {
            this.f22303Y++;
            return c6984j.next();
        }
        int i10 = this.f22303Y;
        this.f22303Y = i10 + 1;
        return this.f22321o0[i10 - c6984j.f22304Z];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22303Y;
        C6984j c6984j = this.f22322p0;
        int i11 = c6984j.f22304Z;
        if (i10 <= i11) {
            this.f22303Y = i10 - 1;
            return c6984j.previous();
        }
        int i12 = i10 - 1;
        this.f22303Y = i12;
        return this.f22321o0[i12 - i11];
    }
}
