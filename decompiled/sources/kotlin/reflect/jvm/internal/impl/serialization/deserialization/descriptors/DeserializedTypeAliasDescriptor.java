package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {

    /* JADX INFO: renamed from: A0 */
    public final DeserializedContainerSource f53113A0;

    /* JADX INFO: renamed from: B0 */
    public SimpleType f53114B0;

    /* JADX INFO: renamed from: C0 */
    public SimpleType f53115C0;

    /* JADX INFO: renamed from: D0 */
    public List f53116D0;

    /* JADX INFO: renamed from: E0 */
    public SimpleType f53117E0;

    /* JADX INFO: renamed from: w0 */
    public final ProtoBuf.TypeAlias f53118w0;

    /* JADX INFO: renamed from: x0 */
    public final NameResolver f53119x0;

    /* JADX INFO: renamed from: y0 */
    public final TypeTable f53120y0;

    /* JADX INFO: renamed from: z0 */
    public final VersionRequirementTable f53121z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DescriptorVisibility visibility, ProtoBuf.TypeAlias proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(visibility, "visibility");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f53118w0 = proto;
        this.f53119x0 = nameResolver;
        this.f53120y0 = typeTable;
        this.f53121z0 = versionRequirementTable;
        this.f53113A0 = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    /* JADX INFO: renamed from: b */
    public final List mo18132b() {
        List list = this.f53116D0;
        if (list != null) {
            return list;
        }
        AbstractC16544l.m18103p("typeConstructorParameters");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public ClassDescriptor getClassDescriptor() {
        if (KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = getExpandedType().getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.f53113A0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = this.f53117E0;
        if (simpleType != null) {
            return simpleType;
        }
        AbstractC16544l.m18103p("defaultTypeImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getExpandedType() {
        SimpleType simpleType = this.f53115C0;
        if (simpleType != null) {
            return simpleType;
        }
        AbstractC16544l.m18103p("expandedType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.f53119x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.f53120y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getUnderlyingType() {
        SimpleType simpleType = this.f53114B0;
        if (simpleType != null) {
            return simpleType;
        }
        AbstractC16544l.m18103p("underlyingType");
        throw null;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.f53121z0;
    }

    public final void initialize(List<? extends TypeParameterDescriptor> declaredTypeParameters, SimpleType underlyingType, SimpleType expandedType) {
        MemberScope unsubstitutedMemberScope;
        AbstractC16544l.m18094g(declaredTypeParameters, "declaredTypeParameters");
        AbstractC16544l.m18094g(underlyingType, "underlyingType");
        AbstractC16544l.m18094g(expandedType, "expandedType");
        initialize(declaredTypeParameters);
        this.f53114B0 = underlyingType;
        this.f53115C0 = expandedType;
        this.f53116D0 = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            unsubstitutedMemberScope = MemberScope.Empty.INSTANCE;
        }
        SimpleType simpleTypeMakeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(this, unsubstitutedMemberScope, new C1756x(this, 3));
        AbstractC16544l.m18093f(simpleTypeMakeUnsubstitutedType, "makeUnsubstitutedType(...)");
        this.f53117E0 = simpleTypeMakeUnsubstitutedType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.TypeAlias getProto() {
        return this.f53118w0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public TypeAliasDescriptor substitute(TypeSubstitutor substitutor) {
        AbstractC16544l.m18094g(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        Annotations annotations = getAnnotations();
        AbstractC16544l.m18093f(annotations, "<get-annotations>(...)");
        Name name = getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f51470q0, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List<TypeParameterDescriptor> declaredTypeParameters = getDeclaredTypeParameters();
        SimpleType underlyingType = getUnderlyingType();
        Variance variance = Variance.INVARIANT;
        KotlinType kotlinTypeSafeSubstitute = substitutor.safeSubstitute(underlyingType, variance);
        AbstractC16544l.m18093f(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(kotlinTypeSafeSubstitute);
        KotlinType kotlinTypeSafeSubstitute2 = substitutor.safeSubstitute(getExpandedType(), variance);
        AbstractC16544l.m18093f(kotlinTypeSafeSubstitute2, "safeSubstitute(...)");
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, simpleTypeAsSimpleType, TypeSubstitutionKt.asSimpleType(kotlinTypeSafeSubstitute2));
        return deserializedTypeAliasDescriptor;
    }
}
