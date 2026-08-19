package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C15516w;
import io.sentry.C15526z0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.io.File;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.android.core.G */
/* JADX INFO: loaded from: classes3.dex */
public final class FileObserverC15189G extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final String f47329a;

    /* JADX INFO: renamed from: b */
    public final C15526z0 f47330b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15127H f47331c;

    /* JADX INFO: renamed from: d */
    public final long f47332d;

    public FileObserverC15189G(String str, C15526z0 c15526z0, InterfaceC15127H interfaceC15127H, long j10) {
        super(str);
        this.f47329a = str;
        this.f47330b = c15526z0;
        AbstractC8483G3.m9133c(interfaceC15127H, "Logger is required.");
        this.f47331c = interfaceC15127H;
        this.f47332d = j10;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        Integer numValueOf = Integer.valueOf(i10);
        String str2 = this.f47329a;
        InterfaceC15127H interfaceC15127H = this.f47331c;
        interfaceC15127H.mo16298o(enumC15375i1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C15516w c15516wM9087a = AbstractC8465D3.m9087a(new C15188F(this.f47332d, interfaceC15127H));
        String strM9891j = AbstractC9306j0.m9891j(File.separator, str, AbstractC9306j0.m9893l(str2));
        C15526z0 c15526z0 = this.f47330b;
        c15526z0.getClass();
        AbstractC8483G3.m9133c(strM9891j, "Path is required.");
        c15526z0.mo16651b(new File(strM9891j), c15516wM9087a);
    }
}
