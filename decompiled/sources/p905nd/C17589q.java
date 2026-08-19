package p905nd;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.C10808o;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.auth0.android.jwt.C11837a;
import com.auth0.android.jwt.C11839c;
import com.auth0.android.jwt.C11840d;
import com.auth0.android.result.Credentials;
import ec.AbstractC13361c;
import ga.C13834b;
import gd.C13920b1;
import gd.C13925c2;
import gd.C13929d2;
import gd.C13933e2;
import gd.C13993t2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import ni.C17629c;
import p001A.C0017I0;
import p009A7.FlM.nkFZpTrMPpn;
import p014Ac.AbstractC0424a;
import p014Ac.C0425b;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p071Ch.C1676g;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1081wc.C20889h;
import p1081wc.InterfaceC20904w;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p1149zc.C21843e;
import p1149zc.C21845g;
import p1149zc.C21846h;
import p1149zc.C21848j;
import p1149zc.C21857s;
import p1149zc.C21859u;
import p1149zc.C21860v;
import p1149zc.C21861w;
import p1149zc.InterfaceC21862x;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p117Eb.C2391u;
import p124Ei.C2484W0;
import p167Gb.C3032c;
import p171Gh.EnumC3058a;
import p195Hh.C3430e;
import p241Jc.C4327b;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p313Mc.C5317a;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p364Oh.C6226E;
import p404Qe.C6665a;
import p446S6.C7022a;
import p446S6.C7023b;
import p472T6.C7258a;
import p472T6.C7259b;
import p521V6.AbstractC7807J;
import p521V6.C7815h;
import p521V6.C7817j;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8670m;
import p571X9.AbstractC9233X;
import p817j$.time.Duration;
import p817j$.time.Instant;
import p817j$.util.DateRetargetClass;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p948pi.C18422e;
import p948pi.C18423f;
import p948pi.C18424g;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nd.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C17589q extends AbstractC0424a {

    /* JADX INFO: renamed from: q */
    public static final List f56293q = AbstractC17681o.m19382k("openid", "email", "profile", "offline_access", "model.request", "model.read", "organization.read", "organization.write");

    /* JADX INFO: renamed from: r */
    public static final C7817j f56294r = new C7817j((C7815h) C7817j.m8082b().f9127Z);

    /* JADX INFO: renamed from: s */
    public static final C7817j f56295s;

    /* JADX INFO: renamed from: c */
    public final Application f56296c;

    /* JADX INFO: renamed from: d */
    public final C1676g f56297d;

    /* JADX INFO: renamed from: e */
    public final C17591s f56298e;

    /* JADX INFO: renamed from: f */
    public final C7022a f56299f;

    /* JADX INFO: renamed from: g */
    public final C7258a f56300g;

    /* JADX INFO: renamed from: h */
    public final C6226E f56301h;

    /* JADX INFO: renamed from: i */
    public final C4327b f56302i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f56303j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC13849E f56304k;

    /* JADX INFO: renamed from: l */
    public final C13993t2 f56305l;

    /* JADX INFO: renamed from: m */
    public final C3430e f56306m;

    /* JADX INFO: renamed from: n */
    public final C4816c f56307n;

    /* JADX INFO: renamed from: o */
    public final C2153Q0 f56308o;

    /* JADX INFO: renamed from: p */
    public final C2153Q0 f56309p;

    static {
        C3032c c3032cM8082b = C7817j.m8082b();
        C7815h c7815h = new C7815h(AbstractC0424a.f1397b);
        c3032cM8082b.f9127Z = c7815h;
        f56295s = new C7817j(c7815h);
    }

    public C17589q(Application application, C17572E c17572e, C17629c c17629c, C1676g c1676g, C17591s c17591s, C7022a c7022a, C7258a c7258a, C6226E c6226e, C4327b c4327b, InterfaceC20904w interfaceC20904w, InterfaceC13849E interfaceC13849E, C13993t2 c13993t2) {
        C2153Q0 c2153q0M3204c;
        super(c17572e);
        this.f56296c = application;
        this.f56297d = c1676g;
        this.f56298e = c17591s;
        this.f56299f = c7022a;
        this.f56300g = c7258a;
        this.f56301h = c6226e;
        this.f56302i = c4327b;
        this.f56303j = interfaceC20904w;
        this.f56304k = interfaceC13849E;
        this.f56305l = c13993t2;
        this.f56306m = AbstractC8168p6.m8749b("Auth0Auth", null);
        this.f56307n = AbstractC4817d.m5451a();
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(C21861w.f69331a);
        this.f56309p = c2153q0M3204c2;
        C5317a c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68235Z, null);
        c5317aM5877a.m5876b();
        C18422e c18422e = (C18422e) AbstractC0575H.m1161I(C18777j.f59682Y, new C17587o(c5317aM5877a, c17572e, null));
        C10808o c10808o = c7258a.f23027b;
        String strM11087u = c10808o.m11087u("com.auth0.access_token");
        String strM11087u2 = c10808o.m11087u("com.auth0.refresh_token");
        String strM11087u3 = c10808o.m11087u("com.auth0.id_token");
        SharedPreferences sharedPreferences = (SharedPreferences) c10808o.f32040Z;
        Long lValueOf = !sharedPreferences.contains("com.auth0.expires_at") ? null : Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
        if ((TextUtils.isEmpty(strM11087u) && TextUtils.isEmpty(strM11087u3)) || lValueOf == null || (c7258a.m7708c(lValueOf.longValue(), 0L) && strM11087u2 == null)) {
            C21860v c21860v = C21860v.f69330a;
            if (c18422e == null || !c18422e.f58783b) {
                C18422e c18422e2 = new C18422e(c1676g.m2506a(), true, (C5551u) null, 12);
                AbstractC0575H.m1156D(c17629c, null, null, new C17575c(c17572e, c18422e2, null), 3);
                c2153q0M3204c2.m3251l(null, c21860v);
                c2153q0M3204c = AbstractC2124C.m3204c(c18422e2);
            } else {
                c2153q0M3204c2.m3251l(null, c21860v);
                c2153q0M3204c = AbstractC2124C.m3204c(c18422e);
            }
        } else {
            AbstractC0575H.m1156D(c17629c, null, null, new C17573a(this, null), 3);
            c2153q0M3204c = c18422e != null ? AbstractC2124C.m3204c(c18422e) : AbstractC2124C.m3204c(C18423f.f58786a);
        }
        this.f56308o = c2153q0M3204c;
        c5317aM5877a.m5875a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p014Ac.AbstractC0424a
    /* JADX INFO: renamed from: b */
    public final Object mo1084b(AbstractC19687c abstractC19687c) {
        C17576d c17576d;
        C17589q c17589q;
        C18422e c18422e;
        if (abstractC19687c instanceof C17576d) {
            c17576d = (C17576d) abstractC19687c;
            int i10 = c17576d.f56229q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17576d.f56229q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17576d = new C17576d(this, abstractC19687c);
            }
        } else {
            c17576d = new C17576d(this, abstractC19687c);
        }
        Object obj = c17576d.f56227o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17576d.f56229q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C18422e c18422e2 = new C18422e(this.f56297d.m2506a(), true, (C5551u) null, 12);
            C17574b c17574b = new C17574b(c18422e2, 1);
            c17576d.f56225Y = this;
            c17576d.f56226Z = c18422e2;
            c17576d.f56229q0 = 1;
            if (this.f69335a.m21029b(c17574b, c17576d) == enumC19250a) {
                return enumC19250a;
            }
            c17589q = this;
            c18422e = c18422e2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18422e = c17576d.f56226Z;
            c17589q = c17576d.f56225Y;
            AbstractC9233X.m9807c(obj);
        }
        c17589q.f56308o.setValue(c18422e);
        C21860v c21860v = C21860v.f69330a;
        C2153Q0 c2153q0 = c17589q.f56309p;
        c2153q0.getClass();
        c2153q0.m3251l(null, c21860v);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116 A[Catch: c -> 0x0130, TryCatch #1 {c -> 0x0130, blocks: (B:37:0x00fe, B:41:0x011b, B:43:0x0129, B:47:0x0133, B:49:0x0137, B:52:0x013d, B:54:0x0145, B:56:0x0149, B:58:0x014d, B:40:0x0116), top: B:67:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0129 A[Catch: c -> 0x0130, TryCatch #1 {c -> 0x0130, blocks: (B:37:0x00fe, B:41:0x011b, B:43:0x0129, B:47:0x0133, B:49:0x0137, B:52:0x013d, B:54:0x0145, B:56:0x0149, B:58:0x014d, B:40:0x0116), top: B:67:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137 A[Catch: c -> 0x0130, TryCatch #1 {c -> 0x0130, blocks: (B:37:0x00fe, B:41:0x011b, B:43:0x0129, B:47:0x0133, B:49:0x0137, B:52:0x013d, B:54:0x0145, B:56:0x0149, B:58:0x014d, B:40:0x0116), top: B:67:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[Catch: c -> 0x0130, TryCatch #1 {c -> 0x0130, blocks: (B:37:0x00fe, B:41:0x011b, B:43:0x0129, B:47:0x0133, B:49:0x0137, B:52:0x013d, B:54:0x0145, B:56:0x0149, B:58:0x014d, B:40:0x0116), top: B:67:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0144  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149 A[Catch: c -> 0x0130, TryCatch #1 {c -> 0x0130, blocks: (B:37:0x00fe, B:41:0x011b, B:43:0x0129, B:47:0x0133, B:49:0x0137, B:52:0x013d, B:54:0x0145, B:56:0x0149, B:58:0x014d, B:40:0x0116), top: B:67:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // p014Ac.AbstractC0424a
    /* JADX INFO: renamed from: c */
    public final Object mo1085c(Credentials credentials, AbstractC13361c abstractC13361c, AbstractC19687c abstractC19687c) {
        C17582j c17582j;
        String strM19218a;
        Object c18422e;
        C17589q c17589q;
        C20889h c20889h;
        Application application;
        InterfaceC20904w interfaceC20904w;
        C0425b c0425b;
        C11837a c11837a;
        Map map;
        Object obj;
        String str;
        Object obj2;
        Boolean bool;
        if (abstractC19687c instanceof C17582j) {
            c17582j = (C17582j) abstractC19687c;
            int i10 = c17582j.f56257s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17582j.f56257s0 = i10 - Integer.MIN_VALUE;
            } else {
                c17582j = new C17582j(this, abstractC19687c);
            }
        } else {
            c17582j = new C17582j(this, abstractC19687c);
        }
        Object obj3 = c17582j.f56255q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17582j.f56257s0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj3);
                try {
                    this.f56300g.m7707b(credentials);
                    C21857s c21857s = new C21857s(credentials);
                    C2153Q0 c2153q0 = this.f56309p;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, c21857s);
                    strM19218a = AbstractC17569B.m19218a(credentials);
                    if (strM19218a != null) {
                        C6665a c6665a = new C6665a(strM19218a, 14);
                        c17582j.f56251Y = this;
                        c17582j.f56252Z = credentials;
                        c17582j.f56253o0 = abstractC13361c;
                        c17582j.f56254p0 = strM19218a;
                        c17582j.f56257s0 = 1;
                        if (this.f69335a.m21029b(c6665a, c17582j) == enumC19250a) {
                            return enumC19250a;
                        }
                        c17589q = this;
                    } else {
                        c18422e = C18423f.f58786a;
                        c17589q = this;
                    }
                    c20889h = C20889h.f66555k;
                    application = c17589q.f56296c;
                    interfaceC20904w = c17589q.f56303j;
                    if (abstractC13361c != null) {
                        C17309l c17309l = new C17309l("connection", abstractC13361c.mo14946a());
                        String strM9363b = AbstractC8670m.m9363b(application);
                        interfaceC20904w.mo21447a(c20889h, AbstractC17659D.m19244f(c17309l, new C17309l("default_browser", strM9363b != null ? strM9363b : "unknown")));
                    } else {
                        String strM9363b2 = AbstractC8670m.m9363b(application);
                        interfaceC20904w.mo21447a(c20889h, AbstractC17660E.m19258c(new C17309l("default_browser", strM9363b2 != null ? strM9363b2 : "unknown")));
                    }
                    AbstractC8160o6.m8728c(c17589q.f56306m, "Updated credentials, new session " + c18422e, null, null, 6);
                    C2153Q0 c2153q1 = c17589q.f56308o;
                    c2153q1.getClass();
                    c2153q1.m3251l(null, c18422e);
                    C3430e c3430e = AbstractC17569B.f56213a;
                    c11837a = (C11837a) new C11840d(credentials.getAccessToken()).f35960o0.f35962b.get("https://api.openai.com/profile");
                    if (c11837a != null) {
                        c11837a = new C11837a();
                    }
                    map = (Map) c11837a.mo13151a();
                    String strM19218a2 = AbstractC17569B.m19218a(credentials);
                    if (map != null) {
                        obj = map.get("email");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    if (map != null) {
                        obj2 = map.get("email_verified");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    } else {
                        bool = null;
                    }
                    c0425b = new C0425b(strM19218a2, str, bool);
                    return new C21952P1(c0425b);
                } catch (C7259b unused) {
                    return new C21945N1(0, C21846h.f69312Y);
                }
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c17582j.f56254p0;
            abstractC13361c = c17582j.f56253o0;
            Credentials credentials2 = c17582j.f56252Z;
            c17589q = c17582j.f56251Y;
            AbstractC9233X.m9807c(obj3);
            strM19218a = str2;
            credentials = credentials2;
            c11837a = (C11837a) new C11840d(credentials.getAccessToken()).f35960o0.f35962b.get("https://api.openai.com/profile");
            if (c11837a != null) {
                c11837a = new C11837a();
            }
            map = (Map) c11837a.mo13151a();
            String strM19218a3 = AbstractC17569B.m19218a(credentials);
            if (map != null) {
                obj = map.get("email");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (map != null) {
                obj2 = map.get("email_verified");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Boolean) {
                bool = (Boolean) obj2;
            } else {
                bool = null;
            }
            c0425b = new C0425b(strM19218a3, str, bool);
        } catch (C11839c e10) {
            AbstractC8160o6.m8731f(AbstractC17569B.f56213a, "Failed to decode profile claim for token: " + e10, null, null, 6);
            c0425b = new C0425b(null, null, null);
        }
        Date expiresAt = credentials.getExpiresAt();
        c17589q.getClass();
        Instant instant = DateRetargetClass.toInstant(expiresAt);
        C5550t c5550t = C5551u.Companion;
        long epochSecond = instant.getEpochSecond();
        long nano = instant.getNano();
        c5550t.getClass();
        c18422e = new C18422e(strM19218a, false, C5550t.m5943b(epochSecond, nano), 2);
        c20889h = C20889h.f66555k;
        application = c17589q.f56296c;
        interfaceC20904w = c17589q.f56303j;
        if (abstractC13361c != null) {
            C17309l c17309l2 = new C17309l("connection", abstractC13361c.mo14946a());
            String strM9363b3 = AbstractC8670m.m9363b(application);
            interfaceC20904w.mo21447a(c20889h, AbstractC17659D.m19244f(c17309l2, new C17309l("default_browser", strM9363b3 != null ? strM9363b3 : "unknown")));
        } else {
            String strM9363b4 = AbstractC8670m.m9363b(application);
            interfaceC20904w.mo21447a(c20889h, AbstractC17660E.m19258c(new C17309l("default_browser", strM9363b4 != null ? strM9363b4 : "unknown")));
        }
        AbstractC8160o6.m8728c(c17589q.f56306m, "Updated credentials, new session " + c18422e, null, null, 6);
        C2153Q0 c2153q2 = c17589q.f56308o;
        c2153q2.getClass();
        c2153q2.m3251l(null, c18422e);
        C3430e c3430e2 = AbstractC17569B.f56213a;
        return new C21952P1(c0425b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p014Ac.AbstractC0424a
    /* JADX INFO: renamed from: d */
    public final Object mo1086d(Context context, AbstractC13361c abstractC13361c, C13834b c13834b, String str, String str2, AbstractC19687c abstractC19687c) {
        C17588p c17588p;
        Context context2;
        AbstractC13361c abstractC13361c2;
        C13834b c13834b2;
        String str3;
        String str4;
        C17589q c17589q;
        if (abstractC19687c instanceof C17588p) {
            c17588p = (C17588p) abstractC19687c;
            int i10 = c17588p.f56292u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17588p.f56292u0 = i10 - Integer.MIN_VALUE;
            } else {
                c17588p = new C17588p(this, abstractC19687c);
            }
        } else {
            c17588p = new C17588p(this, abstractC19687c);
        }
        C17588p c17588p2 = c17588p;
        Object objM19223i = c17588p2.f56290s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17588p2.f56292u0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19223i);
            c17588p2.f56284Y = this;
            context2 = context;
            c17588p2.f56285Z = context2;
            abstractC13361c2 = abstractC13361c;
            c17588p2.f56286o0 = abstractC13361c2;
            c17588p2.f56287p0 = c13834b;
            c17588p2.f56288q0 = str;
            c17588p2.f56289r0 = str2;
            c17588p2.f56292u0 = 1;
            objM19223i = m19223i(context, abstractC13361c, c13834b, null, str, str2, true, c17588p2);
            if (objM19223i == enumC19250a) {
                return enumC19250a;
            }
            c13834b2 = c13834b;
            str3 = str;
            str4 = str2;
            c17589q = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC9233X.m9807c(objM19223i);
                    return (AbstractC21955Q1) objM19223i;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM19223i);
                return (AbstractC21955Q1) objM19223i;
            }
            String str5 = c17588p2.f56289r0;
            str3 = c17588p2.f56288q0;
            c13834b2 = c17588p2.f56287p0;
            AbstractC13361c abstractC13361c3 = c17588p2.f56286o0;
            Context context3 = c17588p2.f56285Z;
            c17589q = c17588p2.f56284Y;
            AbstractC9233X.m9807c(objM19223i);
            str4 = str5;
            abstractC13361c2 = abstractC13361c3;
            context2 = context3;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19223i;
        if ((abstractC21955Q1 instanceof C21952P1) || (abstractC21955Q1 instanceof C21929J1)) {
            return abstractC21955Q1;
        }
        if (!(abstractC21955Q1 instanceof AbstractC21933K1)) {
            throw new C0644w();
        }
        AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
        Throwable th2 = abstractC21933K1.f69485a;
        if (c13834b2 != null) {
            c17588p2.f56284Y = null;
            c17588p2.f56285Z = null;
            c17588p2.f56286o0 = null;
            c17588p2.f56287p0 = null;
            c17588p2.f56288q0 = null;
            c17588p2.f56289r0 = null;
            c17588p2.f56292u0 = 2;
            objM19223i = c17589q.m19223i(context2, abstractC13361c2, null, c13834b2.f43869d, str3, str4, true, c17588p2);
            if (objM19223i == enumC19250a) {
                return enumC19250a;
            }
            return (AbstractC21955Q1) objM19223i;
        }
        if (!(th2 instanceof C21843e)) {
            return abstractC21933K1;
        }
        AbstractC8160o6.m8731f(c17589q.f56306m, "Browser unavailable, retrying without allowlist", null, null, 6);
        c17588p2.f56284Y = null;
        c17588p2.f56285Z = null;
        c17588p2.f56286o0 = null;
        c17588p2.f56287p0 = null;
        c17588p2.f56288q0 = null;
        c17588p2.f56289r0 = null;
        c17588p2.f56292u0 = 3;
        objM19223i = c17589q.m19223i(context2, abstractC13361c2, null, null, str3, str4, false, c17588p2);
        if (objM19223i == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC21955Q1) objM19223i;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:37:0x00a7, B:39:0x00b3, B:41:0x00d5, B:47:0x00e4), top: B:60:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:37:0x00a7, B:39:0x00b3, B:41:0x00d5, B:47:0x00e4), top: B:60:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:51:0x00f4, B:53:0x00ff), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m19219e(AbstractC19687c abstractC19687c) throws Throwable {
        C17578f c17578f;
        C17589q c17589q;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        Throwable th2;
        InterfaceC21862x interfaceC21862x;
        Object objM19225k;
        C17589q c17589q2;
        C21857s c21857s;
        InterfaceC21862x interfaceC21862x2;
        Credentials credentials;
        if (abstractC19687c instanceof C17578f) {
            c17578f = (C17578f) abstractC19687c;
            int i10 = c17578f.f56237q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17578f.f56237q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17578f = new C17578f(this, abstractC19687c);
            }
        } else {
            c17578f = new C17578f(this, abstractC19687c);
        }
        Object objM3221t = c17578f.f56235o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17578f.f56237q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            C2484W0 c2484w0 = new C2484W0(this.f56309p, 4);
            c17578f.f56233Y = this;
            c17578f.f56237q0 = 1;
            objM3221t = AbstractC2124C.m3221t(c2484w0, c17578f);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            c17589q = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC4814a2 = c17578f.f56234Z;
                    c17589q2 = c17578f.f56233Y;
                    try {
                        AbstractC9233X.m9807c(objM3221t);
                        interfaceC4814a2 = interfaceC4814a2;
                        interfaceC21862x2 = (InterfaceC21862x) objM3221t;
                        c17589q2.f56309p.setValue(interfaceC21862x2);
                        if (interfaceC21862x2 instanceof C21857s) {
                            credentials = ((C21857s) interfaceC21862x2).f69327a;
                        } else {
                            credentials = null;
                        }
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        return credentials;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th2;
                    }
                }
                InterfaceC4814a interfaceC4814a3 = c17578f.f56234Z;
                C17589q c17589q3 = c17578f.f56233Y;
                AbstractC9233X.m9807c(objM3221t);
                interfaceC4814a = interfaceC4814a3;
                c17589q = c17589q3;
                try {
                    interfaceC21862x = (InterfaceC21862x) c17589q.f56309p.getValue();
                    if (interfaceC21862x instanceof C21857s) {
                        c21857s = (C21857s) interfaceC21862x;
                        c21857s.getClass();
                        if (Instant.now().plus(Duration.ofMinutes(5L)).isBefore(DateRetargetClass.toInstant(c21857s.f69327a.getExpiresAt()))) {
                            Credentials credentials2 = ((C21857s) interfaceC21862x).f69327a;
                            ((C4816c) interfaceC4814a).m5450g(null);
                            return credentials2;
                        }
                    }
                    c17578f.f56233Y = c17589q;
                    c17578f.f56234Z = interfaceC4814a;
                    c17578f.f56237q0 = 3;
                    objM19225k = c17589q.m19225k(c17578f);
                    if (objM19225k == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC4814a2 = interfaceC4814a;
                    objM3221t = objM19225k;
                    c17589q2 = c17589q;
                    interfaceC21862x2 = (InterfaceC21862x) objM3221t;
                    c17589q2.f56309p.setValue(interfaceC21862x2);
                    if (interfaceC21862x2 instanceof C21857s) {
                        credentials = ((C21857s) interfaceC21862x2).f69327a;
                    } else {
                        credentials = null;
                    }
                    ((C4816c) interfaceC4814a2).m5450g(null);
                    return credentials;
                } catch (Throwable th4) {
                    interfaceC4814a2 = interfaceC4814a;
                    th2 = th4;
                    ((C4816c) interfaceC4814a2).m5450g(null);
                    throw th2;
                }
            }
            c17589q = c17578f.f56233Y;
            AbstractC9233X.m9807c(objM3221t);
        }
        InterfaceC21862x interfaceC21862x3 = (InterfaceC21862x) objM3221t;
        boolean z6 = interfaceC21862x3 instanceof C21857s;
        if (z6) {
            C21857s c21857s2 = (C21857s) interfaceC21862x3;
            c21857s2.getClass();
            Instant instantPlus = Instant.now().plus(Duration.ofMinutes(5L));
            Credentials credentials3 = c21857s2.f69327a;
            if (instantPlus.isBefore(DateRetargetClass.toInstant(credentials3.getExpiresAt()))) {
                return credentials3;
            }
        }
        if (!z6 && !(interfaceC21862x3 instanceof C21859u)) {
            return null;
        }
        C4816c c4816c = c17589q.f56307n;
        c17578f.f56233Y = c17589q;
        c17578f.f56234Z = c4816c;
        c17578f.f56237q0 = 2;
        Object objM5448e = c4816c.m5448e(null, c17578f);
        interfaceC4814a = c4816c;
        if (objM5448e == enumC19250a) {
            return enumC19250a;
        }
        interfaceC21862x = (InterfaceC21862x) c17589q.f56309p.getValue();
        if (interfaceC21862x instanceof C21857s) {
            c21857s = (C21857s) interfaceC21862x;
            c21857s.getClass();
            if (Instant.now().plus(Duration.ofMinutes(5L)).isBefore(DateRetargetClass.toInstant(c21857s.f69327a.getExpiresAt()))) {
                Credentials credentials4 = ((C21857s) interfaceC21862x).f69327a;
                ((C4816c) interfaceC4814a).m5450g(null);
                return credentials4;
            }
        }
        c17578f.f56233Y = c17589q;
        c17578f.f56234Z = interfaceC4814a;
        c17578f.f56237q0 = 3;
        objM19225k = c17589q.m19225k(c17578f);
        if (objM19225k == enumC19250a) {
            return enumC19250a;
        }
        interfaceC4814a2 = interfaceC4814a;
        objM3221t = objM19225k;
        c17589q2 = c17589q;
        interfaceC21862x2 = (InterfaceC21862x) objM3221t;
        c17589q2.f56309p.setValue(interfaceC21862x2);
        if (interfaceC21862x2 instanceof C21857s) {
            credentials = ((C21857s) interfaceC21862x2).f69327a;
        } else {
            credentials = null;
        }
        ((C4816c) interfaceC4814a2).m5450g(null);
        return credentials;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public final Object m19221g(AbstractC19687c abstractC19687c) {
        C17580h c17580h;
        C17589q c17589q;
        C17589q c17589q2;
        String str;
        String refreshToken;
        String str2;
        if (abstractC19687c instanceof C17580h) {
            c17580h = (C17580h) abstractC19687c;
            int i10 = c17580h.f56245q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17580h.f56245q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17580h = new C17580h(this, abstractC19687c);
            }
        } else {
            c17580h = new C17580h(this, abstractC19687c);
        }
        Object objM7706a = c17580h.f56243o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17580h.f56245q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM7706a);
                AbstractC8160o6.m8728c(this.f56306m, "Forcing credentials renewal", null, null, 6);
                C7258a c7258a = this.f56300g;
                c17580h.f56241Y = this;
                c17580h.f56245q0 = 1;
                objM7706a = c7258a.m7706a(c17580h);
                if (objM7706a == enumC19250a) {
                    return enumC19250a;
                }
                c17589q = this;
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        str = c17580h.f56242Z;
                        c17589q2 = c17580h.f56241Y;
                        try {
                            AbstractC9233X.m9807c(objM7706a);
                            Credentials credentials = (Credentials) objM7706a;
                            String idToken = credentials.getIdToken();
                            String accessToken = credentials.getAccessToken();
                            String type = credentials.getType();
                            refreshToken = credentials.getRefreshToken();
                            if (refreshToken == null) {
                                str2 = str;
                            } else {
                                str2 = refreshToken;
                            }
                            Credentials credentials2 = new Credentials(idToken, accessToken, type, str2, credentials.getExpiresAt(), credentials.getScope());
                            c17580h.f56241Y = null;
                            c17580h.f56242Z = null;
                            c17580h.f56245q0 = 3;
                            objM7706a = c17589q2.mo1085c(credentials2, null, c17580h);
                            if (objM7706a == enumC19250a) {
                                return enumC19250a;
                            }
                        } catch (C7023b e10) {
                            e = e10;
                            c17589q2.f56306m.mo4187b("Renew credentials failed", e, AbstractC17660E.m19258c(new C17309l("description", e.m7419b())));
                            return new C21941M1(new C21848j(e.m7419b()));
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM7706a);
                    }
                    return objM7706a;
                }
                c17589q = c17580h.f56241Y;
                AbstractC9233X.m9807c(objM7706a);
            }
            String refreshToken2 = ((Credentials) objM7706a).getRefreshToken();
            if (refreshToken2 == null) {
                return new C21945N1(0, C21845g.f69311Y);
            }
            try {
                C0017I0 c0017i0M7417b = c17589q.f56299f.m7417b(refreshToken2);
                c17580h.f56241Y = c17589q;
                c17580h.f56242Z = refreshToken2;
                c17580h.f56245q0 = 2;
                Object objM73h = c0017i0M7417b.m73h(c17580h);
                if (objM73h == enumC19250a) {
                    return enumC19250a;
                }
                C17589q c17589q3 = c17589q;
                str = refreshToken2;
                objM7706a = objM73h;
                c17589q2 = c17589q3;
                Credentials credentials3 = (Credentials) objM7706a;
                String idToken2 = credentials3.getIdToken();
                String accessToken2 = credentials3.getAccessToken();
                String type2 = credentials3.getType();
                refreshToken = credentials3.getRefreshToken();
                if (refreshToken == null) {
                    str2 = str;
                } else {
                    str2 = refreshToken;
                }
                Credentials credentials4 = new Credentials(idToken2, accessToken2, type2, str2, credentials3.getExpiresAt(), credentials3.getScope());
                c17580h.f56241Y = null;
                c17580h.f56242Z = null;
                c17580h.f56245q0 = 3;
                objM7706a = c17589q2.mo1085c(credentials4, null, c17580h);
                if (objM7706a == enumC19250a) {
                    return enumC19250a;
                }
                return objM7706a;
            } catch (C7023b e11) {
                e = e11;
                c17589q2 = c17589q;
                c17589q2.f56306m.mo4187b("Renew credentials failed", e, AbstractC17660E.m19258c(new C17309l("description", e.m7419b())));
                return new C21941M1(new C21848j(e.m7419b()));
            }
        } catch (C7259b unused) {
            return new C21945N1(0, C21845g.f69311Y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0117 A[PHI: r11 r12
      0x0117: PHI (r11v15 java.util.Map) = (r11v13 java.util.Map), (r11v16 java.util.Map) binds: [B:39:0x00f9, B:44:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r12v16 nd.q) = (r12v14 nd.q), (r12v17 nd.q) binds: [B:39:0x00f9, B:44:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m19222h(String str, AbstractC13361c abstractC13361c, String str2, String str3, AbstractC19687c abstractC19687c) {
        C17581i c17581i;
        C17589q c17589q;
        Map map;
        if (abstractC19687c instanceof C17581i) {
            c17581i = (C17581i) abstractC19687c;
            int i10 = c17581i.f56250q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17581i.f56250q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17581i = new C17581i(this, abstractC19687c);
            }
        } else {
            c17581i = new C17581i(this, abstractC19687c);
        }
        Object objM15480b = c17581i.f56248o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17581i.f56250q0;
        if (i11 != 0) {
            if (i11 == 1) {
                map = c17581i.f56247Z;
                c17589q = (C17589q) c17581i.f56246Y;
                AbstractC9233X.m9807c(objM15480b);
            } else if (i11 == 2) {
                map = c17581i.f56247Z;
                c17589q = (C17589q) c17581i.f56246Y;
                AbstractC9233X.m9807c(objM15480b);
                if (((Boolean) objM15480b).booleanValue()) {
                    map.put("ext-login-allow-phone", "true");
                }
                C13993t2 c13993t2 = c17589q.f56305l;
                C13929d2 c13929d2 = C13929d2.f43979d;
                c17581i.f56246Y = c17589q;
                c17581i.f56247Z = map;
                c17581i.f56250q0 = 3;
                objM15480b = c13993t2.m15480b(c13929d2, c17581i);
                if (objM15480b == enumC19250a) {
                    return enumC19250a;
                }
                if (((Boolean) objM15480b).booleanValue()) {
                    map.put("ext-signup-allow-phone", "true");
                }
                C13993t2 c13993t3 = c17589q.f56305l;
                C13933e2 c13933e2 = C13933e2.f43983d;
                c17581i.f56246Y = map;
                c17581i.f56247Z = null;
                c17581i.f56250q0 = 4;
                objM15480b = c13993t3.m15480b(c13933e2, c17581i);
                if (objM15480b == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i11 == 3) {
                map = c17581i.f56247Z;
                c17589q = (C17589q) c17581i.f56246Y;
                AbstractC9233X.m9807c(objM15480b);
                if (((Boolean) objM15480b).booleanValue()) {
                    map.put("ext-signup-allow-phone", "true");
                }
                C13993t2 c13993t4 = c17589q.f56305l;
                C13933e2 c13933e3 = C13933e2.f43983d;
                c17581i.f56246Y = map;
                c17581i.f56247Z = null;
                c17581i.f56250q0 = 4;
                objM15480b = c13993t4.m15480b(c13933e3, c17581i);
                if (objM15480b == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) c17581i.f56246Y;
                AbstractC9233X.m9807c(objM15480b);
            }
            if (((Boolean) objM15480b).booleanValue()) {
                map.put("ext-use-new-phone-ui", "true");
            }
            return map;
        }
        AbstractC9233X.m9807c(objM15480b);
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("android_device_id", this.f56297d.m2506a()));
        if (str == null) {
            linkedHashMapM19246h.put(SDPKeywords.PROMPT, "login");
        } else {
            linkedHashMapM19246h.put("login_hint", str);
        }
        String str4 = abstractC13361c.f42401b;
        if (str4 != null) {
            linkedHashMapM19246h.put("screen_hint", str4);
        }
        if (str2 != null) {
            linkedHashMapM19246h.put("preauth_cookie", str2);
        } else if (str3 != null) {
            linkedHashMapM19246h.put("preauth_cookie_failed", str3);
        }
        Application application = this.f56296c;
        if (application.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
            Object systemService = application.getSystemService("phone");
            AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            AbstractC16544l.m18093f(simCountryIso, "getSimCountryIso(...)");
            String upperCase = simCountryIso.toUpperCase(EnumC3058a.EN.f9226Y);
            AbstractC16544l.m18093f(upperCase, "toUpperCase(...)");
            linkedHashMapM19246h.put("sim_country_code", upperCase);
        }
        C13920b1 c13920b1 = C13920b1.f43971c;
        c17581i.f56246Y = this;
        c17581i.f56247Z = linkedHashMapM19246h;
        c17581i.f56250q0 = 1;
        Object objM15482b = ((C14005w2) this.f56304k).m15482b(c13920b1, c17581i);
        if (objM15482b == enumC19250a) {
            return enumC19250a;
        }
        c17589q = this;
        objM15480b = objM15482b;
        map = linkedHashMapM19246h;
        if (((Boolean) objM15480b).booleanValue()) {
            map.put("ext-login-allow-phone", "true");
        } else {
            C13993t2 c13993t5 = c17589q.f56305l;
            C13925c2 c13925c2 = C13925c2.f43975d;
            c17581i.f56246Y = c17589q;
            c17581i.f56247Z = map;
            c17581i.f56250q0 = 2;
            objM15480b = c13993t5.m15480b(c13925c2, c17581i);
            if (objM15480b == enumC19250a) {
                return enumC19250a;
            }
            if (((Boolean) objM15480b).booleanValue()) {
                map.put("ext-login-allow-phone", "true");
            }
        }
        C13993t2 c13993t6 = c17589q.f56305l;
        C13929d2 c13929d3 = C13929d2.f43979d;
        c17581i.f56246Y = c17589q;
        c17581i.f56247Z = map;
        c17581i.f56250q0 = 3;
        objM15480b = c13993t6.m15480b(c13929d3, c17581i);
        if (objM15480b == enumC19250a) {
            return enumC19250a;
        }
        if (((Boolean) objM15480b).booleanValue()) {
            map.put("ext-signup-allow-phone", "true");
        }
        C13993t2 c13993t7 = c17589q.f56305l;
        C13933e2 c13933e4 = C13933e2.f43983d;
        c17581i.f56246Y = map;
        c17581i.f56247Z = null;
        c17581i.f56250q0 = 4;
        objM15480b = c13993t7.m15480b(c13933e4, c17581i);
        if (objM15480b == enumC19250a) {
            return enumC19250a;
        }
        if (((Boolean) objM15480b).booleanValue()) {
            map.put("ext-use-new-phone-ui", "true");
        }
        return map;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m19223i(android.content.Context r29, ec.AbstractC13361c r30, ga.C13834b r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, sm.AbstractC19687c r36) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p905nd.C17589q.m19223i(android.content.Context, ec.c, ga.b, java.lang.String, java.lang.String, java.lang.String, boolean, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [nd.q] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3, types: [nd.q] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v5, types: [Eb.u] */
    /* JADX INFO: renamed from: j */
    public final Object m19224j(Context context, AbstractC19687c abstractC19687c) throws Throwable {
        C17584l c17584l;
        ?? r13;
        C17589q c17589q;
        if (abstractC19687c instanceof C17584l) {
            c17584l = (C17584l) abstractC19687c;
            int i10 = c17584l.f56271q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17584l.f56271q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17584l = new C17584l(this, abstractC19687c);
            }
        } else {
            c17584l = new C17584l(this, abstractC19687c);
        }
        Object obj = c17584l.f56269o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17584l.f56271q0;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        Context context2 = c17584l.f56268Z;
                        C17589q c17589q2 = (C17589q) c17584l.f56267Y;
                        AbstractC9233X.m9807c(obj);
                        r13 = context2;
                        c17589q = c17589q2;
                    } else if (i11 == 2) {
                        c17589q = (C17589q) c17584l.f56267Y;
                        AbstractC9233X.m9807c(obj);
                        c17584l.f56267Y = null;
                        c17584l.f56271q0 = 3;
                        context = c17589q.m19226l(c17584l);
                        if (context == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (i11 != 3 && i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) c17584l.f56267Y;
                            AbstractC9233X.m9807c(obj);
                            throw th2;
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                this.f56303j.mo21447a(C20889h.f66556l, C17690x.f56481Y);
                c17584l.f56267Y = this;
                c17584l.f56268Z = context;
                c17584l.f56271q0 = 1;
                if (this.f56302i.m5144a(c17584l) == enumC19250a) {
                    return enumC19250a;
                }
                r13 = context;
                c17589q = this;
                C17591s account = c17589q.f56298e;
                String str = AbstractC7807J.f24699a;
                AbstractC16544l.m18094g(account, "account");
                ?? c2391u = new C2391u(account);
                c2391u.m3512I();
                String returnToUrl = c17589q.f56301h.f20274f;
                AbstractC16544l.m18094g(returnToUrl, "returnToUrl");
                c2391u.f7431p0 = returnToUrl;
                c17584l.f56267Y = c17589q;
                c17584l.f56268Z = null;
                c17584l.f56271q0 = 2;
                if (c2391u.m3521r(r13, c17584l) == enumC19250a) {
                    return enumC19250a;
                }
                c17584l.f56267Y = null;
                c17584l.f56271q0 = 3;
                context = c17589q.m19226l(c17584l);
                if (context == enumC19250a) {
                    return enumC19250a;
                }
            } catch (C7023b e10) {
                context.f56306m.mo4187b("Logout failed", e10, AbstractC17660E.m19258c(new C17309l("description", e10.m7419b())));
                c17584l.f56267Y = null;
                c17584l.f56268Z = null;
                c17584l.f56271q0 = 4;
                if (context.m19226l(c17584l) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        } catch (Throwable th3) {
            ?? r14 = context;
            c17584l.f56267Y = th3;
            c17584l.f56268Z = null;
            c17584l.f56271q0 = 5;
            if (r14.m19226l(c17584l) == enumC19250a) {
                return enumC19250a;
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m19225k(AbstractC19687c abstractC19687c) {
        C17585m c17585m;
        C17589q c17589q;
        if (abstractC19687c instanceof C17585m) {
            c17585m = (C17585m) abstractC19687c;
            int i10 = c17585m.f56275p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17585m.f56275p0 = i10 - Integer.MIN_VALUE;
            } else {
                c17585m = new C17585m(this, abstractC19687c);
            }
        } else {
            c17585m = new C17585m(this, abstractC19687c);
        }
        Object objM7706a = c17585m.f56273Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17585m.f56275p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7706a);
            try {
                C7258a c7258a = this.f56300g;
                c17585m.f56272Y = this;
                c17585m.f56275p0 = 1;
                objM7706a = c7258a.m7706a(c17585m);
                if (objM7706a == enumC19250a) {
                    return enumC19250a;
                }
                c17589q = this;
            } catch (C7259b e10) {
                e = e10;
                c17589q = this;
                AbstractC8160o6.m8727b(c17589q.f56306m, "Failed to refresh credentials", e, 4);
                return C21859u.f69329a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17589q = c17585m.f56272Y;
            try {
                AbstractC9233X.m9807c(objM7706a);
            } catch (C7259b e11) {
                e = e11;
                AbstractC8160o6.m8727b(c17589q.f56306m, "Failed to refresh credentials", e, 4);
                return C21859u.f69329a;
            }
        }
        return new C21857s((Credentials) objM7706a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m19226l(AbstractC19687c abstractC19687c) {
        C17586n c17586n;
        C17589q c17589q;
        if (abstractC19687c instanceof C17586n) {
            c17586n = (C17586n) abstractC19687c;
            int i10 = c17586n.f56279p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17586n.f56279p0 = i10 - Integer.MIN_VALUE;
            } else {
                c17586n = new C17586n(this, abstractC19687c);
            }
        } else {
            c17586n = new C17586n(this, abstractC19687c);
        }
        Object obj = c17586n.f56277Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17586n.f56279p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C21861w c21861w = C21861w.f69331a;
            C2153Q0 c2153q0 = this.f56309p;
            c2153q0.getClass();
            c2153q0.m3251l(null, c21861w);
            C10808o c10808o = this.f56300g.f23027b;
            c10808o.m11086t("com.auth0.access_token");
            c10808o.m11086t("com.auth0.refresh_token");
            c10808o.m11086t("com.auth0.id_token");
            c10808o.m11086t("com.auth0.token_type");
            c10808o.m11086t("com.auth0.expires_at");
            c10808o.m11086t("com.auth0.scope");
            c10808o.m11086t("com.auth0.cache_expires_at");
            c17586n.f56276Y = this;
            c17586n.f56279p0 = 1;
            if (this.f69335a.m21028a(c17586n) == enumC19250a) {
                return enumC19250a;
            }
            c17589q = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17589q = c17586n.f56276Y;
            AbstractC9233X.m9807c(obj);
        }
        C2153Q0 c2153q1 = c17589q.f56308o;
        C18424g c18424g = C18424g.f58787a;
        c2153q1.getClass();
        c2153q1.m3251l(null, c18424g);
        C21860v c21860v = C21860v.f69330a;
        C2153Q0 c2153q2 = c17589q.f56309p;
        c2153q2.getClass();
        c2153q2.m3251l(null, c21860v);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m19220f(AbstractC19687c abstractC19687c) {
        C17579g c17579g;
        if (abstractC19687c instanceof C17579g) {
            c17579g = (C17579g) abstractC19687c;
            int i10 = c17579g.f56240o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17579g.f56240o0 = i10 - Integer.MIN_VALUE;
            } else {
                c17579g = new C17579g(this, abstractC19687c);
            }
        } else {
            c17579g = new C17579g(this, abstractC19687c);
        }
        Object objM7706a = c17579g.f56238Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17579g.f56240o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM7706a);
                C7258a c7258a = this.f56300g;
                c17579g.f56240o0 = 1;
                objM7706a = c7258a.m7706a(c17579g);
                if (objM7706a == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException(nkFZpTrMPpn.paVsNieIZH);
                }
                AbstractC9233X.m9807c(objM7706a);
            }
            return new C21952P1(((Credentials) objM7706a).m13175g());
        } catch (C7259b e10) {
            return new C21941M1(e10);
        } catch (IllegalArgumentException e11) {
            return new C21941M1(e11);
        }
    }
}
