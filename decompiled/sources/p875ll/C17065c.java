package p875ll;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import nl.C17651e;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: ll.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17065c extends AbstractC17066d {

    /* JADX INFO: renamed from: b */
    public final String f54540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17065c(String str, String blob) {
        super(str);
        AbstractC16544l.m18094g(blob, "blob");
        this.f54540b = blob;
        if (!AbstractC17067e.f54544c.m21664d(blob)) {
            throw new C17651e("Invalid blob value: it should be token68");
        }
    }

    @Override // p875ll.AbstractC17066d
    /* JADX INFO: renamed from: a */
    public final String mo18887a() {
        return this.f54541a + ' ' + this.f54540b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17065c)) {
            return false;
        }
        C17065c c17065c = (C17065c) obj;
        return c17065c.f54541a.equalsIgnoreCase(this.f54541a) && AbstractC21329w.m21726m(c17065c.f54540b, this.f54540b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f54541a.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        String lowerCase2 = this.f54540b.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase2, "toLowerCase(...)");
        return AbstractC17678l.m19291N(new Object[]{lowerCase, lowerCase2}).hashCode();
    }
}
