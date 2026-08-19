package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p030B2.C0742X;
import p1113xn.AbstractC21329w;
import p462Sm.AbstractC7147a;
import p523V9.AbstractC8138m0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a */
    public final Class f51664a;

    /* JADX INFO: renamed from: b */
    public final KotlinClassHeader f51665b;

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectKotlinClass create(Class<?> klass) throws InvocationTargetException {
            AbstractC16544l.m18094g(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            C0742X c0742xM18098k = AbstractC16544l.m18098k(klass.getDeclaredAnnotations());
            while (c0742xM18098k.hasNext()) {
                Annotation annotation = (Annotation) c0742xM18098k.next();
                AbstractC16544l.m18091d(annotation);
                Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation));
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = readKotlinClassHeaderAnnotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsM8667b), new ReflectAnnotationSource(annotation));
                if (annotationArgumentVisitorVisitAnnotation != null) {
                    AbstractC7147a.m7536c(annotationArgumentVisitorVisitAnnotation, annotation, clsM8667b);
                }
            }
            readKotlinClassHeaderAnnotationVisitor.visitEnd();
            KotlinClassHeader kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion = readKotlinClassHeaderAnnotationVisitor.createHeaderWithDefaultMetadataVersion();
            if (kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion, null);
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this.f51664a = cls;
        this.f51665b = kotlinClassHeader;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            if (AbstractC16544l.m18089b(this.f51664a, ((ReflectKotlinClass) obj).f51664a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public KotlinClassHeader getClassHeader() {
        return this.f51665b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.f51664a);
    }

    public final Class<?> getKlass() {
        return this.f51664a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public String getLocation() {
        return AbstractC21329w.m21730q(this.f51664a.getName(), '.', '/').concat(".class");
    }

    public int hashCode() {
        return this.f51664a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(KotlinJvmBinaryClass.AnnotationVisitor visitor, byte[] bArr) throws InvocationTargetException {
        AbstractC16544l.m18094g(visitor, "visitor");
        Class klass = this.f51664a;
        AbstractC16544l.m18094g(klass, "klass");
        C0742X c0742xM18098k = AbstractC16544l.m18098k(klass.getDeclaredAnnotations());
        while (c0742xM18098k.hasNext()) {
            Annotation annotation = (Annotation) c0742xM18098k.next();
            AbstractC16544l.m18091d(annotation);
            Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation));
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = visitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsM8667b), new ReflectAnnotationSource(annotation));
            if (annotationArgumentVisitorVisitAnnotation != null) {
                AbstractC7147a.m7536c(annotationArgumentVisitorVisitAnnotation, annotation, clsM8667b);
            }
        }
        visitor.visitEnd();
    }

    public String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f51664a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(KotlinJvmBinaryClass.MemberVisitor visitor, byte[] bArr) throws InvocationTargetException {
        AbstractC16544l.m18094g(visitor, "visitor");
        Class klass = this.f51664a;
        AbstractC16544l.m18094g(klass, "klass");
        C0742X c0742xM18098k = AbstractC16544l.m18098k(klass.getDeclaredMethods());
        while (c0742xM18098k.hasNext()) {
            Method method = (Method) c0742xM18098k.next();
            Name nameIdentifier = Name.identifier(method.getName());
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
            C0742X c0742xM18098k2 = AbstractC16544l.m18098k(method.getParameterTypes());
            while (c0742xM18098k2.hasNext()) {
                Class cls = (Class) c0742xM18098k2.next();
                AbstractC16544l.m18091d(cls);
                sb2.append(ReflectClassUtilKt.getDesc(cls));
            }
            sb2.append(Separators.RPAREN);
            Class<?> returnType = method.getReturnType();
            AbstractC16544l.m18093f(returnType, "getReturnType(...)");
            sb2.append(ReflectClassUtilKt.getDesc(returnType));
            String string = sb2.toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = visitor.visitMethod(nameIdentifier, string);
            if (methodAnnotationVisitorVisitMethod != null) {
                C0742X c0742xM18098k3 = AbstractC16544l.m18098k(method.getDeclaredAnnotations());
                while (c0742xM18098k3.hasNext()) {
                    Annotation annotation = (Annotation) c0742xM18098k3.next();
                    AbstractC16544l.m18091d(annotation);
                    AbstractC7147a.m7535b(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC16544l.m18093f(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    C0742X c0742xM18098k4 = AbstractC16544l.m18098k(annotationArr[i10]);
                    while (c0742xM18098k4.hasNext()) {
                        Annotation annotation2 = (Annotation) c0742xM18098k4.next();
                        Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation2));
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i10, ReflectClassUtilKt.getClassId(clsM8667b), new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            AbstractC7147a.m7536c(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsM8667b);
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
        C0742X c0742xM18098k5 = AbstractC16544l.m18098k(klass.getDeclaredConstructors());
        while (c0742xM18098k5.hasNext()) {
            Constructor constructor = (Constructor) c0742xM18098k5.next();
            Name name = SpecialNames.INIT;
            AbstractC16544l.m18091d(constructor);
            StringBuilder sb3 = new StringBuilder(Separators.LPAREN);
            C0742X c0742xM18098k6 = AbstractC16544l.m18098k(constructor.getParameterTypes());
            while (c0742xM18098k6.hasNext()) {
                Class cls2 = (Class) c0742xM18098k6.next();
                AbstractC16544l.m18091d(cls2);
                sb3.append(ReflectClassUtilKt.getDesc(cls2));
            }
            sb3.append(")V");
            String string2 = sb3.toString();
            AbstractC16544l.m18093f(string2, "toString(...)");
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod2 = visitor.visitMethod(name, string2);
            if (methodAnnotationVisitorVisitMethod2 != null) {
                C0742X c0742xM18098k7 = AbstractC16544l.m18098k(constructor.getDeclaredAnnotations());
                while (c0742xM18098k7.hasNext()) {
                    Annotation annotation3 = (Annotation) c0742xM18098k7.next();
                    AbstractC16544l.m18091d(annotation3);
                    AbstractC7147a.m7535b(methodAnnotationVisitorVisitMethod2, annotation3);
                }
                Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                AbstractC16544l.m18091d(parameterAnnotations2);
                if (parameterAnnotations2.length != 0) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                    int length3 = parameterAnnotations2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        C0742X c0742xM18098k8 = AbstractC16544l.m18098k(parameterAnnotations2[i11]);
                        while (c0742xM18098k8.hasNext()) {
                            Annotation annotation4 = (Annotation) c0742xM18098k8.next();
                            Class clsM8667b2 = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation4));
                            C0742X c0742x = c0742xM18098k5;
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation2 = methodAnnotationVisitorVisitMethod2.visitParameterAnnotation(i11 + length2, ReflectClassUtilKt.getClassId(clsM8667b2), new ReflectAnnotationSource(annotation4));
                            if (annotationArgumentVisitorVisitParameterAnnotation2 != null) {
                                AbstractC7147a.m7536c(annotationArgumentVisitorVisitParameterAnnotation2, annotation4, clsM8667b2);
                            }
                            c0742xM18098k5 = c0742x;
                        }
                    }
                }
                C0742X c0742x2 = c0742xM18098k5;
                methodAnnotationVisitorVisitMethod2.visitEnd();
                c0742xM18098k5 = c0742x2;
            }
        }
        C0742X c0742xM18098k9 = AbstractC16544l.m18098k(klass.getDeclaredFields());
        while (c0742xM18098k9.hasNext()) {
            Field field = (Field) c0742xM18098k9.next();
            Name nameIdentifier2 = Name.identifier(field.getName());
            AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
            Class<?> type = field.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = visitor.visitField(nameIdentifier2, ReflectClassUtilKt.getDesc(type), null);
            if (annotationVisitorVisitField != null) {
                C0742X c0742xM18098k10 = AbstractC16544l.m18098k(field.getDeclaredAnnotations());
                while (c0742xM18098k10.hasNext()) {
                    Annotation annotation5 = (Annotation) c0742xM18098k10.next();
                    AbstractC16544l.m18091d(annotation5);
                    AbstractC7147a.m7535b(annotationVisitorVisitField, annotation5);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }
}
