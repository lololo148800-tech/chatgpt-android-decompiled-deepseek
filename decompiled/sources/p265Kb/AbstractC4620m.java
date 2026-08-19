package p265Kb;

import bj.C11443H;
import bj.C11444I;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Kb.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4620m implements Iterator {

    /* JADX INFO: renamed from: Z */
    public int f15051Z;

    /* JADX INFO: renamed from: o0 */
    public Map.Entry f15052o0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractMap f15054q0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15050Y = 0;

    /* JADX INFO: renamed from: p0 */
    public Map.Entry f15053p0 = null;

    public AbstractC4620m(C4622o c4622o) {
        this.f15054q0 = c4622o;
        this.f15052o0 = c4622o.f15070r0.f15058p0;
        this.f15051Z = c4622o.f15069q0;
    }

    /* JADX INFO: renamed from: a */
    public C4621n m5364a() {
        C4621n c4621n = (C4621n) this.f15052o0;
        C4622o c4622o = (C4622o) this.f15054q0;
        if (c4621n == c4622o.f15070r0) {
            throw new NoSuchElementException();
        }
        if (c4622o.f15069q0 != this.f15051Z) {
            throw new ConcurrentModificationException();
        }
        this.f15052o0 = c4621n.f15058p0;
        this.f15053p0 = c4621n;
        return c4621n;
    }

    /* JADX INFO: renamed from: b */
    public C11443H m5365b() {
        C11443H c11443h = (C11443H) this.f15052o0;
        C11444I c11444i = (C11444I) this.f15054q0;
        if (c11443h == c11444i.f34595o0) {
            throw new NoSuchElementException();
        }
        if (c11444i.f34597q0 != this.f15051Z) {
            throw new ConcurrentModificationException();
        }
        this.f15052o0 = c11443h.f34586p0;
        this.f15053p0 = c11443h;
        return c11443h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15050Y) {
            case 0:
                return ((C4621n) this.f15052o0) != ((C4622o) this.f15054q0).f15070r0;
            default:
                return ((C11443H) this.f15052o0) != ((C11444I) this.f15054q0).f34595o0;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f15050Y) {
            case 0:
                return m5364a();
            default:
                return m5365b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15050Y) {
            case 0:
                C4621n c4621n = (C4621n) this.f15053p0;
                if (c4621n == null) {
                    throw new IllegalStateException();
                }
                C4622o c4622o = (C4622o) this.f15054q0;
                c4622o.m5368c(c4621n, true);
                this.f15053p0 = null;
                this.f15051Z = c4622o.f15069q0;
                return;
            default:
                C11443H c11443h = (C11443H) this.f15053p0;
                if (c11443h == null) {
                    throw new IllegalStateException();
                }
                C11444I c11444i = (C11444I) this.f15054q0;
                c11444i.m12843c(c11443h, true);
                this.f15053p0 = null;
                this.f15051Z = c11444i.f34597q0;
                return;
        }
    }

    public AbstractC4620m(C11444I c11444i) {
        this.f15054q0 = c11444i;
        this.f15052o0 = c11444i.f34595o0.f34586p0;
        this.f15051Z = c11444i.f34597q0;
    }
}
