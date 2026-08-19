package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17314q;
import p006A4.C0360u;
import p030B2.RunnableC0789w;
import p049Bm.InterfaceC1426a;
import p102Dm.AbstractC2119a;
import p1132yk.AbstractC21548b;
import p239Ja.C4308k;
import p329N3.RunnableC5611a;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9227W;
import p665bk.C11483d;
import p730ek.C13436a;
import p730ek.C13438c;
import p730ek.C13441f;
import p730ek.C13442g;
import p730ek.EnumC13440e;
import p730ek.RunnableC13439d;
import p979r2.AbstractC18861b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001cJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "previewView", "Lmm/C;", "setPreviewView", "(Landroid/view/View;)V", "Landroid/graphics/drawable/Drawable;", "H0", "Lmm/i;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "I0", "getDrawableRight", "drawableRight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "L0", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "leftPoseImage", "M0", "getRightPoseImage", "setRightPoseImage", "rightPoseImage", "ek/e", "selfie_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SelfieOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ int f40876S0 = 0;

    /* JADX INFO: renamed from: G0 */
    public final C11483d f40877G0;

    /* JADX INFO: renamed from: H0 */
    public final C17314q f40878H0;

    /* JADX INFO: renamed from: I0 */
    public final C17314q f40879I0;

    /* JADX INFO: renamed from: J0 */
    public final int f40880J0;

    /* JADX INFO: renamed from: K0 */
    public final int f40881K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public UiComponentConfig.RemoteImage leftPoseImage;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public UiComponentConfig.RemoteImage rightPoseImage;

    /* JADX INFO: renamed from: N0 */
    public View f40884N0;

    /* JADX INFO: renamed from: O0 */
    public final ArrayList f40885O0;

    /* JADX INFO: renamed from: P0 */
    public final ArrayList f40886P0;

    /* JADX INFO: renamed from: Q0 */
    public View f40887Q0;

    /* JADX INFO: renamed from: R0 */
    public EnumC13440e f40888R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC16544l.m18094g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.pi2_selfie_overlay, this);
        int i10 = R.id.blinds_view;
        View viewM9654b = AbstractC9123E2.m9654b(this, R.id.blinds_view);
        if (viewM9654b != null) {
            i10 = R.id.circle_mask;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) AbstractC9123E2.m9654b(this, R.id.circle_mask);
            if (pi2CircleMaskView != null) {
                i10 = R.id.hint_animation;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(this, R.id.hint_animation);
                if (themeableLottieAnimationView != null) {
                    i10 = R.id.hint_image;
                    ImageView imageView = (ImageView) AbstractC9123E2.m9654b(this, R.id.hint_image);
                    if (imageView != null) {
                        i10 = R.id.hint_overlay_view;
                        View viewM9654b2 = AbstractC9123E2.m9654b(this, R.id.hint_overlay_view);
                        if (viewM9654b2 != null) {
                            i10 = R.id.image_overlay_view;
                            View viewM9654b3 = AbstractC9123E2.m9654b(this, R.id.image_overlay_view);
                            if (viewM9654b3 != null) {
                                i10 = R.id.progress_arc;
                                Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) AbstractC9123E2.m9654b(this, R.id.progress_arc);
                                if (pi2ProgressArcView != null) {
                                    this.f40877G0 = new C11483d(this, viewM9654b, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewM9654b2, viewM9654b3, pi2ProgressArcView);
                                    this.f40878H0 = AbstractC9227W.m9800c(new C0360u(context, 1));
                                    this.f40879I0 = AbstractC9227W.m9800c(new C0360u(context, 2));
                                    Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaSelfieLookLeftLottieRaw);
                                    this.f40880J0 = numM8409e != null ? numM8409e.intValue() : R.raw.pi2_selfie_left_pose;
                                    Integer numM8409e2 = AbstractC8040Z5.m8409e(context, R.attr.personaSelfieLookLeftLottieRaw);
                                    this.f40881K0 = numM8409e2 != null ? numM8409e2.intValue() : R.raw.pi2_selfie_right_pose;
                                    this.f40885O0 = new ArrayList();
                                    this.f40886P0 = new ArrayList();
                                    themeableLottieAnimationView.m13141c(new C13438c(this, 0));
                                    themeableLottieAnimationView.f35936v0.f24660Z.addListener(new C4308k(this, 5));
                                    int color = Color.parseColor("#022050");
                                    Context context2 = getContext();
                                    AbstractC16544l.m18093f(context2, "getContext(...)");
                                    themeableLottieAnimationView.m14575i(color, AbstractC8040Z5.m8408d(context2, R.attr.colorPrimaryVariant));
                                    int color2 = Color.parseColor("#AA85FF");
                                    Context context3 = getContext();
                                    AbstractC16544l.m18093f(context3, "getContext(...)");
                                    themeableLottieAnimationView.m14575i(color2, AbstractC8040Z5.m8408d(context3, R.attr.colorSecondary));
                                    int color3 = Color.parseColor("#280087");
                                    Context context4 = getContext();
                                    AbstractC16544l.m18093f(context4, "getContext(...)");
                                    themeableLottieAnimationView.m14575i(color3, AbstractC8040Z5.m8408d(context4, R.attr.colorPrimaryVariant));
                                    int color4 = Color.parseColor("#8552FF");
                                    Context context5 = getContext();
                                    AbstractC16544l.m18093f(context5, "getContext(...)");
                                    themeableLottieAnimationView.m14575i(color4, AbstractC8040Z5.m8408d(context5, R.attr.colorSecondary));
                                    Context context6 = getContext();
                                    AbstractC16544l.m18093f(context6, "getContext(...)");
                                    int iM8408d = AbstractC8040Z5.m8408d(context6, R.attr.colorSecondary);
                                    Context context7 = getContext();
                                    AbstractC16544l.m18093f(context7, "getContext(...)");
                                    themeableLottieAnimationView.m14575i(Color.parseColor("#DBCCFF"), AbstractC18861b.m20164b(0.66f, iM8408d, AbstractC8040Z5.m8408d(context7, R.attr.colorSurface)));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.f40878H0.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.f40879I0.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static ViewPropertyAnimator m14567l(View view, long j10) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setDuration(j10).withEndAction(new RunnableC0789w(view, 1));
        AbstractC16544l.m18093f(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    /* JADX INFO: renamed from: m */
    public static ViewPropertyAnimator m14568m(View view, long j10) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j10);
        AbstractC16544l.m18093f(duration, "setDuration(...)");
        return duration;
    }

    /* JADX INFO: renamed from: q */
    public static void m14569q(ImageView imageView, Drawable drawable) {
        if (AbstractC16544l.m18089b(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            m14567l(imageView, 200L).withEndAction(new RunnableC5611a(imageView, 28));
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(0.0f);
        m14568m(imageView, 200L);
    }

    public final UiComponentConfig.RemoteImage getLeftPoseImage() {
        return this.leftPoseImage;
    }

    public final UiComponentConfig.RemoteImage getRightPoseImage() {
        return this.rightPoseImage;
    }

    /* JADX INFO: renamed from: n */
    public final void m14570n(C11483d c11483d, InterfaceC1426a interfaceC1426a) {
        m14568m(c11483d.f34740b, 80L).withEndAction(new RunnableC13439d(this, c11483d, interfaceC1426a, 0));
    }

    /* JADX INFO: renamed from: o */
    public final void m14571o(EnumC13440e enumC13440e, boolean z6, InterfaceC1426a interfaceC1426a) {
        int i10 = 0;
        int i11 = 1;
        if (this.f40888R0 == enumC13440e) {
        }
        this.f40888R0 = enumC13440e;
        removeView(this.f40887Q0);
        Context context = getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        boolean z10 = (AbstractC8040Z5.m8409e(context, R.attr.personaSelfieLookLeftDrawable) == null || AbstractC8040Z5.m8409e(context, R.attr.personaSelfieLookRightDrawable) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
        C11483d c11483d = this.f40877G0;
        if (z6) {
            c11483d.f34746h.setVisibility(0);
        } else {
            c11483d.f34746h.setVisibility(8);
        }
        switch (enumC13440e.ordinal()) {
            case 0:
                Pi2CircleMaskView pi2CircleMaskView = c11483d.f34741c;
                if (pi2CircleMaskView.getScaleX() != 5.0f || pi2CircleMaskView.getScaleY() != 5.0f) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = pi2CircleMaskView.animate();
                    viewPropertyAnimatorAnimate.setDuration(AbstractC2119a.m3196j((Math.abs(pi2CircleMaskView.getScaleX() - 5.0f) / 4.0f) * 500));
                    viewPropertyAnimatorAnimate.scaleX(5.0f);
                    viewPropertyAnimatorAnimate.scaleY(5.0f);
                    viewPropertyAnimatorAnimate.start();
                }
                c11483d.f34746h.m14565a(0.0f, interfaceC1426a);
                break;
            case 1:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(0.0f, interfaceC1426a);
                break;
            case 2:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(0.0f, null);
                m14570n(c11483d, interfaceC1426a);
                break;
            case 3:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(0.0f, null);
                if (z10) {
                    m14572p(c11483d, this.f40880J0, interfaceC1426a);
                } else if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                break;
            case 4:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(0.0f, interfaceC1426a);
                if (!z10) {
                    UiComponentConfig.RemoteImage remoteImage = this.leftPoseImage;
                    if (remoteImage == null) {
                        c11483d.f34745g.setVisibility(0);
                        m14569q(c11483d.f34743e, getDrawableLeft());
                    } else {
                        this.f40887Q0 = AbstractC21548b.m21828a(remoteImage, this, true);
                    }
                }
                break;
            case 5:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(50.0f, null);
                m14570n(c11483d, interfaceC1426a);
                break;
            case 6:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(50.0f, null);
                if (z10) {
                    m14572p(c11483d, this.f40881K0, interfaceC1426a);
                } else if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                break;
            case 7:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(50.0f, interfaceC1426a);
                if (!z10) {
                    UiComponentConfig.RemoteImage remoteImage2 = this.rightPoseImage;
                    if (remoteImage2 == null) {
                        c11483d.f34745g.setVisibility(0);
                        m14569q(c11483d.f34743e, getDrawableRight());
                    } else {
                        this.f40887Q0 = AbstractC21548b.m21828a(remoteImage2, this, true);
                    }
                }
                break;
            case 8:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(100.0f, null);
                m14570n(c11483d, interfaceC1426a);
                break;
            case 9:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                Pi2ProgressArcView pi2ProgressArcView = c11483d.f34746h;
                ValueAnimator valueAnimator = pi2ProgressArcView.f40874u0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = pi2ProgressArcView.f40873t0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                pi2ProgressArcView.m14566b(25.0f, null);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new C13436a(valueAnimatorOfFloat, pi2ProgressArcView, 1));
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.start();
                pi2ProgressArcView.f40873t0 = valueAnimatorOfFloat;
                break;
            case 10:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(100.0f, null);
                m14570n(c11483d, new C13441f(this, interfaceC1426a, i10));
                break;
            case 11:
                Pi2CircleMaskView.m14564a(c11483d.f34741c, null, 3);
                c11483d.f34746h.m14565a(100.0f, new C13441f(this, interfaceC1426a, i11));
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m14572p(C11483d c11483d, int i10, InterfaceC1426a interfaceC1426a) {
        this.f40885O0.add(new C13442g(c11483d, this, interfaceC1426a));
        c11483d.f34742d.setAnimation(i10);
    }

    public final void setLeftPoseImage(UiComponentConfig.RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final void setPreviewView(View previewView) {
        AbstractC16544l.m18094g(previewView, "previewView");
        this.f40884N0 = previewView;
    }

    public final void setRightPoseImage(UiComponentConfig.RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }
}
