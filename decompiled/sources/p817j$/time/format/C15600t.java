package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.Calendar;
import java.util.Locale;
import p817j$.time.DayOfWeek;
import p817j$.time.temporal.C15639s;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.t */
/* JADX INFO: loaded from: classes4.dex */
final class C15600t extends C15591k {

    /* JADX INFO: renamed from: g */
    private char f48703g;

    /* JADX INFO: renamed from: h */
    private int f48704h;

    C15600t(char c9, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, EnumC15579F.NOT_NEGATIVE, i13);
        this.f48703g = c9;
        this.f48704h = i10;
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: e */
    final C15591k mo17057e() {
        if (this.f48676e == -1) {
            return this;
        }
        return new C15600t(this.f48703g, this.f48704h, this.f48673b, this.f48674c, -1);
    }

    @Override // p817j$.time.format.C15591k
    /* JADX INFO: renamed from: f */
    final C15591k mo17058f(int i10) {
        int i11 = this.f48676e + i10;
        return new C15600t(this.f48703g, this.f48704h, this.f48673b, this.f48674c, i11);
    }

    @Override // p817j$.time.format.C15591k, p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        return m17078g(c15605y.m17103c()).mo17053m(c15605y, sb2);
    }

    @Override // p817j$.time.format.C15591k, p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        return m17078g(c15603w.m17089i()).mo17054o(c15603w, charSequence, i10);
    }

    /* JADX INFO: renamed from: g */
    private C15591k m17078g(Locale locale) {
        InterfaceC15635o interfaceC15635oM17198i;
        TemporalUnit temporalUnit = C15639s.f48797h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C15639s c15639sM17193g = C15639s.m17193g(DayOfWeek.SUNDAY.m16769P(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c9 = this.f48703g;
        if (c9 == 'W') {
            interfaceC15635oM17198i = c15639sM17193g.m17198i();
        } else {
            if (c9 == 'Y') {
                InterfaceC15635o interfaceC15635oM17197h = c15639sM17193g.m17197h();
                int i10 = this.f48704h;
                if (i10 == 2) {
                    return new C15597q(interfaceC15635oM17197h, C15597q.f48696h, this.f48676e);
                }
                return new C15591k(interfaceC15635oM17197h, i10, 19, i10 < 4 ? EnumC15579F.NORMAL : EnumC15579F.EXCEEDS_PAD, this.f48676e);
            }
            if (c9 == 'c' || c9 == 'e') {
                interfaceC15635oM17198i = c15639sM17193g.m17194d();
            } else if (c9 == 'w') {
                interfaceC15635oM17198i = c15639sM17193g.m17199j();
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        return new C15591k(interfaceC15635oM17198i, this.f48673b, this.f48674c, EnumC15579F.NOT_NEGATIVE, this.f48676e);
    }

    @Override // p817j$.time.format.C15591k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f48704h;
        char c9 = this.f48703g;
        if (c9 != 'Y') {
            if (c9 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c9 == 'c' || c9 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c9 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(Separators.COMMA);
            sb2.append(i10);
        } else if (i10 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i10 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i10);
            sb2.append(",19,");
            sb2.append(i10 < 4 ? EnumC15579F.NORMAL : EnumC15579F.EXCEEDS_PAD);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
