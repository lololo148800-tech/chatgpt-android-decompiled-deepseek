package com.openai.viewmodel;

import android.content.Context;
import android.gov.nist.core.Separators;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.openai.chatgpt.app.p681di.MultibindingViewModelFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.C17311n;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p138F8.vJO.vRJidSveZHcTw;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p571X9.AbstractC9233X;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p939p3.C18291a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"viewmodel_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ViewModelFactoryProviderKt {
    /* JADX INFO: renamed from: a */
    public static final BaseViewModel m14398a(InterfaceC3756d viewModelKlass, String str, ViewModelStoreOwner viewModelStoreOwner, List localComponents) {
        AbstractC16544l.m18094g(viewModelKlass, "viewModelKlass");
        AbstractC16544l.m18094g(localComponents, "localComponents");
        List list = localComponents;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ViewModelFactoryProvider) {
                arrayList.add(obj);
            }
        }
        ArrayList<ViewModelFactory> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((ViewModelFactoryProvider) it.next()).mo3168h(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        for (ViewModelFactory viewModelFactory : arrayList2) {
            arrayList3.add(new C17309l(viewModelFactory, (ScreenViewModel) m14400c(AbstractC16526C.f51263a.mo5693b(ScreenViewModel.class), viewModelStoreOwner, ((MultibindingViewModelFactory) viewModelFactory).f37239a, String.valueOf(System.identityHashCode(viewModelFactory)))));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((ScreenViewModel) ((C17309l) obj2).f55137Z).f40366b.containsKey(AbstractC8138m0.m8667b(viewModelKlass))) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            C17309l c17309l = (C17309l) AbstractC17680n.m19351a0(arrayList4);
            ViewModelFactory viewModelFactory2 = (ViewModelFactory) c17309l.f55136Y;
            final ScreenViewModel screenViewModel = (ScreenViewModel) c17309l.f55137Z;
            ((MultibindingViewModelFactory) viewModelFactory2).getClass();
            AbstractC16544l.m18094g(screenViewModel, "screenViewModel");
            return (BaseViewModel) m14400c(viewModelKlass, viewModelStoreOwner, new AbstractSavedStateViewModelFactory() { // from class: com.openai.chatgpt.app.di.MultibindingViewModelFactory$viewModelFactory$1
                @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
                /* JADX INFO: renamed from: e */
                public final ViewModel mo12114e(String str2, Class cls, C11082S c11082s) {
                    InterfaceC17068a interfaceC17068a = (InterfaceC17068a) screenViewModel.f40366b.get(cls);
                    ViewModel viewModel = interfaceC17068a != null ? (ViewModel) interfaceC17068a.get() : null;
                    if (viewModel != null) {
                        return viewModel;
                    }
                    throw new IllegalStateException(cls.getSimpleName().concat(" injection failed. Try rebuilding the app. Anvil fails silently generating multibinding entries, so check for other causes such as not exposing the necessary types required for injection to the app module.").toString());
                }
            }, str);
        }
        throw new IllegalStateException(("Unable to find factory for " + viewModelKlass.mo4447a() + ". Components were " + AbstractC17680n.m19349Y(list, null, null, null, 0, null, ViewModelFactoryProviderKt$injectViewModelImpl$1.f40367Y, 31)).toString());
    }

    /* JADX INFO: renamed from: c */
    public static ViewModel m14400c(InterfaceC3756d interfaceC3756d, ViewModelStoreOwner viewModelStoreOwner, AbstractSavedStateViewModelFactory abstractSavedStateViewModelFactory, String key) {
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwner.mo10152e(), abstractSavedStateViewModelFactory, viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).mo10150c() : C18291a.f58387b);
        boolean z6 = key != null;
        if (z6) {
            Class clsM8667b = AbstractC8138m0.m8667b(interfaceC3756d);
            AbstractC16544l.m18094g(key, "key");
            return viewModelProvider.f33437a.m12164a(AbstractC8138m0.m8670e(clsM8667b), key);
        }
        if (z6) {
            throw new C0644w();
        }
        return viewModelProvider.m12144a(AbstractC8138m0.m8670e(AbstractC8138m0.m8667b(interfaceC3756d)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m14399b(InterfaceC3756d stateKlass, InterfaceC3756d viewModelKlass, Context context, InterfaceC2062k interfaceC2062k) {
        Object obj;
        Object objM9806b;
        AbstractC16544l.m18094g(stateKlass, "stateKlass");
        AbstractC16544l.m18094g(viewModelKlass, "viewModelKlass");
        AbstractC16544l.m18094g(context, vRJidSveZHcTw.riNwmCO);
        if (interfaceC2062k == null) {
            Constructor<?>[] constructors = AbstractC8138m0.m8667b(stateKlass).getConstructors();
            AbstractC16544l.m18093f(constructors, "getConstructors(...)");
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                obj = null;
                if (i10 >= length) {
                    break;
                }
                try {
                    objM9806b = constructors[i10].newInstance(null);
                    AbstractC16544l.m18092e(objM9806b, "null cannot be cast to non-null type T of com.openai.viewmodel.ViewModelFactoryProviderKt.tryToInstantiate");
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                obj = objM9806b instanceof C17311n ? null : objM9806b;
                if (obj != null) {
                    break;
                } else {
                    i10++;
                }
            }
            interfaceC2062k = (InterfaceC2062k) obj;
            if (interfaceC2062k == null) {
                throw new IllegalStateException(("No state provided for " + stateKlass.mo4448c()).toString());
            }
        }
        throw new IllegalStateException(("Not implemented " + context + Separators.f31991SP + stateKlass + Separators.f31991SP + viewModelKlass + Separators.f31991SP + interfaceC2062k).toString());
    }
}
