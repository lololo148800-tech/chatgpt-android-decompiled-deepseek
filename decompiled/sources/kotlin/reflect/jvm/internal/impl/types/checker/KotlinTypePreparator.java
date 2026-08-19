package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p025An.C0644w;
import p870le.C16863U;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    public static final class Default extends KotlinTypePreparator {
        public static final Default INSTANCE = new Default();
    }

    /* JADX INFO: renamed from: a */
    public static SimpleType m18435a(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor constructor = simpleType.getConstructor();
        IntersectionTypeConstructor alternative = null;
        unwrappedTypeUnwrap = null;
        UnwrappedType unwrappedTypeUnwrap = null;
        if (constructor instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) constructor;
            TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.getProjectionKind() != Variance.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                unwrappedTypeUnwrap = type.unwrap();
            }
            UnwrappedType unwrappedType = unwrappedTypeUnwrap;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                Collection<KotlinType> supertypes = capturedTypeConstructorImpl.getSupertypes();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(supertypes, 10));
                Iterator<T> it = supertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new NewCapturedTypeConstructor(projection2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            AbstractC16544l.m18091d(newTypeConstructor);
            return new NewCapturedType(captureStatus, newTypeConstructor, unwrappedType, simpleType.getAttributes(), simpleType.isMarkedNullable(), false, 32, null);
        }
        boolean z6 = false;
        if (constructor instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> supertypes2 = ((IntegerValueTypeConstructor) constructor).getSupertypes();
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(supertypes2, 10));
            Iterator<T> it2 = supertypes2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeMakeNullableAsSpecified = TypeUtils.makeNullableAsSpecified((KotlinType) it2.next(), simpleType.isMarkedNullable());
                AbstractC16544l.m18093f(kotlinTypeMakeNullableAsSpecified, "makeNullableAsSpecified(...)");
                arrayList2.add(kotlinTypeMakeNullableAsSpecified);
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAttributes(), new IntersectionTypeConstructor(arrayList2), C17689w.f56480Y, false, simpleType.getMemberScope());
        }
        if (!(constructor instanceof IntersectionTypeConstructor) || !simpleType.isMarkedNullable()) {
            return simpleType;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
        Collection<KotlinType> supertypes3 = intersectionTypeConstructor.getSupertypes();
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(supertypes3, 10));
        Iterator<T> it3 = supertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.makeNullable((KotlinType) it3.next()));
            z6 = true;
        }
        if (z6) {
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList3).setAlternative(alternativeType != null ? TypeUtilsKt.makeNullable(alternativeType) : null);
        }
        if (alternative != null) {
            intersectionTypeConstructor = alternative;
        }
        return intersectionTypeConstructor.createType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public UnwrappedType prepareType(KotlinTypeMarker type) {
        UnwrappedType unwrappedTypeFlexibleType;
        AbstractC16544l.m18094g(type, "type");
        if (!(type instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedTypeUnwrap = ((KotlinType) type).unwrap();
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            unwrappedTypeFlexibleType = m18435a((SimpleType) unwrappedTypeUnwrap);
        } else {
            if (!(unwrappedTypeUnwrap instanceof FlexibleType)) {
                throw new C0644w();
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            SimpleType simpleTypeM18435a = m18435a(flexibleType.getLowerBound());
            SimpleType simpleTypeM18435a2 = m18435a(flexibleType.getUpperBound());
            unwrappedTypeFlexibleType = (simpleTypeM18435a == flexibleType.getLowerBound() && simpleTypeM18435a2 == flexibleType.getUpperBound()) ? unwrappedTypeUnwrap : KotlinTypeFactory.flexibleType(simpleTypeM18435a, simpleTypeM18435a2);
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeFlexibleType, unwrappedTypeUnwrap, new C16863U(1, this, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 9));
    }
}
