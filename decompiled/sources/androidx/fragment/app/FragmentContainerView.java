package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p030B2.C0794y0;
import p564X2.AbstractC9038a;
import p588Y2.C9599C;
import p588Y2.C9617a;
import p588Y2.C9637u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m18067d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lmm/C;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/a;", TokenNames.f32011F, "getFragment", "()Landroidx/fragment/app/a;", "fragment_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f33107o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f33108p0;

    /* JADX INFO: renamed from: q0 */
    public View.OnApplyWindowInsetsListener f33109q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f33110r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC16544l.m18094g(context, "context");
        this.f33107o0 = new ArrayList();
        this.f33108p0 = new ArrayList();
        this.f33110r0 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9038a.f27596b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11733a(View view) {
        if (this.f33108p0.contains(view)) {
            this.f33107o0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        AbstractC16544l.m18094g(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC11000a ? (AbstractComponentCallbacksC11000a) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        C0794y0 c0794y0M1812g;
        AbstractC16544l.m18094g(insets, "insets");
        C0794y0 c0794y0M1812g2 = C0794y0.m1812g(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f33109q0;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            AbstractC16544l.m18093f(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0794y0M1812g = C0794y0.m1812g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            WindowInsets windowInsetsM1817f = c0794y0M1812g2.m1817f();
            if (windowInsetsM1817f != null) {
                WindowInsets windowInsetsM1542b = AbstractC0728I.m1542b(this, windowInsetsM1817f);
                if (!windowInsetsM1542b.equals(windowInsetsM1817f)) {
                    c0794y0M1812g2 = C0794y0.m1812g(this, windowInsetsM1542b);
                }
            }
            c0794y0M1812g = c0794y0M1812g2;
        }
        if (!c0794y0M1812g.f2209a.mo1771n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                WindowInsets windowInsetsM1817f2 = c0794y0M1812g.m1817f();
                if (windowInsetsM1817f2 != null) {
                    WindowInsets windowInsetsM1541a = AbstractC0728I.m1541a(childAt, windowInsetsM1817f2);
                    if (!windowInsetsM1541a.equals(windowInsetsM1817f2)) {
                        C0794y0.m1812g(childAt, windowInsetsM1541a);
                    }
                }
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC16544l.m18094g(canvas, "canvas");
        if (this.f33110r0) {
            Iterator it = this.f33107o0.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        AbstractC16544l.m18094g(canvas, "canvas");
        AbstractC16544l.m18094g(child, "child");
        if (this.f33110r0) {
            ArrayList arrayList = this.f33107o0;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC16544l.m18094g(view, "view");
        this.f33108p0.remove(view);
        if (this.f33107o0.remove(view)) {
            this.f33110r0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC11000a> F getFragment() {
        AbstractActivityC11001b abstractActivityC11001b;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a;
        AbstractC11002c abstractC11002cM11762n;
        View view = this;
        while (true) {
            abstractActivityC11001b = null;
            if (view == null) {
                abstractComponentCallbacksC11000a = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC11000a = tag instanceof AbstractComponentCallbacksC11000a ? (AbstractComponentCallbacksC11000a) tag : null;
            if (abstractComponentCallbacksC11000a != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC11000a == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof AbstractActivityC11001b) {
                    abstractActivityC11001b = (AbstractActivityC11001b) context;
                    break;
                }
            }
            if (abstractActivityC11001b == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            abstractC11002cM11762n = abstractActivityC11001b.m11762n();
        } else {
            if (!abstractComponentCallbacksC11000a.m11757t()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC11000a + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            abstractC11002cM11762n = abstractComponentCallbacksC11000a.m11751n();
        }
        return (F) abstractC11002cM11762n.m11767A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC16544l.m18094g(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC16544l.m18093f(view, "view");
                m11733a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC16544l.m18094g(view, "view");
        m11733a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        AbstractC16544l.m18093f(view, "view");
        m11733a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC16544l.m18094g(view, "view");
        m11733a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            AbstractC16544l.m18093f(view, "view");
            m11733a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            AbstractC16544l.m18093f(view, "view");
            m11733a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f33110r0 = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        AbstractC16544l.m18094g(listener, "listener");
        this.f33109q0 = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC16544l.m18094g(view, "view");
        if (view.getParent() == this) {
            this.f33108p0.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, AbstractC11002c fm) {
        View view;
        super(context, attrs);
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(attrs, "attrs");
        AbstractC16544l.m18094g(fm, "fm");
        this.f33107o0 = new ArrayList();
        this.f33108p0 = new ArrayList();
        this.f33110r0 = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC9038a.f27596b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11767A = fm.m11767A(id2);
        if (classAttribute != null && abstractComponentCallbacksC11000aM11767A == null) {
            if (id2 == -1) {
                throw new IllegalStateException(AbstractC10763a.m11054l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C9599C c9599cM11770D = fm.m11770D();
            context.getClassLoader();
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM10146a = c9599cM11770D.m10146a(classAttribute);
            AbstractC16544l.m18093f(abstractComponentCallbacksC11000aM10146a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC11000aM10146a.f33126H0 = id2;
            abstractComponentCallbacksC11000aM10146a.f33127I0 = id2;
            abstractComponentCallbacksC11000aM10146a.f33128J0 = string;
            abstractComponentCallbacksC11000aM10146a.f33122D0 = fm;
            C9637u c9637u = fm.f33204u;
            abstractComponentCallbacksC11000aM10146a.f33123E0 = c9637u;
            abstractComponentCallbacksC11000aM10146a.f33133O0 = true;
            if ((c9637u == null ? null : c9637u.f29050Y) != null) {
                abstractComponentCallbacksC11000aM10146a.f33133O0 = true;
            }
            C9617a c9617a = new C9617a(fm);
            c9617a.f28971o = true;
            abstractComponentCallbacksC11000aM10146a.f33134P0 = this;
            c9617a.m10162e(getId(), abstractComponentCallbacksC11000aM10146a, string, 1);
            if (!c9617a.f28963g) {
                AbstractC11002c abstractC11002c = c9617a.f28972p;
                if (abstractC11002c.f33204u != null && !abstractC11002c.f33177H) {
                    abstractC11002c.m11814x(true);
                    c9617a.mo10148a(abstractC11002c.f33179J, abstractC11002c.f33180K);
                    abstractC11002c.f33185b = true;
                    try {
                        abstractC11002c.m11780Q(abstractC11002c.f33179J, abstractC11002c.f33180K);
                        abstractC11002c.m11794d();
                        abstractC11002c.m11792b0();
                        abstractC11002c.m11811u();
                        abstractC11002c.f33186c.f33216b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th2) {
                        abstractC11002c.m11794d();
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (C11003d c11003d : fm.f33186c.m11837d()) {
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
            if (abstractComponentCallbacksC11000a.f33127I0 == getId() && (view = abstractComponentCallbacksC11000a.f33135Q0) != null && view.getParent() == null) {
                abstractComponentCallbacksC11000a.f33134P0 = this;
                c11003d.m11818b();
            }
        }
    }
}
