package p817j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.x1 */
/* JADX INFO: loaded from: classes4.dex */
final class C16008x1 extends C15874Z2 implements InterfaceC15798K0, InterfaceC15758C0 {
    @Override // p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15798K0 mo17356a() {
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17573w(this, j10, j11, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int mo17409q() {
        return 0;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15798K0 mo17396b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final void mo17407i(Object[] objArr, int i10) {
        long j10 = i10;
        long jCount = count() + j10;
        if (jCount > objArr.length || jCount < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f49250c == 0) {
            System.arraycopy(this.f49219e, 0, objArr, i10, this.f49249b);
            return;
        }
        for (int i11 = 0; i11 < this.f49250c; i11++) {
            Object[] objArr2 = this.f49220f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f49220f[i11].length;
        }
        int i12 = this.f49249b;
        if (i12 > 0) {
            System.arraycopy(this.f49219e, 0, objArr, i10, i12);
        }
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final Object[] mo17408o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        mo17407i(objArr, 0);
        return objArr;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        clear();
        m17439s(j10);
    }
}
