package com.google.android.gms.internal.play_billing;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.A1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11855A1 {

    /* JADX INFO: renamed from: a */
    public static final char[] f36096a;

    static {
        char[] cArr = new char[80];
        f36096a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m13217a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m13217a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m13217a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m13218b(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC11957g1.m13444f(new C11929Z0(((String) obj).getBytes(AbstractC11989o1.f36309a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C11929Z0) {
            sb2.append(": \"");
            sb2.append(AbstractC11957g1.m13444f((C11929Z0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC11969j1) {
            sb2.append(" {");
            m13219c((AbstractC11969j1) obj, sb2, i10 + 2);
            sb2.append(Separators.RETURN);
            m13218b(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m13217a(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        m13217a(sb2, i12, "value", entry.getValue());
        sb2.append(Separators.RETURN);
        m13218b(i10, sb2);
        sb2.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m13218b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f36096a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX INFO: renamed from: c */
    public static void m13219c(AbstractC11969j1 abstractC11969j1, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC11969j1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m13217a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC11969j1.m13475i(method2, abstractC11969j1, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m13217a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC11969j1.m13475i(method, abstractC11969j1, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM13475i = AbstractC11969j1.m13475i(method4, abstractC11969j1, new Object[0]);
                    if (method5 == null) {
                        if (objM13475i instanceof Boolean) {
                            if (((Boolean) objM13475i).booleanValue()) {
                                m13217a(sb2, i10, strSubstring, objM13475i);
                            }
                        } else if (objM13475i instanceof Integer) {
                            if (((Integer) objM13475i).intValue() != 0) {
                                m13217a(sb2, i10, strSubstring, objM13475i);
                            }
                        } else if (objM13475i instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM13475i).floatValue()) != 0) {
                                m13217a(sb2, i10, strSubstring, objM13475i);
                            }
                        } else if (!(objM13475i instanceof Double)) {
                            if (objM13475i instanceof String) {
                                zEquals = objM13475i.equals("");
                            } else if (objM13475i instanceof C11929Z0) {
                                zEquals = objM13475i.equals(C11929Z0.f36227o0);
                            } else if (objM13475i instanceof AbstractC11908S0) {
                                if (objM13475i != ((AbstractC11969j1) ((AbstractC11969j1) ((AbstractC11908S0) objM13475i)).mo13306d(6))) {
                                    m13217a(sb2, i10, strSubstring, objM13475i);
                                }
                            } else if (!(objM13475i instanceof Enum) || ((Enum) objM13475i).ordinal() != 0) {
                                m13217a(sb2, i10, strSubstring, objM13475i);
                            }
                            if (!zEquals) {
                                m13217a(sb2, i10, strSubstring, objM13475i);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM13475i).doubleValue()) != 0) {
                            m13217a(sb2, i10, strSubstring, objM13475i);
                        }
                    } else if (((Boolean) AbstractC11969j1.m13475i(method5, abstractC11969j1, new Object[0])).booleanValue()) {
                        m13217a(sb2, i10, strSubstring, objM13475i);
                    }
                }
            }
            i11 = 3;
        }
        C11892M1 c11892m1 = abstractC11969j1.zzc;
        if (c11892m1 != null) {
            for (int i13 = 0; i13 < c11892m1.f36162a; i13++) {
                m13217a(sb2, i10, String.valueOf(c11892m1.f36163b[i13] >>> 3), c11892m1.f36164c[i13]);
            }
        }
    }
}
