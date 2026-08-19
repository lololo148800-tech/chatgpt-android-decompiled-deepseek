package mo;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p571X9.AbstractC9252a0;
import p791hj.C14522e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: mo.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C17358y {

    /* JADX INFO: renamed from: a */
    public final C17349p f55379a;

    /* JADX INFO: renamed from: b */
    public final String f55380b;

    /* JADX INFO: renamed from: c */
    public final C17348o f55381c;

    /* JADX INFO: renamed from: d */
    public final AbstractC17325B f55382d;

    /* JADX INFO: renamed from: e */
    public final Map f55383e;

    /* JADX INFO: renamed from: f */
    public C17336c f55384f;

    public C17358y(C17349p url, String method, C17348o c17348o, AbstractC17325B abstractC17325B, Map map) {
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(method, "method");
        this.f55379a = url;
        this.f55380b = method;
        this.f55381c = c17348o;
        this.f55382d = abstractC17325B;
        this.f55383e = map;
    }

    /* JADX INFO: renamed from: a */
    public final C17336c m19037a() {
        C17336c c17336c = this.f55384f;
        if (c17336c != null) {
            return c17336c;
        }
        C17336c c17336c2 = C17336c.f55214n;
        C17336c c17336cM9827b = AbstractC9252a0.m9827b(this.f55381c);
        this.f55384f = c17336cM9827b;
        return c17336cM9827b;
    }

    /* JADX INFO: renamed from: b */
    public final C14522e m19038b() {
        C14522e c14522e = new C14522e();
        c14522e.f45761Y = new LinkedHashMap();
        c14522e.f45762Z = this.f55379a;
        c14522e.f45764p0 = this.f55380b;
        c14522e.f45765q0 = this.f55382d;
        Map map = this.f55383e;
        c14522e.f45761Y = map.isEmpty() ? new LinkedHashMap() : AbstractC17659D.m19256r(map);
        c14522e.f45763o0 = this.f55381c.m19016q();
        return c14522e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f55380b);
        sb2.append(", url=");
        sb2.append(this.f55379a);
        C17348o c17348o = this.f55381c;
        if (c17348o.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : c17348o) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                C17309l c17309l = (C17309l) obj;
                String str = (String) c17309l.f55136Y;
                String str2 = (String) c17309l.f55137Z;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        Map map = this.f55383e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
