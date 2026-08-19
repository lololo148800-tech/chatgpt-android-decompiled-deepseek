package io.sentry;

import java.util.Locale;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.z1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15527z1 implements InterfaceC15374i0 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(name().toLowerCase(Locale.ROOT));
    }
}
