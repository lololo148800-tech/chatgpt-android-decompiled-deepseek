package p484Ti;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7473b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f23730Y;

    /* JADX INFO: renamed from: Z */
    public int f23731Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f23732o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0583L f23733p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7473b(C16525B c16525b, C0583L c0583l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23732o0 = c16525b;
        this.f23733p0 = c0583l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7473b(this.f23732o0, this.f23733p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7473b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C16525B c16525b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23731Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = this.f23732o0;
            this.f23730Y = c16525b2;
            this.f23731Z = 1;
            Object objM1309u = this.f23733p0.m1309u(this);
            if (objM1309u == enumC19250a) {
                return enumC19250a;
            }
            c16525b = c16525b2;
            obj = objM1309u;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = this.f23730Y;
            AbstractC9233X.m9807c(obj);
        }
        c16525b.f51262Y = obj;
        return C17296C.f55119a;
    }
}
