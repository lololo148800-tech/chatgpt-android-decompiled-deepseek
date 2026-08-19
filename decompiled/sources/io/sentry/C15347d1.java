package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15447t;
import java.util.AbstractMap;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8680n3;
import p658b5.C11248s;
import p690cp.C12910A;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15347d1 extends AbstractC15160S0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: B0 */
    public Date f47914B0;

    /* JADX INFO: renamed from: C0 */
    public C15438k f47915C0;

    /* JADX INFO: renamed from: D0 */
    public String f47916D0;

    /* JADX INFO: renamed from: E0 */
    public C12910A f47917E0;

    /* JADX INFO: renamed from: F0 */
    public C12910A f47918F0;

    /* JADX INFO: renamed from: G0 */
    public EnumC15375i1 f47919G0;

    /* JADX INFO: renamed from: H0 */
    public String f47920H0;

    /* JADX INFO: renamed from: I0 */
    public List f47921I0;

    /* JADX INFO: renamed from: J0 */
    public ConcurrentHashMap f47922J0;

    /* JADX INFO: renamed from: K0 */
    public AbstractMap f47923K0;

    public C15347d1(Exception exc) {
        this();
        this.f47203v0 = exc;
    }

    /* JADX INFO: renamed from: d */
    public final C15446s m16575d() {
        Boolean bool;
        C12910A c12910a = this.f47918F0;
        if (c12910a == null) {
            return null;
        }
        for (C15446s c15446s : c12910a.f41066a) {
            C15437j c15437j = c15446s.f48214r0;
            if (c15437j != null && (bool = c15437j.f48160p0) != null && !bool.booleanValue()) {
                return c15446s;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16576e() {
        C12910A c12910a = this.f47918F0;
        return (c12910a == null || c12910a.f41066a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12677z(interfaceC15127H, this.f47914B0);
        if (this.f47915C0 != null) {
            c11248s.m12668o("message");
            c11248s.m12677z(interfaceC15127H, this.f47915C0);
        }
        if (this.f47916D0 != null) {
            c11248s.m12668o("logger");
            c11248s.m12660D(this.f47916D0);
        }
        C12910A c12910a = this.f47917E0;
        if (c12910a != null && !c12910a.f41066a.isEmpty()) {
            c11248s.m12668o("threads");
            c11248s.m12663d();
            c11248s.m12668o("values");
            c11248s.m12677z(interfaceC15127H, this.f47917E0.f41066a);
            c11248s.m12665h();
        }
        C12910A c12910a2 = this.f47918F0;
        if (c12910a2 != null && !c12910a2.f41066a.isEmpty()) {
            c11248s.m12668o("exception");
            c11248s.m12663d();
            c11248s.m12668o("values");
            c11248s.m12677z(interfaceC15127H, this.f47918F0.f41066a);
            c11248s.m12665h();
        }
        if (this.f47919G0 != null) {
            c11248s.m12668o("level");
            c11248s.m12677z(interfaceC15127H, this.f47919G0);
        }
        if (this.f47920H0 != null) {
            c11248s.m12668o("transaction");
            c11248s.m12660D(this.f47920H0);
        }
        if (this.f47921I0 != null) {
            c11248s.m12668o("fingerprint");
            c11248s.m12677z(interfaceC15127H, this.f47921I0);
        }
        if (this.f47923K0 != null) {
            c11248s.m12668o("modules");
            c11248s.m12677z(interfaceC15127H, this.f47923K0);
        }
        AbstractC8680n3.m9371d(this, c11248s, interfaceC15127H);
        ConcurrentHashMap concurrentHashMap = this.f47922J0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47922J0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15347d1() {
        C15447t c15447t = new C15447t((UUID) null);
        Date dateM9340h = AbstractC8656j3.m9340h();
        super(c15447t);
        this.f47914B0 = dateM9340h;
    }
}
