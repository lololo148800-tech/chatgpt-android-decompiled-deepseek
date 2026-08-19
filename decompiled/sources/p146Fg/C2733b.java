package p146Fg;

import bo.C11527o;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p018Ag.C0500e;
import p018Ag.C0501f;
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
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2733b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8392Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8393Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2734c f8394o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2737f f8395p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733b(C2734c c2734c, C2737f c2737f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8394o0 = c2734c;
        this.f8395p0 = c2737f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2733b c2733b = new C2733b(this.f8394o0, this.f8395p0, interfaceC18770c);
        c2733b.f8393Z = obj;
        return c2733b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2733b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8392Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f8393Z;
            C13693c c13693cM21253x = AbstractC20734X.m21253x("https://android.chat.openai.com/public-api/");
            C2732a c2732a = C2732a.f8391Y;
            C16447N c16447n = c13693cM21253x.f43195a;
            c2732a.invoke(c16447n, c16447n);
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            Map.EL.forEach((C16644c) c11527o.m12904c(C2737f.Companion.serializer(), this.f8395p0), new C0500e(new C0501f(c13693cM21253x, 2), 2));
            c13693cM21253x.f43200f.m20652f(AbstractC6241o.f20322d, C17296C.f55119a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693cM21253x, C16438E.f50984b, c13693cM21253x, c6752c);
            this.f8392Y = 1;
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
