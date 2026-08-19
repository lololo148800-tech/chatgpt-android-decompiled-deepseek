package androidx.fragment.app;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p225Im.InterfaceC3756d;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerViewModel extends ViewModel {

    /* JADX INFO: renamed from: h */
    public static final ViewModelProvider.Factory f33111h = new ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: a */
        public final ViewModel mo11739a(Class cls) {
            return new FragmentManagerViewModel(true);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: b */
        public final ViewModel mo11740b(Class cls, C18294d c18294d) {
            return mo11739a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d) {
            return AbstractC10763a.m11043a(this, interfaceC3756d, c18294d);
        }
    };

    /* JADX INFO: renamed from: e */
    public final boolean f33115e;

    /* JADX INFO: renamed from: b */
    public final HashMap f33112b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f33113c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f33114d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f33116f = false;

    /* JADX INFO: renamed from: g */
    public boolean f33117g = false;

    public FragmentManagerViewModel(boolean z6) {
        this.f33115e = z6;
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f33116f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.f33112b.equals(fragmentManagerViewModel.f33112b) && this.f33113c.equals(fragmentManagerViewModel.f33113c) && this.f33114d.equals(fragmentManagerViewModel.f33114d);
    }

    /* JADX INFO: renamed from: f */
    public final void m11735f(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, boolean z6) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC11000a);
        }
        m11737h(abstractComponentCallbacksC11000a.f33155q0, z6);
    }

    /* JADX INFO: renamed from: g */
    public final void m11736g(String str, boolean z6) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m11737h(str, z6);
    }

    /* JADX INFO: renamed from: h */
    public final void m11737h(String str, boolean z6) {
        HashMap map = this.f33113c;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) map.get(str);
        if (fragmentManagerViewModel != null) {
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.f33113c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.m11736g((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.mo11734e();
            map.remove(str);
        }
        HashMap map2 = this.f33114d;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.m12146a();
            map2.remove(str);
        }
    }

    public final int hashCode() {
        return this.f33114d.hashCode() + ((this.f33113c.hashCode() + (this.f33112b.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final void m11738i(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (this.f33117g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f33112b.remove(abstractComponentCallbacksC11000a.f33155q0) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC11000a);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f33112b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f33113c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f33114d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
