package com.withpersona.sdk2.inquiry.steps.p688ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1120y4.C21382i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/SignatureView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SignatureView extends MaterialCardView {

    /* JADX INFO: renamed from: C0 */
    public Bitmap f40997C0;

    /* JADX INFO: renamed from: D0 */
    public Canvas f40998D0;

    /* JADX INFO: renamed from: E0 */
    public RectF f40999E0;

    /* JADX INFO: renamed from: F0 */
    public final Path f41000F0;

    /* JADX INFO: renamed from: G0 */
    public final Paint f41001G0;

    /* JADX INFO: renamed from: H0 */
    public final Paint f41002H0;

    /* JADX INFO: renamed from: I0 */
    public float f41003I0;

    /* JADX INFO: renamed from: J0 */
    public float f41004J0;

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40999E0 = new RectF();
        this.f41000F0 = new Path();
        this.f41001G0 = new Paint(4);
        Paint paint = new Paint();
        this.f41002H0 = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(5.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m14584c() {
        Canvas canvas = this.f40998D0;
        if (canvas == null) {
            return;
        }
        this.f41000F0.reset();
        this.f40999E0 = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m14585d() {
        RectF rectF = new RectF();
        Path path = this.f41000F0;
        path.computeBounds(rectF, true);
        if (!path.isEmpty()) {
            Paint paint = this.f41002H0;
            float f10 = 2;
            rectF.inset((-paint.getStrokeWidth()) / f10, (-paint.getStrokeWidth()) / f10);
        }
        rectF.sort();
        this.f40999E0.union(rectF);
        this.f40999E0.sort();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        Bitmap bitmap = this.f40997C0;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f41001G0);
        }
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float fM21761a = (float) C21382i.m21761a(24.0d);
        float fM21761a2 = (float) C21382i.m21761a(20.0d);
        canvas.drawLine(fM21761a2, canvas.getHeight() - fM21761a, canvas.getWidth() - fM21761a2, canvas.getHeight() - fM21761a, paint);
        canvas.restore();
        canvas.drawPath(this.f41000F0, this.f41002H0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f40997C0 = bitmapCreateBitmap;
        AbstractC16544l.m18093f(bitmapCreateBitmap, "also(...)");
        this.f40998D0 = new Canvas(bitmapCreateBitmap);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e10) {
        AbstractC16544l.m18094g(e10, "e");
        super.onTouchEvent(e10);
        float x4 = e10.getX();
        float y8 = e10.getY();
        int action = e10.getAction();
        Path path = this.f41000F0;
        if (action == 0) {
            path.reset();
            path.moveTo(x4, y8);
            this.f41003I0 = x4;
            this.f41004J0 = y8;
            invalidate();
        } else if (action == 1) {
            Canvas canvas = this.f40998D0;
            if (canvas != null) {
                boolean zIsEmpty = path.isEmpty();
                Paint paint = this.f41002H0;
                if (zIsEmpty) {
                    path.moveTo(this.f41003I0 - 0.5f, this.f41004J0 - 0.5f);
                    path.lineTo(this.f41003I0, this.f41004J0);
                    canvas.drawPoint(this.f41003I0, this.f41004J0, paint);
                } else {
                    path.lineTo(this.f41003I0, this.f41004J0);
                    canvas.drawPath(path, paint);
                }
                m14585d();
                path.reset();
            }
            invalidate();
        } else if (action == 2) {
            path.lineTo(x4, y8);
            this.f41003I0 = x4;
            this.f41004J0 = y8;
            invalidate();
        }
        return true;
    }
}
