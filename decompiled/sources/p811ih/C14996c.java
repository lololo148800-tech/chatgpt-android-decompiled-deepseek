package p811ih;

import gd.AbstractC13881O1;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p1155zi.EnumC22026l;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ih.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14996c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f46677Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15000g f46678Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC22026l f46679o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC13881O1 f46680p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14996c(C15000g c15000g, EnumC22026l enumC22026l, AbstractC13881O1 abstractC13881O1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f46678Z = c15000g;
        this.f46679o0 = enumC22026l;
        this.f46680p0 = abstractC13881O1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14996c(this.f46678Z, this.f46679o0, this.f46680p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14996c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f46677Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2207t0 c2207t0M16134a = this.f46678Z.m16134a(this.f46679o0, this.f46680p0);
            this.f46677Y = 1;
            obj = AbstractC2124C.m3221t(c2207t0M16134a, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
