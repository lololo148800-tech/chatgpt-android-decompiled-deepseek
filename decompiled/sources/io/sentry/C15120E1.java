package io.sentry;

import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.E1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15120E1 extends TimerTask {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47068Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15126G1 f47069Z;

    public /* synthetic */ C15120E1(C15126G1 c15126g1, int i10) {
        this.f47068Y = i10;
        this.f47069Z = c15126g1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f47068Y) {
            case 0:
                C15126G1 c15126g1 = this.f47069Z;
                EnumC15147N1 enumC15147N1Mo16270a = c15126g1.mo16270a();
                if (enumC15147N1Mo16270a == null) {
                    enumC15147N1Mo16270a = EnumC15147N1.OK;
                }
                c15126g1.mo16290u(enumC15147N1Mo16270a, null);
                c15126g1.f47085k.set(false);
                break;
            default:
                C15126G1 c15126g2 = this.f47069Z;
                EnumC15147N1 enumC15147N1Mo16270a2 = c15126g2.mo16270a();
                if (enumC15147N1Mo16270a2 == null) {
                    enumC15147N1Mo16270a2 = EnumC15147N1.DEADLINE_EXCEEDED;
                }
                c15126g2.mo16275f(enumC15147N1Mo16270a2, c15126g2.f47092r.f47222r0 != null, null);
                c15126g2.f47086l.set(false);
                break;
        }
    }
}
