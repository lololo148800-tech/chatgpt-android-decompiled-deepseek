package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17670d;
import p909nm.C17679m;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int[] f52577a;

    /* JADX INFO: renamed from: b */
    public final int f52578b;

    /* JADX INFO: renamed from: c */
    public final int f52579c;

    /* JADX INFO: renamed from: d */
    public final int f52580d;

    /* JADX INFO: renamed from: e */
    public final List f52581e;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BinaryVersion(int... numbers) {
        List listM19322C0;
        AbstractC16544l.m18094g(numbers, "numbers");
        this.f52577a = numbers;
        Integer numM19319z = AbstractC17678l.m19319z(numbers, 0);
        this.f52578b = numM19319z != null ? numM19319z.intValue() : -1;
        Integer numM19319z2 = AbstractC17678l.m19319z(numbers, 1);
        this.f52579c = numM19319z2 != null ? numM19319z2.intValue() : -1;
        Integer numM19319z3 = AbstractC17678l.m19319z(numbers, 2);
        this.f52580d = numM19319z3 != null ? numM19319z3.intValue() : -1;
        if (numbers.length <= 3) {
            listM19322C0 = C17689w.f56480Y;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(AbstractC12107L1.m13826q(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listM19322C0 = AbstractC17680n.m19322C0(new C17670d(new C17679m(numbers), 3, numbers.length));
        }
        this.f52581e = listM19322C0;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.f52578b == binaryVersion.f52578b && this.f52579c == binaryVersion.f52579c && this.f52580d == binaryVersion.f52580d && AbstractC16544l.m18089b(this.f52581e, binaryVersion.f52581e)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.f52578b;
    }

    public final int getMinor() {
        return this.f52579c;
    }

    public int hashCode() {
        int i10 = this.f52578b;
        int i11 = (i10 * 31) + this.f52579c + i10;
        int i12 = (i11 * 31) + this.f52580d + i11;
        return this.f52581e.hashCode() + (i12 * 31) + i12;
    }

    public final boolean isAtLeast(BinaryVersion version) {
        AbstractC16544l.m18094g(version, "version");
        return isAtLeast(version.f52578b, version.f52579c, version.f52580d);
    }

    public final boolean isAtMost(int i10, int i11, int i12) {
        int i13 = this.f52578b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f52579c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f52580d <= i12;
    }

    public final int[] toArray() {
        return this.f52577a;
    }

    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i10 : array) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC17680n.m19349Y(arrayList, Separators.DOT, null, null, 0, null, null, 62);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.f52578b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f52579c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f52580d >= i12;
    }
}
