package p791hj;

import android.view.View;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: hj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC14519b implements InterfaceC14521d, InterfaceC11112u, View.OnAttachStateChangeListener, InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f45754Y;

    /* JADX INFO: renamed from: Z */
    public View f45755Z;

    /* JADX INFO: renamed from: o0 */
    public final C11114w f45756o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f45757p0;

    /* JADX INFO: renamed from: q0 */
    public AbstractC11105n f45758q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f45759r0;

    public ViewOnAttachStateChangeListenerC14519b(InterfaceC1436k findParentLifecycle) {
        AbstractC16544l.m18094g(findParentLifecycle, "findParentLifecycle");
        this.f45754Y = findParentLifecycle;
        this.f45756o0 = new C11114w(this, true);
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        View view = this.f45755Z;
        m16008c(view == null ? false : view.isAttachedToWindow());
    }

    /* JADX INFO: renamed from: b */
    public final void m16007b() {
        if (this.f45759r0) {
            return;
        }
        this.f45759r0 = true;
        View view = this.f45755Z;
        m16008c(view == null ? false : view.isAttachedToWindow());
    }

    /* JADX INFO: renamed from: c */
    public final void m16008c(boolean z6) {
        AbstractC11105n abstractC11105n = this.f45758q0;
        EnumC11104m enumC11104mMo7807b = abstractC11105n == null ? null : abstractC11105n.mo7807b();
        C11114w c11114w = this.f45756o0;
        EnumC11104m enumC11104m = c11114w.f33504d;
        AbstractC16544l.m18093f(enumC11104m, "localLifecycle.currentState");
        EnumC11104m enumC11104m2 = EnumC11104m.f33474Y;
        if (enumC11104m == enumC11104m2 || this.f45757p0) {
            this.f45755Z = null;
            return;
        }
        boolean z10 = this.f45759r0;
        EnumC11104m enumC11104m3 = EnumC11104m.f33475Z;
        if (z10 && !z6) {
            enumC11104mMo7807b = enumC11104m2;
        } else if (enumC11104mMo7807b == null) {
            if (enumC11104m != enumC11104m3) {
                throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
            }
            enumC11104mMo7807b = enumC11104m3;
        }
        if (enumC11104mMo7807b == enumC11104m2) {
            this.f45757p0 = true;
            AbstractC11105n abstractC11105n2 = this.f45758q0;
            if (abstractC11105n2 != null) {
                abstractC11105n2.mo7808c(this);
            }
            this.f45758q0 = null;
            View view = this.f45755Z;
            if (view != null) {
                this.f45755Z = null;
                view.removeOnAttachStateChangeListener(this);
            }
            if (enumC11104m == enumC11104m3) {
                enumC11104m2 = enumC11104m3;
            }
        } else {
            enumC11104m2 = enumC11104mMo7807b;
        }
        c11114w.m12172h(enumC11104m2);
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f45756o0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        AbstractC16544l.m18094g(v2, "v");
        if (this.f45756o0.f33504d == EnumC11104m.f33474Y || this.f45757p0) {
            return;
        }
        this.f45755Z = v2;
        AbstractC11105n abstractC11105n = this.f45758q0;
        AbstractC11105n abstractC11105n2 = (AbstractC11105n) this.f45754Y.invoke(v2);
        this.f45758q0 = abstractC11105n2;
        if (abstractC11105n2 != abstractC11105n) {
            if (abstractC11105n != null) {
                abstractC11105n.mo7808c(this);
            }
            AbstractC11105n abstractC11105n3 = this.f45758q0;
            if (abstractC11105n3 != null) {
                abstractC11105n3.mo7806a(this);
            }
        }
        m16008c(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        AbstractC16544l.m18094g(v2, "v");
        m16008c(false);
    }
}
