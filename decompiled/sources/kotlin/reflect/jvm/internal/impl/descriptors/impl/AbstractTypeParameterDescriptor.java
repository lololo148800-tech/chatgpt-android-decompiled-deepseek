package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p298Lm.C5208w;
import p436Rm.C6936b;
import p436Rm.C6937c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: q0 */
    public final Variance f51476q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f51477r0;

    /* JADX INFO: renamed from: s0 */
    public final int f51478s0;

    /* JADX INFO: renamed from: t0 */
    public final NotNullLazyValue f51479t0;

    /* JADX INFO: renamed from: u0 */
    public final NotNullLazyValue f51480u0;

    /* JADX INFO: renamed from: v0 */
    public final StorageManager f51481v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Variance variance, boolean z6, int i10, SourceElement sourceElement, SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            m18133a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18133a(1);
            throw null;
        }
        if (annotations == null) {
            m18133a(2);
            throw null;
        }
        if (name == null) {
            m18133a(3);
            throw null;
        }
        if (variance == null) {
            m18133a(4);
            throw null;
        }
        if (sourceElement == null) {
            m18133a(5);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            m18133a(6);
            throw null;
        }
        this.f51476q0 = variance;
        this.f51477r0 = z6;
        this.f51478s0 = i10;
        this.f51479t0 = storageManager.createLazyValue(new C5208w(this, storageManager, supertypeLoopChecker));
        this.f51480u0 = storageManager.createLazyValue(new C6936b(this, name));
        this.f51481v0 = storageManager;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18133a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d10);
    }

    /* JADX INFO: renamed from: b */
    public List mo18134b(List list) {
        return list;
    }

    /* JADX INFO: renamed from: c */
    public abstract List mo18135c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.f51480u0.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        m18133a(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f51478s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f51481v0;
        if (storageManager != null) {
            return storageManager;
        }
        m18133a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = (TypeConstructor) this.f51479t0.invoke();
        if (typeConstructor != null) {
            return typeConstructor;
        }
        m18133a(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((C6937c) getTypeConstructor()).getSupertypes();
        if (supertypes != null) {
            return supertypes;
        }
        m18133a(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance getVariance() {
        Variance variance = this.f51476q0;
        if (variance != null) {
            return variance;
        }
        m18133a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f51477r0;
    }

    public abstract void reportSupertypeLoopError(KotlinType kotlinType);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        m18133a(11);
        throw null;
    }
}
