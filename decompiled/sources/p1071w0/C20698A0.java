package p1071w0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p153Fn.C2925c;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import tf.C19899D;

/* JADX INFO: renamed from: w0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20698A0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65558Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65559Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2925c f65560o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f65561p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17406l f65562q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f65563r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20698A0(C2925c c2925c, InterfaceC5985X interfaceC5985X, InterfaceC17406l interfaceC17406l, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65560o0 = c2925c;
        this.f65561p0 = interfaceC5985X;
        this.f65562q0 = interfaceC17406l;
        this.f65563r0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20698A0 c20698a0 = new C20698A0(this.f65560o0, this.f65561p0, this.f65562q0, this.f65563r0, interfaceC18770c);
        c20698a0.f65559Z = obj;
        return c20698a0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20698A0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65558Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f65559Z;
            C20788z0 c20788z0 = new C20788z0(this.f65560o0, this.f65561p0, this.f65562q0, null);
            C19899D c19899d = new C19899D(this.f65563r0, 3);
            this.f65558Y = 1;
            if (AbstractC16689K1.m18507d(c19723a, c20788z0, c19899d, this) == enumC19250a) {
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
