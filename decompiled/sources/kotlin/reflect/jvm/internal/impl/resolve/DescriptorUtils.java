package kotlin.reflect.jvm.internal.impl.resolve;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import livekit.LivekitInternal$NodeStats;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorUtils {
    public static final FqName JVM_NAME = new FqName("kotlin.jvm.JvmName");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18342a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = sVoFrD.iJeexXgG;
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean areInSameModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m18342a(16);
            throw null;
        }
        if (declarationDescriptor2 != null) {
            return getContainingModule(declarationDescriptor).equals(getContainingModule(declarationDescriptor2));
        }
        m18342a(17);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static void m18343b(CallableDescriptor callableDescriptor, LinkedHashSet linkedHashSet) {
        if (callableDescriptor == null) {
            m18342a(73);
            throw null;
        }
        if (linkedHashSet.contains(callableDescriptor)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = callableDescriptor.getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            CallableDescriptor original = it.next().getOriginal();
            m18343b(original, linkedHashSet);
            linkedHashSet.add(original);
        }
    }

    /* JADX INFO: renamed from: c */
    public static FqName m18344c(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(5);
            throw null;
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.isError(declarationDescriptor)) {
            return FqName.ROOT;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).getFqName();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18345d(DeclarationDescriptor declarationDescriptor, ClassKind classKind) {
        if (classKind != null) {
            return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
        }
        m18342a(37);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18346e(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            m18342a(30);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18342a(31);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
            return false;
        }
        DeclarationDescriptor original = classifierDescriptorMo22589getDeclarationDescriptor.getOriginal();
        return (original instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).getTypeConstructor().equals(((ClassifierDescriptor) original).getTypeConstructor());
    }

    public static <D extends CallableDescriptor> Set<D> getAllOverriddenDescriptors(D d10) {
        if (d10 == null) {
            m18342a(71);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m18343b(d10.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    public static ClassDescriptor getClassDescriptorForType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return getClassDescriptorForTypeConstructor(kotlinType.getConstructor());
        }
        m18342a(45);
        throw null;
    }

    public static ClassDescriptor getClassDescriptorForTypeConstructor(TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            m18342a(46);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.mo22589getDeclarationDescriptor();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        m18342a(47);
        throw null;
    }

    public static ModuleDescriptor getContainingModule(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(21);
            throw null;
        }
        ModuleDescriptor containingModuleOrNull = getContainingModuleOrNull(declarationDescriptor);
        if (containingModuleOrNull != null) {
            return containingModuleOrNull;
        }
        m18342a(22);
        throw null;
    }

    public static ModuleDescriptor getContainingModuleOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18342a(20);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull(classifierDescriptorMo22589getDeclarationDescriptor);
    }

    public static SourceFile getContainingSourceFile(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(82);
            throw null;
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).getCorrespondingProperty();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile containingFile = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile();
            if (containingFile != null) {
                return containingFile;
            }
            m18342a(83);
            throw null;
        }
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        if (sourceFile != null) {
            return sourceFile;
        }
        m18342a(84);
        throw null;
    }

    public static DescriptorVisibility getDefaultConstructorVisibility(ClassDescriptor classDescriptor, boolean z6) {
        if (classDescriptor == null) {
            m18342a(48);
            throw null;
        }
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility != null) {
                return descriptorVisibility;
            }
            m18342a(49);
            throw null;
        }
        if (isSealedClass(classDescriptor)) {
            if (z6) {
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.PROTECTED;
                if (descriptorVisibility2 != null) {
                    return descriptorVisibility2;
                }
                m18342a(50);
                throw null;
            }
            DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility3 != null) {
                return descriptorVisibility3;
            }
            m18342a(51);
            throw null;
        }
        if (isAnonymousObject(classDescriptor)) {
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.DEFAULT_VISIBILITY;
            if (descriptorVisibility4 != null) {
                return descriptorVisibility4;
            }
            m18342a(52);
            throw null;
        }
        DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility5 != null) {
            return descriptorVisibility5;
        }
        m18342a(53);
        throw null;
    }

    public static ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(0);
            throw null;
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).getThisAsReceiverParameter();
        }
        return null;
    }

    public static FqNameUnsafe getFqName(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(2);
            throw null;
        }
        FqName fqNameM18344c = m18344c(declarationDescriptor);
        if (fqNameM18344c != null) {
            return fqNameM18344c.toUnsafe();
        }
        FqNameUnsafe fqNameUnsafeChild = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
        if (fqNameUnsafeChild != null) {
            return fqNameUnsafeChild;
        }
        m18342a(7);
        throw null;
    }

    public static FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(3);
            throw null;
        }
        FqName fqNameM18344c = m18344c(declarationDescriptor);
        if (fqNameM18344c == null) {
            FqNameUnsafe fqNameUnsafeChild = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
            if (fqNameUnsafeChild == null) {
                m18342a(7);
                throw null;
            }
            fqNameM18344c = fqNameUnsafeChild.toSafe();
        }
        if (fqNameM18344c != null) {
            return fqNameM18344c;
        }
        m18342a(4);
        throw null;
    }

    public static <D extends DeclarationDescriptor> D getParentOfType(DeclarationDescriptor declarationDescriptor, Class<D> cls) {
        if (cls != null) {
            return (D) getParentOfType(declarationDescriptor, cls, true);
        }
        m18342a(18);
        throw null;
    }

    public static ClassDescriptor getSuperClassDescriptor(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m18342a(44);
            throw null;
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorForType = getClassDescriptorForType(it.next());
            if (classDescriptorForType.getKind() != ClassKind.INTERFACE) {
                return classDescriptorForType;
            }
        }
        return null;
    }

    public static boolean isAnnotationClass(DeclarationDescriptor declarationDescriptor) {
        return m18345d(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return isClass(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.NO_NAME_PROVIDED);
        }
        m18342a(34);
        throw null;
    }

    public static boolean isClass(DeclarationDescriptor declarationDescriptor) {
        return m18345d(declarationDescriptor, ClassKind.CLASS);
    }

    public static boolean isClassOrEnumClass(DeclarationDescriptor declarationDescriptor) {
        return isClass(declarationDescriptor) || isEnumClass(declarationDescriptor);
    }

    public static boolean isCompanionObject(DeclarationDescriptor declarationDescriptor) {
        return m18345d(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.LOCAL;
    }

    public static boolean isDirectSubclass(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            m18342a(26);
            throw null;
        }
        if (classDescriptor2 == null) {
            m18342a(27);
            throw null;
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (m18346e(it.next(), classDescriptor2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnumClass(DeclarationDescriptor declarationDescriptor) {
        return m18345d(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    public static boolean isEnumEntry(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return m18345d(declarationDescriptor, ClassKind.ENUM_ENTRY);
        }
        m18342a(36);
        throw null;
    }

    public static boolean isInterface(DeclarationDescriptor declarationDescriptor) {
        return m18345d(declarationDescriptor, ClassKind.INTERFACE);
    }

    public static boolean isLocal(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(1);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (isAnonymousObject(declarationDescriptor) || isDescriptorWithLocalVisibility(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isSealedClass(DeclarationDescriptor declarationDescriptor) {
        return (m18345d(declarationDescriptor, ClassKind.CLASS) || m18345d(declarationDescriptor, ClassKind.INTERFACE)) && ((ClassDescriptor) declarationDescriptor).getModality() == Modality.SEALED;
    }

    public static boolean isSubclass(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            m18342a(28);
            throw null;
        }
        if (classDescriptor2 != null) {
            return isSubtypeOfClass(classDescriptor.getDefaultType(), classDescriptor2.getOriginal());
        }
        m18342a(29);
        throw null;
    }

    public static boolean isSubtypeOfClass(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            m18342a(32);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18342a(33);
            throw null;
        }
        if (m18346e(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.getConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSubtypeOfClass(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTopLevelDeclaration(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor);
    }

    public static boolean shouldRecordInitializerForProperty(VariableDescriptor variableDescriptor, KotlinType kotlinType) {
        if (variableDescriptor == null) {
            m18342a(66);
            throw null;
        }
        if (kotlinType == null) {
            m18342a(67);
            throw null;
        }
        if (variableDescriptor.isVar() || KotlinTypeKt.isError(kotlinType)) {
            return false;
        }
        if (TypeUtils.acceptsNullable(kotlinType)) {
            return true;
        }
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(variableDescriptor);
        if (!KotlinBuiltIns.isPrimitiveType(kotlinType)) {
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
            if (!kotlinTypeChecker.equalTypes(builtIns.getStringType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getNumber().getDefaultType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getAnyType(), kotlinType) && !UnsignedTypes.isUnsignedType(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends CallableMemberDescriptor> D unwrapFakeOverride(D d10) {
        if (d10 == null) {
            m18342a(59);
            throw null;
        }
        while (d10.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = d10.getOverriddenDescriptors();
            if (overriddenDescriptors.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
            d10 = (D) overriddenDescriptors.iterator().next();
        }
        return d10;
    }

    public static <D extends DeclarationDescriptorWithVisibility> D unwrapFakeOverrideToAnyDeclaration(D d10) {
        if (d10 == null) {
            m18342a(64);
            throw null;
        }
        if (d10 instanceof CallableMemberDescriptor) {
            return unwrapFakeOverride((CallableMemberDescriptor) d10);
        }
        if (d10 != null) {
            return d10;
        }
        m18342a(65);
        throw null;
    }

    public static <D extends DeclarationDescriptor> D getParentOfType(DeclarationDescriptor declarationDescriptor, Class<D> cls, boolean z6) {
        if (cls == null) {
            m18342a(19);
            throw null;
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z6) {
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    public static ModuleDescriptor getContainingModuleOrNull(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18342a(23);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).getModule();
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }
}
