package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Objects;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.j2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15933j2 implements InterfaceC15957n2 {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC15963o2 f49325a;

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
    }

    public AbstractC15933j2(InterfaceC15963o2 interfaceC15963o2) {
        this.f49325a = (InterfaceC15963o2) Objects.requireNonNull(interfaceC15963o2);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        this.f49325a.mo17364l(j10);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public void mo17363k() {
        this.f49325a.mo17363k();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public boolean mo17358n() {
        return this.f49325a.mo17358n();
    }
}
