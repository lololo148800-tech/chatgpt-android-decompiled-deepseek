package p346Nn;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3507f;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Nn.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5884Y {

    /* JADX INFO: renamed from: b */
    public static final C5884Y f19214b;

    /* JADX INFO: renamed from: a */
    public final List f19215a;

    static {
        new C5884Y(AbstractC17681o.m19382k("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f19214b = new C5884Y(AbstractC17681o.m19382k("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public C5884Y(List list) {
        this.f19215a = list;
        if (list.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        C3507f it = AbstractC17681o.m19380i(list).iterator();
        while (it.f10596o0) {
            int iMo4199a = it.mo4199a();
            if (((CharSequence) this.f19215a.get(iMo4199a)).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i10 = 0; i10 < iMo4199a; i10++) {
                if (AbstractC16544l.m18089b(this.f19215a.get(iMo4199a), this.f19215a.get(i10))) {
                    throw new IllegalArgumentException(AbstractC9306j0.m9891j((String) this.f19215a.get(iMo4199a), "' was repeated", new StringBuilder("Month names must be unique, but '")).toString());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5884Y) {
            if (AbstractC16544l.m18089b(this.f19215a, ((C5884Y) obj).f19215a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19215a.hashCode();
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this.f19215a, ", ", "MonthNames(", Separators.RPAREN, 0, null, C5883X.f19213Y, 24);
    }
}
