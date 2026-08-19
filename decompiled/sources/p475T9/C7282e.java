package p475T9;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p1078w9.AbstractC20851a;
import p1113xn.AbstractC21329w;
import p263K9.C4576X;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: T9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7282e extends AbstractC20851a {
    public static final Parcelable.Creator<C7282e> CREATOR = new C4576X(13);

    /* JADX INFO: renamed from: Y */
    public final int f23077Y;

    /* JADX INFO: renamed from: Z */
    public final String f23078Z;

    /* JADX INFO: renamed from: o0 */
    public final String f23079o0;

    /* JADX INFO: renamed from: p0 */
    public final String f23080p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC7287j f23081q0;

    /* JADX INFO: renamed from: r0 */
    public final C7282e f23082r0;

    static {
        Process.myUid();
        Process.myPid();
    }

    public C7282e(int i10, String packageName, String str, String str2, ArrayList arrayList, C7282e c7282e) {
        AbstractC16544l.m18094g(packageName, "packageName");
        if (c7282e != null && c7282e.f23082r0 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f23077Y = i10;
        this.f23078Z = packageName;
        this.f23079o0 = str;
        this.f23080p0 = str2 == null ? c7282e != null ? c7282e.f23080p0 : null : str2;
        Collection collection = arrayList;
        if (arrayList == null) {
            AbstractC7287j abstractC7287j = c7282e != null ? c7282e.f23081q0 : null;
            collection = abstractC7287j;
            if (abstractC7287j == null) {
                C7285h c7285h = AbstractC7287j.f23091Z;
                C7288k c7288k = C7288k.f23092q0;
                AbstractC16544l.m18093f(c7288k, "of(...)");
                collection = c7288k;
            }
        }
        C7285h c7285h2 = AbstractC7287j.f23091Z;
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (array[i11] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        C7288k c7288k2 = length == 0 ? C7288k.f23092q0 : new C7288k(length, array);
        AbstractC16544l.m18093f(c7288k2, "copyOf(...)");
        this.f23081q0 = c7288k2;
        this.f23082r0 = c7282e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7282e) {
            C7282e c7282e = (C7282e) obj;
            if (this.f23077Y == c7282e.f23077Y && AbstractC16544l.m18089b(this.f23078Z, c7282e.f23078Z) && AbstractC16544l.m18089b(this.f23079o0, c7282e.f23079o0) && AbstractC16544l.m18089b(this.f23080p0, c7282e.f23080p0) && AbstractC16544l.m18089b(this.f23082r0, c7282e.f23082r0) && AbstractC16544l.m18089b(this.f23081q0, c7282e.f23081q0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23077Y), this.f23078Z, this.f23079o0, this.f23080p0, this.f23082r0});
    }

    public final String toString() {
        String str = this.f23078Z;
        int length = str.length() + 18;
        String str2 = this.f23079o0;
        StringBuilder sb2 = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb2.append(this.f23077Y);
        sb2.append(Separators.SLASH);
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (AbstractC21329w.m21734u(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f23080p0;
        if (str3 != null) {
            sb2.append(Separators.SLASH);
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC16544l.m18094g(dest, "dest");
        int iM8811j = AbstractC8199t5.m8811j(dest, 20293);
        AbstractC8199t5.m8813l(dest, 1, 4);
        dest.writeInt(this.f23077Y);
        AbstractC8199t5.m8807f(dest, 3, this.f23078Z);
        AbstractC8199t5.m8807f(dest, 4, this.f23079o0);
        AbstractC8199t5.m8807f(dest, 6, this.f23080p0);
        AbstractC8199t5.m8806e(dest, 7, this.f23082r0, i10);
        AbstractC8199t5.m8810i(dest, 8, this.f23081q0);
        AbstractC8199t5.m8812k(dest, iM8811j);
    }
}
