package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {

    /* JADX INFO: renamed from: Z */
    public final Name f51494Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(Annotations annotations, Name name) {
        super(annotations);
        if (annotations == null) {
            m18139a(0);
            throw null;
        }
        if (name == null) {
            m18139a(1);
            throw null;
        }
        this.f51494Z = name;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18139a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f51494Z;
        if (name != null) {
            return name;
        }
        m18139a(2);
        throw null;
    }

    public DeclarationDescriptor getOriginal() {
        return this;
    }

    public String toString() {
        return toString(this);
    }

    public static String toString(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18139a(4);
            throw null;
        }
        try {
            String str = DescriptorRenderer.DEBUG_TEXT.render(declarationDescriptor) + "[" + declarationDescriptor.getClass().getSimpleName() + Separators.f31989AT + Integer.toHexString(System.identityHashCode(declarationDescriptor)) + "]";
            if (str != null) {
                return str;
            }
            m18139a(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = declarationDescriptor.getClass().getSimpleName() + Separators.f31991SP + declarationDescriptor.getName();
            if (str2 != null) {
                return str2;
            }
            m18139a(6);
            throw null;
        }
    }
}
