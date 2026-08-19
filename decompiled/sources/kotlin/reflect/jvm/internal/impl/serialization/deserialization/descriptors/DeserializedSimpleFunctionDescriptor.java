package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: Q0 */
    public final ProtoBuf.Function f53108Q0;

    /* JADX INFO: renamed from: R0 */
    public final NameResolver f53109R0;

    /* JADX INFO: renamed from: S0 */
    public final TypeTable f53110S0;

    /* JADX INFO: renamed from: T0 */
    public final VersionRequirementTable f53111T0;

    /* JADX INFO: renamed from: U0 */
    public final DeserializedContainerSource f53112U0;

    public /* synthetic */ DeserializedSimpleFunctionDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, function, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i10 & 1024) != 0 ? null : sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        Name name2;
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(annotations, "annotations");
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            Name name3 = getName();
            AbstractC16544l.m18093f(name3, "getName(...)");
            name2 = name3;
        } else {
            name2 = name;
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(newOwner, simpleFunctionDescriptor, annotations, name2, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement);
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(hasStableParameterNames());
        return deserializedSimpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.f53112U0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.f53109R0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.f53110S0;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.f53111T0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedSimpleFunctionDescriptor(DeclarationDescriptor containingDeclaration, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement) {
        super(containingDeclaration, simpleFunctionDescriptor, annotations, name, kind, sourceElement == null ? SourceElement.NO_SOURCE : sourceElement);
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        this.f53108Q0 = proto;
        this.f53109R0 = nameResolver;
        this.f53110S0 = typeTable;
        this.f53111T0 = versionRequirementTable;
        this.f53112U0 = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.Function getProto() {
        return this.f53108Q0;
    }
}
