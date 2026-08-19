package androidx.lifecycle;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p183H4.C3231f;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8210v0;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    public C3231f f33352a;

    /* JADX INFO: renamed from: b */
    public AbstractC11105n f33353b;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: a */
    public final ViewModel mo11739a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f33353b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        C3231f c3231f = this.f33352a;
        AbstractC16544l.m18091d(c3231f);
        AbstractC11105n abstractC11105n = this.f33353b;
        AbstractC16544l.m18091d(abstractC11105n);
        C11083T c11083tM8837d = AbstractC8210v0.m8837d(c3231f, abstractC11105n, canonicalName, null);
        ViewModel viewModelMo12114e = mo12114e(canonicalName, cls, c11083tM8837d.f33424Z);
        viewModelMo12114e.m12140b("androidx.lifecycle.savedstate.vm.tag", c11083tM8837d);
        return viewModelMo12114e;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: b */
    public final ViewModel mo11740b(Class cls, C18294d c18294d) {
        String str = (String) c18294d.m19835a(ViewModelProvider.NewInstanceFactory.f33444c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        C3231f c3231f = this.f33352a;
        if (c3231f == null) {
            return mo12114e(str, cls, AbstractC11085V.m12137a(c18294d));
        }
        AbstractC16544l.m18091d(c3231f);
        AbstractC11105n abstractC11105n = this.f33353b;
        AbstractC16544l.m18091d(abstractC11105n);
        C11083T c11083tM8837d = AbstractC8210v0.m8837d(c3231f, abstractC11105n, str, null);
        ViewModel viewModelMo12114e = mo12114e(str, cls, c11083tM8837d.f33424Z);
        viewModelMo12114e.m12140b("androidx.lifecycle.savedstate.vm.tag", c11083tM8837d);
        return viewModelMo12114e;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d) {
        return AbstractC10763a.m11043a(this, interfaceC3756d, c18294d);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    /* JADX INFO: renamed from: d */
    public final void mo12113d(ViewModel viewModel) {
        C3231f c3231f = this.f33352a;
        if (c3231f != null) {
            AbstractC11105n abstractC11105n = this.f33353b;
            AbstractC16544l.m18091d(abstractC11105n);
            AbstractC8210v0.m8836c(viewModel, c3231f, abstractC11105n);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract ViewModel mo12114e(String str, Class cls, C11082S c11082s);
}
