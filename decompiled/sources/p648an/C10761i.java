package p648an;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p909nm.C17689w;

/* JADX INFO: renamed from: an.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10761i extends AbstractSignatureParts {

    /* JADX INFO: renamed from: a */
    public final DeclarationDescriptorNonRoot f31973a;

    /* JADX INFO: renamed from: b */
    public final boolean f31974b;

    /* JADX INFO: renamed from: c */
    public final LazyJavaResolverContext f31975c;

    /* JADX INFO: renamed from: d */
    public final AnnotationQualifierApplicabilityType f31976d;

    /* JADX INFO: renamed from: e */
    public final boolean f31977e;

    public C10761i(DeclarationDescriptorNonRoot declarationDescriptorNonRoot, boolean z6, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z10) {
        AbstractC16544l.m18094g(containerContext, "containerContext");
        AbstractC16544l.m18094g(containerApplicabilityType, "containerApplicabilityType");
        this.f31973a = declarationDescriptorNonRoot;
        this.f31974b = z6;
        this.f31975c = containerContext;
        this.f31976d = containerApplicabilityType;
        this.f31977e = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: c */
    public final NullabilityQualifierWithMigrationStatus mo11039c(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusCopy$default;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusCopy$default = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusCopy$default;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.getNullabilityQualifier();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean forceWarning(Object obj, KotlinTypeMarker kotlinTypeMarker) {
        LazyJavaResolverContext lazyJavaResolverContext;
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        if (!(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) {
            if (!(annotationDescriptor instanceof LazyJavaAnnotationDescriptor) || getEnableImprovementsInStrictMode()) {
                if (kotlinTypeMarker != null && KotlinBuiltIns.isPrimitiveArray((KotlinType) kotlinTypeMarker)) {
                    lazyJavaResolverContext = this.f31975c;
                    if (lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor) || lazyJavaResolverContext.getComponents().getSettings().getEnhancePrimitiveArrays()) {
                    }
                }
                return false;
            }
            if (!((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation()) {
                if (this.f31976d != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                    if (kotlinTypeMarker != null) {
                        lazyJavaResolverContext = this.f31975c;
                        if (lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor)) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AbstractAnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f31975c.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getAnnotations(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getContainerAnnotations() {
        Annotations annotations;
        DeclarationDescriptorNonRoot declarationDescriptorNonRoot = this.f31973a;
        return (declarationDescriptorNonRoot == null || (annotations = declarationDescriptorNonRoot.getAnnotations()) == null) ? C17689w.f56480Y : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.f31976d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.f31975c.getDefaultTypeQualifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getContainerIsVarargParameter() {
        DeclarationDescriptorNonRoot declarationDescriptorNonRoot = this.f31973a;
        return (declarationDescriptorNonRoot instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) declarationDescriptorNonRoot).getVarargElementType() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getEnableImprovementsInStrictMode() {
        return this.f31975c.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.getEnhancement((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor((KotlinType) kotlinTypeMarker);
        if (classDescriptor != null) {
            return DescriptorUtils.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getSkipRawTypeArguments() {
        return this.f31977e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final TypeSystemContext getTypeSystem() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        return KotlinBuiltIns.isArrayOrPrimitiveArray((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isCovariant() {
        return this.f31974b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker other) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        AbstractC16544l.m18094g(other, "other");
        return this.f31975c.getComponents().getKotlinTypeChecker().equalTypes((KotlinType) kotlinTypeMarker, (KotlinType) other);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isFromJava(TypeParameterMarker typeParameterMarker) {
        AbstractC16544l.m18094g(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).unwrap() instanceof NotNullTypeParameterImpl;
    }
}
