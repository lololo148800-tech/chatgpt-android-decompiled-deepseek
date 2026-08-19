package p153Fn;

import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Fn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2925c implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f8769Y;

    public C2925c(InterfaceC18776i interfaceC18776i) {
        this.f8769Y = interfaceC18776i;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f8769Y;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f8769Y + ')';
    }
}
