package p094De;

import android.app.Application;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.C11131E;
import ao.C11181o0;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import gd.InterfaceC13849E;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import mm.C17309l;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p046Bk.C1342O;
import p1081wc.C20873T;
import p1081wc.C20879Z;
import p1081wc.C20884c;
import p1081wc.InterfaceC20904w;
import p1155zi.C21891A;
import p1155zi.C22013h2;
import p1155zi.C22050r;
import p1155zi.EnumC21895B;
import p117Eb.C2392v;
import p120Ee.C2423q;
import p153Fn.C2925c;
import p195Hh.C3430e;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p523V9.AbstractC8160o6;
import p529Vh.C8291d;
import p530Vi.C8309e;
import p530Vi.C8312h;
import p594Y9.AbstractC9816U3;
import p594Y9.AbstractC9961r4;
import p646aj.AbstractC10623c;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17659D;
import p925oe.C18077B;
import p925oe.C18114g0;
import p925oe.C18122k0;
import p948pi.C18418a;

/* JADX INFO: renamed from: De.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2030m implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6233a = 3;

    /* JADX INFO: renamed from: b */
    public final C4474e f6234b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f6235c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f6236d;

    public C2030m(C4474e context, InterfaceC4478i interfaceC4478i, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f6234b = context;
        this.f6236d = interfaceC4478i;
        this.f6235c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        InterfaceC17068a interfaceC17068a = this.f6235c;
        InterfaceC4478i interfaceC4478i = this.f6236d;
        C4474e c4474e = this.f6234b;
        switch (this.f6233a) {
            case 0:
                Object obj = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C2029l((C2423q) obj, (InterfaceC13849E) obj2, (C17627a) obj3);
            case 1:
                Object obj4 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C18114g0((C17627a) obj4, (C18122k0) obj5, (C18077B) obj6);
            case 2:
                Object obj7 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                C8312h c8312h = (C8312h) obj8;
                Object obj9 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj9, "get(...)");
                C18418a c18418a = (C18418a) obj9;
                C20879Z c20879z = new C20879Z(c8312h, EnumC21895B.f69419Z);
                C21891A c21891a = c18418a.f58774b;
                C22013h2 c22013h2 = c21891a.f69416b;
                String userId = c22013h2.f69655a;
                C3430e c3430e = c20879z.f66494c;
                StringBuilder sbM11058p = AbstractC10763a.m11058p("SegmentAnalytics update session: ", userId, ", ");
                String str = c22013h2.f69656b;
                sbM11058p.append(str);
                AbstractC8160o6.m8726a(c3430e, sbM11058p.toString(), null, 6);
                C17309l c17309l = new C17309l("email", str);
                String strM22322a = c21891a.m22322a();
                C17309l c17309l2 = new C17309l("workspace_id", strM22322a != null ? new C22050r(strM22322a) : null);
                C17309l c17309l3 = new C17309l("auth_status", c18418a.f58773a.f58783b ? "logged_out" : "logged_in");
                C17309l c17309l4 = new C17309l("account_has_plus", Boolean.valueOf(AbstractC16544l.m18089b(c21891a.m22328g(), "plus")));
                C17309l c17309l5 = new C17309l("has_active_subscription", Boolean.valueOf(c21891a.m22325d()));
                String strM22328g = c21891a.m22328g();
                if (strM22328g == null) {
                    strM22328g = "";
                }
                Map mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, new C17309l("plan_type", strM22328g), new C17309l("app_version", "1.2025.007"));
                C11131E c11131e = new C11131E(C11181o0.f33827a, AbstractC9961r4.m10615b(AbstractC9816U3.m10451b(AbstractC10623c.f31524a.f34844b, AbstractC16526C.f51263a.mo5693b(Object.class))), 1);
                AbstractC16544l.m18094g(userId, "userId");
                C16644c c16644cM12917j = AbstractC11523k.m12917j(AbstractC11516d.f34842d.m12904c(c11131e, mapM19244f));
                C2392v c2392v = c8312h.f25903Z;
                AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8309e(c8312h, userId, c16644cM12917j, null), 2);
                c8312h.m8934d(new IdentifyEvent(userId, c16644cM12917j), null);
                return c20879z;
            default:
                Object obj10 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj10, "get(...)");
                Object obj11 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C20873T((Application) obj10, (C8291d) obj11, (InterfaceC20904w) obj12);
        }
    }

    public C2030m(C4474e coroutineScope, InterfaceC17068a unreadConversationStore, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(unreadConversationStore, "unreadConversationStore");
        this.f6234b = coroutineScope;
        this.f6235c = unreadConversationStore;
        this.f6236d = interfaceC4478i;
    }

    public C2030m(InterfaceC4478i interfaceC4478i, InterfaceC17068a experimentManager, C4474e coroutineScope) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f6236d = interfaceC4478i;
        this.f6235c = experimentManager;
        this.f6234b = coroutineScope;
    }

    public C2030m(C20884c c20884c, InterfaceC17068a servicesConfig, InterfaceC4478i interfaceC4478i, C4474e accountSession, C1342O c1342o) {
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f6235c = servicesConfig;
        this.f6236d = interfaceC4478i;
        this.f6234b = accountSession;
    }
}
