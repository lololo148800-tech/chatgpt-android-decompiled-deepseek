package p1036u9;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19499b;
import p1022t9.C19819d;
import p1022t9.InterfaceC19818c;
import p1060v9.C20486d;
import p1060v9.C20490h;
import p1060v9.C20491i;
import p1060v9.C20492j;
import p1060v9.C20508z;
import p377P9.HandlerC6378d;
import p746fa.C13606o;
import p746fa.InterfaceC13594c;

/* JADX INFO: renamed from: u9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C20175u implements InterfaceC13594c {

    /* JADX INFO: renamed from: Y */
    public final C20159e f63900Y;

    /* JADX INFO: renamed from: Z */
    public final int f63901Z;

    /* JADX INFO: renamed from: o0 */
    public final C20155a f63902o0;

    /* JADX INFO: renamed from: p0 */
    public final long f63903p0;

    /* JADX INFO: renamed from: q0 */
    public final long f63904q0;

    public C20175u(C20159e c20159e, int i10, C20155a c20155a, long j10, long j11) {
        this.f63900Y = c20159e;
        this.f63901Z = i10;
        this.f63902o0 = c20155a;
        this.f63903p0 = j10;
        this.f63904q0 = j11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static C20486d m21008a(C20171q c20171q, AbstractC11852a abstractC11852a, int i10) {
        C20508z c20508z = abstractC11852a.f36088u;
        C20486d c20486d = c20508z == null ? null : c20508z.f65113p0;
        if (c20486d != null && c20486d.f65033Z) {
            int[] iArr = c20486d.f65035p0;
            int i11 = 0;
            if (iArr == null) {
                int[] iArr2 = c20486d.f65037r0;
                if (iArr2 != null) {
                    while (i11 < iArr2.length) {
                        if (iArr2[i11] != i10) {
                            i11++;
                        }
                    }
                }
                if (c20171q.f63895l < c20486d.f65036q0) {
                    return c20486d;
                }
                return null;
            }
            while (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    if (c20171q.f63895l < c20486d.f65036q0) {
                        return c20486d;
                    }
                    return null;
                }
                i11++;
            }
        }
        return null;
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public final void mo258t(C13606o c13606o) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int iElapsedRealtime;
        if (this.f63900Y.m20981c()) {
            C20492j c20492j = (C20492j) C20491i.m21138a().f65068Y;
            if (c20492j == null || c20492j.f65070Z) {
                C20171q c20171q = (C20171q) this.f63900Y.f63866v0.get(this.f63902o0);
                if (c20171q != null) {
                    InterfaceC19818c interfaceC19818c = c20171q.f63885b;
                    if (interfaceC19818c instanceof AbstractC11852a) {
                        AbstractC11852a abstractC11852a = (AbstractC11852a) interfaceC19818c;
                        long j11 = 0;
                        boolean z6 = this.f63903p0 > 0;
                        int i16 = abstractC11852a.f36083p;
                        if (c20492j != null) {
                            z6 &= c20492j.f65071o0;
                            int i17 = c20492j.f65072p0;
                            int i18 = c20492j.f65073q0;
                            i10 = c20492j.f65069Y;
                            if (abstractC11852a.f36088u != null && !abstractC11852a.mo13200d()) {
                                C20486d c20486dM21008a = m21008a(c20171q, abstractC11852a, this.f63901Z);
                                if (c20486dM21008a == null) {
                                    return;
                                }
                                boolean z10 = c20486dM21008a.f65034o0 && this.f63903p0 > 0;
                                i18 = c20486dM21008a.f65036q0;
                                z6 = z10;
                            }
                            i12 = i17;
                            i11 = i18;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        C20159e c20159e = this.f63900Y;
                        if (c13606o.m15132k()) {
                            i14 = 0;
                            i15 = 0;
                        } else {
                            if (c13606o.f42985d) {
                                i14 = 100;
                            } else {
                                Exception excM15129h = c13606o.m15129h();
                                if (excM15129h instanceof C19819d) {
                                    Status status = ((C19819d) excM15129h).f62870Y;
                                    i13 = status.f36052Y;
                                    C19499b c19499b = status.f36055p0;
                                    if (c19499b != null) {
                                        i15 = c19499b.f61940Z;
                                        i14 = i13;
                                    }
                                } else {
                                    i13 = 101;
                                }
                                i14 = i13;
                            }
                            i15 = -1;
                        }
                        if (z6) {
                            long j12 = this.f63903p0;
                            long j13 = this.f63904q0;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                            j10 = j12;
                            j11 = jCurrentTimeMillis;
                        } else {
                            j10 = 0;
                            iElapsedRealtime = -1;
                        }
                        c20159e.getClass();
                        C20176v c20176v = new C20176v(new C20490h(this.f63901Z, i14, i15, j10, j11, null, null, i16, iElapsedRealtime), i10, i12, i11);
                        HandlerC6378d handlerC6378d = c20159e.f63870z0;
                        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(18, c20176v));
                    }
                }
            }
        }
    }
}
