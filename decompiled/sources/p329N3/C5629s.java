package p329N3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: N3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5629s {

    /* JADX INFO: renamed from: a */
    public final C5618h f18269a;

    /* JADX INFO: renamed from: b */
    public final C5627q f18270b;

    /* JADX INFO: renamed from: c */
    public final ChoreographerFrameCallbackC5628r f18271c;

    /* JADX INFO: renamed from: d */
    public boolean f18272d;

    /* JADX INFO: renamed from: e */
    public Surface f18273e;

    /* JADX INFO: renamed from: f */
    public float f18274f;

    /* JADX INFO: renamed from: g */
    public float f18275g;

    /* JADX INFO: renamed from: h */
    public float f18276h;

    /* JADX INFO: renamed from: i */
    public float f18277i;

    /* JADX INFO: renamed from: j */
    public int f18278j;

    /* JADX INFO: renamed from: k */
    public long f18279k;

    /* JADX INFO: renamed from: l */
    public long f18280l;

    /* JADX INFO: renamed from: m */
    public long f18281m;

    /* JADX INFO: renamed from: n */
    public long f18282n;

    /* JADX INFO: renamed from: o */
    public long f18283o;

    /* JADX INFO: renamed from: p */
    public long f18284p;

    /* JADX INFO: renamed from: q */
    public long f18285q;

    public C5629s(Context context) {
        DisplayManager displayManager;
        C5618h c5618h = new C5618h();
        c5618h.f18198a = new C5617g();
        c5618h.f18199b = new C5617g();
        c5618h.f18201d = -9223372036854775807L;
        this.f18269a = c5618h;
        C5627q c5627q = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C5627q(this, displayManager);
        this.f18270b = c5627q;
        this.f18271c = c5627q != null ? ChoreographerFrameCallbackC5628r.f18264q0 : null;
        this.f18279k = -9223372036854775807L;
        this.f18280l = -9223372036854775807L;
        this.f18274f = -1.0f;
        this.f18277i = 1.0f;
        this.f18278j = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m6036a(C5629s c5629s, Display display) {
        c5629s.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c5629s.f18279k = refreshRate;
            c5629s.f18280l = (refreshRate * 80) / 100;
        } else {
            AbstractC20800b.m21332t("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c5629s.f18279k = -9223372036854775807L;
            c5629s.f18280l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6037b() {
        Surface surface;
        if (AbstractC20817s.f66106a < 30 || (surface = this.f18273e) == null || this.f18278j == Integer.MIN_VALUE || this.f18276h == 0.0f) {
            return;
        }
        this.f18276h = 0.0f;
        AbstractC5626p.m6035a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX INFO: renamed from: c */
    public final void m6038c() {
        float f10;
        float f11;
        if (AbstractC20817s.f66106a < 30 || this.f18273e == null) {
            return;
        }
        C5618h c5618h = this.f18269a;
        if (!c5618h.f18198a.m6006a()) {
            f10 = this.f18274f;
        } else if (c5618h.f18198a.m6006a()) {
            C5617g c5617g = c5618h.f18198a;
            long j10 = c5617g.f18194e;
            f10 = (float) (1.0E9d / (j10 != 0 ? c5617g.f18195f / j10 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.f18275g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (c5618h.f18198a.m6006a()) {
                if ((c5618h.f18198a.m6006a() ? c5618h.f18198a.f18195f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f18275g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && c5618h.f18202e < 30) {
            return;
        }
        this.f18275g = f10;
        m6039d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX INFO: renamed from: d */
    public final void m6039d(boolean z6) {
        Surface surface;
        float f10;
        if (AbstractC20817s.f66106a < 30 || (surface = this.f18273e) == null || this.f18278j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f18272d) {
            float f11 = this.f18275g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f18277i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z6 || this.f18276h != f10) {
            this.f18276h = f10;
            AbstractC5626p.m6035a(surface, f10);
        }
    }
}
