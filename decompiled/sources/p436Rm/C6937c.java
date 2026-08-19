package p436Rm;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: renamed from: Rm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6937c extends AbstractTypeConstructor {

    /* JADX INFO: renamed from: c */
    public final SupertypeLoopChecker f22219c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractTypeParameterDescriptor f22220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6937c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
        super(storageManager);
        if (storageManager == null) {
            m7317h(0);
            throw null;
        }
        this.f22220d = abstractTypeParameterDescriptor;
        this.f22219c = supertypeLoopChecker;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m7317h(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i10 == 2) {
            objArr[1] = "getParameters";
        } else if (i10 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /* JADX INFO: renamed from: a */
    public final boolean mo7318a(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor instanceof TypeParameterDescriptor) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.f22220d, (TypeParameterDescriptor) classifierDescriptor, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: b */
    public final Collection mo7319b() {
        List listMo18135c = this.f22220d.mo18135c();
        if (listMo18135c != null) {
            return listMo18135c;
        }
        m7317h(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: c */
    public final KotlinType mo7320c() {
        return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final SupertypeLoopChecker mo7321e() {
        SupertypeLoopChecker supertypeLoopChecker = this.f22219c;
        if (supertypeLoopChecker != null) {
            return supertypeLoopChecker;
        }
        m7317h(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: f */
    public final List mo7322f(List list) {
        List listMo18134b = this.f22220d.mo18134b(list);
        if (listMo18134b != null) {
            return listMo18134b;
        }
        m7317h(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: g */
    public final void mo7323g(KotlinType kotlinType) {
        if (kotlinType != null) {
            this.f22220d.reportSupertypeLoopError(kotlinType);
        } else {
            m7317h(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.f22220d);
        if (builtIns != null) {
            return builtIns;
        }
        m7317h(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo22589getDeclarationDescriptor() {
        AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f22220d;
        if (abstractTypeParameterDescriptor != null) {
            return abstractTypeParameterDescriptor;
        }
        m7317h(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m7317h(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        return this.f22220d.getName().toString();
    }
}
