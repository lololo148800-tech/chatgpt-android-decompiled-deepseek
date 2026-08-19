package p336Nc;

import android.app.Application;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.AbstractC0593T;
import p035B7.C0846c;
import p071Ch.C1676g;
import p087D7.AbstractC1977d;
import p1021t8.C19814e;
import p1021t8.EnumC19815f;
import p1155zi.EnumC21895B;
import p197Hj.C3457c;
import p201Hn.C3516e;
import p210I7.C3650b;
import p229J0.C4171z3;
import p284L7.C4957b;
import p364Oh.AbstractC6241o;
import p523V9.AbstractC7889G0;
import p525Vb.C8258a;
import p544W9.AbstractC8446A2;
import p544W9.AbstractC8639g4;
import p592Y7.C9669d;
import p641a7.AbstractC10516b;
import p641a7.C10515a;
import p642a8.C10523f;
import p642a8.C10525h;
import p658b5.C11248s;
import p661b7.EnumC11255b;
import p744f8.C13580a;
import p765g7.InterfaceC13823a;
import p780h7.C14419a;
import p780h7.C14422d;
import p780h7.C14423e;
import p846k4.C16340i;
import p849k7.C16354g;
import p867l8.C16829a;
import p867l8.C16830b;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p918o7.C17878e;
import p959q8.C18643e;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;

/* JADX INFO: renamed from: Nc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5706b implements InterfaceC19018a {

    /* JADX INFO: renamed from: q0 */
    public static final Object f18491q0 = AbstractC17659D.m19244f(new C17309l("app_version_code", 2500706), new C17309l("app_version_name", "1.2025.007"));

    /* JADX INFO: renamed from: Y */
    public final EnumC21895B f18492Y;

    /* JADX INFO: renamed from: Z */
    public final C1676g f18493Z;

    /* JADX INFO: renamed from: o0 */
    public final C19814e f18494o0;

    /* JADX INFO: renamed from: p0 */
    public final C9669d f18495p0;

    public C5706b(EnumC21895B appType, Application appContext, C1676g devicePreferences) {
        AbstractC16544l.m18094g(appType, "appType");
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        this.f18492Y = appType;
        this.f18493Z = devicePreferences;
        C14422d c14422d = C14423e.f45330h;
        List hosts = AbstractC6241o.f20323e;
        AbstractC16544l.m18094g(hosts, "hosts");
        ArrayList arrayListM9049b = AbstractC8446A2.m9049b("Network requests", hosts);
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayListM9049b, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Object obj : arrayListM9049b) {
            linkedHashMap.put(obj, AbstractC17678l.m19293P(new EnumC19815f[]{EnumC19815f.f62864Y, EnumC19815f.f62867p0}));
        }
        C14422d c14422dM15934a = C14422d.m15934a(C14422d.m15934a(c14422d, false, linkedHashMap, 0, 0, null, 8187), true, null, 0, 0, null, 8189);
        Map mapM535x = AbstractC0168G.m535x("_dd.version", "2500706");
        C14422d c14422dM15934a2 = C14422d.m15934a(c14422dM15934a, false, null, 0, 0, new C14419a(512, new C3457c(this, 20), new C4171z3(this, 19), 1), 6143);
        C14423e c14423e = new C14423e(c14422dM15934a2, "pub092a6a18eee02856520dee132f7eb321", "release", "googlePlay", null, false, mapM535x);
        C3650b c3650b = new C3650b();
        this.f18494o0 = new C19814e(new C16340i());
        C10523f c10523fM10975a = C10523f.m10975a(C10523f.m10975a(C10523f.m10975a(C10523f.m10975a(C10523f.m10975a(C10525h.f31209L0, 0.0f, 0.0f, null, null, null, new C13580a(100L), false, 2096895), 0.0f, 0.0f, AbstractC17678l.m19291N(new C16829a[0]), new C16830b(), null, null, false, 2097055), 0.0f, 0.0f, null, null, null, null, true, 2031615), AbstractC8639g4.m9297a(this.f18492Y), 0.0f, null, null, null, null, false, 2097149), 0.0f, 0.0f, null, null, new C18643e(new C8258a()), null, false, 2097023);
        Object obj2 = c10523fM10975a.f31206u.get("_dd.telemetry.configuration_sample_rate");
        Float fValueOf = (obj2 == null || !(obj2 instanceof Number)) ? null : Float.valueOf(((Number) obj2).floatValue());
        this.f18495p0 = new C9669d(fValueOf != null ? C10523f.m10975a(c10523fM10975a, 0.0f, fValueOf.floatValue(), null, null, null, null, false, 2097143) : c10523fM10975a);
        C11248s c11248s = AbstractC10516b.f31164a;
        synchronized (c11248s) {
            if (((InterfaceC13823a) ((LinkedHashMap) c11248s.f34082o0).get("_dd.sdk_core.default")) != null) {
                AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 4, EnumC11255b.f34098Y, C10515a.f31161Z, null, false, 56);
            } else {
                String strM17964p = AbstractC10516b.f31165b.m17964p("null/" + c14422dM15934a2.f45326h.f31169Y);
                if (strM17964p == null) {
                    AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 5, EnumC11255b.f34098Y, C10515a.f31162o0, null, false, 56);
                } else {
                    String str = "_dd.sdk_core.default";
                    C16354g c16354g = new C16354g(appContext, strM17964p, "_dd.sdk_core.default");
                    c16354g.m17954y(c14423e);
                    c16354g.m17953x().f50770i.mo13165i();
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c11248s.f34082o0;
                    if (linkedHashMap2.containsKey("_dd.sdk_core.default")) {
                        AbstractC7889G0.m8184b((C17878e) c11248s.f34081Z, 4, EnumC11255b.f34098Y, new C0846c(str, 25), null, false, 56);
                    } else {
                        linkedHashMap2.put("_dd.sdk_core.default", c16354g);
                    }
                }
            }
        }
        InterfaceC13823a interfaceC13823aM10971a = AbstractC10516b.m10971a(null);
        interfaceC13823aM10971a.mo15457m(new C4957b(interfaceC13823aM10971a, c3650b));
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        AbstractC10516b.m10971a(null).mo15446b(AbstractC0168G.m535x("device_id", this.f18493Z.m2506a()));
        return C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }
}
