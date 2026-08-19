package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaAnnotationMapper {
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    /* JADX INFO: renamed from: a */
    public static final Name f51806a;

    /* JADX INFO: renamed from: b */
    public static final Name f51807b;

    /* JADX INFO: renamed from: c */
    public static final Name f51808c;

    /* JADX INFO: renamed from: d */
    public static final Object f51809d;

    static {
        Name nameIdentifier = Name.identifier("message");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        f51806a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("allowedTargets");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        f51807b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("value");
        AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
        f51808c = nameIdentifier3;
        f51809d = AbstractC17659D.m19244f(new C17309l(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), new C17309l(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), new C17309l(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z6);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public final AnnotationDescriptor findMappedJavaAnnotation(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c9) {
        JavaAnnotation javaAnnotationFindAnnotation;
        AbstractC16544l.m18094g(kotlinName, "kotlinName");
        AbstractC16544l.m18094g(annotationOwner, "annotationOwner");
        AbstractC16544l.m18094g(c9, "c");
        if (kotlinName.equals(StandardNames.FqNames.deprecated)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            AbstractC16544l.m18093f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationFindAnnotation2 = annotationOwner.findAnnotation(DEPRECATED_ANNOTATION);
            if (javaAnnotationFindAnnotation2 != null || annotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationFindAnnotation2, c9);
            }
        }
        FqName fqName = (FqName) f51809d.get(kotlinName);
        if (fqName == null || (javaAnnotationFindAnnotation = annotationOwner.findAnnotation(fqName)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, javaAnnotationFindAnnotation, c9, false, 4, null);
    }

    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return f51806a;
    }

    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return f51808c;
    }

    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return f51807b;
    }

    public final AnnotationDescriptor mapOrResolveJavaAnnotation(JavaAnnotation annotation, LazyJavaResolverContext c9, boolean z6) {
        AbstractC16544l.m18094g(annotation, "annotation");
        AbstractC16544l.m18094g(c9, "c");
        ClassId classId = annotation.getClassId();
        ClassId.Companion companion = ClassId.Companion;
        FqName TARGET_ANNOTATION = JvmAnnotationNames.TARGET_ANNOTATION;
        AbstractC16544l.m18093f(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (AbstractC16544l.m18089b(classId, companion.topLevel(TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c9);
        }
        FqName RETENTION_ANNOTATION = JvmAnnotationNames.RETENTION_ANNOTATION;
        AbstractC16544l.m18093f(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (AbstractC16544l.m18089b(classId, companion.topLevel(RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c9);
        }
        FqName DOCUMENTED_ANNOTATION = JvmAnnotationNames.DOCUMENTED_ANNOTATION;
        AbstractC16544l.m18093f(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (AbstractC16544l.m18089b(classId, companion.topLevel(DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c9, annotation, StandardNames.FqNames.mustBeDocumented);
        }
        FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
        AbstractC16544l.m18093f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (AbstractC16544l.m18089b(classId, companion.topLevel(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c9, annotation, z6);
    }
}
