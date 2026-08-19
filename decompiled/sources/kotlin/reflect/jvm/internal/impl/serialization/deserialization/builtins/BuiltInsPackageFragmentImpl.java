package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.ReadPackageFragmentKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import mm.C17309l;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final BuiltInsPackageFragmentImpl create(FqName fqName, StorageManager storageManager, ModuleDescriptor module, InputStream inputStream, boolean z6) {
            AbstractC16544l.m18094g(fqName, "fqName");
            AbstractC16544l.m18094g(storageManager, "storageManager");
            AbstractC16544l.m18094g(module, "module");
            AbstractC16544l.m18094g(inputStream, "inputStream");
            C17309l builtinsPackageFragment = ReadPackageFragmentKt.readBuiltinsPackageFragment(inputStream);
            ProtoBuf.PackageFragment packageFragment = (ProtoBuf.PackageFragment) builtinsPackageFragment.f55136Y;
            BuiltInsBinaryVersion builtInsBinaryVersion = (BuiltInsBinaryVersion) builtinsPackageFragment.f55137Z;
            if (packageFragment != null) {
                return new BuiltInsPackageFragmentImpl(fqName, storageManager, module, packageFragment, builtInsBinaryVersion, z6, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + BuiltInsBinaryVersion.INSTANCE + ", actual " + builtInsBinaryVersion + ". Please update Kotlin");
        }
    }

    public BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "builtins package fragment for " + getFqName() + " from " + DescriptorUtilsKt.getModule(this);
    }
}
