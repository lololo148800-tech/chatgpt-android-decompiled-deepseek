package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import p973qn.C18779a;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final String m18438a(TypeConstructor typeConstructor) {
        StringBuilder sb2 = new StringBuilder();
        m18439b("type: " + typeConstructor, sb2);
        m18439b("hashCode: " + typeConstructor.hashCode(), sb2);
        m18439b("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb2);
        for (DeclarationDescriptor declarationDescriptorMo22589getDeclarationDescriptor = typeConstructor.mo22589getDeclarationDescriptor(); declarationDescriptorMo22589getDeclarationDescriptor != null; declarationDescriptorMo22589getDeclarationDescriptor = declarationDescriptorMo22589getDeclarationDescriptor.getContainingDeclaration()) {
            m18439b("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo22589getDeclarationDescriptor), sb2);
            m18439b("javaClass: " + declarationDescriptorMo22589getDeclarationDescriptor.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final void m18439b(String str, StringBuilder sb2) {
        AbstractC16544l.m18094g(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static final KotlinType findCorrespondingSupertype(KotlinType subtype, KotlinType supertype, TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        AbstractC16544l.m18094g(subtype, "subtype");
        AbstractC16544l.m18094g(supertype, "supertype");
        AbstractC16544l.m18094g(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C18779a(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            C18779a c18779a = (C18779a) arrayDeque.poll();
            KotlinType upper = c18779a.f59685a;
            TypeConstructor constructor2 = upper.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = upper.isMarkedNullable();
                for (C18779a c18779a2 = c18779a.f59686b; c18779a2 != null; c18779a2 = c18779a2.f59686b) {
                    KotlinType kotlinType = c18779a2.f59685a;
                    List<TypeProjection> arguments = kotlinType.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it = arguments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                upper = TypeConstructorSubstitution.Companion.create(kotlinType).buildSubstitutor().safeSubstitute(upper, Variance.INVARIANT);
                                AbstractC16544l.m18091d(upper);
                                break;
                            }
                            Variance projectionKind = ((TypeProjection) it.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinType), false, 1, null).buildSubstitutor().safeSubstitute(upper, variance);
                                AbstractC16544l.m18093f(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                                upper = CapturedTypeApproximationKt.approximateCapturedTypes(kotlinTypeSafeSubstitute).getUpper();
                                break;
                            }
                        }
                    } else {
                        upper = TypeConstructorSubstitution.Companion.create(kotlinType).buildSubstitutor().safeSubstitute(upper, Variance.INVARIANT);
                        AbstractC16544l.m18091d(upper);
                        break;
                    }
                    zIsMarkedNullable = zIsMarkedNullable || kotlinType.isMarkedNullable();
                }
                TypeConstructor constructor3 = upper.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(upper, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m18438a(constructor3) + ", \n\nsupertype: " + m18438a(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType2 : constructor2.getSupertypes()) {
                AbstractC16544l.m18091d(kotlinType2);
                arrayDeque.add(new C18779a(kotlinType2, c18779a));
            }
        }
        return null;
    }
}
