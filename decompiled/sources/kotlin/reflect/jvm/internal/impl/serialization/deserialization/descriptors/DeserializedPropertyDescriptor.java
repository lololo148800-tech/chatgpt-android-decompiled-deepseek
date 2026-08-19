package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* JADX INFO: renamed from: O0 */
    public final ProtoBuf.Property f53103O0;

    /* JADX INFO: renamed from: P0 */
    public final NameResolver f53104P0;

    /* JADX INFO: renamed from: Q0 */
    public final TypeTable f53105Q0;

    /* JADX INFO: renamed from: R0 */
    public final VersionRequirementTable f53106R0;

    /* JADX INFO: renamed from: S0 */
    public final DeserializedContainerSource f53107S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(DeclarationDescriptor containingDeclaration, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility visibility, boolean z6, Name name, CallableMemberDescriptor.Kind kind, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        super(containingDeclaration, propertyDescriptor, annotations, modality, visibility, z6, name, kind, SourceElement.NO_SOURCE, z10, z11, z14, false, z12, z13);
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(modality, "modality");
        AbstractC16544l.m18094g(visibility, "visibility");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        this.f53103O0 = proto;
        this.f53104P0 = nameResolver;
        this.f53105Q0 = typeTable;
        this.f53106R0 = versionRequirementTable;
        this.f53107S0 = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    /* JADX INFO: renamed from: b */
    public final PropertyDescriptorImpl mo18152b(DeclarationDescriptor newOwner, Modality newModality, DescriptorVisibility newVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name newName, SourceElement source) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(newModality, "newModality");
        AbstractC16544l.m18094g(newVisibility, "newVisibility");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(newName, "newName");
        AbstractC16544l.m18094g(source, "source");
        return new DeserializedPropertyDescriptor(newOwner, propertyDescriptor, getAnnotations(), newModality, newVisibility, isVar(), newName, kind, isLateInit(), isConst(), isExternal(), isDelegated(), isExpect(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.f53107S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.f53104P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.f53105Q0;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.f53106R0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_PROPERTY.get(getProto().getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.Property getProto() {
        return this.f53103O0;
    }
}
