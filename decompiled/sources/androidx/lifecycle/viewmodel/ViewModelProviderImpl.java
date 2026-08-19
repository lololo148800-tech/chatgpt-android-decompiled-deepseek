package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p939p3.AbstractC18293c;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewModelProviderImpl {

    /* JADX INFO: renamed from: a */
    public final ViewModelStore f33488a;

    /* JADX INFO: renamed from: b */
    public final ViewModelProvider.Factory f33489b;

    /* JADX INFO: renamed from: c */
    public final AbstractC18293c f33490c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final ViewModel m12164a(InterfaceC3756d modelClass, String key) {
        ViewModel viewModel;
        AbstractC16544l.m18094g(modelClass, "modelClass");
        AbstractC16544l.m18094g(key, "key");
        ViewModelStore viewModelStore = this.f33488a;
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.f33445a;
        ViewModel viewModel2 = (ViewModel) linkedHashMap.get(key);
        boolean zMo4449e = modelClass.mo4449e(viewModel2);
        ViewModelProvider.Factory factory = this.f33489b;
        if (zMo4449e) {
            if (factory instanceof ViewModelProvider.OnRequeryFactory) {
                AbstractC16544l.m18091d(viewModel2);
                ((ViewModelProvider.OnRequeryFactory) factory).mo12113d(viewModel2);
            }
            AbstractC16544l.m18092e(viewModel2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return viewModel2;
        }
        C18294d c18294d = new C18294d(this.f33490c);
        c18294d.m19836b(ViewModelProviders.ViewModelKey.f33501Y, key);
        AbstractC16544l.m18094g(factory, "factory");
        try {
            try {
                viewModel = factory.mo11741c(modelClass, c18294d);
            } catch (AbstractMethodError unused) {
                viewModel = factory.mo11740b(AbstractC8138m0.m8667b(modelClass), c18294d);
            }
        } catch (AbstractMethodError unused2) {
            viewModel = factory.mo11739a(AbstractC8138m0.m8667b(modelClass));
        }
        AbstractC16544l.m18094g(viewModel, "viewModel");
        ViewModel viewModel3 = (ViewModel) linkedHashMap.put(key, viewModel);
        if (viewModel3 != null) {
            viewModel3.m12141c();
        }
        return viewModel;
    }

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, AbstractC18293c abstractC18293c) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(factory, "factory");
        AbstractC16544l.m18094g(abstractC18293c, qffLJgOYizGmMj.dqYhTcs);
        this.f33488a = store;
        this.f33489b = factory;
        this.f33490c = abstractC18293c;
    }
}
