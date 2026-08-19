package p817j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.o1 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15962o1 implements Spliterator {

    /* JADX INFO: renamed from: a */
    InterfaceC15798K0 f49362a;

    /* JADX INFO: renamed from: b */
    int f49363b;

    /* JADX INFO: renamed from: c */
    Spliterator f49364c;

    /* JADX INFO: renamed from: d */
    Spliterator f49365d;

    /* JADX INFO: renamed from: e */
    ArrayDeque f49366e;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 64;
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

    AbstractC15962o1(InterfaceC15798K0 interfaceC15798K0) {
        this.f49362a = interfaceC15798K0;
    }

    /* JADX INFO: renamed from: b */
    protected final ArrayDeque m17504b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iMo17409q = this.f49362a.mo17409q();
        while (true) {
            iMo17409q--;
            if (iMo17409q < this.f49363b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f49362a.mo17396b(iMo17409q));
        }
    }

    /* JADX INFO: renamed from: a */
    protected static InterfaceC15798K0 m17503a(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC15798K0 interfaceC15798K0 = (InterfaceC15798K0) arrayDeque.pollFirst();
            if (interfaceC15798K0 == null) {
                return null;
            }
            if (interfaceC15798K0.mo17409q() != 0) {
                for (int iMo17409q = interfaceC15798K0.mo17409q() - 1; iMo17409q >= 0; iMo17409q--) {
                    arrayDeque.addFirst(interfaceC15798K0.mo17396b(iMo17409q));
                }
            } else if (interfaceC15798K0.count() > 0) {
                return interfaceC15798K0;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected final boolean m17505c() {
        if (this.f49362a == null) {
            return false;
        }
        if (this.f49365d != null) {
            return true;
        }
        Spliterator spliterator = this.f49364c;
        if (spliterator == null) {
            ArrayDeque arrayDequeM17504b = m17504b();
            this.f49366e = arrayDequeM17504b;
            InterfaceC15798K0 interfaceC15798K0M17503a = m17503a(arrayDequeM17504b);
            if (interfaceC15798K0M17503a != null) {
                this.f49365d = interfaceC15798K0M17503a.spliterator();
                return true;
            }
            this.f49362a = null;
            return false;
        }
        this.f49365d = spliterator;
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        InterfaceC15798K0 interfaceC15798K0 = this.f49362a;
        if (interfaceC15798K0 == null || this.f49365d != null) {
            return null;
        }
        Spliterator spliterator = this.f49364c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f49363b < interfaceC15798K0.mo17409q() - 1) {
            InterfaceC15798K0 interfaceC15798K1 = this.f49362a;
            int i10 = this.f49363b;
            this.f49363b = i10 + 1;
            return interfaceC15798K1.mo17396b(i10).spliterator();
        }
        InterfaceC15798K0 interfaceC15798K0Mo17396b = this.f49362a.mo17396b(this.f49363b);
        this.f49362a = interfaceC15798K0Mo17396b;
        if (interfaceC15798K0Mo17396b.mo17409q() == 0) {
            Spliterator spliterator2 = this.f49362a.spliterator();
            this.f49364c = spliterator2;
            return spliterator2.trySplit();
        }
        InterfaceC15798K0 interfaceC15798K2 = this.f49362a;
        this.f49363b = 1;
        return interfaceC15798K2.mo17396b(0).spliterator();
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f49362a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f49364c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f49363b; i10 < this.f49362a.mo17409q(); i10++) {
            jCount += this.f49362a.mo17396b(i10).count();
        }
        return jCount;
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        return (InterfaceC15709d0) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15672X trySplit() {
        return (InterfaceC15672X) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15676a0 trySplit() {
        return (InterfaceC15676a0) trySplit();
    }

    @Override // p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15669U trySplit() {
        return (InterfaceC15669U) trySplit();
    }
}
