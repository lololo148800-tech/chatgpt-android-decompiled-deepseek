package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class FqNameUnsafe {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final Name f52676e;

    /* JADX INFO: renamed from: a */
    public final String f52677a;

    /* JADX INFO: renamed from: b */
    public transient FqName f52678b;

    /* JADX INFO: renamed from: c */
    public transient FqNameUnsafe f52679c;

    /* JADX INFO: renamed from: d */
    public transient Name f52680d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FqNameUnsafe topLevel(Name shortName) {
            AbstractC16544l.m18094g(shortName, "shortName");
            String strAsString = shortName.asString();
            AbstractC16544l.m18093f(strAsString, "asString(...)");
            return new FqNameUnsafe(strAsString, FqName.ROOT.toUnsafe(), shortName, null);
        }
    }

    static {
        Name nameSpecial = Name.special("<root>");
        AbstractC16544l.m18093f(nameSpecial, "special(...)");
        f52676e = nameSpecial;
        AbstractC16544l.m18093f(Pattern.compile("\\."), "compile(...)");
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    /* JADX INFO: renamed from: b */
    public static final List m18263b(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new ArrayList();
        }
        List listM18263b = m18263b(fqNameUnsafe.parent());
        listM18263b.add(fqNameUnsafe.shortName());
        return listM18263b;
    }

    /* JADX INFO: renamed from: a */
    public final void m18264a() {
        String str = this.f52677a;
        int length = str.length() - 1;
        boolean z6 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z6) {
                break;
            }
            if (cCharAt == '`') {
                z6 = !z6;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f52680d = Name.guessByFirstCharacter(str);
            this.f52679c = FqName.ROOT.toUnsafe();
            return;
        }
        String strSubstring = str.substring(length + 1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        this.f52680d = Name.guessByFirstCharacter(strSubstring);
        String strSubstring2 = str.substring(0, length);
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        this.f52679c = new FqNameUnsafe(strSubstring2);
    }

    public final String asString() {
        return this.f52677a;
    }

    public final FqNameUnsafe child(Name name) {
        String strAsString;
        AbstractC16544l.m18094g(name, "name");
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.f52677a + '.' + name.asString();
        }
        AbstractC16544l.m18091d(strAsString);
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FqNameUnsafe) {
            return AbstractC16544l.m18089b(this.f52677a, ((FqNameUnsafe) obj).f52677a);
        }
        return false;
    }

    public int hashCode() {
        return this.f52677a.hashCode();
    }

    public final boolean isRoot() {
        return this.f52677a.length() == 0;
    }

    public final boolean isSafe() {
        return this.f52678b != null || AbstractC21322p.m21678L(asString(), '<', 0, false, 6) < 0;
    }

    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.f52679c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        m18264a();
        FqNameUnsafe fqNameUnsafe2 = this.f52679c;
        AbstractC16544l.m18091d(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    public final List<Name> pathSegments() {
        return m18263b(this);
    }

    public final Name shortName() {
        Name name = this.f52680d;
        if (name != null) {
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        m18264a();
        Name name2 = this.f52680d;
        AbstractC16544l.m18091d(name2);
        return name2;
    }

    public final Name shortNameOrSpecial() {
        return isRoot() ? f52676e : shortName();
    }

    public final boolean startsWith(Name segment) {
        AbstractC16544l.m18094g(segment, "segment");
        if (isRoot()) {
            return false;
        }
        String str = this.f52677a;
        int iM21678L = AbstractC21322p.m21678L(str, '.', 0, false, 6);
        if (iM21678L == -1) {
            iM21678L = str.length();
        }
        int i10 = iM21678L;
        String strAsString = segment.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return i10 == strAsString.length() && AbstractC21329w.m21728o(0, 0, i10, this.f52677a, strAsString, false);
    }

    public final FqName toSafe() {
        FqName fqName = this.f52678b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f52678b = fqName2;
        return fqName2;
    }

    public String toString() {
        if (!isRoot()) {
            return this.f52677a;
        }
        String strAsString = f52676e.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }

    public FqNameUnsafe(String fqName, FqName safe) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(safe, "safe");
        this.f52677a = fqName;
        this.f52678b = safe;
    }

    public FqNameUnsafe(String fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f52677a = fqName;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f52677a = str;
        this.f52679c = fqNameUnsafe;
        this.f52680d = name;
    }
}
