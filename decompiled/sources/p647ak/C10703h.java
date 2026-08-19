package p647ak;

import java.io.File;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p045Bj.C1311i;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p949pj.C18451Y;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10703h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31807Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC8170q0 f31808Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10713l f31809o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10703h(AbstractC8170q0 abstractC8170q0, C10713l c10713l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31808Z = abstractC8170q0;
        this.f31809o0 = c10713l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10703h(this.f31808Z, this.f31809o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10703h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objMo224r;
        C1311i c1311i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31807Y;
        C10713l c10713l = this.f31809o0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                objMo224r = ((C17312o) obj).f55139Y;
            }
            if (!(objMo224r instanceof C17311n)) {
                ((File) objMo224r).delete();
            }
            c1311i = c10713l.f31837e;
            if (c1311i != null) {
                c1311i.invoke(new C18451Y());
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C10634B0 c10634b0 = (C10634B0) this.f31808Z;
        this.f31807Y = 1;
        if (AbstractC0575H.m1184m(c10634b0.f31552c, this) == enumC19250a) {
            return enumC19250a;
        }
        InterfaceC18483p interfaceC18483p = c10713l.f31834b;
        this.f31807Y = 2;
        objMo224r = interfaceC18483p.mo224r(this);
        if (objMo224r == enumC19250a) {
            return enumC19250a;
        }
        if (!(objMo224r instanceof C17311n)) {
            ((File) objMo224r).delete();
        }
        c1311i = c10713l.f31837e;
        if (c1311i != null) {
            c1311i.invoke(new C18451Y());
        }
        return C17296C.f55119a;
    }
}
