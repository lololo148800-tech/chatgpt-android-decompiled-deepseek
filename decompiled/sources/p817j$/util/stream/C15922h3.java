package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.h3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15922h3 extends AbstractC15940k3 implements DoubleConsumer {

    /* JADX INFO: renamed from: c */
    final double[] f49308c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    C15922h3(int i10) {
        this.f49308c = new double[i10];
    }

    @Override // p817j$.util.stream.AbstractC15940k3
    /* JADX INFO: renamed from: b */
    final void mo17482b(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            doubleConsumer.accept(this.f49308c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f49331b;
        this.f49331b = i10 + 1;
        this.f49308c[i10] = d10;
    }
}
