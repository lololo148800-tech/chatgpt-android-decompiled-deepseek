package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p544W9.AbstractC8656j3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.I1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15132I1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: A0 */
    public final Object f47097A0 = new Object();

    /* JADX INFO: renamed from: B0 */
    public ConcurrentHashMap f47098B0;

    /* JADX INFO: renamed from: Y */
    public final Date f47099Y;

    /* JADX INFO: renamed from: Z */
    public Date f47100Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicInteger f47101o0;

    /* JADX INFO: renamed from: p0 */
    public final String f47102p0;

    /* JADX INFO: renamed from: q0 */
    public final UUID f47103q0;

    /* JADX INFO: renamed from: r0 */
    public Boolean f47104r0;

    /* JADX INFO: renamed from: s0 */
    public EnumC15129H1 f47105s0;

    /* JADX INFO: renamed from: t0 */
    public Long f47106t0;

    /* JADX INFO: renamed from: u0 */
    public Double f47107u0;

    /* JADX INFO: renamed from: v0 */
    public final String f47108v0;

    /* JADX INFO: renamed from: w0 */
    public String f47109w0;

    /* JADX INFO: renamed from: x0 */
    public final String f47110x0;

    /* JADX INFO: renamed from: y0 */
    public final String f47111y0;

    /* JADX INFO: renamed from: z0 */
    public String f47112z0;

    public C15132I1(EnumC15129H1 enumC15129H1, Date date, Date date2, int i10, String str, UUID uuid, Boolean bool, Long l4, Double d10, String str2, String str3, String str4, String str5, String str6) {
        this.f47105s0 = enumC15129H1;
        this.f47099Y = date;
        this.f47100Z = date2;
        this.f47101o0 = new AtomicInteger(i10);
        this.f47102p0 = str;
        this.f47103q0 = uuid;
        this.f47104r0 = bool;
        this.f47106t0 = l4;
        this.f47107u0 = d10;
        this.f47108v0 = str2;
        this.f47109w0 = str3;
        this.f47110x0 = str4;
        this.f47111y0 = str5;
        this.f47112z0 = str6;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15132I1 clone() {
        return new C15132I1(this.f47105s0, this.f47099Y, this.f47100Z, this.f47101o0.get(), this.f47102p0, this.f47103q0, this.f47104r0, this.f47106t0, this.f47107u0, this.f47108v0, this.f47109w0, this.f47110x0, this.f47111y0, this.f47112z0);
    }

    /* JADX INFO: renamed from: b */
    public final void m16302b(Date date) {
        synchronized (this.f47097A0) {
            try {
                this.f47104r0 = null;
                if (this.f47105s0 == EnumC15129H1.Ok) {
                    this.f47105s0 = EnumC15129H1.Exited;
                }
                if (date != null) {
                    this.f47100Z = date;
                } else {
                    this.f47100Z = AbstractC8656j3.m9340h();
                }
                Date date2 = this.f47100Z;
                if (date2 != null) {
                    this.f47107u0 = Double.valueOf(Math.abs(date2.getTime() - this.f47099Y.getTime()) / 1000.0d);
                    long time = this.f47100Z.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f47106t0 = Long.valueOf(time);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16303c(EnumC15129H1 enumC15129H1, String str, boolean z6, String str2) {
        boolean z10;
        boolean z11;
        synchronized (this.f47097A0) {
            z10 = true;
            if (enumC15129H1 != null) {
                try {
                    this.f47105s0 = enumC15129H1;
                    z11 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z11 = false;
            }
            if (str != null) {
                this.f47109w0 = str;
                z11 = true;
            }
            if (z6) {
                this.f47101o0.addAndGet(1);
                z11 = true;
            }
            if (str2 != null) {
                this.f47112z0 = str2;
            } else {
                z10 = z11;
            }
            if (z10) {
                this.f47104r0 = null;
                Date dateM9340h = AbstractC8656j3.m9340h();
                this.f47100Z = dateM9340h;
                if (dateM9340h != null) {
                    long time = dateM9340h.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f47106t0 = Long.valueOf(time);
                }
            }
        }
        return z10;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        UUID uuid = this.f47103q0;
        if (uuid != null) {
            c11248s.m12668o("sid");
            c11248s.m12660D(uuid.toString());
        }
        String str = this.f47102p0;
        if (str != null) {
            c11248s.m12668o("did");
            c11248s.m12660D(str);
        }
        if (this.f47104r0 != null) {
            c11248s.m12668o("init");
            c11248s.m12658A(this.f47104r0);
        }
        c11248s.m12668o("started");
        c11248s.m12677z(interfaceC15127H, this.f47099Y);
        c11248s.m12668o("status");
        c11248s.m12677z(interfaceC15127H, this.f47105s0.name().toLowerCase(Locale.ROOT));
        if (this.f47106t0 != null) {
            c11248s.m12668o("seq");
            c11248s.m12659B(this.f47106t0);
        }
        c11248s.m12668o("errors");
        c11248s.m12676y(this.f47101o0.intValue());
        if (this.f47107u0 != null) {
            c11248s.m12668o("duration");
            c11248s.m12659B(this.f47107u0);
        }
        if (this.f47100Z != null) {
            c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
            c11248s.m12677z(interfaceC15127H, this.f47100Z);
        }
        if (this.f47112z0 != null) {
            c11248s.m12668o("abnormal_mechanism");
            c11248s.m12677z(interfaceC15127H, this.f47112z0);
        }
        c11248s.m12668o("attrs");
        c11248s.m12663d();
        c11248s.m12668o("release");
        c11248s.m12677z(interfaceC15127H, this.f47111y0);
        String str2 = this.f47110x0;
        if (str2 != null) {
            c11248s.m12668o("environment");
            c11248s.m12677z(interfaceC15127H, str2);
        }
        String str3 = this.f47108v0;
        if (str3 != null) {
            c11248s.m12668o("ip_address");
            c11248s.m12677z(interfaceC15127H, str3);
        }
        if (this.f47109w0 != null) {
            c11248s.m12668o("user_agent");
            c11248s.m12677z(interfaceC15127H, this.f47109w0);
        }
        c11248s.m12665h();
        ConcurrentHashMap concurrentHashMap = this.f47098B0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47098B0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
