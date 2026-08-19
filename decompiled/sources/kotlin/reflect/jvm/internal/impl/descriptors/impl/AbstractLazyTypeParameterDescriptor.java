package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLazyTypeParameterDescriptor extends AbstractTypeParameterDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLazyTypeParameterDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Variance variance, boolean z6, int i10, SourceElement sourceElement, SupertypeLoopChecker supertypeLoopChecker) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z6, i10, sourceElement, supertypeLoopChecker);
        if (storageManager == null) {
            m18130a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18130a(1);
            throw null;
        }
        if (annotations == null) {
            m18130a(2);
            throw null;
        }
        if (name == null) {
            m18130a(3);
            throw null;
        }
        if (variance == null) {
            m18130a(4);
            throw null;
        }
        if (sourceElement == null) {
            m18130a(5);
            throw null;
        }
        if (supertypeLoopChecker != null) {
        } else {
            m18130a(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18130a(int i10) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        String str = "";
        String str2 = isReified() ? "reified " : "";
        if (getVariance() != Variance.INVARIANT) {
            str = getVariance() + Separators.f31991SP;
        }
        return str2 + str + getName();
    }
}
