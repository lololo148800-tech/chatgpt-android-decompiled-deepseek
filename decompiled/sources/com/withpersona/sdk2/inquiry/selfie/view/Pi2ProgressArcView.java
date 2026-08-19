package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p030B2.C0746a0;
import p049Bm.InterfaceC1426a;
import p647ak.AbstractC10719o;
import p730ek.C13436a;
import p730ek.C13437b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "", "newColor", "Lmm/C;", "setStrokeColor", "(I)V", "", "newWidth", "setStrokeWidth", "(F)V", "selfie_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Pi2ProgressArcView extends View {

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ int f40867w0 = 0;

    /* JADX INFO: renamed from: o0 */
    public final Paint f40868o0;

    /* JADX INFO: renamed from: p0 */
    public final float f40869p0;

    /* JADX INFO: renamed from: q0 */
    public final float f40870q0;

    /* JADX INFO: renamed from: r0 */
    public float f40871r0;

    /* JADX INFO: renamed from: s0 */
    public ValueAnimator f40872s0;

    /* JADX INFO: renamed from: t0 */
    public ValueAnimator f40873t0;

    /* JADX INFO: renamed from: u0 */
    public ValueAnimator f40874u0;

    /* JADX INFO: renamed from: v0 */
    public float f40875v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC16544l.m18094g(context, "context");
        Paint paint = new Paint(1);
        this.f40868o0 = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC10719o.f31847b, 0, 0);
        AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f40869p0 = typedArrayObtainStyledAttributes.getFloat(0, 0.4f);
            this.f40870q0 = typedArrayObtainStyledAttributes.getFloat(2, 270.0f);
            this.f40871r0 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(3, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14565a(float f10, InterfaceC1426a interfaceC1426a) {
        ValueAnimator valueAnimator = this.f40873t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f40875v0 != 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new C13436a(valueAnimatorOfFloat, this, 0));
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.start();
            this.f40874u0 = valueAnimatorOfFloat;
        }
        m14566b(f10, interfaceC1426a);
    }

    /* JADX INFO: renamed from: b */
    public final void m14566b(float f10, InterfaceC1426a interfaceC1426a) {
        int i10 = 1;
        if (this.f40871r0 == f10) {
            if (interfaceC1426a != null) {
                interfaceC1426a.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f40872s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f40871r0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f10);
        valueAnimatorOfFloat.setDuration((long) (1000 * (Math.abs(f10 - f11) / 100.0f)));
        valueAnimatorOfFloat.addUpdateListener(new C0746a0(this, i10, valueAnimatorOfFloat));
        valueAnimatorOfFloat.addListener(new C13437b(interfaceC1426a, this));
        valueAnimatorOfFloat.start();
        this.f40872s0 = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float fMin = this.f40869p0 * Math.min(getWidth(), getHeight());
        Paint paint = this.f40868o0;
        float strokeWidth = fMin - (paint.getStrokeWidth() / 2);
        float f10 = width;
        float f11 = height;
        canvas.drawArc(f10 - strokeWidth, f11 - strokeWidth, f10 + strokeWidth, f11 + strokeWidth, this.f40870q0 + this.f40875v0, (this.f40871r0 * 360) / 100.0f, false, paint);
    }

    public final void setStrokeColor(int newColor) {
        this.f40868o0.setColor(newColor);
    }

    public final void setStrokeWidth(float newWidth) {
        this.f40868o0.setStrokeWidth(newWidth);
    }
}
