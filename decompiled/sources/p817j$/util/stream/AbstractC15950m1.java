package p817j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.m1 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15950m1 extends AbstractC15962o1 implements InterfaceC15709d0 {
    @Override // p817j$.util.InterfaceC15709d0
    public final boolean tryAdvance(Object obj) {
        InterfaceC15793J0 interfaceC15793J0;
        if (!m17505c()) {
            return false;
        }
        boolean zTryAdvance = ((InterfaceC15709d0) this.f49365d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f49364c == null && (interfaceC15793J0 = (InterfaceC15793J0) AbstractC15962o1.m17503a(this.f49366e)) != null) {
                InterfaceC15709d0 interfaceC15709d0Spliterator = interfaceC15793J0.spliterator();
                this.f49365d = interfaceC15709d0Spliterator;
                return interfaceC15709d0Spliterator.tryAdvance(obj);
            }
            this.f49362a = null;
        }
        return zTryAdvance;
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(Object obj) {
        if (this.f49362a == null) {
            return;
        }
        if (this.f49365d == null) {
            Spliterator spliterator = this.f49364c;
            if (spliterator == null) {
                ArrayDeque arrayDequeM17504b = m17504b();
                while (true) {
                    InterfaceC15793J0 interfaceC15793J0 = (InterfaceC15793J0) AbstractC15962o1.m17503a(arrayDequeM17504b);
                    if (interfaceC15793J0 != null) {
                        interfaceC15793J0.mo17399e(obj);
                    } else {
                        this.f49362a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC15709d0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
