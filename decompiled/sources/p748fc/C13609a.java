package p748fc;

import android.javax.sip.C10808o;
import ec.InterfaceC13364f;
import java.util.concurrent.Executor;
import p013Ab.C0420b;
import p030B2.RunnableC0758g0;
import p1009s9.C19501d;
import p501Ub.AbstractC7606h;
import p501Ub.EnumC7610l;
import p594Y9.C9788P4;
import p594Y9.C9907i4;
import p594Y9.C9919k4;
import p594Y9.EnumC9913j4;
import p594Y9.EnumC9960r3;
import p594Y9.EnumC9972t3;
import p615Z6.C10252z0;
import p658b5.C11242m;
import p664bc.AbstractC11335b;
import p768gc.C13836a;

/* JADX INFO: renamed from: fc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13609a extends AbstractC11335b implements InterfaceC13364f {

    /* JADX INFO: renamed from: r0 */
    public final boolean f42990r0;

    public C13609a(C13610b c13610b, Executor executor, C9788P4 c9788p4, C13836a c13836a) {
        super(c13610b, executor);
        boolean zM15474a = c13836a.m15474a();
        this.f42990r0 = zM15474a;
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30456o0 = zM15474a ? EnumC9960r3.TYPE_THICK : EnumC9960r3.TYPE_THIN;
        C11242m c11242m = new C11242m();
        C10808o c10808o = new C10808o(25, false);
        c10808o.f32040Z = EnumC9913j4.LATIN;
        c11242m.f34020o0 = new C9919k4(c10808o);
        c10252z0.f30457p0 = new C9907i4(c11242m);
        EnumC7610l.f24056Y.execute(new RunnableC0758g0(c9788p4, new C0420b(c10252z0, 1, (byte) 0), EnumC9972t3.ON_DEVICE_TEXT_CREATE, c9788p4.m10405c(), 4));
    }

    @Override // p1022t9.InterfaceC19825j
    /* JADX INFO: renamed from: a */
    public final C19501d[] mo7961a() {
        return this.f42990r0 ? AbstractC7606h.f24045a : new C19501d[]{AbstractC7606h.f24048d};
    }
}
