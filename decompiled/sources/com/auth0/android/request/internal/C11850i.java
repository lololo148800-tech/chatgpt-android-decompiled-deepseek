package com.auth0.android.request.internal;

import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import com.google.gson.reflect.TypeToken;
import java.io.StringReader;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3656B;
import p379Pb.C6381b;
import p523V9.AbstractC7853B4;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: renamed from: com.auth0.android.request.internal.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11850i {

    /* JADX INFO: renamed from: a */
    public final Map f35981a;

    /* JADX INFO: renamed from: b */
    public final Map f35982b;

    /* JADX INFO: renamed from: c */
    public final String[] f35983c;

    /* JADX INFO: renamed from: d */
    public final String f35984d;

    /* JADX INFO: renamed from: e */
    public final String f35985e;

    /* JADX INFO: renamed from: f */
    public final String f35986f;

    /* JADX INFO: renamed from: g */
    public final String f35987g;

    /* JADX INFO: renamed from: h */
    public final String f35988h;

    /* JADX INFO: renamed from: i */
    public final String f35989i;

    /* JADX INFO: renamed from: j */
    public final String f35990j;

    /* JADX INFO: renamed from: k */
    public final Date f35991k;

    /* JADX INFO: renamed from: l */
    public final Date f35992l;

    /* JADX INFO: renamed from: m */
    public final String f35993m;

    /* JADX INFO: renamed from: n */
    public final Date f35994n;

    /* JADX INFO: renamed from: o */
    public final List f35995o;

    public C11850i(String rawToken) {
        AbstractC16544l.m18094g(rawToken, "rawToken");
        String[] strArrM8112d = AbstractC7853B4.m8112d(rawToken);
        this.f35983c = strArrM8112d;
        String strM8110b = AbstractC7853B4.m8110b(strArrM8112d[0]);
        String strM8110b2 = AbstractC7853B4.m8110b(strArrM8112d[1]);
        AbstractC3656B abstractC3656BM4372f = AbstractC11847f.f35979a.m4372f(new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.Jwt$mapAdapter$1
        });
        Object objMo4358a = abstractC3656BM4372f.mo4358a(new C6381b(new StringReader(strM8110b)));
        AbstractC16544l.m18093f(objMo4358a, "mapAdapter.fromJson(jsonHeader)");
        Map map = (Map) objMo4358a;
        this.f35981a = map;
        Object objMo4358a2 = abstractC3656BM4372f.mo4358a(new C6381b(new StringReader(strM8110b2)));
        AbstractC16544l.m18093f(objMo4358a2, "mapAdapter.fromJson(jsonPayload)");
        Map map2 = (Map) objMo4358a2;
        this.f35982b = map2;
        Object obj = map.get(ParameterNamesIms.ALG);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.String");
        this.f35984d = (String) obj;
        this.f35985e = (String) map.get("kid");
        this.f35986f = (String) map2.get("sub");
        this.f35987g = (String) map2.get("iss");
        this.f35988h = (String) map2.get("nonce");
        this.f35989i = (String) map2.get("org_id");
        this.f35990j = (String) map2.get("org_name");
        Object obj2 = map2.get("iat");
        Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
        this.f35991k = d10 != null ? new Date(((long) d10.doubleValue()) * ((long) 1000)) : null;
        Object obj3 = map2.get("exp");
        Double d11 = obj3 instanceof Double ? (Double) obj3 : null;
        this.f35992l = d11 != null ? new Date(((long) d11.doubleValue()) * ((long) 1000)) : null;
        this.f35993m = (String) map2.get("azp");
        Object obj4 = map2.get("auth_time");
        Double d12 = obj4 instanceof Double ? (Double) obj4 : null;
        this.f35994n = d12 != null ? new Date(((long) d12.doubleValue()) * ((long) 1000)) : null;
        Object obj5 = map2.get("aud");
        this.f35995o = obj5 instanceof String ? AbstractC9393x3.m9974d(obj5) : obj5 instanceof List ? (List) obj5 : C17689w.f56480Y;
    }
}
