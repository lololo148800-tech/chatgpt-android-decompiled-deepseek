package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeAliasExpansionReportStrategy {

    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void boundsViolationInSubstitution(TypeSubstitutor substitutor, KotlinType unsubstitutedArgument, KotlinType argument, TypeParameterDescriptor typeParameter) {
            AbstractC16544l.m18094g(substitutor, "substitutor");
            AbstractC16544l.m18094g(unsubstitutedArgument, "unsubstitutedArgument");
            AbstractC16544l.m18094g(argument, "argument");
            AbstractC16544l.m18094g(typeParameter, "typeParameter");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void conflictingProjection(TypeAliasDescriptor typeAlias, TypeParameterDescriptor typeParameterDescriptor, KotlinType substitutedArgument) {
            AbstractC16544l.m18094g(typeAlias, "typeAlias");
            AbstractC16544l.m18094g(substitutedArgument, "substitutedArgument");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void recursiveTypeAlias(TypeAliasDescriptor typeAlias) {
            AbstractC16544l.m18094g(typeAlias, "typeAlias");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void repeatedAnnotation(AnnotationDescriptor annotation) {
            AbstractC16544l.m18094g(annotation, "annotation");
        }
    }

    void boundsViolationInSubstitution(TypeSubstitutor typeSubstitutor, KotlinType kotlinType, KotlinType kotlinType2, TypeParameterDescriptor typeParameterDescriptor);

    void conflictingProjection(TypeAliasDescriptor typeAliasDescriptor, TypeParameterDescriptor typeParameterDescriptor, KotlinType kotlinType);

    void recursiveTypeAlias(TypeAliasDescriptor typeAliasDescriptor);

    void repeatedAnnotation(AnnotationDescriptor annotationDescriptor);
}
