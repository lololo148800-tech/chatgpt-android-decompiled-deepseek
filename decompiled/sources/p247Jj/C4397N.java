package p247Jj;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.InterfaceC17306i;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Jj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4397N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4399O f14283Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f14284Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4397N(C4399O c4399o, InterfaceC17306i interfaceC17306i) {
        super(0);
        this.f14283Y = c4399o;
        this.f14284Z = interfaceC17306i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ViewModelProvider.Factory factoryMo10149b;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f14284Z.getValue();
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
        if (hasDefaultViewModelProviderFactory != null && (factoryMo10149b = hasDefaultViewModelProviderFactory.mo10149b()) != null) {
            return factoryMo10149b;
        }
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f14283Y.mo10149b();
        AbstractC16544l.m18093f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
