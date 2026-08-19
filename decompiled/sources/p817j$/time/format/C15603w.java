package p817j$.time.format;

import java.util.ArrayList;
import java.util.Locale;
import p817j$.time.ZoneId;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.w */
/* JADX INFO: loaded from: classes4.dex */
final class C15603w {

    /* JADX INFO: renamed from: a */
    private DateTimeFormatter f48714a;

    /* JADX INFO: renamed from: b */
    private boolean f48715b = true;

    /* JADX INFO: renamed from: c */
    private boolean f48716c = true;

    /* JADX INFO: renamed from: d */
    private final ArrayList f48717d;

    /* JADX INFO: renamed from: e */
    private ArrayList f48718e;

    C15603w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f48717d = arrayList;
        this.f48718e = null;
        this.f48714a = dateTimeFormatter;
        arrayList.add(new C15577D());
    }

    /* JADX INFO: renamed from: d */
    final C15603w m17085d() {
        C15603w c15603w = new C15603w(this.f48714a);
        c15603w.f48715b = this.f48715b;
        c15603w.f48716c = this.f48716c;
        return c15603w;
    }

    /* JADX INFO: renamed from: i */
    final Locale m17089i() {
        return this.f48714a.m17024c();
    }

    /* JADX INFO: renamed from: g */
    final C15576C m17087g() {
        return this.f48714a.m17023b();
    }

    /* JADX INFO: renamed from: h */
    final InterfaceC15555k m17088h() {
        InterfaceC15555k interfaceC15555k = m17082e().f48624c;
        if (interfaceC15555k != null) {
            return interfaceC15555k;
        }
        InterfaceC15555k interfaceC15555kM17022a = this.f48714a.m17022a();
        return interfaceC15555kM17022a == null ? C15562r.f48594d : interfaceC15555kM17022a;
    }

    /* JADX INFO: renamed from: b */
    final boolean m17084b(char c9, char c10) {
        if (this.f48715b) {
            return c9 == c10;
        }
        return m17081c(c9, c10);
    }

    /* JADX INFO: renamed from: k */
    final boolean m17091k() {
        return this.f48715b;
    }

    /* JADX INFO: renamed from: m */
    final void m17093m(boolean z6) {
        this.f48715b = z6;
    }

    /* JADX INFO: renamed from: s */
    final boolean m17099s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (this.f48715b) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char cCharAt = charSequence.charAt(i10 + i14);
            char cCharAt2 = charSequence2.charAt(i11 + i14);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static boolean m17081c(char c9, char c10) {
        return c9 == c10 || Character.toUpperCase(c9) == Character.toUpperCase(c10) || Character.toLowerCase(c9) == Character.toLowerCase(c10);
    }

    /* JADX INFO: renamed from: l */
    final boolean m17092l() {
        return this.f48716c;
    }

    /* JADX INFO: renamed from: q */
    final void m17097q(boolean z6) {
        this.f48716c = z6;
    }

    /* JADX INFO: renamed from: r */
    final void m17098r() {
        ArrayList arrayList = this.f48717d;
        C15577D c15577dM17082e = m17082e();
        c15577dM17082e.getClass();
        C15577D c15577d = new C15577D();
        c15577d.f48622a.putAll(c15577dM17082e.f48622a);
        c15577d.f48623b = c15577dM17082e.f48623b;
        c15577d.f48624c = c15577dM17082e.f48624c;
        c15577d.f48625d = c15577dM17082e.f48625d;
        arrayList.add(c15577d);
    }

    /* JADX INFO: renamed from: f */
    final void m17086f(boolean z6) {
        ArrayList arrayList = this.f48717d;
        if (z6) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: e */
    private C15577D m17082e() {
        ArrayList arrayList = this.f48717d;
        return (C15577D) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: t */
    final TemporalAccessor m17100t(EnumC15578E enumC15578E) {
        C15577D c15577dM17082e = m17082e();
        c15577dM17082e.f48624c = m17088h();
        ZoneId zoneId = c15577dM17082e.f48623b;
        if (zoneId == null) {
            this.f48714a.getClass();
            zoneId = null;
        }
        c15577dM17082e.f48623b = zoneId;
        c15577dM17082e.m17020l(enumC15578E);
        return c15577dM17082e;
    }

    /* JADX INFO: renamed from: j */
    final Long m17090j(EnumC15621a enumC15621a) {
        return (Long) m17082e().f48622a.get(enumC15621a);
    }

    /* JADX INFO: renamed from: o */
    final int m17095o(InterfaceC15635o interfaceC15635o, long j10, int i10, int i11) {
        Objects.requireNonNull(interfaceC15635o, "field");
        Long l4 = (Long) m17082e().f48622a.put(interfaceC15635o, Long.valueOf(j10));
        return (l4 == null || l4.longValue() == j10) ? i11 : ~i10;
    }

    /* JADX INFO: renamed from: a */
    final void m17083a(C15596p c15596p) {
        if (this.f48718e == null) {
            this.f48718e = new ArrayList();
        }
        this.f48718e.add(c15596p);
    }

    /* JADX INFO: renamed from: n */
    final void m17094n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m17082e().f48623b = zoneId;
    }

    /* JADX INFO: renamed from: p */
    final void m17096p() {
        m17082e().f48625d = true;
    }

    public final String toString() {
        return m17082e().toString();
    }
}
