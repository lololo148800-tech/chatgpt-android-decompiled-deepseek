package li;

import io.sentry.AbstractC15152P0;
import io.sentry.protocol.C15425E;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p1155zi.EnumC21905D1;
import p1155zi.EnumC22034n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: li.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16963b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f54447Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16963b c16963b = new C16963b(2, interfaceC18770c);
        c16963b.f54447Y = obj;
        return c16963b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16963b c16963b = (C16963b) create((C21891A) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16963b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        EnumC22034n enumC22034n;
        String strName;
        EnumC21905D1 enumC21905D1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C21891A c21891a = (C21891A) this.f54447Y;
        C15425E c15425e = new C15425E();
        c15425e.f48063Z = c21891a.f69416b.f69655a;
        String strM22322a = c21891a.m22322a();
        if (strM22322a == null) {
            strM22322a = null;
        }
        c15425e.f48064o0 = strM22322a;
        AbstractC15152P0.m16337k(c15425e);
        AbstractC15152P0.m16336j("isEmployee", String.valueOf(c21891a.m22330i()));
        boolean zM22331j = c21891a.m22331j();
        C22038o c22038o = c21891a.f69415a;
        String str2 = (!zM22331j || c22038o == null) ? null : c22038o.f69711a;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = "unknown";
        if (str2 == null) {
            str2 = "unknown";
        }
        AbstractC15152P0.m16336j("workspaceId", str2);
        AbstractC15152P0.m16336j("hasActiveSubscription", String.valueOf(c22038o != null ? Boolean.valueOf(c22038o.m22345b()) : null));
        if (c22038o == null || (enumC21905D1 = c22038o.f69718h) == null || (str = enumC21905D1.f69449Y) == null) {
            str = "unknown";
        }
        AbstractC15152P0.m16336j("planType", str);
        if (c22038o == null || (string = Boolean.valueOf(c22038o.f69719i).toString()) == null) {
            string = "unknown";
        }
        AbstractC15152P0.m16336j("isDeactivated", string);
        if (c22038o != null && (enumC22034n = c22038o.f69716f) != null && (strName = enumC22034n.name()) != null) {
            str3 = strName;
        }
        AbstractC15152P0.m16336j("structure", str3);
        return C17296C.f55119a;
    }
}
