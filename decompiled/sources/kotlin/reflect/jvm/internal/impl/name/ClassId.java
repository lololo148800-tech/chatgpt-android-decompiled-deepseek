package kotlin.reflect.jvm.internal.impl.name;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassId {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final FqName f52671a;

    /* JADX INFO: renamed from: b */
    public final FqName f52672b;

    /* JADX INFO: renamed from: c */
    public final boolean f52673c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z6, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z6 = false;
            }
            return companion.fromString(str, z6);
        }

        public final ClassId fromString(String string, boolean z6) {
            String strM21731r;
            AbstractC16544l.m18094g(string, "string");
            int iM21678L = AbstractC21322p.m21678L(string, '`', 0, false, 6);
            if (iM21678L == -1) {
                iM21678L = string.length();
            }
            int iM21684R = AbstractC21322p.m21684R(string, iM21678L, 4, Separators.SLASH);
            String str = "";
            if (iM21684R == -1) {
                strM21731r = AbstractC21329w.m21731r(string, "`", "");
            } else {
                String strSubstring = string.substring(0, iM21684R);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                String strM21730q = AbstractC21329w.m21730q(strSubstring, '/', '.');
                String strSubstring2 = string.substring(iM21684R + 1);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                strM21731r = AbstractC21329w.m21731r(strSubstring2, "`", "");
                str = strM21730q;
            }
            return new ClassId(new FqName(str), new FqName(strM21731r), z6);
        }

        public final ClassId topLevel(FqName topLevelFqName) {
            AbstractC16544l.m18094g(topLevelFqName, "topLevelFqName");
            return new ClassId(topLevelFqName.parent(), topLevelFqName.shortName());
        }
    }

    public ClassId(FqName packageFqName, FqName relativeClassName, boolean z6) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(relativeClassName, "relativeClassName");
        this.f52671a = packageFqName;
        this.f52672b = relativeClassName;
        this.f52673c = z6;
        relativeClassName.isRoot();
    }

    /* JADX INFO: renamed from: a */
    public static final String m18262a(FqName fqName) {
        String strAsString = fqName.asString();
        return AbstractC21322p.m21668B(strAsString, '/') ? AbstractC10763a.m11047e('`', "`", strAsString) : strAsString;
    }

    public static final ClassId topLevel(FqName fqName) {
        return Companion.topLevel(fqName);
    }

    public final FqName asSingleFqName() {
        FqName fqName = this.f52671a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f52672b;
        if (zIsRoot) {
            return fqName2;
        }
        return new FqName(fqName.asString() + '.' + fqName2.asString());
    }

    public final String asString() {
        FqName fqName = this.f52671a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f52672b;
        if (zIsRoot) {
            return m18262a(fqName2);
        }
        return AbstractC21329w.m21730q(fqName.asString(), '.', '/') + Separators.SLASH + m18262a(fqName2);
    }

    public final ClassId createNestedClassId(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return new ClassId(this.f52671a, this.f52672b.child(name), this.f52673c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return AbstractC16544l.m18089b(this.f52671a, classId.f52671a) && AbstractC16544l.m18089b(this.f52672b, classId.f52672b) && this.f52673c == classId.f52673c;
    }

    public final ClassId getOuterClassId() {
        FqName fqNameParent = this.f52672b.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(this.f52671a, fqNameParent, this.f52673c);
    }

    public final FqName getPackageFqName() {
        return this.f52671a;
    }

    public final FqName getRelativeClassName() {
        return this.f52672b;
    }

    public final Name getShortClassName() {
        return this.f52672b.shortName();
    }

    public int hashCode() {
        return ((this.f52672b.hashCode() + (this.f52671a.hashCode() * 31)) * 31) + (this.f52673c ? 1231 : 1237);
    }

    public final boolean isLocal() {
        return this.f52673c;
    }

    public final boolean isNestedClass() {
        return !this.f52672b.parent().isRoot();
    }

    public String toString() {
        if (!this.f52671a.isRoot()) {
            return asString();
        }
        return Separators.SLASH + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName packageFqName, Name topLevelName) {
        this(packageFqName, FqName.Companion.topLevel(topLevelName), false);
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(topLevelName, "topLevelName");
    }
}
