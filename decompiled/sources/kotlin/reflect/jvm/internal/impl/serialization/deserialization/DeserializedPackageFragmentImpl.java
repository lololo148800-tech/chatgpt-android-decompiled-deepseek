package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p077Cn.C1756x;
import p298Lm.C5140G;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* JADX INFO: renamed from: t0 */
    public final BinaryVersion f53026t0;

    /* JADX INFO: renamed from: u0 */
    public final DeserializedContainerSource f53027u0;

    /* JADX INFO: renamed from: v0 */
    public final NameResolverImpl f53028v0;

    /* JADX INFO: renamed from: w0 */
    public final ProtoBasedClassDataFinder f53029w0;

    /* JADX INFO: renamed from: x0 */
    public ProtoBuf.PackageFragment f53030x0;

    /* JADX INFO: renamed from: y0 */
    public DeserializedPackageMemberScope f53031y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor module, ProtoBuf.PackageFragment proto, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        this.f53026t0 = metadataVersion;
        this.f53027u0 = deserializedContainerSource;
        ProtoBuf.StringTable strings = proto.getStrings();
        AbstractC16544l.m18093f(strings, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        AbstractC16544l.m18093f(qualifiedNames, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.f53028v0 = nameResolverImpl;
        this.f53029w0 = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new C1756x(this, 25));
        this.f53030x0 = proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope getMemberScope() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this.f53031y0;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        AbstractC16544l.m18103p("_memberScope");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(DeserializationComponents components) {
        AbstractC16544l.m18094g(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f53030x0;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f53030x0 = null;
        ProtoBuf.Package r6 = packageFragment.getPackage();
        AbstractC16544l.m18093f(r6, "getPackage(...)");
        this.f53031y0 = new DeserializedPackageMemberScope(this, r6, this.f53028v0, this.f53026t0, this.f53027u0, components, "scope of " + this, new C5140G(this, 25));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.f53029w0;
    }
}
