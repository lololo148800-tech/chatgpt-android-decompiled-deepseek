package p229J0;

import androidx.compose.material3.internal.AbstractC10860a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C5994b0;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C3997W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12545Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f12546Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3997W(C3880A3 c3880a3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12546Z = c3880a3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3997W(this.f12546Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3997W) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12545Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f12545Y = 1;
            EnumC3886B3 enumC3886B3 = EnumC3886B3.f11778Z;
            C11246q c11246q = this.f12546Z.f11737c;
            Object objM11287b = AbstractC10860a.m11287b(c11246q, enumC3886B3, ((C5994b0) c11246q.f34074k).m6409g(), this);
            if (objM11287b != enumC19250a) {
                objM11287b = c17296c;
            }
            if (objM11287b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
