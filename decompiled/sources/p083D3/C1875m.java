package p083D3;

import android.media.metrics.LogSessionId;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p817j$.util.Objects;

/* JADX INFO: renamed from: D3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1875m {

    /* JADX INFO: renamed from: a */
    public final String f5418a;

    /* JADX INFO: renamed from: b */
    public final C1874l f5419b;

    /* JADX INFO: renamed from: c */
    public final Object f5420c;

    static {
        if (AbstractC20817s.f66106a < 31) {
            new C1875m("");
        } else {
            new C1875m(C1874l.f5416b, "");
        }
    }

    public C1875m(String str) {
        AbstractC20800b.m21320h(AbstractC20817s.f66106a < 31);
        this.f5418a = str;
        this.f5419b = null;
        this.f5420c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875m)) {
            return false;
        }
        C1875m c1875m = (C1875m) obj;
        return Objects.equals(this.f5418a, c1875m.f5418a) && Objects.equals(this.f5419b, c1875m.f5419b) && Objects.equals(this.f5420c, c1875m.f5420c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5418a, this.f5419b, this.f5420c);
    }

    public C1875m(LogSessionId logSessionId, String str) {
        this(new C1874l(logSessionId), str);
    }

    public C1875m(C1874l c1874l, String str) {
        this.f5419b = c1874l;
        this.f5418a = str;
        this.f5420c = new Object();
    }
}
