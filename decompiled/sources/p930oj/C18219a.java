package p930oj;

import p025An.C0644w;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: oj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18219a implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final String f58057Y;

    /* JADX INFO: renamed from: Z */
    public final Integer f58058Z;

    /* JADX INFO: renamed from: o0 */
    public final Integer f58059o0;

    /* JADX INFO: renamed from: p0 */
    public final Integer f58060p0;

    /* JADX INFO: renamed from: q0 */
    public final String[] f58061q0;

    /* JADX INFO: renamed from: r0 */
    public final String f58062r0;

    public C18219a(String str) {
        char c9;
        String[] strArrSplit;
        String str2;
        String strTrim = str.trim();
        this.f58057Y = strTrim;
        int iIndexOf = strTrim.indexOf("+");
        int iIndexOf2 = strTrim.indexOf("-");
        String[] strArrSplit2 = (iIndexOf2 != -1 && (iIndexOf == -1 || iIndexOf2 < iIndexOf)) ? strTrim.split("-", 2) : new String[]{strTrim};
        try {
            if (strArrSplit2.length != 1) {
                c9 = 0;
                strArrSplit = strArrSplit2[0].split("\\.");
                str2 = null;
            } else {
                if (strArrSplit2[0].endsWith("+")) {
                    throw new C0644w("The build cannot be empty.");
                }
                String[] strArrSplit3 = strArrSplit2[0].split("\\+");
                strArrSplit = strArrSplit3[0].split("\\.");
                str2 = strArrSplit3.length == 2 ? strArrSplit3[1] : null;
                c9 = 0;
            }
            try {
                this.f58058Z = Integer.valueOf(strArrSplit[c9]);
                try {
                    Integer numValueOf = Integer.valueOf(strArrSplit[1]);
                    try {
                        Integer numValueOf2 = Integer.valueOf(strArrSplit[2]);
                        this.f58059o0 = numValueOf;
                        this.f58060p0 = numValueOf2;
                        String[] strArrSplit4 = new String[0];
                        try {
                            if (strArrSplit2[1].endsWith("+")) {
                                throw new C0644w("The build cannot be empty.");
                            }
                            String[] strArrSplit5 = strArrSplit2[1].split("\\+");
                            if (strArrSplit5.length == 2) {
                                strArrSplit4 = strArrSplit5[0].split("\\.");
                                str2 = strArrSplit5[1];
                            } else {
                                strArrSplit4 = strArrSplit2[1].split("\\.");
                            }
                            this.f58061q0 = strArrSplit4;
                            this.f58062r0 = str2;
                            Integer num = this.f58059o0;
                            String str3 = this.f58057Y;
                            if (num == null) {
                                throw new C0644w(AbstractC9306j0.m9889h("Invalid version (no minor version): ", str3));
                            }
                            if (this.f58060p0 == null) {
                                throw new C0644w(AbstractC9306j0.m9889h("Invalid version (no patch version): ", str3));
                            }
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    } catch (IndexOutOfBoundsException unused2) {
                        throw new C0644w("Invalid version (no patch version): ".concat(strTrim));
                    } catch (NumberFormatException unused3) {
                        throw new C0644w("Invalid version (no patch version): ".concat(strTrim));
                    }
                } catch (IndexOutOfBoundsException unused4) {
                    throw new C0644w("Invalid version (no minor version): ".concat(strTrim));
                } catch (NumberFormatException unused5) {
                    throw new C0644w("Invalid version (no minor version): ".concat(strTrim));
                }
            } catch (IndexOutOfBoundsException unused6) {
                throw new C0644w("Invalid version (no major version): ".concat(strTrim));
            } catch (NumberFormatException unused7) {
                throw new C0644w("Invalid version (no major version): ".concat(strTrim));
            }
        } catch (IndexOutOfBoundsException unused8) {
            throw new C0644w("The version is invalid: ".concat(strTrim));
        } catch (NumberFormatException unused9) {
            throw new C0644w("The version is invalid: ".concat(strTrim));
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C18219a c18219a) {
        C18219a c18219a2;
        if (m19729b(c18219a)) {
            return 1;
        }
        if (m19729b(c18219a)) {
            return 0;
        }
        String str = this.f58062r0;
        if (str == null) {
            c18219a2 = this;
        } else {
            c18219a2 = new C18219a(this.f58057Y.replace("+".concat(str), ""));
        }
        String str2 = c18219a.f58062r0;
        if (str2 != null) {
            c18219a = new C18219a(c18219a.f58057Y.replace("+".concat(str2), ""));
        }
        return !c18219a2.equals(c18219a) ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19729b(C18219a c18219a) {
        int iCompareToIgnoreCase;
        Integer num = this.f58058Z;
        if (num.intValue() > c18219a.f58058Z.intValue()) {
            return true;
        }
        if (num.intValue() < c18219a.f58058Z.intValue()) {
            return false;
        }
        Integer num2 = c18219a.f58059o0;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = this.f58059o0;
        if (num3 != null && num3.intValue() > iIntValue) {
            return true;
        }
        if (num3 != null && num3.intValue() < iIntValue) {
            return false;
        }
        Integer num4 = c18219a.f58060p0;
        int iIntValue2 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f58060p0;
        if (num5 != null && num5.intValue() > iIntValue2) {
            return true;
        }
        if (num5 != null && num5.intValue() < iIntValue2) {
            return false;
        }
        String[] strArr = this.f58061q0;
        int length = strArr.length;
        String[] strArr2 = c18219a.f58061q0;
        if (length == 0 && strArr2.length > 0) {
            return true;
        }
        if (strArr2.length == 0 && strArr.length > 0) {
            return false;
        }
        for (int i10 = 0; i10 < strArr.length && i10 < strArr2.length; i10++) {
            try {
                iCompareToIgnoreCase = Integer.valueOf(strArr[i10]).intValue() - Integer.valueOf(strArr2[i10]).intValue();
            } catch (NumberFormatException unused) {
                iCompareToIgnoreCase = strArr[i10].compareToIgnoreCase(strArr2[i10]);
            }
            if (iCompareToIgnoreCase < 0) {
                return false;
            }
            if (iCompareToIgnoreCase > 0) {
                return true;
            }
        }
        return strArr.length > strArr2.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18219a) {
            return this.f58057Y.equals(((C18219a) obj).f58057Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58057Y.hashCode();
    }

    public final String toString() {
        return this.f58057Y;
    }
}
