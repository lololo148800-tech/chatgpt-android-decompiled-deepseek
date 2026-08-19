package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.protocol.C15447t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8680n3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15108A1 extends AbstractC15160S0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: B0 */
    public File f47006B0;

    /* JADX INFO: renamed from: F0 */
    public int f47010F0;

    /* JADX INFO: renamed from: H0 */
    public Date f47012H0;

    /* JADX INFO: renamed from: L0 */
    public HashMap f47016L0;

    /* JADX INFO: renamed from: E0 */
    public C15447t f47009E0 = new C15447t((UUID) null);

    /* JADX INFO: renamed from: C0 */
    public String f47007C0 = "replay_event";

    /* JADX INFO: renamed from: D0 */
    public EnumC15527z1 f47008D0 = EnumC15527z1.SESSION;

    /* JADX INFO: renamed from: J0 */
    public List f47014J0 = new ArrayList();

    /* JADX INFO: renamed from: K0 */
    public List f47015K0 = new ArrayList();

    /* JADX INFO: renamed from: I0 */
    public List f47013I0 = new ArrayList();

    /* JADX INFO: renamed from: G0 */
    public Date f47011G0 = AbstractC8656j3.m9340h();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15108A1.class != obj.getClass()) {
            return false;
        }
        C15108A1 c15108a1 = (C15108A1) obj;
        return this.f47010F0 == c15108a1.f47010F0 && AbstractC8483G3.m9132b(this.f47007C0, c15108a1.f47007C0) && this.f47008D0 == c15108a1.f47008D0 && AbstractC8483G3.m9132b(this.f47009E0, c15108a1.f47009E0) && AbstractC8483G3.m9132b(this.f47013I0, c15108a1.f47013I0) && AbstractC8483G3.m9132b(this.f47014J0, c15108a1.f47014J0) && AbstractC8483G3.m9132b(this.f47015K0, c15108a1.f47015K0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47007C0, this.f47008D0, this.f47009E0, Integer.valueOf(this.f47010F0), this.f47013I0, this.f47014J0, this.f47015K0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("type");
        c11248s.m12660D(this.f47007C0);
        c11248s.m12668o("replay_type");
        c11248s.m12677z(interfaceC15127H, this.f47008D0);
        c11248s.m12668o("segment_id");
        c11248s.m12676y(this.f47010F0);
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12677z(interfaceC15127H, this.f47011G0);
        if (this.f47009E0 != null) {
            c11248s.m12668o("replay_id");
            c11248s.m12677z(interfaceC15127H, this.f47009E0);
        }
        if (this.f47012H0 != null) {
            c11248s.m12668o("replay_start_timestamp");
            c11248s.m12677z(interfaceC15127H, this.f47012H0);
        }
        if (this.f47013I0 != null) {
            c11248s.m12668o("urls");
            c11248s.m12677z(interfaceC15127H, this.f47013I0);
        }
        if (this.f47014J0 != null) {
            c11248s.m12668o("error_ids");
            c11248s.m12677z(interfaceC15127H, this.f47014J0);
        }
        if (this.f47015K0 != null) {
            c11248s.m12668o("trace_ids");
            c11248s.m12677z(interfaceC15127H, this.f47015K0);
        }
        AbstractC8680n3.m9371d(this, c11248s, interfaceC15127H);
        HashMap map = this.f47016L0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f47016L0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
