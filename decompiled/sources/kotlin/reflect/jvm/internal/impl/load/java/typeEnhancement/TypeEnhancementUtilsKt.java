package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeEnhancementUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final Object m18233a(Set set, Enum r6, Enum r10, Enum r11, boolean z6) {
        Enum r12;
        if (!z6) {
            if (r11 != null) {
                set = AbstractC17680n.m19328G0(AbstractC17665J.m19267g(set, r11));
            }
            return AbstractC17680n.m19366p0(set);
        }
        if (set.contains(r6)) {
            r12 = r6;
        } else {
            r12 = set.contains(r10) ? r10 : null;
        }
        if (AbstractC16544l.m18089b(r12, r6) && AbstractC16544l.m18089b(r11, r10)) {
            return null;
        }
        return r11 == null ? r12 : r11;
    }

    public static final JavaTypeQualifiers computeQualifiersForOverride(JavaTypeQualifiers javaTypeQualifiers, Collection<JavaTypeQualifiers> superQualifiers, boolean z6, boolean z10, boolean z11) {
        NullabilityQualifier nullability;
        NullabilityQualifier nullabilityQualifier;
        boolean z12;
        AbstractC16544l.m18094g(javaTypeQualifiers, "<this>");
        AbstractC16544l.m18094g(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (true) {
            nullability = null;
            if (!it.hasNext()) {
                break;
            }
            JavaTypeQualifiers javaTypeQualifiers2 = (JavaTypeQualifiers) it.next();
            nullability = javaTypeQualifiers2.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers2.getNullability();
            if (nullability != null) {
                arrayList.add(nullability);
            }
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        NullabilityQualifier nullability2 = javaTypeQualifiers.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers.getNullability();
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullability2 != nullabilityQualifier2) {
            nullabilityQualifier2 = (NullabilityQualifier) m18233a(setM19328G0, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability2, z6);
        }
        if (nullabilityQualifier2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability3 = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability3 != null) {
                    arrayList2.add(nullability3);
                }
            }
            Set setM19328G1 = AbstractC17680n.m19328G0(arrayList2);
            NullabilityQualifier nullability4 = javaTypeQualifiers.getNullability();
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (nullability4 != nullabilityQualifier) {
                nullabilityQualifier = (NullabilityQualifier) m18233a(setM19328G1, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability4, z6);
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) m18233a(AbstractC17680n.m19328G0(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z6);
        if (nullabilityQualifier != null && !z11 && (!z10 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
            nullability = nullabilityQualifier;
        }
        boolean z13 = false;
        if (nullability != NullabilityQualifier.NOT_NULL) {
            z12 = false;
        } else {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((JavaTypeQualifiers) it4.next()).getDefinitelyNotNull()) {
                            }
                        }
                    }
                }
                z12 = false;
            }
            z12 = true;
        }
        if (nullability != null && nullabilityQualifier2 != nullabilityQualifier) {
            z13 = true;
        }
        return new JavaTypeQualifiers(nullability, mutabilityQualifier, z12, z13);
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type) {
        AbstractC16544l.m18094g(typeSystemCommonBackendContext, "<this>");
        AbstractC16544l.m18094g(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        AbstractC16544l.m18093f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }
}
