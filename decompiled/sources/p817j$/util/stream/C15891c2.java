package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.c2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15891c2 extends AbstractC15939k2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49243b = 1;

    /* JADX INFO: renamed from: c */
    boolean f49244c;

    /* JADX INFO: renamed from: d */
    Object f49245d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AbstractC15882b f49246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15891c2(C15861X c15861x, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49246e = c15861x;
        InterfaceC15963o2 interfaceC15963o3 = this.f49330a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49245d = new C15846U(interfaceC15963o3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15891c2(C15986t c15986t, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49246e = c15986t;
        InterfaceC15963o2 interfaceC15963o3 = this.f49330a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49245d = new C15966p(interfaceC15963o3);
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        switch (this.f49243b) {
            case 0:
                this.f49330a.mo17364l(-1L);
                break;
            case 1:
                this.f49330a.mo17364l(-1L);
                break;
            default:
                this.f49330a.mo17364l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) throws Exception {
        switch (this.f49243b) {
            case 0:
                InterfaceC15955n0 interfaceC15955n0 = (InterfaceC15955n0) ((C15800K2) ((C15919h0) this.f49246e).f49306n).apply(obj);
                if (interfaceC15955n0 != null) {
                    try {
                        boolean z6 = this.f49244c;
                        C15895d0 c15895d0 = (C15895d0) this.f49245d;
                        if (!z6) {
                            interfaceC15955n0.sequential().forEach(c15895d0);
                        } else {
                            InterfaceC15676a0 interfaceC15676a0Spliterator = interfaceC15955n0.sequential().spliterator();
                            while (!this.f49330a.mo17358n() && interfaceC15676a0Spliterator.tryAdvance((LongConsumer) c15895d0)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            interfaceC15955n0.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (interfaceC15955n0 != null) {
                    interfaceC15955n0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C15800K2) ((C15861X) this.f49246e).f49203n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z10 = this.f49244c;
                        C15846U c15846u = (C15846U) this.f49245d;
                        if (!z10) {
                            intStream.sequential().forEach(c15846u);
                        } else {
                            InterfaceC15672X interfaceC15672XSpliterator = intStream.sequential().spliterator();
                            while (!this.f49330a.mo17358n() && interfaceC15672XSpliterator.tryAdvance((IntConsumer) c15846u)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                InterfaceC15762D interfaceC15762D = (InterfaceC15762D) ((C15800K2) ((C15986t) this.f49246e).f49402n).apply(obj);
                if (interfaceC15762D != null) {
                    try {
                        boolean z11 = this.f49244c;
                        C15966p c15966p = (C15966p) this.f49245d;
                        if (!z11) {
                            interfaceC15762D.sequential().forEach(c15966p);
                        } else {
                            InterfaceC15669U interfaceC15669USpliterator = interfaceC15762D.sequential().spliterator();
                            while (!this.f49330a.mo17358n() && interfaceC15669USpliterator.tryAdvance((DoubleConsumer) c15966p)) {
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            interfaceC15762D.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                    break;
                }
                if (interfaceC15762D != null) {
                    interfaceC15762D.close();
                    return;
                }
                return;
        }
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        switch (this.f49243b) {
            case 0:
                this.f49244c = true;
                break;
            case 1:
                this.f49244c = true;
                break;
            default:
                this.f49244c = true;
                break;
        }
        return this.f49330a.mo17358n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15891c2(C15919h0 c15919h0, InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49246e = c15919h0;
        InterfaceC15963o2 interfaceC15963o3 = this.f49330a;
        Objects.requireNonNull(interfaceC15963o3);
        this.f49245d = new C15895d0(interfaceC15963o3);
    }
}
