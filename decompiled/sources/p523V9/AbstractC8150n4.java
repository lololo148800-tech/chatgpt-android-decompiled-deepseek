package p523V9;

import android.os.Build;
import android.widget.EdgeEffect;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p108E2.AbstractC2244c;
import p108E2.AbstractC2245d;
import p1113xn.AbstractC21322p;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p677c8.C11689a;
import sl.C19674i;

/* JADX INFO: renamed from: V9.n4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8150n4 {
    /* JADX INFO: renamed from: a */
    public static final C19674i m8688a(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        return new C19674i(str);
    }

    /* JADX INFO: renamed from: c */
    public static float m8690c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2245d.m3273b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m8691d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2245d.m3274c(edgeEffect, f10, f11);
        }
        AbstractC2244c.m3271a(edgeEffect, f10, f11);
        return f10;
    }

    /* JADX INFO: renamed from: e */
    public static final String m8692e(String str) {
        char lowerCase;
        AbstractC16544l.m18094g(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if ('A' > cCharAt || cCharAt >= '[') {
                lowerCase = (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt;
            } else {
                lowerCase = (char) (cCharAt + ' ');
            }
            if (lowerCase != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iM21674H = AbstractC21322p.m21674H(str);
        if (i10 <= iM21674H) {
            while (true) {
                char cCharAt2 = str.charAt(i10);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb2.append(cCharAt2);
                if (i10 == iM21674H) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static C11689a m8689b(Map featureContext) {
        int i10;
        int i11;
        int i12;
        AbstractC16544l.m18094g(featureContext, "featureContext");
        Object obj = featureContext.get("application_id");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = featureContext.get("session_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = featureContext.get("session_active");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = featureContext.get("session_state");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        int[] iArrM27k = AbstractC0010F.m27k(3);
        int length = iArrM27k.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i10 = 0;
                break;
            }
            i10 = iArrM27k[i13];
            if (AbstractC12107L1.m13816g(i10).equals(str3)) {
                break;
            }
            i13++;
        }
        Object obj5 = featureContext.get("session_start_reason");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        int[] iArrM27k2 = AbstractC0010F.m27k(7);
        int length2 = iArrM27k2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                i11 = 0;
                break;
            }
            i11 = iArrM27k2[i14];
            if (AbstractC12107L1.m13815f(i11).equals(str4)) {
                break;
            }
            i14++;
        }
        Object obj6 = featureContext.get("view_id");
        String str5 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = featureContext.get("view_name");
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = featureContext.get("view_url");
        String str7 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = featureContext.get("view_type");
        String str8 = obj9 instanceof String ? (String) obj9 : null;
        int[] iArrM27k3 = AbstractC0010F.m27k(4);
        int length3 = iArrM27k3.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length3) {
                i12 = 0;
                break;
            }
            i12 = iArrM27k3[i15];
            if (AbstractC12107L1.m13817h(i12).equals(str8)) {
                break;
            }
            i15++;
        }
        Object obj10 = featureContext.get("action_id");
        String str9 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = featureContext.get("synthetics_test_id");
        String str10 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = featureContext.get("synthetics_result_id");
        String str11 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = featureContext.get("view_has_replay");
        Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        Object obj14 = featureContext.get(MMVKXkcLpuHFDi.efWF);
        Long l4 = obj14 instanceof Long ? (Long) obj14 : null;
        long jLongValue = l4 != null ? l4.longValue() : 0L;
        Object obj15 = featureContext.get("view_timestamp_offset");
        Long l10 = obj15 instanceof Long ? (Long) obj15 : null;
        long jLongValue2 = l10 != null ? l10.longValue() : 0L;
        if (str == null) {
            str = C11689a.f35456p;
        }
        String str12 = str;
        if (str2 == null) {
            str2 = C11689a.f35456p;
        }
        return new C11689a(str12, str2, bool != null ? bool.booleanValue() : false, str5, str6, str7, str9, i10 == 0 ? 1 : i10, i11 == 0 ? 1 : i11, i12 == 0 ? 1 : i12, str10, str11, jLongValue, jLongValue2, zBooleanValue);
    }
}
