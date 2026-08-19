package p239Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0738T;
import p038Ba.C0853c;
import p049Bm.InterfaceC1426a;
import p1060v9.C20485c;
import p1103xa.AbstractC21167h;
import p330N4.AbstractC5673x;
import p353O4.C6119f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ja.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4308k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13998b;

    public /* synthetic */ C4308k(Object obj, int i10) {
        this.f13997a = i10;
        this.f13998b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f13997a) {
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13998b;
                actionBarOverlayLayout.f32216K0 = null;
                actionBarOverlayLayout.f32231x0 = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Object obj = this.f13998b;
        switch (this.f13997a) {
            case 0:
                C4309l c4309l = (C4309l) obj;
                c4309l.m5122q();
                c4309l.f14012r.start();
                break;
            case 1:
                ((ExpandableTransformationBehavior) obj).f36829b = null;
                break;
            case 2:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                ((View) obj).setClipBounds(null);
                break;
            case 3:
                ((AbstractC5673x) obj).m6102l();
                animation.removeListener(this);
                break;
            case 4:
                C6119f c6119f = (C6119f) obj;
                ArrayList arrayList = new ArrayList(c6119f.f19920q0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0853c) arrayList.get(i10)).m1912a(c6119f);
                }
                break;
            case 5:
                AbstractC16544l.m18094g(animation, "animation");
                SelfieOverlayView selfieOverlayView = (SelfieOverlayView) obj;
                List listM19322C0 = AbstractC17680n.m19322C0(selfieOverlayView.f40886P0);
                selfieOverlayView.f40886P0.clear();
                Iterator it = listM19322C0.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1426a) it.next()).invoke();
                }
                break;
            case 6:
                ((HideBottomViewOnScrollBehavior) obj).f36402h = null;
                break;
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f32216K0 = null;
                actionBarOverlayLayout.f32231x0 = false;
                break;
            case 8:
                AbstractC21167h abstractC21167h = (AbstractC21167h) obj;
                abstractC21167h.f67298r = 0;
                abstractC21167h.f67292l = null;
                break;
            default:
                C20485c c20485c = (C20485c) obj;
                if (((ValueAnimator) c20485c.f65030b) == animation) {
                    c20485c.f65030b = null;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13997a) {
            case 4:
                C6119f c6119f = (C6119f) this.f13998b;
                ArrayList arrayList = new ArrayList(c6119f.f19920q0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0853c) arrayList.get(i10)).m1913b(c6119f);
                }
                break;
            case 8:
                AbstractC21167h abstractC21167h = (AbstractC21167h) this.f13998b;
                abstractC21167h.f67299s.m22313a(0, false);
                abstractC21167h.f67298r = 2;
                abstractC21167h.f67292l = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
