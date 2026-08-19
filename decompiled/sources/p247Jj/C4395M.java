package p247Jj;

import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8234y0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4395M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14280Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4399O f14281Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4456t f14282o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4395M(C4399O c4399o, C4456t c4456t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14281Z = c4399o;
        this.f14282o0 = c4456t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4395M(this.f14281Z, this.f14282o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4395M) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14280Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4399O c4399o = this.f14281Z;
            C11114w c11114w = c4399o.f33144Y0;
            AbstractC16544l.m18093f(c11114w, "<get-lifecycle>(...)");
            EnumC11104m enumC11104m = EnumC11104m.f33478q0;
            C4393L c4393l = new C4393L(c4399o, this.f14282o0, null);
            this.f14280Y = 1;
            if (AbstractC8234y0.m8873a(c11114w, enumC11104m, c4393l, this) == enumC19250a) {
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
