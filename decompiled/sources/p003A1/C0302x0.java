package p003A1;

import android.os.Build;
import android.view.ViewConfiguration;
import p571X9.AbstractC9400y4;

/* JADX INFO: renamed from: A1.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0302x0 implements InterfaceC0161D1 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f1076a;

    public C0302x0(ViewConfiguration viewConfiguration) {
        this.f1076a = viewConfiguration;
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: a */
    public final long mo498a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: b */
    public final long mo499b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: c */
    public final float mo500c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0308z0.f1081a.m911b(this.f1076a);
        }
        return 2.0f;
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: d */
    public final long mo501d() {
        float f10 = 48;
        return AbstractC9400y4.m9979b(f10, f10);
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: e */
    public final float mo502e() {
        return this.f1076a.getScaledMaximumFlingVelocity();
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: f */
    public final float mo503f() {
        return this.f1076a.getScaledTouchSlop();
    }

    @Override // p003A1.InterfaceC0161D1
    /* JADX INFO: renamed from: g */
    public final float mo504g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0308z0.f1081a.m910a(this.f1076a);
        }
        return 16.0f;
    }
}
