package p500Ua;

import android.app.PendingIntent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ua.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7593b extends AbstractC7592a {

    /* JADX INFO: renamed from: Y */
    public final PendingIntent f24015Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f24016Z;

    public C7593b(PendingIntent pendingIntent, boolean z6) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f24015Y = pendingIntent;
        this.f24016Z = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7592a) {
            AbstractC7592a abstractC7592a = (AbstractC7592a) obj;
            if (this.f24015Y.equals(((C7593b) abstractC7592a).f24015Y) && this.f24016Z == ((C7593b) abstractC7592a).f24016Z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24015Y.hashCode() ^ 1000003) * 1000003) ^ (true != this.f24016Z ? 1237 : 1231);
    }

    public final String toString() {
        return AbstractC14376f.m15823B(AbstractC10763a.m11058p("ReviewInfo{pendingIntent=", this.f24015Y.toString(), ", isNoOp="), this.f24016Z, "}");
    }
}
