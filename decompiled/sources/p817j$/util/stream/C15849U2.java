package p817j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.U2 */
/* JADX INFO: loaded from: classes4.dex */
class C15849U2 extends AbstractC15869Y2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: s */
    protected final void mo17424s(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i10 < i11) {
            intConsumer.accept(iArr[i10]);
            i10++;
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: t */
    protected final int mo17425t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo17399e((IntConsumer) consumer);
        } else {
            if (AbstractC15821O3.f49141a) {
                AbstractC15821O3.m17414a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC15666Q.m17254b((C15844T2) spliterator(), consumer);
        }
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: w */
    protected final Object[] mo17426w() {
        return new int[8][];
    }

    @Override // p817j$.util.stream.AbstractC15869Y2
    /* JADX INFO: renamed from: c */
    public final Object mo17423c(int i10) {
        return new int[i10];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i10) {
        m17438x();
        int[] iArr = (int[]) this.f49213e;
        int i11 = this.f49249b;
        this.f49249b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m17279g(spliterator());
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC15672X spliterator() {
        return new C15844T2(this, 0, this.f49250c, 0, this.f49249b);
    }

    public final String toString() {
        int[] iArr = (int[]) mo17398d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f49250c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f49250c), Arrays.toString(Arrays.copyOf(iArr, RCHTTPStatusCodes.SUCCESS)));
    }
}
