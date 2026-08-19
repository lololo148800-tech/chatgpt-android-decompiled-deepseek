package p509Uk;

import io.ktor.utils.p815io.C15074J;
import io.ktor.utils.p815io.InterfaceC15066B;
import ml.AbstractC17287e;
import ml.AbstractC17288f;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7714g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24308Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f24309Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC17288f f24310o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7714g(AbstractC17288f abstractC17288f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24310o0 = abstractC17288f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7714g c7714g = new C7714g(this.f24310o0, interfaceC18770c);
        c7714g.f24309Z = obj;
        return c7714g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7714g) create((C15074J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24308Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C15074J c15074j = (C15074J) this.f24309Z;
            AbstractC17287e abstractC17287e = (AbstractC17287e) this.f24310o0;
            InterfaceC15066B interfaceC15066B = c15074j.f46837Y;
            this.f24308Y = 1;
            if (abstractC17287e.mo15508e(interfaceC15066B, this) == enumC19250a) {
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
