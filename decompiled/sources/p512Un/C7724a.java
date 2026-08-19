package p512Un;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Un.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7724a implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final char[] f24348Z;

    /* JADX INFO: renamed from: Y */
    public int f24349Y;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC16544l.m18093f(charArray, "toCharArray(...)");
        f24348Z = charArray;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7724a other = (C7724a) obj;
        AbstractC16544l.m18094g(other, "other");
        if (other == this) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7724a.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i10 = this.f24349Y;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode((byte[]) null);
        this.f24349Y = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        throw null;
    }
}
