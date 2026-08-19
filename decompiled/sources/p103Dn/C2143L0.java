package p103Dn;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.L0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2143L0 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f6563Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ InterfaceC2186j f6564Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ int f6565o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2147N0 f6566p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143L0(C2147N0 c2147n0, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f6566p0 = c2147n0;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C2143L0 c2143l0 = new C2143L0(this.f6566p0, (InterfaceC18770c) obj3);
        c2143l0.f6564Z = (InterfaceC2186j) obj;
        c2143l0.f6565o0 = iIntValue;
        return c2143l0.invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC2131F0 enumC2131F0;
        long j10;
        EnumC2131F0 enumC2131F1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6563Y;
        C2147N0 c2147n0 = this.f6566p0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    interfaceC2186j = this.f6564Z;
                    AbstractC9233X.m9807c(obj);
                    if (c2147n0.f6578b > 0) {
                        enumC2131F0 = EnumC2131F0.f6527Z;
                        this.f6564Z = interfaceC2186j;
                        this.f6563Y = 3;
                        if (interfaceC2186j.mo395a(enumC2131F0, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        j10 = c2147n0.f6578b;
                        this.f6564Z = interfaceC2186j;
                        this.f6563Y = 4;
                        if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else if (i10 == 3) {
                    interfaceC2186j = this.f6564Z;
                    AbstractC9233X.m9807c(obj);
                    j10 = c2147n0.f6578b;
                    this.f6564Z = interfaceC2186j;
                    this.f6563Y = 4;
                    if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (i10 == 4) {
                    interfaceC2186j = this.f6564Z;
                    AbstractC9233X.m9807c(obj);
                } else if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC2131F1 = EnumC2131F0.f6528o0;
                this.f6564Z = null;
                this.f6563Y = 5;
                if (interfaceC2186j.mo395a(enumC2131F1, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            AbstractC9233X.m9807c(obj);
        } else {
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = this.f6564Z;
            if (this.f6565o0 > 0) {
                EnumC2131F0 enumC2131F2 = EnumC2131F0.f6526Y;
                this.f6563Y = 1;
                if (interfaceC2186j.mo395a(enumC2131F2, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                long j11 = c2147n0.f6577a;
                this.f6564Z = interfaceC2186j;
                this.f6563Y = 2;
                if (AbstractC0575H.m1184m(j11, this) == enumC19250a) {
                    return enumC19250a;
                }
                if (c2147n0.f6578b > 0) {
                    enumC2131F0 = EnumC2131F0.f6527Z;
                    this.f6564Z = interfaceC2186j;
                    this.f6563Y = 3;
                    if (interfaceC2186j.mo395a(enumC2131F0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    j10 = c2147n0.f6578b;
                    this.f6564Z = interfaceC2186j;
                    this.f6563Y = 4;
                    if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                enumC2131F1 = EnumC2131F0.f6528o0;
                this.f6564Z = null;
                this.f6563Y = 5;
                if (interfaceC2186j.mo395a(enumC2131F1, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return C17296C.f55119a;
    }
}
