package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p511Um.C7722a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f51716c;

    /* JADX INFO: renamed from: a */
    public final JavaTypeEnhancementState f51717a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f51718b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f51716c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        AbstractC16544l.m18094g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f51717a = javaTypeEnhancementState;
        this.f51718b = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final NullabilityQualifierWithMigrationStatus m18163a(InterfaceC1436k interfaceC1436k, Object obj) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18166d;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18166d2 = m18166d(obj, ((Boolean) interfaceC1436k.invoke(obj)).booleanValue());
        if (nullabilityQualifierWithMigrationStatusM18166d2 != null) {
            return nullabilityQualifierWithMigrationStatusM18166d2;
        }
        TAnnotation tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(obj);
        if (tannotationResolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel reportLevelM18167e = m18167e(obj);
        if (reportLevelM18167e == null) {
            reportLevelM18167e = this.f51717a.getJsr305().getGlobalLevel();
        }
        if (reportLevelM18167e.isIgnore() || (nullabilityQualifierWithMigrationStatusM18166d = m18166d(tannotationResolveTypeQualifierAnnotation, ((Boolean) interfaceC1436k.invoke(tannotationResolveTypeQualifierAnnotation)).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusM18166d, null, reportLevelM18167e.isWarning(), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final Object m18164b(Object obj, FqName fqName) {
        for (Object obj2 : getMetaAnnotations(obj)) {
            if (AbstractC16544l.m18089b(getFqName(obj2), fqName)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18165c(Object obj, FqName fqName) {
        Iterable metaAnnotations = getMetaAnnotations(obj);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (AbstractC16544l.m18089b(getFqName(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NullabilityQualifierWithMigrationStatus m18166d(Object obj, boolean z6) {
        NullabilityQualifier nullabilityQualifier;
        FqName fqName = getFqName(obj);
        if (fqName == null) {
            return null;
        }
        ReportLevel reportLevel = (ReportLevel) this.f51717a.getGetReportLevelForAnnotation().invoke(fqName);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (JvmAnnotationNamesKt.getFORCE_FLEXIBILITY_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!fqName.equals(JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION_FQ_NAME())) {
                return null;
            }
            String str = (String) AbstractC17680n.m19342R(enumArguments(obj, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                            break;
                        }
                        return null;
                    case 1933739535:
                        break;
                    default:
                        return null;
                }
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, reportLevel.isWarning() || z6);
    }

    /* JADX INFO: renamed from: e */
    public final ReportLevel m18167e(Object obj) {
        Iterable iterableEnumArguments;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f51717a;
        ReportLevel reportLevel = javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objM18164b = m18164b(obj, JvmAnnotationNamesKt.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (objM18164b == null || (iterableEnumArguments = enumArguments(objM18164b, false)) == null || (str = (String) AbstractC17680n.m19342R(iterableEnumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    public abstract Iterable enumArguments(Object obj, boolean z6);

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;
        JavaDefaultQualifiers javaDefaultQualifiers;
        ReportLevel reportLevelM18167e;
        JavaDefaultQualifiers javaDefaultQualifiersCopy$default;
        Object objM18164b;
        Object next;
        C17309l c17309l;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18163a;
        AbstractC16544l.m18094g(annotations, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState = this.f51717a;
        if (javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            return javaTypeQualifiersByElementType;
        }
        ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (true) {
            JavaDefaultQualifiers javaDefaultQualifiers2 = null;
            if (!it.hasNext()) {
                break;
            }
            TAnnotation next2 = it.next();
            if (javaTypeEnhancementState.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = JavaDefaultQualifiersKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(next2))) == null) {
                javaDefaultQualifiersCopy$default = null;
            } else {
                FqName fqName = getFqName(next2);
                if (fqName == null || !JavaDefaultQualifiersKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
                    reportLevelM18167e = m18167e(next2);
                    if (reportLevelM18167e == null) {
                        reportLevelM18167e = javaTypeEnhancementState.getJsr305().getGlobalLevel();
                    }
                } else {
                    reportLevelM18167e = (ReportLevel) javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
                }
                if (reportLevelM18167e == ReportLevel.IGNORE) {
                    reportLevelM18167e = null;
                }
                if (reportLevelM18167e == null) {
                    javaDefaultQualifiersCopy$default = null;
                } else {
                    javaDefaultQualifiersCopy$default = JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, reportLevelM18167e.isWarning(), 1, null), null, false, 6, null);
                }
            }
            if (javaDefaultQualifiersCopy$default != null) {
                javaDefaultQualifiers2 = javaDefaultQualifiersCopy$default;
            } else {
                if (javaTypeEnhancementState.getJsr305().isDisabled() || (objM18164b = m18164b(next2, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME())) == null) {
                    c17309l = null;
                } else {
                    Iterator it2 = getMetaAnnotations(next2).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (resolveTypeQualifierAnnotation(next) == null);
                    if (next == null) {
                        c17309l = null;
                    } else {
                        Iterable iterableEnumArguments = enumArguments(objM18164b, true);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it3 = iterableEnumArguments.iterator();
                        while (it3.hasNext()) {
                            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f51716c.get((String) it3.next());
                            if (annotationQualifierApplicabilityType != null) {
                                linkedHashSet.add(annotationQualifierApplicabilityType);
                            }
                        }
                        if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                            linkedHashSet = AbstractC17665J.m19266f(AbstractC17665J.m19263c(AbstractC17678l.m19293P(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                        }
                        c17309l = new C17309l(next, linkedHashSet);
                    }
                }
                if (c17309l != null) {
                    Set set = (Set) c17309l.f55137Z;
                    ReportLevel reportLevelM18167e2 = m18167e(next2);
                    Object obj = c17309l.f55136Y;
                    if (reportLevelM18167e2 == null && (reportLevelM18167e2 = m18167e(obj)) == null) {
                        reportLevelM18167e2 = javaTypeEnhancementState.getJsr305().getGlobalLevel();
                    }
                    if (!reportLevelM18167e2.isIgnore() && (nullabilityQualifierWithMigrationStatusM18163a = m18163a(C7722a.f24338Z, obj)) != null) {
                        javaDefaultQualifiers2 = new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusM18163a, null, reportLevelM18167e2.isWarning(), 1, null), set, false, 4, null);
                    }
                }
            }
            if (javaDefaultQualifiers2 != null) {
                arrayList.add(javaDefaultQualifiers2);
            }
        }
        if (arrayList.isEmpty()) {
            return javaTypeQualifiersByElementType;
        }
        EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        for (JavaDefaultQualifiers javaDefaultQualifiers3 : arrayList) {
            for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 : javaDefaultQualifiers3.getQualifierApplicabilityTypes()) {
                if (enumMap.containsKey(annotationQualifierApplicabilityType2) && isK2()) {
                    JavaDefaultQualifiers javaDefaultQualifiers4 = (JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType2);
                    if (javaDefaultQualifiers4 != null) {
                        NullabilityQualifierWithMigrationStatus nullabilityQualifier = javaDefaultQualifiers4.getNullabilityQualifier();
                        NullabilityQualifierWithMigrationStatus nullabilityQualifier2 = javaDefaultQualifiers3.getNullabilityQualifier();
                        if (!AbstractC16544l.m18089b(nullabilityQualifier2, nullabilityQualifier) && (!nullabilityQualifier2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly())) {
                            javaDefaultQualifiers4 = (nullabilityQualifier2.isForWarningOnly() || !nullabilityQualifier.isForWarningOnly()) ? null : javaDefaultQualifiers3;
                        }
                        enumMap.put(annotationQualifierApplicabilityType2, javaDefaultQualifiers4);
                    }
                } else {
                    enumMap.put(annotationQualifierApplicabilityType2, javaDefaultQualifiers3);
                }
            }
        }
        EnumMap enumMap2 = (javaTypeQualifiersByElementType == null || (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) defaultQualifiers);
        boolean z6 = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = (AnnotationQualifierApplicabilityType) entry.getKey();
            JavaDefaultQualifiers javaDefaultQualifiers5 = (JavaDefaultQualifiers) entry.getValue();
            if (javaDefaultQualifiers5 != null) {
                enumMap2.put(annotationQualifierApplicabilityType3, javaDefaultQualifiers5);
                z6 = true;
            }
        }
        return !z6 ? javaTypeQualifiersByElementType : new JavaTypeQualifiersByElementType(enumMap2);
    }

    public final MutabilityQualifier extractMutability(Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        AbstractC16544l.m18094g(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqName = getFqName(it.next());
            if (AbstractC17680n.m19333J(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (AbstractC17680n.m19333J(JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    public final NullabilityQualifierWithMigrationStatus extractNullability(Iterable<? extends TAnnotation> annotations, InterfaceC1436k forceWarning) {
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (it.hasNext()) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM18163a = m18163a(forceWarning, it.next());
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (nullabilityQualifierWithMigrationStatusM18163a != null && !nullabilityQualifierWithMigrationStatusM18163a.equals(nullabilityQualifierWithMigrationStatus) && (!nullabilityQualifierWithMigrationStatusM18163a.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                    if (nullabilityQualifierWithMigrationStatusM18163a.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusM18163a;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    public abstract FqName getFqName(Object obj);

    public abstract Object getKey(Object obj);

    public abstract Iterable getMetaAnnotations(Object obj);

    public abstract boolean isK2();

    public final boolean isTypeUseAnnotation(TAnnotation annotation) {
        AbstractC16544l.m18094g(annotation, "annotation");
        Object objM18164b = m18164b(annotation, StandardNames.FqNames.target);
        if (objM18164b == null) {
            return false;
        }
        Iterable iterableEnumArguments = enumArguments(objM18164b, false);
        if ((iterableEnumArguments instanceof Collection) && ((Collection) iterableEnumArguments).isEmpty()) {
            return false;
        }
        Iterator it = iterableEnumArguments.iterator();
        while (it.hasNext()) {
            if (AbstractC16544l.m18089b((String) it.next(), CredentialProviderBaseController.TYPE_TAG)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TAnnotation resolveTypeQualifierAnnotation(TAnnotation annotation) {
        TAnnotation tannotation;
        AbstractC16544l.m18094g(annotation, "annotation");
        if (this.f51717a.getJsr305().isDisabled()) {
            return null;
        }
        if (AbstractC17680n.m19333J(JvmAnnotationNamesKt.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(annotation)) || m18165c(annotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return annotation;
        }
        if (!m18165c(annotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f51718b;
        Object key = getKey(annotation);
        TAnnotation tannotation2 = (TAnnotation) concurrentHashMap.get(key);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator it = getMetaAnnotations(annotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotation = null;
                break;
            }
            tannotation = (TAnnotation) resolveTypeQualifierAnnotation(it.next());
        } while (tannotation == null);
        if (tannotation == null) {
            return null;
        }
        TAnnotation tannotation3 = (TAnnotation) concurrentHashMap.putIfAbsent(key, tannotation);
        return tannotation3 == null ? tannotation : tannotation3;
    }
}
