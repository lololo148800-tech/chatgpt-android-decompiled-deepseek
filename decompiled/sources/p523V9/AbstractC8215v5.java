package p523V9;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.C0283r;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p1081wc.AbstractC20892k;
import p1081wc.InterfaceC20904w;
import p138F8.vJO.anhfj;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p257K3.C4535c;
import p729ej.AbstractC13422m;
import p729ej.C13408A;
import p729ej.C13411b;
import p729ej.C13429t;
import p729ej.C13433x;
import p729ej.InterfaceC13410a;
import p729ej.InterfaceC13427r;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: V9.v5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8215v5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25669a;

    /* JADX INFO: renamed from: a */
    public static C13411b m8839a(AbstractC13422m abstractC13422m, InterfaceC1436k update) {
        AbstractC16544l.m18094g(abstractC13422m, "<this>");
        AbstractC16544l.m18094g(update, "update");
        return new C13411b(update, new C0846c("", 18), abstractC13422m);
    }

    /* JADX INFO: renamed from: b */
    public static C13408A m8840b(InterfaceC1436k apply) {
        AbstractC16544l.m18094g(apply, "apply");
        return new C13408A(apply, 1, new C0846c("", 19));
    }

    /* JADX INFO: renamed from: c */
    public static final C17425e m8841c() {
        C17425e c17425e = f25669a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(19.0f, 6.41f);
        c4535c.m5288n(17.59f, 5.0f);
        c4535c.m5288n(12.0f, 10.59f);
        c4535c.m5288n(6.41f, 5.0f);
        c4535c.m5288n(5.0f, 6.41f);
        c4535c.m5288n(10.59f, 12.0f);
        c4535c.m5288n(5.0f, 17.59f);
        c4535c.m5288n(6.41f, 19.0f);
        c4535c.m5288n(12.0f, 13.41f);
        c4535c.m5288n(17.59f, 19.0f);
        c4535c.m5288n(19.0f, 17.59f);
        c4535c.m5288n(13.41f, 12.0f);
        c4535c.m5288n(19.0f, 6.41f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25669a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: d */
    public static final C13433x m8842d(AbstractC13422m abstractC13422m) {
        AbstractC16544l.m18094g(abstractC13422m, "<this>");
        C0283r c0283r = null;
        C13429t c13429t = abstractC13422m instanceof C13429t ? (C13429t) abstractC13422m : null;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(abstractC13422m.getClass());
        C13433x c13433x = c13429t == null ? null : c13429t.f42519c;
        if (c13429t != null) {
            c0283r = new C0283r(0, c13429t, C13429t.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0, 5);
        }
        return new C13433x(interfaceC3756dMo5693b, c13433x, c0283r);
    }

    /* JADX INFO: renamed from: e */
    public static final void m8843e(InterfaceC13410a interfaceC13410a, InterfaceC13427r worker, InterfaceC3777y workerType, String key, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC13410a, "<this>");
        AbstractC16544l.m18094g(worker, "worker");
        AbstractC16544l.m18094g(workerType, "workerType");
        AbstractC16544l.m18094g(key, "key");
        interfaceC13410a.mo3404p(new C13429t(workerType, key), worker, key, interfaceC1436k);
    }

    /* JADX INFO: renamed from: g */
    public static void m8845g(InterfaceC20904w interfaceC20904w, AbstractC20892k event, Object value, Map properties) {
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(properties, "properties");
        interfaceC20904w.mo21447a(event, AbstractC17659D.m19248j(properties, AbstractC17660E.m19258c(new C17309l(anhfj.Vpizyh, value))));
    }
}
