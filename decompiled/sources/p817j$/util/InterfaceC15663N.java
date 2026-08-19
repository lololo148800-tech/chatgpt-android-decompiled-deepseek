package p817j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.N */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15663N extends InterfaceC15664O {
    @Override // java.util.Iterator, p817j$.util.InterfaceC16026x
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
