package p956q3;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: q3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18621a implements AutoCloseable, InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f59313Y;

    public C18621a(InterfaceC18776i coroutineContext) {
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        this.f59313Y = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC0575H.m1181j(this.f59313Y, null);
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f59313Y;
    }
}
