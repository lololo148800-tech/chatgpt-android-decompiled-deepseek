package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.j3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15934j3 extends AbstractC15940k3 implements LongConsumer {

    /* JADX INFO: renamed from: c */
    final long[] f49326c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    C15934j3(int i10) {
        this.f49326c = new long[i10];
    }

    @Override // p817j$.util.stream.AbstractC15940k3
    /* JADX INFO: renamed from: b */
    public final void mo17482b(Object obj, long j10) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            longConsumer.accept(this.f49326c[i10]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        int i10 = this.f49331b;
        this.f49331b = i10 + 1;
        this.f49326c[i10] = j10;
    }
}
