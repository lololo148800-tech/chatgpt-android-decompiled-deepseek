package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mm.C17305h;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final JavaNullabilityAnnotationsStatus f51744d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a */
    public final ReportLevel f51745a;

    /* JADX INFO: renamed from: b */
    public final C17305h f51746b;

    /* JADX INFO: renamed from: c */
    public final ReportLevel f51747c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.f51744d;
        }
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevelBefore, C17305h c17305h, ReportLevel reportLevelAfter) {
        AbstractC16544l.m18094g(reportLevelBefore, "reportLevelBefore");
        AbstractC16544l.m18094g(reportLevelAfter, "reportLevelAfter");
        this.f51745a = reportLevelBefore;
        this.f51746b = c17305h;
        this.f51747c = reportLevelAfter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f51745a == javaNullabilityAnnotationsStatus.f51745a && AbstractC16544l.m18089b(this.f51746b, javaNullabilityAnnotationsStatus.f51746b) && this.f51747c == javaNullabilityAnnotationsStatus.f51747c;
    }

    public final ReportLevel getReportLevelAfter() {
        return this.f51747c;
    }

    public final ReportLevel getReportLevelBefore() {
        return this.f51745a;
    }

    public final C17305h getSinceVersion() {
        return this.f51746b;
    }

    public int hashCode() {
        int iHashCode = this.f51745a.hashCode() * 31;
        C17305h c17305h = this.f51746b;
        return this.f51747c.hashCode() + ((iHashCode + (c17305h == null ? 0 : c17305h.f55132p0)) * 31);
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f51745a + ", sinceVersion=" + this.f51746b + ", reportLevelAfter=" + this.f51747c + ')';
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, C17305h c17305h, ReportLevel reportLevel2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? new C17305h(1, 0, 0) : c17305h, (i10 & 4) != 0 ? reportLevel : reportLevel2);
    }
}
