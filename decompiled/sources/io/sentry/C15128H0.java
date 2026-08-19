package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.vendor.gson.stream.C15515c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15128H0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public Integer f47093Y;

    /* JADX INFO: renamed from: Z */
    public List f47094Z;

    /* JADX INFO: renamed from: o0 */
    public HashMap f47095o0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15128H0.class != obj.getClass()) {
            return false;
        }
        C15128H0 c15128h0 = (C15128H0) obj;
        return AbstractC8483G3.m9132b(this.f47093Y, c15128h0.f47093Y) && AbstractC8483G3.m9132b(this.f47094Z, c15128h0.f47094Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47093Y, this.f47094Z});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f47093Y != null) {
            c11248s.m12668o("segment_id");
            c11248s.m12659B(this.f47093Y);
        }
        HashMap map = this.f47095o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f47095o0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        C15515c c15515c = (C15515c) c11248s.f34081Z;
        c15515c.f48462r0 = true;
        if (this.f47093Y != null) {
            c15515c.m16722S();
            c15515c.m16723a();
            c15515c.f48457Y.append((CharSequence) Separators.RETURN);
        }
        List list = this.f47094Z;
        if (list != null) {
            c11248s.m12677z(interfaceC15127H, list);
        }
        c15515c.f48462r0 = false;
    }
}
