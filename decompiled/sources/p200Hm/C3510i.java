package p200Hm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: Hm.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3510i implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final long f10602Y;

    /* JADX INFO: renamed from: Z */
    public final long f10603Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f10604o0;

    /* JADX INFO: renamed from: p0 */
    public long f10605p0;

    public C3510i(long j10, long j11, long j12) {
        this.f10602Y = j12;
        this.f10603Z = j11;
        boolean z6 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z6 = true;
        }
        this.f10604o0 = z6;
        this.f10605p0 = z6 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10604o0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f10605p0;
        if (j10 != this.f10603Z) {
            this.f10605p0 = this.f10602Y + j10;
        } else {
            if (!this.f10604o0) {
                throw new NoSuchElementException();
            }
            this.f10604o0 = false;
        }
        return Long.valueOf(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
