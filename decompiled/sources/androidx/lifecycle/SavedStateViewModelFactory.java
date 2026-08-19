package androidx.lifecycle;

import android.app.Application;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8210v0;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18067d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    public final Application f33416a;

    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.AndroidViewModelFactory f33417b;

    /* JADX INFO: renamed from: c */
    public final Bundle f33418c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11105n f33419d;

    /* JADX INFO: renamed from: e */
    public final C3231f f33420e;

    public SavedStateViewModelFactory(Application application, InterfaceC3232g owner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        AbstractC16544l.m18094g(owner, "owner");
        this.f33420e = owner.mo4127h();
        this.f33419d = owner.mo7809i();
        this.f33418c = bundle;
        this.f33416a = application;
        if (application != null) {
            ViewModelProvider.AndroidViewModelFactory.f33438e.getClass();
            if (ViewModelProvider.AndroidViewModelFactory.f33439f == null) {
                ViewModelProvider.AndroidViewModelFactory.f33439f = new ViewModelProvider.AndroidViewModelFactory(application);
            }
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.f33439f;
            AbstractC16544l.m18091d(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.f33417b = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: a */
    public final ViewModel mo11739a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m12133e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: b */
    public final ViewModel mo11740b(Class cls, C18294d c18294d) {
        String str = (String) c18294d.m19835a(ViewModelProvider.NewInstanceFactory.f33444c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c18294d.m19835a(AbstractC11085V.f33426a) == null || c18294d.m19835a(AbstractC11085V.f33427b) == null) {
            if (this.f33419d != null) {
                return m12133e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) c18294d.m19835a(ViewModelProvider.AndroidViewModelFactory.f33440g);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorM12134a = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.m12134a(cls, SavedStateViewModelFactoryKt.f33422b) : SavedStateViewModelFactoryKt.m12134a(cls, SavedStateViewModelFactoryKt.f33421a);
        if (constructorM12134a == null) {
            return this.f33417b.mo11740b(cls, c18294d);
        }
        return (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.m12135b(cls, constructorM12134a, AbstractC11085V.m12137a(c18294d)) : SavedStateViewModelFactoryKt.m12135b(cls, constructorM12134a, application, AbstractC11085V.m12137a(c18294d));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d) {
        return AbstractC10763a.m11043a(this, interfaceC3756d, c18294d);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    /* JADX INFO: renamed from: d */
    public final void mo12113d(ViewModel viewModel) {
        AbstractC11105n abstractC11105n = this.f33419d;
        if (abstractC11105n != null) {
            C3231f c3231f = this.f33420e;
            AbstractC16544l.m18091d(c3231f);
            AbstractC8210v0.m8836c(viewModel, c3231f, abstractC11105n);
        }
    }

    /* JADX INFO: renamed from: e */
    public final ViewModel m12133e(Class cls, String str) {
        AbstractC11105n abstractC11105n = this.f33419d;
        if (abstractC11105n == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.f33416a;
        Constructor constructorM12134a = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.m12134a(cls, SavedStateViewModelFactoryKt.f33422b) : SavedStateViewModelFactoryKt.m12134a(cls, SavedStateViewModelFactoryKt.f33421a);
        if (constructorM12134a != null) {
            C3231f c3231f = this.f33420e;
            AbstractC16544l.m18091d(c3231f);
            C11083T c11083tM8837d = AbstractC8210v0.m8837d(c3231f, abstractC11105n, str, this.f33418c);
            C11082S c11082s = c11083tM8837d.f33424Z;
            ViewModel viewModelM12135b = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.m12135b(cls, constructorM12134a, c11082s) : SavedStateViewModelFactoryKt.m12135b(cls, constructorM12134a, application, c11082s);
            viewModelM12135b.m12140b("androidx.lifecycle.savedstate.vm.tag", c11083tM8837d);
            return viewModelM12135b;
        }
        if (application != null) {
            return this.f33417b.mo11739a(cls);
        }
        ViewModelProvider.NewInstanceFactory.f33442a.getClass();
        if (ViewModelProvider.NewInstanceFactory.f33443b == null) {
            ViewModelProvider.NewInstanceFactory.f33443b = new ViewModelProvider.NewInstanceFactory();
        }
        AbstractC16544l.m18091d(ViewModelProvider.NewInstanceFactory.f33443b);
        JvmViewModelProviders.f33495a.getClass();
        return JvmViewModelProviders.m12166a(cls);
    }
}
