package p817j$.util.stream;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.C2 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15760C2 extends AbstractC15939k2 {

    /* JADX INFO: renamed from: b */
    protected final Comparator f49042b;

    /* JADX INFO: renamed from: c */
    protected boolean f49043c;

    AbstractC15760C2(InterfaceC15963o2 interfaceC15963o2, Comparator comparator) {
        super(interfaceC15963o2);
        this.f49042b = comparator;
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final boolean mo17358n() {
        this.f49043c = true;
        return false;
    }
}
