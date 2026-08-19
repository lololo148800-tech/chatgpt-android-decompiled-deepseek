package p519V4;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p174Gk.uSfJ.HpucjswO;
import p277L.ExecutorC4833f;
import p444S4.C7011q;
import p501Ub.ExecutorC7613o;
import p674c5.AbstractC11658k;

/* JADX INFO: renamed from: V4.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7761i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24489Y;

    /* JADX INFO: renamed from: Z */
    public final C7762j f24490Z;

    public /* synthetic */ RunnableC7761i(C7762j c7762j, int i10) {
        this.f24489Y = i10;
        this.f24490Z = c7762j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24489Y) {
            case 0:
                m8027a();
                return;
            default:
                C7762j c7762j = this.f24490Z;
                c7762j.getClass();
                C7011q c7011qM7408d = C7011q.m7408d();
                String str = C7762j.f24491w0;
                c7011qM7408d.m7410a(str, "Checking if commands are complete.");
                C7762j.m8028b();
                synchronized (c7762j.f24498s0) {
                    try {
                        if (c7762j.f24499t0 != null) {
                            C7011q.m7408d().m7410a(str, "Removing command " + c7762j.f24499t0);
                            if (!((Intent) c7762j.f24498s0.remove(0)).equals(c7762j.f24499t0)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            c7762j.f24499t0 = null;
                        }
                        ExecutorC7613o executorC7613o = c7762j.f24493Z.f41990a;
                        if (!c7762j.f24497r0.m8018a() && c7762j.f24498s0.isEmpty() && !executorC7613o.m7959b()) {
                            C7011q.m7408d().m7410a(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = c7762j.f24500u0;
                            if (systemAlarmService != null) {
                                systemAlarmService.m12358b();
                            }
                        } else if (!c7762j.f24498s0.isEmpty()) {
                            c7762j.m8031e();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8027a() {
        ExecutorC4833f executorC4833f;
        RunnableC7761i runnableC7761i;
        synchronized (this.f24490Z.f24498s0) {
            C7762j c7762j = this.f24490Z;
            c7762j.f24499t0 = (Intent) c7762j.f24498s0.get(0);
        }
        Intent intent = this.f24490Z.f24499t0;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f24490Z.f24499t0.getIntExtra("KEY_START_ID", 0);
            C7011q c7011qM7408d = C7011q.m7408d();
            String str = C7762j.f24491w0;
            c7011qM7408d.m7410a(str, "Processing command " + this.f24490Z.f24499t0 + ", " + intExtra);
            PowerManager.WakeLock wakeLockM13020a = AbstractC11658k.m13020a(this.f24490Z.f24492Y, action + " (" + intExtra + Separators.RPAREN);
            try {
                C7011q.m7408d().m7410a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockM13020a);
                wakeLockM13020a.acquire();
                C7762j c7762j2 = this.f24490Z;
                c7762j2.f24497r0.m8019b(c7762j2.f24499t0, intExtra, c7762j2);
                C7011q.m7408d().m7410a(str, HpucjswO.JIeIKpU + action + ") " + wakeLockM13020a);
                wakeLockM13020a.release();
                C7762j c7762j3 = this.f24490Z;
                executorC4833f = c7762j3.f24493Z.f41993d;
                runnableC7761i = new RunnableC7761i(c7762j3, 1);
            } catch (Throwable th2) {
                try {
                    C7011q c7011qM7408d2 = C7011q.m7408d();
                    String str2 = C7762j.f24491w0;
                    c7011qM7408d2.m7412c(str2, "Unexpected error in onHandleIntent", th2);
                    C7011q.m7408d().m7410a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockM13020a);
                    wakeLockM13020a.release();
                    C7762j c7762j4 = this.f24490Z;
                    executorC4833f = c7762j4.f24493Z.f41993d;
                    runnableC7761i = new RunnableC7761i(c7762j4, 1);
                } catch (Throwable th3) {
                    C7011q.m7408d().m7410a(C7762j.f24491w0, "Releasing operation wake lock (" + action + ") " + wakeLockM13020a);
                    wakeLockM13020a.release();
                    C7762j c7762j5 = this.f24490Z;
                    c7762j5.f24493Z.f41993d.execute(new RunnableC7761i(c7762j5, 1));
                    throw th3;
                }
            }
            executorC4833f.execute(runnableC7761i);
        }
    }
}
