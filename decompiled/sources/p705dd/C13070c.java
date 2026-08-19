package p705dd;

import af.C10564U;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9212T2;
import p571X9.AbstractC9233X;
import p620Zc.InterfaceC10277b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13070c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41518Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41519Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f41520o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f41521p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10277b f41522q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13070c(boolean z6, boolean z10, InterfaceC10277b interfaceC10277b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41520o0 = z6;
        this.f41521p0 = z10;
        this.f41522q0 = interfaceC10277b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13070c c13070c = new C13070c(this.f41520o0, this.f41521p0, this.f41522q0, interfaceC18770c);
        c13070c.f41519Z = obj;
        return c13070c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13070c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41518Y;
        InterfaceC10277b interfaceC10277b = this.f41522q0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f41519Z;
            if (!this.f41520o0 || this.f41521p0) {
                return C17296C.f55119a;
            }
            AbstractC9212T2.m9779c(interfaceC0571F, new C10564U(interfaceC10277b, 16));
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        do {
            interfaceC10277b.mo10871a();
            this.f41518Y = 1;
        } while (AbstractC0575H.m1184m(2000L, this) != enumC19250a);
        return enumC19250a;
    }
}
