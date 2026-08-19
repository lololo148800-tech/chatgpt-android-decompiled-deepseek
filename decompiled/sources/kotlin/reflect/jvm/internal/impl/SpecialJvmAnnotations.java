package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class SpecialJvmAnnotations {
    public static final SpecialJvmAnnotations INSTANCE = new SpecialJvmAnnotations();

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f51288a;

    /* JADX INFO: renamed from: b */
    public static final ClassId f51289b;

    static {
        List listM19382k = AbstractC17681o.m19382k(JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, JvmAnnotationNames.TARGET_ANNOTATION, JvmAnnotationNames.RETENTION_ANNOTATION, JvmAnnotationNames.DOCUMENTED_ANNOTATION);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it = listM19382k.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it.next()));
        }
        f51288a = linkedHashSet;
        ClassId.Companion companion2 = ClassId.Companion;
        FqName REPEATABLE_ANNOTATION = JvmAnnotationNames.REPEATABLE_ANNOTATION;
        AbstractC16544l.m18093f(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f51289b = companion2.topLevel(REPEATABLE_ANNOTATION);
    }

    public final ClassId getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return f51289b;
    }

    public final Set<ClassId> getSPECIAL_ANNOTATIONS() {
        return f51288a;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(KotlinJvmBinaryClass klass) {
        AbstractC16544l.m18094g(klass, "klass");
        final C16556x c16556x = new C16556x();
        klass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.isAnnotatedWithContainerMetaAnnotation.1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source) {
                AbstractC16544l.m18094g(classId, "classId");
                AbstractC16544l.m18094g(source, "source");
                if (!classId.equals(JvmAbi.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
                    return null;
                }
                c16556x.f51285Y = true;
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return c16556x.f51285Y;
    }
}
