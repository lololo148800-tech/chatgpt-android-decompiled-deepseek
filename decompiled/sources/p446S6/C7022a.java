package p446S6;

import com.auth0.android.request.internal.AbstractC11847f;
import com.auth0.android.request.internal.C11845d;
import com.google.gson.reflect.TypeToken;
import fo.C13711h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import p001A.C0017I0;
import p001A.C0093v0;
import p140Fa.C2685e;
import p214Ib.C3669l;
import p523V9.AbstractC7861C4;
import p541W6.C8432b;
import p541W6.InterfaceC8434d;
import p712dp.C13187c;
import p905nd.C17591s;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: S6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7022a {

    /* JADX INFO: renamed from: a */
    public final C17591s f22451a;

    /* JADX INFO: renamed from: b */
    public final C13711h f22452b;

    /* JADX INFO: renamed from: c */
    public final C3669l f22453c;

    public C7022a(C17591s auth0) {
        AbstractC16544l.m18094g(auth0, "auth0");
        InterfaceC8434d interfaceC8434d = auth0.f56324c;
        C3669l gson = AbstractC11847f.f35979a;
        AbstractC16544l.m18094g(gson, "gson");
        C13711h c13711h = new C13711h(interfaceC8434d, new C7024c(new C11845d(gson, new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.GsonAdapter$Companion$forMap$1
        })));
        this.f22451a = auth0;
        this.f22452b = c13711h;
        this.f22453c = gson;
        String clientInfo = (String) auth0.f56323b.f46725Z;
        AbstractC16544l.m18094g(clientInfo, "clientInfo");
        ((LinkedHashMap) c13711h.f43260o0).put("Auth0-Client", clientInfo);
    }

    /* JADX INFO: renamed from: a */
    public final C0093v0 m7416a(String str) {
        C7024c c7024cM3661k = C2685e.m3661k();
        c7024cM3661k.m7422c("scope", AbstractC7861C4.m8135c("openid profile email"));
        c7024cM3661k.m7422c("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange");
        C17591s c17591s = this.f22451a;
        c17591s.getClass();
        c7024cM3661k.m7422c("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
        c7024cM3661k.m7422c("subject_token", str);
        c7024cM3661k.m7422c("subject_token_type", "http://auth0.com/oauth/token-type/google-id-token");
        Map mapM19254p = AbstractC17659D.m19254p((LinkedHashMap) c7024cM3661k.f22458a);
        String strValueOf = String.valueOf(c17591s.f56322a);
        C13187c c13187c = new C13187c(1);
        c13187c.m14844f(null, strValueOf);
        C13187c c13187cM19025f = c13187c.m14841c().m19025f();
        c13187cM19025f.m14839a("oauth");
        c13187cM19025f.m14839a("token");
        C17349p c17349pM14841c = c13187cM19025f.m14841c();
        C7024c c7024cM3661k2 = C2685e.m3661k();
        c7024cM3661k2.m7422c("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM19254p.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c7024cM3661k2.f22458a;
            if (!zHasNext) {
                Map mapM19254p2 = AbstractC17659D.m19254p(linkedHashMap2);
                C11845d c11845d = new C11845d(this.f22453c);
                String str2 = c17349pM14841c.f55294i;
                C8432b c8432b = C8432b.f26256d;
                C13711h c13711h = this.f22452b;
                C0093v0 c0093v0 = new C0093v0(c13711h.m15190M(c8432b, str2, c11845d, (C7024c) c13711h.f43261p0), 5, String.valueOf(c17591s.f56322a));
                c0093v0.m341d(mapM19254p2);
                return c0093v0;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            AbstractC16544l.m18091d(value);
            arrayList.add((String) linkedHashMap2.put(key, value));
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0017I0 m7417b(String str) {
        C7024c c7024cM3661k = C2685e.m3661k();
        C17591s c17591s = this.f22451a;
        c17591s.getClass();
        c7024cM3661k.m7422c("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
        c7024cM3661k.m7422c("refresh_token", str);
        c7024cM3661k.m7422c("grant_type", "refresh_token");
        Map mapM19254p = AbstractC17659D.m19254p((LinkedHashMap) c7024cM3661k.f22458a);
        String strValueOf = String.valueOf(c17591s.f56322a);
        C13187c c13187c = new C13187c(1);
        c13187c.m14844f(null, strValueOf);
        C13187c c13187cM19025f = c13187c.m14841c().m19025f();
        c13187cM19025f.m14839a("oauth");
        c13187cM19025f.m14839a("token");
        C17349p c17349pM14841c = c13187cM19025f.m14841c();
        C11845d c11845d = new C11845d(this.f22453c);
        String str2 = c17349pM14841c.f55294i;
        C8432b c8432b = C8432b.f26256d;
        C13711h c13711h = this.f22452b;
        C0017I0 c0017i0M15190M = c13711h.m15190M(c8432b, str2, c11845d, (C7024c) c13711h.f43261p0);
        c0017i0M15190M.m71e(mapM19254p);
        return c0017i0M15190M;
    }
}
