package p1014t1;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import p759g1.C13800b;

/* JADX INFO: renamed from: t1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C19740q {

    /* JADX INFO: renamed from: a */
    public final long f62494a;

    /* JADX INFO: renamed from: b */
    public final long f62495b;

    /* JADX INFO: renamed from: c */
    public final long f62496c;

    /* JADX INFO: renamed from: d */
    public final long f62497d;

    /* JADX INFO: renamed from: e */
    public final boolean f62498e;

    /* JADX INFO: renamed from: f */
    public final float f62499f;

    /* JADX INFO: renamed from: g */
    public final int f62500g;

    /* JADX INFO: renamed from: h */
    public final boolean f62501h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f62502i;

    /* JADX INFO: renamed from: j */
    public final long f62503j;

    /* JADX INFO: renamed from: k */
    public final long f62504k;

    public C19740q(long j10, long j11, long j12, long j13, boolean z6, float f10, int i10, boolean z10, ArrayList arrayList, long j14, long j15) {
        this.f62494a = j10;
        this.f62495b = j11;
        this.f62496c = j12;
        this.f62497d = j13;
        this.f62498e = z6;
        this.f62499f = f10;
        this.f62500g = i10;
        this.f62501h = z10;
        this.f62502i = arrayList;
        this.f62503j = j14;
        this.f62504k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19740q)) {
            return false;
        }
        C19740q c19740q = (C19740q) obj;
        return C19737n.m20689a(this.f62494a, c19740q.f62494a) && this.f62495b == c19740q.f62495b && C13800b.m15303d(this.f62496c, c19740q.f62496c) && C13800b.m15303d(this.f62497d, c19740q.f62497d) && this.f62498e == c19740q.f62498e && Float.compare(this.f62499f, c19740q.f62499f) == 0 && AbstractC19736m.m20683e(this.f62500g, c19740q.f62500g) && this.f62501h == c19740q.f62501h && this.f62502i.equals(c19740q.f62502i) && C13800b.m15303d(this.f62503j, c19740q.f62503j) && C13800b.m15303d(this.f62504k, c19740q.f62504k);
    }

    public final int hashCode() {
        long j10 = this.f62494a;
        long j11 = this.f62495b;
        return C13800b.m15308i(this.f62504k) + ((C13800b.m15308i(this.f62503j) + ((this.f62502i.hashCode() + ((((AbstractC12107L1.m13819j(this.f62499f, (((C13800b.m15308i(this.f62497d) + ((C13800b.m15308i(this.f62496c) + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31)) * 31) + (this.f62498e ? 1231 : 1237)) * 31, 31) + this.f62500g) * 31) + (this.f62501h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) C19737n.m20690b(this.f62494a));
        sb2.append(", uptime=");
        sb2.append(this.f62495b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C13800b.m15313n(this.f62496c));
        sb2.append(", position=");
        sb2.append((Object) C13800b.m15313n(this.f62497d));
        sb2.append(", down=");
        sb2.append(this.f62498e);
        sb2.append(", pressure=");
        sb2.append(this.f62499f);
        sb2.append(", type=");
        int i10 = this.f62500g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb2.append((Object) str);
        sb2.append(", activeHover=");
        sb2.append(this.f62501h);
        sb2.append(", historical=");
        sb2.append(this.f62502i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C13800b.m15313n(this.f62503j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) C13800b.m15313n(this.f62504k));
        sb2.append(')');
        return sb2.toString();
    }
}
