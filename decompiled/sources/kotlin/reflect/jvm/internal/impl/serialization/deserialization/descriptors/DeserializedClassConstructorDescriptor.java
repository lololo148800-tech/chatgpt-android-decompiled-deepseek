package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: R0 */
    public final ProtoBuf.Constructor f53064R0;

    /* JADX INFO: renamed from: S0 */
    public final NameResolver f53065S0;

    /* JADX INFO: renamed from: T0 */
    public final TypeTable f53066T0;

    /* JADX INFO: renamed from: U0 */
    public final VersionRequirementTable f53067U0;

    /* JADX INFO: renamed from: V0 */
    public final DeserializedContainerSource f53068V0;

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z6, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, constructorDescriptor, annotations, z6, kind, constructor, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i10 & 1024) != 0 ? null : sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m18378d(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    /* JADX INFO: renamed from: d */
    public final DeserializedClassConstructorDescriptor m18378d(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Annotations annotations, SourceElement source) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(source, "source");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) newOwner, (ConstructorDescriptor) functionDescriptor, annotations, this.f51482Q0, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), source);
        deserializedClassConstructorDescriptor.setHasStableParameterNames(hasStableParameterNames());
        return deserializedClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.f53068V0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.f53065S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.f53066T0;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.f53067U0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassConstructorDescriptor(ClassDescriptor containingDeclaration, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z6, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement) {
        super(containingDeclaration, constructorDescriptor, annotations, z6, kind, sourceElement == null ? SourceElement.NO_SOURCE : sourceElement);
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        this.f53064R0 = proto;
        this.f53065S0 = nameResolver;
        this.f53066T0 = typeTable;
        this.f53067U0 = versionRequirementTable;
        this.f53068V0 = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public /* bridge */ /* synthetic */ FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m18378d(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.Constructor getProto() {
        return this.f53064R0;
    }
}
