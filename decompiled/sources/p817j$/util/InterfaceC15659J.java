package p817j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.J */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15659J extends InterfaceC15664O {
    @Override // java.util.Iterator, p817j$.util.InterfaceC16026x
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
