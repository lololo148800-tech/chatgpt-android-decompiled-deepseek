package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {

    /* JADX INFO: renamed from: q0 */
    public final DeclarationDescriptor f51483q0;

    /* JADX INFO: renamed from: r0 */
    public final SourceElement f51484r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f51485s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement, boolean z6) {
        super(storageManager, name);
        if (storageManager == null) {
            m18137a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18137a(1);
            throw null;
        }
        if (name == null) {
            m18137a(2);
            throw null;
        }
        if (sourceElement == null) {
            m18137a(3);
            throw null;
        }
        this.f51483q0 = declarationDescriptor;
        this.f51484r0 = sourceElement;
        this.f51485s0 = z6;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18137a(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = DiagnosticsEntry.NAME_KEY;
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor = this.f51483q0;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        m18137a(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = this.f51484r0;
        if (sourceElement != null) {
            return sourceElement;
        }
        m18137a(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f51485s0;
    }
}
