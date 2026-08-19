package p817j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.S2 */
/* JADX INFO: loaded from: classes4.dex */
class C15839S2 extends AbstractC15869Y2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: s */
    protected final void mo17424s(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i10 < i11) {
            doubleConsumer.accept(dArr[i10]);
            i10++;
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: t */
    protected final int mo17425t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            mo17399e((DoubleConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC15666Q.m17253a((C15834R2) spliterator(), consumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: w */
    protected final Object[] mo17426w() {
        return new double[8][];
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: c */
    public final Object mo17423c(int i10) {
        return new double[i10];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        m17438x();
        double[] dArr = (double[]) this.f49213e;
        int i10 = this.f49249b;
        this.f49249b = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m17278f(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC15669U spliterator() {
        return new C15834R2(this, 0, this.f49250c, 0, this.f49249b);
    }

    public final String toString() {
        double[] dArr = (double[]) mo17398d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f49250c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f49250c), Arrays.toString(Arrays.copyOf(dArr, RCHTTPStatusCodes.SUCCESS)));
    }
}
