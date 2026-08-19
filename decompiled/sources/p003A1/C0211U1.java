package p003A1;

import android.view.View;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p349O0.C6032u0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211U1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f802Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f803Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f804o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6032u0 f805p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC11112u f806q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0214V1 f807r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ View f808s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211U1(C16525B c16525b, C6032u0 c6032u0, InterfaceC11112u interfaceC11112u, C0214V1 c0214v1, View view, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f804o0 = c16525b;
        this.f805p0 = c6032u0;
        this.f806q0 = interfaceC11112u;
        this.f807r0 = c0214v1;
        this.f808s0 = view;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0211U1 c0211u1 = new C0211U1(this.f804o0, this.f805p0, this.f806q0, this.f807r0, this.f808s0, interfaceC18770c);
        c0211u1.f803Z = obj;
        return c0211u1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0211U1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0627n0 interfaceC0627n0;
        C0564B0 c0564b0M1156D;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f802Y;
        InterfaceC11112u interfaceC11112u = this.f806q0;
        C0214V1 c0214v1 = this.f807r0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0627n0 = (InterfaceC0627n0) this.f803Z;
            try {
                AbstractC9233X.m9807c(obj);
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                interfaceC11112u.mo7809i().mo7808c(c0214v1);
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                interfaceC11112u.mo7809i().mo7808c(c0214v1);
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f803Z;
        try {
            C0245e1 c0245e1 = (C0245e1) this.f804o0.f51262Y;
            if (c0245e1 != null) {
                InterfaceC2149O0 interfaceC2149O0M692a = AbstractC0223Y1.m692a(this.f808s0.getContext().getApplicationContext());
                c0245e1.f936Y.m6410h(((Number) interfaceC2149O0M692a.getValue()).floatValue());
                c0564b0M1156D = AbstractC0575H.m1156D(interfaceC0571F, null, null, new C0208T1(interfaceC2149O0M692a, c0245e1, null), 3);
            } else {
                c0564b0M1156D = null;
            }
            try {
                C6032u0 c6032u0 = this.f805p0;
                this.f803Z = c0564b0M1156D;
                this.f802Y = 1;
                if (c6032u0.m6606J(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0627n0 = c0564b0M1156D;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                interfaceC11112u.mo7809i().mo7808c(c0214v1);
                return C17296C.f55119a;
            } catch (Throwable th3) {
                interfaceC0627n0 = c0564b0M1156D;
                th = th3;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                interfaceC11112u.mo7809i().mo7808c(c0214v1);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            interfaceC0627n0 = null;
        }
    }
}
