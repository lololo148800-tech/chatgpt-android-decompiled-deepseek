package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p025An.C0644w;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType intersectTypes(Collection<? extends UnwrappedType> types) {
        SimpleType lowerBound;
        AbstractC16544l.m18094g(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (UnwrappedType) AbstractC17680n.m19364n0(types);
        }
        Collection<? extends UnwrappedType> collection = types;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        boolean z6 = false;
        boolean z10 = false;
        for (UnwrappedType unwrappedType : collection) {
            z6 = z6 || KotlinTypeKt.isError(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                lowerBound = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    throw new C0644w();
                }
                if (DynamicTypesKt.isDynamic(unwrappedType)) {
                    return unwrappedType;
                }
                lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                z10 = true;
            }
            arrayList.add(lowerBound);
        }
        if (z6) {
            return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z10) {
            return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.upperIfFlexible((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
        return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
    }
}
