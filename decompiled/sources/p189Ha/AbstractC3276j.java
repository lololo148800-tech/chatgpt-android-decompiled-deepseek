package p189Ha;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.javax.sip.C10808o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.openai.chatgpt.R;
import fk.C13688i;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p523V9.AbstractC8034Z;
import p523V9.AbstractC8070d4;
import p658b5.C11238i;
import p806ia.AbstractC14951a;
import p862l2.C16806e;
import p897n3.C17474a;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ha.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3276j {

    /* JADX INFO: renamed from: a */
    public final int f9970a;

    /* JADX INFO: renamed from: b */
    public final int f9971b;

    /* JADX INFO: renamed from: c */
    public final int f9972c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f9973d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f9974e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f9975f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f9976g;

    /* JADX INFO: renamed from: h */
    public final Context f9977h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3275i f9978i;

    /* JADX INFO: renamed from: j */
    public final SnackbarContentLayout f9979j;

    /* JADX INFO: renamed from: k */
    public int f9980k;

    /* JADX INFO: renamed from: l */
    public ViewOnAttachStateChangeListenerC3273g f9981l;

    /* JADX INFO: renamed from: m */
    public final RunnableC3270d f9982m;

    /* JADX INFO: renamed from: n */
    public int f9983n;

    /* JADX INFO: renamed from: o */
    public int f9984o;

    /* JADX INFO: renamed from: p */
    public int f9985p;

    /* JADX INFO: renamed from: q */
    public int f9986q;

    /* JADX INFO: renamed from: r */
    public int f9987r;

    /* JADX INFO: renamed from: s */
    public int f9988s;

    /* JADX INFO: renamed from: t */
    public boolean f9989t;

    /* JADX INFO: renamed from: u */
    public ArrayList f9990u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f9991v;

    /* JADX INFO: renamed from: w */
    public final C3272f f9992w = new C3272f(this);

    /* JADX INFO: renamed from: x */
    public static final C17474a f9967x = AbstractC14951a.f46572b;

    /* JADX INFO: renamed from: y */
    public static final LinearInterpolator f9968y = AbstractC14951a.f46571a;

    /* JADX INFO: renamed from: z */
    public static final C17474a f9969z = AbstractC14951a.f46574d;

    /* JADX INFO: renamed from: B */
    public static final int[] f9965B = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: C */
    public static final String f9966C = AbstractC3276j.class.getSimpleName();

    /* JADX INFO: renamed from: A */
    public static final Handler f9964A = new Handler(Looper.getMainLooper(), new C3269c());

    public AbstractC3276j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i10 = 0;
        this.f9982m = new RunnableC3270d(this, i10);
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f9976g = viewGroup;
        this.f9979j = snackbarContentLayout2;
        this.f9977h = context;
        AbstractC21828k.m22308c(context, AbstractC21828k.f69275a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9965B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC3275i abstractC3275i = (AbstractC3275i) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f9978i = abstractC3275i;
        abstractC3275i.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = abstractC3275i.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f36700p0.setTextColor(AbstractC8070d4.m8480g(actionTextColorAlpha, AbstractC8070d4.m8478e(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f36700p0.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(abstractC3275i.getMaxInlineActionWidth());
        abstractC3275i.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        abstractC3275i.setAccessibilityLiveRegion(1);
        abstractC3275i.setImportantForAccessibility(1);
        abstractC3275i.setFitsSystemWindows(true);
        AbstractC0730K.m1555l(abstractC3275i, new C10808o(this, 11));
        AbstractC0738T.m1584l(abstractC3275i, new C3271e(this, i10));
        this.f9991v = (AccessibilityManager) context.getSystemService("accessibility");
        this.f9972c = AbstractC8034Z.m8389d(context, R.attr.motionDurationLong2, 250);
        this.f9970a = AbstractC8034Z.m8389d(context, R.attr.motionDurationLong2, 150);
        this.f9971b = AbstractC8034Z.m8389d(context, R.attr.motionDurationMedium1, 75);
        this.f9973d = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedInterpolator, f9968y);
        this.f9975f = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedInterpolator, f9969z);
        this.f9974e = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedInterpolator, f9967x);
    }

    /* JADX INFO: renamed from: a */
    public final void m4150a(int i10) {
        C11238i c11238iM12530k0 = C11238i.m12530k0();
        C3272f c3272f = this.f9992w;
        synchronized (c11238iM12530k0.f34008Y) {
            try {
                if (c11238iM12530k0.m12571p0(c3272f)) {
                    c11238iM12530k0.m12552X((C3279m) c11238iM12530k0.f34010o0, i10);
                } else {
                    C3279m c3279m = (C3279m) c11238iM12530k0.f34011p0;
                    if (c3279m != null && c3279m.f9997a.get() == c3272f) {
                        c11238iM12530k0.m12552X((C3279m) c11238iM12530k0.f34011p0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m4151b() {
        ViewOnAttachStateChangeListenerC3273g viewOnAttachStateChangeListenerC3273g = this.f9981l;
        if (viewOnAttachStateChangeListenerC3273g == null) {
            return null;
        }
        return (View) viewOnAttachStateChangeListenerC3273g.f9951Z.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m4152c() {
        C11238i c11238iM12530k0 = C11238i.m12530k0();
        C3272f c3272f = this.f9992w;
        synchronized (c11238iM12530k0.f34008Y) {
            try {
                if (c11238iM12530k0.m12571p0(c3272f)) {
                    c11238iM12530k0.f34010o0 = null;
                    if (((C3279m) c11238iM12530k0.f34011p0) != null) {
                        c11238iM12530k0.m12541H0();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f9990u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C13688i c13688i = (C13688i) this.f9990u.get(size);
                c13688i.getClass();
                c13688i.f43186a.invoke();
            }
        }
        ViewParent parent = this.f9978i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f9978i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4153d() {
        C11238i c11238iM12530k0 = C11238i.m12530k0();
        C3272f c3272f = this.f9992w;
        synchronized (c11238iM12530k0.f34008Y) {
            try {
                if (c11238iM12530k0.m12571p0(c3272f)) {
                    c11238iM12530k0.m12535C0((C3279m) c11238iM12530k0.f34010o0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f9990u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C13688i) this.f9990u.get(size)).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4154e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z6 = true;
        AccessibilityManager accessibilityManager = this.f9991v;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z6 = false;
        }
        AbstractC3275i abstractC3275i = this.f9978i;
        if (z6) {
            abstractC3275i.post(new RunnableC3270d(this, 2));
            return;
        }
        if (abstractC3275i.getParent() != null) {
            abstractC3275i.setVisibility(0);
        }
        m4153d();
    }

    /* JADX INFO: renamed from: f */
    public final void m4155f() {
        AbstractC3275i abstractC3275i = this.f9978i;
        ViewGroup.LayoutParams layoutParams = abstractC3275i.getLayoutParams();
        boolean z6 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f9966C;
        if (!z6) {
            AbstractC15256t.m16482t(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (abstractC3275i.f9962x0 == null) {
            AbstractC15256t.m16482t(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (abstractC3275i.getParent() == null) {
            return;
        }
        int i10 = m4151b() != null ? this.f9986q : this.f9983n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = abstractC3275i.f9962x0;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f9984o;
        int i13 = rect.right + this.f9985p;
        int i14 = rect.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            abstractC3275i.requestLayout();
        }
        if ((z10 || this.f9988s != this.f9987r) && Build.VERSION.SDK_INT >= 29 && this.f9987r > 0) {
            ViewGroup.LayoutParams layoutParams2 = abstractC3275i.getLayoutParams();
            if ((layoutParams2 instanceof C16806e) && (((C16806e) layoutParams2).f53917a instanceof SwipeDismissBehavior)) {
                RunnableC3270d runnableC3270d = this.f9982m;
                abstractC3275i.removeCallbacks(runnableC3270d);
                abstractC3275i.post(runnableC3270d);
            }
        }
    }
}
