package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class FqName {
    public static final Companion Companion = new Companion(null);
    public static final FqName ROOT = new FqName("");

    /* JADX INFO: renamed from: a */
    public final FqNameUnsafe f52674a;

    /* JADX INFO: renamed from: b */
    public transient FqName f52675b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FqName topLevel(Name shortName) {
            AbstractC16544l.m18094g(shortName, "shortName");
            return new FqName(FqNameUnsafe.Companion.topLevel(shortName));
        }
    }

    public FqName(String fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f52674a = new FqNameUnsafe(fqName, this);
    }

    public final String asString() {
        return this.f52674a.asString();
    }

    public final FqName child(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return new FqName(this.f52674a.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqName) {
            return AbstractC16544l.m18089b(this.f52674a, ((FqName) obj).f52674a);
        }
        return false;
    }

    public int hashCode() {
        return this.f52674a.hashCode();
    }

    public final boolean isRoot() {
        return this.f52674a.isRoot();
    }

    public final FqName parent() {
        FqName fqName = this.f52675b;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f52674a.parent());
        this.f52675b = fqName2;
        return fqName2;
    }

    public final List<Name> pathSegments() {
        return this.f52674a.pathSegments();
    }

    public final Name shortName() {
        return this.f52674a.shortName();
    }

    public final Name shortNameOrSpecial() {
        return this.f52674a.shortNameOrSpecial();
    }

    public final boolean startsWith(Name segment) {
        AbstractC16544l.m18094g(segment, "segment");
        return this.f52674a.startsWith(segment);
    }

    public String toString() {
        return this.f52674a.toString();
    }

    public final FqNameUnsafe toUnsafe() {
        return this.f52674a;
    }

    public FqName(FqNameUnsafe fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f52674a = fqName;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f52674a = fqNameUnsafe;
        this.f52675b = fqName;
    }
}
