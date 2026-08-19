package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.Spliterator;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.Q */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15827Q implements InterfaceC15806L3, InterfaceC15811M3 {

    /* JADX INFO: renamed from: a */
    private final boolean f49149a;

    public /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo17364l(long j10) {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    protected AbstractC15827Q(boolean z6) {
        this.f49149a = z6;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public final int mo17375d() {
        if (this.f49149a) {
            return 0;
        }
        return EnumC15904e3.f49277r;
    }

    /* JADX INFO: renamed from: e */
    public final void m17416e(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        if (this.f49149a) {
            new C15836S(abstractC15882b, spliterator, this).invoke();
        } else {
            new C15841T(abstractC15882b, spliterator, abstractC15882b.m17454V(this)).invoke();
        }
    }
}
