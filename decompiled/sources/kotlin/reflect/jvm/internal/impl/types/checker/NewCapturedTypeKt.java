package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17309l;
import p138F8.vJO.anhfj;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedTypeKt {
    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    public static final SimpleType captureFromArguments(SimpleType type, CaptureStatus status) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(status, "status");
        if (type.getArguments().size() != type.getConstructor().getParameters().size()) {
            arrayList = null;
        } else {
            List<TypeProjection> arguments = type.getArguments();
            List<TypeProjection> list = arguments;
            if ((list instanceof Collection) && list.isEmpty()) {
                arrayList = null;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                        List<TypeParameterDescriptor> parameters = type.getConstructor().getParameters();
                        AbstractC16544l.m18093f(parameters, "getParameters(...)");
                        ArrayList<C17309l> arrayListM19334J0 = AbstractC17680n.m19334J0(list, parameters);
                        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayListM19334J0, 10));
                        for (C17309l c17309l : arrayListM19334J0) {
                            TypeProjection typeProjectionAsTypeProjection = (TypeProjection) c17309l.f55136Y;
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) c17309l.f55137Z;
                            if (typeProjectionAsTypeProjection.getProjectionKind() != Variance.INVARIANT) {
                                UnwrappedType unwrappedTypeUnwrap = (typeProjectionAsTypeProjection.isStarProjection() || typeProjectionAsTypeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjectionAsTypeProjection.getType().unwrap();
                                AbstractC16544l.m18091d(typeParameterDescriptor);
                                typeProjectionAsTypeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(status, unwrappedTypeUnwrap, typeProjectionAsTypeProjection, typeParameterDescriptor));
                            }
                            arrayList2.add(typeProjectionAsTypeProjection);
                        }
                        TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create(type.getConstructor(), arrayList2).buildSubstitutor();
                        int size = arguments.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            TypeProjection typeProjection = arguments.get(i10);
                            TypeProjection typeProjection2 = (TypeProjection) arrayList2.get(i10);
                            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                List<KotlinType> upperBounds = type.getConstructor().getParameters().get(i10).getUpperBounds();
                                AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it2 = upperBounds.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) it2.next(), Variance.INVARIANT).unwrap()));
                                }
                                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection.getType().unwrap()));
                                }
                                KotlinType type2 = typeProjection2.getType();
                                AbstractC16544l.m18092e(type2, anhfj.hrBKkfF);
                                ((NewCapturedType) type2).getConstructor().initializeSupertypes(arrayList3);
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
                arrayList = null;
            }
        }
        if (arrayList != null) {
            return KotlinTypeFactory.simpleType$default(type.getAttributes(), type.getConstructor(), arrayList, type.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        }
        return null;
    }
}
