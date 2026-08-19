package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.config.AbstractC15340a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptor;
import p1113xn.AbstractC21329w;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;
import p523V9.AbstractC8138m0;
import p559Wn.C8969a;
import p559Wn.C8970b;
import p559Wn.C8972d;
import p559Wn.C8976h;
import p559Wn.InterfaceC8971c;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: ao.a0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11153a0 {

    /* JADX INFO: renamed from: a */
    public static final SerialDescriptor[] f33789a = new SerialDescriptor[0];

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f33790b = new KSerializer[0];

    /* JADX INFO: renamed from: c */
    public static final Object f33791c = new Object();

    /* JADX INFO: renamed from: a */
    public static final InlineClassDescriptor m12378a(String str, KSerializer kSerializer) {
        return new InlineClassDescriptor(str, new C11132F(kSerializer));
    }

    /* JADX INFO: renamed from: b */
    public static final Set m12379b(SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC11174l) {
            return ((InterfaceC11174l) serialDescriptor).mo10687b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo10682e());
        int iMo10682e = serialDescriptor.mo10682e();
        for (int i10 = 0; i10 < iMo10682e; i10++) {
            hashSet.add(serialDescriptor.mo10683f(i10));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor[] m12380c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f33789a : serialDescriptorArr;
    }

    /* JADX INFO: renamed from: e */
    public static final C8969a m12382e(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        AbstractC16544l.m18094g(values, "values");
        C11200y c11200y = new C11200y(str, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r6 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) AbstractC17678l.m19278A(i11, strArr);
            if (strName == null) {
                strName = r6.name();
            }
            c11200y.m18453j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC17678l.m19278A(i11, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    c11200y.m18454k(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new C8969a(str, values, c11200y);
    }

    /* JADX INFO: renamed from: f */
    public static final C8969a m12383f(String str, Enum[] values) {
        AbstractC16544l.m18094g(values, "values");
        return new C8969a(str, values);
    }

    /* JADX INFO: renamed from: h */
    public static final KSerializer m12385h(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m12386i(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        return AbstractC8138m0.m8667b(interfaceC3756d).isInterface();
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC3756d m12387j(InterfaceC3777y interfaceC3777y) {
        AbstractC16544l.m18094g(interfaceC3777y, "<this>");
        InterfaceC3757e classifier = interfaceC3777y.getClassifier();
        if (classifier instanceof InterfaceC3756d) {
            return (InterfaceC3756d) classifier;
        }
        if (!(classifier instanceof InterfaceC3778z)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    /* JADX INFO: renamed from: k */
    public static final void m12388k(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        String strMo4448c = interfaceC3756d.mo4448c();
        if (strMo4448c == null) {
            strMo4448c = "<local class name not available>";
        }
        throw new C8976h(AbstractC10763a.m11054l("Serializer for class '", strMo4448c, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX INFO: renamed from: l */
    public static final void m12389l(int i10, int i11, SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.mo10683f(i13));
            }
            i12 >>>= 1;
        }
        throw new C8970b(descriptor.mo10679a(), arrayList);
    }

    /* JADX INFO: renamed from: m */
    public static final void m12390m(InterfaceC3756d baseClass, String str) {
        String string;
        AbstractC16544l.m18094g(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.mo4448c() + '\'';
        if (str == null) {
            string = AbstractC10763a.m11047e('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC10763a.m11067y(sbM9896o, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM9896o.append(baseClass.mo4448c());
            sbM9896o.append("' has to be sealed and '@Serializable'.");
            string = sbM9896o.toString();
        }
        throw new C8976h(string);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d4, code lost:
    
        if (r1.mo5693b(r0).equals(r1.mo5693b(p559Wn.C8972d.class)) != false) goto L106;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer m12381d(InterfaceC3756d interfaceC3756d, KSerializer... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        KSerializer kSerializer;
        Class<?> cls;
        Object obj2;
        KSerializer kSerializerM12385h;
        Field field;
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        AbstractC16544l.m18094g(args, "args");
        Class clsM8667b = AbstractC8138m0.m8667b(interfaceC3756d);
        KSerializer[] args2 = (KSerializer[]) Arrays.copyOf(args, args.length);
        AbstractC16544l.m18094g(args2, "args");
        if (clsM8667b.isEnum() && clsM8667b.getAnnotation(InterfaceC8975g.class) == null && clsM8667b.getAnnotation(InterfaceC8971c.class) == null) {
            Object[] enumConstants = clsM8667b.getEnumConstants();
            String canonicalName = clsM8667b.getCanonicalName();
            AbstractC16544l.m18093f(canonicalName, "getCanonicalName(...)");
            AbstractC16544l.m18092e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C8969a(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr = (KSerializer[]) Arrays.copyOf(args2, args2.length);
        try {
            Field declaredField = clsM8667b.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer kSerializerM12385h2 = obj == null ? null : m12385h(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerM12385h2 != null) {
            return kSerializerM12385h2;
        }
        String canonicalName2 = clsM8667b.getCanonicalName();
        if (canonicalName2 == null || AbstractC21329w.m21734u(canonicalName2, "java.", false) || AbstractC21329w.m21734u(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            Field[] declaredFields = clsM8667b.getDeclaredFields();
            AbstractC16544l.m18093f(declaredFields, suYVq.nDmjyeDPmfeiLte);
            int length = declaredFields.length;
            int i10 = 0;
            boolean z6 = false;
            Field field2 = null;
            while (true) {
                if (i10 >= length) {
                    if (!z6) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i10];
                if (AbstractC16544l.m18089b(field3.getName(), "INSTANCE") && AbstractC16544l.m18089b(field3.getType(), clsM8667b) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z6) {
                        z6 = true;
                        field2 = field3;
                    }
                }
                i10++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                kSerializer = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsM8667b.getMethods();
                AbstractC16544l.m18093f(methods, "getMethods(...)");
                int length2 = methods.length;
                int i11 = 0;
                boolean z10 = false;
                Method method = null;
                while (true) {
                    if (i11 >= length2) {
                        if (!z10) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i11];
                    if (AbstractC16544l.m18089b(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && AbstractC16544l.m18089b(method2.getReturnType(), KSerializer.class)) {
                            if (!z10) {
                                z10 = true;
                                method = method2;
                            }
                        }
                    }
                    i11++;
                    method = null;
                    break;
                }
                if (method == null) {
                    kSerializer = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof KSerializer) {
                        kSerializer = (KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(args2, args2.length);
        Class<?>[] declaredClasses = clsM8667b.getDeclaredClasses();
        AbstractC16544l.m18093f(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i12];
            if (cls.getAnnotation(InterfaceC11146U.class) != null) {
                break;
            }
            i12++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsM8667b.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (kSerializerM12385h = m12385h(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsM8667b.getDeclaredClasses();
                AbstractC16544l.m18093f(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i13 = 0;
                boolean z11 = false;
                while (true) {
                    if (i13 < length4) {
                        Class<?> cls3 = declaredClasses2[i13];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z11) {
                                z11 = true;
                                cls2 = cls3;
                            }
                        }
                        i13++;
                    } else if (!z11) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                kSerializerM12385h = obj4 instanceof KSerializer ? (KSerializer) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        KSerializer kSerializer2 = kSerializerM12385h;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        if (clsM8667b.getAnnotation(InterfaceC8971c.class) == null) {
            InterfaceC8975g interfaceC8975g = (InterfaceC8975g) clsM8667b.getAnnotation(InterfaceC8975g.class);
            if (interfaceC8975g != null) {
                Class clsWith = interfaceC8975g.with();
                C16527D c16527d = AbstractC16526C.f51263a;
            }
            return null;
        }
        return new C8972d(AbstractC8138m0.m8670e(clsM8667b));
    }

    /* JADX INFO: renamed from: g */
    public static final int m12384g(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        AbstractC16544l.m18094g(serialDescriptor, FpwNpGDhomXHZ.TXhJiBgtqvxub);
        AbstractC16544l.m18094g(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.mo10679a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iMo10682e = serialDescriptor.mo10682e();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo10682e > 0)) {
                break;
            }
            int i11 = iMo10682e - 1;
            int i12 = i10 * 31;
            String strMo10679a = serialDescriptor.mo10685h(serialDescriptor.mo10682e() - iMo10682e).mo10679a();
            if (strMo10679a != null) {
                iHashCode2 = strMo10679a.hashCode();
            }
            i10 = i12 + iHashCode2;
            iMo10682e = i11;
        }
        int iMo10682e2 = serialDescriptor.mo10682e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo10682e2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iMo10682e2 - 1;
            int i14 = iHashCode3 * 31;
            AbstractC15340a kind = serialDescriptor.mo10685h(serialDescriptor.mo10682e() - iMo10682e2).getKind();
            iHashCode3 = i14 + (kind != null ? kind.hashCode() : 0);
            iMo10682e2 = i13;
        }
    }
}
