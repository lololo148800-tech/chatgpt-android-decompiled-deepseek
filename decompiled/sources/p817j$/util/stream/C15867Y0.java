package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.Y0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15867Y0 extends C15862X0 implements InterfaceC16017z0 {
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    @Override // p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC15798K0 mo17356a() {
        mo17356a();
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC16017z0, p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15768E0 mo17356a() {
        int i10 = this.f49205b;
        double[] dArr = this.f49204a;
        if (i10 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f49205b), Integer.valueOf(dArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        double[] dArr = this.f49204a;
        if (j10 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(dArr.length)));
        }
        this.f49205b = 0;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        int i10 = this.f49205b;
        double[] dArr = this.f49204a;
        if (i10 < dArr.length) {
            this.f49205b = 1 + i10;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = this.f49205b;
        double[] dArr = this.f49204a;
        if (i10 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f49205b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // p817j$.util.stream.C15862X0
    public final String toString() {
        double[] dArr = this.f49204a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f49205b), Arrays.toString(dArr));
    }
}
