package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a */
    public final ReportLevel f51753a;

    /* JADX INFO: renamed from: b */
    public final ReportLevel f51754b;

    /* JADX INFO: renamed from: c */
    public final Map f51755c;

    /* JADX INFO: renamed from: d */
    public final boolean f51756d;

    public Jsr305Settings(ReportLevel globalLevel, ReportLevel reportLevel, Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        AbstractC16544l.m18094g(globalLevel, "globalLevel");
        AbstractC16544l.m18094g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f51753a = globalLevel;
        this.f51754b = reportLevel;
        this.f51755c = userDefinedLevelForSpecificAnnotation;
        AbstractC9227W.m9800c(new C5140G(this, 15));
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f51756d = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f51753a == jsr305Settings.f51753a && this.f51754b == jsr305Settings.f51754b && AbstractC16544l.m18089b(this.f51755c, jsr305Settings.f51755c);
    }

    public final ReportLevel getGlobalLevel() {
        return this.f51753a;
    }

    public final ReportLevel getMigrationLevel() {
        return this.f51754b;
    }

    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.f51755c;
    }

    public int hashCode() {
        int iHashCode = this.f51753a.hashCode() * 31;
        ReportLevel reportLevel = this.f51754b;
        return this.f51755c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.f51756d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Jsr305Settings(globalLevel=");
        sb2.append(this.f51753a);
        sb2.append(", migrationLevel=");
        sb2.append(this.f51754b);
        sb2.append(", userDefinedLevelForSpecificAnnotation=");
        return AbstractC12107L1.m13827r(sb2, this.f51755c, ')');
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? null : reportLevel2, (i10 & 4) != 0 ? C17690x.f56481Y : map);
    }
}
