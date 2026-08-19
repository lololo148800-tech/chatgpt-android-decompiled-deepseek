package p321Mk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1030u1.C20097d;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p860l0.AbstractC16750j0;
import p860l0.C16725b;
import p860l0.C16726b0;
import p860l0.C16738f0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5469g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17862Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f17863Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC5477o f17864o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19723A f17865p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11238i f17866q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C20097d f17867r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5469g(EnumC5477o enumC5477o, C19723A c19723a, C11238i c11238i, C20097d c20097d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17864o0 = enumC5477o;
        this.f17865p0 = c19723a;
        this.f17866q0 = c11238i;
        this.f17867r0 = c20097d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5469g c5469g = new C5469g(this.f17864o0, this.f17865p0, this.f17866q0, this.f17867r0, interfaceC18770c);
        c5469g.f17863Z = obj;
        return c5469g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5469g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17862Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f17863Z;
            EnumC5477o enumC5477o = this.f17864o0;
            int iOrdinal = enumC5477o.ordinal();
            C20097d c20097d = this.f17867r0;
            C11238i c11238i = this.f17866q0;
            if (iOrdinal != 0) {
                C19723A c19723a = this.f17865p0;
                if (iOrdinal == 1) {
                    C5467e c5467e = new C5467e(c11238i, c20097d, enumC5477o, interfaceC0571F, 1);
                    C5468f c5468f = new C5468f(c11238i, c20097d, interfaceC0571F, 1);
                    this.f17862Y = 2;
                    if (AbstractC16750j0.m18525i(c19723a, c5467e, c5468f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (iOrdinal == 2) {
                    C5467e c5467e2 = new C5467e(c11238i, c20097d, enumC5477o, interfaceC0571F, 2);
                    C5468f c5468f2 = new C5468f(c11238i, c20097d, interfaceC0571F, 2);
                    this.f17862Y = 3;
                    float f10 = AbstractC16750j0.f53729a;
                    Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16738f0(C16725b.f53600s0, c5468f2, c5467e2, C16726b0.f53608q0, null), this);
                    if (objM9428b != enumC19250a) {
                        objM9428b = c17296c;
                    }
                    if (objM9428b == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                C5467e c5467e3 = new C5467e(c11238i, c20097d, enumC5477o, interfaceC0571F, 0);
                C5468f c5468f3 = new C5468f(c11238i, c20097d, interfaceC0571F, 0);
                this.f17862Y = 1;
                if (AbstractC16750j0.m18524h(this.f17865p0, null, c5467e3, c5468f3, this, 5) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
