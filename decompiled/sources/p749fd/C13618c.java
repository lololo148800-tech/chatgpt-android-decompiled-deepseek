package p749fd;

import mm.C17296C;
import p045Bj.C1307e;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1081wc.InterfaceC20904w;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p858ko.C16484C;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13618c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f43014Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f43015Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16484C f43016o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13625j f43017p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC20904w f43018q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f43019r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13618c(C16484C c16484c, C13625j c13625j, InterfaceC20904w interfaceC20904w, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43016o0 = c16484c;
        this.f43017p0 = c13625j;
        this.f43018q0 = interfaceC20904w;
        this.f43019r0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13618c c13618c = new C13618c(this.f43016o0, this.f43017p0, this.f43018q0, this.f43019r0, interfaceC18770c);
        c13618c.f43015Z = obj;
        return c13618c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13618c) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43014Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f43015Z;
            C1307e c1307e = new C1307e(this.f43016o0, this.f43017p0, this.f43018q0, this.f43019r0, 20);
            this.f43014Y = 1;
            if (AbstractC16689K1.m18508e(c19723a, null, null, c1307e, this, 7) == enumC19250a) {
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
