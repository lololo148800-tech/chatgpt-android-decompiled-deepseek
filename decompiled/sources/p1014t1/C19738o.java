package p1014t1;

import java.util.ArrayList;
import p105E.C2222a;
import p759g1.C13800b;
import p909nm.C17689w;

/* JADX INFO: renamed from: t1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C19738o {

    /* JADX INFO: renamed from: a */
    public final long f62478a;

    /* JADX INFO: renamed from: b */
    public final long f62479b;

    /* JADX INFO: renamed from: c */
    public final long f62480c;

    /* JADX INFO: renamed from: d */
    public final boolean f62481d;

    /* JADX INFO: renamed from: e */
    public final float f62482e;

    /* JADX INFO: renamed from: f */
    public final long f62483f;

    /* JADX INFO: renamed from: g */
    public final long f62484g;

    /* JADX INFO: renamed from: h */
    public final boolean f62485h;

    /* JADX INFO: renamed from: i */
    public final int f62486i;

    /* JADX INFO: renamed from: j */
    public final long f62487j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f62488k;

    /* JADX INFO: renamed from: l */
    public final long f62489l;

    /* JADX INFO: renamed from: m */
    public C2222a f62490m;

    public C19738o(long j10, long j11, long j12, boolean z6, float f10, long j13, long j14, boolean z10, boolean z11, int i10, long j15) {
        this.f62478a = j10;
        this.f62479b = j11;
        this.f62480c = j12;
        this.f62481d = z6;
        this.f62482e = f10;
        this.f62483f = j13;
        this.f62484g = j14;
        this.f62485h = z10;
        this.f62486i = i10;
        this.f62487j = j15;
        this.f62489l = 0L;
        C2222a c2222a = new C2222a();
        c2222a.f6805a = z11;
        c2222a.f6806b = z11;
        this.f62490m = c2222a;
    }

    /* JADX INFO: renamed from: a */
    public final void m20691a() {
        C2222a c2222a = this.f62490m;
        c2222a.f6806b = true;
        c2222a.f6805a = true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20692b() {
        C2222a c2222a = this.f62490m;
        return c2222a.f6806b || c2222a.f6805a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) C19737n.m20690b(this.f62478a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f62479b);
        sb2.append(", position=");
        sb2.append((Object) C13800b.m15313n(this.f62480c));
        sb2.append(", pressed=");
        sb2.append(this.f62481d);
        sb2.append(", pressure=");
        sb2.append(this.f62482e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f62483f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C13800b.m15313n(this.f62484g));
        sb2.append(", previousPressed=");
        sb2.append(this.f62485h);
        sb2.append(", isConsumed=");
        sb2.append(m20692b());
        sb2.append(", type=");
        int i10 = this.f62486i;
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
        sb2.append(", historical=");
        Object obj = this.f62488k;
        if (obj == null) {
            obj = C17689w.f56480Y;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C13800b.m15313n(this.f62487j));
        sb2.append(')');
        return sb2.toString();
    }

    public C19738o(long j10, long j11, long j12, boolean z6, float f10, long j13, long j14, boolean z10, int i10, ArrayList arrayList, long j15, long j16) {
        this(j10, j11, j12, z6, f10, j13, j14, z10, false, i10, j15);
        this.f62488k = arrayList;
        this.f62489l = j16;
    }
}
