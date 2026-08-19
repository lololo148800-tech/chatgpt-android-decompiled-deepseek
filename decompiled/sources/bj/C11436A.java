package bj;

import java.util.Iterator;

/* JADX INFO: renamed from: bj.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11436A implements Iterator, Cloneable {

    /* JADX INFO: renamed from: Y */
    public final EnumC11476w f34551Y;

    /* JADX INFO: renamed from: Z */
    public final Object[] f34552Z;

    /* JADX INFO: renamed from: o0 */
    public int f34553o0;

    public C11436A(EnumC11476w enumC11476w, Object[] objArr, int i10) {
        this.f34551Y = enumC11476w;
        this.f34552Z = objArr;
        this.f34553o0 = i10;
    }

    public final Object clone() {
        return new C11436A(this.f34551Y, this.f34552Z, this.f34553o0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34553o0 < this.f34552Z.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f34553o0;
        this.f34553o0 = i10 + 1;
        return this.f34552Z[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
