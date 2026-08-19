package p018Ag;

import bo.C11527o;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p817j$.util.Map;
import p857kl.C16438E;
import p857kl.C16447N;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ag.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0502g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f1632Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f1633Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0503h f1634o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0507l f1635p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502g(C0503h c0503h, C0507l c0507l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1634o0 = c0503h;
        this.f1635p0 = c0507l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0502g c0502g = new C0502g(this.f1634o0, this.f1635p0, interfaceC18770c);
        c0502g.f1633Z = obj;
        return c0502g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0502g) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f1632Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f1633Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("https://android.chat.openai.com/public-api/");
            C0499d c0499d = C0499d.f1627Y;
            C16447N c16447n = c13693cM21253x.f43195a;
            c0499d.invoke(c16447n, c16447n);
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            Map.EL.forEach((C16644c) c11527o.m12904c(C0507l.Companion.serializer(), this.f1635p0), new C0500e(new C0501f(c13693cM21253x, 0), 0));
            C19666a c19666a = AbstractC6241o.f20319a;
            C17296C c17296c = C17296C.f55119a;
            C19675j c19675j = c13693cM21253x.f43200f;
            c19675j.m20652f(c19666a, c17296c);
            c19675j.m20652f(AbstractC6241o.f20322d, c17296c);
            c19675j.m20652f(AbstractC6241o.f20321c, c17296c);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50984b, c13693cM21253x, c6752c);
            this.f1632Y = 1;
            obj = c14535jM21254y.m16038c(this);
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
