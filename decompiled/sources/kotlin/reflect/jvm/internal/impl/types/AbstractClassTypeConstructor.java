package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager != null) {
        } else {
            m18401h(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18401h(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /* JADX INFO: renamed from: a */
    public final boolean mo7318a(ClassifierDescriptor classifierDescriptor) {
        boolean z6;
        if (!(classifierDescriptor instanceof ClassDescriptor)) {
            return false;
        }
        ClassDescriptor first = mo22589getDeclarationDescriptor();
        AbstractC16544l.m18094g(first, "first");
        if (!AbstractC16544l.m18089b(first.getName(), classifierDescriptor.getName())) {
            z6 = false;
            break;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = classifierDescriptor.getContainingDeclaration();
        while (true) {
            if (containingDeclaration != null && containingDeclaration2 != null) {
                if (!(containingDeclaration instanceof ModuleDescriptor)) {
                    if (!(containingDeclaration2 instanceof ModuleDescriptor)) {
                        if (containingDeclaration instanceof PackageFragmentDescriptor) {
                            if (!(containingDeclaration2 instanceof PackageFragmentDescriptor) || !AbstractC16544l.m18089b(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName())) {
                                break;
                            }
                        } else if (!(containingDeclaration2 instanceof PackageFragmentDescriptor) && AbstractC16544l.m18089b(containingDeclaration.getName(), containingDeclaration2.getName())) {
                            containingDeclaration = containingDeclaration.getContainingDeclaration();
                            containingDeclaration2 = containingDeclaration2.getContainingDeclaration();
                        }
                    }
                    z6 = false;
                    break;
                }
                z6 = containingDeclaration2 instanceof ModuleDescriptor;
                break;
            }
            z6 = true;
            break;
        }
        return z6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: c */
    public final KotlinType mo7320c() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo22589getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: d */
    public final Collection mo18402d(boolean z6) {
        DeclarationDescriptor containingDeclaration = mo22589getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            m18401h(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor classDescriptorMo22583getCompanionObjectDescriptor = classDescriptor.mo22583getCompanionObjectDescriptor();
        if (z6 && classDescriptorMo22583getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo22583getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo22589getDeclarationDescriptor());
        if (builtIns != null) {
            return builtIns;
        }
        m18401h(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo22589getDeclarationDescriptor();
}
