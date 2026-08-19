package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.R2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15834R2 extends AbstractC15864X2 implements InterfaceC15669U {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C15839S2 f49170g;

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: a */
    final void mo17419a(int i10, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i10]);
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: b */
    final InterfaceC15709d0 mo17420b(Object obj, int i10, int i11) {
        return Spliterators.m17282j((double[]) obj, i10, i11 + i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15834R2(C15839S2 c15839s2, int i10, int i11, int i12, int i13) {
        super(c15839s2, i10, i11, i12, i13);
        this.f49170g = c15839s2;
    }

    @Override // p817j$.util.stream.AbstractC15864X2
    /* JADX INFO: renamed from: c */
    final InterfaceC15709d0 mo17421c(int i10, int i11, int i12, int i13) {
        return new C15834R2(this.f49170g, i10, i11, i12, i13);
    }
}
