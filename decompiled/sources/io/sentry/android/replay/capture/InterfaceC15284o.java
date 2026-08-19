package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15298l;
import io.sentry.android.replay.C15304r;
import io.sentry.protocol.C15447t;
import p749fd.C13628m;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.o */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC15284o {
    /* JADX INFO: renamed from: a */
    void mo16496a(MotionEvent motionEvent);

    /* JADX INFO: renamed from: b */
    void mo16504b(C15304r c15304r);

    /* JADX INFO: renamed from: c */
    void mo16497c(C15304r c15304r, int i10, C15447t c15447t, EnumC15527z1 enumC15527z1);

    /* JADX INFO: renamed from: d */
    InterfaceC15284o mo16505d();

    /* JADX INFO: renamed from: e */
    void mo16506e();

    /* JADX INFO: renamed from: f */
    void mo16507f(boolean z6, C13628m c13628m);

    /* JADX INFO: renamed from: g */
    void mo16508g(C15298l c15298l);

    void stop();
}
