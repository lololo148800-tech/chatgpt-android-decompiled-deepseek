package p582Xk;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0571F;
import p556Wk.InterfaceC8921e0;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Xk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9531h implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC8921e0 f28682Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f28683Z;

    public C9531h(InterfaceC8921e0 httpSendSender, InterfaceC18776i coroutineContext) {
        AbstractC16544l.m18094g(httpSendSender, "httpSendSender");
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        this.f28682Y = httpSendSender;
        this.f28683Z = coroutineContext;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f28683Z;
    }
}
