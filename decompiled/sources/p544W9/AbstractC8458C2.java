package p544W9;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import eg.C13396s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p027Ap.C0693a;
import p049Bm.InterfaceC1439n;
import p092Dc.C1991h;
import p1113xn.AbstractC21328v;
import p1155zi.AbstractC21933K1;
import p1155zi.C21949O1;
import p1155zi.EnumC21895B;
import p138F8.vJO.anhfj;
import p252Jo.AbstractC4489d;
import p252Jo.InterfaceC4488c;
import p300Lo.C5218a;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9231W3;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: W9.C2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8458C2 {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static boolean m9073a(InterfaceC4488c interfaceC4488c, Object obj, InterfaceC1439n interfaceC1439n) {
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        Object objMo5213b = interfaceC4488c.mo5213b(AbstractC17680n.m19343S(c0693aM8396e));
        Object objMo5213b2 = interfaceC4488c.mo5213b(AbstractC17680n.m19344T(1, c0693aM8396e));
        ?? r6 = AbstractC4489d.f14644a;
        List list = (List) r6.get(objMo5213b);
        List list2 = (List) r6.get(objMo5213b2);
        if (list != null || list2 != null) {
            if (list != null ? list.contains(objMo5213b2) : false) {
                return true;
            }
            return list2 != null ? list2.contains(objMo5213b) : false;
        }
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        Iterator it = c0693aM8396e.f2015Y.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC4488c.mo5214c(it.next()));
        }
        return interfaceC4488c.mo3261f(arrayList, interfaceC1439n);
    }

    /* JADX INFO: renamed from: c */
    public static Object m9075c(Object obj) {
        Object objM9466c = AbstractC8734w3.m9466c(obj);
        return !AbstractC16544l.m18089b(objM9466c, obj) ? new C5218a(AbstractC8734w3.m9465b(objM9466c)) : AbstractC8734w3.m9465b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX INFO: renamed from: d */
    public static Object m9076d(InterfaceC4488c interfaceC4488c, Object obj) {
        List list;
        Object objMo5214c;
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            objMo5214c = AbstractC21328v.m21719f((String) obj);
            if (objMo5214c == null) {
                return obj;
            }
        } else {
            if (!(obj instanceof List)) {
                if (obj instanceof Boolean) {
                    return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                }
                return obj;
            }
            List list2 = (List) obj;
            if (list2 instanceof List) {
                List list3 = list2;
                if (list3.size() == 1 && AbstractC17680n.m19341Q(list3) == null) {
                    objMo5214c = Double.valueOf(0.0d);
                } else if (list2.isEmpty()) {
                    objMo5214c = "";
                } else {
                    if (list2.size() == 1 || (AbstractC17680n.m19343S(list2) instanceof Boolean)) {
                        list = null;
                    } else {
                        list = list2;
                    }
                    if (list != null) {
                        objMo5214c = interfaceC4488c.mo5214c(AbstractC17680n.m19343S(list2));
                    } else {
                        objMo5214c = null;
                    }
                }
            } else if (list2.isEmpty()) {
                objMo5214c = "";
            } else {
                if (list2.size() == 1) {
                    list = null;
                } else {
                    list = null;
                }
                if (list != null) {
                    objMo5214c = interfaceC4488c.mo5214c(AbstractC17680n.m19343S(list2));
                } else {
                    objMo5214c = null;
                }
            }
            if (objMo5214c == null) {
                return obj;
            }
        }
        return objMo5214c;
    }

    /* JADX INFO: renamed from: b */
    public static final String m9074b(AbstractC21933K1 abstractC21933K1, C1991h resolver, EnumC21895B appType, String str) {
        AbstractC16544l.m18094g(abstractC21933K1, anhfj.CHOK);
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(appType, "appType");
        Throwable th2 = abstractC21933K1.f69485a;
        if (th2 instanceof C13396s) {
            AbstractC16544l.m18092e(th2, "null cannot be cast to non-null type com.openai.feature.onboarding.impl.api.model.response.OpenAIApiError");
            C13396s c13396s = (C13396s) th2;
            String str2 = c13396s.f42447Y.f42445d;
            if (AbstractC16544l.m18089b(str2, "phone_max_usage_exceeded")) {
                return resolver.m3160b(R.string.onboarding_error_max_usage_exceeded);
            }
            return AbstractC16544l.m18089b(str2, "invalid_phone_number") ? resolver.m3160b(R.string.onboarding_error_invalid_phone) : c13396s.f42448Z;
        }
        if (str == null) {
            return AbstractC9231W3.m9804b(abstractC21933K1, resolver, appType);
        }
        if (!(abstractC21933K1 instanceof C21949O1)) {
            return str;
        }
        C21949O1 c21949o1 = (C21949O1) abstractC21933K1;
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " (");
        sbM9895n.append(c21949o1.f69506b);
        sbM9895n.append(": ");
        return AbstractC9306j0.m9891j(c21949o1.f69507c, Separators.RPAREN, sbM9895n);
    }
}
