package kotlin.reflect.jvm.internal.impl.name;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: Y */
    public final String f52681Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f52682Z;

    public Name(String str, boolean z6) {
        if (str == null) {
            m18265a(0);
            throw null;
        }
        this.f52681Y = str;
        this.f52682Z = z6;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18265a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = DiagnosticsEntry.NAME_KEY;
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Name guessByFirstCharacter(String str) {
        if (str != null) {
            return str.startsWith(Separators.LESS_THAN) ? special(str) : identifier(str);
        }
        m18265a(9);
        throw null;
    }

    public static Name identifier(String str) {
        if (str != null) {
            return new Name(str, false);
        }
        m18265a(5);
        throw null;
    }

    public static boolean isValidIdentifier(String str) {
        if (str == null) {
            m18265a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith(Separators.LESS_THAN)) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name special(String str) {
        if (str == null) {
            m18265a(8);
            throw null;
        }
        if (str.startsWith(Separators.LESS_THAN)) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public String asString() {
        String str = this.f52681Y;
        if (str != null) {
            return str;
        }
        m18265a(1);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f52682Z == name.f52682Z && this.f52681Y.equals(name.f52681Y);
    }

    public String getIdentifier() {
        if (this.f52682Z) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strAsString = asString();
        if (strAsString != null) {
            return strAsString;
        }
        m18265a(2);
        throw null;
    }

    public int hashCode() {
        return (this.f52681Y.hashCode() * 31) + (this.f52682Z ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.f52682Z;
    }

    public String toString() {
        return this.f52681Y;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.f52681Y.compareTo(name.f52681Y);
    }
}
