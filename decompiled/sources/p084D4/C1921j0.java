package p084D4;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: D4.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1921j0 {

    /* JADX INFO: renamed from: a */
    public int f5621a;

    /* JADX INFO: renamed from: b */
    public int f5622b;

    /* JADX INFO: renamed from: c */
    public int f5623c;

    /* JADX INFO: renamed from: d */
    public int f5624d;

    /* JADX INFO: renamed from: e */
    public BaseInterpolator f5625e;

    /* JADX INFO: renamed from: f */
    public boolean f5626f;

    /* JADX INFO: renamed from: g */
    public int f5627g;

    /* JADX INFO: renamed from: a */
    public final void m3079a(RecyclerView recyclerView) {
        int i10 = this.f5624d;
        if (i10 >= 0) {
            this.f5624d = -1;
            recyclerView.m12267Q(i10);
            this.f5626f = false;
            return;
        }
        if (!this.f5626f) {
            this.f5627g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f5625e;
        if (baseInterpolator != null && this.f5623c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f5623c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f33641o1.m3085c(this.f5621a, this.f5622b, i11, baseInterpolator);
        int i12 = this.f5627g + 1;
        this.f5627g = i12;
        if (i12 > 10) {
            AbstractC15256t.m16465c("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f5626f = false;
    }
}
