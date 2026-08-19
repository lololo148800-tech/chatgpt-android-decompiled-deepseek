package p773h0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p860l0.C16685J0;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14277d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public boolean f44786Y;

    /* JADX INFO: renamed from: Z */
    public int f44787Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f44788o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16685J0 f44789p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f44790q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17406l f44791r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC14289j f44792s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14277d(C16685J0 c16685j0, long j10, InterfaceC17406l interfaceC17406l, AbstractC14289j abstractC14289j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44789p0 = c16685j0;
        this.f44790q0 = j10;
        this.f44791r0 = interfaceC17406l;
        this.f44792s0 = abstractC14289j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14277d c14277d = new C14277d(this.f44789p0, this.f44790q0, this.f44791r0, this.f44792s0, interfaceC18770c);
        c14277d.f44788o0 = obj;
        return c14277d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14277d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0627n0 interfaceC0627n0M1156D;
        Object objM18503c;
        boolean z6;
        C17409o c17409o;
        C17410p c17410p;
        C17410p c17410p2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44787Z;
        AbstractC14289j abstractC14289j = this.f44792s0;
        InterfaceC17406l interfaceC17406l = this.f44791r0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0627n0M1156D = (InterfaceC0627n0) this.f44788o0;
                AbstractC9233X.m9807c(obj);
                objM18503c = obj;
            } else if (i10 == 2) {
                z6 = this.f44786Y;
                AbstractC9233X.m9807c(obj);
                if (z6) {
                    c17409o = new C17409o(this.f44790q0);
                    c17410p = new C17410p(c17409o);
                    this.f44788o0 = c17410p;
                    this.f44787Z = 3;
                    if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c17410p2 = c17410p;
                    this.f44788o0 = null;
                    this.f44787Z = 4;
                    if (interfaceC17406l.mo7769c(c17410p2, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else if (i10 == 3) {
                c17410p2 = (C17410p) this.f44788o0;
                AbstractC9233X.m9807c(obj);
                this.f44788o0 = null;
                this.f44787Z = 4;
                if (interfaceC17406l.mo7769c(c17410p2, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            abstractC14289j.f44850L0 = null;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC0627n0M1156D = AbstractC0575H.m1156D((InterfaceC0571F) this.f44788o0, null, null, new C14275c(this.f44792s0, this.f44790q0, this.f44791r0, null), 3);
        this.f44788o0 = interfaceC0627n0M1156D;
        this.f44787Z = 1;
        objM18503c = this.f44789p0.m18503c(this);
        if (objM18503c == enumC19250a) {
            return enumC19250a;
        }
        boolean zBooleanValue = ((Boolean) objM18503c).booleanValue();
        if (interfaceC0627n0M1156D.mo1274a()) {
            this.f44788o0 = null;
            this.f44786Y = zBooleanValue;
            this.f44787Z = 2;
            if (AbstractC0575H.m1182k(interfaceC0627n0M1156D, this) == enumC19250a) {
                return enumC19250a;
            }
            z6 = zBooleanValue;
            if (z6) {
                c17409o = new C17409o(this.f44790q0);
                c17410p = new C17410p(c17409o);
                this.f44788o0 = c17410p;
                this.f44787Z = 3;
                if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
                    return enumC19250a;
                }
                c17410p2 = c17410p;
                this.f44788o0 = null;
                this.f44787Z = 4;
                if (interfaceC17406l.mo7769c(c17410p2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            C17409o c17409o2 = abstractC14289j.f44850L0;
            if (c17409o2 != null) {
                InterfaceC17405k c17410p3 = zBooleanValue ? new C17410p(c17409o2) : new C17408n(c17409o2);
                this.f44788o0 = null;
                this.f44787Z = 5;
                if (interfaceC17406l.mo7769c(c17410p3, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        abstractC14289j.f44850L0 = null;
        return C17296C.f55119a;
    }
}
