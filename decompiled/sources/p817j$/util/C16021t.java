package p817j$.util;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.t */
/* JADX INFO: loaded from: classes4.dex */
final class C16021t extends C15735n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // p817j$.util.C15735n, java.util.List
    public final List subList(int i10, int i11) {
        return new C16021t(this.f49004b.subList(i10, i11));
    }

    private Object writeReplace() {
        return new C15735n(this.f49004b);
    }
}
