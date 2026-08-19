package io.sentry.clientreport;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p544W9.AbstractC8656j3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.clientreport.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15335c implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final Date f47887Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f47888Z;

    /* JADX INFO: renamed from: o0 */
    public HashMap f47889o0;

    public C15335c(Date date, ArrayList arrayList) {
        this.f47887Y = date;
        this.f47888Z = arrayList;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12660D(AbstractC8656j3.m9344l(this.f47887Y));
        c11248s.m12668o("discarded_events");
        c11248s.m12677z(interfaceC15127H, this.f47888Z);
        HashMap map = this.f47889o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f47889o0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
