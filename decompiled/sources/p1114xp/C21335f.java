package p1114xp;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17686t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C21335f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21346q f67771Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21335f(C21346q c21346q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67771Y = c21346q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21335f(this.f67771Y, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21335f c21335f = (C21335f) create(obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21335f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC17686t.m19393A(this.f67771Y.f67808b, C21334e.f67770Y);
        return C17296C.f55119a;
    }
}
