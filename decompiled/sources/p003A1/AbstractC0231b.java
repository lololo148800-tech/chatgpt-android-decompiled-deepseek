package p003A1;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p650ui.node.Owner;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import p025An.AbstractC0575H;
import p025An.C0613g0;
import p050Bn.AbstractC1454h;
import p050Bn.C1451e;
import p349O0.AbstractC6025r;
import p349O0.C6021p;
import p349O0.C6032u0;
import p349O0.EnumC6020o0;
import p523V9.AbstractC8111i5;
import p537W0.C8410b;
import p544W9.AbstractC8536P2;

/* JADX INFO: renamed from: A1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231b extends ViewGroup {

    /* JADX INFO: renamed from: o0 */
    public WeakReference f865o0;

    /* JADX INFO: renamed from: p0 */
    public IBinder f866p0;

    /* JADX INFO: renamed from: q0 */
    public C0238c2 f867q0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC6025r f868r0;

    /* JADX INFO: renamed from: s0 */
    public C0155B1 f869s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f870t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f871u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f872v0;

    public /* synthetic */ AbstractC0231b(Context context) {
        this(context, null, 0);
    }

    private final void setParentContext(AbstractC6025r abstractC6025r) {
        if (this.f868r0 != abstractC6025r) {
            this.f868r0 = abstractC6025r;
            if (abstractC6025r != null) {
                this.f865o0 = null;
            }
            C0238c2 c0238c2 = this.f867q0;
            if (c0238c2 != null) {
                c0238c2.dispose();
                this.f867q0 = null;
                if (isAttachedToWindow()) {
                    m735f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f866p0 != iBinder) {
            this.f866p0 = iBinder;
            this.f865o0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m732c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m732c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo564b(int i10, C6021p c6021p);

    /* JADX INFO: renamed from: c */
    public final void m732c() {
        if (this.f871u0) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: d */
    public final void m733d() {
        if (this.f868r0 == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        m735f();
    }

    /* JADX INFO: renamed from: e */
    public final void m734e() {
        C0238c2 c0238c2 = this.f867q0;
        if (c0238c2 != null) {
            c0238c2.dispose();
        }
        this.f867q0 = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final void m735f() {
        if (this.f867q0 == null) {
            try {
                this.f871u0 = true;
                this.f867q0 = AbstractC0246e2.m815a(this, m738i(), new C8410b(new C0227a(this, 0), true, -656146368));
            } finally {
                this.f871u0 = false;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo736g(boolean z6, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f867q0 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f870t0;
    }

    /* JADX INFO: renamed from: h */
    public void mo737h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [O0.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [O0.r] */
    /* JADX WARN: Type inference failed for: r1v17, types: [O0.u0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [O0.r] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX INFO: renamed from: i */
    public final AbstractC6025r m738i() {
        AbstractC6025r abstractC6025r;
        int i10 = 2;
        ?? M694c = this.f868r0;
        if (M694c == 0) {
            M694c = AbstractC0223Y1.m694c(this);
            if (M694c == 0) {
                ViewParent parent = getParent();
                while (true) {
                    if (M694c != 0 || !(parent instanceof View)) {
                        M694c = M694c;
                        break;
                    }
                    M694c = M694c;
                    AbstractC6025r abstractC6025rM694c = AbstractC0223Y1.m694c((View) parent);
                    parent = parent.getParent();
                    M694c = abstractC6025rM694c;
                }
            }
            EnumC6020o0 enumC6020o0 = EnumC6020o0.f19543Z;
            if (M694c != 0) {
                ?? r6 = (!(M694c instanceof C6032u0) || ((EnumC6020o0) ((C6032u0) M694c).f19663s.getValue()).compareTo(enumC6020o0) > 0) ? M694c : 0;
                if (r6 != 0) {
                    this.f865o0 = new WeakReference(r6);
                }
            } else {
                M694c = 0;
            }
            if (M694c == 0) {
                WeakReference weakReference = this.f865o0;
                if (weakReference == null || (abstractC6025r = (AbstractC6025r) weakReference.get()) == null || ((abstractC6025r instanceof C6032u0) && ((EnumC6020o0) ((C6032u0) abstractC6025r).f19663s.getValue()).compareTo(enumC6020o0) <= 0)) {
                    M694c = abstractC6025r;
                    M694c = abstractC6025r;
                    M694c = 0;
                }
                if (M694c == 0) {
                    if (!isAttachedToWindow()) {
                        AbstractC8111i5.m8592c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC6025r abstractC6025rM694c2 = AbstractC0223Y1.m694c(view);
                    if (abstractC6025rM694c2 == null) {
                        C6032u0 c6032u0Mo570a = ((InterfaceC0191N1) AbstractC0197P1.f735a.get()).mo570a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c6032u0Mo570a);
                        C0613g0 c0613g0 = C0613g0.f1858Y;
                        Handler handler = view.getHandler();
                        int i11 = AbstractC1454h.f3824a;
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(AbstractC0575H.m1156D(c0613g0, new C1451e(handler, "windowRecomposer cleanup", false).f3819q0, null, new C0194O1(c6032u0Mo570a, view, null), 2), i10));
                        M694c = c6032u0Mo570a;
                    } else {
                        if (!(abstractC6025rM694c2 instanceof C6032u0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        M694c = (C6032u0) abstractC6025rM694c2;
                    }
                    ?? r10 = ((EnumC6020o0) M694c.f19663s.getValue()).compareTo(enumC6020o0) > 0 ? M694c : 0;
                    if (r10 != 0) {
                        this.f865o0 = new WeakReference(r10);
                    }
                }
            }
        }
        return M694c;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f872v0 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m735f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        mo736g(z6, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m735f();
        mo737h(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC6025r abstractC6025r) {
        setParentContext(abstractC6025r);
    }

    public final void setShowLayoutBounds(boolean z6) {
        this.f870t0 = z6;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z6);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z6) {
        super.setTransitionGroup(z6);
        this.f872v0 = true;
    }

    public final void setViewCompositionStrategy(InterfaceC0158C1 interfaceC0158C1) {
        C0155B1 c0155b1 = this.f869s0;
        if (c0155b1 != null) {
            c0155b1.invoke();
        }
        ((AbstractC0240d0) interfaceC0158C1).getClass();
        ViewOnAttachStateChangeListenerC0171H viewOnAttachStateChangeListenerC0171H = new ViewOnAttachStateChangeListenerC0171H(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0171H);
        C0152A1 c0152a1 = new C0152A1(this);
        AbstractC8536P2.m9199b(this).f14809a.add(c0152a1);
        this.f869s0 = new C0155B1(this, viewOnAttachStateChangeListenerC0171H, c0152a1, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC0231b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC0171H viewOnAttachStateChangeListenerC0171H = new ViewOnAttachStateChangeListenerC0171H(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0171H);
        C0152A1 c0152a1 = new C0152A1(this);
        AbstractC8536P2.m9199b(this).f14809a.add(c0152a1);
        this.f869s0 = new C0155B1(this, viewOnAttachStateChangeListenerC0171H, c0152a1, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        m732c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z6) {
        m732c();
        return super.addViewInLayout(view, i10, layoutParams, z6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        m732c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m732c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m732c();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
