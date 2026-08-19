package p468T2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0010F;
import p1096x2.AbstractC21108c;
import p1096x2.C21109d;
import p1096x2.C21113h;
import p140Fa.C2685e;
import p283L5.AbstractC4941g;
import p329N3.RunnableC5611a;
import p571X9.AbstractC9172M3;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p826j6.C16137F;

/* JADX INFO: renamed from: T2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7225q implements InterfaceC7217i {

    /* JADX INFO: renamed from: Y */
    public final Context f22917Y;

    /* JADX INFO: renamed from: Z */
    public final C21109d f22918Z;

    /* JADX INFO: renamed from: o0 */
    public final C2685e f22919o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f22920p0;

    /* JADX INFO: renamed from: q0 */
    public Handler f22921q0;

    /* JADX INFO: renamed from: r0 */
    public ThreadPoolExecutor f22922r0;

    /* JADX INFO: renamed from: s0 */
    public ThreadPoolExecutor f22923s0;

    /* JADX INFO: renamed from: t0 */
    public AbstractC9172M3 f22924t0;

    public C7225q(Context context, C21109d c21109d) {
        C2685e c2685e = C7226r.f22925d;
        this.f22920p0 = new Object();
        AbstractC4941g.m5558Q(context, "Context cannot be null");
        this.f22917Y = context.getApplicationContext();
        this.f22918Z = c21109d;
        this.f22919o0 = c2685e;
    }

    /* JADX INFO: renamed from: a */
    public final void m7622a() {
        synchronized (this.f22920p0) {
            try {
                this.f22924t0 = null;
                Handler handler = this.f22921q0;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f22921q0 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f22923s0;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f22922r0 = null;
                this.f22923s0 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7623b() {
        synchronized (this.f22920p0) {
            try {
                if (this.f22924t0 == null) {
                    return;
                }
                if (this.f22922r0 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7209a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f22923s0 = threadPoolExecutor;
                    this.f22922r0 = threadPoolExecutor;
                }
                this.f22922r0.execute(new RunnableC5611a(this, 12));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C21113h m7624c() {
        try {
            C2685e c2685e = this.f22919o0;
            Context context = this.f22917Y;
            C21109d c21109d = this.f22918Z;
            c2685e.getClass();
            Object[] objArr = {c21109d};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C16137F c16137fM21579a = AbstractC21108c.m21579a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = c16137fM21579a.f50063Z;
            if (i10 != 0) {
                throw new RuntimeException(AbstractC0010F.m19c(i10, "fetchFonts failed (", Separators.RPAREN));
            }
            C21113h[] c21113hArr = (C21113h[]) ((List) c16137fM21579a.f50064o0).get(0);
            if (c21113hArr == null || c21113hArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c21113hArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }

    @Override // p468T2.InterfaceC7217i
    /* JADX INFO: renamed from: x */
    public final void mo7608x(AbstractC9172M3 abstractC9172M3) {
        synchronized (this.f22920p0) {
            this.f22924t0 = abstractC9172M3;
        }
        m7623b();
    }
}
