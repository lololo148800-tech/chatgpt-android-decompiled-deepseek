package io.sentry.rrweb;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.rrweb.f */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15465f implements InterfaceC15374i0 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        ((C11248s) interfaceC15523y0).m12676y(ordinal());
    }
}
