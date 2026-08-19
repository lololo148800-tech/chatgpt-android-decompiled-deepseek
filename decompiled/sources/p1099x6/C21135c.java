package p1099x6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21135c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67154Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f67155Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21135c(C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67155Z = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21135c c21135c = new C21135c(this.f67155Z, interfaceC18770c);
        c21135c.f67154Y = obj;
        return c21135c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21135c c21135c = (C21135c) create((C17853f) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21135c.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17853f c17853f = (C17853f) this.f67154Y;
        this.f67155Z.f51262Y = c17853f.f56935e;
        return C17296C.f55119a;
    }
}
