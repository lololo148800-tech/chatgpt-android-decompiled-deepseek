package p112E6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p003A1.C0254h0;
import p049Bm.InterfaceC1440o;
import p215Ic.C3685b;
import p571X9.AbstractC9233X;
import p836jh.C16211c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: E6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2349h extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7294Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7295Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2349h(Object obj, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f7294Y = i10;
        this.f7295Z = obj;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f7294Y) {
            case 0:
                C2349h c2349h = new C2349h((C16525B) this.f7295Z, interfaceC18770c, 0);
                C17296C c17296c = C17296C.f55119a;
                c2349h.invokeSuspend(c17296c);
                return c17296c;
            default:
                C2349h c2349h2 = new C2349h((C3685b) this.f7295Z, interfaceC18770c, 1);
                C17296C c17296c2 = C17296C.f55119a;
                c2349h2.invokeSuspend(c17296c2);
                return c17296c2;
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f7295Z;
        switch (this.f7294Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                try {
                    C2352k c2352k = (C2352k) ((C16525B) obj2).f51262Y;
                    if (c2352k != null) {
                        c2352k.close();
                    }
                } catch (Throwable th2) {
                    AbstractC9233X.m9806b(th2);
                }
                break;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C3685b c3685b = (C3685b) obj2;
                ((C16211c) c3685b.f11182q0).m17805a(new C0254h0(c3685b, 26));
                break;
        }
        return c17296c;
        return c17296c;
    }
}
