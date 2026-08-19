package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p523V9.AbstractC8034Z;
import p783ha.AbstractC14431a;
import p806ia.AbstractC14951a;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A0 */
    public int f36803A0;

    /* JADX INFO: renamed from: o0 */
    public final ValueAnimator f36804o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f36805p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f36806q0;

    /* JADX INFO: renamed from: r0 */
    public final int f36807r0;

    /* JADX INFO: renamed from: s0 */
    public final float f36808s0;

    /* JADX INFO: renamed from: t0 */
    public final Paint f36809t0;

    /* JADX INFO: renamed from: u0 */
    public final RectF f36810u0;

    /* JADX INFO: renamed from: v0 */
    public final int f36811v0;

    /* JADX INFO: renamed from: w0 */
    public float f36812w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f36813x0;

    /* JADX INFO: renamed from: y0 */
    public double f36814y0;

    /* JADX INFO: renamed from: z0 */
    public int f36815z0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f36804o0 = new ValueAnimator();
        this.f36806q0 = new ArrayList();
        Paint paint = new Paint();
        this.f36809t0 = paint;
        this.f36810u0 = new RectF();
        this.f36803A0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45374g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC8034Z.m8389d(context, R.attr.motionDurationLong2, RCHTTPStatusCodes.SUCCESS);
        AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46572b);
        this.f36815z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f36807r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f36811v0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f36808s0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m13688b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m13687a(int i10) {
        return i10 == 2 ? Math.round(this.f36815z0 * 0.66f) : this.f36815z0;
    }

    /* JADX INFO: renamed from: b */
    public final void m13688b(float f10) {
        ValueAnimator valueAnimator = this.f36804o0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f36812w0 = f11;
        this.f36814y0 = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM13687a = m13687a(this.f36803A0);
        float fCos = (((float) Math.cos(this.f36814y0)) * fM13687a) + width;
        float fSin = (fM13687a * ((float) Math.sin(this.f36814y0))) + height;
        float f12 = this.f36807r0;
        this.f36810u0.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f36806q0.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC12066d) it.next());
            if (Math.abs(clockFaceView.f36801W0 - f11) > 0.001f) {
                clockFaceView.f36801W0 = f11;
                clockFaceView.m13686m();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM13687a = m13687a(this.f36803A0);
        float f10 = width;
        float f11 = iM13687a;
        float fCos = (((float) Math.cos(this.f36814y0)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f36814y0))) + f12;
        Paint paint = this.f36809t0;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f36807r0;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.f36814y0);
        double d10 = iM13687a - i10;
        paint.setStrokeWidth(this.f36811v0);
        canvas.drawLine(f10, f12, width + ((int) (Math.cos(this.f36814y0) * d10)), height + ((int) (d10 * dSin)), paint);
        canvas.drawCircle(f10, f12, this.f36808s0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        if (this.f36804o0.isRunning()) {
            return;
        }
        m13688b(this.f36812w0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f36813x0 = false;
            z6 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f36813x0;
            if (this.f36805p0) {
                this.f36803A0 = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y8 - ((float) (getHeight() / 2))))) <= ((float) m13687a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z6 = false;
        } else {
            z10 = false;
            z6 = false;
        }
        boolean z12 = this.f36813x0;
        int degrees = (int) Math.toDegrees(Math.atan2(y8 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z13 = this.f36812w0 != f10;
        if (z6 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            m13688b(f10);
            z11 = true;
        }
        this.f36813x0 = z12 | z11;
        return true;
    }
}
