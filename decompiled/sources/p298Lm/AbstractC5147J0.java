package p298Lm;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16540h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16555w;
import kotlin.jvm.internal.InterfaceC16528E;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21329w;
import p225Im.InterfaceC3755c;
import p523V9.AbstractC8138m0;
import p544W9.AbstractC8495I3;
import p571X9.AbstractC9393x3;
import p582Xk.HXHG.bQBnquXS;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Lm.J0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5147J0 {

    /* JADX INFO: renamed from: a */
    public static final FqName f16786a = new FqName("kotlin.jvm.JvmStatic");

    /* JADX INFO: renamed from: a */
    public static final AbstractC5202t m5713a(InterfaceC3755c interfaceC3755c) {
        AbstractC5202t abstractC5202t = interfaceC3755c instanceof AbstractC5202t ? (AbstractC5202t) interfaceC3755c : null;
        if (abstractC5202t != null) {
            return abstractC5202t;
        }
        C5152N c5152nM5714b = m5714b(interfaceC3755c);
        return c5152nM5714b != null ? c5152nM5714b : m5715c(interfaceC3755c);
    }

    /* JADX INFO: renamed from: b */
    public static final C5152N m5714b(Object obj) {
        C5152N c5152n = obj instanceof C5152N ? (C5152N) obj : null;
        if (c5152n != null) {
            return c5152n;
        }
        AbstractC16540h abstractC16540h = obj instanceof AbstractC16540h ? (AbstractC16540h) obj : null;
        InterfaceC3755c interfaceC3755cCompute = abstractC16540h != null ? abstractC16540h.compute() : null;
        if (interfaceC3755cCompute instanceof C5152N) {
            return (C5152N) interfaceC3755cCompute;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC5203t0 m5715c(Object obj) {
        AbstractC5203t0 abstractC5203t0 = obj instanceof AbstractC5203t0 ? (AbstractC5203t0) obj : null;
        if (abstractC5203t0 != null) {
            return abstractC5203t0;
        }
        AbstractC16555w abstractC16555w = obj instanceof AbstractC16555w ? (AbstractC16555w) obj : null;
        InterfaceC3755c interfaceC3755cCompute = abstractC16555w != null ? abstractC16555w.compute() : null;
        if (interfaceC3755cCompute instanceof AbstractC5203t0) {
            return (AbstractC5203t0) interfaceC3755cCompute;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final ArrayList m5716d(Annotated annotated) throws IllegalAccessException, InvocationTargetException {
        List listM9974d;
        AbstractC16544l.m18094g(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (true) {
            Annotation annotationM5722j = null;
            if (!it.hasNext()) {
                break;
            }
            AnnotationDescriptor next = it.next();
            SourceElement source = next.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationM5722j = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                if (reflectJavaAnnotation != null) {
                    annotationM5722j = reflectJavaAnnotation.getAnnotation();
                }
            } else {
                annotationM5722j = m5722j(next);
            }
            if (annotationM5722j != null) {
                arrayList.add(annotationM5722j);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (AbstractC8138m0.m8667b(AbstractC8138m0.m8666a((Annotation) it2.next())).getSimpleName().equals("Container")) {
                ArrayList arrayList2 = new ArrayList();
                for (Annotation annotation : arrayList) {
                    Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation));
                    if (!clsM8667b.getSimpleName().equals("Container") || clsM8667b.getAnnotation(InterfaceC16528E.class) == null) {
                        listM9974d = AbstractC9393x3.m9974d(annotation);
                    } else {
                        Object objInvoke = clsM8667b.getDeclaredMethod("value", null).invoke(annotation, null);
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listM9974d = AbstractC17678l.m19296c((Annotation[]) objInvoke);
                    }
                    AbstractC17686t.m19398v(listM9974d, arrayList2);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m5717e(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final CallableDescriptor m5718f(Class moduleAnchor, GeneratedMessageLite.ExtendableMessage proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, InterfaceC1439n interfaceC1439n) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        AbstractC16544l.m18094g(moduleAnchor, "moduleAnchor");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        RuntimeModuleData runtimeModuleDataM5682a = AbstractC5133C0.m5682a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = runtimeModuleDataM5682a.getDeserialization();
        ModuleDescriptor module = runtimeModuleDataM5682a.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        AbstractC16544l.m18091d(list);
        return (CallableDescriptor) interfaceC1439n.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, list)), proto);
    }

    /* JADX INFO: renamed from: g */
    public static final ReceiverParameterDescriptor m5719g(CallableMemberDescriptor callableMemberDescriptor) {
        AbstractC16544l.m18094g(callableMemberDescriptor, "<this>");
        if (callableMemberDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m5720h(C5213y0 c5213y0) {
        KotlinType kotlinType = c5213y0.f16935Y;
        return kotlinType != null && InlineClassesUtilsKt.needsMfvcFlattening(kotlinType);
    }

    /* JADX INFO: renamed from: j */
    public static final Annotation m5722j(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class clsM5723k = annotationClass != null ? m5723k(annotationClass) : null;
        if (!(clsM5723k instanceof Class)) {
            clsM5723k = null;
        }
        if (clsM5723k == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsM5723k.getClassLoader();
            AbstractC16544l.m18093f(classLoader, "getClassLoader(...)");
            Object objM5724l = m5724l(constantValue, classLoader);
            C17309l c17309l = objM5724l != null ? new C17309l(name.asString(), objM5724l) : null;
            if (c17309l != null) {
                arrayList.add(c17309l);
            }
        }
        Map mapM19253o = AbstractC17659D.m19253o(arrayList);
        Set setKeySet = mapM19253o.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM5723k.getDeclaredMethod((String) it2.next(), null));
        }
        return (Annotation) AbstractC8495I3.m9153a(clsM5723k, mapM19253o, arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public static final Class m5723k(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        SourceElement source = classDescriptor.getSource();
        AbstractC16544l.m18093f(source, "getSource(...)");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            AbstractC16544l.m18092e(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            AbstractC16544l.m18092e(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return m5721i(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v17, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v19, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [double[]] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5724l(ConstantValue constantValue, ClassLoader classLoader) {
        KotlinType type;
        Class clsM5721i;
        short[] sArr;
        if (constantValue instanceof AnnotationValue) {
            return m5722j(((AnnotationValue) constantValue).getValue());
        }
        int i10 = 0;
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
            if (typedArrayValue != null && (type = typedArrayValue.getType()) != null) {
                List<? extends ConstantValue<?>> value = arrayValue.getValue();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(value, 10));
                Iterator it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(m5724l((ConstantValue) it.next(), classLoader));
                }
                PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
                switch (primitiveArrayElementType == null ? -1 : AbstractC5145I0.f16785a[primitiveArrayElementType.ordinal()]) {
                    case -1:
                        if (!KotlinBuiltIns.isArray(type)) {
                            throw new IllegalStateException(("Not an array type: " + type).toString());
                        }
                        KotlinType type2 = ((TypeProjection) AbstractC17680n.m19365o0(type.getArguments())).getType();
                        AbstractC16544l.m18093f(type2, "getType(...)");
                        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = type2.getConstructor().mo22589getDeclarationDescriptor();
                        ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
                        if (classDescriptor == null) {
                            throw new IllegalStateException(("Not a class type: " + type2).toString());
                        }
                        if (KotlinBuiltIns.isString(type2)) {
                            int size = arrayValue.getValue().size();
                            sArr = new String[size];
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.String");
                                sArr[i10] = obj;
                                i10++;
                            }
                        } else if (KotlinBuiltIns.isKClass(classDescriptor)) {
                            int size2 = arrayValue.getValue().size();
                            sArr = new Class[size2];
                            while (i10 < size2) {
                                Object obj2 = arrayList.get(i10);
                                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                sArr[i10] = obj2;
                                i10++;
                            }
                        } else {
                            ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                            if (classId != null && (clsM5721i = m5721i(classLoader, classId, 0)) != null) {
                                Object objNewInstance = Array.newInstance((Class<?>) clsM5721i, arrayValue.getValue().size());
                                AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                sArr = (Object[]) objNewInstance;
                                int size3 = arrayList.size();
                                while (i10 < size3) {
                                    sArr[i10] = arrayList.get(i10);
                                    i10++;
                                }
                            }
                        }
                        return sArr;
                    case 0:
                    default:
                        throw new C0644w();
                    case 1:
                        int size4 = arrayValue.getValue().size();
                        sArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj3 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            sArr[i10] = ((Boolean) obj3).booleanValue();
                            i10++;
                        }
                        return sArr;
                    case 2:
                        int size5 = arrayValue.getValue().size();
                        sArr = new char[size5];
                        while (i10 < size5) {
                            Object obj4 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.Char");
                            sArr[i10] = ((Character) obj4).charValue();
                            i10++;
                        }
                        return sArr;
                    case 3:
                        int size6 = arrayValue.getValue().size();
                        sArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj5 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.Byte");
                            sArr[i10] = ((Byte) obj5).byteValue();
                            i10++;
                        }
                        return sArr;
                    case 4:
                        int size7 = arrayValue.getValue().size();
                        sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj6 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj6).shortValue();
                            i10++;
                        }
                        return sArr;
                    case 5:
                        int size8 = arrayValue.getValue().size();
                        sArr = new int[size8];
                        while (i10 < size8) {
                            Object obj7 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type kotlin.Int");
                            sArr[i10] = ((Integer) obj7).intValue();
                            i10++;
                        }
                        return sArr;
                    case 6:
                        int size9 = arrayValue.getValue().size();
                        sArr = new float[size9];
                        while (i10 < size9) {
                            Object obj8 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj8, "null cannot be cast to non-null type kotlin.Float");
                            sArr[i10] = ((Float) obj8).floatValue();
                            i10++;
                        }
                        return sArr;
                    case 7:
                        int size10 = arrayValue.getValue().size();
                        sArr = new long[size10];
                        while (i10 < size10) {
                            Object obj9 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj9, "null cannot be cast to non-null type kotlin.Long");
                            sArr[i10] = ((Long) obj9).longValue();
                            i10++;
                        }
                        return sArr;
                    case 8:
                        int size11 = arrayValue.getValue().size();
                        sArr = new double[size11];
                        while (i10 < size11) {
                            Object obj10 = arrayList.get(i10);
                            AbstractC16544l.m18092e(obj10, "null cannot be cast to non-null type kotlin.Double");
                            sArr[i10] = ((Double) obj10).doubleValue();
                            i10++;
                        }
                        return sArr;
                }
            }
        } else if (constantValue instanceof EnumValue) {
            C17309l value2 = ((EnumValue) constantValue).getValue();
            ClassId classId2 = (ClassId) value2.f55136Y;
            Name name = (Name) value2.f55137Z;
            Class clsM5721i2 = m5721i(classLoader, classId2, 0);
            if (clsM5721i2 != null) {
                return Enum.valueOf(clsM5721i2, name.asString());
            }
        } else if (constantValue instanceof KClassValue) {
            KClassValue.Value value3 = ((KClassValue) constantValue).getValue();
            if (value3 instanceof KClassValue.Value.NormalClass) {
                KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value3;
                return m5721i(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
            }
            if (!(value3 instanceof KClassValue.Value.LocalClass)) {
                throw new C0644w();
            }
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = ((KClassValue.Value.LocalClass) value3).getType().getConstructor().mo22589getDeclarationDescriptor();
            ClassDescriptor classDescriptor2 = classifierDescriptorMo22589getDeclarationDescriptor2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2 : null;
            if (classDescriptor2 != null) {
                return m5723k(classDescriptor2);
            }
        } else if (!(constantValue instanceof ErrorValue) && !(constantValue instanceof NullValue)) {
            return constantValue.getValue();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public static final Class m5721i(ClassLoader classLoader, ClassId classId, int i10) {
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classId.asSingleFqName().toUnsafe());
        if (classIdMapKotlinToJava != null) {
            classId = classIdMapKotlinToJava;
        }
        String strAsString = classId.getPackageFqName().asString();
        String strAsString2 = classId.getRelativeClassName().asString();
        if (AbstractC16544l.m18089b(strAsString, "kotlin")) {
            switch (strAsString2.hashCode()) {
                case -901856463:
                    if (strAsString2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strAsString2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strAsString2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strAsString2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strAsString2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strAsString2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strAsString2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strAsString2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strAsString2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append(TokenNames.f32014L);
        }
        if (strAsString.length() > 0) {
            sb2.append(strAsString.concat(Separators.DOT));
        }
        sb2.append(AbstractC21329w.m21730q(strAsString2, '.', '$'));
        if (i10 > 0) {
            sb2.append(bQBnquXS.VsewQu);
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb2.toString());
    }
}
