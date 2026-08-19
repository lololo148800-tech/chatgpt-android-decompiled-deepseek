package p124Ei;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p387Pl.C6502v;
import p387Pl.EnumC6481b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2512h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f7811Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC6481b f7812Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2512h(EnumC6481b enumC6481b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7812Z = enumC6481b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2512h c2512h = new C2512h(this.f7812Z, interfaceC18770c);
        c2512h.f7811Y = obj;
        return c2512h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2512h) create((C6502v) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((C6502v) this.f7811Y).f21099c == this.f7812Z);
    }
}
