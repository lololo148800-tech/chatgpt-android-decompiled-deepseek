package id;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p571X9.AbstractC9233X;
import p834jd.C16194c;
import p834jd.C16197f;
import p834jd.C16200i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: id.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14963b extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ boolean f46604Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C16194c f46605Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14968g f46606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14963b(C14968g c14968g, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f46606o0 = c14968g;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C14963b c14963b = new C14963b(this.f46606o0, (InterfaceC18770c) obj3);
        c14963b.f46604Y = zBooleanValue;
        c14963b.f46605Z = (C16194c) obj2;
        return c14963b.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C22038o c22038o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = this.f46604Y;
        C16194c c16194c = this.f46605Z;
        boolean z10 = false;
        if (!z6) {
            C21891A c21891a = this.f46606o0.f46619Y.f58774b;
            String str = null;
            if (c21891a.m22331j() && (c22038o = c21891a.f69415a) != null) {
                str = c22038o.f69711a;
            }
            if (!c16194c.f50271e.contains(str == null ? C16197f.INSTANCE : new C16200i(str))) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
