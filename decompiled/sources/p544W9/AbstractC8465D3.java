package p544W9;

import io.sentry.C15516w;
import io.sentry.android.core.C15188F;
import io.sentry.hints.InterfaceC15363b;
import io.sentry.hints.InterfaceC15365d;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0574G0;
import p044Bh.C1300m;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1155zi.C21908E0;
import p315Me.C5321a;
import p364Oh.C6228b;
import p364Oh.C6245s;
import p364Oh.C6246t;
import p384Ph.AbstractC6412b;
import p425Ra.C6828a;
import p479Td.C7351f0;
import p556Wk.C8913a0;
import p556Wk.C8920e;
import p556Wk.C8923f0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import pl.C18506a;

/* JADX INFO: renamed from: W9.D3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8465D3 {
    /* JADX INFO: renamed from: a */
    public static C15516w m9087a(Object obj) {
        C15516w c15516w = new C15516w();
        c15516w.m16729c("sentry:typeCheckHint", obj);
        return c15516w;
    }

    /* JADX INFO: renamed from: b */
    public static Object m9088b(C15516w c15516w) {
        Object obj;
        synchronized (c15516w) {
            obj = c15516w.f48466a.get("sentry:typeCheckHint");
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9089c(C15516w c15516w, Class cls) {
        return cls.isInstance(m9088b(c15516w));
    }

    /* JADX INFO: renamed from: d */
    public static final int m9090d(C7351f0 c7351f0) {
        List list = c7351f0.f23310y;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = ((C21908E0) it.next()).f69455d;
            if (str != null && AbstractC21329w.m21734u(str, "image/", false) && (i10 = i10 + 1) < 0) {
                AbstractC17681o.m19387p();
                throw null;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9091e(C15516w c15516w) {
        return Boolean.TRUE.equals(c15516w.m16728b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    /* JADX INFO: renamed from: f */
    public static final Map m9092f(Map map) {
        Object obj = map.get("message");
        String str = obj instanceof String ? (String) obj : null;
        return (str == null || !AbstractC21322p.m21667A(str, "cf_details", false)) ? map : AbstractC17659D.m19248j(map, AbstractC17660E.m19258c(new C17309l("reason", "cloudflare_error")));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9093g(C15516w c15516w) {
        return !(InterfaceC15365d.class.isInstance(m9088b(c15516w)) || InterfaceC15363b.class.isInstance(m9088b(c15516w))) || C15188F.class.isInstance(m9088b(c15516w));
    }

    /* JADX INFO: renamed from: h */
    public static final Map m9094h(Throwable th2) {
        if (th2 == null) {
            return C17690x.f56481Y;
        }
        if (th2 instanceof C5321a) {
            C17309l c17309l = new C17309l("reason", "empty_response");
            String message = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l, new C17309l("message", message != null ? message : ""));
        }
        if (th2 instanceof SocketTimeoutException ? true : th2 instanceof C0574G0) {
            C17309l c17309l2 = new C17309l("reason", "timeout");
            String message2 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l2, new C17309l("message", message2 != null ? message2 : ""));
        }
        if (th2 instanceof UnknownHostException ? true : th2 instanceof NoRouteToHostException) {
            C17309l c17309l3 = new C17309l("reason", "network_error");
            String message3 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l3, new C17309l("message", "UnknownHostException: ".concat(message3 != null ? message3 : "")));
        }
        if (th2 instanceof SSLHandshakeException) {
            C17309l c17309l4 = new C17309l("reason", "network_error");
            String message4 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l4, new C17309l("message", "SSLHandshakeException: ".concat(message4 != null ? message4 : "")));
        }
        if (th2 instanceof HttpRetryException ? true : th2 instanceof ProtocolException ? true : th2 instanceof C8913a0) {
            C17309l c17309l5 = new C17309l("reason", "request_failed");
            String message5 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l5, new C17309l("message", message5 != null ? message5 : ""));
        }
        if (th2 instanceof AbstractC6412b) {
            C17309l c17309l6 = new C17309l("reason", "cloudflare_error");
            String str = ((AbstractC6412b) th2).f20857Y;
            return AbstractC17659D.m19244f(c17309l6, new C17309l("message", str != null ? str : ""));
        }
        if (th2 instanceof C6228b) {
            C17309l c17309l7 = new C17309l("reason", "request_failed");
            C6228b c6228b = (C6228b) th2;
            String str2 = c6228b.f20284Z;
            if (str2 == null) {
                str2 = "";
            }
            C17309l c17309l8 = new C17309l("type", str2);
            Integer num = c6228b.f20285o0;
            C17309l c17309l9 = new C17309l("code", Integer.valueOf(num != null ? num.intValue() : -1));
            String str3 = c6228b.f20283Y;
            return m9092f(AbstractC17659D.m19244f(c17309l7, c17309l8, c17309l9, new C17309l("message", str3 != null ? str3 : "")));
        }
        if (th2 instanceof C8923f0) {
            C8923f0 c8923f0 = (C8923f0) th2;
            return m9092f(AbstractC17659D.m19244f(new C17309l("reason", "request_failed"), new C17309l("status_code", Integer.valueOf(c8923f0.f27285Y.mo7307f().f51013Y)), new C17309l("message", c8923f0.f27295Z)));
        }
        if (th2 instanceof C8920e) {
            C8920e c8920e = (C8920e) th2;
            return m9092f(AbstractC17659D.m19244f(new C17309l("reason", "request_failed"), new C17309l("status_code", Integer.valueOf(c8920e.f27285Y.mo7307f().f51013Y)), new C17309l("message", c8920e.f27291Z)));
        }
        if (th2 instanceof IOException) {
            C17309l c17309l10 = new C17309l("reason", "network_error");
            String message6 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l10, new C17309l("message", message6 != null ? message6 : ""));
        }
        if (th2 instanceof C6246t ? true : th2 instanceof C6245s) {
            C17309l c17309l11 = new C17309l("reason", "token_error");
            String message7 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l11, new C17309l("message", message7 != null ? message7 : ""));
        }
        if (th2 instanceof IllegalArgumentException ? true : th2 instanceof C18506a) {
            C17309l c17309l12 = new C17309l("reason", "serialization_error");
            String message8 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l12, new C17309l("message", message8 != null ? message8 : ""));
        }
        if (th2 instanceof C1300m) {
            return m9094h(th2.getCause());
        }
        if (th2 instanceof C6828a) {
            C17309l c17309l13 = new C17309l("reason", "integrity_error");
            String message9 = th2.getMessage();
            return AbstractC17659D.m19244f(c17309l13, new C17309l("message", message9 != null ? message9 : ""), new C17309l("error_code", Integer.valueOf(((C6828a) th2).f62870Y.f36052Y)));
        }
        if (th2.getCause() != null && !AbstractC16544l.m18089b(th2.getCause(), th2)) {
            return m9094h(th2.getCause());
        }
        C17309l c17309l14 = new C17309l("reason", "other");
        String message10 = th2.getMessage();
        if (message10 == null) {
            message10 = "";
        }
        C17309l c17309l15 = new C17309l("message", message10);
        String strMo4447a = AbstractC16526C.f51263a.mo5693b(th2.getClass()).mo4447a();
        return m9092f(AbstractC17659D.m19244f(c17309l14, c17309l15, new C17309l("classname", strMo4447a != null ? strMo4447a : "")));
    }
}
