package p346Nn;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3507f;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Nn.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C5863C {

    /* JADX INFO: renamed from: b */
    public static final C5863C f19166b;

    /* JADX INFO: renamed from: a */
    public final List f19167a;

    static {
        new C5863C(AbstractC17681o.m19382k("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        f19166b = new C5863C(AbstractC17681o.m19382k("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public C5863C(List list) {
        this.f19167a = list;
        if (list.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        C3507f it = AbstractC17681o.m19380i(list).iterator();
        while (it.f10596o0) {
            int iMo4199a = it.mo4199a();
            if (((CharSequence) this.f19167a.get(iMo4199a)).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i10 = 0; i10 < iMo4199a; i10++) {
                if (AbstractC16544l.m18089b(this.f19167a.get(iMo4199a), this.f19167a.get(i10))) {
                    throw new IllegalArgumentException(AbstractC9306j0.m9891j((String) this.f19167a.get(iMo4199a), "' was repeated", new StringBuilder("Day-of-week names must be unique, but '")).toString());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5863C) {
            if (AbstractC16544l.m18089b(this.f19167a, ((C5863C) obj).f19167a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19167a.hashCode();
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this.f19167a, ", ", "DayOfWeekNames(", Separators.RPAREN, 0, null, C5862B.f19165Y, 24);
    }
}
