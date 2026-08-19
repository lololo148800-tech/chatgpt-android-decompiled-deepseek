package p588Y2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.AbstractC11085V;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import p001A.C0093v0;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p329N3.RunnableC5611a;
import p939p3.C18294d;

/* JADX INFO: renamed from: Y2.O */
/* JADX INFO: loaded from: classes.dex */
public final class C9611O implements HasDefaultViewModelProviderFactory, InterfaceC3232g, ViewModelStoreOwner {

    /* JADX INFO: renamed from: Y */
    public final AbstractComponentCallbacksC11000a f28937Y;

    /* JADX INFO: renamed from: Z */
    public final ViewModelStore f28938Z;

    /* JADX INFO: renamed from: o0 */
    public final RunnableC5611a f28939o0;

    /* JADX INFO: renamed from: p0 */
    public ViewModelProvider.Factory f28940p0;

    /* JADX INFO: renamed from: q0 */
    public C11114w f28941q0 = null;

    /* JADX INFO: renamed from: r0 */
    public C0093v0 f28942r0 = null;

    public C9611O(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, ViewModelStore viewModelStore, RunnableC5611a runnableC5611a) {
        this.f28937Y = abstractComponentCallbacksC11000a;
        this.f28938Z = viewModelStore;
        this.f28939o0 = runnableC5611a;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.Factory mo10149b() {
        Application application;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f28937Y;
        ViewModelProvider.Factory factoryMo10149b = abstractComponentCallbacksC11000a.mo10149b();
        if (!factoryMo10149b.equals(abstractComponentCallbacksC11000a.f33148b1)) {
            this.f28940p0 = factoryMo10149b;
            return factoryMo10149b;
        }
        if (this.f28940p0 == null) {
            Context applicationContext = abstractComponentCallbacksC11000a.m11743M().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f28940p0 = new SavedStateViewModelFactory(application, abstractComponentCallbacksC11000a, abstractComponentCallbacksC11000a.f33156r0);
        }
        return this.f28940p0;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: c */
    public final C18294d mo10150c() {
        Application application;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f28937Y;
        Context applicationContext = abstractComponentCallbacksC11000a.m11743M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C18294d c18294d = new C18294d(0);
        if (application != null) {
            c18294d.m19836b(ViewModelProvider.AndroidViewModelFactory.f33440g, application);
        }
        c18294d.m19836b(AbstractC11085V.f33426a, abstractComponentCallbacksC11000a);
        c18294d.m19836b(AbstractC11085V.f33427b, this);
        Bundle bundle = abstractComponentCallbacksC11000a.f33156r0;
        if (bundle != null) {
            c18294d.m19836b(AbstractC11085V.f33428c, bundle);
        }
        return c18294d;
    }

    /* JADX INFO: renamed from: d */
    public final void m10151d(EnumC11103l enumC11103l) {
        this.f28941q0.m12170f(enumC11103l);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* JADX INFO: renamed from: e */
    public final ViewModelStore mo10152e() {
        m10153f();
        return this.f28938Z;
    }

    /* JADX INFO: renamed from: f */
    public final void m10153f() {
        if (this.f28941q0 == null) {
            this.f28941q0 = new C11114w(this, true);
            C0093v0 c0093v0 = new C0093v0(this);
            this.f28942r0 = c0093v0;
            c0093v0.m348r();
            this.f28939o0.run();
        }
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        m10153f();
        return (C3231f) this.f28942r0.f405p0;
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        m10153f();
        return this.f28941q0;
    }
}
