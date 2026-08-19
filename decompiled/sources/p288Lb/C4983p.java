package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p001A.C0093v0;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.C3674q;
import p214Ib.EnumC3665h;
import p214Ib.InterfaceC3657C;
import p228J.AbstractC3794B0;
import p240Jb.InterfaceC4324a;
import p240Jb.InterfaceC4325b;
import p265Kb.AbstractC4611d;
import p265Kb.AbstractC4626s;
import p265Kb.C4615h;
import p335Nb.AbstractC5704c;

/* JADX INFO: renamed from: Lb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4983p implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final C0093v0 f16244Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC3665h f16245Z;

    /* JADX INFO: renamed from: o0 */
    public final C4615h f16246o0;

    /* JADX INFO: renamed from: p0 */
    public final List f16247p0;

    public C4983p(C0093v0 c0093v0, EnumC3665h enumC3665h, C4615h c4615h, C4970c c4970c, List list) {
        this.f16244Y = c0093v0;
        this.f16245Z = enumC3665h;
        this.f16246o0 = c4615h;
        this.f16247p0 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m5640b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC4626s.f15074a.mo5372a(obj, accessibleObject)) {
            throw new C3674q(AbstractC10763a.m11052j(AbstractC5704c.m6150d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        AbstractC4611d.m5346e(this.f16247p0);
        return AbstractC5704c.f18489a.mo6146e(rawType) ? new C4982o(rawType, m5641c(c3669l, typeToken, rawType, true)) : new C4981n(this.f16244Y.m345n(typeToken), m5641c(c3669l, typeToken, rawType, false));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX INFO: renamed from: c */
    public final LinkedHashMap m5641c(C3669l c3669l, TypeToken typeToken, Class cls, boolean z6) {
        boolean z10;
        Method method;
        Type typeM5351j;
        InterfaceC4325b interfaceC4325b;
        String strValue;
        String[] strArrAlternate;
        List list;
        List listSingletonList;
        int size;
        ?? r6;
        C4979l c4979l;
        ?? r10;
        C4979l c4979l2;
        Field field;
        int i10;
        boolean z11;
        int i11;
        Field[] fieldArr;
        Class cls2;
        boolean z12;
        TypeToken<?> typeToken2;
        Class<? super Object> rawType;
        C4979l c4979l3;
        boolean z13;
        int modifiers;
        boolean z14;
        InterfaceC4324a interfaceC4324a;
        AbstractC3656B abstractC3656BM4372f;
        boolean z15;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken3 = typeToken;
        Class rawType2 = cls;
        while (rawType2 != Object.class) {
            Field[] declaredFields = rawType2.getDeclaredFields();
            if (rawType2 != cls && declaredFields.length > 0) {
                AbstractC4611d.m5346e(this.f16247p0);
            }
            int length = declaredFields.length;
            boolean z16 = false;
            int i12 = 0;
            while (i12 < length) {
                Field field2 = declaredFields[i12];
                boolean zM5642d = this.m5642d(field2, true);
                boolean zM5642d2 = this.m5642d(field2, z16);
                if (zM5642d || zM5642d2) {
                    if (z6) {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            z10 = z16;
                        } else {
                            Method methodMo6143b = AbstractC5704c.f18489a.mo6143b(rawType2, field2);
                            AbstractC5704c.m6151e(methodMo6143b);
                            if (methodMo6143b.getAnnotation(InterfaceC4325b.class) != null && field2.getAnnotation(InterfaceC4325b.class) == null) {
                                throw new C3674q(AbstractC10763a.m11054l("@SerializedName on ", AbstractC5704c.m6150d(methodMo6143b, z16), " is not supported"));
                            }
                            z10 = zM5642d2;
                            method = methodMo6143b;
                        }
                        if (method == null) {
                            AbstractC5704c.m6151e(field2);
                        }
                        typeM5351j = AbstractC4611d.m5351j(typeToken3.getType(), rawType2, field2.getGenericType(), new HashMap());
                        interfaceC4325b = (InterfaceC4325b) field2.getAnnotation(InterfaceC4325b.class);
                        if (interfaceC4325b == null) {
                            listSingletonList = Collections.singletonList(this.f16245Z.mo4361b(field2));
                        } else {
                            strValue = interfaceC4325b.value();
                            strArrAlternate = interfaceC4325b.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                list = arrayList;
                            }
                            size = list.size();
                            r6 = z16;
                            c4979l = null;
                            r10 = list;
                            while (r6 < size) {
                                String str = (String) r10.get(r6);
                                if (r6 != 0) {
                                    z12 = z16;
                                } else {
                                    z12 = zM5642d;
                                }
                                typeToken2 = TypeToken.get(typeM5351j);
                                rawType = typeToken2.getRawType();
                                c4979l3 = c4979l;
                                if ((rawType instanceof Class) || !rawType.isPrimitive()) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                modifiers = field2.getModifiers();
                                if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                interfaceC4324a = (InterfaceC4324a) field2.getAnnotation(InterfaceC4324a.class);
                                if (interfaceC4324a != null) {
                                    abstractC3656BM4372f = C4970c.m5611b(this.f16244Y, c3669l, typeToken2, interfaceC4324a);
                                } else {
                                    abstractC3656BM4372f = null;
                                }
                                if (abstractC3656BM4372f != null) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (abstractC3656BM4372f == null) {
                                    abstractC3656BM4372f = c3669l.m4372f(typeToken2);
                                }
                                ?? r23 = r6;
                                int i13 = size;
                                ?? r30 = r10;
                                Field field3 = field2;
                                int i14 = i12;
                                int i15 = length;
                                Field[] fieldArr2 = declaredFields;
                                boolean z17 = z13;
                                Class cls3 = rawType2;
                                c4979l = (C4979l) linkedHashMap.put(str, new C4979l(str, field2, z12, z10, false, method, z15, abstractC3656BM4372f, c3669l, typeToken2, z17, z14));
                                if (c4979l3 == null) {
                                    c4979l = c4979l3;
                                }
                                this = this;
                                c3669l = c3669l;
                                zM5642d = z12;
                                z16 = false;
                                rawType2 = cls3;
                                length = i15;
                                field2 = field3;
                                declaredFields = fieldArr2;
                                size = i13;
                                r10 = r30;
                                i12 = i14;
                                r6 = (r23 == true ? 1 : 0) + 1;
                            }
                            c4979l2 = c4979l;
                            field = field2;
                            i10 = i12;
                            z11 = z16;
                            i11 = length;
                            fieldArr = declaredFields;
                            cls2 = rawType2;
                            if (c4979l2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + c4979l2.f16225a + "'; conflict is caused by fields " + AbstractC5704c.m6149c(c4979l2.f16226b) + " and " + AbstractC5704c.m6149c(field));
                            }
                        }
                        list = listSingletonList;
                        size = list.size();
                        r6 = z16;
                        c4979l = null;
                        r10 = list;
                        while (r6 < size) {
                            String str2 = (String) r10.get(r6);
                            if (r6 != 0) {
                                z12 = z16;
                            } else {
                                z12 = zM5642d;
                            }
                            typeToken2 = TypeToken.get(typeM5351j);
                            rawType = typeToken2.getRawType();
                            c4979l3 = c4979l;
                            if (rawType instanceof Class) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            interfaceC4324a = (InterfaceC4324a) field2.getAnnotation(InterfaceC4324a.class);
                            if (interfaceC4324a != null) {
                                abstractC3656BM4372f = C4970c.m5611b(this.f16244Y, c3669l, typeToken2, interfaceC4324a);
                            } else {
                                abstractC3656BM4372f = null;
                            }
                            if (abstractC3656BM4372f != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (abstractC3656BM4372f == null) {
                                abstractC3656BM4372f = c3669l.m4372f(typeToken2);
                            }
                            ?? r24 = r6;
                            int i16 = size;
                            ?? r31 = r10;
                            Field field4 = field2;
                            int i17 = i12;
                            int i18 = length;
                            Field[] fieldArr3 = declaredFields;
                            boolean z18 = z13;
                            Class cls4 = rawType2;
                            c4979l = (C4979l) linkedHashMap.put(str2, new C4979l(str2, field2, z12, z10, false, method, z15, abstractC3656BM4372f, c3669l, typeToken2, z18, z14));
                            if (c4979l3 == null) {
                                c4979l = c4979l3;
                            }
                            this = this;
                            c3669l = c3669l;
                            zM5642d = z12;
                            z16 = false;
                            rawType2 = cls4;
                            length = i18;
                            field2 = field4;
                            declaredFields = fieldArr3;
                            size = i16;
                            r10 = r31;
                            i12 = i17;
                            r6 = (r24 == true ? 1 : 0) + 1;
                        }
                        c4979l2 = c4979l;
                        field = field2;
                        i10 = i12;
                        z11 = z16;
                        i11 = length;
                        fieldArr = declaredFields;
                        cls2 = rawType2;
                        if (c4979l2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + c4979l2.f16225a + "'; conflict is caused by fields " + AbstractC5704c.m6149c(c4979l2.f16226b) + " and " + AbstractC5704c.m6149c(field));
                        }
                    } else {
                        z10 = zM5642d2;
                    }
                    method = null;
                    if (method == null) {
                        AbstractC5704c.m6151e(field2);
                    }
                    typeM5351j = AbstractC4611d.m5351j(typeToken3.getType(), rawType2, field2.getGenericType(), new HashMap());
                    interfaceC4325b = (InterfaceC4325b) field2.getAnnotation(InterfaceC4325b.class);
                    if (interfaceC4325b == null) {
                        listSingletonList = Collections.singletonList(this.f16245Z.mo4361b(field2));
                    } else {
                        strValue = interfaceC4325b.value();
                        strArrAlternate = interfaceC4325b.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                            arrayList2.add(strValue);
                            Collections.addAll(arrayList2, strArrAlternate);
                            list = arrayList2;
                        }
                        size = list.size();
                        r6 = z16;
                        c4979l = null;
                        r10 = list;
                        while (r6 < size) {
                            String str3 = (String) r10.get(r6);
                            if (r6 != 0) {
                                z12 = z16;
                            } else {
                                z12 = zM5642d;
                            }
                            typeToken2 = TypeToken.get(typeM5351j);
                            rawType = typeToken2.getRawType();
                            c4979l3 = c4979l;
                            if (rawType instanceof Class) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            interfaceC4324a = (InterfaceC4324a) field2.getAnnotation(InterfaceC4324a.class);
                            if (interfaceC4324a != null) {
                                abstractC3656BM4372f = C4970c.m5611b(this.f16244Y, c3669l, typeToken2, interfaceC4324a);
                            } else {
                                abstractC3656BM4372f = null;
                            }
                            if (abstractC3656BM4372f != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (abstractC3656BM4372f == null) {
                                abstractC3656BM4372f = c3669l.m4372f(typeToken2);
                            }
                            ?? r25 = r6;
                            int i19 = size;
                            ?? r32 = r10;
                            Field field5 = field2;
                            int i110 = i12;
                            int i111 = length;
                            Field[] fieldArr4 = declaredFields;
                            boolean z19 = z13;
                            Class cls5 = rawType2;
                            c4979l = (C4979l) linkedHashMap.put(str3, new C4979l(str3, field2, z12, z10, false, method, z15, abstractC3656BM4372f, c3669l, typeToken2, z19, z14));
                            if (c4979l3 == null) {
                                c4979l = c4979l3;
                            }
                            this = this;
                            c3669l = c3669l;
                            zM5642d = z12;
                            z16 = false;
                            rawType2 = cls5;
                            length = i111;
                            field2 = field5;
                            declaredFields = fieldArr4;
                            size = i19;
                            r10 = r32;
                            i12 = i110;
                            r6 = (r25 == true ? 1 : 0) + 1;
                        }
                        c4979l2 = c4979l;
                        field = field2;
                        i10 = i12;
                        z11 = z16;
                        i11 = length;
                        fieldArr = declaredFields;
                        cls2 = rawType2;
                        if (c4979l2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + c4979l2.f16225a + "'; conflict is caused by fields " + AbstractC5704c.m6149c(c4979l2.f16226b) + " and " + AbstractC5704c.m6149c(field));
                        }
                    }
                    list = listSingletonList;
                    size = list.size();
                    r6 = z16;
                    c4979l = null;
                    r10 = list;
                    while (r6 < size) {
                        String str4 = (String) r10.get(r6);
                        if (r6 != 0) {
                            z12 = z16;
                        } else {
                            z12 = zM5642d;
                        }
                        typeToken2 = TypeToken.get(typeM5351j);
                        rawType = typeToken2.getRawType();
                        c4979l3 = c4979l;
                        if (rawType instanceof Class) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        interfaceC4324a = (InterfaceC4324a) field2.getAnnotation(InterfaceC4324a.class);
                        if (interfaceC4324a != null) {
                            abstractC3656BM4372f = C4970c.m5611b(this.f16244Y, c3669l, typeToken2, interfaceC4324a);
                        } else {
                            abstractC3656BM4372f = null;
                        }
                        if (abstractC3656BM4372f != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (abstractC3656BM4372f == null) {
                            abstractC3656BM4372f = c3669l.m4372f(typeToken2);
                        }
                        ?? r26 = r6;
                        int i112 = size;
                        ?? r33 = r10;
                        Field field6 = field2;
                        int i113 = i12;
                        int i114 = length;
                        Field[] fieldArr5 = declaredFields;
                        boolean z110 = z13;
                        Class cls6 = rawType2;
                        c4979l = (C4979l) linkedHashMap.put(str4, new C4979l(str4, field2, z12, z10, false, method, z15, abstractC3656BM4372f, c3669l, typeToken2, z110, z14));
                        if (c4979l3 == null) {
                            c4979l = c4979l3;
                        }
                        this = this;
                        c3669l = c3669l;
                        zM5642d = z12;
                        z16 = false;
                        rawType2 = cls6;
                        length = i114;
                        field2 = field6;
                        declaredFields = fieldArr5;
                        size = i112;
                        r10 = r33;
                        i12 = i113;
                        r6 = (r26 == true ? 1 : 0) + 1;
                    }
                    c4979l2 = c4979l;
                    field = field2;
                    i10 = i12;
                    z11 = z16;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = rawType2;
                    if (c4979l2 == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + c4979l2.f16225a + "'; conflict is caused by fields " + AbstractC5704c.m6149c(c4979l2.f16226b) + " and " + AbstractC5704c.m6149c(field));
                    }
                } else {
                    i10 = i12;
                    z11 = z16;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = rawType2;
                }
                i12 = i10 + 1;
                this = this;
                c3669l = c3669l;
                z16 = z11;
                rawType2 = cls2;
                length = i11;
                declaredFields = fieldArr;
            }
            Class cls7 = rawType2;
            typeToken3 = TypeToken.get(AbstractC4611d.m5351j(typeToken3.getType(), cls7, cls7.getGenericSuperclass(), new HashMap()));
            rawType2 = typeToken3.getRawType();
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5642d(Field field, boolean z6) {
        Class<?> type = field.getType();
        C4615h c4615h = this.f16246o0;
        c4615h.getClass();
        if (!C4615h.m5362c(type)) {
            c4615h.m5363b(z6);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !C4615h.m5362c(field.getType())) {
                List list = z6 ? c4615h.f15043Y : c4615h.f15044Z;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        throw AbstractC3794B0.m4497v(it);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
