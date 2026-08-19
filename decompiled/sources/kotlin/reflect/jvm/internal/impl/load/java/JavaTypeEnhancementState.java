package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p049Bm.InterfaceC1436k;
import p511Um.C7723b;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeEnhancementState {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final JavaTypeEnhancementState f51748d = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings$default(null, 1, null), C7723b.f24347Y);

    /* JADX INFO: renamed from: a */
    public final Jsr305Settings f51749a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f51750b;

    /* JADX INFO: renamed from: c */
    public final boolean f51751c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaTypeEnhancementState getDEFAULT() {
            return JavaTypeEnhancementState.f51748d;
        }
    }

    public JavaTypeEnhancementState(Jsr305Settings jsr305, InterfaceC1436k getReportLevelForAnnotation) {
        AbstractC16544l.m18094g(jsr305, "jsr305");
        AbstractC16544l.m18094g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f51749a = jsr305;
        this.f51750b = getReportLevelForAnnotation;
        this.f51751c = jsr305.isDisabled() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.f51751c;
    }

    public final InterfaceC1436k getGetReportLevelForAnnotation() {
        return this.f51750b;
    }

    public final Jsr305Settings getJsr305() {
        return this.f51749a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f51749a + ", getReportLevelForAnnotation=" + this.f51750b + ')';
    }
}
