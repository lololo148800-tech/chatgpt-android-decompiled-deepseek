package p817j$.util;

/* JADX INFO: renamed from: j$.util.d0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15709d0 extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // p817j$.util.Spliterator
    InterfaceC15709d0 trySplit();
}
