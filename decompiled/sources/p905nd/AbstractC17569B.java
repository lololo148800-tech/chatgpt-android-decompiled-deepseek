package p905nd;

import com.auth0.android.jwt.C11837a;
import com.auth0.android.jwt.C11839c;
import com.auth0.android.jwt.C11840d;
import com.auth0.android.result.Credentials;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: nd.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17569B {

    /* JADX INFO: renamed from: a */
    public static final C3430e f56213a = AbstractC8168p6.m8749b("Credentials", null);

    /* JADX INFO: renamed from: a */
    public static final String m19218a(Credentials credentials) {
        AbstractC16544l.m18094g(credentials, "<this>");
        try {
            C11837a c11837a = (C11837a) new C11840d(credentials.getAccessToken()).f35960o0.f35962b.get("https://api.openai.com/auth");
            if (c11837a == null) {
                c11837a = new C11837a();
            }
            Map map = (Map) c11837a.mo13151a();
            Object obj = map != null ? map.get("user_id") : null;
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        } catch (C11839c e10) {
            AbstractC8160o6.m8726a(f56213a, "Failed to decode auth claim for token: " + e10, null, 6);
            return null;
        }
    }
}
