package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p037B9.MeDP.MpoABj;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedTypeUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinTypeMarker m18415a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet hashSet) {
        KotlinTypeMarker kotlinTypeMarkerM18415a;
        KotlinTypeMarker kotlinTypeMarkerMakeNullable;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        if (typeParameterClassifier != null) {
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            kotlinTypeMarkerM18415a = m18415a(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (kotlinTypeMarkerM18415a == null) {
                return null;
            }
            boolean z6 = typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound));
            if ((kotlinTypeMarkerM18415a instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerM18415a) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && z6) {
                kotlinTypeMarkerMakeNullable = typeSystemCommonBackendContext.makeNullable(representativeUpperBound);
            } else if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerM18415a) && typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) {
                kotlinTypeMarkerMakeNullable = typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerM18415a);
            }
            return kotlinTypeMarkerMakeNullable;
        }
        if (!typeSystemCommonBackendContext.isInlineClass(typeConstructorMarkerTypeConstructor)) {
            return kotlinTypeMarker;
        }
        KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
        if (unsubstitutedUnderlyingType == null || (kotlinTypeMarkerM18415a = m18415a(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, hashSet)) == null) {
            return null;
        }
        if (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
            if (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerM18415a)) {
                return kotlinTypeMarker;
            }
            return ((kotlinTypeMarkerM18415a instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerM18415a)) ? kotlinTypeMarker : typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerM18415a);
        }
        return kotlinTypeMarkerM18415a;
    }

    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(typeSystemCommonBackendContext, "<this>");
        AbstractC16544l.m18094g(kotlinTypeMarker, MpoABj.Wtg);
        return m18415a(typeSystemCommonBackendContext, kotlinTypeMarker, new HashSet());
    }
}
