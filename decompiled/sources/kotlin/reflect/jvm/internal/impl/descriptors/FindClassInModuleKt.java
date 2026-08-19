package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import p1091wn.AbstractC21031l;
import p388Pm.C6510d;
import p388Pm.C6511e;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier;
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            classifierDescriptorMo22590getContributedClassifier = packageViewDescriptor.getMemberScope().mo22590getContributedClassifier((Name) AbstractC17680n.m19341Q(listPathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo22590getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo22590getContributedClassifier).getUnsubstitutedInnerClassesScope().mo22590getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo22590getContributedClassifier = classifierDescriptorMo22590getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier2 : null;
                if (classifierDescriptorMo22590getContributedClassifier == null) {
                    return null;
                }
            }
        } else {
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo22590getContributedClassifier((Name) AbstractC17680n.m19341Q(listPathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo22590getContributedClassifier3 == null) {
                classifierDescriptorMo22590getContributedClassifier3 = null;
                break;
            }
            for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
                if (classifierDescriptorMo22590getContributedClassifier3 instanceof ClassDescriptor) {
                    ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo22590getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo22590getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    classifierDescriptorMo22590getContributedClassifier3 = classifierDescriptorMo22590getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier4 : null;
                    if (classifierDescriptorMo22590getContributedClassifier3 != null) {
                    }
                }
                classifierDescriptorMo22590getContributedClassifier3 = null;
            }
            if (classifierDescriptorMo22590getContributedClassifier3 != null) {
                return classifierDescriptorMo22590getContributedClassifier3;
            }
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
            classifierDescriptorMo22590getContributedClassifier = packageViewDescriptor3.getMemberScope().mo22590getContributedClassifier((Name) AbstractC17680n.m19341Q(listPathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo22590getContributedClassifier == null) {
                return null;
            }
            for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
                if (!(classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier5 = ((ClassDescriptor) classifierDescriptorMo22590getContributedClassifier).getUnsubstitutedInnerClassesScope().mo22590getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo22590getContributedClassifier = classifierDescriptorMo22590getContributedClassifier5 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier5 : null;
                if (classifierDescriptorMo22590getContributedClassifier == null) {
                    return null;
                }
            }
        }
        return classifierDescriptorMo22590getContributedClassifier;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(classId, "classId");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, AbstractC21031l.m21499w(AbstractC21031l.m21495s(AbstractC21031l.m21492p(C6511e.f21118Y, classId), C6510d.f21112Z)));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
