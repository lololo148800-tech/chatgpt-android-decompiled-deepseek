package p905nd;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ci.C11759b;
import fo.C13711h;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p1061vb.C20513d;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6222A;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p432Rh.C6901n;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p541W6.C8436f;
import p541W6.InterfaceC8434d;
import p792hl.AbstractC14527b;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: nd.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C17595w implements InterfaceC8434d {

    /* JADX INFO: renamed from: a */
    public final C6901n f56333a;

    /* JADX INFO: renamed from: b */
    public final C11759b f56334b;

    /* JADX INFO: renamed from: c */
    public final C3430e f56335c = AbstractC8168p6.m8749b("NetworkingClient", null);

    public C17595w(C6901n c6901n, C20513d c20513d, C11759b c11759b) {
        this.f56333a = c6901n;
        this.f56334b = c11759b;
    }

    @Override // p541W6.InterfaceC8434d
    /* JADX INFO: renamed from: a */
    public final C8436f mo9037a(String str, C13711h options) throws Exception {
        AbstractC16544l.m18094g(options, "options");
        C3516e c3516e = AbstractC0593T.f1824a;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        AbstractC6224C abstractC6224C = (AbstractC6224C) AbstractC0575H.m1161I(executorC3515d, new C17594v(this, options, str, null));
        if (abstractC6224C instanceof C6223B) {
            AbstractC14527b abstractC14527b = (AbstractC14527b) ((C6223B) abstractC6224C).f20258a;
            int i10 = abstractC14527b.mo7307f().f51013Y;
            C17598z c17598z = new C17598z(executorC3515d, (InterfaceC15088n) AbstractC0575H.m1161I(executorC3515d, new C17568A(abstractC14527b, null)));
            InterfaceC16476x interfaceC16476xMo7301a = abstractC14527b.mo7301a();
            AbstractC16544l.m18094g(interfaceC16476xMo7301a, "<this>");
            Set<Map.Entry> setMo7977a = interfaceC16476xMo7301a.mo7977a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : setMo7977a) {
                linkedHashMap.put((String) entry.getKey(), AbstractC17680n.m19322C0((Iterable) entry.getValue()));
            }
            return new C8436f(i10, c17598z, linkedHashMap);
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            if (abstractC6224C instanceof C6248v) {
                throw new IOException("Request was cancelled");
            }
            throw new C0644w();
        }
        boolean z6 = abstractC6224C instanceof C6222A;
        C3430e c3430e = this.f56335c;
        if (z6) {
            AbstractC8160o6.m8731f(c3430e, AbstractC10763a.m11048f(((C6222A) abstractC6224C).f20254b, "Auth Network Error with error code "), ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
        } else {
            AbstractC8160o6.m8731f(c3430e, "Auth Network Error", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
        }
        this.f56334b.m13053a(new IOException(((AbstractC6249w) abstractC6224C).f20328a));
        throw null;
    }
}
