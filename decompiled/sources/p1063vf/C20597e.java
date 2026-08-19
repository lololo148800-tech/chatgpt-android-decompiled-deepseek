package p1063vf;

import android.net.Uri;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p1016t3.C19794u;
import p1016t3.C19797x;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20597e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65354Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20597e(C20603k c20603k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65354Y = c20603k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20597e(this.f65354Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20597e c20597e = (C20597e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20597e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19794u c19794u;
        Uri uri;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20603k c20603k = this.f65354Y;
        C1526D c1526d = c20603k.f65377k;
        boolean z6 = c1526d.m2242b0() == 1 || c1526d.m2242b0() == 4;
        C17296C c17296c = C17296C.f55119a;
        if (z6) {
            C19797x c19797xM4513B = c1526d.m4513B();
            if (c19797xM4513B == null || (c19794u = c19797xM4513B.f62786b) == null || (uri = c19794u.f62779a) == null) {
                return c17296c;
            }
            c20603k.m21194b(false, uri);
        } else {
            c1526d.getClass();
            c1526d.m2250k0(true);
        }
        return c17296c;
    }
}
