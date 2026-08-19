package p041Be;

import bo.C11527o;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p018Ag.C0500e;
import p018Ag.C0501f;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p556Wk.AbstractC8910Y;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p817j$.util.Map;
import p857kl.C16438E;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Be.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C1208A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f3177Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f3178Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1234f f3179o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208A(C1234f c1234f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3179o0 = c1234f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1208A c1208a = new C1208A(this.f3179o0, interfaceC18770c);
        c1208a.f3178Z = obj;
        return c1208a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1208A) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f3177Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f3178Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "conversations", null, 23);
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            Map.EL.forEach((C16644c) c11527o.m12904c(C1234f.Companion.serializer(), this.f3179o0), new C0500e(new C0501f(c13693c, 1), 1));
            AbstractC8910Y.m9565b(c13693c, C1237i.f3256o0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f3177Y = 1;
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
