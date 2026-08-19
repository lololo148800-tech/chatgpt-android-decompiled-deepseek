package p484Ti;

import bo.C11527o;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p332N8.C5677a;
import p530Vi.InterfaceC8294B;
import p571X9.AbstractC9233X;
import p646aj.AbstractC10628h;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C7475d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f23737Y;

    /* JADX INFO: renamed from: Z */
    public int f23738Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7476e f23739o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f23740p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7475d(C7476e c7476e, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23739o0 = c7476e;
        this.f23740p0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7475d(this.f23739o0, this.f23740p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7475d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16525B c16525b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23738Z;
        C7476e c7476e = this.f23739o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16525b = this.f23737Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "randomUUID().toString()");
        c16525b = new C16525B();
        c16525b.f51262Y = string;
        C7473b c7473b = new C7473b(c16525b, AbstractC0575H.m1177f(AbstractC0575H.m1174c(AbstractC0575H.m1176e()), null, new C7474c(c7476e, this.f23740p0, string, null), 3), null);
        this.f23737Y = c16525b;
        this.f23738Z = 1;
        if (AbstractC0575H.m1170R(2000L, c7473b, this) == enumC19250a) {
            return enumC19250a;
        }
        C16644c c16644c = c7476e.f23746r0;
        if (c16644c == null) {
            AbstractC16544l.m18103p("device");
            throw null;
        }
        C5677a c5677a = new C5677a(c16525b, 1);
        C11527o c11527o = AbstractC10628h.f31539a;
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(c16644c);
        c5677a.invoke(linkedHashMapM19256r);
        c7476e.f23746r0 = new C16644c(linkedHashMapM19256r);
        InterfaceC8294B interfaceC8294B = c7476e.f23743o0;
        if (interfaceC8294B == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        String str = (String) c16525b.f51262Y;
        this.f23737Y = null;
        this.f23738Z = 2;
        if (interfaceC8294B.mo7524a(9, str, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
