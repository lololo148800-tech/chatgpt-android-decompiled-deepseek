package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p199Hl.C3495t;
import p344Nl.C5842n;
import p387Pl.C6497q;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4723H0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15357Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f15358Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6497q f15359o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4723H0(C4727J0 c4727j0, C6497q c6497q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15358Z = c4727j0;
        this.f15359o0 = c6497q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4723H0(this.f15358Z, this.f15359o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4723H0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15357Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4727J0 c4727j0 = this.f15358Z;
            C5842n participant = c4727j0.f15400y;
            AbstractC16544l.m18094g(participant, "participant");
            C3495t c3495t = new C3495t(c4727j0);
            this.f15357Y = 1;
            if (C4727J0.m5407b(c4727j0, c3495t, this) == enumC19250a) {
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
