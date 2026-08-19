package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.function.Consumer;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.util.Objects;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.time.format.q */
/* JADX INFO: loaded from: classes4.dex */
final class C15597q extends C15591k {

    /* JADX INFO: renamed from: h */
    static final LocalDate f48696h = LocalDate.m16800of(2000, 1, 1);

    /* JADX INFO: renamed from: g */
    private final LocalDate f48697g;

    /* synthetic */ C15597q(InterfaceC15635o interfaceC15635o, LocalDate localDate, int i10) {
        this(interfaceC15635o, 2, 2, localDate, i10);
    }

    C15597q(InterfaceC15635o interfaceC15635o, LocalDate localDate) {
        this(interfaceC15635o, 2, 2, localDate, 0);
        if (localDate == null) {
            long j10 = 0;
            if (!interfaceC15635o.mo17142m().m17177i(j10)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j10 + C15591k.f48671f[2] > 2147483647L) {
                throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private C15597q(InterfaceC15635o interfaceC15635o, int i10, int i11, LocalDate localDate, int i12) {
        super(interfaceC15635o, i10, i11, EnumC15579F.NOT_NEGATIVE, i12);
        this.f48697g = localDate;
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: b */
    final long mo17063b(C15605y c15605y, long j10) {
        long jAbs = Math.abs(j10);
        LocalDate localDate = this.f48697g;
        long jMo16771o = localDate != null ? AbstractC15551g.m16964p(c15605y.m17104d()).mo16924p(localDate).mo16771o(this.f48672a) : 0;
        long[] jArr = C15591k.f48671f;
        if (j10 >= jMo16771o) {
            long j11 = jArr[this.f48673b];
            if (j10 < jMo16771o + j11) {
                return jAbs % j11;
            }
        }
        return jAbs % jArr[this.f48674c];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.p] */
    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: d */
    final int mo17064d(final C15603w c15603w, final long j10, final int i10, final int i11) {
        int iMo16771o;
        LocalDate localDate = this.f48697g;
        if (localDate != null) {
            iMo16771o = c15603w.m17088h().mo16924p(localDate).mo16771o(this.f48672a);
            c15603w.m17083a(new Consumer() { // from class: j$.time.format.p
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m17405p(Object obj) {
                    this.f48691a.mo17064d(c15603w, j10, i10, i11);
                }
            });
        } else {
            iMo16771o = 0;
        }
        int i12 = i11 - i10;
        int i13 = this.f48673b;
        if (i12 == i13 && j10 >= 0) {
            long j11 = C15591k.f48671f[i13];
            long j12 = iMo16771o;
            long j13 = j12 - (j12 % j11);
            j10 = iMo16771o > 0 ? j13 + j10 : j13 - j10;
            if (j10 < j12) {
                j10 += j11;
            }
        }
        return c15603w.m17095o(this.f48672a, j10, i10, i11);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: e */
    final C15591k mo17057e() {
        if (this.f48676e == -1) {
            return this;
        }
        return new C15597q(this.f48672a, this.f48673b, this.f48674c, this.f48697g, -1);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: f */
    final C15591k mo17058f(int i10) {
        int i11 = this.f48676e + i10;
        return new C15597q(this.f48672a, this.f48673b, this.f48674c, this.f48697g, i11);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: c */
    final boolean mo17056c(C15603w c15603w) {
        if (c15603w.m17092l()) {
            return super.mo17056c(c15603w);
        }
        return false;
    }

    @Override // p817j$.time.format.C15591k
    public final String toString() {
        Object objRequireNonNull = this.f48697g;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + this.f48672a + Separators.COMMA + this.f48673b + Separators.COMMA + this.f48674c + Separators.COMMA + objRequireNonNull + Separators.RPAREN;
    }
}
