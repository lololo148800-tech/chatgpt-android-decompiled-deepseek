package ke;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ke.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16375c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f50857Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16382j f50858Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16375c(C16382j c16382j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50858Z = c16382j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16375c c16375c = new C16375c(this.f50858Z, interfaceC18770c);
        c16375c.f50857Y = obj;
        return c16375c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16375c c16375c = (C16375c) create((AbstractC21955Q1) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16375c.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) this.f50857Y;
        if (abstractC21955Q1 instanceof C21952P1) {
            C20263a0 c20263a0 = (C20263a0) ((C21952P1) abstractC21955Q1).f69511a;
            C2153Q0 c2153q0 = this.f50858Z.f50875b;
            do {
                value = c2153q0.getValue();
            } while (!c2153q0.m3250k(value, C20908a.m21452a((C20908a) value, c20263a0, null, null, false, 30)));
        }
        return C17296C.f55119a;
    }
}
