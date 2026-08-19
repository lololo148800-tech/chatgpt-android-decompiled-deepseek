package io.sentry.clientreport;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.clientreport.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15338f implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final String f47892Y;

    /* JADX INFO: renamed from: Z */
    public final String f47893Z;

    /* JADX INFO: renamed from: o0 */
    public final Long f47894o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap f47895p0;

    public C15338f(String str, String str2, Long l4) {
        this.f47892Y = str;
        this.f47893Z = str2;
        this.f47894o0 = l4;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("reason");
        c11248s.m12660D(this.f47892Y);
        c11248s.m12668o("category");
        c11248s.m12660D(this.f47893Z);
        c11248s.m12668o("quantity");
        c11248s.m12659B(this.f47894o0);
        HashMap map = this.f47895p0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f47895p0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f47892Y + "', category='" + this.f47893Z + "', quantity=" + this.f47894o0 + '}';
    }
}
