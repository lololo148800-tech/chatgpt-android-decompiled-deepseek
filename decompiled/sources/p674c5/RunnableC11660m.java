package p674c5;

import android.content.Context;
import android.os.Build;
import p221Ii.RunnableC3724c;
import p301M.RunnableC5228j;
import p444S4.AbstractC7010p;
import p444S4.C7011q;
import p658b5.C11245p;
import p697d5.C13027j;
import p719e5.C13285a;

/* JADX INFO: renamed from: c5.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11660m implements Runnable {

    /* JADX INFO: renamed from: s0 */
    public static final String f35309s0 = C7011q.m7409f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: Y */
    public final C13027j f35310Y = new C13027j();

    /* JADX INFO: renamed from: Z */
    public final Context f35311Z;

    /* JADX INFO: renamed from: o0 */
    public final C11245p f35312o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC7010p f35313p0;

    /* JADX INFO: renamed from: q0 */
    public final C11661n f35314q0;

    /* JADX INFO: renamed from: r0 */
    public final C13285a f35315r0;

    public RunnableC11660m(Context context, C11245p c11245p, AbstractC7010p abstractC7010p, C11661n c11661n, C13285a c13285a) {
        this.f35311Z = context;
        this.f35312o0 = c11245p;
        this.f35313p0 = abstractC7010p;
        this.f35314q0 = c11661n;
        this.f35315r0 = c13285a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f35312o0.f34057q || Build.VERSION.SDK_INT >= 31) {
            this.f35310Y.m14769k(null);
            return;
        }
        C13027j c13027j = new C13027j();
        C13285a c13285a = this.f35315r0;
        c13285a.f41993d.execute(new RunnableC3724c(this, 27, c13027j));
        c13027j.mo5766a(new RunnableC5228j(this, c13027j, false, 21), c13285a.f41993d);
    }
}
