package p787he;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p041Be.C1214G;
import p041Be.C1219L;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C14465V extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45558Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14467X f45559Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f45560o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14465V(C14467X c14467x, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45559Z = c14467x;
        this.f45560o0 = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14465V(this.f45559Z, this.f45560o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14465V) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45558Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1219L c1219l = this.f45559Z.f45566b;
            String str = (String) this.f45560o0.f51262Y;
            if (str == null) {
                return c17296c;
            }
            this.f45558Y = 1;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C1214G c1214g = new C1214G(str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            if (AbstractC9144I.m9690b(c1219l.f3217b, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1214g, this) == enumC19250a) {
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
