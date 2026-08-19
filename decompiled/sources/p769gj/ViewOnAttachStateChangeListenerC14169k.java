package p769gj;

import android.view.View;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC7841A0;
import p588Y2.C9597A;

/* JADX INFO: renamed from: gj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC14169k implements View.OnAttachStateChangeListener, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final View f44551Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1426a f44552Z;

    /* JADX INFO: renamed from: o0 */
    public final C9597A f44553o0;

    public ViewOnAttachStateChangeListenerC14169k(InterfaceC1426a handler, View view) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(handler, "handler");
        this.f44551Y = view;
        this.f44552Z = handler;
        this.f44553o0 = new C9597A(this, 1);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u owner) {
        AbstractC11105n abstractC11105nMo7809i;
        AbstractC16544l.m18094g(owner, "owner");
        this.f44553o0.m15540b();
        View view = this.f44551Y;
        view.removeOnAttachStateChangeListener(this);
        InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view);
        if (interfaceC11112uM8090b == null || (abstractC11105nMo7809i = interfaceC11112uM8090b.mo7809i()) == null) {
            return;
        }
        abstractC11105nMo7809i.mo7808c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View attachedView) {
        AbstractC16544l.m18094g(attachedView, "attachedView");
        if (this.f44551Y != attachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f44553o0.m15541c(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC16544l.m18094g(view, ahZQMZ.ftwbDBRJsVdUj);
        if (this.f44551Y != view) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f44553o0.m15541c(false);
    }
}
