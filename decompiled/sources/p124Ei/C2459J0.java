package p124Ei;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p002A0.C0122V;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p071Ch.C1661A;
import p1014t1.C19723A;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2459J0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7646Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7647Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7648o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f7649p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2459J0(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7648o0 = interfaceC1436k;
        this.f7649p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2459J0 c2459j0 = new C2459J0(this.f7648o0, this.f7649p0, interfaceC18770c);
        c2459j0.f7647Z = obj;
        return c2459j0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2459J0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7646Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f7647Z;
            C16556x c16556x = new C16556x();
            InterfaceC1436k interfaceC1436k = this.f7648o0;
            C0122V c0122v = new C0122V(c16556x, 25, interfaceC1436k);
            C1661A c1661a = new C1661A(interfaceC1436k, c16556x, this.f7649p0, null, 1);
            this.f7646Y = 1;
            if (AbstractC16689K1.m18508e(c19723a, c0122v, c1661a, null, this, 9) == enumC19250a) {
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
