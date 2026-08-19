package p1156zj;

import java.io.File;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p045Bj.C1311i;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p949pj.C18451Y;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C22152f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70033Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f70034Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22172l1 f70035o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22170l f70036p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22152f(long j10, C22172l1 c22172l1, C22170l c22170l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f70034Z = j10;
        this.f70035o0 = c22172l1;
        this.f70036p0 = c22170l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22152f(this.f70034Z, this.f70035o0, this.f70036p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22152f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objMo224r;
        C1311i c1311i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f70033Y;
        C22170l c22170l = this.f70036p0;
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
            c1311i = c22170l.f70158h;
            if (c1311i != null) {
                c1311i.invoke(new C18451Y());
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f70033Y = 1;
        if (AbstractC0575H.m1184m(this.f70034Z, this) == enumC19250a) {
            return enumC19250a;
        }
        if (this.f70035o0.f70203x == EnumC19999a.f63315Z) {
            InterfaceC18483p interfaceC18483p = c22170l.f70152b;
            this.f70033Y = 2;
            objMo224r = interfaceC18483p.mo224r(this);
            if (objMo224r == enumC19250a) {
                return enumC19250a;
            }
            if (!(objMo224r instanceof C17311n)) {
                ((File) objMo224r).delete();
            }
        }
        c1311i = c22170l.f70158h;
        if (c1311i != null) {
            c1311i.invoke(new C18451Y());
        }
        return C17296C.f55119a;
    }
}
