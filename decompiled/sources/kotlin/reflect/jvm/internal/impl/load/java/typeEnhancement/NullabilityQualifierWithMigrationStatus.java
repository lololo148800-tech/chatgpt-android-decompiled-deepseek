package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f51987a;

    /* JADX INFO: renamed from: b */
    public final boolean f51988b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z6) {
        AbstractC16544l.m18094g(qualifier, "qualifier");
        this.f51987a = qualifier;
        this.f51988b = z6;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f51987a;
        }
        if ((i10 & 2) != 0) {
            z6 = nullabilityQualifierWithMigrationStatus.f51988b;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z6);
    }

    public final NullabilityQualifierWithMigrationStatus copy(NullabilityQualifier qualifier, boolean z6) {
        AbstractC16544l.m18094g(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f51987a == nullabilityQualifierWithMigrationStatus.f51987a && this.f51988b == nullabilityQualifierWithMigrationStatus.f51988b;
    }

    public final NullabilityQualifier getQualifier() {
        return this.f51987a;
    }

    public int hashCode() {
        return (this.f51987a.hashCode() * 31) + (this.f51988b ? 1231 : 1237);
    }

    public final boolean isForWarningOnly() {
        return this.f51988b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f51987a);
        sb2.append(", isForWarningOnly=");
        return AbstractC3794B0.m4499x(sb2, this.f51988b, ')');
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z6);
    }
}
