package p647ak;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p949pj.C18490u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10660O0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31650Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10696e1 f31651Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10660O0(C10696e1 c10696e1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31651Z = c10696e1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10660O0(this.f31651Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10660O0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31650Y;
        C10696e1 c10696e1 = this.f31651Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18490u c18490u = C18490u.f58938a;
            Context context = c10696e1.f31778a;
            this.f31650Y = 1;
            if (c18490u.m19883d(context, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        c10696e1.getClass();
        return C17296C.f55119a;
    }
}
