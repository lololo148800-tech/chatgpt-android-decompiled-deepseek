package p025An;

import mm.C17296C;

/* JADX INFO: renamed from: An.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0598Y extends AbstractRunnableC0601a0 {

    /* JADX INFO: renamed from: o0 */
    public final C0624m f1830o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC0605c0 f1831p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598Y(AbstractC0605c0 abstractC0605c0, long j10, C0624m c0624m) {
        super(j10);
        this.f1831p0 = abstractC0605c0;
        this.f1830o0 = c0624m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1830o0.m1253D(this.f1831p0, C17296C.f55119a);
    }

    @Override // p025An.AbstractRunnableC0601a0
    public final String toString() {
        return super.toString() + this.f1830o0;
    }
}
