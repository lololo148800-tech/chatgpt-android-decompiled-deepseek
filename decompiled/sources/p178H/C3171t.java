package p178H;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;
import p001A.C0100z;
import p003A1.AbstractC0168G;
import p1115y.C21349a;
import p1115y.C21350b;
import p1115y.C21351c;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3841i0;
import p228J.EnumC3803G;
import p228J.InterfaceC3805H;
import p326N.InterfaceC5569k;

/* JADX INFO: renamed from: H.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3171t implements InterfaceC5569k {

    /* JADX INFO: renamed from: Z */
    public static final C3828c f9548Z = new C3828c("camerax.core.appConfig.cameraFactoryProvider", C21349a.class, null);

    /* JADX INFO: renamed from: o0 */
    public static final C3828c f9549o0 = new C3828c("camerax.core.appConfig.deviceSurfaceManagerProvider", C21350b.class, null);

    /* JADX INFO: renamed from: p0 */
    public static final C3828c f9550p0 = new C3828c("camerax.core.appConfig.useCaseConfigFactoryProvider", C21351c.class, null);

    /* JADX INFO: renamed from: q0 */
    public static final C3828c f9551q0 = new C3828c("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: r0 */
    public static final C3828c f9552r0 = new C3828c("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: s0 */
    public static final C3828c f9553s0 = new C3828c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: t0 */
    public static final C3828c f9554t0 = new C3828c("camerax.core.appConfig.availableCamerasLimiter", C3163p.class, null);

    /* JADX INFO: renamed from: u0 */
    public static final C3828c f9555u0 = new C3828c("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* JADX INFO: renamed from: v0 */
    public static final C3828c f9556v0 = new C3828c("camerax.core.appConfig.cameraProviderInitRetryPolicy", InterfaceC3148h0.class, null);

    /* JADX INFO: renamed from: w0 */
    public static final C3828c f9557w0 = new C3828c("camerax.core.appConfig.quirksSettings", C3841i0.class, null);

    /* JADX INFO: renamed from: Y */
    public final C3835f0 f9558Y;

    public C3171t(C3835f0 c3835f0) {
        this.f9558Y = c3835f0;
    }

    @Override // p326N.InterfaceC5569k
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String mo33F() {
        throw null;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Set mo34H(C3828c c3828c) {
        return AbstractC0168G.m516e(this, c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object mo36M(C3828c c3828c, Object obj) {
        return AbstractC0168G.m520i(this, c3828c, obj);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean mo37O(C3828c c3828c) {
        return AbstractC0168G.m512a(this, c3828c);
    }

    /* JADX INFO: renamed from: a */
    public final C3163p m4002a() {
        Object objMo39b;
        try {
            objMo39b = this.f9558Y.mo39b(f9554t0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        return (C3163p) objMo39b;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo39b(C3828c c3828c) {
        return AbstractC0168G.m519h(this, c3828c);
    }

    /* JADX INFO: renamed from: d */
    public final C21349a m4003d() {
        Object objMo39b;
        try {
            objMo39b = this.f9558Y.mo39b(f9548Z);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        return (C21349a) objMo39b;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo41e(C0100z c0100z) {
        AbstractC0168G.m513b(this, c0100z);
    }

    @Override // p228J.InterfaceC3849m0
    public final InterfaceC3805H getConfig() {
        return this.f9558Y;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ EnumC3803G mo42h(C3828c c3828c) {
        return AbstractC0168G.m515d(this, c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set mo44k() {
        return AbstractC0168G.m517f(this);
    }

    /* JADX INFO: renamed from: o */
    public final long m4004o() {
        C3828c c3828c = f9555u0;
        Object objMo39b = -1L;
        C3835f0 c3835f0 = this.f9558Y;
        c3835f0.getClass();
        try {
            objMo39b = c3835f0.mo39b(c3828c);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objMo39b).longValue();
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        return AbstractC0168G.m521j(this, c3828c, enumC3803G);
    }

    /* JADX INFO: renamed from: t */
    public final C21350b m4005t() {
        Object objMo39b;
        try {
            objMo39b = this.f9558Y.mo39b(f9549o0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        return (C21350b) objMo39b;
    }

    @Override // p326N.InterfaceC5569k
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String mo51v(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public final C21351c m4006x() {
        Object objMo39b;
        try {
            objMo39b = this.f9558Y.mo39b(f9550p0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        return (C21351c) objMo39b;
    }
}
