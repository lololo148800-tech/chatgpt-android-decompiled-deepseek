package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15429b implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48098Y;

    /* JADX INFO: renamed from: Z */
    public String f48099Z;

    /* JADX INFO: renamed from: o0 */
    public ConcurrentHashMap f48100o0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15429b.class != obj.getClass()) {
            return false;
        }
        C15429b c15429b = (C15429b) obj;
        return AbstractC8483G3.m9132b(this.f48098Y, c15429b.f48098Y) && AbstractC8483G3.m9132b(this.f48099Z, c15429b.f48099Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48098Y, this.f48099Z});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48098Y != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48098Y);
        }
        if (this.f48099Z != null) {
            c11248s.m12668o("version");
            c11248s.m12660D(this.f48099Z);
        }
        ConcurrentHashMap concurrentHashMap = this.f48100o0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48100o0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
