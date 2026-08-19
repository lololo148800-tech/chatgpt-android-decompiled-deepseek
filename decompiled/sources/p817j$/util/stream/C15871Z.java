package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.Z */
/* JADX INFO: loaded from: classes4.dex */
final class C15871Z extends AbstractC15927i2 {

    /* JADX INFO: renamed from: b */
    boolean f49216b;

    /* JADX INFO: renamed from: c */
    C15846U f49217c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C15861X f49218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15871Z(C15861X c15861x, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49218d = c15861x;
        InterfaceC15963o2 interfaceC15963o3 = this.f49315a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49217c = new C15846U(interfaceC15963o3);
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        this.f49315a.mo17364l(-1L);
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) throws Exception {
        IntStream intStream = (IntStream) ((C15828Q0) this.f49218d.f49203n).apply(i10);
        if (intStream != null) {
            try {
                boolean z6 = this.f49216b;
                C15846U c15846u = this.f49217c;
                if (!z6) {
                    intStream.sequential().forEach(c15846u);
                } else {
                    InterfaceC15672X interfaceC15672XSpliterator = intStream.sequential().spliterator();
                    while (!this.f49315a.mo17358n() && interfaceC15672XSpliterator.tryAdvance((IntConsumer) c15846u)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        this.f49216b = true;
        return this.f49315a.mo17358n();
    }
}
