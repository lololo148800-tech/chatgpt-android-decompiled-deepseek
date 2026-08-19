package np;

import io.sentry.clientreport.C15333a;
import p849k7.C16361n;
import p951pp.AbstractC18535e;
import p951pp.C18534d;
import p975qp.InterfaceC18797a;

/* JADX INFO: renamed from: np.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17713e {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18797a f56550a;

    static {
        InterfaceC18797a interfaceC18797a;
        C18534d c18534dM19445b = AbstractC17712d.m19445b();
        if (c18534dM19445b == null) {
            AbstractC18535e.m19899a("Failed to find provider.");
            AbstractC18535e.m19899a("Defaulting to no-operation MDCAdapter implementation.");
            f56550a = new C16361n();
        } else {
            switch (c18534dM19445b.f59049a) {
                case 0:
                    interfaceC18797a = (C16361n) c18534dM19445b.f59051c;
                    break;
                default:
                    interfaceC18797a = (C15333a) c18534dM19445b.f59051c;
                    break;
            }
            f56550a = interfaceC18797a;
        }
    }
}
