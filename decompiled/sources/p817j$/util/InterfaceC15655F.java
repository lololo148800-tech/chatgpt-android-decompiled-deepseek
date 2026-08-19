package p817j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.F */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15655F extends InterfaceC15664O {
    @Override // java.util.Iterator, p817j$.util.InterfaceC16026x
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}
