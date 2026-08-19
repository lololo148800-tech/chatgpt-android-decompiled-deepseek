package p787he;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1126yd.C21433O;
import p1126yd.C21440S;
import p1126yd.C21463c0;
import p1126yd.C21471f0;
import p1126yd.InterfaceC21409C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C14464U extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45556Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f45557Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14464U(C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45557Z = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14464U c14464u = new C14464U(this.f45557Z, interfaceC18770c);
        c14464u.f45556Y = obj;
        return c14464u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14464U c14464u = (C14464U) create((InterfaceC21409C) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14464u.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC21409C interfaceC21409C = (InterfaceC21409C) this.f45556Y;
        if (interfaceC21409C instanceof C21433O) {
            str = ((C21433O) interfaceC21409C).f68003a;
        } else if (interfaceC21409C instanceof C21440S) {
            str = ((C21440S) interfaceC21409C).f68008a;
        } else if (interfaceC21409C instanceof C21463c0) {
            str = ((C21463c0) interfaceC21409C).f68062a;
        } else {
            str = interfaceC21409C instanceof C21471f0 ? ((C21471f0) interfaceC21409C).f68068a : null;
        }
        C16525B c16525b = this.f45557Z;
        if (str == null) {
            str = (String) c16525b.f51262Y;
        }
        c16525b.f51262Y = str;
        return C17296C.f55119a;
    }
}
