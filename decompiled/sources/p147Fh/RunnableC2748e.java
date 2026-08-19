package p147Fh;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.SurfaceViewRenderer;
import p249Jl.SurfaceHolderCallbackC4482b;
import p414R.C6778l;

/* JADX INFO: renamed from: Fh.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2748e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8426Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f8427Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f8428o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f8429p0;

    public /* synthetic */ RunnableC2748e(Object obj, int i10, int i11, int i12) {
        this.f8426Y = i12;
        this.f8429p0 = obj;
        this.f8427Z = i10;
        this.f8428o0 = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        switch (this.f8426Y) {
            case 0:
                C2751h c2751h = (C2751h) this.f8429p0;
                ViewGroup.LayoutParams layoutParams = c2751h.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                float f10 = c2751h.getContext().getResources().getDisplayMetrics().density;
                layoutParams.width = (int) (this.f8427Z * f10);
                layoutParams.height = (int) (this.f8428o0 * f10);
                c2751h.setLayoutParams(layoutParams);
                return;
            case 1:
                SurfaceHolderCallbackC4482b this$0 = (SurfaceHolderCallbackC4482b) this.f8429p0;
                AbstractC16544l.m18094g(this$0, "this$0");
                this$0.f14628r0 = this.f8427Z;
                this$0.f14629s0 = this.f8428o0;
                this$0.m5210b();
                this$0.requestLayout();
                return;
            case 2:
                C6778l c6778l = (C6778l) this.f8429p0;
                int i10 = c6778l.f21770i;
                int i11 = this.f8427Z;
                boolean z10 = true;
                if (i10 != i11) {
                    c6778l.f21770i = i11;
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i12 = c6778l.f21769h;
                int i13 = this.f8428o0;
                if (i12 != i13) {
                    c6778l.f21769h = i13;
                } else {
                    z10 = z6;
                }
                if (z10) {
                    c6778l.m7227e();
                    return;
                }
                return;
            case 3:
                ((SurfaceTextureHelper) this.f8429p0).lambda$setTextureSize$2(this.f8427Z, this.f8428o0);
                return;
            default:
                ((SurfaceViewRenderer) this.f8429p0).lambda$onFrameResolutionChanged$0(this.f8427Z, this.f8428o0);
                return;
        }
    }
}
