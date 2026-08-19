package p1143z4;

import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11085V;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.C11121b;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavViewModelStoreProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p001A.C0093v0;
import p1071w0.C20714I0;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p571X9.AbstractC9227W;
import p939p3.C18294d;

/* JADX INFO: renamed from: z4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21778h implements InterfaceC11112u, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC3232g {

    /* JADX INFO: renamed from: Y */
    public final Context f69073Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC21790t f69074Z;

    /* JADX INFO: renamed from: o0 */
    public final Bundle f69075o0;

    /* JADX INFO: renamed from: p0 */
    public EnumC11104m f69076p0;

    /* JADX INFO: renamed from: q0 */
    public final NavViewModelStoreProvider f69077q0;

    /* JADX INFO: renamed from: r0 */
    public final String f69078r0;

    /* JADX INFO: renamed from: s0 */
    public final Bundle f69079s0;

    /* JADX INFO: renamed from: t0 */
    public final C11114w f69080t0 = new C11114w(this, true);

    /* JADX INFO: renamed from: u0 */
    public final C0093v0 f69081u0 = new C0093v0(this);

    /* JADX INFO: renamed from: v0 */
    public boolean f69082v0;

    /* JADX INFO: renamed from: w0 */
    public EnumC11104m f69083w0;

    /* JADX INFO: renamed from: x0 */
    public final SavedStateViewModelFactory f69084x0;

    public C21778h(Context context, AbstractC21790t abstractC21790t, Bundle bundle, EnumC11104m enumC11104m, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.f69073Y = context;
        this.f69074Z = abstractC21790t;
        this.f69075o0 = bundle;
        this.f69076p0 = enumC11104m;
        this.f69077q0 = navViewModelStoreProvider;
        this.f69078r0 = str;
        this.f69079s0 = bundle2;
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new C20714I0(this, 13));
        AbstractC9227W.m9800c(new C11121b(this));
        this.f69083w0 = EnumC11104m.f33475Z;
        this.f69084x0 = (SavedStateViewModelFactory) c17314qM9800c.getValue();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.Factory mo10149b() {
        return this.f69084x0;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: c */
    public final C18294d mo10150c() {
        C18294d c18294d = new C18294d(0);
        Context context = this.f69073Y;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c18294d.m19836b(ViewModelProvider.AndroidViewModelFactory.f33440g, application);
        }
        c18294d.m19836b(AbstractC11085V.f33426a, this);
        c18294d.m19836b(AbstractC11085V.f33427b, this);
        Bundle bundleM22263d = m22263d();
        if (bundleM22263d != null) {
            c18294d.m19836b(AbstractC11085V.f33428c, bundleM22263d);
        }
        return c18294d;
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m22263d() {
        Bundle bundle = this.f69075o0;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* JADX INFO: renamed from: e */
    public final ViewModelStore mo10152e() {
        if (!this.f69082v0) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f69080t0.f33504d == EnumC11104m.f33474Y) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.f69077q0;
        if (navViewModelStoreProvider == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = this.f69078r0;
        AbstractC16544l.m18094g(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = ((NavControllerViewModel) navViewModelStoreProvider).f33522b;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof C21778h)) {
            return false;
        }
        C21778h c21778h = (C21778h) obj;
        if (!AbstractC16544l.m18089b(this.f69078r0, c21778h.f69078r0) || !AbstractC16544l.m18089b(this.f69074Z, c21778h.f69074Z) || !AbstractC16544l.m18089b(this.f69080t0, c21778h.f69080t0) || !AbstractC16544l.m18089b((C3231f) this.f69081u0.f405p0, (C3231f) c21778h.f69081u0.f405p0)) {
            return false;
        }
        Bundle bundle = this.f69075o0;
        Bundle bundle2 = c21778h.f69075o0;
        if (!AbstractC16544l.m18089b(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!AbstractC16544l.m18089b(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m22264f(EnumC11104m maxState) {
        AbstractC16544l.m18094g(maxState, "maxState");
        this.f69083w0 = maxState;
        m22265g();
    }

    /* JADX INFO: renamed from: g */
    public final void m22265g() {
        if (!this.f69082v0) {
            C0093v0 c0093v0 = this.f69081u0;
            c0093v0.m348r();
            this.f69082v0 = true;
            if (this.f69077q0 != null) {
                AbstractC11085V.m12138b(this);
            }
            c0093v0.m349s(this.f69079s0);
        }
        int iOrdinal = this.f69076p0.ordinal();
        int iOrdinal2 = this.f69083w0.ordinal();
        C11114w c11114w = this.f69080t0;
        if (iOrdinal < iOrdinal2) {
            c11114w.m12172h(this.f69076p0);
        } else {
            c11114w.m12172h(this.f69083w0);
        }
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        return (C3231f) this.f69081u0.f405p0;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f69074Z.hashCode() + (this.f69078r0.hashCode() * 31);
        Bundle bundle = this.f69075o0;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((C3231f) this.f69081u0.f405p0).hashCode() + ((this.f69080t0.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f69080t0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C21778h.class.getSimpleName());
        sb2.append(Separators.LPAREN + this.f69078r0 + ')');
        sb2.append(" destination=");
        sb2.append(this.f69074Z);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }
}
