package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17306i;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p939p3.AbstractC18293c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lmm/i;", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC17306i {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3756d f33431Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC16546n f33432Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1426a f33433o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC16546n f33434p0;

    /* JADX INFO: renamed from: q0 */
    public ViewModel f33435q0;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(InterfaceC3756d viewModelClass, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3) {
        AbstractC16544l.m18094g(viewModelClass, "viewModelClass");
        this.f33431Y = viewModelClass;
        this.f33432Z = (AbstractC16546n) interfaceC1426a;
        this.f33433o0 = interfaceC1426a2;
        this.f33434p0 = (AbstractC16546n) interfaceC1426a3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // mm.InterfaceC17306i
    public final Object getValue() {
        ViewModel viewModel = this.f33435q0;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModelStore store = (ViewModelStore) this.f33432Z.invoke();
        ViewModelProvider.Factory factory = (ViewModelProvider.Factory) this.f33433o0.invoke();
        AbstractC18293c extras = (AbstractC18293c) this.f33434p0.invoke();
        ViewModelProvider.f33436b.getClass();
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(factory, "factory");
        AbstractC16544l.m18094g(extras, "extras");
        ViewModel viewModelM12144a = new ViewModelProvider(store, factory, extras).m12144a(this.f33431Y);
        this.f33435q0 = viewModelM12144a;
        return viewModelM12144a;
    }

    @Override // mm.InterfaceC17306i
    public final boolean isInitialized() {
        return this.f33435q0 != null;
    }
}
