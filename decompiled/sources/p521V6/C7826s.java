package p521V6;

import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p446S6.C7023b;
import p594Y9.AbstractC9750J2;
import p720e6.C13287b;
import p826j6.C16137F;
import p905nd.C17591s;

/* JADX INFO: renamed from: V6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7826s extends AbstractC9750J2 {

    /* JADX INFO: renamed from: a */
    public final C13287b f24715a;

    /* JADX INFO: renamed from: b */
    public final HashMap f24716b;

    /* JADX INFO: renamed from: c */
    public final C7817j f24717c;

    public C7826s(C17591s account, C13287b c13287b, String returnToUrl, C7817j ctOptions) {
        AbstractC16544l.m18094g(account, "account");
        AbstractC16544l.m18094g(returnToUrl, "returnToUrl");
        AbstractC16544l.m18094g(ctOptions, "ctOptions");
        this.f24715a = c13287b;
        HashMap map = new HashMap();
        this.f24716b = map;
        map.put("returnTo", returnToUrl);
        this.f24717c = ctOptions;
    }

    @Override // p594Y9.AbstractC9750J2
    /* JADX INFO: renamed from: a */
    public final void mo8085a(C7023b c7023b) {
        this.f24715a.mo7759f(c7023b);
    }

    @Override // p594Y9.AbstractC9750J2
    /* JADX INFO: renamed from: c */
    public final boolean mo8086c(C16137F c16137f) {
        boolean zM17691f = c16137f.m17691f();
        C13287b c13287b = this.f24715a;
        if (zM17691f) {
            c13287b.mo7759f(new C7023b("a0.authentication_canceled", "The user closed the browser app so the logout was cancelled."));
            return true;
        }
        c13287b.onSuccess(null);
        return true;
    }
}
