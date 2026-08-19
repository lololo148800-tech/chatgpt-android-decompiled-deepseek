package p547Wc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0647x0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p229J0.EnumC3898D3;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8128k6;
import p571X9.AbstractC9233X;
import p860l0.C16782u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8791e0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26890Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f26891Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f26892o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC3898D3 f26893p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16782u f26894q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f26895r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8791e0(boolean z6, boolean z10, EnumC3898D3 enumC3898D3, C16782u c16782u, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26891Z = z6;
        this.f26892o0 = z10;
        this.f26893p0 = enumC3898D3;
        this.f26894q0 = c16782u;
        this.f26895r0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16782u c16782u = this.f26894q0;
        InterfaceC5985X interfaceC5985X = this.f26895r0;
        return new C8791e0(this.f26891Z, this.f26892o0, this.f26893p0, c16782u, interfaceC5985X, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8791e0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long jM8644j;
        C0647x0 c0647x0;
        C8789d0 c8789d0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26890Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!this.f26891Z && !this.f26892o0) {
                EnumC3898D3 enumC3898D3 = EnumC3898D3.f11879o0;
                EnumC3898D3 enumC3898D4 = this.f26893p0;
                if (enumC3898D4 != enumC3898D3) {
                    if (enumC3898D4 == EnumC3898D3.f11878Z) {
                        C21554a c21554a = C21555b.f68260Z;
                        jM8644j = AbstractC8128k6.m8644j(8, EnumC21557d.SECONDS);
                    } else {
                        C21554a c21554a2 = C21555b.f68260Z;
                        jM8644j = AbstractC8128k6.m8644j(4, EnumC21557d.SECONDS);
                    }
                    this.f26890Y = 1;
                    if (AbstractC0575H.m1185n(jM8644j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c0647x0 = C0647x0.f1902Y;
                    c8789d0 = new C8789d0(this.f26894q0, this.f26895r0, null);
                    this.f26890Y = 2;
                    if (AbstractC0575H.m1168P(c0647x0, c8789d0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            c0647x0 = C0647x0.f1902Y;
            c8789d0 = new C8789d0(this.f26894q0, this.f26895r0, null);
            this.f26890Y = 2;
            if (AbstractC0575H.m1168P(c0647x0, c8789d0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
