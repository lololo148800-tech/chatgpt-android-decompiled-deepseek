package p001A;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import java.util.concurrent.ScheduledFuture;
import p178H.C3130X;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.x0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0097x0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f419Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f420Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f421o0;

    public /* synthetic */ RunnableC0097x0(Object obj, long j10, int i10) {
        this.f419Y = i10;
        this.f420Z = obj;
        this.f421o0 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f419Y) {
            case 0:
                C0007D0 c0007d0 = (C0007D0) this.f420Z;
                if (this.f421o0 == c0007d0.f33k) {
                    c0007d0.m11b();
                }
                break;
            case 1:
                C0007D0 c0007d1 = (C0007D0) this.f420Z;
                c0007d1.getClass();
                c0007d1.f24b.execute(new RunnableC0097x0(c0007d1, this.f421o0, 3));
                break;
            case 2:
                C0007D0 c0007d2 = (C0007D0) this.f420Z;
                c0007d2.getClass();
                c0007d2.f24b.execute(new RunnableC0097x0(c0007d2, this.f421o0, 0));
                break;
            case 3:
                C0007D0 c0007d3 = (C0007D0) this.f420Z;
                if (this.f421o0 == c0007d3.f33k) {
                    ScheduledFuture scheduledFuture = c0007d3.f32j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        c0007d3.f32j = null;
                    }
                    C10142i c10142i = c0007d3.f40r;
                    if (c10142i != null) {
                        c10142i.m10747a(new C3130X(1));
                        c0007d3.f40r = null;
                    }
                }
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) this.f420Z).m16370a(this.f421o0, null);
                break;
        }
    }
}
