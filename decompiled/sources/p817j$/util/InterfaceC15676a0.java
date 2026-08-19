package p817j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.a0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15676a0 extends InterfaceC15709d0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    InterfaceC15676a0 trySplit();
}
