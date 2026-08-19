package p946pc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C5994b0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pc.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C18350p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5994b0 f58589Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18350p(C5994b0 c5994b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58589Y = c5994b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18350p(this.f58589Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18350p c18350p = (C18350p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18350p.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f58589Y.m6410h(1.0f);
        return C17296C.f55119a;
    }
}
