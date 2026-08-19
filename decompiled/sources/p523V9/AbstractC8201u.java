package p523V9;

import bb.C11324q;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p571X9.C9323m;
import p594Y9.C9920l;

/* JADX INFO: renamed from: V9.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8201u implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25645Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f25646Z;

    /* JADX INFO: renamed from: o0 */
    public int f25647o0;

    /* JADX INFO: renamed from: p0 */
    public int f25648p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractMap f25649q0;

    public AbstractC8201u(C8225x c8225x) {
        this.f25649q0 = c8225x;
        this.f25646Z = c8225x.f25684q0;
        this.f25647o0 = c8225x.isEmpty() ? -1 : 0;
        this.f25648p0 = -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo8814a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract Object mo8767b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25645Y) {
            case 0:
                return this.f25647o0 >= 0;
            case 1:
                return this.f25647o0 >= 0;
            case 2:
                return this.f25647o0 >= 0;
            default:
                return this.f25647o0 >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25645Y) {
            case 0:
                C8225x c8225x = (C8225x) this.f25649q0;
                if (c8225x.f25684q0 != this.f25646Z) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f25647o0;
                this.f25648p0 = i10;
                Object objMo8767b = mo8767b(i10);
                int i11 = this.f25647o0 + 1;
                if (i11 >= c8225x.f25685r0) {
                    i11 = -1;
                }
                this.f25647o0 = i11;
                return objMo8767b;
            case 1:
                C9323m c9323m = (C9323m) this.f25649q0;
                if (c9323m.f28139q0 != this.f25646Z) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f25647o0;
                this.f25648p0 = i12;
                Object objMo8767b2 = mo8767b(i12);
                int i13 = this.f25647o0 + 1;
                if (i13 >= c9323m.f28140r0) {
                    i13 = -1;
                }
                this.f25647o0 = i13;
                return objMo8767b2;
            case 2:
                C9920l c9920l = (C9920l) this.f25649q0;
                if (c9920l.f29460q0 != this.f25646Z) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.f25647o0;
                this.f25648p0 = i14;
                Object objMo8767b3 = mo8767b(i14);
                int i15 = this.f25647o0 + 1;
                if (i15 >= c9920l.f29461r0) {
                    i15 = -1;
                }
                this.f25647o0 = i15;
                return objMo8767b3;
            default:
                C11324q c11324q = (C11324q) this.f25649q0;
                if (c11324q.f34249q0 != this.f25646Z) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i16 = this.f25647o0;
                this.f25648p0 = i16;
                Object objMo8814a = mo8814a(i16);
                int i17 = this.f25647o0 + 1;
                if (i17 >= c11324q.f34250r0) {
                    i17 = -1;
                }
                this.f25647o0 = i17;
                return objMo8814a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25645Y) {
            case 0:
                C8225x c8225x = (C8225x) this.f25649q0;
                int i10 = c8225x.f25684q0;
                int i11 = this.f25646Z;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.f25648p0;
                if (!(i12 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25646Z = i11 + 32;
                Object[] objArr = c8225x.f25682o0;
                objArr.getClass();
                c8225x.remove(objArr[i12]);
                this.f25647o0--;
                this.f25648p0 = -1;
                return;
            case 1:
                C9323m c9323m = (C9323m) this.f25649q0;
                int i13 = c9323m.f28139q0;
                int i14 = this.f25646Z;
                if (i13 != i14) {
                    throw new ConcurrentModificationException();
                }
                int i15 = this.f25648p0;
                if (!(i15 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25646Z = i14 + 32;
                Object[] objArr2 = c9323m.f28137o0;
                objArr2.getClass();
                c9323m.remove(objArr2[i15]);
                this.f25647o0--;
                this.f25648p0 = -1;
                return;
            case 2:
                C9920l c9920l = (C9920l) this.f25649q0;
                int i16 = c9920l.f29460q0;
                int i17 = this.f25646Z;
                if (i16 != i17) {
                    throw new ConcurrentModificationException();
                }
                int i18 = this.f25648p0;
                if (!(i18 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25646Z = i17 + 32;
                Object[] objArr3 = c9920l.f29458o0;
                objArr3.getClass();
                c9920l.remove(objArr3[i18]);
                this.f25647o0--;
                this.f25648p0 = -1;
                return;
            default:
                C11324q c11324q = (C11324q) this.f25649q0;
                int i19 = c11324q.f34249q0;
                int i20 = this.f25646Z;
                if (i19 != i20) {
                    throw new ConcurrentModificationException();
                }
                int i21 = this.f25648p0;
                if (i21 < 0) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25646Z = i20 + 32;
                c11324q.remove(c11324q.m12751j()[i21]);
                this.f25647o0--;
                this.f25648p0 = -1;
                return;
        }
    }

    public AbstractC8201u(C9323m c9323m) {
        this.f25649q0 = c9323m;
        this.f25646Z = c9323m.f28139q0;
        this.f25647o0 = c9323m.isEmpty() ? -1 : 0;
        this.f25648p0 = -1;
    }

    public AbstractC8201u(C9920l c9920l) {
        this.f25649q0 = c9920l;
        this.f25646Z = c9920l.f29460q0;
        this.f25647o0 = c9920l.isEmpty() ? -1 : 0;
        this.f25648p0 = -1;
    }

    public AbstractC8201u(C11324q c11324q) {
        this.f25649q0 = c11324q;
        this.f25646Z = c11324q.f34249q0;
        this.f25647o0 = c11324q.isEmpty() ? -1 : 0;
        this.f25648p0 = -1;
    }
}
