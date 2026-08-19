package p523V9;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.openai.chatgpt.R;
import fk.C13688i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0589O;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1426a;
import p1155zi.C21947O;
import p124Ei.C2463L0;
import p189Ha.C3272f;
import p189Ha.C3277k;
import p189Ha.C3279m;
import p189Ha.ViewOnAttachStateChangeListenerC3273g;
import p193Hf.C3313J;
import p228J.AbstractC3794B0;
import p229J0.AbstractC4025b1;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p479Td.EnumC7359j0;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9233X;
import p635a1.InterfaceC10459q;
import p658b5.C11238i;
import p774h1.AbstractC14334L;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: V9.a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8048a6 {
    /* JADX INFO: renamed from: a */
    public static final void m8437a(EnumC7359j0 role, C21947O c21947o, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(role, "role");
        c6021p.m6526U(-292437719);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(role) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c21947o) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (role == EnumC7359j0.f23343Z) {
            C5997d.m6440a(AbstractC3794B0.m4494s(AbstractC14334L.m15626d(4288782756L), AbstractC4025b1.f12649a), AbstractC8411c.m8969c(1952233774, c6021p, new C3313J(interfaceC10459q, z6, c21947o, 4)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(role, c21947o, z6, interfaceC10459q, i10, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8438b(InterfaceC18770c interfaceC18770c, Throwable th2) {
        if (th2 instanceof C0589O) {
            th2 = ((C0589O) th2).f1820Y;
        }
        interfaceC18770c.resumeWith(AbstractC9233X.m9806b(th2));
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:76:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:0: B:6:0x0011->B:81:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m8439c(View snackbarContainer, String str, InterfaceC1426a onDismissed, View view, int i10, int i11) {
        ViewGroup viewGroup;
        Object parent;
        AbstractC16544l.m18094g(snackbarContainer, "snackbarContainer");
        AbstractC16544l.m18094g(onDismissed, "onDismissed");
        if (str == null) {
            return;
        }
        int[] iArr = C3277k.f9993E;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (snackbarContainer instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) snackbarContainer;
                break;
            }
            if (!(snackbarContainer instanceof FrameLayout)) {
                parent = snackbarContainer.getParent();
                if (parent instanceof View) {
                    snackbarContainer = (View) parent;
                } else {
                    snackbarContainer = null;
                }
                if (snackbarContainer == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (snackbarContainer.getId() == 16908290) {
                    viewGroup = (ViewGroup) snackbarContainer;
                    break;
                }
                viewGroup2 = (ViewGroup) snackbarContainer;
                parent = snackbarContainer.getParent();
                if (parent instanceof View) {
                    snackbarContainer = (View) parent;
                } else {
                    snackbarContainer = null;
                }
                if (snackbarContainer == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C3277k.f9993E);
        boolean z6 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        C3277k c3277k = new C3277k(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) c3277k.f9978i.getChildAt(0)).getMessageView().setText(str);
        c3277k.f9980k = i11;
        ((SnackbarContentLayout) c3277k.f9978i.getChildAt(0)).getMessageView().setMaxLines(i10);
        if (view != null) {
            ViewOnAttachStateChangeListenerC3273g viewOnAttachStateChangeListenerC3273g = c3277k.f9981l;
            if (viewOnAttachStateChangeListenerC3273g != null) {
                viewOnAttachStateChangeListenerC3273g.m4148a();
            }
            ViewOnAttachStateChangeListenerC3273g viewOnAttachStateChangeListenerC3273g2 = new ViewOnAttachStateChangeListenerC3273g(c3277k, view);
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewOnAttachStateChangeListenerC3273g2);
            }
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3273g2);
            c3277k.f9981l = viewOnAttachStateChangeListenerC3273g2;
        }
        C13688i c13688i = new C13688i(onDismissed);
        if (c3277k.f9990u == null) {
            c3277k.f9990u = new ArrayList();
        }
        c3277k.f9990u.add(c13688i);
        C11238i c11238iM12530k0 = C11238i.m12530k0();
        int recommendedTimeoutMillis = c3277k.f9980k;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = c3277k.f9994D.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
        }
        C3272f c3272f = c3277k.f9992w;
        synchronized (c11238iM12530k0.f34008Y) {
            try {
                if (c11238iM12530k0.m12571p0(c3272f)) {
                    C3279m c3279m = (C3279m) c11238iM12530k0.f34010o0;
                    c3279m.f9998b = recommendedTimeoutMillis;
                    ((Handler) c11238iM12530k0.f34009Z).removeCallbacksAndMessages(c3279m);
                    c11238iM12530k0.m12535C0((C3279m) c11238iM12530k0.f34010o0);
                    return;
                }
                C3279m c3279m2 = (C3279m) c11238iM12530k0.f34011p0;
                if (c3279m2 != null && c3279m2.f9997a.get() == c3272f) {
                    z6 = true;
                }
                if (z6) {
                    ((C3279m) c11238iM12530k0.f34011p0).f9998b = recommendedTimeoutMillis;
                } else {
                    c11238iM12530k0.f34011p0 = new C3279m(recommendedTimeoutMillis, c3272f);
                }
                C3279m c3279m3 = (C3279m) c11238iM12530k0.f34010o0;
                if (c3279m3 == null || !c11238iM12530k0.m12552X(c3279m3, 4)) {
                    c11238iM12530k0.f34010o0 = null;
                    c11238iM12530k0.m12541H0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
