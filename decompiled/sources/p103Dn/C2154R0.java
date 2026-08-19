package p103Dn;

import java.util.concurrent.atomic.AtomicReference;
import p129En.AbstractC2591b;
import p129En.AbstractC2592c;
import p129En.AbstractC2593d;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Dn.R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2154R0 extends AbstractC2593d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f6600a = new AtomicReference(null);

    @Override // p129En.AbstractC2593d
    /* JADX INFO: renamed from: a */
    public final boolean mo3246a(AbstractC2591b abstractC2591b) {
        AtomicReference atomicReference = this.f6600a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC2124C.f6497d);
        return true;
    }

    @Override // p129En.AbstractC2593d
    /* JADX INFO: renamed from: b */
    public final InterfaceC18770c[] mo3247b(AbstractC2591b abstractC2591b) {
        this.f6600a.set(null);
        return AbstractC2592c.f8036a;
    }
}
