package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p003A1.C0295v;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p973qn.EnumC18784f;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersector {
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* JADX INFO: renamed from: a */
    public static ArrayList m18437a(AbstractCollection abstractCollection, InterfaceC1439n interfaceC1439n) {
        ArrayList<SimpleType> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        AbstractC16544l.m18093f(it, "iterator(...)");
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                for (SimpleType simpleType2 : arrayList) {
                    if (simpleType2 != simpleType) {
                        AbstractC16544l.m18091d(simpleType2);
                        AbstractC16544l.m18091d(simpleType);
                        if (((Boolean) interfaceC1439n.invoke(simpleType2, simpleType)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean access$isStrictSupertype(TypeIntersector typeIntersector, KotlinType kotlinType, KotlinType kotlinType2) {
        typeIntersector.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    public final SimpleType intersectTypes$descriptors(List<? extends SimpleType> types) {
        SimpleType simpleTypeCreateType;
        AbstractC16544l.m18094g(types, "types");
        types.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : types) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                Collection<KotlinType> collection = supertypes;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
                for (KotlinType kotlinType : collection) {
                    AbstractC16544l.m18091d(kotlinType);
                    SimpleType simpleTypeUpperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        simpleTypeUpperIfFlexible = simpleTypeUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(simpleTypeUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        EnumC18784f enumC18784fMo20052a = EnumC18784f.f59687Y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            enumC18784fMo20052a = enumC18784fMo20052a.mo20052a((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default : arrayList) {
            if (enumC18784fMo20052a == EnumC18784f.f59690p0) {
                if (simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default instanceof NewCapturedType) {
                    simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
                }
                simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default, false, 1, null);
            }
            linkedHashSet.add(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
        }
        List<? extends SimpleType> list = types;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SimpleType) it2.next()).getAttributes());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it3.next());
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            simpleTypeCreateType = (SimpleType) AbstractC17680n.m19364n0(linkedHashSet);
        } else {
            ArrayList arrayListM18437a = m18437a(linkedHashSet, new C0295v(2, this, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 13));
            arrayListM18437a.isEmpty();
            SimpleType simpleTypeFindIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(arrayListM18437a);
            if (simpleTypeFindIntersectionType != null) {
                simpleTypeCreateType = simpleTypeFindIntersectionType;
            } else {
                ArrayList arrayListM18437a2 = m18437a(arrayListM18437a, new C0295v(2, NewKotlinTypeChecker.Companion.getDefault(), NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 14));
                arrayListM18437a2.isEmpty();
                simpleTypeCreateType = arrayListM18437a2.size() < 2 ? (SimpleType) AbstractC17680n.m19364n0(arrayListM18437a2) : new IntersectionTypeConstructor(linkedHashSet).createType();
            }
        }
        return simpleTypeCreateType.replaceAttributes(typeAttributes);
    }
}
