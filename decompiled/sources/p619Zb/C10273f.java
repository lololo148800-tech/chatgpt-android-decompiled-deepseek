package p619Zb;

import ac.C10539a;
import android.javax.sip.C10808o;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p013Ab.C0420b;
import p030B2.RunnableC0758g0;
import p038Ba.AbstractC0865o;
import p071Ch.C1669I;
import p084D4.C1918i;
import p1060v9.AbstractC20502t;
import p1060v9.C20490h;
import p1060v9.C20493k;
import p117Eb.C2392v;
import p117Eb.RunnableC2394x;
import p401Qb.C6584a;
import p449S9.C7042K;
import p501Ub.C7604f;
import p501Ub.EnumC7610l;
import p523V9.C7996T4;
import p523V9.C8058c0;
import p523V9.C8232x6;
import p523V9.C8240y6;
import p523V9.EnumC7893G4;
import p523V9.EnumC7901H4;
import p523V9.EnumC7909I4;
import p523V9.EnumC7980R4;
import p523V9.EnumC7988S4;
import p546Wb.C8756b;
import p573Xb.C9430a;
import p615Z6.C10252z0;
import p664bc.C11334a;

/* JADX INFO: renamed from: Zb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10273f extends AbstractC0865o {

    /* JADX INFO: renamed from: j */
    public static boolean f30510j = true;

    /* JADX INFO: renamed from: d */
    public final C8756b f30511d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC10274g f30512e;

    /* JADX INFO: renamed from: f */
    public final C8232x6 f30513f;

    /* JADX INFO: renamed from: g */
    public final C8240y6 f30514g;

    /* JADX INFO: renamed from: h */
    public final C11334a f30515h;

    /* JADX INFO: renamed from: i */
    public boolean f30516i;

    public C10273f(C7604f c7604f, C8756b c8756b, InterfaceC10274g interfaceC10274g, C8232x6 c8232x6) {
        super(3);
        this.f30515h = new C11334a();
        AbstractC20502t.m21158i(c7604f, "MlKitContext can not be null");
        AbstractC20502t.m21158i(c8756b, "BarcodeScannerOptions can not be null");
        this.f30511d = c8756b;
        this.f30512e = interfaceC10274g;
        this.f30513f = c8232x6;
        this.f30514g = new C8240y6(c7604f.m7952b(), 0);
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: j */
    public final synchronized void mo1937j() {
        this.f30516i = this.f30512e.mo952c();
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: n */
    public final synchronized void mo1941n() {
        try {
            this.f30512e.mo951b();
            f30510j = true;
            C8232x6 c8232x6 = this.f30513f;
            C10252z0 c10252z0 = new C10252z0();
            c10252z0.f30456o0 = this.f30516i ? EnumC7893G4.TYPE_THICK : EnumC7893G4.TYPE_THIN;
            C2392v c2392v = new C2392v(16, false);
            c2392v.f7437o0 = AbstractC10269b.m10866a(this.f30511d);
            c10252z0.f30457p0 = new C7996T4(c2392v);
            EnumC7610l.f24056Y.execute(new RunnableC0758g0(c8232x6, new C0420b(c10252z0, 0), EnumC7909I4.ON_DEVICE_BARCODE_CLOSE, c8232x6.m8871c(), 1));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: q */
    public final Object mo1944q(C10539a c10539a) {
        ArrayList arrayListMo950a;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f30515h.m12769a(c10539a);
            try {
                arrayListMo950a = this.f30512e.mo950a(c10539a);
                m10869s(EnumC7901H4.NO_ERROR, jElapsedRealtime, c10539a, arrayListMo950a);
                f30510j = false;
            } catch (C6584a e10) {
                m10869s(e10.f21271Y == 14 ? EnumC7901H4.MODEL_NOT_DOWNLOADED : EnumC7901H4.UNKNOWN_ERROR, jElapsedRealtime, c10539a, null);
                throw e10;
            }
        }
        return arrayListMo950a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:45:0x0052 A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public final void m10869s(EnumC7901H4 enumC7901H4, long j10, C10539a c10539a, List list) {
        EnumC7980R4 enumC7980R4;
        EnumC7988S4 enumC7988S4;
        boolean z6 = false;
        C7042K c7042k = new C7042K();
        C7042K c7042k2 = new C7042K();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9430a c9430a = (C9430a) it.next();
                int iMo10220t = c9430a.f28411a.mo10220t();
                int i10 = -1;
                if (iMo10220t <= 4096) {
                    if (iMo10220t != 0) {
                    }
                    enumC7980R4 = (EnumC7980R4) AbstractC10269b.f30500a.get(i10);
                    if (enumC7980R4 == null) {
                        enumC7980R4 = EnumC7980R4.FORMAT_UNKNOWN;
                    }
                    c7042k.m7439m(enumC7980R4);
                    enumC7988S4 = (EnumC7988S4) AbstractC10269b.f30501b.get(c9430a.f28411a.mo10216j());
                    if (enumC7988S4 == null) {
                        enumC7988S4 = EnumC7988S4.TYPE_UNKNOWN;
                    }
                    c7042k2.m7439m(enumC7988S4);
                } else {
                    iMo10220t = -1;
                }
                i10 = iMo10220t;
                enumC7980R4 = (EnumC7980R4) AbstractC10269b.f30500a.get(i10);
                if (enumC7980R4 == null) {
                    enumC7980R4 = EnumC7980R4.FORMAT_UNKNOWN;
                }
                c7042k.m7439m(enumC7980R4);
                enumC7988S4 = (EnumC7988S4) AbstractC10269b.f30501b.get(c9430a.f28411a.mo10216j());
                if (enumC7988S4 == null) {
                    enumC7988S4 = EnumC7988S4.TYPE_UNKNOWN;
                }
                c7042k2.m7439m(enumC7988S4);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f30513f.m8870b(new C1669I(this, jElapsedRealtime, enumC7901H4, c7042k, c7042k2, c10539a), EnumC7909I4.ON_DEVICE_BARCODE_DETECT);
        C2392v c2392v = new C2392v(14, z6);
        c2392v.f7436Z = enumC7901H4;
        c2392v.f7437o0 = Boolean.valueOf(f30510j);
        c2392v.f7438p0 = AbstractC10269b.m10866a(this.f30511d);
        c2392v.f7439q0 = c7042k.m7441o();
        c2392v.f7440r0 = c7042k2.m7441o();
        EnumC7610l.f24056Y.execute(new RunnableC2394x(this.f30513f, new C8058c0(c2392v), jElapsedRealtime, new C10808o(this, 26)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f30516i;
        long j11 = jCurrentTimeMillis - jElapsedRealtime;
        C8240y6 c8240y6 = this.f30514g;
        int i11 = true != z10 ? 24301 : 24302;
        int i12 = enumC7901H4.f24853Y;
        synchronized (c8240y6) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (c8240y6.f25717b.get() != -1 && jElapsedRealtime2 - c8240y6.f25717b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c8240y6.f25716a.m21593c(new C20493k(0, Arrays.asList(new C20490h(i11, i12, 0, j11, jCurrentTimeMillis, null, null, 0, -1)))).m15124c(new C1918i(c8240y6, jElapsedRealtime2, 2));
        }
    }
}
