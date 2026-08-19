package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.V2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15854V2 extends AbstractC15864X2 implements InterfaceC15676a0 {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C15859W2 f49197g;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17260h(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: a */
    final void mo17419a(int i10, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i10]);
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: b */
    final InterfaceC15709d0 mo17420b(Object obj, int i10, int i11) {
        return Spliterators.m17284l((long[]) obj, i10, i11 + i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15854V2(C15859W2 c15859w2, int i10, int i11, int i12, int i13) {
        super(c15859w2, i10, i11, i12, i13);
        this.f49197g = c15859w2;
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: c */
    final InterfaceC15709d0 mo17421c(int i10, int i11, int i12, int i13) {
        return new C15854V2(this.f49197g, i10, i11, i12, i13);
    }
}
