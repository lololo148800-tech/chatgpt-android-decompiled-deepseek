package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC1436k f51642w0;

    /* JADX INFO: renamed from: x0 */
    public final ArrayList f51643x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f51644y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z6, Variance variance, Name name, int i10, SourceElement sourceElement, InterfaceC1436k interfaceC1436k, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z6, i10, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            m18158a(19);
            throw null;
        }
        if (annotations == null) {
            m18158a(20);
            throw null;
        }
        if (variance == null) {
            m18158a(21);
            throw null;
        }
        if (name == null) {
            m18158a(22);
            throw null;
        }
        if (sourceElement == null) {
            m18158a(23);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            m18158a(24);
            throw null;
        }
        if (storageManager == null) {
            m18158a(25);
            throw null;
        }
        this.f51643x0 = new ArrayList(1);
        this.f51644y0 = false;
        this.f51642w0 = interfaceC1436k;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18158a(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z6, Variance variance, Name name, int i10, SourceElement sourceElement, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m18158a(6);
            throw null;
        }
        if (annotations == null) {
            m18158a(7);
            throw null;
        }
        if (variance == null) {
            m18158a(8);
            throw null;
        }
        if (name == null) {
            m18158a(9);
            throw null;
        }
        if (sourceElement == null) {
            m18158a(10);
            throw null;
        }
        if (storageManager != null) {
            return createForFurtherModification(declarationDescriptor, annotations, z6, variance, name, i10, sourceElement, null, SupertypeLoopChecker.EMPTY.INSTANCE, storageManager);
        }
        m18158a(11);
        throw null;
    }

    public static TypeParameterDescriptor createWithDefaultBound(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z6, Variance variance, Name name, int i10, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m18158a(0);
            throw null;
        }
        if (annotations == null) {
            m18158a(1);
            throw null;
        }
        if (variance == null) {
            m18158a(2);
            throw null;
        }
        if (name == null) {
            m18158a(3);
            throw null;
        }
        if (storageManager == null) {
            m18158a(4);
            throw null;
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = createForFurtherModification(declarationDescriptor, annotations, z6, variance, name, i10, SourceElement.NO_SOURCE, storageManager);
        typeParameterDescriptorImplCreateForFurtherModification.addUpperBound(DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        typeParameterDescriptorImplCreateForFurtherModification.setInitialized();
        return typeParameterDescriptorImplCreateForFurtherModification;
    }

    public void addUpperBound(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18158a(26);
            throw null;
        }
        if (this.f51644y0) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m18159d());
        }
        if (KotlinTypeKt.isError(kotlinType)) {
            return;
        }
        this.f51643x0.add(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: c */
    public final List mo18135c() {
        if (!this.f51644y0) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m18159d());
        }
        ArrayList arrayList = this.f51643x0;
        if (arrayList != null) {
            return arrayList;
        }
        m18158a(28);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final String m18159d() {
        return getName() + " declared in " + DescriptorUtils.getFqName(getContainingDeclaration());
    }

    public boolean isInitialized() {
        return this.f51644y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void reportSupertypeLoopError(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18158a(27);
            throw null;
        }
        InterfaceC1436k interfaceC1436k = this.f51642w0;
        if (interfaceC1436k == null) {
            return;
        }
        interfaceC1436k.invoke(kotlinType);
    }

    public void setInitialized() {
        if (!this.f51644y0) {
            this.f51644y0 = true;
        } else {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m18159d());
        }
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z6, Variance variance, Name name, int i10, SourceElement sourceElement, InterfaceC1436k interfaceC1436k, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m18158a(12);
            throw null;
        }
        if (annotations == null) {
            m18158a(13);
            throw null;
        }
        if (variance == null) {
            m18158a(14);
            throw null;
        }
        if (name == null) {
            m18158a(15);
            throw null;
        }
        if (sourceElement == null) {
            m18158a(16);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            m18158a(17);
            throw null;
        }
        if (storageManager != null) {
            return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z6, variance, name, i10, sourceElement, interfaceC1436k, supertypeLoopChecker, storageManager);
        }
        m18158a(18);
        throw null;
    }
}
