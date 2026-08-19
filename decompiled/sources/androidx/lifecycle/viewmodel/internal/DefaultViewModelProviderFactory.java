package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/viewmodel/internal/DefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    public static final DefaultViewModelProviderFactory f33494a = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: a */
    public final ViewModel mo11739a(Class cls) {
        ViewModelProviders.f33500a.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: b */
    public final ViewModel mo11740b(Class cls, C18294d c18294d) {
        mo11739a(cls);
        throw null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* JADX INFO: renamed from: c */
    public final ViewModel mo11741c(InterfaceC3756d modelClass, C18294d c18294d) {
        AbstractC16544l.m18094g(modelClass, "modelClass");
        JvmViewModelProviders jvmViewModelProviders = JvmViewModelProviders.f33495a;
        Class clsM8667b = AbstractC8138m0.m8667b(modelClass);
        jvmViewModelProviders.getClass();
        return JvmViewModelProviders.m12166a(clsM8667b);
    }
}
