package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p037B9.MeDP.MpoABj;
import p329N3.RunnableC5611a;
import p444S4.AbstractC7010p;
import p444S4.C7011q;
import p566X4.AbstractC9045c;
import p566X4.C9044b;
import p566X4.InterfaceC9047e;
import p658b5.C11245p;
import p697d5.C13027j;
import p741f5.AbstractC13543b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18067d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "LS4/p;", "LX4/e;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConstraintTrackingWorker extends AbstractC7010p implements InterfaceC9047e {

    /* JADX INFO: renamed from: q0 */
    public final WorkerParameters f33737q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f33738r0;

    /* JADX INFO: renamed from: s0 */
    public volatile boolean f33739s0;

    /* JADX INFO: renamed from: t0 */
    public final C13027j f33740t0;

    /* JADX INFO: renamed from: u0 */
    public AbstractC7010p f33741u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(workerParameters, "workerParameters");
        this.f33737q0 = workerParameters;
        this.f33738r0 = new Object();
        this.f33740t0 = new C13027j();
    }

    @Override // p566X4.InterfaceC9047e
    /* JADX INFO: renamed from: b */
    public final void mo7909b(C11245p c11245p, AbstractC9045c state) {
        AbstractC16544l.m18094g(state, "state");
        C7011q.m7408d().m7410a(AbstractC13543b.f42866a, "Constraints changed for " + c11245p);
        if (state instanceof C9044b) {
            synchronized (this.f33738r0) {
                this.f33739s0 = true;
            }
        }
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: c */
    public final void mo7405c() {
        AbstractC7010p abstractC7010p = this.f33741u0;
        if (abstractC7010p == null || abstractC7010p.f22418o0 != -256) {
            return;
        }
        abstractC7010p.m7407e(Build.VERSION.SDK_INT >= 31 ? this.f22418o0 : 0);
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: d */
    public final C13027j mo7406d() {
        this.f22417Z.f33699d.execute(new RunnableC5611a(this, 29));
        C13027j c13027j = this.f33740t0;
        AbstractC16544l.m18093f(c13027j, MpoABj.IeemVHxMnblPe);
        return c13027j;
    }
}
