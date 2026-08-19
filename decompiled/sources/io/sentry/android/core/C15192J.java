package io.sentry.android.core;

import io.sentry.C15109B;
import java.util.TimerTask;
import p593Y8.C9683j;

/* JADX INFO: renamed from: io.sentry.android.core.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C15192J extends TimerTask {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47335Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f47336Z;

    public /* synthetic */ C15192J(Object obj, int i10) {
        this.f47335Y = i10;
        this.f47336Z = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f47335Y) {
            case 0:
                C15193K c15193k = (C15193K) this.f47336Z;
                boolean z6 = c15193k.f47344t0;
                C15109B c15109b = c15193k.f47343s0;
                if (z6) {
                    c15109b.mo16235B();
                }
                c15109b.mo16246j().getReplayController().stop();
                break;
            default:
                ((C9683j) this.f47336Z).m10275W();
                break;
        }
    }
}
