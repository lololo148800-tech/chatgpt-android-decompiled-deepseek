package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15358g1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C15445r implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48204Y;

    /* JADX INFO: renamed from: Z */
    public String f48205Z;

    /* JADX INFO: renamed from: o0 */
    public CopyOnWriteArraySet f48206o0;

    /* JADX INFO: renamed from: p0 */
    public CopyOnWriteArraySet f48207p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f48208q0;

    public C15445r(String str, String str2) {
        this.f48204Y = str;
        this.f48205Z = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15445r.class != obj.getClass()) {
            return false;
        }
        C15445r c15445r = (C15445r) obj;
        return this.f48204Y.equals(c15445r.f48204Y) && this.f48205Z.equals(c15445r.f48205Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48204Y, this.f48205Z});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
        c11248s.m12660D(this.f48204Y);
        c11248s.m12668o("version");
        c11248s.m12660D(this.f48205Z);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f48206o0;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = (CopyOnWriteArraySet) C15358g1.m16578n().f47946Z;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f48207p0;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = (CopyOnWriteArraySet) C15358g1.m16578n().f47945Y;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            c11248s.m12668o("packages");
            c11248s.m12677z(interfaceC15127H, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            c11248s.m12668o("integrations");
            c11248s.m12677z(interfaceC15127H, copyOnWriteArraySet2);
        }
        HashMap map = this.f48208q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48208q0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
