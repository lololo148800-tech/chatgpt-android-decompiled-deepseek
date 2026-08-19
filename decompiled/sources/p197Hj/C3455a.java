package p197Hj;

import android.animation.ValueAnimator;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import p239Ja.C4309l;
import p520V5.C7794w;
import p520V5.EnumC7772a;
import p523V9.AbstractC8072d6;
import p561X.C9000n;
import p698d6.C13030c;
import p921oa.C18034c;

/* JADX INFO: renamed from: Hj.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3455a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10508b;

    public /* synthetic */ C3455a(Object obj, int i10) {
        this.f10507a = i10;
        this.f10508b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10507a) {
            case 0:
                ScanningView.m14528a((ScanningView) this.f10508b, valueAnimator);
                break;
            case 1:
                C4309l c4309l = (C4309l) this.f10508b;
                c4309l.getClass();
                c4309l.f14045d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                C7794w c7794w = (C7794w) this.f10508b;
                EnumC7772a enumC7772a = c7794w.f24655V0;
                if (enumC7772a == null) {
                    enumC7772a = EnumC7772a.f24556Y;
                }
                if (enumC7772a != EnumC7772a.f24557Z) {
                    C13030c c13030c = c7794w.f24634A0;
                    if (c13030c != null) {
                        c13030c.mo14783s(c7794w.f24660Z.m15915a());
                    }
                } else {
                    c7794w.invalidateSelf();
                }
                break;
            case 3:
                C9000n c9000n = (C9000n) this.f10508b;
                c9000n.getClass();
                AbstractC8072d6.m8486c("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c9000n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C18034c c18034c = (C18034c) this.f10508b;
                c18034c.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c18034c.f57568j.setAlpha((int) (255.0f * fFloatValue));
                c18034c.f57582x = fFloatValue;
                break;
        }
    }
}
