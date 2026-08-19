package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import java.util.Date;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15345d implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final Long f47904Y;

    /* JADX INFO: renamed from: Z */
    public Date f47905Z;

    /* JADX INFO: renamed from: o0 */
    public String f47906o0;

    /* JADX INFO: renamed from: p0 */
    public String f47907p0;

    /* JADX INFO: renamed from: q0 */
    public ConcurrentHashMap f47908q0;

    /* JADX INFO: renamed from: r0 */
    public String f47909r0;

    /* JADX INFO: renamed from: s0 */
    public String f47910s0;

    /* JADX INFO: renamed from: t0 */
    public EnumC15375i1 f47911t0;

    /* JADX INFO: renamed from: u0 */
    public ConcurrentHashMap f47912u0;

    public C15345d(Date date) {
        this.f47908q0 = new ConcurrentHashMap();
        this.f47905Z = date;
        this.f47904Y = null;
    }

    /* JADX INFO: renamed from: a */
    public final Date m16573a() {
        Date date = this.f47905Z;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l4 = this.f47904Y;
        if (l4 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateM9341i = AbstractC8656j3.m9341i(l4.longValue());
        this.f47905Z = dateM9341i;
        return dateM9341i;
    }

    /* JADX INFO: renamed from: b */
    public final void m16574b(Object obj, String str) {
        this.f47908q0.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15345d.class != obj.getClass()) {
            return false;
        }
        C15345d c15345d = (C15345d) obj;
        return m16573a().getTime() == c15345d.m16573a().getTime() && AbstractC8483G3.m9132b(this.f47906o0, c15345d.f47906o0) && AbstractC8483G3.m9132b(this.f47907p0, c15345d.f47907p0) && AbstractC8483G3.m9132b(this.f47909r0, c15345d.f47909r0) && AbstractC8483G3.m9132b(this.f47910s0, c15345d.f47910s0) && this.f47911t0 == c15345d.f47911t0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47905Z, this.f47906o0, this.f47907p0, this.f47909r0, this.f47910s0, this.f47911t0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12677z(interfaceC15127H, m16573a());
        if (this.f47906o0 != null) {
            c11248s.m12668o("message");
            c11248s.m12660D(this.f47906o0);
        }
        if (this.f47907p0 != null) {
            c11248s.m12668o("type");
            c11248s.m12660D(this.f47907p0);
        }
        c11248s.m12668o("data");
        c11248s.m12677z(interfaceC15127H, this.f47908q0);
        if (this.f47909r0 != null) {
            c11248s.m12668o("category");
            c11248s.m12660D(this.f47909r0);
        }
        if (this.f47910s0 != null) {
            c11248s.m12668o("origin");
            c11248s.m12660D(this.f47910s0);
        }
        if (this.f47911t0 != null) {
            c11248s.m12668o("level");
            c11248s.m12677z(interfaceC15127H, this.f47911t0);
        }
        ConcurrentHashMap concurrentHashMap = this.f47912u0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47912u0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15345d(long j10) {
        this.f47908q0 = new ConcurrentHashMap();
        this.f47904Y = Long.valueOf(j10);
        this.f47905Z = null;
    }

    public C15345d(C15345d c15345d) {
        this.f47908q0 = new ConcurrentHashMap();
        this.f47905Z = c15345d.f47905Z;
        this.f47904Y = c15345d.f47904Y;
        this.f47906o0 = c15345d.f47906o0;
        this.f47907p0 = c15345d.f47907p0;
        this.f47909r0 = c15345d.f47909r0;
        this.f47910s0 = c15345d.f47910s0;
        ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a(c15345d.f47908q0);
        if (concurrentHashMapM9064a != null) {
            this.f47908q0 = concurrentHashMapM9064a;
        }
        this.f47912u0 = AbstractC8453B3.m9064a(c15345d.f47912u0);
        this.f47911t0 = c15345d.f47911t0;
    }

    public C15345d() {
        this(System.currentTimeMillis());
    }
}
