package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0631p0;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p329N3.RunnableC5611a;
import p444S4.AbstractC7010p;
import p444S4.C6999e;
import p444S4.C7000f;
import p444S4.C7005k;
import p697d5.C13027j;
import p747fb.InterfaceFutureC13608b;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Landroidx/work/CoroutineWorker;", "LS4/p;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class CoroutineWorker extends AbstractC7010p {

    /* JADX INFO: renamed from: q0 */
    public final C0631p0 f33691q0;

    /* JADX INFO: renamed from: r0 */
    public final C13027j f33692r0;

    /* JADX INFO: renamed from: s0 */
    public final C3516e f33693s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(params, "params");
        this.f33691q0 = AbstractC0575H.m1175d();
        C13027j c13027j = new C13027j();
        this.f33692r0 = c13027j;
        c13027j.mo5766a(new RunnableC5611a(this, 10), params.f33700e.f41990a);
        this.f33693s0 = AbstractC0593T.f1824a;
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo7404a() {
        C0631p0 c0631p0M1175d = AbstractC0575H.m1175d();
        C2925c c2925cM1174c = AbstractC0575H.m1174c(getF33348w0().plus(c0631p0M1175d));
        C7005k c7005k = new C7005k(c0631p0M1175d);
        AbstractC0575H.m1156D(c2925cM1174c, null, null, new C6999e(c7005k, this, null), 3);
        return c7005k;
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: c */
    public final void mo7405c() {
        this.f33692r0.cancel(false);
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: d */
    public final C13027j mo7406d() {
        AbstractC0575H.m1156D(AbstractC0575H.m1174c(getF33348w0().plus(this.f33691q0)), null, null, new C7000f(this, null), 3);
        return this.f33692r0;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo12108f(AbstractC19687c abstractC19687c);

    /* JADX INFO: renamed from: g */
    public AbstractC0563B getF33348w0() {
        return this.f33693s0;
    }
}
