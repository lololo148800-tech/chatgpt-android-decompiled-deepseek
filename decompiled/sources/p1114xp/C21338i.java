package p1114xp;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C21338i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16525B f67781Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21330a f67782Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21332c f67783o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21338i(C16525B c16525b, InterfaceC21330a interfaceC21330a, C21332c c21332c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67781Y = c16525b;
        this.f67782Z = interfaceC21330a;
        this.f67783o0 = c21332c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21338i(this.f67781Y, this.f67782Z, this.f67783o0, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21338i c21338i = (C21338i) create(obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21338i.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C16525B c16525b = this.f67781Y;
        InterfaceC21331b interfaceC21331bMo8905a = this.f67782Z.mo8905a((InterfaceC21331b) c16525b.f51262Y);
        c16525b.f51262Y = interfaceC21331bMo8905a;
        C21332c c21332c = this.f67783o0;
        c21332c.getClass();
        c21332c.f67763a = interfaceC21331bMo8905a;
        return C17296C.f55119a;
    }
}
