package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.HashMap;
import java.util.List;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C15426F implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final String f48071Y;

    /* JADX INFO: renamed from: Z */
    public final List f48072Z;

    /* JADX INFO: renamed from: o0 */
    public HashMap f48073o0;

    public C15426F(String str, List list) {
        this.f48071Y = str;
        this.f48072Z = list;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        String str = this.f48071Y;
        if (str != null) {
            c11248s.m12668o("rendering_system");
            c11248s.m12660D(str);
        }
        List list = this.f48072Z;
        if (list != null) {
            c11248s.m12668o("windows");
            c11248s.m12677z(interfaceC15127H, list);
        }
        HashMap map = this.f48073o0;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC14376f.m15826E(this.f48073o0, str2, c11248s, str2, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
