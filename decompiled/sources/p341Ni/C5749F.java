package p341Ni;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p387Pl.EnumC6481b;
import p571X9.AbstractC9233X;
import p858ko.C16482A;
import p873lh.C16961l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5749F extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18707Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18708Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5784h0 f18709o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5749F(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18709o0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5749F c5749f = new C5749F(this.f18709o0, interfaceC18770c);
        c5749f.f18708Z = obj;
        return c5749f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5749F) create((EnumC6481b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18707Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC6481b enumC6481b = (EnumC6481b) this.f18708Z;
            C16961l c16961l = this.f18709o0.f18853e;
            this.f18707Y = 1;
            c16961l.getClass();
            Object objM21029b = c16961l.f54438Z.m21029b(new C16482A(enumC6481b, 7), this);
            if (objM21029b != enumC19250a) {
                objM21029b = c17296c;
            }
            if (objM21029b == enumC19250a) {
                return enumC19250a;
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
