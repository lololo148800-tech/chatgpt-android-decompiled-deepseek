package p566X4;

import java.util.ArrayList;
import java.util.List;
import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2172c;
import p103Dn.InterfaceC2184i;
import p344Nl.C5819A;
import p571X9.AbstractC9233X;
import p590Y4.AbstractC9647d;
import p590Y4.C9646c;
import p658b5.C11245p;
import p720e6.C13288c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: X4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9049g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27622Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13288c f27623Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11245p f27624o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC9047e f27625p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9049g(C13288c c13288c, C11245p c11245p, InterfaceC9047e interfaceC9047e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27623Z = c13288c;
        this.f27624o0 = c11245p;
        this.f27625p0 = interfaceC9047e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C9049g(this.f27623Z, this.f27624o0, this.f27625p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9049g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27622Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13288c c13288c = this.f27623Z;
            c13288c.getClass();
            C11245p c11245p = this.f27624o0;
            List list = (List) c13288c.f42001Y;
            ArrayList<AbstractC9647d> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((AbstractC9647d) obj2).mo10226b(c11245p)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            for (AbstractC9647d abstractC9647d : arrayList) {
                abstractC9647d.getClass();
                arrayList2.add(new C2172c(new C9646c(abstractC9647d, null), C18777j.f59682Y, -2, EnumC1733a.f4961Y));
            }
            InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C5819A((InterfaceC2184i[]) AbstractC17680n.m19322C0(arrayList2).toArray(new InterfaceC2184i[0]), 1));
            C0132i c0132i = new C0132i(this.f27625p0, 25, c11245p);
            this.f27622Y = 1;
            if (interfaceC2184iM3215n.mo3141d(c0132i, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
