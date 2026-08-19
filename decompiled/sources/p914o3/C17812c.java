package p914o3;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p349O0.C6010j0;
import p523V9.AbstractC8234y0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: o3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17812c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56800Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f56801Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11105n f56802o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC11104m f56803p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC18776i f56804q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC2184i f56805r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17812c(AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC18776i interfaceC18776i, InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56802o0 = abstractC11105n;
        this.f56803p0 = enumC11104m;
        this.f56804q0 = interfaceC18776i;
        this.f56805r0 = interfaceC2184i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17812c c17812c = new C17812c(this.f56802o0, this.f56803p0, this.f56804q0, this.f56805r0, interfaceC18770c);
        c17812c.f56801Z = obj;
        return c17812c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17812c) create((C6010j0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56800Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17811b c17811b = new C17811b(this.f56804q0, this.f56805r0, (C6010j0) this.f56801Z, null);
            this.f56800Y = 1;
            if (AbstractC8234y0.m8873a(this.f56802o0, this.f56803p0, c17811b, this) == enumC19250a) {
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
