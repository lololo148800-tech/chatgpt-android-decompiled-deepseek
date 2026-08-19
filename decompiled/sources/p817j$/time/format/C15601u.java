package p817j$.time.format;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;
import p817j$.time.DateTimeException;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.zone.AbstractC15649i;

/* JADX INFO: renamed from: j$.time.format.u */
/* JADX INFO: loaded from: classes4.dex */
class C15601u implements InterfaceC15586f {

    /* JADX INFO: renamed from: c */
    private static volatile AbstractMap.SimpleImmutableEntry f48705c;

    /* JADX INFO: renamed from: d */
    private static volatile AbstractMap.SimpleImmutableEntry f48706d;

    /* JADX INFO: renamed from: a */
    private final TemporalQuery f48707a;

    /* JADX INFO: renamed from: b */
    private final String f48708b;

    C15601u(TemporalQuery temporalQuery, String str) {
        this.f48707a = temporalQuery;
        this.f48708b = str;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) c15605y.m17106f(this.f48707a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.getId());
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected C15595o mo17080a(C15603w c15603w) {
        Set setM17227a = AbstractC15649i.m17227a();
        int size = setM17227a.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = c15603w.m17091k() ? f48705c : f48706d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = c15603w.m17091k() ? f48705c : f48706d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), C15595o.m17075g(setM17227a, c15603w));
                        if (c15603w.m17091k()) {
                            f48705c = simpleImmutableEntry;
                        } else {
                            f48706d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (C15595o) simpleImmutableEntry.getValue();
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            return m17079b(c15603w, charSequence, i10, i10, C15592l.f48678e);
        }
        int i12 = i10 + 2;
        if (length >= i12) {
            char cCharAt2 = charSequence.charAt(i10 + 1);
            if (c15603w.m17084b(cCharAt, 'U') && c15603w.m17084b(cCharAt2, 'T')) {
                int i13 = i10 + 3;
                if (length >= i13 && c15603w.m17084b(charSequence.charAt(i12), 'C')) {
                    return m17079b(c15603w, charSequence, i10, i13, C15592l.f48679f);
                }
                return m17079b(c15603w, charSequence, i10, i12, C15592l.f48679f);
            }
            if (c15603w.m17084b(cCharAt, 'G') && length >= (i11 = i10 + 3) && c15603w.m17084b(cCharAt2, 'M') && c15603w.m17084b(charSequence.charAt(i12), 'T')) {
                int i14 = i10 + 4;
                if (length >= i14 && c15603w.m17084b(charSequence.charAt(i11), '0')) {
                    c15603w.m17094n(ZoneId.m16881of("GMT0"));
                    return i14;
                }
                return m17079b(c15603w, charSequence, i10, i11, C15592l.f48679f);
            }
        }
        C15595o c15595oMo17080a = mo17080a(c15603w);
        ParsePosition parsePosition = new ParsePosition(i10);
        String strM17077d = c15595oMo17080a.m17077d(charSequence, parsePosition);
        if (strM17077d == null) {
            if (!c15603w.m17084b(cCharAt, 'Z')) {
                return ~i10;
            }
            c15603w.m17094n(ZoneOffset.UTC);
            return i10 + 1;
        }
        c15603w.m17094n(ZoneId.m16881of(strM17077d));
        return parsePosition.getIndex();
    }

    /* JADX INFO: renamed from: b */
    private static int m17079b(C15603w c15603w, CharSequence charSequence, int i10, int i11, C15592l c15592l) {
        String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
        if (i11 >= charSequence.length()) {
            c15603w.m17094n(ZoneId.m16881of(upperCase));
            return i11;
        }
        if (charSequence.charAt(i11) == '0' || c15603w.m17084b(charSequence.charAt(i11), 'Z')) {
            c15603w.m17094n(ZoneId.m16881of(upperCase));
            return i11;
        }
        C15603w c15603wM17085d = c15603w.m17085d();
        int iMo17054o = c15592l.mo17054o(c15603wM17085d, charSequence, i11);
        try {
            if (iMo17054o < 0) {
                if (c15592l == C15592l.f48678e) {
                    return ~i10;
                }
                c15603w.m17094n(ZoneId.m16881of(upperCase));
                return i11;
            }
            c15603w.m17094n(ZoneId.m16879R(upperCase, ZoneOffset.ofTotalSeconds((int) c15603wM17085d.m17090j(EnumC15621a.OFFSET_SECONDS).longValue())));
            return iMo17054o;
        } catch (DateTimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return this.f48708b;
    }
}
