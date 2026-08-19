package p1114xp;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C21341l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21346q f67792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21332c f67793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21341l(C21346q c21346q, C21332c c21332c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67792Y = c21346q;
        this.f67793Z = c21332c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21341l(this.f67792Y, this.f67793Z, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21341l c21341l = (C21341l) create(obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21341l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f67792Y.f67807a.add(this.f67793Z);
        return C17296C.f55119a;
    }
}
