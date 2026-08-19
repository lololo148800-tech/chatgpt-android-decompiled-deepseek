package p925oe;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18111f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f57771Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18127p f57772Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f57773o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f57774p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18111f(String str, C18127p c18127p, InterfaceC18770c interfaceC18770c, boolean z6) {
        super(2, interfaceC18770c);
        this.f57772Z = c18127p;
        this.f57773o0 = str;
        this.f57774p0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        boolean z6 = this.f57774p0;
        return new C18111f(this.f57773o0, this.f57772Z, interfaceC18770c, z6);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18111f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f57771Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18129r c18129r = this.f57772Z.f57823f;
            C18109e c18109e = new C18109e(this.f57773o0, this.f57774p0, 0);
            this.f57771Y = 1;
            if (c18129r.m21029b(c18109e, this) == enumC19250a) {
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
