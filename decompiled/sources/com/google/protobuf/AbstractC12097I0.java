package com.google.protobuf;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.I0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12097I0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f36889a;

    static {
        char[] cArr = new char[80];
        f36889a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m13748a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f36889a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13749b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m13749b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m13749b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m13748a(i10, sb2);
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
            sb2.append(AbstractC12153g.m13959T(AbstractC12171m.m14011m((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC12171m) {
            sb2.append(": \"");
            sb2.append(AbstractC12153g.m13959T((AbstractC12171m) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC12133Z) {
            sb2.append(" {");
            m13750c((AbstractC12133Z) obj, sb2, i10 + 2);
            sb2.append(Separators.RETURN);
            m13748a(i10, sb2);
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
        m13749b(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        m13749b(sb2, i12, "value", entry.getValue());
        sb2.append(Separators.RETURN);
        m13748a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:107:0x0207  */
    /* JADX WARN: Code duplicated, block: B:132:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00e7 A[SYNTHETIC] */
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
    public static void m13750c(AbstractC12133Z abstractC12133Z, StringBuilder sb2, int i10) {
        int i11;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objInvokeOrDie;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = abstractC12133Z.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i12];
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
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (java.lang.reflect.Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                m13749b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC12133Z.invokeOrDie(method4, abstractC12133Z, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (java.lang.reflect.Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m13749b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC12133Z.invokeOrDie(method3, abstractC12133Z, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (java.lang.reflect.Method) entry.getValue();
                        method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objInvokeOrDie = AbstractC12133Z.invokeOrDie(method, abstractC12133Z, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objInvokeOrDie instanceof Boolean) {
                                    zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                                } else if (objInvokeOrDie instanceof Integer) {
                                    if (((Integer) objInvokeOrDie).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof String) {
                                    zEquals = objInvokeOrDie.equals("");
                                } else if (objInvokeOrDie instanceof AbstractC12171m) {
                                    zEquals = objInvokeOrDie.equals(AbstractC12171m.f37047Z);
                                } else if ((objInvokeOrDie instanceof InterfaceC12091G0) ? !((objInvokeOrDie instanceof java.lang.Enum) && ((java.lang.Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((InterfaceC12091G0) objInvokeOrDie).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC12133Z.invokeOrDie(method2, abstractC12133Z, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m13749b(sb2, i10, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    method = (java.lang.reflect.Method) entry.getValue();
                    method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objInvokeOrDie = AbstractC12133Z.invokeOrDie(method, abstractC12133Z, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objInvokeOrDie instanceof Boolean) {
                                zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                            } else if (objInvokeOrDie instanceof Integer) {
                                if (((Integer) objInvokeOrDie).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objInvokeOrDie instanceof String) {
                                zEquals = objInvokeOrDie.equals("");
                            } else if (objInvokeOrDie instanceof AbstractC12171m) {
                                zEquals = objInvokeOrDie.equals(AbstractC12171m.f37047Z);
                            } else if (objInvokeOrDie instanceof InterfaceC12091G0) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC12133Z.invokeOrDie(method2, abstractC12133Z, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m13749b(sb2, i10, strSubstring, objInvokeOrDie);
                        }
                    }
                }
            }
            i11 = 3;
        }
        if (abstractC12133Z instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator itM13849l = ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.m13849l();
            while (itM13849l.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM13849l.next();
                m13749b(sb2, i10, AbstractC10763a.m11056n(new StringBuilder("["), ((C12127W) entry2.getKey()).f36983Y, "]"), entry2.getValue());
            }
        }
        C12182p1 c12182p1 = abstractC12133Z.unknownFields;
        if (c12182p1 != null) {
            for (int i13 = 0; i13 < c12182p1.f37069a; i13++) {
                m13749b(sb2, i10, String.valueOf(c12182p1.f37070b[i13] >>> 3), c12182p1.f37071c[i13]);
            }
        }
    }
}
