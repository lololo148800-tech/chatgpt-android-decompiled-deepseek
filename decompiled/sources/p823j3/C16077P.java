package p823j3;

import java.util.concurrent.atomic.AtomicReference;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p561X.C8990d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C16077P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49789Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49790Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16104z f49791o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8990d f49792p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16077P(C16104z c16104z, C8990d c8990d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49791o0 = c16104z;
        this.f49792p0 = c8990d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16077P c16077p = new C16077P(this.f49791o0, this.f49792p0, interfaceC18770c);
        c16077p.f49790Z = obj;
        return c16077p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16077P) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49789Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f49790Z;
            AtomicReference atomicReference2 = new AtomicReference(null);
            C16076O c16076o = new C16076O(this.f49791o0, this.f49792p0, interfaceC0571F, atomicReference2, null);
            this.f49790Z = atomicReference2;
            this.f49789Y = 1;
            Object objM1183l = AbstractC0575H.m1183l(c16076o, this);
            if (objM1183l == enumC19250a) {
                return enumC19250a;
            }
            atomicReference = atomicReference2;
            obj = objM1183l;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicReference = (AtomicReference) this.f49790Z;
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) atomicReference.get();
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1275e(null);
        }
        return obj;
    }
}
