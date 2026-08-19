package p178H;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: H.K */
/* JADX INFO: loaded from: classes.dex */
public final class C3118K extends AbstractC3182z {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f9394p0 = 1;

    /* JADX INFO: renamed from: q0 */
    public final Object f9395q0;

    public C3118K(InterfaceC3127U interfaceC3127U) {
        super(interfaceC3127U);
        this.f9395q0 = new AtomicBoolean(false);
    }

    @Override // p178H.AbstractC3182z, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.f9394p0) {
            case 1:
                if (!((AtomicBoolean) this.f9395q0).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public C3118K(InterfaceC3127U interfaceC3127U, C3119L c3119l) {
        super(interfaceC3127U);
        this.f9395q0 = new WeakReference(c3119l);
        m4027a(new C3117J(this, 0));
    }
}
