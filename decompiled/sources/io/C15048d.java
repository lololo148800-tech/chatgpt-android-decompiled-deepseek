package io;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p153Fn.C2925c;
import p571X9.AbstractC9233X;
import p937p1.InterfaceC18285a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: io.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C15048d extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ float f46772Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2925c f46773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15105o f46774o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC18285a f46775p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15048d(C2925c c2925c, C15105o c15105o, InterfaceC18285a interfaceC18285a, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f46773Z = c2925c;
        this.f46774o0 = c15105o;
        this.f46775p0 = interfaceC18285a;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C15048d c15048d = new C15048d(this.f46773Z, this.f46774o0, this.f46775p0, (InterfaceC18770c) obj3);
        c15048d.f46772Y = fFloatValue;
        C17296C c17296c = C17296C.f55119a;
        c15048d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC0575H.m1156D(this.f46773Z, null, null, new C15047c(this.f46774o0, this.f46772Y, this.f46775p0, null), 3);
        return C17296C.f55119a;
    }
}
