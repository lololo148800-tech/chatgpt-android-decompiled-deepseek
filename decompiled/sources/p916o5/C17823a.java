package p916o5;

import android.os.StatFs;
import java.io.File;
import p025An.AbstractC0593T;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0691y;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: o5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17823a {

    /* JADX INFO: renamed from: a */
    public C0654C f56855a;

    /* JADX INFO: renamed from: b */
    public final C0691y f56856b = AbstractC0682p.f1991a;

    /* JADX INFO: renamed from: c */
    public double f56857c = 0.02d;

    /* JADX INFO: renamed from: d */
    public final long f56858d = 10485760;

    /* JADX INFO: renamed from: e */
    public final long f56859e = 262144000;

    /* JADX INFO: renamed from: f */
    public long f56860f;

    /* JADX INFO: renamed from: g */
    public final ExecutorC3515d f56861g;

    public C17823a() {
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f56861g = ExecutorC3515d.f10633Z;
    }

    /* JADX INFO: renamed from: a */
    public final C17832j m19574a() {
        long jM8922m;
        C0654C c0654c = this.f56855a;
        if (c0654c == null) {
            throw new IllegalStateException("directory == null");
        }
        if (this.f56857c > 0.0d) {
            try {
                File fileM1322f = c0654c.m1322f();
                fileM1322f.mkdir();
                StatFs statFs = new StatFs(fileM1322f.getAbsolutePath());
                jM8922m = AbstractC8301I.m8922m((long) (this.f56857c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f56858d, this.f56859e);
            } catch (Exception unused) {
                jM8922m = this.f56858d;
            }
        } else {
            jM8922m = this.f56860f;
        }
        return new C17832j(jM8922m, this.f56856b, c0654c, this.f56861g);
    }
}
