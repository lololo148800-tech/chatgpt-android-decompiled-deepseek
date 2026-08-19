package p905nd;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.EOFException;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C17596x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56336Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC15088n f56337Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17596x(InterfaceC15088n interfaceC15088n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56337Z = interfaceC15088n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17596x(this.f56337Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17596x) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws EOFException {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56336Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f56336Y = 1;
            obj = AbstractC15070F.m16183k(this.f56337Z, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return new Integer(((Number) obj).byteValue());
    }
}
