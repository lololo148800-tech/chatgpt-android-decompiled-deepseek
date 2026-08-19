package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5973Q0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19438Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19439Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18776i f19440o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC2184i f19441p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5973Q0(InterfaceC18776i interfaceC18776i, InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19440o0 = interfaceC18776i;
        this.f19441p0 = interfaceC2184i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5973Q0 c5973q0 = new C5973Q0(this.f19440o0, this.f19441p0, interfaceC18770c);
        c5973q0.f19439Z = obj;
        return c5973q0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5973Q0) create((C6010j0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19438Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6010j0 c6010j0 = (C6010j0) this.f19439Z;
            C18777j c18777j = C18777j.f59682Y;
            InterfaceC18776i interfaceC18776i = this.f19440o0;
            boolean zM18089b = AbstractC16544l.m18089b(interfaceC18776i, c18777j);
            InterfaceC2184i interfaceC2184i = this.f19441p0;
            if (zM18089b) {
                C5969O0 c5969o0 = new C5969O0(c6010j0, 0);
                this.f19438Y = 1;
                if (interfaceC2184i.mo3141d(c5969o0, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C5971P0 c5971p0 = new C5971P0(interfaceC2184i, c6010j0, null);
                this.f19438Y = 2;
                if (AbstractC0575H.m1168P(interfaceC18776i, c5971p0, this) == enumC19250a) {
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
