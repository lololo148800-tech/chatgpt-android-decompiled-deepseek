package io.sentry.rrweb;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.rrweb.d */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15463d implements InterfaceC15374i0 {
    Mutation,
    MouseMove,
    MouseInteraction,
    Scroll,
    ViewportResize,
    Input,
    TouchMove,
    MediaInteraction,
    StyleSheetRule,
    CanvasMutation,
    Font,
    Log,
    Drag,
    StyleDeclaration,
    Selection,
    AdoptedStyleSheet,
    CustomElement;

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        ((C11248s) interfaceC15523y0).m12676y(ordinal());
    }
}
