package p523V9;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p035B7.C0846c;
import p571X9.AbstractC9393x3;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11685d;
import p676c7.EnumC11684c;
import p775h2.AbstractC14376f;
import p895n1.C17425e;
import p909nm.C17689w;
import p919o8.AbstractC17962d;
import p919o8.C17912L;
import p919o8.C17921O;
import p919o8.C17971g;
import p919o8.C17980j;
import p919o8.EnumC17954a0;
import p919o8.EnumC18019w;

/* JADX INFO: renamed from: V9.i5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8111i5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25446a;

    /* JADX INFO: renamed from: a */
    public static final boolean m8590a(C11685d c11685d) {
        AbstractC16544l.m18094g(c11685d, "<this>");
        return c11685d.f35439a != 1;
    }

    /* JADX INFO: renamed from: b */
    public static final void m8591b(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m8592c(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8593d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: e */
    public static final C17980j m8594e(C11685d c11685d) {
        List listM9974d;
        AbstractC16544l.m18094g(c11685d, "<this>");
        int i10 = m8590a(c11685d) ? 1 : 2;
        switch (AbstractC0010F.m24h(c11685d.f35439a)) {
            case 0:
                listM9974d = C17689w.f56480Y;
                break;
            case 1:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.ETHERNET);
                break;
            case 2:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.WIFI);
                break;
            case 3:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.WIMAX);
                break;
            case 4:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.CELLULAR);
                break;
            case 11:
                listM9974d = AbstractC9393x3.m9974d(EnumC18019w.OTHER);
                break;
            default:
                throw new C0644w();
        }
        String str = c11685d.f35440b;
        String str2 = c11685d.f35445g;
        return new C17980j(i10, listM9974d, 0, (str2 == null && str == null) ? null : new C17971g(str2, str));
    }

    /* JADX INFO: renamed from: f */
    public static final int m8595f(EnumC11684c enumC11684c) {
        AbstractC16544l.m18094g(enumC11684c, "<this>");
        int iOrdinal = enumC11684c.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 7 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: g */
    public static final int m8596g(int i10) {
        AbstractC14376f.m15825D(i10, "<this>");
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new C0644w();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C17921O m8597h(C11685d c11685d) {
        List listM9974d;
        AbstractC16544l.m18094g(c11685d, "<this>");
        int i10 = m8590a(c11685d) ? 1 : 2;
        switch (AbstractC0010F.m24h(c11685d.f35439a)) {
            case 0:
                listM9974d = C17689w.f56480Y;
                break;
            case 1:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.ETHERNET);
                break;
            case 2:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.WIFI);
                break;
            case 3:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.WIMAX);
                break;
            case 4:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.CELLULAR);
                break;
            case 11:
                listM9974d = AbstractC9393x3.m9974d(EnumC17954a0.OTHER);
                break;
            default:
                throw new C0644w();
        }
        String str = c11685d.f35440b;
        String str2 = c11685d.f35445g;
        return new C17921O(i10, listM9974d, 0, (str2 == null && str == null) ? null : new C17912L(str2, str));
    }

    /* JADX INFO: renamed from: i */
    public static final int m8598i(EnumC11684c enumC11684c) {
        AbstractC16544l.m18094g(enumC11684c, "<this>");
        int iOrdinal = enumC11684c.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 7 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: j */
    public static final int m8599j(int i10) {
        AbstractC14376f.m15825D(i10, "<this>");
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new C0644w();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final int m8600k(int i10) {
        AbstractC14376f.m15825D(i10, "<this>");
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            return 1;
        }
        int i11 = 2;
        if (iM24h != 1) {
            if (iM24h == 2) {
                return 3;
            }
            i11 = 4;
            if (iM24h != 3) {
                if (iM24h == 4) {
                    return 5;
                }
                if (iM24h == 5) {
                    return 6;
                }
                throw new C0644w();
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: l */
    public static final int m8601l(String source, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19638b(i10).equals(source)) {
                    return i10;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (NoSuchElementException e10) {
            AbstractC7889G0.m8184b(internalLogger, 5, EnumC11255b.f34098Y, new C0846c(source, 15), e10, false, 48);
            return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m8602m(String source, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19636a(i10).equals(source)) {
                    return i10;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (NoSuchElementException e10) {
            AbstractC7889G0.m8184b(internalLogger, 5, EnumC11255b.f34098Y, new C0846c(source, 16), e10, false, 48);
            return 0;
        }
    }
}
