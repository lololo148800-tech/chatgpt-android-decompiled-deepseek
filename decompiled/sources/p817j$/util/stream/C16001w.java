package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.util.InterfaceC15669U;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.w */
/* JADX INFO: loaded from: classes4.dex */
final class C16001w extends AbstractC15921h2 {

    /* JADX INFO: renamed from: b */
    boolean f49423b;

    /* JADX INFO: renamed from: c */
    C15966p f49424c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15986t f49425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C16001w(C15986t c15986t, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49425d = c15986t;
        InterfaceC15963o2 interfaceC15963o3 = this.f49307a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49424c = new C15966p(interfaceC15963o3);
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49307a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) throws Exception {
        InterfaceC15762D interfaceC15762D = (InterfaceC15762D) ((C15800K2) this.f49425d.f49402n).apply(d10);
        if (interfaceC15762D != null) {
            try {
                boolean z6 = this.f49423b;
                C15966p c15966p = this.f49424c;
                if (!z6) {
                    interfaceC15762D.sequential().forEach(c15966p);
                } else {
                    InterfaceC15669U interfaceC15669USpliterator = interfaceC15762D.sequential().spliterator();
                    while (!this.f49307a.mo17358n() && interfaceC15669USpliterator.tryAdvance((DoubleConsumer) c15966p)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    interfaceC15762D.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (interfaceC15762D != null) {
            interfaceC15762D.close();
        }
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        this.f49423b = true;
        return this.f49307a.mo17358n();
    }
}
