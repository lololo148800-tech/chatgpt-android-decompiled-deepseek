package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: androidx.lifecycle.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11107p implements InterfaceC11110s, InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11105n f33483Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f33484Z;

    public C11107p(AbstractC11105n lifecycle, InterfaceC18776i coroutineContext) {
        AbstractC16544l.m18094g(lifecycle, "lifecycle");
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        this.f33483Y = lifecycle;
        this.f33484Z = coroutineContext;
        if (lifecycle.mo7807b() == EnumC11104m.f33474Y) {
            AbstractC0575H.m1181j(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        AbstractC11105n abstractC11105n = this.f33483Y;
        if (abstractC11105n.mo7807b().compareTo(EnumC11104m.f33474Y) <= 0) {
            abstractC11105n.mo7808c(this);
            AbstractC0575H.m1181j(this.f33484Z, null);
        }
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f33484Z;
    }
}
