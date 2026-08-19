package p817j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.X */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15672X extends InterfaceC15709d0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    InterfaceC15672X trySplit();
}
