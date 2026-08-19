package p666bl;

import io.ktor.utils.p815io.C15074J;
import io.ktor.utils.p815io.InterfaceC15066B;
import ml.AbstractC17287e;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C11502r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34815Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC17287e f34817o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11502r(AbstractC17287e abstractC17287e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34817o0 = abstractC17287e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11502r c11502r = new C11502r(this.f34817o0, interfaceC18770c);
        c11502r.f34816Z = obj;
        return c11502r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11502r) create((C15074J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34815Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC15066B interfaceC15066B = ((C15074J) this.f34816Z).f46837Y;
            this.f34815Y = 1;
            if (this.f34817o0.mo15508e(interfaceC15066B, this) == enumC19250a) {
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
