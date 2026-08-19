package ve;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ve.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20586j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65321Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20592p f65322Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20586j(C20592p c20592p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65322Z = c20592p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20586j(this.f65322Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20586j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC21955Q1 abstractC21955Q1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65321Y;
        C20592p c20592p = this.f65322Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8731f(c20592p.f65347q0, "Failed to fetch custom instructions", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C20577a c20577a = c20592p.f65344Z;
        this.f65321Y = 1;
        obj = AbstractC2124C.m3221t(c20577a.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        if (obj == null) {
            this.f65321Y = 2;
            obj = c20592p.m21189c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8731f(c20592p.f65347q0, "Failed to fetch custom instructions", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
            }
        }
        return C17296C.f55119a;
    }
}
