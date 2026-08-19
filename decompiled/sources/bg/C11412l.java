package bg;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bg.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11412l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34456Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11422v f34457Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11412l(C11422v c11422v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34457Z = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11412l(this.f34457Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11412l) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34456Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11399A c11399a = this.f34457Z.f34490b;
            this.f34456Y = 1;
            obj = c11399a.f34429a.m13037c(this);
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
