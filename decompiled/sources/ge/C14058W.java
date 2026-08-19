package ge;

import java.util.List;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1139z0.C21585H;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p403Qd.AbstractC6601G;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p588Y2.C9642z;
import p773h0.EnumC14284g0;
import p936p0.C18272l;
import p936p0.C18273m;
import p936p0.C18280t;
import p953q0.AbstractC18588k;
import p953q0.C18586j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C14058W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44194Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14111x0 f44195Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18280t f44196o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f44197p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5996c0 f44198q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14058W(C14111x0 c14111x0, C18280t c18280t, InterfaceC5985X interfaceC5985X, C5996c0 c5996c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44195Z = c14111x0;
        this.f44196o0 = c18280t;
        this.f44197p0 = interfaceC5985X;
        this.f44198q0 = c5996c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14058W(this.f44195Z, this.f44196o0, this.f44197p0, this.f44198q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14058W) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM19822i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44194Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14111x0 c14111x0 = this.f44195Z;
            List list = c14111x0.f44414j;
            if (list.isEmpty()) {
                return c17296c;
            }
            int size = list.size();
            EnumC14097q0 enumC14097q0 = c14111x0.f44436x;
            C14026F0 c14026f0 = new C14026F0(size, enumC14097q0);
            InterfaceC5985X interfaceC5985X = this.f44197p0;
            if (((C14026F0) interfaceC5985X.getValue()) == null) {
                interfaceC5985X.setValue(c14026f0);
            }
            boolean zEquals = c14026f0.equals((C14026F0) interfaceC5985X.getValue());
            int iOrdinal = enumC14097q0.ordinal();
            C18280t c18280t = this.f44196o0;
            Integer num = null;
            if (iOrdinal == 0) {
                C18273m c18273mM8913d = AbstractC8301I.m8913d(c18280t, ((AbstractC6601G) list.get(list.size() - 1)).mo7159a());
                if (c18273mM8913d == null || c18273mM8913d.f58319p + c18273mM8913d.f58320q != c18280t.m19824g().f58298l) {
                    num = new Integer(list.size());
                }
            } else if (iOrdinal == 1) {
                int size2 = list.size() - 1;
                C18273m c18273mM8913d2 = AbstractC8301I.m8913d(c18280t, ((AbstractC6601G) list.get(size2)).mo7159a());
                if ((c18273mM8913d2 != null ? c18273mM8913d2.f58319p : Integer.MAX_VALUE) >= this.f44198q0.m6412g() * 0.25f) {
                    num = new Integer(size2);
                }
            } else if (iOrdinal != 2) {
                throw new C0644w();
            }
            if (num != null) {
                int iIntValue = num.intValue();
                boolean z6 = !zEquals;
                this.f44194Y = 1;
                if (z6) {
                    C21585H c21585h = C18280t.f58344x;
                    InterfaceC7537b interfaceC7537b = ((C18272l) c18280t.f58350f.getValue()).f58294h;
                    float f10 = AbstractC18588k.f59225a;
                    C9642z c9642z = c18280t.f58349e;
                    objM19822i = ((C18280t) c9642z.f29064Z).mo5256b(EnumC14284g0.f44821Y, new C18586j(iIntValue, interfaceC7537b, c9642z, 0, null), this);
                    if (objM19822i != enumC19250a) {
                        objM19822i = c17296c;
                    }
                    if (objM19822i != enumC19250a) {
                        objM19822i = c17296c;
                    }
                    if (objM19822i != enumC19250a) {
                        objM19822i = c17296c;
                    }
                    if (objM19822i != enumC19250a) {
                        objM19822i = c17296c;
                    }
                } else if (!zEquals || (objM19822i = C18280t.m19822i(c18280t, iIntValue, this)) != enumC19250a) {
                    objM19822i = c17296c;
                }
                if (objM19822i == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
