package p023Al;

import io.ktor.utils.p815io.InterfaceC15088n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Al.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0555a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f1764Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC15088n f1765Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555a(InterfaceC15088n interfaceC15088n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1765Z = interfaceC15088n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0555a(this.f1765Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0555a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f1764Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f1764Y = 1;
            obj = this.f1765Z.mo1140d(1, this);
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
