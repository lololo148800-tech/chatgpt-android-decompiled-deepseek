package androidx.glance.appwidget.protobuf;

import android.gov.nist.core.Separators;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p523V9.AbstractC8194t0;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11017M {

    /* JADX INFO: renamed from: a */
    public static final char[] f33245a;

    static {
        char[] cArr = new char[80];
        f33245a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m11876a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f33245a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11877b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m11877b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11877b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m11876a(i10, sb2);
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
            C11042g c11042g = C11042g.f33300o0;
            sb2.append(AbstractC8194t0.m8796b(new C11042g(((String) obj).getBytes(AbstractC11063y.f33343a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C11042g) {
            sb2.append(": \"");
            sb2.append(AbstractC8194t0.m8796b((C11042g) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC11059u) {
            sb2.append(" {");
            m11878c((AbstractC11059u) obj, sb2, i10 + 2);
            sb2.append(Separators.RETURN);
            m11876a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        m11877b(sb2, i12, CsqksqyPE.bAmw, entry.getKey());
        m11877b(sb2, i12, "value", entry.getValue());
        sb2.append(Separators.RETURN);
        m11876a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    /* JADX INFO: renamed from: c */
    public static void m11878c(AbstractC11059u abstractC11059u, StringBuilder sb2, int i10) {
        int i11;
        Method method;
        Method method2;
        Object objM12096f;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC11059u.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method5 = declaredMethods[i12];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                m11877b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC11059u.m12096f(method4, abstractC11059u, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m11877b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC11059u.m12096f(method3, abstractC11059u, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM12096f = AbstractC11059u.m12096f(method, abstractC11059u, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM12096f instanceof Boolean) {
                                    zEquals = !((Boolean) objM12096f).booleanValue();
                                } else if (objM12096f instanceof Integer) {
                                    if (((Integer) objM12096f).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM12096f instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM12096f).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM12096f instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM12096f).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM12096f instanceof String) {
                                    zEquals = objM12096f.equals("");
                                } else if (objM12096f instanceof C11042g) {
                                    zEquals = objM12096f.equals(C11042g.f33300o0);
                                } else if ((objM12096f instanceof AbstractC11030a) ? !((objM12096f instanceof Enum) && ((Enum) objM12096f).ordinal() == 0) : objM12096f != ((AbstractC11059u) ((AbstractC11059u) ((AbstractC11030a) objM12096f)).mo12101d(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC11059u.m12096f(method2, abstractC11059u, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m11877b(sb2, i10, strSubstring, objM12096f);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM12096f = AbstractC11059u.m12096f(method, abstractC11059u, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM12096f instanceof Boolean) {
                                zEquals = !((Boolean) objM12096f).booleanValue();
                            } else if (objM12096f instanceof Integer) {
                                if (((Integer) objM12096f).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM12096f instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM12096f).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM12096f instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM12096f).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM12096f instanceof String) {
                                zEquals = objM12096f.equals("");
                            } else if (objM12096f instanceof C11042g) {
                                zEquals = objM12096f.equals(C11042g.f33300o0);
                            } else if (objM12096f instanceof AbstractC11030a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC11059u.m12096f(method2, abstractC11059u, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m11877b(sb2, i10, strSubstring, objM12096f);
                        }
                    }
                }
            }
            i11 = 3;
        }
        C11029Z c11029z = abstractC11059u.unknownFields;
        if (c11029z != null) {
            for (int i13 = 0; i13 < c11029z.f33280a; i13++) {
                m11877b(sb2, i10, String.valueOf(c11029z.f33281b[i13] >>> 3), c11029z.f33282c[i13]);
            }
        }
    }
}
