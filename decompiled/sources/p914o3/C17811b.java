package p914o3;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p349O0.C5969O0;
import p349O0.C6010j0;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: o3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17811b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56796Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC18776i f56797Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2184i f56798o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6010j0 f56799p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17811b(InterfaceC18776i interfaceC18776i, InterfaceC2184i interfaceC2184i, C6010j0 c6010j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56797Z = interfaceC18776i;
        this.f56798o0 = interfaceC2184i;
        this.f56799p0 = c6010j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17811b(this.f56797Z, this.f56798o0, this.f56799p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17811b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56796Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18777j c18777j = C18777j.f59682Y;
            InterfaceC18776i interfaceC18776i = this.f56797Z;
            boolean zM18089b = AbstractC16544l.m18089b(interfaceC18776i, c18777j);
            C6010j0 c6010j0 = this.f56799p0;
            InterfaceC2184i interfaceC2184i = this.f56798o0;
            if (zM18089b) {
                C5969O0 c5969o0 = new C5969O0(c6010j0, 2);
                this.f56796Y = 1;
                if (interfaceC2184i.mo3141d(c5969o0, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C17810a c17810a = new C17810a(interfaceC2184i, c6010j0, null);
                this.f56796Y = 2;
                if (AbstractC0575H.m1168P(interfaceC18776i, c17810a, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
