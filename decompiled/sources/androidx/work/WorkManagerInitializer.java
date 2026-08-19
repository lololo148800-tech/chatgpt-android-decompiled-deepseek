package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p282L4.InterfaceC4934b;
import p444S4.C6995a;
import p444S4.C7011q;
import p444S4.C7012r;
import p470T4.AbstractC7255t;
import p470T4.C7253r;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC4934b {

    /* JADX INFO: renamed from: a */
    public static final String f33694a = C7011q.m7409f("WrkMgrInitializer");

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: a */
    public final List mo5546a() {
        return Collections.emptyList();
    }

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: b */
    public final Object mo5547b(Context context) {
        C7011q.m7408d().m7410a(f33694a, "Initializing WorkManager with default configuration.");
        C6995a c6995a = new C6995a(new C7012r());
        synchronized (C7253r.f22995m) {
            try {
                C7253r c7253r = C7253r.f22993k;
                if (c7253r != null && C7253r.f22994l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c7253r == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C7253r.f22994l == null) {
                        C7253r.f22994l = AbstractC7255t.m7694b(applicationContext, c6995a);
                    }
                    C7253r.f22993k = C7253r.f22994l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return C7253r.m7690f(context);
    }
}
