package p030B2;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: B2.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0766k0 extends AbstractC0768l0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f2161e;

    public C0766k0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2161e = windowInsetsAnimation;
    }

    @Override // p030B2.AbstractC0768l0
    /* JADX INFO: renamed from: a */
    public final long mo1702a() {
        return this.f2161e.getDurationMillis();
    }

    @Override // p030B2.AbstractC0768l0
    /* JADX INFO: renamed from: b */
    public final float mo1703b() {
        return this.f2161e.getInterpolatedFraction();
    }

    @Override // p030B2.AbstractC0768l0
    /* JADX INFO: renamed from: c */
    public final int mo1704c() {
        return this.f2161e.getTypeMask();
    }

    @Override // p030B2.AbstractC0768l0
    /* JADX INFO: renamed from: d */
    public final void mo1705d(float f10) {
        this.f2161e.setFraction(f10);
    }
}
