package p388Pm;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;

/* JADX INFO: renamed from: Pm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6509c extends DelegatedDescriptorVisibility {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f21111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6509c(Visibility visibility, int i10) {
        super(visibility);
        this.f21111b = i10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7069a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "what";
        } else if (i10 != 2) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "isVisible";
        } else {
            objArr[2] = "hasContainingSourceFile";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7070b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7071c(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7072d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7073e(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "from";
        } else if (i10 == 2) {
            objArr[0] = "whatDeclaration";
        } else if (i10 != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "fromClass";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "doesReceiverFitForProtectedVisibility";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7074f(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7075g(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m7076h(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m7077i(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m7078j(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
        objArr[2] = HJrCuD.ruUICfCIYo;
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m7079k(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m7080l(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "from";
        } else if (i10 == 2) {
            objArr[0] = "fromPackage";
        } else if (i10 != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "myPackage";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "visibleFromPackage";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Code duplicated, block: B:195:0x01fa A[ADDED_TO_REGION, LOOP:1: B:195:0x01fa->B:207:0x0222, LOOP_START, PHI: r9
      0x01fa: PHI (r9v1 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) = 
      (r9v0 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
      (r9v2 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
     binds: [B:193:0x01f6, B:207:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:207:0x0222 A[LOOP:1: B:195:0x01fa->B:207:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x013f, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(r0) == false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z6) {
        DeclarationDescriptor parentOfType;
        ClassDescriptor classDescriptor;
        switch (this.f21111b) {
            case 0:
                if (declarationDescriptorWithVisibility == 0) {
                    m7069a(1);
                    throw null;
                }
                if (declarationDescriptor == null) {
                    m7069a(2);
                    throw null;
                }
                if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) && DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE) {
                    return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                    if (z6 && DescriptorUtils.isSealedClass(containingDeclaration) && DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                        return true;
                    }
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                    if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                        if (declarationDescriptorWithVisibility != 0) {
                            while (declarationDescriptor != null) {
                                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                                    return true;
                                }
                                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                                    declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                                } else if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
                if (declarationDescriptorWithVisibility != 0) {
                    while (declarationDescriptor != null) {
                        if (declarationDescriptorWithVisibility == declarationDescriptor) {
                            return true;
                        }
                        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                        } else if (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                if (declarationDescriptorWithVisibility == 0) {
                    m7070b(0);
                    throw null;
                }
                if (declarationDescriptor == null) {
                    m7070b(1);
                    throw null;
                }
                if (!DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z6)) {
                    return false;
                }
                if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue == DescriptorVisibilities.f51395b || (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                    return false;
                }
                return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
            case 2:
                if (declarationDescriptorWithVisibility == 0) {
                    m7073e(0);
                    throw null;
                }
                if (declarationDescriptor == null) {
                    m7073e(1);
                    throw null;
                }
                ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
                ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
                if (classDescriptor3 == null) {
                    return false;
                }
                if (classDescriptor2 == null || !DescriptorUtils.isCompanionObject(classDescriptor2) || (classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor2, ClassDescriptor.class)) == null || !DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                    DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
                    ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
                    if (classDescriptor4 == null) {
                        return false;
                    }
                    if (DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4)) {
                        if (declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration == null) {
                            m7073e(2);
                            throw null;
                        }
                        if (receiverValue != DescriptorVisibilities.FALSE_IF_PROTECTED) {
                            if ((declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration instanceof CallableMemberDescriptor) && !(declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration instanceof ConstructorDescriptor) && receiverValue != DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                                if (receiverValue != DescriptorVisibilities.f51395b && receiverValue != null) {
                                    KotlinType thisType = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
                                    if (!DescriptorUtils.isSubtypeOfClass(thisType, classDescriptor3)) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration(), z6);
                }
                return true;
            case 3:
                if (declarationDescriptorWithVisibility == 0) {
                    m7074f(0);
                    throw null;
                }
                if (declarationDescriptor == null) {
                    m7074f(1);
                    throw null;
                }
                if (DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                    return DescriptorVisibilities.f51396c.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                return false;
            case 4:
                if (declarationDescriptorWithVisibility == 0) {
                    m7075g(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return true;
                }
                m7075g(1);
                throw null;
            case 5:
                if (declarationDescriptorWithVisibility == 0) {
                    m7076h(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
                }
                m7076h(1);
                throw null;
            case 6:
                if (declarationDescriptorWithVisibility == 0) {
                    m7077i(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    throw new IllegalStateException("Visibility is unknown yet");
                }
                m7077i(1);
                throw null;
            case 7:
                if (declarationDescriptorWithVisibility == 0) {
                    m7078j(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return false;
                }
                m7078j(1);
                throw null;
            case 8:
                if (declarationDescriptorWithVisibility == 0) {
                    m7079k(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return false;
                }
                m7079k(1);
                throw null;
            case 9:
                if (declarationDescriptorWithVisibility == 0) {
                    m7080l(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.m18174c(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                m7080l(1);
                throw null;
            case 10:
                if (declarationDescriptorWithVisibility == 0) {
                    m7071c(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.m18173b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                m7071c(1);
                throw null;
            default:
                if (declarationDescriptorWithVisibility == 0) {
                    m7072d(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.m18173b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                m7072d(1);
                throw null;
        }
    }
}
