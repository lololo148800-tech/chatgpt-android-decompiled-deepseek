package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Locale;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.protocol.e */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15432e implements InterfaceC15374i0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(toString().toLowerCase(Locale.ROOT));
    }
}
