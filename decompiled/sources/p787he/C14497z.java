package p787he;

import java.util.List;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p403Qd.C6636i;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C14497z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45693Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45694Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45695o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Integer f45696p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f45697q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14497z(C14459O c14459o, Integer num, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45695o0 = c14459o;
        this.f45696p0 = num;
        this.f45697q0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14497z c14497z = new C14497z(this.f45695o0, this.f45696p0, this.f45697q0, interfaceC18770c);
        c14497z.f45694Z = obj;
        return c14497z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14497z) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C18077B c18077b;
        AbstractC21955Q1 abstractC21955Q1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45693Y;
        if (i10 != 0) {
            if (i10 == 1) {
                c18077b = (C18077B) this.f45694Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                ((C22011h0) ((C21952P1) abstractC21955Q1).f69511a).getClass();
                return new C21952P1(C17296C.f55119a);
            }
            if ((abstractC21955Q1 instanceof C21929J1) && !(abstractC21955Q1 instanceof AbstractC21933K1)) {
                throw new C0644w();
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(obj);
        C6636i c6636i = (C6636i) this.f45694Z;
        C14459O c14459o = this.f45695o0;
        C18077B c18077b2 = c14459o.f45503b;
        C14473b0 c14473b0 = c14459o.f45512k;
        this.f45694Z = c18077b2;
        this.f45693Y = 1;
        obj = c14473b0.m15994a(c6636i, this.f45696p0, this.f45697q0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c18077b = c18077b2;
        this.f45694Z = null;
        this.f45693Y = 2;
        obj = AbstractC8040Z5.m8412h(c18077b, (C6636i) obj, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            ((C22011h0) ((C21952P1) abstractC21955Q1).f69511a).getClass();
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC21955Q1 instanceof C21929J1) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }
}
