package p789hg;

import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2215x0;
import p553Wh.C8870f;
import p571X9.AbstractC9233X;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: hg.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C14510i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45731Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyPhoneViewModel f45732Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f45733o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC13515g f45734p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13522n f45735q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14510i(VerifyPhoneViewModel verifyPhoneViewModel, C8870f c8870f, InterfaceC13515g interfaceC13515g, C13522n c13522n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45732Z = verifyPhoneViewModel;
        this.f45733o0 = c8870f;
        this.f45734p0 = interfaceC13515g;
        this.f45735q0 = c13522n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14510i(this.f45732Z, this.f45733o0, this.f45734p0, this.f45735q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14510i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45731Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2215x0 c2215x0 = this.f45732Z.f40347g;
            C14509h c14509h = new C14509h(this.f45733o0, this.f45734p0, this.f45735q0, null);
            this.f45731Y = 1;
            if (AbstractC2124C.m3212k(c2215x0, c14509h, this) == enumC19250a) {
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
