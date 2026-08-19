package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;

/* JADX INFO: renamed from: j$.util.stream.j1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15932j1 extends AbstractC15950m1 implements InterfaceC15669U {
    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }
}
