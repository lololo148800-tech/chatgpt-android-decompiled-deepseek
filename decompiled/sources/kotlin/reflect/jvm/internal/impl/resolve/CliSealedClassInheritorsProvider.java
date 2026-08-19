package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import p165G9.AbstractC3021g;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    /* JADX INFO: renamed from: a */
    public static final void m18338a(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z6) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    AbstractC16544l.m18093f(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = memberScope.mo22590getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor2 = classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier : classifierDescriptorMo22590getContributedClassifier instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo22590getContributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z6) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        AbstractC16544l.m18093f(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
                        m18338a(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z6);
                    }
                }
            }
        }
    }

    public Collection<ClassDescriptor> computeSealedSubclasses(ClassDescriptor sealedClass, boolean z6) {
        Object next;
        DeclarationDescriptor containingDeclaration;
        AbstractC16544l.m18094g(sealedClass, "sealedClass");
        if (sealedClass.getModality() != Modality.SEALED) {
            return C17689w.f56480Y;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z6) {
            Iterator it = DescriptorUtilsKt.getParents(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((DeclarationDescriptor) next) instanceof PackageFragmentDescriptor));
            containingDeclaration = (DeclarationDescriptor) next;
        } else {
            containingDeclaration = sealedClass.getContainingDeclaration();
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            m18338a(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), z6);
        }
        MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        AbstractC16544l.m18093f(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
        m18338a(sealedClass, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return AbstractC17680n.m19370t0(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC3021g.m3873a(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString());
            }
        });
    }
}
