package p787he;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.C0647x0;
import p049Bm.InterfaceC1439n;
import p1155zi.C22011h0;
import p571X9.AbstractC9233X;
import p925oe.C18111f;
import p925oe.C18127p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C14489r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45653Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45654Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45655o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14489r(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45655o0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14489r c14489r = new C14489r(this.f45655o0, interfaceC18770c);
        c14489r.f45654Z = obj;
        return c14489r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C14489r) create(new C22011h0(((C22011h0) obj).f69652a), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.String] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f45653Y;
        C14459O c14459o = this.f45655o0;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    AbstractC9233X.m9807c(obj);
                    throw new C0644w();
                }
                if (r6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f45654Z;
                AbstractC9233X.m9807c(obj);
                throw th2;
            }
            AbstractC9233X.m9807c(obj);
            String conversationId = ((C22011h0) this.f45654Z).f69652a;
            C18127p c18127p = c14459o.f45513l;
            AbstractC16544l.m18094g(conversationId, "conversationId");
            AbstractC0575H.m1156D(c18127p.f57818a, null, null, new C18111f(conversationId, c18127p, null, false), 3);
            this.f45654Z = conversationId;
            this.f45653Y = 1;
            AbstractC0575H.m1179h(this);
            return enumC19250a;
        } catch (Throwable th3) {
            C0647x0 c0647x0 = C0647x0.f1902Y;
            C14488q c14488q = new C14488q(c14459o, r6, null);
            this.f45654Z = th3;
            this.f45653Y = 2;
            if (AbstractC0575H.m1168P(c0647x0, c14488q, this) == enumC19250a) {
                return enumC19250a;
            }
            throw th3;
        }
    }
}
