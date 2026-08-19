package p084D4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: D4.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1889M extends C1886J {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f5520q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f5521r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1889M(Object obj, Context context, int i10) {
        super(context);
        this.f5520q = i10;
        this.f5521r = obj;
    }

    @Override // p084D4.C1886J
    /* JADX INFO: renamed from: b */
    public int mo2869b(View view, int i10) {
        switch (this.f5520q) {
            case 1:
                ((CarouselLayoutManager) this.f5521r).getClass();
                throw null;
            default:
                return super.mo2869b(view, i10);
        }
    }

    @Override // p084D4.C1886J
    /* JADX INFO: renamed from: c */
    public float mo2870c(DisplayMetrics displayMetrics) {
        switch (this.f5520q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo2870c(displayMetrics);
        }
    }

    @Override // p084D4.C1886J
    /* JADX INFO: renamed from: d */
    public int mo2871d(int i10) {
        switch (this.f5520q) {
            case 0:
                return Math.min(100, super.mo2871d(i10));
            default:
                return super.mo2871d(i10);
        }
    }

    @Override // p084D4.C1886J
    /* JADX INFO: renamed from: e */
    public PointF mo2872e(int i10) {
        switch (this.f5520q) {
            case 1:
                ((CarouselLayoutManager) this.f5521r).getClass();
                return null;
            default:
                return super.mo2872e(i10);
        }
    }

    @Override // p084D4.C1886J
    /* JADX INFO: renamed from: g */
    public void mo2874g(View view, C1921j0 c1921j0) {
        switch (this.f5520q) {
            case 0:
                C1890N c1890n = (C1890N) this.f5521r;
                int[] iArrM2894a = c1890n.m2894a(c1890n.f5522a.getLayoutManager(), view);
                int i10 = iArrM2894a[0];
                int i11 = iArrM2894a[1];
                int iCeil = (int) Math.ceil(((double) mo2871d(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f5509j;
                    c1921j0.f5621a = i10;
                    c1921j0.f5622b = i11;
                    c1921j0.f5623c = iCeil;
                    c1921j0.f5625e = decelerateInterpolator;
                    c1921j0.f5626f = true;
                }
                break;
            default:
                super.mo2874g(view, c1921j0);
                break;
        }
    }
}
