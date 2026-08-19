package p561X;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import p001A.C0083q0;
import p178H.C3170s0;
import p414R.C6781o;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: X.p */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC9002p implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: Y */
    public Size f27463Y;

    /* JADX INFO: renamed from: Z */
    public C3170s0 f27464Z;

    /* JADX INFO: renamed from: o0 */
    public C3170s0 f27465o0;

    /* JADX INFO: renamed from: p0 */
    public C0083q0 f27466p0;

    /* JADX INFO: renamed from: q0 */
    public Size f27467q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f27468r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f27469s0 = false;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C9003q f27470t0;

    public SurfaceHolderCallbackC9002p(C9003q c9003q) {
        this.f27470t0 = c9003q;
    }

    /* JADX INFO: renamed from: a */
    public final void m9590a() {
        if (this.f27464Z != null) {
            AbstractC8072d6.m8486c("SurfaceViewImpl", "Request canceled: " + this.f27464Z);
            this.f27464Z.m4001c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9591b() {
        C9003q c9003q = this.f27470t0;
        Surface surface = c9003q.f27471e.getHolder().getSurface();
        if (this.f27468r0 || this.f27464Z == null || !Objects.equals(this.f27463Y, this.f27467q0)) {
            return false;
        }
        AbstractC8072d6.m8486c("SurfaceViewImpl", "Surface set on Preview.");
        C0083q0 c0083q0 = this.f27466p0;
        C3170s0 c3170s0 = this.f27464Z;
        Objects.requireNonNull(c3170s0);
        c3170s0.m3999a(surface, AbstractC17803d.m19557d(c9003q.f27471e.getContext()), new C6781o(c0083q0, 1));
        this.f27468r0 = true;
        c9003q.f27452d = true;
        c9003q.m9586f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        AbstractC8072d6.m8486c("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
        this.f27467q0 = new Size(i11, i12);
        m9591b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C3170s0 c3170s0;
        AbstractC8072d6.m8486c("SurfaceViewImpl", "Surface created.");
        if (!this.f27469s0 || (c3170s0 = this.f27465o0) == null) {
            return;
        }
        c3170s0.m4001c();
        c3170s0.f9542i.m10747a(null);
        this.f27465o0 = null;
        this.f27469s0 = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC8072d6.m8486c("SurfaceViewImpl", "Surface destroyed.");
        if (!this.f27468r0) {
            m9590a();
        } else if (this.f27464Z != null) {
            AbstractC8072d6.m8486c("SurfaceViewImpl", "Surface closed " + this.f27464Z);
            this.f27464Z.f9544k.mo4507a();
        }
        this.f27469s0 = true;
        C3170s0 c3170s0 = this.f27464Z;
        if (c3170s0 != null) {
            this.f27465o0 = c3170s0;
        }
        this.f27468r0 = false;
        this.f27464Z = null;
        this.f27466p0 = null;
        this.f27467q0 = null;
        this.f27463Y = null;
    }
}
