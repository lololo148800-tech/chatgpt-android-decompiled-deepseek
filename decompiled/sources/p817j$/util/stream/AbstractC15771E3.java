package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.E3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15771E3 extends AbstractC15786H3 implements InterfaceC15709d0 {
    /* JADX INFO: renamed from: e */
    protected abstract void mo17366e(Object obj);

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    /* JADX INFO: renamed from: h */
    protected abstract AbstractC15940k3 mo17367h(int i10);

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (m17381d() != EnumC15781G3.NO_MORE && ((InterfaceC15709d0) this.f49080a).tryAdvance(this)) {
            if (m17380b(1L) == 1) {
                mo17366e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC15940k3 abstractC15940k3Mo17367h = null;
        while (true) {
            EnumC15781G3 enumC15781G3M17381d = m17381d();
            if (enumC15781G3M17381d == EnumC15781G3.NO_MORE) {
                return;
            }
            EnumC15781G3 enumC15781G3 = EnumC15781G3.MAYBE_MORE;
            Spliterator spliterator = this.f49080a;
            if (enumC15781G3M17381d == enumC15781G3) {
                int i10 = this.f49082c;
                if (abstractC15940k3Mo17367h == null) {
                    abstractC15940k3Mo17367h = mo17367h(i10);
                } else {
                    abstractC15940k3Mo17367h.f49331b = 0;
                }
                long j10 = 0;
                while (((InterfaceC15709d0) spliterator).tryAdvance(abstractC15940k3Mo17367h)) {
                    j10++;
                    if (j10 >= i10) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                } else {
                    abstractC15940k3Mo17367h.mo17482b(obj, m17380b(j10));
                }
            } else {
                ((InterfaceC15709d0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
