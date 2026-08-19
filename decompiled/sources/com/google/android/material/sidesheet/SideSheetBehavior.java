package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A.C0041V;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p056C2.C1511e;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p166Ga.C3027a;
import p166Ga.C3028b;
import p166Ga.C3029c;
import p228J.AbstractC3794B0;
import p304M2.C5280c;
import p477Tb.C7296c;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p862l2.AbstractC16803b;
import p862l2.C16806e;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC16803b {

    /* JADX INFO: renamed from: a */
    public final C7296c f36677a;

    /* JADX INFO: renamed from: b */
    public final C2687g f36678b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f36679c;

    /* JADX INFO: renamed from: d */
    public final C2691k f36680d;

    /* JADX INFO: renamed from: e */
    public final C3029c f36681e;

    /* JADX INFO: renamed from: f */
    public final float f36682f;

    /* JADX INFO: renamed from: g */
    public final boolean f36683g;

    /* JADX INFO: renamed from: h */
    public int f36684h;

    /* JADX INFO: renamed from: i */
    public C5280c f36685i;

    /* JADX INFO: renamed from: j */
    public boolean f36686j;

    /* JADX INFO: renamed from: k */
    public final float f36687k;

    /* JADX INFO: renamed from: l */
    public int f36688l;

    /* JADX INFO: renamed from: m */
    public int f36689m;

    /* JADX INFO: renamed from: n */
    public int f36690n;

    /* JADX INFO: renamed from: o */
    public WeakReference f36691o;

    /* JADX INFO: renamed from: p */
    public WeakReference f36692p;

    /* JADX INFO: renamed from: q */
    public final int f36693q;

    /* JADX INFO: renamed from: r */
    public VelocityTracker f36694r;

    /* JADX INFO: renamed from: s */
    public int f36695s;

    /* JADX INFO: renamed from: t */
    public final LinkedHashSet f36696t;

    /* JADX INFO: renamed from: u */
    public final C3027a f36697u;

    public SideSheetBehavior() {
        this.f36681e = new C3029c(this);
        this.f36683g = true;
        this.f36684h = 5;
        this.f36687k = 0.1f;
        this.f36693q = -1;
        this.f36696t = new LinkedHashSet();
        this.f36697u = new C3027a(this, 0);
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: c */
    public final void mo13594c(C16806e c16806e) {
        this.f36691o = null;
        this.f36685i = null;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: e */
    public final void mo13595e() {
        this.f36691o = null;
        this.f36685i = null;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: f */
    public final boolean mo13566f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C5280c c5280c;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0738T.m1576d(view) == null) || !this.f36683g) {
            this.f36686j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f36694r) != null) {
            velocityTracker.recycle();
            this.f36694r = null;
        }
        if (this.f36694r == null) {
            this.f36694r = VelocityTracker.obtain();
        }
        this.f36694r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f36695s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f36686j) {
            this.f36686j = false;
            return false;
        }
        return (this.f36686j || (c5280c = this.f36685i) == null || !c5280c.m5821p(motionEvent)) ? false : true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        int i12;
        View viewFindViewById;
        C2687g c2687g = this.f36678b;
        C7296c c7296c = this.f36677a;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f36691o == null) {
            this.f36691o = new WeakReference(view);
            if (c2687g != null) {
                view.setBackground(c2687g);
                float fM1548e = this.f36682f;
                if (fM1548e == -1.0f) {
                    fM1548e = AbstractC0730K.m1548e(view);
                }
                c2687g.m3681k(fM1548e);
            } else {
                ColorStateList colorStateList = this.f36679c;
                if (colorStateList != null) {
                    AbstractC0730K.m1552i(view, colorStateList);
                }
            }
            int i13 = this.f36684h == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            m13651u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0738T.m1576d(view) == null) {
                AbstractC0738T.m1585m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f36685i == null) {
            this.f36685i = new C5280c(coordinatorLayout.getContext(), coordinatorLayout, this.f36697u);
        }
        c7296c.getClass();
        int left2 = view.getLeft() - ((SideSheetBehavior) c7296c.f23104Z).f36690n;
        coordinatorLayout.m11378q(view, i10);
        this.f36689m = coordinatorLayout.getWidth();
        this.f36688l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            c7296c.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f36690n = i11;
        int i14 = this.f36684h;
        if (i14 == 1 || i14 == 2) {
            c7296c.getClass();
            left = left2 - (view.getLeft() - ((SideSheetBehavior) c7296c.f23104Z).f36690n);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f36684h);
            }
            left = ((SideSheetBehavior) c7296c.f23104Z).f36689m;
        }
        view.offsetLeftAndRight(left);
        if (this.f36692p == null && (i12 = this.f36693q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f36692p = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f36696t.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: h */
    public final boolean mo13568h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: m */
    public final void mo13571m(View view, Parcelable parcelable) {
        int i10 = ((C3028b) parcelable).f9115o0;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f36684h = i10;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: n */
    public final Parcelable mo13572n(View view) {
        return new C3028b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: q */
    public final boolean mo13575q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36684h == 1 && actionMasked == 0) {
            return true;
        }
        if (m13649s()) {
            this.f36685i.m5815j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f36694r) != null) {
            velocityTracker.recycle();
            this.f36694r = null;
        }
        if (this.f36694r == null) {
            this.f36694r = VelocityTracker.obtain();
        }
        this.f36694r.addMovement(motionEvent);
        if (m13649s() && actionMasked == 2 && !this.f36686j && m13649s()) {
            float fAbs = Math.abs(this.f36695s - motionEvent.getX());
            C5280c c5280c = this.f36685i;
            if (fAbs > c5280c.f17374b) {
                c5280c.m5807b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f36686j;
    }

    /* JADX INFO: renamed from: r */
    public final void m13648r(int i10) {
        View view;
        if (this.f36684h == i10) {
            return;
        }
        this.f36684h = i10;
        WeakReference weakReference = this.f36691o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f36684h == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f36696t.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        m13651u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13649s() {
        return this.f36685i != null && (this.f36683g || this.f36684h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r0.m5820o(r1, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        m13648r(2);
        r2.f36681e.m3905f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13650t(View view, int i10, boolean z6) {
        int iM7765y;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f36677a.f23104Z;
        if (i10 == 3) {
            iM7765y = sideSheetBehavior.f36677a.m7765y();
        } else {
            if (i10 != 5) {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid state to get outer edge offset: "));
            }
            iM7765y = ((SideSheetBehavior) sideSheetBehavior.f36677a.f23104Z).f36689m;
        }
        C5280c c5280c = sideSheetBehavior.f36685i;
        if (c5280c != null) {
            if (!z6) {
                int top = view.getTop();
                c5280c.f17390r = view;
                c5280c.f17375c = -1;
                boolean zM5813h = c5280c.m5813h(iM7765y, top, 0, 0);
                if (!zM5813h && c5280c.f17373a == 0 && c5280c.f17390r != null) {
                    c5280c.f17390r = null;
                }
            }
        }
        m13648r(i10);
    }

    /* JADX INFO: renamed from: u */
    public final void m13651u() {
        View view;
        WeakReference weakReference = this.f36691o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0738T.m1581i(view, 262144);
        AbstractC0738T.m1579g(view, 0);
        AbstractC0738T.m1581i(view, 1048576);
        AbstractC0738T.m1579g(view, 0);
        int i10 = 5;
        if (this.f36684h != 5) {
            AbstractC0738T.m1582j(view, C1511e.f4032l, new C0041V(this, i10, 3));
        }
        int i11 = 3;
        if (this.f36684h != 3) {
            AbstractC0738T.m1582j(view, C1511e.f4030j, new C0041V(this, i11, 3));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f36681e = new C3029c(this);
        this.f36683g = true;
        this.f36684h = 5;
        this.f36687k = 0.1f;
        this.f36693q = -1;
        this.f36696t = new LinkedHashSet();
        this.f36697u = new C3027a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45362C);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f36679c = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f36680d = C2691k.m3691b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m3689a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f36693q = resourceId;
            WeakReference weakReference = this.f36692p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f36692p = null;
            WeakReference weakReference2 = this.f36691o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C2691k c2691k = this.f36680d;
        if (c2691k != null) {
            C2687g c2687g = new C2687g(c2691k);
            this.f36678b = c2687g;
            c2687g.m3679i(context);
            ColorStateList colorStateList = this.f36679c;
            if (colorStateList != null) {
                this.f36678b.m3682l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f36678b.setTint(typedValue.data);
            }
        }
        this.f36682f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f36683g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f36677a == null) {
            this.f36677a = new C7296c(this, 11);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
