package p200Hm;

import java.util.NoSuchElementException;
import p909nm.AbstractC17657B;

/* JADX INFO: renamed from: Hm.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3507f extends AbstractC17657B {

    /* JADX INFO: renamed from: Y */
    public final int f10594Y;

    /* JADX INFO: renamed from: Z */
    public final int f10595Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f10596o0;

    /* JADX INFO: renamed from: p0 */
    public int f10597p0;

    public C3507f(int i10, int i11, int i12) {
        this.f10594Y = i12;
        this.f10595Z = i11;
        boolean z6 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z6 = true;
        }
        this.f10596o0 = z6;
        this.f10597p0 = z6 ? i10 : i11;
    }

    @Override // p909nm.AbstractC17657B
    /* JADX INFO: renamed from: a */
    public final int mo4199a() {
        int i10 = this.f10597p0;
        if (i10 != this.f10595Z) {
            this.f10597p0 = this.f10594Y + i10;
        } else {
            if (!this.f10596o0) {
                throw new NoSuchElementException();
            }
            this.f10596o0 = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10596o0;
    }
}
