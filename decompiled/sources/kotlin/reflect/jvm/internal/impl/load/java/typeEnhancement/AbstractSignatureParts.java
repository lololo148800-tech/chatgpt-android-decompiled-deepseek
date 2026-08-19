package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p007A5.C0372g;
import p049Bm.InterfaceC1436k;
import p648an.C10753a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSignatureParts<TAnnotation> {
    /* JADX INFO: renamed from: a */
    public static void m18226a(Object obj, ArrayList arrayList, C0372g c0372g) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c0372g.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m18226a(it.next(), arrayList, c0372g);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:3: B:46:0x00b3->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final NullabilityQualifierWithMigrationStatus m18227b(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> arrayList;
        List<KotlinTypeMarker> list;
        Iterator<T> it;
        NullabilityQualifier nullabilityQualifier;
        boolean z6;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        boolean z10 = list2 instanceof Collection;
        if (!z10 || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!typeSystem.isError((KotlinTypeMarker) it2.next())) {
                    if (!z10 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (m18228d((KotlinTypeMarker) it3.next()) != null) {
                                    arrayList = upperBounds;
                                }
                            }
                            list = arrayList;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                    break;
                                }
                                if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                    nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                    break;
                                }
                            }
                            if (arrayList != upperBounds) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z6);
                        }
                    }
                    if (!z10 || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it4.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it5.next());
                                    if (enhancedForWarnings != null) {
                                        arrayList.add(enhancedForWarnings);
                                    }
                                }
                                list = arrayList;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != upperBounds) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z6);
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract NullabilityQualifierWithMigrationStatus mo11039c(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers);

    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1436k computeIndexedQualifiers(KotlinTypeMarker kotlinTypeMarker, Iterable<? extends KotlinTypeMarker> overrides, TypeEnhancementInfo typeEnhancementInfo, boolean z6) {
        int size;
        boolean z10;
        KotlinTypeMarker kotlinTypeMarker2;
        Iterable<TAnnotation> iterableM19359i0;
        TypeParameterMarker typeParameterClassifier;
        boolean z11;
        MutabilityQualifier mutabilityQualifierExtractMutability;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability;
        AnnotationQualifierApplicabilityType containerApplicabilityType;
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementType;
        JavaDefaultQualifiers javaDefaultQualifiers;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18227b;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusMo11039c;
        NullabilityQualifier qualifier;
        boolean z12;
        boolean z13;
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18227b2;
        NullabilityQualifier qualifier2;
        JavaTypeQualifiers javaTypeQualifiers;
        boolean z14;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        Object javaTypeQualifiers2;
        KotlinTypeMarker kotlinTypeMarker3;
        NullabilityQualifier nullabilityQualifierM18228d;
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        AbstractC16544l.m18094g(overrides, "overrides");
        ArrayList arrayListM18229e = m18229e(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(m18229e(it.next()));
        }
        boolean z15 = true;
        if (getForceOnlyHeadTypeConstructor()) {
            size = 1;
        } else {
            if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!isEqual(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = arrayListM18229e.size();
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i10 = 0;
        while (i10 < size) {
            C10753a c10753a = (C10753a) arrayListM18229e.get(i10);
            KotlinTypeMarker kotlinTypeMarker4 = c10753a.f31955a;
            TypeParameterMarker typeParameterMarker = c10753a.f31957c;
            if (kotlinTypeMarker4 == null) {
                if ((typeParameterMarker != null ? getTypeSystem().getVariance(typeParameterMarker) : null) == TypeVariance.IN) {
                    javaTypeQualifiers = JavaTypeQualifiers.Companion.getNONE();
                } else {
                    if (typeParameterMarker == null) {
                        z10 = z15;
                    } else {
                        z10 = false;
                    }
                    kotlinTypeMarker2 = c10753a.f31955a;
                    if (kotlinTypeMarker2 != null || (iterableM19359i0 = getAnnotations(kotlinTypeMarker2)) == null) {
                        iterableM19359i0 = C17689w.f56480Y;
                    }
                    TypeSystemContext typeSystem = getTypeSystem();
                    if (kotlinTypeMarker2 != null || (typeConstructorMarkerTypeConstructor = typeSystem.typeConstructor(kotlinTypeMarker2)) == null) {
                        typeParameterClassifier = null;
                    } else {
                        typeParameterClassifier = typeSystem.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
                    }
                    if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        z11 = z15;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        if (z11 && getEnableImprovementsInStrictMode() && kotlinTypeMarker2 != null && isArrayOrPrimitiveArray(kotlinTypeMarker2) == z15) {
                            Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                            ArrayList arrayList2 = new ArrayList();
                            for (TAnnotation tannotation : containerAnnotations) {
                                if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                                    arrayList2.add(tannotation);
                                }
                            }
                            iterableM19359i0 = AbstractC17680n.m19361k0(iterableM19359i0, arrayList2);
                        } else {
                            iterableM19359i0 = AbstractC17680n.m19359i0(getContainerAnnotations(), iterableM19359i0);
                        }
                    }
                    mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(iterableM19359i0);
                    nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability(iterableM19359i0, new C0372g(this, 4, c10753a));
                    if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                        NullabilityQualifier qualifier3 = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
                        if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL || typeParameterClassifier == null) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        javaTypeQualifiers = new JavaTypeQualifiers(qualifier3, mutabilityQualifierExtractMutability, z14, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
                    } else {
                        if (!z10 || z11) {
                            containerApplicabilityType = getContainerApplicabilityType();
                        } else {
                            containerApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                        }
                        javaTypeQualifiersByElementType = c10753a.f31956b;
                        if (javaTypeQualifiersByElementType != null) {
                            javaDefaultQualifiers = javaTypeQualifiersByElementType.get(containerApplicabilityType);
                        } else {
                            javaDefaultQualifiers = null;
                        }
                        if (typeParameterClassifier != null) {
                            nullabilityQualifierWithMigrationStatusM18227b = m18227b(typeParameterClassifier);
                        } else {
                            nullabilityQualifierWithMigrationStatusM18227b = null;
                        }
                        nullabilityQualifierWithMigrationStatusMo11039c = mo11039c(nullabilityQualifierWithMigrationStatusM18227b, javaDefaultQualifiers);
                        if (nullabilityQualifierWithMigrationStatusM18227b != null) {
                            qualifier = nullabilityQualifierWithMigrationStatusM18227b.getQualifier();
                        } else {
                            qualifier = null;
                        }
                        if (qualifier == NullabilityQualifier.NOT_NULL && (typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull())) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (typeParameterMarker != null || (nullabilityQualifierWithMigrationStatusM18227b2 = m18227b(typeParameterMarker)) == null) {
                            z13 = false;
                            nullabilityQualifier = null;
                            nullabilityQualifierWithMigrationStatusM18227b2 = null;
                        } else if (nullabilityQualifierWithMigrationStatusM18227b2.getQualifier() == NullabilityQualifier.NULLABLE) {
                            z13 = false;
                            nullabilityQualifier = null;
                            nullabilityQualifierWithMigrationStatusM18227b2 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusM18227b2, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                        } else {
                            z13 = false;
                            nullabilityQualifier = null;
                        }
                        if (nullabilityQualifierWithMigrationStatusM18227b2 != null && (nullabilityQualifierWithMigrationStatusMo11039c == null || ((!nullabilityQualifierWithMigrationStatusM18227b2.isForWarningOnly() || nullabilityQualifierWithMigrationStatusMo11039c.isForWarningOnly()) && ((!nullabilityQualifierWithMigrationStatusM18227b2.isForWarningOnly() && nullabilityQualifierWithMigrationStatusMo11039c.isForWarningOnly()) || (nullabilityQualifierWithMigrationStatusM18227b2.getQualifier().compareTo(nullabilityQualifierWithMigrationStatusMo11039c.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatusM18227b2.getQualifier().compareTo(nullabilityQualifierWithMigrationStatusMo11039c.getQualifier()) > 0))))) {
                            nullabilityQualifierWithMigrationStatusMo11039c = nullabilityQualifierWithMigrationStatusM18227b2;
                        }
                        if (nullabilityQualifierWithMigrationStatusMo11039c != null) {
                            qualifier2 = nullabilityQualifierWithMigrationStatusMo11039c.getQualifier();
                        } else {
                            qualifier2 = nullabilityQualifier;
                        }
                        javaTypeQualifiers = new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z12, (nullabilityQualifierWithMigrationStatusMo11039c == null && nullabilityQualifierWithMigrationStatusMo11039c.isForWarningOnly()) ? true : z13);
                    }
                }
                nullabilityQualifier = null;
            } else {
                if (typeParameterMarker == null) {
                    z10 = z15;
                } else {
                    z10 = false;
                }
                kotlinTypeMarker2 = c10753a.f31955a;
                if (kotlinTypeMarker2 != null) {
                    iterableM19359i0 = C17689w.f56480Y;
                } else {
                    iterableM19359i0 = C17689w.f56480Y;
                }
                TypeSystemContext typeSystem2 = getTypeSystem();
                if (kotlinTypeMarker2 != null) {
                    typeParameterClassifier = null;
                } else {
                    typeParameterClassifier = null;
                }
                if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                    z11 = z15;
                } else {
                    z11 = false;
                }
                if (z10) {
                    if (z11) {
                        iterableM19359i0 = AbstractC17680n.m19359i0(getContainerAnnotations(), iterableM19359i0);
                    } else {
                        iterableM19359i0 = AbstractC17680n.m19359i0(getContainerAnnotations(), iterableM19359i0);
                    }
                }
                mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(iterableM19359i0);
                nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability(iterableM19359i0, new C0372g(this, 4, c10753a));
                if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                    NullabilityQualifier qualifier4 = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
                    if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    javaTypeQualifiers = new JavaTypeQualifiers(qualifier4, mutabilityQualifierExtractMutability, z14, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
                    nullabilityQualifier = null;
                } else {
                    if (z10) {
                        containerApplicabilityType = getContainerApplicabilityType();
                    } else {
                        containerApplicabilityType = getContainerApplicabilityType();
                    }
                    javaTypeQualifiersByElementType = c10753a.f31956b;
                    if (javaTypeQualifiersByElementType != null) {
                        javaDefaultQualifiers = javaTypeQualifiersByElementType.get(containerApplicabilityType);
                    } else {
                        javaDefaultQualifiers = null;
                    }
                    if (typeParameterClassifier != null) {
                        nullabilityQualifierWithMigrationStatusM18227b = m18227b(typeParameterClassifier);
                    } else {
                        nullabilityQualifierWithMigrationStatusM18227b = null;
                    }
                    nullabilityQualifierWithMigrationStatusMo11039c = mo11039c(nullabilityQualifierWithMigrationStatusM18227b, javaDefaultQualifiers);
                    if (nullabilityQualifierWithMigrationStatusM18227b != null) {
                        qualifier = nullabilityQualifierWithMigrationStatusM18227b.getQualifier();
                    } else {
                        qualifier = null;
                    }
                    if (qualifier == NullabilityQualifier.NOT_NULL) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (typeParameterMarker != null) {
                        z13 = false;
                        nullabilityQualifier = null;
                        nullabilityQualifierWithMigrationStatusM18227b2 = null;
                    } else {
                        z13 = false;
                        nullabilityQualifier = null;
                        nullabilityQualifierWithMigrationStatusM18227b2 = null;
                    }
                    if (nullabilityQualifierWithMigrationStatusM18227b2 != null) {
                        nullabilityQualifierWithMigrationStatusMo11039c = nullabilityQualifierWithMigrationStatusM18227b2;
                    }
                    if (nullabilityQualifierWithMigrationStatusMo11039c != null) {
                        qualifier2 = nullabilityQualifierWithMigrationStatusMo11039c.getQualifier();
                    } else {
                        qualifier2 = nullabilityQualifier;
                    }
                    javaTypeQualifiers = new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z12, (nullabilityQualifierWithMigrationStatusMo11039c == null && nullabilityQualifierWithMigrationStatusMo11039c.isForWarningOnly()) ? true : z13);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C10753a c10753a2 = (C10753a) AbstractC17680n.m19344T(i10, (List) it3.next());
                if (c10753a2 == null || (kotlinTypeMarker3 = c10753a2.f31955a) == null) {
                    javaTypeQualifiers2 = nullabilityQualifier;
                } else {
                    NullabilityQualifier nullabilityQualifierM18228d2 = m18228d(kotlinTypeMarker3);
                    if (nullabilityQualifierM18228d2 == null) {
                        KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker3);
                        nullabilityQualifierM18228d = enhancedForWarnings != null ? m18228d(enhancedForWarnings) : nullabilityQualifier;
                    } else {
                        nullabilityQualifierM18228d = nullabilityQualifierM18228d2;
                    }
                    TypeSystemContext typeSystem3 = getTypeSystem();
                    JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                    javaTypeQualifiers2 = new JavaTypeQualifiers(nullabilityQualifierM18228d, javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem3.lowerBoundIfFlexible(kotlinTypeMarker3))) ? MutabilityQualifier.READ_ONLY : javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem3.upperBoundIfFlexible(kotlinTypeMarker3))) ? MutabilityQualifier.MUTABLE : nullabilityQualifier, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker3) || isNotNullTypeParameterCompat(kotlinTypeMarker3), nullabilityQualifierM18228d != nullabilityQualifierM18228d2);
                }
                if (javaTypeQualifiers2 != null) {
                    arrayList3.add(javaTypeQualifiers2);
                }
            }
            javaTypeQualifiersArr[i10] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiers, arrayList3, i10 == 0 && isCovariant(), i10 == 0 && getContainerIsVarargParameter(), z6);
            i10++;
            z15 = true;
        }
        return new C0372g(typeEnhancementInfo, 5, javaTypeQualifiersArr);
    }

    /* JADX INFO: renamed from: d */
    public final NullabilityQualifier m18228d(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m18229e(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        C10753a c10753a = new C10753a(kotlinTypeMarker, getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(getContainerDefaultTypeQualifiers(), getAnnotations(kotlinTypeMarker)), null);
        C0372g c0372g = new C0372g(this, 6, typeSystem);
        ArrayList arrayList = new ArrayList(1);
        m18226a(c10753a, arrayList, c0372g);
        return arrayList;
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, "<this>");
        return false;
    }
}
