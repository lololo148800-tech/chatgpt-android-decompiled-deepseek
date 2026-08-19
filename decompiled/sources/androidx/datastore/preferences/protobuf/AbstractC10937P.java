package androidx.datastore.preferences.protobuf;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p160G5.p161rK.TVCuK;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10937P {

    /* JADX INFO: renamed from: a */
    public static final C10954d0 f32980a = new C10954d0();

    /* JADX INFO: renamed from: b */
    public static final C10956e0 f32981b = new C10956e0();

    /* JADX INFO: renamed from: a */
    public static void m11461a(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C10997z {
        if (!m11467i(b10)) {
            if ((((b10 + 112) + (b << 28)) >> 30) == 0 && !m11467i(b11) && !m11467i(b12)) {
                int i11 = ((b & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw C10997z.m11726a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11462b(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m11463c(byte b, byte b10, char[] cArr, int i10) throws C10997z {
        if (b < -62 || m11467i(b10)) {
            throw C10997z.m11726a();
        }
        cArr[i10] = (char) (((b & 31) << 6) | (b10 & 63));
    }

    /* JADX INFO: renamed from: d */
    public static void m11464d(byte b, byte b10, byte b11, char[] cArr, int i10) throws C10997z {
        if (m11467i(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m11467i(b11)))) {
            throw C10997z.m11726a();
        }
        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    /* JADX INFO: renamed from: e */
    public static final String m11465e(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m11466h(C10957f c10957f) {
        StringBuilder sb2 = new StringBuilder(c10957f.size());
        for (int i10 = 0; i10 < c10957f.size(); i10++) {
            byte b = c10957f.f33031Z[i10];
            if (b == 34) {
                sb2.append("\\\"");
            } else if (b == 39) {
                sb2.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b >>> 6) & 3) + 48));
                            sb2.append((char) (((b >>> 3) & 7) + 48));
                            sb2.append((char) ((b & 7) + 48));
                        } else {
                            sb2.append((char) b);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11467i(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: k */
    public static final void m11468k(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m11468k(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11468k(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C10957f c10957f = C10957f.f33028o0;
            sb2.append(m11466h(new C10957f(((String) obj).getBytes(AbstractC10993x.f33099a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C10957f) {
            sb2.append(": \"");
            sb2.append(m11466h((C10957f) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC10987u) {
            sb2.append(" {");
            m11469l((AbstractC10987u) obj, sb2, i10 + 2);
            sb2.append(Separators.RETURN);
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        m11468k(sb2, i13, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        m11468k(sb2, i13, "value", entry.getValue());
        sb2.append(Separators.RETURN);
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo11470f(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: g */
    public abstract int mo11471g(String str, byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: j */
    public abstract int mo11472j(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: m */
    public abstract void mo11473m(byte[] bArr, int i10, int i11);

    /* JADX WARN: Code duplicated, block: B:57:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX INFO: renamed from: l */
    public static void m11469l(AbstractC10987u abstractC10987u, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : abstractC10987u.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m11468k(sb2, i10, m11465e(str2), AbstractC10987u.m11716f(method2, abstractC10987u, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m11468k(sb2, i10, m11465e(str3), AbstractC10987u.m11716f(method3, abstractC10987u, new Object[0]));
                }
            }
            if (((Method) map2.get(TVCuK.qXHZcuZVbVnwa.concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objM11716f = AbstractC10987u.m11716f(method4, abstractC10987u, new Object[0]);
                    if (method5 == null) {
                        if (objM11716f instanceof Boolean) {
                            zEquals = !((Boolean) objM11716f).booleanValue();
                        } else if (objM11716f instanceof Integer) {
                            if (((Integer) objM11716f).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11716f instanceof Float) {
                            if (((Float) objM11716f).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11716f instanceof Double) {
                            if (((Double) objM11716f).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM11716f instanceof String) {
                            zEquals = objM11716f.equals("");
                        } else if (objM11716f instanceof C10957f) {
                            zEquals = objM11716f.equals(C10957f.f33028o0);
                        } else if (!(objM11716f instanceof AbstractC10947a) ? !((objM11716f instanceof Enum) && ((Enum) objM11716f).ordinal() == 0) : objM11716f != ((AbstractC10987u) ((AbstractC10987u) ((AbstractC10947a) objM11716f)).mo7129d(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC10987u.m11716f(method5, abstractC10987u, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m11468k(sb2, i10, m11465e(str4), objM11716f);
                    }
                }
            }
        }
        C10964i0 c10964i0 = abstractC10987u.unknownFields;
        if (c10964i0 != null) {
            for (int i11 = 0; i11 < c10964i0.f33060a; i11++) {
                m11468k(sb2, i10, String.valueOf(c10964i0.f33061b[i11] >>> 3), c10964i0.f33062c[i11]);
            }
        }
    }
}
