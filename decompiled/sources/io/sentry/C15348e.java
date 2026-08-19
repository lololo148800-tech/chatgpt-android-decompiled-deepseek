package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15348e implements Iterator {

    /* JADX INFO: renamed from: Y */
    public int f47924Y;

    /* JADX INFO: renamed from: Z */
    public int f47925Z = -1;

    /* JADX INFO: renamed from: o0 */
    public boolean f47926o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C15353f f47927p0;

    public C15348e(C15353f c15353f) {
        this.f47927p0 = c15353f;
        this.f47924Y = c15353f.f47935Z;
        this.f47926o0 = c15353f.f47937p0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47926o0 || this.f47924Y != this.f47927p0.f47936o0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47926o0 = false;
        int i10 = this.f47924Y;
        this.f47925Z = i10;
        int i11 = i10 + 1;
        C15353f c15353f = this.f47927p0;
        this.f47924Y = i11 < c15353f.f47938q0 ? i11 : 0;
        return c15353f.f47934Y[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        int i11 = this.f47925Z;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        C15353f c15353f = this.f47927p0;
        int i12 = c15353f.f47935Z;
        if (i11 == i12) {
            c15353f.remove();
            this.f47925Z = -1;
            return;
        }
        int i13 = i11 + 1;
        int i14 = c15353f.f47938q0;
        if (i12 >= i11 || i13 >= (i10 = c15353f.f47936o0)) {
            while (i13 != c15353f.f47936o0) {
                if (i13 >= i14) {
                    Object[] objArr = c15353f.f47934Y;
                    objArr[i13 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = c15353f.f47934Y;
                    int i15 = i13 - 1;
                    if (i15 < 0) {
                        i15 = i14 - 1;
                    }
                    objArr2[i15] = objArr2[i13];
                    i13++;
                    if (i13 >= i14) {
                    }
                }
                i13 = 0;
            }
        } else {
            Object[] objArr3 = c15353f.f47934Y;
            System.arraycopy(objArr3, i13, objArr3, i11, i10 - i13);
        }
        this.f47925Z = -1;
        int i16 = c15353f.f47936o0 - 1;
        if (i16 < 0) {
            i16 = i14 - 1;
        }
        c15353f.f47936o0 = i16;
        c15353f.f47934Y[i16] = null;
        c15353f.f47937p0 = false;
        int i17 = this.f47924Y - 1;
        if (i17 < 0) {
            i17 = i14 - 1;
        }
        this.f47924Y = i17;
    }
}
