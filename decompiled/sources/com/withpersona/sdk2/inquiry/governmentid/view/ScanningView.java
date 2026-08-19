package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1120y4.C21382i;
import p197Hj.C3455a;
import p523V9.AbstractC8040Z5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\rR*\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010&\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\r¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/ScanningView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "t0", TokenNames.f32011F, "setAnimationRotation", "(F)V", "animationRotation", "u0", "getCornerRadius", "()F", "setCornerRadius", "cornerRadius", "", "v0", "Z", "isScanningAnimationEnabled", "()Z", "setScanningAnimationEnabled", "(Z)V", "", "w0", TokenNames.f32012I, "getHighlightColor", "()I", "setHighlightColor", "(I)V", "highlightColor", "x0", "getBorderColor", "setBorderColor", "borderColor", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ScanningView extends View {

    /* JADX INFO: renamed from: o0 */
    public final Matrix f40643o0;

    /* JADX INFO: renamed from: p0 */
    public final ValueAnimator f40644p0;

    /* JADX INFO: renamed from: q0 */
    public SweepGradient f40645q0;

    /* JADX INFO: renamed from: r0 */
    public final Paint f40646r0;

    /* JADX INFO: renamed from: s0 */
    public Path f40647s0;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public float animationRotation;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public float cornerRadius;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean isScanningAnimationEnabled;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public int highlightColor;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public int borderColor;

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40643o0 = new Matrix();
        this.cornerRadius = (float) C21382i.m21761a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        AbstractC16544l.m18093f(context2, "getContext(...)");
        this.highlightColor = AbstractC8040Z5.m8408d(context2, R.attr.colorPrimary);
        this.borderColor = -1;
        this.f40645q0 = m14529b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) C21382i.m21761a(3.0d));
        paint.setShader(this.f40645q0);
        this.f40646r0 = paint;
        this.f40647s0 = m14530c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new C3455a(this, 0));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.f40644p0 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public static void m14528a(ScanningView this$0, ValueAnimator it) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(it, "it");
        this$0.setAnimationRotation(it.getAnimatedFraction() * 360.0f);
    }

    private final void setAnimationRotation(float f10) {
        if (this.animationRotation == f10) {
            return;
        }
        this.animationRotation = f10;
        m14532e();
    }

    /* JADX INFO: renamed from: b */
    public final SweepGradient m14529b() {
        int[] iArr;
        if (this.isScanningAnimationEnabled) {
            int i10 = this.borderColor;
            iArr = new int[]{i10, i10, this.highlightColor};
        } else {
            int i11 = this.borderColor;
            iArr = new int[]{i11, i11, i11};
        }
        return new SweepGradient(0.5f, 0.5f, iArr, new float[]{0.0f, 0.5f, 1.0f});
    }

    /* JADX INFO: renamed from: c */
    public final Path m14530c() {
        Path path = new Path();
        float strokeWidth = this.f40646r0.getStrokeWidth();
        float f10 = strokeWidth / 2.0f;
        if (getWidth() > strokeWidth && getHeight() > strokeWidth) {
            float width = getWidth() - f10;
            float height = getHeight() - f10;
            float f11 = this.cornerRadius;
            path.addRoundRect(f10, f10, width, height, new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, Path.Direction.CW);
        }
        return path;
    }

    /* JADX INFO: renamed from: d */
    public final void m14531d() {
        SweepGradient sweepGradientM14529b = m14529b();
        this.f40645q0 = sweepGradientM14529b;
        this.f40646r0.setShader(sweepGradientM14529b);
        m14532e();
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m14532e() {
        int iMax = Math.max(getWidth(), getHeight());
        Matrix matrix = this.f40643o0;
        matrix.setRotate(this.animationRotation, 0.5f, 0.5f);
        float f10 = iMax;
        matrix.postScale(f10, f10);
        this.f40645q0.setLocalMatrix(matrix);
        invalidate();
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final float getStrokeWidth() {
        return this.f40646r0.getStrokeWidth();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40644p0.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f40647s0, this.f40646r0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f40647s0 = m14530c();
        invalidate();
        m14532e();
    }

    public final void setBorderColor(int i10) {
        if (this.borderColor == i10) {
            return;
        }
        this.borderColor = i10;
        m14531d();
    }

    public final void setCornerRadius(float f10) {
        if (this.cornerRadius == f10) {
            return;
        }
        this.cornerRadius = f10;
        this.f40647s0 = m14530c();
        invalidate();
    }

    public final void setHighlightColor(int i10) {
        if (this.highlightColor == i10) {
            return;
        }
        this.highlightColor = i10;
        m14531d();
    }

    public final void setScanningAnimationEnabled(boolean z6) {
        if (this.isScanningAnimationEnabled == z6) {
            return;
        }
        this.isScanningAnimationEnabled = z6;
        m14531d();
    }

    public final void setStrokeWidth(float f10) {
        Paint paint = this.f40646r0;
        if (paint.getStrokeWidth() == f10) {
            return;
        }
        paint.setStrokeWidth(f10);
        invalidate();
    }
}
