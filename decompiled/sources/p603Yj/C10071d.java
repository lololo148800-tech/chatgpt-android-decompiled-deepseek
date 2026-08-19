package p603Yj;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17324A;
import mo.C17327D;
import mo.C17352s;
import mo.C17353t;
import mo.C17354u;
import mo.C17358y;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import no.AbstractC17708b;
import org.json.JSONException;
import org.json.JSONObject;
import p025An.C0644w;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9294h0;
import p791hj.C14522e;
import p909nm.AbstractC17680n;
import p959q8.C18639a;
import ro.C19261e;

/* JADX INFO: renamed from: Yj.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10071d implements InterfaceC17351r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29821b;

    public /* synthetic */ C10071d(Object obj, int i10) {
        this.f29820a = i10;
        this.f29821b = obj;
    }

    @Override // mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) throws JSONException {
        String str;
        Object obj = this.f29821b;
        switch (this.f29820a) {
            case 0:
                C10069b c10069b = (C10069b) obj;
                C19261e c19261e = (C19261e) interfaceC17350q;
                C17358y c17358y = c19261e.f61057e;
                AbstractC17325B abstractC17325B = c17358y.f55382d;
                if (!AbstractC16544l.m18089b(AbstractC17680n.m19351a0(c17358y.f55379a.f55291f), "transition") || abstractC17325B == null || !c10069b.f29816a) {
                    return c19261e.m20335b(c17358y);
                }
                EnumC10068a enumC10068a = c10069b.f29817b;
                AbstractC16544l.m18094g(enumC10068a, "<this>");
                int iOrdinal = enumC10068a.ordinal();
                if (iOrdinal == 0) {
                    str = "failed";
                } else {
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                    str = "passed";
                }
                C17352s c17352sMo4143b = abstractC17325B.mo4143b();
                String str2 = c17352sMo4143b != null ? c17352sMo4143b.f55300c : null;
                boolean zM18089b = AbstractC16544l.m18089b(str2, "form-data");
                String str3 = c17358y.f55380b;
                if (!zM18089b) {
                    if (!AbstractC16544l.m18089b(str2, "json")) {
                        return c19261e.m20335b(c17358y);
                    }
                    C0675i c0675i = new C0675i();
                    abstractC17325B.mo4145d(c0675i);
                    JSONObject jSONObject = new JSONObject(c0675i.m1428Z0());
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", str));
                    jSONObject.put("meta", jSONObjectOptJSONObject);
                    String string = jSONObject.toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                    C17324A c17324aM9653a = AbstractC9123E2.m9653a(string, abstractC17325B.mo4143b());
                    C14522e c14522eM19038b = c17358y.m19038b();
                    c14522eM19038b.m16028v(str3, c17324aM9653a);
                    return c19261e.m20335b(c14522eM19038b.m16017i());
                }
                C17354u c17354u = (C17354u) abstractC17325B;
                String strM4498w = AbstractC3794B0.m4498w("randomUUID().toString()");
                C0678l c0678l = C0678l.f1971p0;
                C0678l c0678lM19996n = C18639a.m19996n(strM4498w);
                C17352s c17352s = C17354u.f55304e;
                ArrayList arrayList = new ArrayList();
                C17352s type = c17354u.f55311c;
                AbstractC16544l.m18094g(type, "type");
                if (!type.f55299b.equals("multipart")) {
                    throw new IllegalArgumentException(("multipart != " + type).toString());
                }
                for (C17353t part : c17354u.f55310b) {
                    AbstractC16544l.m18094g(part, "part");
                    arrayList.add(part);
                }
                arrayList.add(AbstractC9294h0.m9874c("meta[workflowInitialVariables][debugForcedStatus]", str));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Multipart body must have at least one part.");
                }
                C17354u c17354u2 = new C17354u(c0678lM19996n, type, AbstractC17708b.m19433y(arrayList));
                C14522e c14522eM19038b2 = c17358y.m19038b();
                c14522eM19038b2.m16028v(str3, c17354u2);
                return c19261e.m20335b(c14522eM19038b2.m16017i());
            case 1:
                return NetworkModule.interceptor$lambda$6((C11447L) obj, (C19261e) interfaceC17350q);
            default:
                return NetworkModule.responseInterceptor$lambda$5((NetworkModule) obj, (C19261e) interfaceC17350q);
        }
    }
}
