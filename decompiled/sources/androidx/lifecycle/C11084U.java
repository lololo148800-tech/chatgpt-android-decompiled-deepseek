package androidx.lifecycle;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import p225Im.InterfaceC3756d;
import p939p3.C18294d;

/* JADX INFO: renamed from: androidx.lifecycle.U */
/* JADX INFO: loaded from: classes.dex */
public final class C11084U implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: a */
    public final ViewModel mo11739a(Class cls) {
        ViewModelProviders.f33500a.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: b */
    public final ViewModel mo11740b(Class cls, C18294d c18294d) {
        return new C11088X();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d) {
        return AbstractC10763a.m11043a(this, interfaceC3756d, c18294d);
    }
}
