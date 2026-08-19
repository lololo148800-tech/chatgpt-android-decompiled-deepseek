package p817j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.time.DateTimeException;

/* JADX INFO: renamed from: j$.time.temporal.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C15637q implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a */
    private final long f48783a;

    /* JADX INFO: renamed from: b */
    private final long f48784b;

    /* JADX INFO: renamed from: c */
    private final long f48785c;

    /* JADX INFO: renamed from: d */
    private final long f48786d;

    /* JADX INFO: renamed from: j */
    public static C15637q m17168j(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C15637q(j10, j10, j11, j11);
    }

    /* JADX INFO: renamed from: k */
    public static C15637q m17169k(long j10, long j11, long j12) {
        if (j10 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j12) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C15637q(j10, 1L, j11, j12);
    }

    private C15637q(long j10, long j11, long j12, long j13) {
        this.f48783a = j10;
        this.f48784b = j11;
        this.f48785c = j12;
        this.f48786d = j13;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17175g() {
        return this.f48783a == this.f48784b && this.f48785c == this.f48786d;
    }

    /* JADX INFO: renamed from: e */
    public final long m17173e() {
        return this.f48783a;
    }

    /* JADX INFO: renamed from: f */
    public final long m17174f() {
        return this.f48785c;
    }

    /* JADX INFO: renamed from: d */
    public final long m17172d() {
        return this.f48786d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17176h() {
        return this.f48783a >= -2147483648L && this.f48786d <= 2147483647L;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17177i(long j10) {
        return j10 >= this.f48783a && j10 <= this.f48786d;
    }

    /* JADX INFO: renamed from: a */
    public final int m17170a(long j10, InterfaceC15635o interfaceC15635o) {
        if (m17176h() && m17177i(j10)) {
            return (int) j10;
        }
        throw new DateTimeException(m17167c(j10, interfaceC15635o));
    }

    /* JADX INFO: renamed from: b */
    public final void m17171b(long j10, InterfaceC15635o interfaceC15635o) {
        if (!m17177i(j10)) {
            throw new DateTimeException(m17167c(j10, interfaceC15635o));
        }
    }

    /* JADX INFO: renamed from: c */
    private String m17167c(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o != null) {
            return "Invalid value for " + interfaceC15635o + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f48783a;
        long j11 = this.f48784b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f48785c;
        long j13 = this.f48786d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15637q)) {
            return false;
        }
        C15637q c15637q = (C15637q) obj;
        return this.f48783a == c15637q.f48783a && this.f48784b == c15637q.f48784b && this.f48785c == c15637q.f48785c && this.f48786d == c15637q.f48786d;
    }

    public final int hashCode() {
        long j10 = this.f48784b;
        long j11 = this.f48783a + (j10 << 16) + (j10 >> 48);
        long j12 = this.f48785c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f48786d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) ((j15 >>> 32) ^ j15);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f48783a;
        sb2.append(j10);
        long j11 = this.f48784b;
        if (j10 != j11) {
            sb2.append('/');
            sb2.append(j11);
        }
        sb2.append(" - ");
        long j12 = this.f48785c;
        sb2.append(j12);
        long j13 = this.f48786d;
        if (j12 != j13) {
            sb2.append('/');
            sb2.append(j13);
        }
        return sb2.toString();
    }
}
