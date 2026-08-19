package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p102Dm.AbstractC2119a;
import p647ak.AbstractC10719o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;", "Landroid/view/View;", "selfie_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Pi2CircleMaskView extends View {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ int f40861t0 = 0;

    /* JADX INFO: renamed from: o0 */
    public final float f40862o0;

    /* JADX INFO: renamed from: p0 */
    public final int f40863p0;

    /* JADX INFO: renamed from: q0 */
    public Bitmap f40864q0;

    /* JADX INFO: renamed from: r0 */
    public final Paint f40865r0;

    /* JADX INFO: renamed from: s0 */
    public final Paint f40866s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC16544l.m18094g(context, "context");
        this.f40865r0 = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f40866s0 = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC10719o.f31846a, 0, 0);
        AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f40862o0 = typedArrayObtainStyledAttributes.getFloat(0, 0.4f);
            this.f40863p0 = typedArrayObtainStyledAttributes.getColor(1, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14564a(Pi2CircleMaskView pi2CircleMaskView, InterfaceC1426a interfaceC1426a, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC1426a = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = pi2CircleMaskView.animate();
        viewPropertyAnimatorAnimate.setDuration(AbstractC2119a.m3196j((Math.abs(pi2CircleMaskView.getScaleX() - 1.0f) / 4.0f) * 500));
        viewPropertyAnimatorAnimate.scaleX(1.0f);
        viewPropertyAnimatorAnimate.scaleY(1.0f);
        viewPropertyAnimatorAnimate.withEndAction(new RunnableC0156C(8, interfaceC1426a));
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        Bitmap bitmapCreateBitmap = this.f40864q0;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.drawColor(this.f40863p0);
            canvas2.drawCircle(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f, this.f40862o0 * Math.min(canvas2.getWidth(), canvas2.getHeight()), this.f40866s0);
            this.f40864q0 = bitmapCreateBitmap;
            AbstractC16544l.m18093f(bitmapCreateBitmap, "apply(...)");
        } else {
            if (bitmapCreateBitmap.getWidth() != getWidth() || bitmapCreateBitmap.getHeight() != getHeight()) {
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                canvas3.drawColor(this.f40863p0);
                canvas3.drawCircle(canvas3.getWidth() / 2.0f, canvas3.getHeight() / 2.0f, this.f40862o0 * Math.min(canvas3.getWidth(), canvas3.getHeight()), this.f40866s0);
                this.f40864q0 = bitmapCreateBitmap;
                AbstractC16544l.m18093f(bitmapCreateBitmap, "apply(...)");
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f40865r0);
    }
}
