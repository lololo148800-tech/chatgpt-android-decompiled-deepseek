package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16564a implements SignaturePropagator {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18180a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i10 == 5 || i10 == 6) {
            objArr[2] = "reportSignatureErrors";
        } else {
            objArr[2] = "resolvePropagatedSignature";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List list) {
        if (callableMemberDescriptor == null) {
            m18180a(5);
            throw null;
        }
        if (list != null) {
            throw new UnsupportedOperationException("Should not be called");
        }
        m18180a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final SignaturePropagator.PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List list, List list2) {
        if (javaMethod == null) {
            m18180a(0);
            throw null;
        }
        if (classDescriptor == null) {
            m18180a(1);
            throw null;
        }
        if (kotlinType == null) {
            m18180a(2);
            throw null;
        }
        if (list == null) {
            m18180a(3);
            throw null;
        }
        if (list2 != null) {
            return new SignaturePropagator.PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.emptyList(), false);
        }
        m18180a(4);
        throw null;
    }
}
