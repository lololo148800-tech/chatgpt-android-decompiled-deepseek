package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    public final PackageFragmentProvider f53024a;

    public DeserializedClassDataFinder(PackageFragmentProvider packageFragmentProvider) {
        AbstractC16544l.m18094g(packageFragmentProvider, "packageFragmentProvider");
        this.f53024a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        ClassData classDataFindClassData;
        AbstractC16544l.m18094g(classId, "classId");
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.packageFragments(this.f53024a, classId.getPackageFqName())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataFindClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return classDataFindClassData;
            }
        }
        return null;
    }
}
