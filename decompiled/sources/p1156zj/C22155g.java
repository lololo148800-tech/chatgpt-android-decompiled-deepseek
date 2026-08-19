package p1156zj;

import java.io.File;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p949pj.C18444Q;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C22155g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70047Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22170l f70048Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22172l1 f70049o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22155g(InterfaceC18770c interfaceC18770c, C22170l c22170l, C22172l1 c22172l1) {
        super(2, interfaceC18770c);
        this.f70048Z = c22170l;
        this.f70049o0 = c22172l1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22155g(interfaceC18770c, this.f70048Z, this.f70049o0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22155g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objMo224r;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f70047Y;
        C22170l c22170l = this.f70048Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18483p interfaceC18483p = c22170l.f70152b;
            this.f70047Y = 1;
            objMo224r = interfaceC18483p.mo224r(this);
            if (objMo224r == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objMo224r = ((C17312o) obj).f55139Y;
        }
        boolean z6 = objMo224r instanceof C17311n;
        C22172l1 c22172l1 = this.f70049o0;
        if (!z6) {
            c22172l1.f70205z.invoke((File) objMo224r, c22170l.f70152b.mo225v());
        }
        Throwable thM18979a = C17312o.m18979a(objMo224r);
        if (thM18979a != null && !(thM18979a instanceof C18444Q)) {
            c22172l1.f70199t.invoke(thM18979a);
        }
        return C17296C.f55119a;
    }
}
