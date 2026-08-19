package androidx.loader.app;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import p001A.C0095w0;
import p225Im.InterfaceC3756d;
import p692d0.C12960M;
import p939p3.C18294d;
import p960q9.C18650d;
import p980r3.C18871a;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl$LoaderViewModel extends ViewModel {

    /* JADX INFO: renamed from: d */
    public static final ViewModelProvider.Factory f33514d = new ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl$LoaderViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: a */
        public final ViewModel mo11739a(Class cls) {
            return new LoaderManagerImpl$LoaderViewModel();
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

    /* JADX INFO: renamed from: b */
    public final C12960M f33515b = new C12960M(0);

    /* JADX INFO: renamed from: c */
    public boolean f33516c = false;

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        C12960M c12960m = this.f33515b;
        int iM14655f = c12960m.m14655f();
        for (int i10 = 0; i10 < iM14655f; i10++) {
            C18871a c18871a = (C18871a) c12960m.m14656g(i10);
            C18650d c18650d = c18871a.f60111l;
            c18650d.m20012a();
            c18650d.f59399c = true;
            C0095w0 c0095w0 = c18871a.f60113n;
            if (c0095w0 != null) {
                c18871a.mo12121i(c0095w0);
            }
            C18871a c18871a2 = c18650d.f59397a;
            if (c18871a2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c18871a2 != c18871a) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c18650d.f59397a = null;
            if (c0095w0 != null) {
                boolean z6 = c0095w0.f410Z;
            }
            c18650d.f59400d = true;
            c18650d.f59398b = false;
            c18650d.f59399c = false;
            c18650d.f59401e = false;
        }
        int i11 = c12960m.f41158p0;
        Object[] objArr = c12960m.f41157o0;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        c12960m.f41158p0 = 0;
        c12960m.f41155Y = false;
    }
}
