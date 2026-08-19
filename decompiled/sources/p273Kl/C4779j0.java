package p273Kl;

import java.util.ArrayList;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4779j0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f15582Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0564B0 f15583o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4779j0(C16525B c16525b, C0564B0 c0564b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15582Z = c16525b;
        this.f15583o0 = c0564b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4779j0(this.f15582Z, this.f15583o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4779j0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15581Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ArrayList arrayListM19315v = AbstractC17678l.m19315v(new InterfaceC0627n0[]{this.f15582Z.f51262Y, this.f15583o0});
            this.f15581Y = 1;
            if (AbstractC0575H.m1154B(arrayListM19315v, this) == enumC19250a) {
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
