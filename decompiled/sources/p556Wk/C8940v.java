package p556Wk;

import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C8940v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f27335Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f27336Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8940v(boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27336Z = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8940v c8940v = new C8940v(this.f27336Z, interfaceC18770c);
        c8940v.f27335Y = obj;
        return c8940v;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8940v c8940v = (C8940v) create((C13693c) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8940v.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19675j c19675j = ((C13693c) this.f27335Y).f43200f;
        C19666a c19666a = AbstractC8887A.f27206c;
        final boolean z6 = this.f27336Z;
        c19675j.m20647a(c19666a, new InterfaceC1426a() { // from class: Wk.u
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                return Boolean.valueOf(z6);
            }
        });
        return C17296C.f55119a;
    }
}
