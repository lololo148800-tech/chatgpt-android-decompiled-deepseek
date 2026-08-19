package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.i3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15928i3 extends AbstractC15940k3 implements IntConsumer {

    /* JADX INFO: renamed from: c */
    final int[] f49316c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    C15928i3(int i10) {
        this.f49316c = new int[i10];
    }

    @Override // p817j$.util.stream.AbstractC15940k3
    /* JADX INFO: renamed from: b */
    public final void mo17482b(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            intConsumer.accept(this.f49316c[i10]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.f49331b;
        this.f49331b = i11 + 1;
        this.f49316c[i11] = i10;
    }
}
