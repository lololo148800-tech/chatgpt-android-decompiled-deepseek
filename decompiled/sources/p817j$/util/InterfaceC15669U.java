package p817j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.U */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15669U extends InterfaceC15709d0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // p817j$.util.InterfaceC15709d0, p817j$.util.Spliterator
    InterfaceC15669U trySplit();
}
