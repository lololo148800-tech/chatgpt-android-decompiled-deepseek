package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/SurfaceView;", "q0", "Landroid/view/SurfaceView;", "getSurfaceView", "()Landroid/view/SurfaceView;", "setSurfaceView", "(Landroid/view/SurfaceView;)V", "surfaceView", "Landroid/view/SurfaceHolder;", "getHolder", "()Landroid/view/SurfaceHolder;", "holder", "camera_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Camera2PreviewView extends ViewGroup {

    /* JADX INFO: renamed from: o0 */
    public int f40537o0;

    /* JADX INFO: renamed from: p0 */
    public int f40538p0;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public SurfaceView surfaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC16544l.m18094g(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    public final SurfaceHolder getHolder() {
        SurfaceHolder holder = this.surfaceView.getHolder();
        AbstractC16544l.m18093f(holder, "getHolder(...)");
        return holder;
    }

    public final SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        if (this.f40537o0 == 0 || this.f40538p0 == 0) {
            this.surfaceView.layout(i10, i11, i12, i13);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double dMax = Math.max(((double) measuredWidth) / ((double) this.f40537o0), ((double) measuredHeight) / ((double) this.f40538p0));
        int iCeil = (int) Math.ceil(((double) this.f40537o0) * dMax);
        int iCeil2 = (int) Math.ceil(dMax * ((double) this.f40538p0));
        int i14 = iCeil - measuredWidth;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = (i14 / 2) * (-1);
        int i16 = iCeil2 - measuredHeight;
        int i17 = ((i16 >= 0 ? i16 : 0) / 2) * (-1);
        this.surfaceView.layout(i15, i17, iCeil + i15, iCeil2 + i17);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize(Integer.MAX_VALUE, i10), View.resolveSize(Integer.MAX_VALUE, i11));
        this.surfaceView.measure(View.MeasureSpec.makeMeasureSpec(this.f40537o0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f40538p0, 1073741824));
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        AbstractC16544l.m18094g(surfaceView, "<set-?>");
        this.surfaceView = surfaceView;
    }
}
