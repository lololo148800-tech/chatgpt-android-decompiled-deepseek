package p817j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.W2 */
/* JADX INFO: loaded from: classes4.dex */
class C15859W2 extends AbstractC15869Y2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: s */
    protected final void mo17424s(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i10 < i11) {
            longConsumer.accept(jArr[i10]);
            i10++;
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: t */
    protected final int mo17425t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            mo17399e((LongConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC15666Q.m17255c((C15854V2) spliterator(), consumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: w */
    protected final Object[] mo17426w() {
        return new long[8][];
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: c */
    public final Object mo17423c(int i10) {
        return new long[i10];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j10) {
        m17438x();
        long[] jArr = (long[]) this.f49213e;
        int i10 = this.f49249b;
        this.f49249b = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m17280h(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC15676a0 spliterator() {
        return new C15854V2(this, 0, this.f49250c, 0, this.f49249b);
    }

    public final String toString() {
        long[] jArr = (long[]) mo17398d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f49250c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f49250c), Arrays.toString(Arrays.copyOf(jArr, RCHTTPStatusCodes.SUCCESS)));
    }
}
