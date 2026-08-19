package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p007A5.C0376k;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p1091wn.C21028i;
import p1091wn.C21034o;
import p1091wn.InterfaceC21029j;
import p571X9.AbstractC9393x3;
import p840jn.C16272a;
import p840jn.C16273b;
import p840jn.C16274c;
import p840jn.C16275d;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f52893a = 0;

    static {
        AbstractC16544l.m18093f(Name.identifier("value"), "identifier(...)");
    }

    public static final boolean declaresOrInheritsDefaultValue(ValueParameterDescriptor valueParameterDescriptor) {
        AbstractC16544l.m18094g(valueParameterDescriptor, "<this>");
        Boolean boolIfAny = DFS.ifAny(AbstractC9393x3.m9974d(valueParameterDescriptor), C16272a.f50401Y, C16275d.f50404Y);
        AbstractC16544l.m18093f(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    public static final CallableMemberDescriptor firstOverridden(CallableMemberDescriptor callableMemberDescriptor, boolean z6, final InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(callableMemberDescriptor, "<this>");
        AbstractC16544l.m18094g(predicate, "predicate");
        final C16525B c16525b = new C16525B();
        return (CallableMemberDescriptor) DFS.dfs(AbstractC9393x3.m9974d(callableMemberDescriptor), new C0376k(z6, 11), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(CallableMemberDescriptor current) {
                AbstractC16544l.m18094g(current, "current");
                C16525B c16525b2 = c16525b;
                if (c16525b2.f51262Y == null && ((Boolean) predicate.invoke(current)).booleanValue()) {
                    c16525b2.f51262Y = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(CallableMemberDescriptor current) {
                AbstractC16544l.m18094g(current, "current");
                return c16525b.f51262Y == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public CallableMemberDescriptor result() {
                return (CallableMemberDescriptor) c16525b.f51262Y;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z6, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        return firstOverridden(callableMemberDescriptor, z6, interfaceC1436k);
    }

    public static final FqName fqNameOrNull(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static final ClassDescriptor getAnnotationClass(AnnotationDescriptor annotationDescriptor) {
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
        }
        return null;
    }

    public static final KotlinBuiltIns getBuiltIns(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final ClassId getClassId(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor == null || (containingDeclaration = classifierDescriptor.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            Name name = classifierDescriptor.getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            return new ClassId(fqName, name);
        }
        if (!(containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) || (classId = getClassId((ClassifierDescriptor) containingDeclaration)) == null) {
            return null;
        }
        Name name2 = classifierDescriptor.getName();
        AbstractC16544l.m18093f(name2, "getName(...)");
        return classId.createNestedClassId(name2);
    }

    public static final FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        AbstractC16544l.m18093f(fqNameSafe, "getFqNameSafe(...)");
        return fqNameSafe;
    }

    public static final FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        AbstractC16544l.m18093f(fqName, "getFqName(...)");
        return fqName;
    }

    public static final InlineClassRepresentation<SimpleType> getInlineClassRepresentation(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final KotlinTypeRefiner getKotlinTypeRefiner(ModuleDescriptor moduleDescriptor) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : KotlinTypeRefiner.Default.INSTANCE;
    }

    public static final ModuleDescriptor getModule(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        AbstractC16544l.m18093f(containingModule, "getContainingModule(...)");
        return containingModule;
    }

    public static final MultiFieldValueClassRepresentation<SimpleType> getMultiFieldValueClassRepresentation(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final InterfaceC21029j getParents(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return AbstractC21031l.m21486j(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final InterfaceC21029j getParentsWithSelf(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return AbstractC21031l.m21492p(C16273b.f50402Y, declarationDescriptor);
    }

    public static final CallableMemberDescriptor getPropertyIfAccessor(CallableMemberDescriptor callableMemberDescriptor) {
        AbstractC16544l.m18094g(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        AbstractC16544l.m18093f(correspondingProperty, "getCorrespondingProperty(...)");
        return correspondingProperty;
    }

    public static final ClassDescriptor getSuperClassNotAny(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(classifierDescriptorMo22589getDeclarationDescriptor)) {
                    AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    public static final InterfaceC21029j overriddenTreeAsSequence(CallableMemberDescriptor callableMemberDescriptor, boolean z6) {
        AbstractC16544l.m18094g(callableMemberDescriptor, "<this>");
        if (z6) {
            callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        }
        InterfaceC21029j interfaceC21029jM19297d = AbstractC17678l.m19297d(new CallableMemberDescriptor[]{callableMemberDescriptor});
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
        return AbstractC21031l.m21490n(AbstractC17678l.m19297d(new InterfaceC21029j[]{interfaceC21029jM19297d, new C21028i(AbstractC17680n.m19329H(overriddenDescriptors), new C16274c(z6), C21034o.f66913Y)}));
    }

    public static final ClassDescriptor resolveTopLevelClass(ModuleDescriptor moduleDescriptor, FqName topLevelClassFqName, LookupLocation location) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(topLevelClassFqName, "topLevelClassFqName");
        AbstractC16544l.m18094g(location, "location");
        topLevelClassFqName.isRoot();
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = moduleDescriptor.getPackage(topLevelClassFqName.parent()).getMemberScope().mo22590getContributedClassifier(topLevelClassFqName.shortName(), location);
        if (classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier;
        }
        return null;
    }
}
