package p787he;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p216Id.C3696d;
import p216Id.C3700h;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C14494w extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f45675Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45676Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6636i f45677o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14494w(C14459O c14459o, C6636i c6636i, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f45676Z = c14459o;
        this.f45677o0 = c6636i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C14494w(this.f45676Z, this.f45677o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C14494w) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45675Y;
        C14459O c14459o = this.f45676Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18077B c18077b = c14459o.f45503b;
            this.f45675Y = 1;
            String str = this.f45677o0.f21380b;
            obj = str == null ? new C21952P1(C17296C.f55119a) : c18077b.m19698c(str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(wNrQXvwLiB.fywCzEaaQ);
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C2153Q0 c2153q0 = c14459o.f45522u;
        if (z6) {
            C3700h c3700h = new C3700h(false);
            c2153q0.getClass();
            c2153q0.m3251l(null, c3700h);
        }
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            C3696d c3696d = new C3696d((AbstractC21933K1) abstractC21955Q1);
            c2153q0.getClass();
            c2153q0.m3251l(null, c3696d);
        }
        return abstractC21955Q1;
    }
}
