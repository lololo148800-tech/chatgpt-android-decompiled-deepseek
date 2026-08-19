package p722e8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9306j0;
import p677c8.C11691c;
import p775h2.AbstractC14376f;
import p944p8.C18309a;

/* JADX INFO: renamed from: e8.D */
/* JADX INFO: loaded from: classes.dex */
public final class C13294D extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C18309a f42020b;

    /* JADX INFO: renamed from: c */
    public final Long f42021c;

    /* JADX INFO: renamed from: d */
    public final String f42022d;

    /* JADX INFO: renamed from: e */
    public final int f42023e;

    /* JADX INFO: renamed from: f */
    public final Throwable f42024f;

    /* JADX INFO: renamed from: g */
    public final Map f42025g;

    /* JADX INFO: renamed from: h */
    public final C11691c f42026h;

    public C13294D(C18309a c18309a, Long l4, String str, Throwable th2, Map map) {
        C11691c c11691c = new C11691c();
        AbstractC14376f.m15825D(1, "source");
        this.f42020b = c18309a;
        this.f42021c = l4;
        this.f42022d = str;
        this.f42023e = 1;
        this.f42024f = th2;
        this.f42025g = map;
        this.f42026h = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42026h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13294D)) {
            return false;
        }
        C13294D c13294d = (C13294D) obj;
        return AbstractC16544l.m18089b(this.f42020b, c13294d.f42020b) && AbstractC16544l.m18089b(this.f42021c, c13294d.f42021c) && AbstractC16544l.m18089b(this.f42022d, c13294d.f42022d) && this.f42023e == c13294d.f42023e && AbstractC16544l.m18089b(this.f42024f, c13294d.f42024f) && AbstractC16544l.m18089b(this.f42025g, c13294d.f42025g) && AbstractC16544l.m18089b(this.f42026h, c13294d.f42026h);
    }

    public final int hashCode() {
        int iHashCode = this.f42020b.f58438a.hashCode() * 31;
        Long l4 = this.f42021c;
        return this.f42026h.hashCode() + AbstractC20734X.m21250u((this.f42024f.hashCode() + AbstractC12107L1.m13820k(this.f42023e, AbstractC0168G.m527p((iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f42022d), 31)) * 31, 31, this.f42025g);
    }

    public final String toString() {
        return "StopResourceWithError(key=" + this.f42020b + ", statusCode=" + this.f42021c + ", message=" + this.f42022d + ", source=" + AbstractC9306j0.m9902u(this.f42023e) + ", throwable=" + this.f42024f + ", attributes=" + this.f42025g + ", eventTime=" + this.f42026h + Separators.RPAREN;
    }
}
