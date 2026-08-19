package p462Sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p030B2.C0742X;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Sm.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7147a {
    /* JADX INFO: renamed from: a */
    public static ClassLiteralValue m7534a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.topLevel(StandardNames.FqNames.unit.toSafe()), i10);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            AbstractC16544l.m18093f(primitiveType, "getPrimitiveType(...)");
            return i10 > 0 ? new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i10 - 1) : new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i10);
        }
        ClassId classId = ReflectClassUtilKt.getClassId(cls);
        ClassId classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (classIdMapJavaToKotlin != null) {
            classId = classIdMapJavaToKotlin;
        }
        return new ClassLiteralValue(classId, i10);
    }

    /* JADX INFO: renamed from: b */
    public static void m7535b(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsM8667b), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            m7536c(annotationArgumentVisitorVisitAnnotation, annotation, clsM8667b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7536c(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws InvocationTargetException {
        C0742X c0742xM18098k = AbstractC16544l.m18098k(cls.getDeclaredMethods());
        while (c0742xM18098k.hasNext()) {
            Method method = (Method) c0742xM18098k.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC16544l.m18091d(objInvoke);
                Name nameIdentifier = Name.identifier(method.getName());
                AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    annotationArgumentVisitor.visitClassLiteral(nameIdentifier, m7534a((Class) objInvoke));
                } else if (ReflectKotlinClassKt.f51668a.contains(enclosingClass)) {
                    annotationArgumentVisitor.visit(nameIdentifier, objInvoke);
                } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
                    if (!enclosingClass.isEnum()) {
                        enclosingClass = enclosingClass.getEnclosingClass();
                    }
                    AbstractC16544l.m18091d(enclosingClass);
                    ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
                    Name nameIdentifier2 = Name.identifier(((Enum) objInvoke).name());
                    AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
                    annotationArgumentVisitor.visitEnum(nameIdentifier, classId, nameIdentifier2);
                } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                    Class<?>[] interfaces = enclosingClass.getInterfaces();
                    AbstractC16544l.m18093f(interfaces, "getInterfaces(...)");
                    Class cls2 = (Class) AbstractC17678l.m19288K(interfaces);
                    AbstractC16544l.m18091d(cls2);
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(nameIdentifier, ReflectClassUtilKt.getClassId(cls2));
                    if (annotationArgumentVisitorVisitAnnotation != null) {
                        m7536c(annotationArgumentVisitorVisitAnnotation, (Annotation) objInvoke, cls2);
                    }
                } else {
                    if (!enclosingClass.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                    }
                    KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(nameIdentifier);
                    if (annotationArrayArgumentVisitorVisitArray != null) {
                        Class<?> componentType = enclosingClass.getComponentType();
                        int i10 = 0;
                        if (componentType.isEnum()) {
                            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                            Object[] objArr = (Object[]) objInvoke;
                            int length = objArr.length;
                            while (i10 < length) {
                                Object obj = objArr[i10];
                                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                Name nameIdentifier3 = Name.identifier(((Enum) obj).name());
                                AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
                                annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier3);
                                i10++;
                            }
                        } else if (componentType.equals(Class.class)) {
                            Object[] objArr2 = (Object[]) objInvoke;
                            int length2 = objArr2.length;
                            while (i10 < length2) {
                                Object obj2 = objArr2[i10];
                                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                annotationArrayArgumentVisitorVisitArray.visitClassLiteral(m7534a((Class) obj2));
                                i10++;
                            }
                        } else if (Annotation.class.isAssignableFrom(componentType)) {
                            Object[] objArr3 = (Object[]) objInvoke;
                            int length3 = objArr3.length;
                            while (i10 < length3) {
                                Object obj3 = objArr3[i10];
                                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                                if (annotationArgumentVisitorVisitAnnotation2 != null) {
                                    AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                    m7536c(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj3, componentType);
                                }
                                i10++;
                            }
                        } else {
                            Object[] objArr4 = (Object[]) objInvoke;
                            int length4 = objArr4.length;
                            while (i10 < length4) {
                                annotationArrayArgumentVisitorVisitArray.visit(objArr4[i10]);
                                i10++;
                            }
                        }
                        annotationArrayArgumentVisitorVisitArray.visitEnd();
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }
}
