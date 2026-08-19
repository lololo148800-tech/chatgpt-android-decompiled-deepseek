package co;

import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: co.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C11813c implements CharSequence {

    /* JADX INFO: renamed from: Y */
    public final char[] f35815Y;

    /* JADX INFO: renamed from: Z */
    public int f35816Z;

    public C11813c(char[] cArr) {
        this.f35815Y = cArr;
        this.f35816Z = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f35815Y[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35816Z;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return AbstractC21329w.m21721h(this.f35815Y, i10, Math.min(i11, this.f35816Z));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i10 = this.f35816Z;
        return AbstractC21329w.m21721h(this.f35815Y, 0, Math.min(i10, i10));
    }
}
