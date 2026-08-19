package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.K0 */
/* JADX INFO: loaded from: classes4.dex */
interface InterfaceC15798K0 {
    /* JADX INFO: renamed from: b */
    InterfaceC15798K0 mo17396b(int i10);

    long count();

    void forEach(Consumer consumer);

    /* JADX INFO: renamed from: h */
    InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction);

    /* JADX INFO: renamed from: i */
    void mo17407i(Object[] objArr, int i10);

    /* JADX INFO: renamed from: o */
    Object[] mo17408o(IntFunction intFunction);

    /* JADX INFO: renamed from: q */
    int mo17409q();

    Spliterator spliterator();
}
