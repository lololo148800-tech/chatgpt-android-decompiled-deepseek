package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.g0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15913g0 extends AbstractC15933j2 {

    /* JADX INFO: renamed from: b */
    boolean f49291b;

    /* JADX INFO: renamed from: c */
    C15895d0 f49292c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15919h0 f49293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15913g0(C15919h0 c15919h0, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49293d = c15919h0;
        InterfaceC15963o2 interfaceC15963o3 = this.f49325a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49292c = new C15895d0(interfaceC15963o3);
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49325a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) throws Exception {
        InterfaceC15955n0 interfaceC15955n0 = (InterfaceC15955n0) ((C15800K2) this.f49293d.f49306n).apply(j10);
        if (interfaceC15955n0 != null) {
            try {
                boolean z6 = this.f49291b;
                C15895d0 c15895d0 = this.f49292c;
                if (!z6) {
                    interfaceC15955n0.sequential().forEach(c15895d0);
                } else {
                    InterfaceC15676a0 interfaceC15676a0Spliterator = interfaceC15955n0.sequential().spliterator();
                    while (!this.f49325a.mo17358n() && interfaceC15676a0Spliterator.tryAdvance((LongConsumer) c15895d0)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    interfaceC15955n0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (interfaceC15955n0 != null) {
            interfaceC15955n0.close();
        }
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        this.f49291b = true;
        return this.f49325a.mo17358n();
    }
}
