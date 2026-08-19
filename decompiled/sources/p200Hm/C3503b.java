package p200Hm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: Hm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3503b implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final int f10585Y;

    /* JADX INFO: renamed from: Z */
    public final int f10586Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f10587o0;

    /* JADX INFO: renamed from: p0 */
    public int f10588p0;

    public C3503b(char c9, char c10, int i10) {
        this.f10585Y = i10;
        this.f10586Z = c10;
        boolean z6 = false;
        if (i10 <= 0 ? AbstractC16544l.m18096i(c9, c10) >= 0 : AbstractC16544l.m18096i(c9, c10) <= 0) {
            z6 = true;
        }
        this.f10587o0 = z6;
        this.f10588p0 = z6 ? c9 : c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10587o0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f10588p0;
        if (i10 != this.f10586Z) {
            this.f10588p0 = this.f10585Y + i10;
        } else {
            if (!this.f10587o0) {
                throw new NoSuchElementException();
            }
            this.f10587o0 = false;
        }
        return Character.valueOf((char) i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
