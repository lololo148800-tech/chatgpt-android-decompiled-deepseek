package p1013t0;

import io.sentry.android.replay.capture.C15272c;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21678Y;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: t0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19720h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f62427Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19721i f62428Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC21678Y f62429o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC16546n f62430p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15272c f62431q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19720h(C19721i c19721i, AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a, C15272c c15272c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62428Z = c19721i;
        this.f62429o0 = abstractC21678Y;
        this.f62430p0 = (AbstractC16546n) interfaceC1426a;
        this.f62431q0 = c15272c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ?? r6 = this.f62430p0;
        C15272c c15272c = this.f62431q0;
        C19720h c19720h = new C19720h(this.f62428Z, this.f62429o0, r6, c15272c, interfaceC18770c);
        c19720h.f62427Y = obj;
        return c19720h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19720h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f62427Y;
        AbstractC21678Y abstractC21678Y = this.f62429o0;
        ?? r6 = this.f62430p0;
        C19721i c19721i = this.f62428Z;
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19718f(c19721i, abstractC21678Y, r6, null), 3);
        return AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19719g(c19721i, this.f62431q0, null), 3);
    }
}
