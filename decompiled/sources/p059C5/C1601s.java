package p059C5;

import android.os.StatFs;
import bo.C11518f;
import bo.C11529q;
import bo.C11533u;
import bo.C11536x;
import bo.C11537y;
import io.ktor.client.plugins.auth.C15056a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.TimeZone;
import mm.C17296C;
import mo.C17355v;
import mo.C17356w;
import np.AbstractC17712d;
import p008A6.C0383c;
import p025An.AbstractC0593T;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0691y;
import p049Bm.InterfaceC1426a;
import p1045ul.AbstractC20384a;
import p1091wn.AbstractC21031l;
import p135F5.C2672h;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p283L5.InterfaceC4937c;
import p349O0.C5984W0;
import p354O5.C6133c;
import p354O5.C6134d;
import p409Qk.AbstractC6756g;
import p445S5.C7021a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9137G4;
import p571X9.AbstractC9183O2;
import p658b5.C11234e;
import p666bl.C11500p;
import p951pp.C18533c;
import p960q9.C18655i;
import sl.C19675j;

/* JADX INFO: renamed from: C5.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1601s implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4482Y;

    public /* synthetic */ C1601s(int i10) {
        this.f4482Y = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        long jM8922m;
        switch (this.f4482Y) {
            case 0:
                C5984W0 c5984w0 = AbstractC1602t.f4483a;
                return C1586d.f4453a;
            case 1:
                return C1596n.f4474a;
            case 2:
                C0691y c0691y = AbstractC0682p.f1991a;
                C3516e c3516e = AbstractC0593T.f1824a;
                ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
                C0654C c0654cM1321e = AbstractC0682p.f1992b.m1321e("coil3_disk_cache");
                try {
                    File fileM1322f = c0654cM1321e.m1322f();
                    fileM1322f.mkdir();
                    StatFs statFs = new StatFs(fileM1322f.getAbsolutePath());
                    jM8922m = AbstractC8301I.m8922m((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                    jM8922m = 10485760;
                }
                return new C2672h(jM8922m, c0691y, c0654cM1321e, executorC3515d);
            case 3:
                return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
            case 4:
                return new C17355v();
            case 5:
                return InterfaceC4937c.f16108a;
            case 6:
                return new C6133c(AbstractC9183O2.m9738a(AbstractC6756g.f21688a, new C0383c(9)));
            case 7:
                return new C19675j();
            case 8:
                try {
                    return AbstractC9137G4.m9680b(AbstractC21031l.m21499w(AbstractC21031l.m21483g(Arrays.asList(new C6134d()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 9:
                try {
                    return AbstractC9137G4.m9680b(AbstractC21031l.m21499w(AbstractC21031l.m21483g(Arrays.asList(new C7021a()).iterator())));
                } catch (Throwable th3) {
                    throw new ServiceConfigurationError(th3.getMessage(), th3);
                }
            case 10:
                return new C17356w(new C17355v());
            case 11:
                return C17296C.f55119a;
            case 12:
                TimeZone timeZone = AbstractC20384a.f64469a;
                return Long.valueOf(System.currentTimeMillis());
            case 13:
                C18655i c18655i = new C18655i(25);
                try {
                    return !(AbstractC17712d.m19445b().m19898a() instanceof C18533c) ? new C11500p(c18655i) : new C11500p(new C11234e(Class.forName("android.util.Log"), c18655i));
                } catch (ClassNotFoundException unused2) {
                    return new C11500p(c18655i);
                }
            case 14:
                return C11537y.f34905b;
            case 15:
                return C11533u.f34897b;
            case 16:
                return C11529q.f34894b;
            case 17:
                return C11536x.f34903b;
            case 18:
                return C11518f.f34850b;
            case 19:
                return new LinkedHashMap();
            case 20:
                return new C15056a();
            case 21:
                return new LinkedHashMap();
            case 22:
                return new C15056a();
            case 23:
                return new LinkedHashMap();
            case 24:
                return new ArrayList();
            case 25:
                return new ArrayList();
            case 26:
                return new C17356w();
            default:
                return null;
        }
    }
}
