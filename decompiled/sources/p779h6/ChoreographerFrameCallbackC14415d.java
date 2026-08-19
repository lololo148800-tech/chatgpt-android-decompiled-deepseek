package p779h6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p520V5.C7781j;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC14415d extends ValueAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: x0 */
    public C7781j f45303x0;

    /* JADX INFO: renamed from: Y */
    public final CopyOnWriteArraySet f45292Y = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: Z */
    public final CopyOnWriteArraySet f45293Z = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: o0 */
    public final CopyOnWriteArraySet f45294o0 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: p0 */
    public float f45295p0 = 1.0f;

    /* JADX INFO: renamed from: q0 */
    public boolean f45296q0 = false;

    /* JADX INFO: renamed from: r0 */
    public long f45297r0 = 0;

    /* JADX INFO: renamed from: s0 */
    public float f45298s0 = 0.0f;

    /* JADX INFO: renamed from: t0 */
    public float f45299t0 = 0.0f;

    /* JADX INFO: renamed from: u0 */
    public int f45300u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public float f45301v0 = -2.1474836E9f;

    /* JADX INFO: renamed from: w0 */
    public float f45302w0 = 2.1474836E9f;

    /* JADX INFO: renamed from: y0 */
    public boolean f45304y0 = false;

    /* JADX INFO: renamed from: z0 */
    public boolean f45305z0 = false;

    /* JADX INFO: renamed from: a */
    public final float m15915a() {
        C7781j c7781j = this.f45303x0;
        if (c7781j == null) {
            return 0.0f;
        }
        float f10 = this.f45299t0;
        float f11 = c7781j.f24591l;
        return (f10 - f11) / (c7781j.f24592m - f11);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f45293Z.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f45294o0.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f45292Y.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public final float m15916b() {
        C7781j c7781j = this.f45303x0;
        if (c7781j == null) {
            return 0.0f;
        }
        float f10 = this.f45302w0;
        return f10 == 2.1474836E9f ? c7781j.f24592m : f10;
    }

    /* JADX INFO: renamed from: c */
    public final float m15917c() {
        C7781j c7781j = this.f45303x0;
        if (c7781j == null) {
            return 0.0f;
        }
        float f10 = this.f45301v0;
        return f10 == -2.1474836E9f ? c7781j.f24591l : f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f45293Z.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m15919e(m15918d());
        m15921g(true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15918d() {
        return this.f45295p0 < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f45304y0) {
            m15921g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C7781j c7781j = this.f45303x0;
        if (c7781j == null || !this.f45304y0) {
            return;
        }
        long j11 = this.f45297r0;
        float fAbs = (j11 != 0 ? j10 - j11 : 0L) / ((1.0E9f / c7781j.f24593n) / Math.abs(this.f45295p0));
        float f10 = this.f45298s0;
        if (m15918d()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float fM15917c = m15917c();
        float fM15916b = m15916b();
        PointF pointF = AbstractC14417f.f45307a;
        boolean z6 = f11 >= fM15917c && f11 <= fM15916b;
        float f12 = this.f45298s0;
        float fM15925b = AbstractC14417f.m15925b(f11, m15917c(), m15916b());
        this.f45298s0 = fM15925b;
        if (this.f45305z0) {
            fM15925b = (float) Math.floor(fM15925b);
        }
        this.f45299t0 = fM15925b;
        this.f45297r0 = j10;
        if (!this.f45305z0 || this.f45298s0 != f12) {
            m15920f();
        }
        if (!z6) {
            if (getRepeatCount() == -1 || this.f45300u0 < getRepeatCount()) {
                Iterator it = this.f45293Z.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f45300u0++;
                if (getRepeatMode() == 2) {
                    this.f45296q0 = !this.f45296q0;
                    this.f45295p0 = -this.f45295p0;
                } else {
                    float fM15916b2 = m15918d() ? m15916b() : m15917c();
                    this.f45298s0 = fM15916b2;
                    this.f45299t0 = fM15916b2;
                }
                this.f45297r0 = j10;
            } else {
                float fM15917c2 = this.f45295p0 < 0.0f ? m15917c() : m15916b();
                this.f45298s0 = fM15917c2;
                this.f45299t0 = fM15917c2;
                m15921g(true);
                m15919e(m15918d());
            }
        }
        if (this.f45303x0 == null) {
            return;
        }
        float f13 = this.f45299t0;
        if (f13 < this.f45301v0 || f13 > this.f45302w0) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f45301v0), Float.valueOf(this.f45302w0), Float.valueOf(this.f45299t0)));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15919e(boolean z6) {
        for (Animator.AnimatorListener animatorListener : this.f45293Z) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z6);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15920f() {
        Iterator it = this.f45292Y.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15921g(boolean z6) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z6) {
            this.f45304y0 = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM15917c;
        float fM15916b;
        float fM15917c2;
        if (this.f45303x0 == null) {
            return 0.0f;
        }
        if (m15918d()) {
            fM15917c = m15916b() - this.f45299t0;
            fM15916b = m15916b();
            fM15917c2 = m15917c();
        } else {
            fM15917c = this.f45299t0 - m15917c();
            fM15916b = m15916b();
            fM15917c2 = m15917c();
        }
        return fM15917c / (fM15916b - fM15917c2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m15915a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C7781j c7781j = this.f45303x0;
        if (c7781j == null) {
            return 0L;
        }
        return (long) c7781j.m8040b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: h */
    public final void m15922h(float f10) {
        if (this.f45298s0 == f10) {
            return;
        }
        float fM15925b = AbstractC14417f.m15925b(f10, m15917c(), m15916b());
        this.f45298s0 = fM15925b;
        if (this.f45305z0) {
            fM15925b = (float) Math.floor(fM15925b);
        }
        this.f45299t0 = fM15925b;
        this.f45297r0 = 0L;
        m15920f();
    }

    /* JADX INFO: renamed from: i */
    public final void m15923i(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + Separators.RPAREN);
        }
        C7781j c7781j = this.f45303x0;
        float f12 = c7781j == null ? -3.4028235E38f : c7781j.f24591l;
        float f13 = c7781j == null ? Float.MAX_VALUE : c7781j.f24592m;
        float fM15925b = AbstractC14417f.m15925b(f10, f12, f13);
        float fM15925b2 = AbstractC14417f.m15925b(f11, f12, f13);
        if (fM15925b == this.f45301v0 && fM15925b2 == this.f45302w0) {
            return;
        }
        this.f45301v0 = fM15925b;
        this.f45302w0 = fM15925b2;
        m15922h((int) AbstractC14417f.m15925b(this.f45299t0, fM15925b, fM15925b2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f45304y0;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f45293Z.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f45292Y.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f45293Z.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f45294o0.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f45292Y.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j10) {
        setDuration(j10);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f45296q0) {
            return;
        }
        this.f45296q0 = false;
        this.f45295p0 = -this.f45295p0;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
