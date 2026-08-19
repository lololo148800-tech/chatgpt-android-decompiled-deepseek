package p692d0;

import p909nm.AbstractC17657B;

/* JADX INFO: renamed from: d0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C12961N extends AbstractC17657B {

    /* JADX INFO: renamed from: Y */
    public int f41159Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12960M f41160Z;

    public C12961N(C12960M c12960m) {
        this.f41160Z = c12960m;
    }

    @Override // p909nm.AbstractC17657B
    /* JADX INFO: renamed from: a */
    public final int mo4199a() {
        int i10 = this.f41159Y;
        this.f41159Y = i10 + 1;
        return this.f41160Z.m14653d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41159Y < this.f41160Z.m14655f();
    }
}
