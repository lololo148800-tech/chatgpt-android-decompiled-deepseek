package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p939p3.AbstractC18293c;
import p939p3.C18291a;
import p939p3.C18294d;
import p939p3.InterfaceC18292b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "AndroidViewModelFactory", "Companion", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class ViewModelProvider {

    /* JADX INFO: renamed from: b */
    public static final Companion f33436b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final ViewModelProviderImpl f33437a;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "<init>", "()V", "Lp3/b;", "", "VIEW_MODEL_KEY", "Lp3/b;", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public interface Factory {
        /* JADX INFO: renamed from: a */
        ViewModel mo11739a(Class cls);

        /* JADX INFO: renamed from: b */
        ViewModel mo11740b(Class cls, C18294d c18294d);

        /* JADX INFO: renamed from: c */
        ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d);
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Companion", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class NewInstanceFactory implements Factory {

        /* JADX INFO: renamed from: b */
        public static NewInstanceFactory f33443b;

        /* JADX INFO: renamed from: a */
        public static final Companion f33442a = new Companion(0);

        /* JADX INFO: renamed from: c */
        public static final ViewModelProviders.ViewModelKey f33444c = ViewModelProviders.ViewModelKey.f33501Y;

        @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "<init>", "()V", "Lp3/b;", "", "VIEW_MODEL_KEY", "Lp3/b;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: a */
        public ViewModel mo11739a(Class cls) {
            JvmViewModelProviders.f33495a.getClass();
            return JvmViewModelProviders.m12166a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: b */
        public ViewModel mo11740b(Class cls, C18294d c18294d) {
            return mo11739a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: c */
        public final ViewModel mo11741c(InterfaceC3756d modelClass, C18294d c18294d) {
            AbstractC16544l.m18094g(modelClass, "modelClass");
            return mo11740b(AbstractC8138m0.m8667b(modelClass), c18294d);
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class OnRequeryFactory {
        /* JADX INFO: renamed from: d */
        public abstract void mo12113d(ViewModel viewModel);
    }

    static {
        ViewModelProviders.ViewModelKey viewModelKey = ViewModelProviders.ViewModelKey.f33501Y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, 0);
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(factory, "factory");
    }

    /* JADX INFO: renamed from: a */
    public final ViewModel m12144a(InterfaceC3756d modelClass) {
        AbstractC16544l.m18094g(modelClass, "modelClass");
        ViewModelProviders.f33500a.getClass();
        String strMo4447a = modelClass.mo4447a();
        if (strMo4447a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f33437a.m12164a(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo4447a));
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "<init>", "()V", "Companion", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* JADX INFO: renamed from: f */
        public static AndroidViewModelFactory f33439f;

        /* JADX INFO: renamed from: d */
        public final Application f33441d;

        /* JADX INFO: renamed from: e */
        public static final Companion f33438e = new Companion(0);

        /* JADX INFO: renamed from: g */
        public static final C11086x31cd9b07 f33440g = new InterfaceC18292b() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "<init>", "()V", "Lp3/b;", "Landroid/app/Application;", "APPLICATION_KEY", "Lp3/b;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        public AndroidViewModelFactory(Application application) {
            this.f33441d = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: a */
        public final ViewModel mo11739a(Class cls) {
            Application application = this.f33441d;
            if (application != null) {
                return m12145d(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: b */
        public final ViewModel mo11740b(Class cls, C18294d c18294d) {
            if (this.f33441d != null) {
                return mo11739a(cls);
            }
            Application application = (Application) c18294d.m19835a(f33440g);
            if (application != null) {
                return m12145d(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            JvmViewModelProviders.f33495a.getClass();
            return JvmViewModelProviders.m12166a(cls);
        }

        /* JADX INFO: renamed from: d */
        public final ViewModel m12145d(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                JvmViewModelProviders.f33495a.getClass();
                return JvmViewModelProviders.m12166a(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                AbstractC16544l.m18093f(viewModel, "{\n                try {\n…          }\n            }");
                return viewModel;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public AndroidViewModelFactory() {
            this(null);
        }
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, int i10) {
        this(viewModelStore, factory, C18291a.f58387b);
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, AbstractC18293c defaultCreationExtras) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(factory, "factory");
        AbstractC16544l.m18094g(defaultCreationExtras, "defaultCreationExtras");
        this.f33437a = new ViewModelProviderImpl(store, factory, defaultCreationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner owner, Factory factory) {
        AbstractC18293c abstractC18293cMo10150c;
        AbstractC16544l.m18094g(owner, "owner");
        ViewModelStore viewModelStoreMo10152e = owner.mo10152e();
        ViewModelProviders.f33500a.getClass();
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            abstractC18293cMo10150c = ((HasDefaultViewModelProviderFactory) owner).mo10150c();
        } else {
            abstractC18293cMo10150c = C18291a.f58387b;
        }
        this(viewModelStoreMo10152e, factory, abstractC18293cMo10150c);
    }
}
