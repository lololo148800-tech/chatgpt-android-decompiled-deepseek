package p030B2;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: B2.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0768l0 {

    /* JADX INFO: renamed from: a */
    public final int f2162a;

    /* JADX INFO: renamed from: b */
    public float f2163b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f2164c;

    /* JADX INFO: renamed from: d */
    public final long f2165d;

    public AbstractC0768l0(int i10, Interpolator interpolator, long j10) {
        this.f2162a = i10;
        this.f2164c = interpolator;
        this.f2165d = j10;
    }

    /* JADX INFO: renamed from: a */
    public long mo1702a() {
        return this.f2165d;
    }

    /* JADX INFO: renamed from: b */
    public float mo1703b() {
        Interpolator interpolator = this.f2164c;
        return interpolator != null ? interpolator.getInterpolation(this.f2163b) : this.f2163b;
    }

    /* JADX INFO: renamed from: c */
    public int mo1704c() {
        return this.f2162a;
    }

    /* JADX INFO: renamed from: d */
    public void mo1705d(float f10) {
        this.f2163b = f10;
    }
}
