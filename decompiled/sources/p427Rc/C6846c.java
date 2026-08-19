package p427Rc;

import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p103Dn.C2219z0;
import p129En.C2602m;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6846c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21958Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2219z0 f21959Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4816c f21960o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16556x f21961p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16525B f21962q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1758z f21963r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6846c(C2219z0 c2219z0, C4816c c4816c, C16556x c16556x, C16525B c16525b, InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21959Z = c2219z0;
        this.f21960o0 = c4816c;
        this.f21961p0 = c16556x;
        this.f21962q0 = c16525b;
        this.f21963r0 = interfaceC1758z;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6846c(this.f21959Z, this.f21960o0, this.f21961p0, this.f21962q0, this.f21963r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6846c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21958Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2602m c2602m = new C2602m(this.f21960o0, this.f21961p0, this.f21962q0, this.f21963r0);
            this.f21958Y = 1;
            if (this.f21959Z.mo3141d(c2602m, this) == enumC19250a) {
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
