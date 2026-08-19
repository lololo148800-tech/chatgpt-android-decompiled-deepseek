package p619Zb;

import java.util.concurrent.Executor;
import p013Ab.C0420b;
import p030B2.RunnableC0758g0;
import p1009s9.C19501d;
import p117Eb.C2392v;
import p501Ub.AbstractC7606h;
import p501Ub.EnumC7610l;
import p523V9.C7996T4;
import p523V9.C8232x6;
import p523V9.EnumC7893G4;
import p523V9.EnumC7909I4;
import p546Wb.C8756b;
import p546Wb.InterfaceC8755a;
import p615Z6.C10252z0;
import p664bc.AbstractC11335b;

/* JADX INFO: renamed from: Zb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10268a extends AbstractC11335b implements InterfaceC8755a {

    /* JADX INFO: renamed from: r0 */
    public final boolean f30499r0;

    public C10268a(C8756b c8756b, C10273f c10273f, Executor executor, C8232x6 c8232x6) {
        super(c10273f, executor);
        boolean zM10868c = AbstractC10269b.m10868c();
        this.f30499r0 = zM10868c;
        C2392v c2392v = new C2392v(16, false);
        c2392v.f7437o0 = AbstractC10269b.m10866a(c8756b);
        C7996T4 c7996t4 = new C7996T4(c2392v);
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30456o0 = zM10868c ? EnumC7893G4.TYPE_THICK : EnumC7893G4.TYPE_THIN;
        c10252z0.f30457p0 = c7996t4;
        EnumC7610l.f24056Y.execute(new RunnableC0758g0(c8232x6, new C0420b(c10252z0, 1), EnumC7909I4.ON_DEVICE_BARCODE_CREATE, c8232x6.m8871c(), 1));
    }

    @Override // p1022t9.InterfaceC19825j
    /* JADX INFO: renamed from: a */
    public final C19501d[] mo7961a() {
        return this.f30499r0 ? AbstractC7606h.f24045a : new C19501d[]{AbstractC7606h.f24046b};
    }
}
