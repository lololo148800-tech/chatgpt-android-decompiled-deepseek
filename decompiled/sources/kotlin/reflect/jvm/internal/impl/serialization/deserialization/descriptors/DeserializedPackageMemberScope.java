package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p009A7.FlM.nkFZpTrMPpn;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    /* JADX INFO: renamed from: f */
    public final PackageFragmentDescriptor f53100f;

    /* JADX INFO: renamed from: g */
    public final String f53101g;

    /* JADX INFO: renamed from: h */
    public final FqName f53102h;

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageDescriptor, ProtoBuf.Package proto, NameResolver nameResolver, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, DeserializationComponents components, String debugName, InterfaceC1426a classNames) {
        AbstractC16544l.m18094g(packageDescriptor, "packageDescriptor");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(debugName, "debugName");
        AbstractC16544l.m18094g(classNames, "classNames");
        ProtoBuf.TypeTable typeTable = proto.getTypeTable();
        AbstractC16544l.m18093f(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = proto.getVersionRequirementTable();
        AbstractC16544l.m18093f(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextCreateContext = components.createContext(packageDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion, deserializedContainerSource);
        List<ProtoBuf.Function> functionList = proto.getFunctionList();
        AbstractC16544l.m18093f(functionList, "getFunctionList(...)");
        List<ProtoBuf.Property> propertyList = proto.getPropertyList();
        AbstractC16544l.m18093f(propertyList, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> typeAliasList = proto.getTypeAliasList();
        AbstractC16544l.m18093f(typeAliasList, "getTypeAliasList(...)");
        super(deserializationContextCreateContext, functionList, propertyList, typeAliasList, classNames);
        this.f53100f = packageDescriptor;
        this.f53101g = debugName;
        this.f53102h = packageDescriptor.getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: a */
    public final void mo18381a(ArrayList arrayList, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: e */
    public final ClassId mo18385e(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return new ClassId(this.f53102h, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: f */
    public final Set mo18386f() {
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: g */
    public final Set mo18387g() {
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        return super.mo22590getContributedClassifier(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: h */
    public final Set mo18388h() {
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: i */
    public final boolean mo18389i(Name name) {
        AbstractC16544l.m18094g(name, "name");
        if (!super.mo18389i(name)) {
            Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = this.f53093a.getComponents().getFictitiousClassDescriptorFactories();
            if (!(fictitiousClassDescriptorFactories instanceof Collection) || !((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
                Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
                while (it.hasNext()) {
                    if (it.next().shouldCreateClass(this.f53102h, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f53101g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        Collection collectionM18382b = m18382b(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = this.f53093a.getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(it.next().getAllContributedClassesIfPossible(this.f53102h), arrayList);
        }
        return AbstractC17680n.m19361k0(arrayList, collectionM18382b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, nkFZpTrMPpn.ITPLVq);
        AbstractC16544l.m18094g(location, "location");
        UtilsKt.record(this.f53093a.getComponents().getLookupTracker(), location, this.f53100f, name);
    }
}
