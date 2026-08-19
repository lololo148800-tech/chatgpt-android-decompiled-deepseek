package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: s0 */
    public final StorageManager f53025s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(FqName fqName, StorageManager storageManager, ModuleDescriptor module) {
        super(module, fqName);
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(module, "module");
        this.f53025s0 = storageManager;
    }

    public abstract ClassDataFinder getClassDataFinder();

    public boolean hasTopLevelClass(Name name) {
        AbstractC16544l.m18094g(name, "name");
        MemberScope memberScope = getMemberScope();
        return (memberScope instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name);
    }

    public abstract void initialize(DeserializationComponents deserializationComponents);
}
