package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifierWithMigrationStatus f51731a;

    /* JADX INFO: renamed from: b */
    public final Collection f51732b;

    /* JADX INFO: renamed from: c */
    public final boolean f51733c;

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z6) {
        AbstractC16544l.m18094g(nullabilityQualifier, "nullabilityQualifier");
        AbstractC16544l.m18094g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f51731a = nullabilityQualifier;
        this.f51732b = qualifierApplicabilityTypes;
        this.f51733c = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f51731a;
        }
        if ((i10 & 2) != 0) {
            collection = javaDefaultQualifiers.f51732b;
        }
        if ((i10 & 4) != 0) {
            z6 = javaDefaultQualifiers.f51733c;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z6);
    }

    public final JavaDefaultQualifiers copy(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z6) {
        AbstractC16544l.m18094g(nullabilityQualifier, "nullabilityQualifier");
        AbstractC16544l.m18094g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifier, qualifierApplicabilityTypes, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return AbstractC16544l.m18089b(this.f51731a, javaDefaultQualifiers.f51731a) && AbstractC16544l.m18089b(this.f51732b, javaDefaultQualifiers.f51732b) && this.f51733c == javaDefaultQualifiers.f51733c;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f51733c;
    }

    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.f51731a;
    }

    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.f51732b;
    }

    public int hashCode() {
        return ((this.f51732b.hashCode() + (this.f51731a.hashCode() * 31)) * 31) + (this.f51733c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f51731a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f51732b);
        sb2.append(", definitelyNotNull=");
        return AbstractC3794B0.m4499x(sb2, this.f51733c, ')');
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i10 & 4) != 0 ? nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL : z6);
    }
}
