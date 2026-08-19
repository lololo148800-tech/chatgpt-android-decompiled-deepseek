package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.X2 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15864X2 implements InterfaceC15709d0 {

    /* JADX INFO: renamed from: a */
    int f49206a;

    /* JADX INFO: renamed from: b */
    final int f49207b;

    /* JADX INFO: renamed from: c */
    int f49208c;

    /* JADX INFO: renamed from: d */
    final int f49209d;

    /* JADX INFO: renamed from: e */
    Object f49210e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ AbstractC15869Y2 f49211f;

    /* JADX INFO: renamed from: a */
    abstract void mo17419a(int i10, Object obj, Object obj2);

    /* JADX INFO: renamed from: b */
    abstract InterfaceC15709d0 mo17420b(Object obj, int i10, int i11);

    /* JADX INFO: renamed from: c */
    abstract InterfaceC15709d0 mo17421c(int i10, int i11, int i12, int i13);

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC15864X2(AbstractC15869Y2 abstractC15869Y2, int i10, int i11, int i12, int i13) {
        this.f49211f = abstractC15869Y2;
        this.f49206a = i10;
        this.f49207b = i11;
        this.f49208c = i12;
        this.f49209d = i13;
        Object[] objArr = abstractC15869Y2.f49214f;
        this.f49210e = objArr == null ? abstractC15869Y2.f49213e : objArr[i10];
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f49206a;
        int i11 = this.f49209d;
        int i12 = this.f49207b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f49208c);
        }
        long[] jArr = this.f49211f.f49251d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f49208c);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f49206a;
        int i11 = this.f49207b;
        if (i10 >= i11 && (i10 != i11 || this.f49208c >= this.f49209d)) {
            return false;
        }
        Object obj2 = this.f49210e;
        int i12 = this.f49208c;
        this.f49208c = i12 + 1;
        mo17419a(i12, obj2, obj);
        int i13 = this.f49208c;
        Object obj3 = this.f49210e;
        AbstractC15869Y2 abstractC15869Y2 = this.f49211f;
        if (i13 == abstractC15869Y2.mo17425t(obj3)) {
            this.f49208c = 0;
            int i14 = this.f49206a + 1;
            this.f49206a = i14;
            Object[] objArr = abstractC15869Y2.f49214f;
            if (objArr != null && i14 <= i11) {
                this.f49210e = objArr[i14];
            }
        }
        return true;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(Object obj) {
        AbstractC15869Y2 abstractC15869Y2;
        Objects.requireNonNull(obj);
        int i10 = this.f49206a;
        int i11 = this.f49209d;
        int i12 = this.f49207b;
        if (i10 < i12 || (i10 == i12 && this.f49208c < i11)) {
            int i13 = this.f49208c;
            while (true) {
                abstractC15869Y2 = this.f49211f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = abstractC15869Y2.f49214f[i10];
                abstractC15869Y2.mo17424s(obj2, i13, abstractC15869Y2.mo17425t(obj2), obj);
                i10++;
                i13 = 0;
            }
            abstractC15869Y2.mo17424s(this.f49206a == i12 ? this.f49210e : abstractC15869Y2.f49214f[i12], i13, i11, obj);
            this.f49206a = i12;
            this.f49208c = i11;
        }
    }

    @Override // p817j$.util.Spliterator
    public final InterfaceC15709d0 trySplit() {
        int i10 = this.f49206a;
        int i11 = this.f49207b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f49208c;
            AbstractC15869Y2 abstractC15869Y2 = this.f49211f;
            InterfaceC15709d0 interfaceC15709d0Mo17421c = mo17421c(i10, i12, i13, abstractC15869Y2.mo17425t(abstractC15869Y2.f49214f[i12]));
            this.f49206a = i11;
            this.f49208c = 0;
            this.f49210e = abstractC15869Y2.f49214f[i11];
            return interfaceC15709d0Mo17421c;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f49208c;
        int i15 = (this.f49209d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        InterfaceC15709d0 interfaceC15709d0Mo17420b = mo17420b(this.f49210e, i14, i15);
        this.f49208c += i15;
        return interfaceC15709d0Mo17420b;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15672X trySplit() {
        return (InterfaceC15672X) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15676a0 trySplit() {
        return (InterfaceC15676a0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15669U trySplit() {
        return (InterfaceC15669U) trySplit();
    }
}
