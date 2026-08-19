package p094De;

import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1155zi.C22011h0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: De.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2022e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6200Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6201Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2029l f6202o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f6203p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2022e(C2029l c2029l, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6202o0 = c2029l;
        this.f6203p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2022e c2022e = new C2022e(this.f6202o0, this.f6203p0, interfaceC18770c);
        c2022e.f6201Z = obj;
        return c2022e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2022e) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6200Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f6201Z;
            Object obj2 = ((Map) this.f6202o0.f6231d.getValue()).get(new C22011h0(this.f6203p0));
            this.f6200Y = 1;
            if (interfaceC2186j.mo395a(obj2, this) == enumC19250a) {
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
