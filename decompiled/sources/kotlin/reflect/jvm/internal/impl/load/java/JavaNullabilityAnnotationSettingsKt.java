package kotlin.reflect.jvm.internal.impl.load.java;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.C17305h;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a */
    public static final FqName f51740a;

    /* JADX INFO: renamed from: b */
    public static final FqName[] f51741b;

    /* JADX INFO: renamed from: c */
    public static final NullabilityAnnotationStatesImpl f51742c;

    /* JADX INFO: renamed from: d */
    public static final JavaNullabilityAnnotationsStatus f51743d;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f51740a = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        String strAsString = fqName3.asString();
        f51741b = new FqName[]{new FqName(AbstractC10763a.m11052j(strAsString, ".Nullable")), new FqName(AbstractC10763a.m11052j(strAsString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        C17309l c17309l = new C17309l(fqName5, companion.getDEFAULT());
        C17309l c17309l2 = new C17309l(new FqName("androidx.annotation"), companion.getDEFAULT());
        C17309l c17309l3 = new C17309l(new FqName("android.support.annotation"), companion.getDEFAULT());
        C17309l c17309l4 = new C17309l(new FqName("android.annotation"), companion.getDEFAULT());
        C17309l c17309l5 = new C17309l(new FqName("com.android.annotations"), companion.getDEFAULT());
        C17309l c17309l6 = new C17309l(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        C17309l c17309l7 = new C17309l(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        C17309l c17309l8 = new C17309l(fqName4, companion.getDEFAULT());
        C17309l c17309l9 = new C17309l(new FqName("javax.annotation"), companion.getDEFAULT());
        C17309l c17309l10 = new C17309l(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        C17309l c17309l11 = new C17309l(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        C17309l c17309l12 = new C17309l(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        C17309l c17309l13 = new C17309l(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        C17309l c17309l14 = new C17309l(new FqName("lombok"), companion.getDEFAULT());
        C17305h c17305h = new C17305h(2, 1, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f51742c = new NullabilityAnnotationStatesImpl(AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, c17309l10, c17309l11, c17309l12, c17309l13, c17309l14, new C17309l(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, c17305h, reportLevel2)), new C17309l(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new C17305h(2, 1, 0), reportLevel2)), new C17309l(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new C17305h(1, 8, 0), reportLevel2))));
        f51743d = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static final Jsr305Settings getDefaultJsr305Settings(C17305h configuredKotlinVersion) {
        ReportLevel reportLevelBefore;
        AbstractC16544l.m18094g(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f51743d;
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null) {
            C17305h sinceVersion = javaNullabilityAnnotationsStatus.getSinceVersion();
            sinceVersion.getClass();
            if (sinceVersion.f55132p0 - configuredKotlinVersion.f55132p0 <= 0) {
                reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelAfter();
            } else {
                reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelBefore();
            }
        } else {
            reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelBefore();
        }
        ReportLevel reportLevel = reportLevelBefore;
        return new Jsr305Settings(reportLevel, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevel), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(C17305h c17305h, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c17305h = C17305h.f55128q0;
        }
        return getDefaultJsr305Settings(c17305h);
    }

    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(ReportLevel globalReportLevel) {
        AbstractC16544l.m18094g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final ReportLevel getDefaultReportLevelForAnnotation(FqName annotationFqName) {
        AbstractC16544l.m18094g(annotationFqName, "annotationFqName");
        return getReportLevelForAnnotation$default(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return f51740a;
    }

    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f51741b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ReportLevel getReportLevelForAnnotation(FqName annotation, NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, C17305h configuredKotlinVersion) {
        AbstractC16544l.m18094g(annotation, "annotation");
        AbstractC16544l.m18094g(configuredReportLevels, "configuredReportLevels");
        AbstractC16544l.m18094g(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) f51742c.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null) {
            C17305h sinceVersion = javaNullabilityAnnotationsStatus.getSinceVersion();
            sinceVersion.getClass();
            if (sinceVersion.f55132p0 - configuredKotlinVersion.f55132p0 <= 0) {
                return javaNullabilityAnnotationsStatus.getReportLevelAfter();
            }
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, C17305h c17305h, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c17305h = new C17305h(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, c17305h);
    }
}
