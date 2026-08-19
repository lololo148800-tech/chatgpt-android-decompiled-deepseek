package p006A4;

import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0184L0;
import p1143z4.C21778h;
import p225Im.InterfaceC3756d;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8138m0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p562X0.C9013h;
import p939p3.AbstractC18293c;
import p939p3.C18291a;

/* JADX INFO: renamed from: A4.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0357r {
    /* JADX INFO: renamed from: a */
    public static final void m991a(C21778h c21778h, C9013h c9013h, C8410b c8410b, C6021p c6021p, int i10) {
        c6021p.m6526U(-1579360880);
        LocalViewModelStoreOwner.f33491a.getClass();
        C5997d.m6442b(new C6014l0[]{LocalViewModelStoreOwner.f33492b.mo6405a(c21778h), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().mo6405a(c21778h), AndroidCompositionLocals_androidKt.f32828e.mo6405a(c21778h)}, AbstractC8411c.m8968b(-52928304, c6021p, new C0356q(c9013h, c8410b, i10, 0)), c6021p, 56);
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r == null) {
            return;
        }
        c6018n0M6555r.f19536d = new C0184L0(c21778h, c9013h, c8410b, i10, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m992b(C9013h c9013h, C8410b c8410b, C6021p c6021p, int i10) {
        ViewModelProvider viewModelProvider;
        c6021p.m6526U(1211832233);
        c6021p.m6525T(1729797275);
        LocalViewModelStoreOwner.f33491a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
        if (viewModelStoreOwnerM12165a == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        boolean z6 = viewModelStoreOwnerM12165a instanceof HasDefaultViewModelProviderFactory;
        AbstractC18293c extras = z6 ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerM12165a).mo10150c() : C18291a.f58387b;
        c6021p.m6525T(-1566358618);
        InterfaceC3756d interfaceC3756dM8670e = AbstractC8138m0.m8670e(BackStackEntryIdViewModel.class);
        AbstractC16544l.m18094g(extras, "extras");
        if (z6) {
            ViewModelProvider.Companion companion = ViewModelProvider.f33436b;
            ViewModelStore store = viewModelStoreOwnerM12165a.mo10152e();
            ViewModelProvider.Factory factory = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerM12165a).mo10149b();
            companion.getClass();
            AbstractC16544l.m18094g(store, "store");
            AbstractC16544l.m18094g(factory, "factory");
            viewModelProvider = new ViewModelProvider(store, factory, extras);
        } else {
            ViewModelProvider.Companion companion2 = ViewModelProvider.f33436b;
            ViewModelProviders.f33500a.getClass();
            ViewModelProvider.Factory factory2 = z6 ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerM12165a).mo10149b() : DefaultViewModelProviderFactory.f33494a;
            AbstractC18293c extras2 = z6 ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerM12165a).mo10150c() : C18291a.f58387b;
            companion2.getClass();
            AbstractC16544l.m18094g(factory2, "factory");
            AbstractC16544l.m18094g(extras2, "extras");
            viewModelProvider = new ViewModelProvider(viewModelStoreOwnerM12165a.mo10152e(), factory2, extras2);
        }
        ViewModel viewModelM12144a = viewModelProvider.m12144a(interfaceC3756dM8670e);
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModelM12144a;
        backStackEntryIdViewModel.f33556c = new WeakReference(c9013h);
        c9013h.mo9594c(backStackEntryIdViewModel.f33555b, c8410b, c6021p, (i10 & 112) | 520);
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r == null) {
            return;
        }
        c6018n0M6555r.f19536d = new C0356q(c9013h, c8410b, i10, 1);
    }
}
