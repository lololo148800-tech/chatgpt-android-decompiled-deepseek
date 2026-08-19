package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final JavaTypeQualifiers f51979e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f51980a;

    /* JADX INFO: renamed from: b */
    public final MutabilityQualifier f51981b;

    /* JADX INFO: renamed from: c */
    public final boolean f51982c;

    /* JADX INFO: renamed from: d */
    public final boolean f51983d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.f51979e;
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z6, boolean z10) {
        this.f51980a = nullabilityQualifier;
        this.f51981b = mutabilityQualifier;
        this.f51982c = z6;
        this.f51983d = z10;
    }

    public static /* synthetic */ JavaTypeQualifiers copy$default(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f51980a;
        }
        if ((i10 & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f51981b;
        }
        if ((i10 & 4) != 0) {
            z6 = javaTypeQualifiers.f51982c;
        }
        if ((i10 & 8) != 0) {
            z10 = javaTypeQualifiers.f51983d;
        }
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z6, z10);
    }

    public final JavaTypeQualifiers copy(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z6, boolean z10) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z6, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f51980a == javaTypeQualifiers.f51980a && this.f51981b == javaTypeQualifiers.f51981b && this.f51982c == javaTypeQualifiers.f51982c && this.f51983d == javaTypeQualifiers.f51983d;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f51982c;
    }

    public final MutabilityQualifier getMutability() {
        return this.f51981b;
    }

    public final NullabilityQualifier getNullability() {
        return this.f51980a;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f51980a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f51981b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + (this.f51982c ? 1231 : 1237)) * 31) + (this.f51983d ? 1231 : 1237);
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.f51983d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb2.append(this.f51980a);
        sb2.append(", mutability=");
        sb2.append(this.f51981b);
        sb2.append(", definitelyNotNull=");
        sb2.append(this.f51982c);
        sb2.append(", isNullabilityQualifierForWarning=");
        return AbstractC3794B0.m4499x(sb2, this.f51983d, ')');
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z6, (i10 & 8) != 0 ? false : z10);
    }
}
