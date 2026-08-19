package p817j$.util.stream;

import java.util.Iterator;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.h */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15918h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC15918h onClose(Runnable runnable);

    InterfaceC15918h parallel();

    InterfaceC15918h sequential();

    Spliterator spliterator();

    InterfaceC15918h unordered();
}
