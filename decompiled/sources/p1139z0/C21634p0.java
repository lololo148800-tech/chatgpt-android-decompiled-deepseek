package p1139z0;

import mm.C17296C;
import p003A1.AbstractC0187M0;
import p003A1.C0275o0;
import p003A1.InterfaceC0161D1;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2211v0;
import p1071w0.AbstractC20734X;
import p1140z1.AbstractC21690f;
import p350O1.C6065n;
import p571X9.AbstractC9233X;
import p820j0.C16031b;
import p870le.C16863U;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21634p0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68534Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f68535Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21640s0 f68536o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16031b f68537p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21634p0(C21640s0 c21640s0, C16031b c16031b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68536o0 = c21640s0;
        this.f68537p0 = c16031b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21634p0 c21634p0 = new C21634p0(this.f68536o0, this.f68537p0, interfaceC18770c);
        c21634p0.f68535Z = obj;
        return c21634p0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21634p0) create((C0275o0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68534Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        C0275o0 c0275o0 = (C0275o0) this.f68535Z;
        C21640s0 c21640s0 = this.f68536o0;
        C21582E0 c21582e0 = c21640s0.f68550B0;
        C21574A0 c21574a0 = c21640s0.f68551C0;
        C6065n c6065nM21290c = c21640s0.f68562N0.m21290c(c21640s0.f68556H0);
        C21640s0 c21640s1 = this.f68536o0;
        C16863U c16863u = new C16863U(1, c21640s1, C21640s0.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0, 19);
        InterfaceC2211v0 interfaceC2211v0M21989R0 = c21640s1.m21989R0();
        InterfaceC0161D1 interfaceC0161D1 = (InterfaceC0161D1) AbstractC21690f.m22204i(c21640s0, AbstractC0187M0.f715q);
        this.f68534Y = 1;
        AbstractC21627m.m21974v(c0275o0, c21582e0, c21574a0, c6065nM21290c, this.f68537p0, c16863u, interfaceC2211v0M21989R0, interfaceC0161D1, this);
        return enumC19250a;
    }
}
