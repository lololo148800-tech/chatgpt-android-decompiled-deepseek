package p817j$.util.stream;

import java.util.ArrayList;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Collection;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.stream.L2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15805L2 extends AbstractC15760C2 {

    /* JADX INFO: renamed from: d */
    private ArrayList f49116d;

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49116d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        AbstractC15666Q.m17270r(this.f49116d, this.f49042b);
        long size = this.f49116d.size();
        InterfaceC15963o2 interfaceC15963o2 = this.f49330a;
        interfaceC15963o2.mo17364l(size);
        if (!this.f49043c) {
            ArrayList arrayList = this.f49116d;
            Objects.requireNonNull(interfaceC15963o2);
            Collection.EL.m17238a(arrayList, new C15800K2(0, interfaceC15963o2));
        } else {
            for (Object obj : this.f49116d) {
                if (interfaceC15963o2.mo17358n()) {
                    break;
                } else {
                    interfaceC15963o2.m17405p(obj);
                }
            }
        }
        interfaceC15963o2.mo17363k();
        this.f49116d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) {
        this.f49116d.add(obj);
    }
}
