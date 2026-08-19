package p183H4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.view.View;
import androidx.activity.AbstractActivityC10817a;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.C11087W;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11099h;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8210v0;
import p571X9.AbstractC9306j0;
import p772h.C14225g;
import p791hj.C14518a;
import p791hj.C14522e;

/* JADX INFO: renamed from: H4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3227b implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9793Y;

    /* JADX INFO: renamed from: Z */
    public final Object f9794Z;

    public /* synthetic */ C3227b(Object obj, int i10) {
        this.f9793Y = i10;
        this.f9794Z = obj;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        View view;
        LinkedHashMap linkedHashMap;
        Set<String> setKeySet;
        switch (this.f9793Y) {
            case 0:
                if (enumC11103l != EnumC11103l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC11112u.mo7809i().mo7808c(this);
                InterfaceC3232g interfaceC3232g = (InterfaceC3232g) this.f9794Z;
                Bundle bundleM4122c = interfaceC3232g.mo4127h().m4122c("androidx.savedstate.Restarter");
                if (bundleM4122c == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM4122c.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C3227b.class.getClassLoader()).asSubclass(InterfaceC3229d.class);
                        AbstractC16544l.m18093f(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC16544l.m18093f(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(interfaceC3232g instanceof ViewModelStoreOwner)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                ViewModelStore viewModelStoreMo10152e = ((ViewModelStoreOwner) interfaceC3232g).mo10152e();
                                C3231f c3231fMo4127h = interfaceC3232g.mo4127h();
                                viewModelStoreMo10152e.getClass();
                                LinkedHashMap linkedHashMap2 = viewModelStoreMo10152e.f33445a;
                                for (String key : new HashSet(linkedHashMap2.keySet())) {
                                    AbstractC16544l.m18094g(key, "key");
                                    ViewModel viewModel = (ViewModel) linkedHashMap2.get(key);
                                    AbstractC16544l.m18091d(viewModel);
                                    AbstractC8210v0.m8836c(viewModel, c3231fMo4127h, interfaceC3232g.mo7809i());
                                }
                                if (!new HashSet(linkedHashMap2.keySet()).isEmpty()) {
                                    c3231fMo4127h.m4126g();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(AbstractC9306j0.m9889h("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(AbstractC10763a.m11054l("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                if (enumC11103l != EnumC11103l.ON_STOP || (view = ((AbstractComponentCallbacksC11000a) this.f9794Z).f33135Q0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                new HashMap();
                InterfaceC11099h[] interfaceC11099hArr = (InterfaceC11099h[]) this.f9794Z;
                if (interfaceC11099hArr.length > 0) {
                    InterfaceC11099h interfaceC11099h = interfaceC11099hArr[0];
                    throw null;
                }
                if (interfaceC11099hArr.length <= 0) {
                    return;
                }
                InterfaceC11099h interfaceC11099h2 = interfaceC11099hArr[0];
                throw null;
            case 3:
                if (enumC11103l != EnumC11103l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC11103l).toString());
                }
                interfaceC11112u.mo7809i().mo7808c(this);
                ((C11087W) this.f9794Z).m12149b();
                return;
            case 4:
                AbstractActivityC10817a abstractActivityC10817a = (AbstractActivityC10817a) this.f9794Z;
                if (abstractActivityC10817a.f32065q0 == null) {
                    C14225g c14225g = (C14225g) abstractActivityC10817a.getLastNonConfigurationInstance();
                    if (c14225g != null) {
                        abstractActivityC10817a.f32065q0 = c14225g.f44665a;
                    }
                    if (abstractActivityC10817a.f32065q0 == null) {
                        abstractActivityC10817a.f32065q0 = new ViewModelStore();
                    }
                }
                abstractActivityC10817a.f55801Y.mo7808c(this);
                return;
            default:
                if (enumC11103l != EnumC11103l.ON_CREATE) {
                    throw new IllegalStateException(AbstractC16544l.m18100m(enumC11103l, "Expected to receive ON_CREATE event before anything else, but got ").toString());
                }
                C14522e c14522e = (C14522e) this.f9794Z;
                if (((LinkedHashMap) c14522e.f45761Y) != null) {
                    throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
                }
                interfaceC11112u.mo7809i().mo7808c(this);
                InterfaceC3232g interfaceC3232g2 = (InterfaceC3232g) c14522e.f45763o0;
                AbstractC16544l.m18091d(interfaceC3232g2);
                C3231f c3231fMo4127h2 = interfaceC3232g2.mo4127h();
                String str2 = (String) c14522e.f45764p0;
                AbstractC16544l.m18091d(str2);
                Bundle bundleM4122c2 = c3231fMo4127h2.m4122c(str2);
                if (((LinkedHashMap) c14522e.f45761Y) != null) {
                    throw new IllegalStateException("Expected performRestore to be called only once.");
                }
                c14522e.f45761Y = new LinkedHashMap();
                if (bundleM4122c2 != null && (setKeySet = bundleM4122c2.keySet()) != null) {
                    for (String str3 : setKeySet) {
                        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c14522e.f45761Y;
                        AbstractC16544l.m18091d(linkedHashMap3);
                        Bundle bundle = bundleM4122c2.getBundle(str3);
                        AbstractC16544l.m18091d(bundle);
                        linkedHashMap3.put(str3, bundle);
                    }
                }
                for (C14518a c14518a : ((LinkedHashMap) c14522e.f45762Z).values()) {
                    if (c14518a.f45752Z.mo7809i().mo7807b() == EnumC11104m.f33475Z && (linkedHashMap = (LinkedHashMap) c14522e.f45761Y) != null) {
                        c14518a.f45753o0.m349s((Bundle) linkedHashMap.remove(c14518a.f45751Y));
                    }
                }
                return;
        }
    }
}
