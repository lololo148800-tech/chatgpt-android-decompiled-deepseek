package p226In;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p221Ii.RunnableC3724c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: In.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3779a extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C3779a f11418Y = new C3779a(3, C3780b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3780b c3780b = (C3780b) obj;
        InterfaceC3786h interfaceC3786h = (InterfaceC3786h) obj2;
        long j10 = c3780b.f11419a;
        C17296C c17296c = C17296C.f55119a;
        if (j10 <= 0) {
            ((C3785g) interfaceC3786h).f11441q0 = c17296c;
        } else {
            RunnableC3724c runnableC3724c = new RunnableC3724c(interfaceC3786h, 1, c3780b);
            AbstractC16544l.m18092e(interfaceC3786h, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C3785g c3785g = (C3785g) interfaceC3786h;
            InterfaceC18776i interfaceC18776i = c3785g.f11437Y;
            c3785g.f11439o0 = AbstractC0575H.m1190s(interfaceC18776i).mo1199S(j10, runnableC3724c, interfaceC18776i);
        }
        return c17296c;
    }
}
