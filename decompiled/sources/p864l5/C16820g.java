package p864l5;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1075w5.C20831i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16820g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53963Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16826m f53964Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20831i f53965o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16820g(C16826m c16826m, InterfaceC18770c interfaceC18770c, C20831i c20831i) {
        super(2, interfaceC18770c);
        this.f53964Z = c16826m;
        this.f53965o0 = c20831i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16820g(this.f53964Z, interfaceC18770c, this.f53965o0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16820g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53963Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f53963Y = 1;
            obj = C16826m.m18562a(this.f53964Z, this.f53965o0, 1, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
