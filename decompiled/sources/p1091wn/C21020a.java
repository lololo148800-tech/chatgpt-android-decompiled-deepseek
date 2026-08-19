package p1091wn;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: wn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21020a implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f66886a;

    public C21020a(InterfaceC21029j interfaceC21029j) {
        this.f66886a = new AtomicReference(interfaceC21029j);
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        InterfaceC21029j interfaceC21029j = (InterfaceC21029j) this.f66886a.getAndSet(null);
        if (interfaceC21029j != null) {
            return interfaceC21029j.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
