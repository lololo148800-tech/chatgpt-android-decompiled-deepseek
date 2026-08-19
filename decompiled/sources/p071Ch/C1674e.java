package p071Ch;

import mm.C17296C;
import p017Af.C0491v;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1674e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4746Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1676g f4747Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f4748o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674e(C1676g c1676g, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4747Z = c1676g;
        this.f4748o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1674e(this.f4747Z, this.f4748o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1674e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4746Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1678i c1678i = this.f4747Z.f4752b;
            C0491v c0491v = new C0491v(this.f4748o0, 11);
            this.f4746Y = 1;
            if (c1678i.m21029b(c0491v, this) == enumC19250a) {
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
