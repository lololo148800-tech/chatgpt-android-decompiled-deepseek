package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC11085V;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11069E;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.loader.app.C11119a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p001A.C0093v0;
import p003A1.RunnableC0153B;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p329N3.RunnableC5611a;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p582Xk.HXHG.TfazcFv;
import p588Y2.AbstractC9639w;
import p588Y2.C9602F;
import p588Y2.C9606J;
import p588Y2.C9611O;
import p588Y2.C9630n;
import p588Y2.C9631o;
import p588Y2.C9633q;
import p588Y2.C9637u;
import p861l1.xapn.suYVq;
import p939p3.C18294d;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC11000a implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC11112u, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC3232g {

    /* JADX INFO: renamed from: g1 */
    public static final Object f33118g1 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f33119A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f33120B0;

    /* JADX INFO: renamed from: C0 */
    public int f33121C0;

    /* JADX INFO: renamed from: D0 */
    public AbstractC11002c f33122D0;

    /* JADX INFO: renamed from: E0 */
    public C9637u f33123E0;

    /* JADX INFO: renamed from: G0 */
    public AbstractComponentCallbacksC11000a f33125G0;

    /* JADX INFO: renamed from: H0 */
    public int f33126H0;

    /* JADX INFO: renamed from: I0 */
    public int f33127I0;

    /* JADX INFO: renamed from: J0 */
    public String f33128J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f33129K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f33130L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f33131M0;

    /* JADX INFO: renamed from: O0 */
    public boolean f33133O0;

    /* JADX INFO: renamed from: P0 */
    public ViewGroup f33134P0;

    /* JADX INFO: renamed from: Q0 */
    public View f33135Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f33136R0;

    /* JADX INFO: renamed from: T0 */
    public C9633q f33138T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f33139U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f33140V0;

    /* JADX INFO: renamed from: W0 */
    public String f33141W0;

    /* JADX INFO: renamed from: X0 */
    public EnumC11104m f33142X0;

    /* JADX INFO: renamed from: Y0 */
    public C11114w f33144Y0;

    /* JADX INFO: renamed from: Z */
    public Bundle f33145Z;

    /* JADX INFO: renamed from: Z0 */
    public C9611O f33146Z0;

    /* JADX INFO: renamed from: a1 */
    public final C11069E f33147a1;

    /* JADX INFO: renamed from: b1 */
    public SavedStateViewModelFactory f33148b1;

    /* JADX INFO: renamed from: c1 */
    public C0093v0 f33149c1;

    /* JADX INFO: renamed from: d1 */
    public final AtomicInteger f33150d1;

    /* JADX INFO: renamed from: e1 */
    public final ArrayList f33151e1;

    /* JADX INFO: renamed from: f1 */
    public final C9630n f33152f1;

    /* JADX INFO: renamed from: o0 */
    public SparseArray f33153o0;

    /* JADX INFO: renamed from: p0 */
    public Bundle f33154p0;

    /* JADX INFO: renamed from: r0 */
    public Bundle f33156r0;

    /* JADX INFO: renamed from: s0 */
    public AbstractComponentCallbacksC11000a f33157s0;

    /* JADX INFO: renamed from: u0 */
    public int f33159u0;

    /* JADX INFO: renamed from: w0 */
    public boolean f33161w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f33162x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f33163y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f33164z0;

    /* JADX INFO: renamed from: Y */
    public int f33143Y = -1;

    /* JADX INFO: renamed from: q0 */
    public String f33155q0 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: t0 */
    public String f33158t0 = null;

    /* JADX INFO: renamed from: v0 */
    public Boolean f33160v0 = null;

    /* JADX INFO: renamed from: F0 */
    public C9606J f33124F0 = new C9606J();

    /* JADX INFO: renamed from: N0 */
    public final boolean f33132N0 = true;

    /* JADX INFO: renamed from: S0 */
    public boolean f33137S0 = true;

    public AbstractComponentCallbacksC11000a() {
        new RunnableC0153B(this, 14);
        this.f33142X0 = EnumC11104m.f33478q0;
        this.f33147a1 = new C11069E();
        this.f33150d1 = new AtomicInteger();
        this.f33151e1 = new ArrayList();
        this.f33152f1 = new C9630n(this);
        m11755r();
    }

    /* JADX INFO: renamed from: A */
    public View mo5181A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: B */
    public void mo5182B() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: C */
    public void mo10175C() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: D */
    public void mo10176D() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: E */
    public LayoutInflater mo10177E(Bundle bundle) {
        C9637u c9637u = this.f33123E0;
        if (c9637u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC11001b abstractActivityC11001b = c9637u.f29054q0;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC11001b.getLayoutInflater().cloneInContext(abstractActivityC11001b);
        layoutInflaterCloneInContext.setFactory2(this.f33124F0.f33189f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: F */
    public void mo5183F() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: G */
    public void mo10178G(Bundle bundle) {
    }

    /* JADX INFO: renamed from: H */
    public void mo10179H() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: I */
    public void mo10180I() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: J */
    public void mo10181J(Bundle bundle) {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: K */
    public void mo10182K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33124F0.m11775L();
        this.f33120B0 = true;
        this.f33146Z0 = new C9611O(this, mo10152e(), new RunnableC5611a(this, 19));
        View viewMo5181A = mo5181A(layoutInflater, viewGroup);
        this.f33135Q0 = viewMo5181A;
        if (viewMo5181A == null) {
            if (this.f33146Z0.f28941q0 != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f33146Z0 = null;
            return;
        }
        this.f33146Z0.m10153f();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f33135Q0 + " for Fragment " + this);
        }
        AbstractC7841A0.m8092d(this.f33135Q0, this.f33146Z0);
        ViewTreeViewModelStoreOwner.m12148b(this.f33135Q0, this.f33146Z0);
        AbstractC8104h6.m8585d(this.f33135Q0, this.f33146Z0);
        this.f33147a1.mo12122j(this.f33146Z0);
    }

    /* JADX INFO: renamed from: L */
    public final AbstractActivityC11001b m11742L() {
        AbstractActivityC11001b abstractActivityC11001bM11747f = m11747f();
        if (abstractActivityC11001bM11747f != null) {
            return abstractActivityC11001bM11747f;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: renamed from: M */
    public final Context m11743M() {
        Context contextM11752o = m11752o();
        if (contextM11752o != null) {
            return contextM11752o;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: N */
    public final View m11744N() {
        View view = this.f33135Q0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: O */
    public final void m11745O(int i10, int i11, int i12, int i13) {
        if (this.f33138T0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m11749l().f29036b = i10;
        m11749l().f29037c = i11;
        m11749l().f29038d = i12;
        m11749l().f29039e = i13;
    }

    /* JADX INFO: renamed from: P */
    public final void m11746P(Bundle bundle) {
        AbstractC11002c abstractC11002c = this.f33122D0;
        if (abstractC11002c != null && (abstractC11002c.f33175F || abstractC11002c.f33176G)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f33156r0 = bundle;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.Factory mo10149b() {
        Application application;
        if (this.f33122D0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f33148b1 == null) {
            Context applicationContext = m11743M().getApplicationContext();
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
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m11743M().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f33148b1 = new SavedStateViewModelFactory(application, this, this.f33156r0);
        }
        return this.f33148b1;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: c */
    public final C18294d mo10150c() {
        Application application;
        Context applicationContext = m11743M().getApplicationContext();
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
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m11743M().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C18294d c18294d = new C18294d(0);
        if (application != null) {
            c18294d.m19836b(ViewModelProvider.AndroidViewModelFactory.f33440g, application);
        }
        c18294d.m19836b(AbstractC11085V.f33426a, this);
        c18294d.m19836b(AbstractC11085V.f33427b, this);
        Bundle bundle = this.f33156r0;
        if (bundle != null) {
            c18294d.m19836b(AbstractC11085V.f33428c, bundle);
        }
        return c18294d;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* JADX INFO: renamed from: e */
    public final ViewModelStore mo10152e() {
        if (this.f33122D0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m11753p() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f33122D0.f33182M.f33114d;
        ViewModelStore viewModelStore = (ViewModelStore) map.get(this.f33155q0);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(this.f33155q0, viewModelStore2);
        return viewModelStore2;
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        return (C3231f) this.f33149c1.f405p0;
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f33144Y0;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC9639w mo10184j() {
        return new C9631o(this);
    }

    /* JADX INFO: renamed from: l */
    public final C9633q m11749l() {
        if (this.f33138T0 == null) {
            C9633q c9633q = new C9633q();
            Object obj = f33118g1;
            c9633q.f29041g = obj;
            c9633q.f29042h = obj;
            c9633q.f29043i = obj;
            c9633q.f29044j = 1.0f;
            c9633q.f29045k = null;
            this.f33138T0 = c9633q;
        }
        return this.f33138T0;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractActivityC11001b m11747f() {
        C9637u c9637u = this.f33123E0;
        if (c9637u == null) {
            return null;
        }
        return c9637u.f29050Y;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC11002c m11751n() {
        if (this.f33123E0 != null) {
            return this.f33124F0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: o */
    public final Context m11752o() {
        C9637u c9637u = this.f33123E0;
        if (c9637u == null) {
            return null;
        }
        return c9637u.f29051Z;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f33133O0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m11742L().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: p */
    public final int m11753p() {
        EnumC11104m enumC11104m = this.f33142X0;
        return (enumC11104m == EnumC11104m.f33475Z || this.f33125G0 == null) ? enumC11104m.ordinal() : Math.min(enumC11104m.ordinal(), this.f33125G0.m11753p());
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC11002c m11754q() {
        AbstractC11002c abstractC11002c = this.f33122D0;
        if (abstractC11002c != null) {
            return abstractC11002c;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: r */
    public final void m11755r() {
        this.f33144Y0 = new C11114w(this, true);
        this.f33149c1 = new C0093v0(this);
        this.f33148b1 = null;
        ArrayList arrayList = this.f33151e1;
        C9630n c9630n = this.f33152f1;
        if (arrayList.contains(c9630n)) {
            return;
        }
        if (this.f33143Y >= 0) {
            c9630n.mo10189a();
        } else {
            arrayList.add(c9630n);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11756s() {
        m11755r();
        this.f33141W0 = this.f33155q0;
        this.f33155q0 = UUID.randomUUID().toString();
        this.f33161w0 = false;
        this.f33162x0 = false;
        this.f33163y0 = false;
        this.f33164z0 = false;
        this.f33119A0 = false;
        this.f33121C0 = 0;
        this.f33122D0 = null;
        this.f33124F0 = new C9606J();
        this.f33123E0 = null;
        this.f33126H0 = 0;
        this.f33127I0 = 0;
        this.f33128J0 = null;
        this.f33129K0 = false;
        this.f33130L0 = false;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        if (this.f33123E0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        AbstractC11002c abstractC11002cM11754q = m11754q();
        if (abstractC11002cM11754q.f33170A == null) {
            C9637u c9637u = abstractC11002cM11754q.f33204u;
            if (i10 == -1) {
                c9637u.f29051Z.startActivity(intent, null);
                return;
            } else {
                c9637u.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        String str = this.f33155q0;
        C9602F c9602f = new C9602F();
        c9602f.f28898Y = str;
        c9602f.f28899Z = i10;
        abstractC11002cM11754q.f33173D.addLast(c9602f);
        abstractC11002cM11754q.f33170A.mo10188b(intent);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11757t() {
        return this.f33123E0 != null && this.f33161w0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f33155q0);
        if (this.f33126H0 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f33126H0));
        }
        if (this.f33128J0 != null) {
            sb2.append(" tag=");
            sb2.append(this.f33128J0);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11758u() {
        if (!this.f33129K0) {
            AbstractC11002c abstractC11002c = this.f33122D0;
            if (abstractC11002c == null) {
                return false;
            }
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33125G0;
            abstractC11002c.getClass();
            if (!(abstractComponentCallbacksC11000a == null ? false : abstractComponentCallbacksC11000a.m11758u())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11759v() {
        return this.f33121C0 > 0;
    }

    /* JADX INFO: renamed from: w */
    public void mo10185w() {
        this.f33133O0 = true;
    }

    /* JADX INFO: renamed from: x */
    public void mo11760x(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo10186y(AbstractActivityC11001b abstractActivityC11001b) {
        this.f33133O0 = true;
        C9637u c9637u = this.f33123E0;
        if ((c9637u == null ? null : c9637u.f29050Y) != null) {
            this.f33133O0 = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo5187z(Bundle bundle) {
        Bundle bundle2;
        this.f33133O0 = true;
        Bundle bundle3 = this.f33145Z;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f33124F0.m11781R(bundle2);
            C9606J c9606j = this.f33124F0;
            c9606j.f33175F = false;
            c9606j.f33176G = false;
            c9606j.f33182M.f33117g = false;
            c9606j.m11810t(1);
        }
        C9606J c9606j2 = this.f33124F0;
        if (c9606j2.f33203t >= 1) {
            return;
        }
        c9606j2.f33175F = false;
        c9606j2.f33176G = false;
        c9606j2.f33182M.f33117g = false;
        c9606j2.m11810t(1);
    }

    /* JADX INFO: renamed from: k */
    public void mo11748k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f33126H0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f33127I0));
        printWriter.print(" mTag=");
        printWriter.println(this.f33128J0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f33143Y);
        printWriter.print(" mWho=");
        printWriter.print(this.f33155q0);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f33121C0);
        printWriter.print(str);
        printWriter.print(TfazcFv.FxnhW);
        printWriter.print(this.f33161w0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f33162x0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f33163y0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f33164z0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f33129K0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f33130L0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f33132N0);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f33131M0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f33137S0);
        if (this.f33122D0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f33122D0);
        }
        if (this.f33123E0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f33123E0);
        }
        if (this.f33125G0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f33125G0);
        }
        if (this.f33156r0 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f33156r0);
        }
        if (this.f33145Z != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f33145Z);
        }
        if (this.f33153o0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f33153o0);
        }
        if (this.f33154p0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f33154p0);
        }
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11835b = this.f33157s0;
        if (abstractComponentCallbacksC11000aM11835b == null) {
            AbstractC11002c abstractC11002c = this.f33122D0;
            if (abstractC11002c != null && (str2 = this.f33158t0) != null) {
                abstractComponentCallbacksC11000aM11835b = abstractC11002c.f33186c.m11835b(str2);
            } else {
                abstractComponentCallbacksC11000aM11835b = null;
            }
        }
        if (abstractComponentCallbacksC11000aM11835b != null) {
            printWriter.print(str);
            printWriter.print(suYVq.zYhGyUxoid);
            printWriter.print(abstractComponentCallbacksC11000aM11835b);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f33159u0);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C9633q c9633q = this.f33138T0;
        if (c9633q == null) {
            z6 = false;
        } else {
            z6 = c9633q.f29035a;
        }
        printWriter.println(z6);
        C9633q c9633q2 = this.f33138T0;
        if (c9633q2 == null) {
            i10 = 0;
        } else {
            i10 = c9633q2.f29036b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C9633q c9633q3 = this.f33138T0;
            if (c9633q3 == null) {
                i16 = 0;
            } else {
                i16 = c9633q3.f29036b;
            }
            printWriter.println(i16);
        }
        C9633q c9633q4 = this.f33138T0;
        if (c9633q4 == null) {
            i11 = 0;
        } else {
            i11 = c9633q4.f29037c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C9633q c9633q5 = this.f33138T0;
            if (c9633q5 == null) {
                i15 = 0;
            } else {
                i15 = c9633q5.f29037c;
            }
            printWriter.println(i15);
        }
        C9633q c9633q6 = this.f33138T0;
        if (c9633q6 == null) {
            i12 = 0;
        } else {
            i12 = c9633q6.f29038d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C9633q c9633q7 = this.f33138T0;
            if (c9633q7 == null) {
                i14 = 0;
            } else {
                i14 = c9633q7.f29038d;
            }
            printWriter.println(i14);
        }
        C9633q c9633q8 = this.f33138T0;
        if (c9633q8 == null) {
            i13 = 0;
        } else {
            i13 = c9633q8.f29039e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C9633q c9633q9 = this.f33138T0;
            if (c9633q9 != null) {
                i17 = c9633q9.f29039e;
            }
            printWriter.println(i17);
        }
        if (this.f33134P0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f33134P0);
        }
        if (this.f33135Q0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f33135Q0);
        }
        if (m11752o() != null) {
            new C11119a(this, mo10152e()).m12176a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f33124F0 + ":");
        this.f33124F0.m11812v(AbstractC10763a.m11052j(str, "  "), fileDescriptor, printWriter, strArr);
    }
}
