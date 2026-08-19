package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17680n;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: a */
    public final StorageManager f51320a;

    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor f51321b;

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager, ModuleDescriptor module) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(module, "module");
        this.f51320a = storageManager;
        this.f51321b = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        FqName packageFqName;
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        AbstractC16544l.m18094g(classId, "classId");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String strAsString = classId.getRelativeClassName().asString();
        if (!AbstractC21322p.m21667A(strAsString, "Function", false) || (functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), strAsString)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindComponent1 = functionalClassKindWithArity.component1();
        int iComponent2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.f51321b.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) AbstractC17680n.m19343S(arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) AbstractC17680n.m19341Q(arrayList);
        }
        return new FunctionClassDescriptor(this.f51320a, packageFragmentDescriptor, functionTypeKindComponent1, iComponent2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName packageFqName) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName packageFqName, Name name) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(name, "name");
        String strAsString = name.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return (AbstractC21329w.m21734u(strAsString, "Function", false) || AbstractC21329w.m21734u(strAsString, "KFunction", false) || AbstractC21329w.m21734u(strAsString, "SuspendFunction", false) || AbstractC21329w.m21734u(strAsString, "KSuspendFunction", false)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(packageFqName, strAsString) != null;
    }
}
