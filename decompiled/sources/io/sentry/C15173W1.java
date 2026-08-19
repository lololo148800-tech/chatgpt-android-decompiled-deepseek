package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.protocol.C15447t;
import java.util.HashMap;
import p571X9.AbstractC9306j0;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.W1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15173W1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final C15447t f47233Y;

    /* JADX INFO: renamed from: Z */
    public final String f47234Z;

    /* JADX INFO: renamed from: o0 */
    public final String f47235o0;

    /* JADX INFO: renamed from: p0 */
    public final String f47236p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f47237q0;

    public C15173W1(C15447t c15447t, String str, String str2, String str3) {
        this.f47233Y = c15447t;
        this.f47234Z = str;
        this.f47235o0 = str2;
        this.f47236p0 = str3;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("event_id");
        this.f47233Y.serialize(c11248s, interfaceC15127H);
        String str = this.f47234Z;
        if (str != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(str);
        }
        String str2 = this.f47235o0;
        if (str2 != null) {
            c11248s.m12668o("email");
            c11248s.m12660D(str2);
        }
        String str3 = this.f47236p0;
        if (str3 != null) {
            c11248s.m12668o("comments");
            c11248s.m12660D(str3);
        }
        HashMap map = this.f47237q0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC14376f.m15826E(this.f47237q0, str4, c11248s, str4, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f47233Y);
        sb2.append(", name='");
        sb2.append(this.f47234Z);
        sb2.append("', email='");
        sb2.append(this.f47235o0);
        sb2.append("', comments='");
        return AbstractC9306j0.m9891j(this.f47236p0, "'}", sb2);
    }
}
