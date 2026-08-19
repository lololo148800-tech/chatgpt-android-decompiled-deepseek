package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC10817a;
import androidx.lifecycle.AbstractC11079O;
import androidx.lifecycle.AbstractC11085V;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11086x31cd9b07;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.FragmentC11081Q;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.auth0.android.request.internal.C11846e;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.openai.chatgpt.R;
import fo.C13711h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p001A.C0093v0;
import p003A1.C0199Q0;
import p004A2.InterfaceC0310a;
import p030B2.InterfaceC0771n;
import p049Bm.InterfaceC1426a;
import p183H4.C3227b;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p544W9.AbstractC8447A3;
import p544W9.AbstractC8748z;
import p571X9.AbstractC9227W;
import p588Y2.C9598B;
import p588Y2.C9636t;
import p772h.C14215F;
import p772h.C14225g;
import p772h.C14227i;
import p772h.C14228j;
import p772h.C14236r;
import p772h.C14241w;
import p772h.InterfaceC14216G;
import p772h.RunnableC14222d;
import p772h.ViewTreeObserverOnDrawListenerC14226h;
import p816j.InterfaceC16029a;
import p841k.AbstractC16283c;
import p841k.InterfaceC16282b;
import p841k.InterfaceC16289i;
import p859l.AbstractC16651b;
import p896n2.AbstractActivityC17454g;
import p896n2.C17457j;
import p896n2.C17472y;
import p896n2.InterfaceC17470w;
import p896n2.InterfaceC17471x;
import p913o2.InterfaceC17808i;
import p913o2.InterfaceC17809j;
import p939p3.C18294d;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC10817a extends AbstractActivityC17454g implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC3232g, InterfaceC14216G, InterfaceC16289i, InterfaceC17808i, InterfaceC17809j, InterfaceC17470w, InterfaceC17471x, InterfaceC0771n {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ int f32056F0 = 0;

    /* JADX INFO: renamed from: A0 */
    public final CopyOnWriteArrayList f32057A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f32058B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f32059C0;

    /* JADX INFO: renamed from: D0 */
    public final C17314q f32060D0;

    /* JADX INFO: renamed from: E0 */
    public final C17314q f32061E0;

    /* JADX INFO: renamed from: Z */
    public final C11846e f32062Z = new C11846e(1);

    /* JADX INFO: renamed from: o0 */
    public final C13711h f32063o0 = new C13711h(new RunnableC14222d(this, 0));

    /* JADX INFO: renamed from: p0 */
    public final C0093v0 f32064p0;

    /* JADX INFO: renamed from: q0 */
    public ViewModelStore f32065q0;

    /* JADX INFO: renamed from: r0 */
    public final ViewTreeObserverOnDrawListenerC14226h f32066r0;

    /* JADX INFO: renamed from: s0 */
    public final C17314q f32067s0;

    /* JADX INFO: renamed from: t0 */
    public final AtomicInteger f32068t0;

    /* JADX INFO: renamed from: u0 */
    public final C14227i f32069u0;

    /* JADX INFO: renamed from: v0 */
    public final CopyOnWriteArrayList f32070v0;

    /* JADX INFO: renamed from: w0 */
    public final CopyOnWriteArrayList f32071w0;

    /* JADX INFO: renamed from: x0 */
    public final CopyOnWriteArrayList f32072x0;

    /* JADX INFO: renamed from: y0 */
    public final CopyOnWriteArrayList f32073y0;

    /* JADX INFO: renamed from: z0 */
    public final CopyOnWriteArrayList f32074z0;

    public AbstractActivityC10817a() {
        C0093v0 c0093v0 = new C0093v0(this);
        this.f32064p0 = c0093v0;
        this.f32066r0 = new ViewTreeObserverOnDrawListenerC14226h(this);
        this.f32067s0 = AbstractC9227W.m9800c(new C14228j(this, 1));
        this.f32068t0 = new AtomicInteger();
        this.f32069u0 = new C14227i(this);
        this.f32070v0 = new CopyOnWriteArrayList();
        this.f32071w0 = new CopyOnWriteArrayList();
        this.f32072x0 = new CopyOnWriteArrayList();
        this.f32073y0 = new CopyOnWriteArrayList();
        this.f32074z0 = new CopyOnWriteArrayList();
        this.f32057A0 = new CopyOnWriteArrayList();
        C11114w c11114w = this.f55801Y;
        if (c11114w == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        c11114w.mo7806a(new InterfaceC11110s(this) { // from class: h.e

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractActivityC10817a f44663Z;

            {
                this.f44663Z = this;
            }

            @Override // androidx.lifecycle.InterfaceC11110s
            /* JADX INFO: renamed from: E */
            public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        AbstractActivityC10817a abstractActivityC10817a = this.f44663Z;
                        if (enumC11103l == EnumC11103l.ON_STOP && (window = abstractActivityC10817a.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC10817a abstractActivityC10817a2 = this.f44663Z;
                        if (enumC11103l == EnumC11103l.ON_DESTROY) {
                            abstractActivityC10817a2.f32062Z.f35978Z = null;
                            if (!abstractActivityC10817a2.isChangingConfigurations()) {
                                abstractActivityC10817a2.mo10152e().m12146a();
                            }
                            ViewTreeObserverOnDrawListenerC14226h viewTreeObserverOnDrawListenerC14226h = abstractActivityC10817a2.f32066r0;
                            AbstractActivityC10817a abstractActivityC10817a3 = viewTreeObserverOnDrawListenerC14226h.f44669p0;
                            abstractActivityC10817a3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC14226h);
                            abstractActivityC10817a3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC14226h);
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f55801Y.mo7806a(new InterfaceC11110s(this) { // from class: h.e

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractActivityC10817a f44663Z;

            {
                this.f44663Z = this;
            }

            @Override // androidx.lifecycle.InterfaceC11110s
            /* JADX INFO: renamed from: E */
            public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        AbstractActivityC10817a abstractActivityC10817a = this.f44663Z;
                        if (enumC11103l == EnumC11103l.ON_STOP && (window = abstractActivityC10817a.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC10817a abstractActivityC10817a2 = this.f44663Z;
                        if (enumC11103l == EnumC11103l.ON_DESTROY) {
                            abstractActivityC10817a2.f32062Z.f35978Z = null;
                            if (!abstractActivityC10817a2.isChangingConfigurations()) {
                                abstractActivityC10817a2.mo10152e().m12146a();
                            }
                            ViewTreeObserverOnDrawListenerC14226h viewTreeObserverOnDrawListenerC14226h = abstractActivityC10817a2.f32066r0;
                            AbstractActivityC10817a abstractActivityC10817a3 = viewTreeObserverOnDrawListenerC14226h.f44669p0;
                            abstractActivityC10817a3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC14226h);
                            abstractActivityC10817a3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC14226h);
                        }
                        break;
                }
            }
        });
        this.f55801Y.mo7806a(new C3227b(this, 4));
        c0093v0.m348r();
        AbstractC11085V.m12138b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f55801Y.mo7806a(new C14241w(this));
        }
        ((C3231f) c0093v0.f405p0).m4125f("android:support:activity-result", new C0199Q0(this, 4));
        m11094k(new C9636t(this, 1));
        this.f32060D0 = AbstractC9227W.m9800c(new ComponentActivity$defaultViewModelProviderFactory$2(this));
        this.f32061E0 = AbstractC9227W.m9800c(new C14228j(this, 2));
    }

    @Override // p772h.InterfaceC14216G
    /* JADX INFO: renamed from: a */
    public final C14215F mo10191a() {
        return (C14215F) this.f32061E0.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11095l();
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        this.f32066r0.m15527a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.Factory mo10149b() {
        return (ViewModelProvider.Factory) this.f32060D0.getValue();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: c */
    public final C18294d mo10150c() {
        C18294d c18294d = new C18294d(0);
        if (getApplication() != null) {
            C11086x31cd9b07 c11086x31cd9b07 = ViewModelProvider.AndroidViewModelFactory.f33440g;
            Application application = getApplication();
            AbstractC16544l.m18093f(application, "application");
            c18294d.m19836b(c11086x31cd9b07, application);
        }
        c18294d.m19836b(AbstractC11085V.f33426a, this);
        c18294d.m19836b(AbstractC11085V.f33427b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c18294d.m19836b(AbstractC11085V.f33428c, extras);
        }
        return c18294d;
    }

    @Override // p841k.InterfaceC16289i
    /* JADX INFO: renamed from: d */
    public final C14227i mo10192d() {
        return this.f32069u0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* JADX INFO: renamed from: e */
    public final ViewModelStore mo10152e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f32065q0 == null) {
            C14225g c14225g = (C14225g) getLastNonConfigurationInstance();
            if (c14225g != null) {
                this.f32065q0 = c14225g.f44665a;
            }
            if (this.f32065q0 == null) {
                this.f32065q0 = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this.f32065q0;
        AbstractC16544l.m18091d(viewModelStore);
        return viewModelStore;
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        return (C3231f) this.f32064p0.f405p0;
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f55801Y;
    }

    /* JADX INFO: renamed from: j */
    public final void m11093j(InterfaceC0310a listener) {
        AbstractC16544l.m18094g(listener, "listener");
        this.f32070v0.add(listener);
    }

    /* JADX INFO: renamed from: k */
    public final void m11094k(InterfaceC16029a interfaceC16029a) {
        C11846e c11846e = this.f32062Z;
        c11846e.getClass();
        AbstractActivityC10817a abstractActivityC10817a = (AbstractActivityC10817a) c11846e.f35978Z;
        if (abstractActivityC10817a != null) {
            interfaceC16029a.mo10190a(abstractActivityC10817a);
        }
        ((CopyOnWriteArraySet) c11846e.f35977Y).add(interfaceC16029a);
    }

    /* JADX INFO: renamed from: l */
    public final void m11095l() {
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        AbstractC7841A0.m8092d(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.m12148b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView3, "window.decorView");
        AbstractC8104h6.m8585d(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView4, "window.decorView");
        AbstractC8748z.m9503d(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC16283c m11096m(InterfaceC16282b interfaceC16282b, AbstractC16651b abstractC16651b) {
        C14227i registry = this.f32069u0;
        AbstractC16544l.m18094g(registry, "registry");
        return registry.m15530c("activity_rq#" + this.f32068t0.getAndIncrement(), this, abstractC16651b, interfaceC16282b);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f32069u0.m15528a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        mo10191a().m15518c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC16544l.m18094g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f32070v0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(newConfig);
        }
    }

    @Override // p896n2.AbstractActivityC17454g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32064p0.m349s(bundle);
        C11846e c11846e = this.f32062Z;
        c11846e.getClass();
        c11846e.f35978Z = this;
        Iterator it = ((CopyOnWriteArraySet) c11846e.f35977Y).iterator();
        while (it.hasNext()) {
            ((InterfaceC16029a) it.next()).mo10190a(this);
        }
        super.onCreate(bundle);
        int i10 = FragmentC11081Q.f33408Z;
        AbstractC11079O.m12127b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC16544l.m18094g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f32063o0.f43260o0).iterator();
        while (it.hasNext()) {
            ((C9598B) it.next()).f28890a.m11800j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC16544l.m18094g(item, "item");
        boolean z6 = true;
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f32063o0.f43260o0).iterator();
        while (it.hasNext()) {
            if (((C9598B) it.next()).f28890a.m11805o()) {
                return z6;
            }
        }
        z6 = false;
        return z6;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f32058B0) {
            return;
        }
        Iterator it = this.f32073y0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(new C17457j(z6));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f32072x0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC16544l.m18094g(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f32063o0.f43260o0).iterator();
        while (it.hasNext()) {
            ((C9598B) it.next()).f28890a.m11806p();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f32059C0) {
            return;
        }
        Iterator it = this.f32074z0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(new C17472y(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC16544l.m18094g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f32063o0.f43260o0).iterator();
        while (it.hasNext()) {
            ((C9598B) it.next()).f28890a.m11809s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC16544l.m18094g(permissions, "permissions");
        AbstractC16544l.m18094g(grantResults, "grantResults");
        if (this.f32069u0.m15528a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C14225g c14225g;
        ViewModelStore viewModelStore = this.f32065q0;
        if (viewModelStore == null && (c14225g = (C14225g) getLastNonConfigurationInstance()) != null) {
            viewModelStore = c14225g.f44665a;
        }
        if (viewModelStore == null) {
            return null;
        }
        C14225g c14225g2 = new C14225g();
        c14225g2.f44665a = viewModelStore;
        return c14225g2;
    }

    @Override // p896n2.AbstractActivityC17454g, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC16544l.m18094g(outState, "outState");
        C11114w c11114w = this.f55801Y;
        if (c11114w instanceof C11114w) {
            AbstractC16544l.m18092e(c11114w, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c11114w.m12172h(EnumC11104m.f33476o0);
        }
        super.onSaveInstanceState(outState);
        this.f32064p0.m351u(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f32071w0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f32057A0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC8447A3.m9051c()) {
                Trace.beginSection(AbstractC8447A3.m9053f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C14236r c14236r = (C14236r) this.f32067s0.getValue();
            synchronized (c14236r.f44686b) {
                try {
                    c14236r.f44687c = true;
                    Iterator it = c14236r.f44688d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1426a) it.next()).invoke();
                    }
                    c14236r.f44688d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m11095l();
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        this.f32066r0.m15527a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        AbstractC16544l.m18094g(intent, lZYtIbClQJm.qTQshlIyBKPIR);
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC16544l.m18094g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC16544l.m18094g(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC16544l.m18094g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, Configuration newConfig) {
        AbstractC16544l.m18094g(newConfig, "newConfig");
        this.f32058B0 = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.f32058B0 = false;
            Iterator it = this.f32073y0.iterator();
            while (it.hasNext()) {
                ((InterfaceC0310a) it.next()).accept(new C17457j(z6));
            }
        } catch (Throwable th2) {
            this.f32058B0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, Configuration newConfig) {
        AbstractC16544l.m18094g(newConfig, "newConfig");
        this.f32059C0 = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.f32059C0 = false;
            Iterator it = this.f32074z0.iterator();
            while (it.hasNext()) {
                ((InterfaceC0310a) it.next()).accept(new C17472y(z6));
            }
        } catch (Throwable th2) {
            this.f32059C0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m11095l();
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        this.f32066r0.m15527a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11095l();
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        this.f32066r0.m15527a(decorView);
        super.setContentView(view, layoutParams);
    }
}
