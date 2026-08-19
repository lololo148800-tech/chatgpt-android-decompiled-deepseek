package p602Yi;

import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Yi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10065a {

    /* JADX INFO: renamed from: a */
    public final int f29809a;

    /* JADX INFO: renamed from: b */
    public final String f29810b;

    /* JADX INFO: renamed from: c */
    public final Date f29811c;

    public C10065a(int i10, String message) {
        Date date = new Date();
        AbstractC14376f.m15825D(i10, "kind");
        AbstractC16544l.m18094g(message, "message");
        this.f29809a = i10;
        this.f29810b = message;
        this.f29811c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10065a)) {
            return false;
        }
        C10065a c10065a = (C10065a) obj;
        return this.f29809a == c10065a.f29809a && AbstractC16544l.m18089b(this.f29810b, c10065a.f29810b) && AbstractC16544l.m18089b(this.f29811c, c10065a.f29811c);
    }

    public final int hashCode() {
        return this.f29811c.hashCode() + AbstractC0168G.m527p(AbstractC0010F.m24h(this.f29809a) * 31, 31, this.f29810b);
    }

    public final String toString() {
        return "LogMessage(kind=" + AbstractC9306j0.m9903v(this.f29809a) + ", message=" + this.f29810b + ", dateTime=" + this.f29811c + ')';
    }
}
