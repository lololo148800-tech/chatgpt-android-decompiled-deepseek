package p446S6;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.auth0.android.request.internal.C11845d;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3656B;
import p379Pb.C6381b;
import p421R6.C6815a;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: S6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7024c {

    /* JADX INFO: renamed from: a */
    public final Object f22458a;

    public C7024c(Map map) {
        this.f22458a = AbstractC17659D.m19256r(map);
    }

    /* JADX INFO: renamed from: a */
    public static C7023b m7420a(Exception exc) {
        return new C7023b("Something went wrong", new C6815a("Something went wrong", exc));
    }

    /* JADX INFO: renamed from: b */
    public C7023b m7421b(int i10, InputStreamReader inputStreamReader) {
        AbstractC3656B abstractC3656B = (AbstractC3656B) ((C11845d) this.f22458a).f35976a;
        abstractC3656B.getClass();
        Map values = (Map) abstractC3656B.mo4358a(new C6381b(inputStreamReader));
        AbstractC16544l.m18094g(values, "values");
        C7023b c7023b = new C7023b();
        c7023b.f22456o0 = i10;
        c7023b.f22457p0 = values;
        String str = (String) (values.containsKey("error") ? values.get("error") : values.get("code"));
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        c7023b.f22454Y = str;
        if (values.containsKey("description")) {
            Object obj = values.get("description");
            if (obj instanceof String) {
                c7023b.f22455Z = (String) obj;
            } else if ((obj instanceof Map) && "invalid_password".equals(str) && "PasswordStrengthError".equals(values.get(DiagnosticsEntry.NAME_KEY))) {
                List<Map> list = (List) ((Map) obj).get("rules");
                ArrayList arrayList = new ArrayList();
                for (Map map : list) {
                    if (!((Boolean) map.get("verified")).booleanValue()) {
                        String str2 = (String) map.get("code");
                        str2.getClass();
                        switch (str2) {
                            case "lengthAtLeast":
                                arrayList.add(String.format((String) map.get("message"), Integer.valueOf(((Double) ((List) map.get("format")).get(0)).intValue())));
                                break;
                            case "containsAtLeast":
                            case "shouldContain":
                                List list2 = (List) map.get("items");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add((String) ((Map) it.next()).get("message"));
                                }
                                String strJoin = TextUtils.join(", ", arrayList2);
                                String str3 = (String) map.get("message");
                                if (map.containsKey("format")) {
                                    List list3 = (List) map.get("format");
                                    str3 = String.format(str3, Integer.valueOf(((Double) list3.get(0)).intValue()), Integer.valueOf(((Double) list3.get(1)).intValue()));
                                }
                                arrayList.add(str3 + Separators.f31991SP + strJoin);
                                break;
                            case "identicalChars":
                                List list4 = (List) map.get("format");
                                arrayList.add(String.format((String) map.get("message"), Integer.valueOf(((Double) list4.get(0)).intValue()), list4.get(1)));
                                break;
                        }
                    }
                }
                c7023b.f22455Z = TextUtils.join("; ", arrayList);
            }
        } else {
            c7023b.f22455Z = (String) values.get("error_description");
            if ("invalid_request".equals(c7023b.m7418a()) && ("OIDC conformant clients cannot use /oauth/access_token".equals(c7023b.m7419b()) || "OIDC conformant clients cannot use /oauth/ro".equals(c7023b.m7419b()))) {
                AbstractC15256t.m16482t(C7022a.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
            }
        }
        return c7023b;
    }

    /* JADX INFO: renamed from: c */
    public void m7422c(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f22458a;
        if (str2 == null) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, str2);
        }
    }

    public C7024c(C11845d c11845d) {
        this.f22458a = c11845d;
    }
}
