package com.auth0.android.request.internal;

import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.util.Base64;
import com.auth0.android.jwt.C11838b;
import com.auth0.android.jwt.C11839c;
import com.auth0.android.jwt.C11841e;
import com.auth0.android.result.Credentials;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3671n;
import p214Ib.C3675r;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p214Ib.InterfaceC3672o;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p265Kb.C4622o;
import p909nm.AbstractC17659D;
import p960q9.C18655i;

/* JADX INFO: renamed from: com.auth0.android.request.internal.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11849h implements InterfaceC3672o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35980a;

    public /* synthetic */ C11849h(int i10) {
        this.f35980a = i10;
    }

    /* JADX INFO: renamed from: b */
    public static Date m13168b(C3676s c3676s, String str) {
        if (c3676s.f11174Y.containsKey(str)) {
            return new Date(c3676s.m4395w(str).mo4382p() * 1000);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    @Override // p214Ib.InterfaceC3672o
    /* JADX INFO: renamed from: a */
    public final Object mo4388a(AbstractC3673p json, Type typeOfT, C18655i c18655i) {
        switch (this.f35980a) {
            case 0:
                AbstractC16544l.m18094g(json, "json");
                AbstractC16544l.m18094g(typeOfT, "typeOfT");
                if (!(json instanceof C3676s) || (json instanceof C3675r) || ((AbstractCollection) json.m4390m().f11174Y.entrySet()).isEmpty()) {
                    throw new C3677t("jwks json must be a valid and non-empty json object");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ((C3671n) json.m4390m().f11174Y.get("keys")).f11172Y.iterator();
                while (it.hasNext()) {
                    C3676s c3676sM4390m = ((AbstractC3673p) it.next()).m4390m();
                    String str = (String) c18655i.m20029k(c3676sM4390m.m4395w(ParameterNamesIms.ALG), String.class);
                    String str2 = (String) c18655i.m20029k(c3676sM4390m.m4395w("use"), String.class);
                    if ("RS256".equals(str) && "sig".equals(str2)) {
                        String str3 = (String) c18655i.m20029k(c3676sM4390m.m4395w("kty"), String.class);
                        String keyId = (String) c18655i.m20029k(c3676sM4390m.m4395w("kid"), String.class);
                        try {
                            PublicKey pub = KeyFactory.getInstance(str3).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) c18655i.m20029k(c3676sM4390m.m4395w("n"), String.class), 11)), new BigInteger(1, Base64.decode((String) c18655i.m20029k(c3676sM4390m.m4395w("e"), String.class), 11))));
                            AbstractC16544l.m18093f(keyId, "keyId");
                            AbstractC16544l.m18093f(pub, "pub");
                            linkedHashMap.put(keyId, pub);
                        } catch (NoSuchAlgorithmException e10) {
                            AbstractC15256t.m16466d(C11849h.class.getSimpleName(), "Could not parse the JWK with ID " + keyId, e10);
                        } catch (InvalidKeySpecException e11) {
                            AbstractC15256t.m16466d(C11849h.class.getSimpleName(), "Could not parse the JWK with ID " + keyId, e11);
                        }
                    }
                }
                return AbstractC17659D.m19254p(linkedHashMap);
            case 1:
                json.getClass();
                if ((json instanceof C3675r) || !(json instanceof C3676s)) {
                    throw new C11839c("The token's payload had an invalid JSON format.");
                }
                C3676s c3676sM4390m2 = json.m4390m();
                C4622o c4622o = c3676sM4390m2.f11174Y;
                if (c4622o.containsKey("iss")) {
                    c3676sM4390m2.m4395w("iss").mo4384r();
                }
                if (c4622o.containsKey("sub")) {
                    c3676sM4390m2.m4395w("sub").mo4384r();
                }
                m13168b(c3676sM4390m2, "exp");
                m13168b(c3676sM4390m2, "nbf");
                m13168b(c3676sM4390m2, "iat");
                if (c4622o.containsKey("jti")) {
                    c3676sM4390m2.m4395w("jti").mo4384r();
                }
                ?? EmptyList = Collections.emptyList();
                if (c4622o.containsKey("aud")) {
                    AbstractC3673p abstractC3673pM4395w = c3676sM4390m2.m4395w("aud");
                    abstractC3673pM4395w.getClass();
                    if (abstractC3673pM4395w instanceof C3671n) {
                        ArrayList arrayList = abstractC3673pM4395w.m4389j().f11172Y;
                        EmptyList = new ArrayList(arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            EmptyList.add(((AbstractC3673p) arrayList.get(i10)).mo4384r());
                        }
                    } else {
                        EmptyList = Collections.singletonList(abstractC3673pM4395w.mo4384r());
                    }
                }
                HashMap map = new HashMap();
                Iterator it2 = ((C4619l) c4622o.entrySet()).iterator();
                while (((AbstractC4620m) it2).hasNext()) {
                    C4621n c4621nM5364a = ((C4618k) it2).m5364a();
                    map.put(c4621nM5364a.getKey(), new C11838b((AbstractC3673p) c4621nM5364a.getValue()));
                }
                return new C11841e(EmptyList, map);
            default:
                AbstractC16544l.m18094g(json, "json");
                AbstractC16544l.m18094g(typeOfT, "typeOfT");
                if (!(json instanceof C3676s) || (json instanceof C3675r) || ((AbstractCollection) json.m4390m().f11174Y.entrySet()).isEmpty()) {
                    throw new C3677t("credentials json is not a valid json object");
                }
                C3676s c3676sM4390m3 = json.m4390m();
                String idToken = (String) c18655i.m20029k(c3676sM4390m3.m4396x("id_token"), String.class);
                String accessToken = (String) c18655i.m20029k(c3676sM4390m3.m4396x("access_token"), String.class);
                String type = (String) c18655i.m20029k(c3676sM4390m3.m4396x("token_type"), String.class);
                String str4 = (String) c18655i.m20029k(c3676sM4390m3.m4396x("refresh_token"), String.class);
                Long l4 = (Long) c18655i.m20029k(c3676sM4390m3.m4396x("expires_in"), Long.TYPE);
                String str5 = (String) c18655i.m20029k(c3676sM4390m3.m4396x("scope"), String.class);
                String str6 = (String) c18655i.m20029k(c3676sM4390m3.m4396x("recovery_code"), String.class);
                Date date = (Date) c18655i.m20029k(c3676sM4390m3.m4396x("expires_at"), Date.class);
                if (date == null && l4 != null) {
                    date = new Date((l4.longValue() * ((long) 1000)) + System.currentTimeMillis());
                }
                Date expiresAt = date;
                AbstractC16544l.m18093f(idToken, "idToken");
                AbstractC16544l.m18093f(accessToken, "accessToken");
                AbstractC16544l.m18093f(type, "type");
                AbstractC16544l.m18093f(expiresAt, "expiresAt");
                Credentials credentials = new Credentials(idToken, accessToken, type, str4, expiresAt, str5);
                credentials.m13176h(str6);
                return credentials;
        }
    }
}
