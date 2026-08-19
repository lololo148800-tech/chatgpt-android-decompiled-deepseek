package p203I0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p001A.RunnableC0000A;
import p049Bm.InterfaceC1426a;
import p102Dm.AbstractC2119a;
import p530Vi.AbstractC8301I;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p894n0.C17409o;

/* JADX INFO: renamed from: I0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3563t extends View {

    /* JADX INFO: renamed from: t0 */
    public static final int[] f10796t0 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: u0 */
    public static final int[] f10797u0 = new int[0];

    /* JADX INFO: renamed from: o0 */
    public C3543D f10798o0;

    /* JADX INFO: renamed from: p0 */
    public Boolean f10799p0;

    /* JADX INFO: renamed from: q0 */
    public Long f10800q0;

    /* JADX INFO: renamed from: r0 */
    public RunnableC0000A f10801r0;

    /* JADX INFO: renamed from: s0 */
    public AbstractC16546n f10802s0;

    private final void setRippleState(boolean z6) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f10801r0;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l4 = this.f10800q0;
        long jLongValue = jCurrentAnimationTimeMillis - (l4 != null ? l4.longValue() : 0L);
        if (z6 || jLongValue >= 5) {
            int[] iArr = z6 ? f10796t0 : f10797u0;
            C3543D c3543d = this.f10798o0;
            if (c3543d != null) {
                c3543d.setState(iArr);
            }
        } else {
            RunnableC0000A runnableC0000A = new RunnableC0000A(this, 21);
            this.f10801r0 = runnableC0000A;
            postDelayed(runnableC0000A, 50L);
        }
        this.f10800q0 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(C3563t c3563t) {
        C3543D c3543d = c3563t.f10798o0;
        if (c3543d != null) {
            c3543d.setState(f10797u0);
        }
        c3563t.f10801r0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m4237b(C17409o c17409o, boolean z6, long j10, int i10, long j11, float f10, InterfaceC1426a interfaceC1426a) {
        if (this.f10798o0 == null || !Boolean.valueOf(z6).equals(this.f10799p0)) {
            C3543D c3543d = new C3543D(z6);
            setBackground(c3543d);
            this.f10798o0 = c3543d;
            this.f10799p0 = Boolean.valueOf(z6);
        }
        C3543D c3543d2 = this.f10798o0;
        AbstractC16544l.m18091d(c3543d2);
        this.f10802s0 = (AbstractC16546n) interfaceC1426a;
        Integer num = c3543d2.f10729o0;
        if (num == null || num.intValue() != i10) {
            c3543d2.f10729o0 = Integer.valueOf(i10);
            C3542C.f10726a.m4223a(c3543d2, i10);
        }
        m4240e(f10, j10, j11);
        if (z6) {
            c3543d2.setHotspot(C13800b.m15306g(c17409o.f55604a), C13800b.m15307h(c17409o.f55604a));
        } else {
            c3543d2.setHotspot(c3543d2.getBounds().centerX(), c3543d2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m4238c() {
        this.f10802s0 = null;
        RunnableC0000A runnableC0000A = this.f10801r0;
        if (runnableC0000A != null) {
            removeCallbacks(runnableC0000A);
            RunnableC0000A runnableC0000A2 = this.f10801r0;
            AbstractC16544l.m18091d(runnableC0000A2);
            runnableC0000A2.run();
        } else {
            C3543D c3543d = this.f10798o0;
            if (c3543d != null) {
                c3543d.setState(f10797u0);
            }
        }
        C3543D c3543d2 = this.f10798o0;
        if (c3543d2 == null) {
            return;
        }
        c3543d2.setVisible(false, false);
        unscheduleDrawable(c3543d2);
    }

    /* JADX INFO: renamed from: d */
    public final void m4239d() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m4240e(float f10, long j10, long j11) {
        C3543D c3543d = this.f10798o0;
        if (c3543d == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long jM15774b = C14365u.m15774b(AbstractC8301I.m8917h(f10, 1.0f), j11);
        C14365u c14365u = c3543d.f10728Z;
        if (!(c14365u == null ? false : C14365u.m15775c(c14365u.f45062a, jM15774b))) {
            c3543d.f10728Z = new C14365u(jM15774b);
            c3543d.setColor(ColorStateList.valueOf(AbstractC14334L.m15617F(jM15774b)));
        }
        Rect rect = new Rect(0, 0, AbstractC2119a.m3195i(C13803e.m15333e(j10)), AbstractC2119a.m3195i(C13803e.m15331c(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c3543d.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r6 = this.f10802s0;
        if (r6 != 0) {
            r6.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
