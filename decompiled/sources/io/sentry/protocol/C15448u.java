package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.Objects;

/* JADX INFO: renamed from: io.sentry.protocol.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C15448u implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final String f48218Y;

    /* JADX INFO: renamed from: Z */
    public final String f48219Z;

    /* JADX INFO: renamed from: o0 */
    public HashMap f48220o0;

    public C15448u(String str, String str2) {
        this.f48218Y = str;
        this.f48219Z = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15448u.class != obj.getClass()) {
            return false;
        }
        C15448u c15448u = (C15448u) obj;
        return Objects.equals(this.f48218Y, c15448u.f48218Y) && Objects.equals(this.f48219Z, c15448u.f48219Z);
    }

    public final int hashCode() {
        return Objects.hash(this.f48218Y, this.f48219Z);
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
        c11248s.m12660D(this.f48218Y);
        c11248s.m12668o("version");
        c11248s.m12660D(this.f48219Z);
        HashMap map = this.f48220o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48220o0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
