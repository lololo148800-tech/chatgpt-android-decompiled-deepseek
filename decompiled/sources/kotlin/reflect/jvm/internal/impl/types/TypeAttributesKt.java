package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAttributesKt {
    public static final TypeAttributes replaceAnnotations(TypeAttributes typeAttributes, Annotations newAnnotations) {
        TypeAttributes typeAttributesRemove;
        AbstractC16544l.m18094g(typeAttributes, "<this>");
        AbstractC16544l.m18094g(newAnnotations, "newAnnotations");
        if (AnnotationsTypeAttributeKt.getAnnotations(typeAttributes) == newAnnotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsAttribute = AnnotationsTypeAttributeKt.getAnnotationsAttribute(typeAttributes);
        if (annotationsAttribute != null && (typeAttributesRemove = typeAttributes.remove(annotationsAttribute)) != null) {
            typeAttributes = typeAttributesRemove;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? typeAttributes.plus(new AnnotationsTypeAttribute(newAnnotations)) : typeAttributes;
    }

    public static final TypeAttributes toDefaultAttributes(Annotations annotations) {
        AbstractC16544l.m18094g(annotations, "<this>");
        return TypeAttributeTranslator.DefaultImpls.toAttributes$default(DefaultTypeAttributeTranslator.INSTANCE, annotations, null, null, 6, null);
    }
}
