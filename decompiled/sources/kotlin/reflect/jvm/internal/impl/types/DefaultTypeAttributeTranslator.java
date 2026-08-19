package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p571X9.AbstractC9393x3;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {
    public static final DefaultTypeAttributeTranslator INSTANCE = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public TypeAttributes toAttributes(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(annotations, "annotations");
        return annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.create(AbstractC9393x3.m9974d(new AnnotationsTypeAttribute(annotations)));
    }
}
