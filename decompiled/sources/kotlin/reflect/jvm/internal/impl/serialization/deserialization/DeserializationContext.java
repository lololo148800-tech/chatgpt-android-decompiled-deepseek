package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationContext {

    /* JADX INFO: renamed from: a */
    public final DeserializationComponents f53015a;

    /* JADX INFO: renamed from: b */
    public final NameResolver f53016b;

    /* JADX INFO: renamed from: c */
    public final DeclarationDescriptor f53017c;

    /* JADX INFO: renamed from: d */
    public final TypeTable f53018d;

    /* JADX INFO: renamed from: e */
    public final VersionRequirementTable f53019e;

    /* JADX INFO: renamed from: f */
    public final BinaryVersion f53020f;

    /* JADX INFO: renamed from: g */
    public final DeserializedContainerSource f53021g;

    /* JADX INFO: renamed from: h */
    public final TypeDeserializer f53022h;

    /* JADX INFO: renamed from: i */
    public final MemberDeserializer f53023i;

    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameters) {
        String presentableString;
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        AbstractC16544l.m18094g(typeParameters, "typeParameters");
        this.f53015a = components;
        this.f53016b = nameResolver;
        this.f53017c = containingDeclaration;
        this.f53018d = typeTable;
        this.f53019e = versionRequirementTable;
        this.f53020f = metadataVersion;
        this.f53021g = deserializedContainerSource;
        this.f53022h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.f53023i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            nameResolver = deserializationContext.f53016b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i10 & 8) != 0) {
            typeTable = deserializationContext.f53018d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i10 & 16) != 0) {
            versionRequirementTable = deserializationContext.f53019e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i10 & 32) != 0) {
            binaryVersion = deserializationContext.f53020f;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    public final DeserializationContext childContext(DeclarationDescriptor descriptor, List<ProtoBuf.TypeParameter> typeParameterProtos, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(typeParameterProtos, "typeParameterProtos");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        AbstractC16544l.m18094g(versionRequirementTable2, "versionRequirementTable");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        if (!VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(metadataVersion)) {
            versionRequirementTable2 = this.f53019e;
        }
        return new DeserializationContext(this.f53015a, nameResolver, descriptor, typeTable, versionRequirementTable2, metadataVersion, this.f53021g, this.f53022h, typeParameterProtos);
    }

    public final DeserializationComponents getComponents() {
        return this.f53015a;
    }

    public final DeserializedContainerSource getContainerSource() {
        return this.f53021g;
    }

    public final DeclarationDescriptor getContainingDeclaration() {
        return this.f53017c;
    }

    public final MemberDeserializer getMemberDeserializer() {
        return this.f53023i;
    }

    public final NameResolver getNameResolver() {
        return this.f53016b;
    }

    public final StorageManager getStorageManager() {
        return this.f53015a.getStorageManager();
    }

    public final TypeDeserializer getTypeDeserializer() {
        return this.f53022h;
    }

    public final TypeTable getTypeTable() {
        return this.f53018d;
    }

    public final VersionRequirementTable getVersionRequirementTable() {
        return this.f53019e;
    }
}
