package p594Y9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.text.TextUtils;
import android.util.Base64;
import com.auth0.android.request.internal.C11850i;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p1113xn.AbstractC21329w;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p521V6.C7799B;
import p521V6.C7800C;
import p521V6.C7808a;
import p521V6.C7809b;
import p521V6.C7810c;
import p521V6.C7811d;
import p521V6.C7812e;
import p521V6.C7813f;
import p521V6.C7814g;
import p521V6.C7818k;
import p521V6.C7819l;
import p521V6.C7820m;
import p521V6.C7821n;
import p521V6.C7823p;
import p521V6.C7824q;
import p521V6.C7825r;
import p521V6.C7827t;
import p521V6.C7828u;
import p521V6.C7830w;
import p521V6.C7831x;
import p521V6.C7832y;
import p521V6.C7833z;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p615Z6.C10252z0;
import p919o8.AbstractC17962d;
import p919o8.C18020w0;

/* JADX INFO: renamed from: Y9.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9915k0 {
    /* JADX INFO: renamed from: b */
    public static void m10572b(C11850i c11850i, C10252z0 c10252z0, boolean z6) {
        C17296C c17296c;
        String strM9892k;
        boolean zVerify;
        if (z6) {
            C7808a c7808a = (C7808a) c10252z0.f30455Z;
            if (c7808a != null) {
                List list = c7808a.f24701a;
                String tokenAlgorithm = c11850i.f35984d;
                if (!list.contains(tokenAlgorithm) || "none".equalsIgnoreCase(tokenAlgorithm)) {
                    AbstractC16544l.m18094g(tokenAlgorithm, "tokenAlgorithm");
                    if (list.size() == 1) {
                        strM9892k = AbstractC9306j0.m9892k(AbstractC10763a.m11058p("Signature algorithm of \"", tokenAlgorithm, "\" is not supported. Expected the ID token to be signed with "), (String) list.get(0), '.');
                    } else {
                        strM9892k = "Signature algorithm of \"" + tokenAlgorithm + "\" is not supported. Expected the ID token to be signed with any of " + list + '.';
                    }
                    throw new C7820m(strM9892k);
                }
                Signature signature = c7808a.f24702b;
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = c11850i.f35983c;
                sb2.append(strArr[0]);
                sb2.append(Separators.DOT);
                sb2.append(strArr[1]);
                byte[] bytes = sb2.toString().getBytes(StandardCharsets.UTF_8);
                try {
                    byte[] bArrDecode = Base64.decode(strArr[2], 10);
                    signature.update(bytes);
                    zVerify = signature.verify(bArrDecode);
                } catch (Exception unused) {
                    zVerify = false;
                }
                if (!zVerify) {
                    throw new C7823p("Invalid ID token signature.");
                }
                c17296c = C17296C.f55119a;
            } else {
                c17296c = null;
            }
            if (c17296c == null) {
                throw new C7799B("Signature Verifier should not be null");
            }
        }
        String str = c11850i.f35987g;
        if (TextUtils.isEmpty(str)) {
            throw new C7825r("Issuer (iss) claim must be a string present in the ID token");
        }
        String expected = (String) c10252z0.f30454Y;
        if (!AbstractC16544l.m18089b(str, expected)) {
            AbstractC16544l.m18094g(expected, "expected");
            throw new C7824q("Issuer (iss) claim mismatch in the ID token, expected \"" + expected + "\", found \"" + str + '\"');
        }
        if (TextUtils.isEmpty(c11850i.f35986f)) {
            throw new C7800C("Subject (sub) claim must be a string present in the ID token");
        }
        List list2 = c11850i.f35995o;
        if (list2.isEmpty()) {
            throw new C7810c("Audience (aud) claim must be a string or array of strings present in the ID token");
        }
        if (!list2.contains("dBPYPHX8xGTuepNhXZJCycwsystDsw7Y")) {
            throw new C7809b("Audience (aud) claim mismatch in the ID token; expected \"dBPYPHX8xGTuepNhXZJCycwsystDsw7Y\" but was not one of \"" + list2 + '\"');
        }
        Calendar calendar = Calendar.getInstance();
        Date time = (Date) c10252z0.f30459r0;
        if (time == null) {
            time = calendar.getTime();
        }
        Date date = c11850i.f35992l;
        if (date == null) {
            throw new C7818k("Expiration Time (exp) claim must be a number present in the ID token");
        }
        calendar.setTime(date);
        calendar.add(13, 60);
        Date time2 = calendar.getTime();
        AbstractC16544l.m18091d(time);
        if (time.after(time2)) {
            long j10 = 1000;
            throw new C7821n("Expiration Time (exp) claim error in the ID token; current time (" + (time.getTime() / j10) + ") is after expiration time (" + Long.valueOf(time2.getTime() / j10) + ')');
        }
        if (c11850i.f35991k == null) {
            throw new C7819l("Issued At (iat) claim must be a number present in the ID token");
        }
        if (((String) c10252z0.f30457p0) != null) {
            String str2 = c11850i.f35988h;
            if (TextUtils.isEmpty(str2)) {
                throw new C7828u("Nonce (nonce) claim must be a string present in the ID token");
            }
            if (!AbstractC16544l.m18089b((String) c10252z0.f30457p0, str2)) {
                throw new C7827t("Nonce (nonce) claim mismatch in the ID token; expected \"" + ((String) c10252z0.f30457p0) + "\", found \"" + str2 + '\"');
            }
        }
        String str3 = (String) c10252z0.f30456o0;
        if (str3 != null) {
            if (AbstractC21329w.m21734u(str3, "org_", false)) {
                String str4 = c11850i.f35989i;
                if (TextUtils.isEmpty(str4)) {
                    throw new C7831x("Organization Id (org_id) claim must be a string present in the ID token");
                }
                if (!str3.equals(str4)) {
                    throw new C7830w("Organization Id (org_id) claim mismatch in the ID token; expected \"" + str3 + "\", found \"" + str4 + '\"');
                }
            } else {
                String str5 = c11850i.f35990j;
                if (TextUtils.isEmpty(str5)) {
                    throw new C7833z("Organization Name (org_name) claim must be a string present in the ID token");
                }
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!lowerCase.equals(str5)) {
                    throw new C7832y("Organization Name (org_name) claim mismatch in the ID token; expected \"" + str3 + "\", found \"" + str5 + '\"');
                }
            }
        }
        if (list2.size() > 1) {
            String str6 = c11850i.f35993m;
            if (TextUtils.isEmpty(str6)) {
                throw new C7814g("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values");
            }
            if (!"dBPYPHX8xGTuepNhXZJCycwsystDsw7Y".equals(str6)) {
                throw new C7813f(AbstractC10763a.m11047e('\"', "Authorized Party (azp) claim mismatch in the ID token; expected \"dBPYPHX8xGTuepNhXZJCycwsystDsw7Y\", found \"", str6));
            }
        }
        if (((Integer) c10252z0.f30458q0) != null) {
            Date date2 = c11850i.f35994n;
            if (date2 == null) {
                throw new C7812e("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified");
            }
            calendar.setTime(date2);
            Integer num = (Integer) c10252z0.f30458q0;
            AbstractC16544l.m18091d(num);
            calendar.add(13, num.intValue());
            calendar.add(13, 60);
            Date time3 = calendar.getTime();
            if (time.after(time3)) {
                long j11 = 1000;
                throw new C7811d("Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (" + (time.getTime() / j11) + ") is after last auth at (" + Long.valueOf(time3.getTime() / j11) + ')');
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18020w0 m10571a(C3676s c3676s) {
        String str = bQBnquXS.NeMBBFOlNhPNaXY;
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17962d.m19651l(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("model");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w(lZYtIbClQJm.BQSNi);
                    String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("architecture");
                    return new C18020w0(i10, strMo4384r2, strMo4384r3, strMo4384r4, abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t(str, e10);
        } catch (NullPointerException e11) {
            throw new C3677t(str, e11);
        } catch (NumberFormatException e12) {
            throw new C3677t(str, e12);
        }
    }
}
