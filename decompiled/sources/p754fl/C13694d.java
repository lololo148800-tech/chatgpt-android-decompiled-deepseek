package p754fl;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17288f;
import p025An.C0566C0;
import p485Tk.AbstractC7498g;
import p556Wk.C8906U;
import p857kl.C16438E;
import p857kl.C16452T;
import p857kl.C16478z;
import p909nm.C17691y;
import sl.C19675j;

/* JADX INFO: renamed from: fl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13694d {

    /* JADX INFO: renamed from: a */
    public final C16452T f43201a;

    /* JADX INFO: renamed from: b */
    public final C16438E f43202b;

    /* JADX INFO: renamed from: c */
    public final C16478z f43203c;

    /* JADX INFO: renamed from: d */
    public final AbstractC17288f f43204d;

    /* JADX INFO: renamed from: e */
    public final C0566C0 f43205e;

    /* JADX INFO: renamed from: f */
    public final C19675j f43206f;

    /* JADX INFO: renamed from: g */
    public final Set f43207g;

    public C13694d(C16452T c16452t, C16438E method, C16478z c16478z, AbstractC17288f abstractC17288f, C0566C0 executionContext, C19675j attributes) {
        Set setKeySet;
        AbstractC16544l.m18094g(method, "method");
        AbstractC16544l.m18094g(executionContext, "executionContext");
        AbstractC16544l.m18094g(attributes, "attributes");
        this.f43201a = c16452t;
        this.f43202b = method;
        this.f43203c = c16478z;
        this.f43204d = abstractC17288f;
        this.f43205e = executionContext;
        this.f43206f = attributes;
        Map map = (Map) attributes.m20651e(AbstractC7498g.f23799a);
        this.f43207g = (map == null || (setKeySet = map.keySet()) == null) ? C17691y.f56482Y : setKeySet;
    }

    /* JADX INFO: renamed from: a */
    public final Object m15170a() {
        C8906U c8906u = C8906U.f27257a;
        Map map = (Map) this.f43206f.m20651e(AbstractC7498g.f23799a);
        if (map != null) {
            return map.get(c8906u);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f43201a + ", method=" + this.f43202b + ')';
    }
}
