package p909nm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: nm.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17668b implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public int f56465Y;

    /* JADX INFO: renamed from: Z */
    public Object f56466Z;

    /* JADX INFO: renamed from: a */
    public abstract void mo18444a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f56465Y;
        if (i10 == 0) {
            this.f56465Y = 3;
            mo18444a();
            if (this.f56465Y != 1) {
                return false;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f56465Y;
        if (i10 == 1) {
            this.f56465Y = 0;
            return this.f56466Z;
        }
        if (i10 != 2) {
            this.f56465Y = 3;
            mo18444a();
            if (this.f56465Y == 1) {
                this.f56465Y = 0;
                return this.f56466Z;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
