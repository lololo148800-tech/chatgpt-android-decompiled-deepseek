package p030B2;

import android.animation.ValueAnimator;
import android.view.View;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.jvm.internal.AbstractC16544l;
import p784hb.C14437f;
import p893n.C17368E;

/* JADX INFO: renamed from: B2.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0746a0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2116c;

    public /* synthetic */ C0746a0(Object obj, int i10, Object obj2) {
        this.f2114a = i10;
        this.f2115b = obj;
        this.f2116c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Object obj = this.f2115b;
        switch (this.f2114a) {
            case 0:
                ((View) ((C17368E) ((C14437f) obj).f45413Y).f55415d.getParent()).invalidate();
                break;
            default:
                int i10 = Pi2ProgressArcView.f40867w0;
                Pi2ProgressArcView this$0 = (Pi2ProgressArcView) obj;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18094g(it, "it");
                Object animatedValue = ((ValueAnimator) this.f2116c).getAnimatedValue();
                AbstractC16544l.m18092e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.f40871r0 = ((Float) animatedValue).floatValue();
                this$0.invalidate();
                break;
        }
    }
}
