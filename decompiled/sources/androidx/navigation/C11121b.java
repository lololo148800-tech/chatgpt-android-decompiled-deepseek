package androidx.navigation;

import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1143z4.C21778h;
import p183H4.C3231f;
import p523V9.AbstractC8138m0;

/* JADX INFO: renamed from: androidx.navigation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11121b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21778h f33523Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11121b(C21778h c21778h) {
        super(0);
        this.f33523Y = c21778h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C21778h c21778h = this.f33523Y;
        if (!c21778h.f69082v0) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (c21778h.f69080t0.f33504d == EnumC11104m.f33474Y) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
        C11120a c11120a = new C11120a();
        c11120a.f33352a = (C3231f) c21778h.f69081u0.f405p0;
        c11120a.f33353b = c21778h.f69080t0;
        return ((NavBackStackEntry$SavedStateViewModel) new ViewModelProvider(c21778h, c11120a).m12144a(AbstractC8138m0.m8670e(NavBackStackEntry$SavedStateViewModel.class))).f33519b;
    }
}
