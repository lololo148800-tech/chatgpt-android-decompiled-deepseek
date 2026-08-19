package p953q0;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import p349O0.InterfaceC6034v0;
import p372P3.C6337s;
import p392Q0.C6546d;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC18568a implements InterfaceC18587j0, InterfaceC6034v0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: s0 */
    public static long f59150s0;

    /* JADX INFO: renamed from: Y */
    public final View f59151Y;

    /* JADX INFO: renamed from: o0 */
    public boolean f59153o0;

    /* JADX INFO: renamed from: q0 */
    public boolean f59155q0;

    /* JADX INFO: renamed from: r0 */
    public long f59156r0;

    /* JADX INFO: renamed from: Z */
    public final C6546d f59152Z = new C6546d(new C18585i0[16]);

    /* JADX INFO: renamed from: p0 */
    public final Choreographer f59154p0 = Choreographer.getInstance();

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public RunnableC18568a(View view) {
        float refreshRate;
        this.f59151Y = view;
        if (f59150s0 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f59150s0 = (long) (1000000000 / refreshRate);
        }
    }

    @Override // p953q0.InterfaceC18587j0
    /* JADX INFO: renamed from: b */
    public final void mo19935b(C18585i0 c18585i0) {
        this.f59152Z.m7099c(c18585i0);
        if (this.f59153o0) {
            return;
        }
        this.f59153o0 = true;
        this.f59151Y.post(this);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        this.f59155q0 = false;
        this.f59151Y.removeCallbacks(this);
        this.f59154p0.removeFrameCallback(this);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        this.f59155q0 = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f59155q0) {
            this.f59156r0 = j10;
            this.f59151Y.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6546d c6546d = this.f59152Z;
        if (c6546d.m7108m() || !this.f59153o0 || !this.f59155q0 || this.f59151Y.getWindowVisibility() != 0) {
            this.f59153o0 = false;
            return;
        }
        long j10 = this.f59156r0 + f59150s0;
        C6337s c6337s = new C6337s();
        c6337s.f20561a = j10;
        boolean z6 = false;
        while (c6546d.m7109n() && !z6) {
            if (c6337s.m6950c() <= 0 || ((C18585i0) c6546d.f21182Y[0]).m19946b(c6337s)) {
                z6 = true;
            } else {
                c6546d.m7111p(0);
            }
        }
        if (z6) {
            this.f59154p0.postFrameCallback(this);
        } else {
            this.f59153o0 = false;
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
    }
}
