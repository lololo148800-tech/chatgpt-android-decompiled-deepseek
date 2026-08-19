package p519V4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import kotlin.jvm.internal.AbstractC16544l;
import p111E5.CallableC2341y;
import p444S4.C7011q;
import p594Y9.C9895g4;
import p658b5.C11236g;
import p658b5.C11238i;
import p658b5.C11239j;

/* JADX INFO: renamed from: V4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7754b {

    /* JADX INFO: renamed from: a */
    public static final String f24455a = C7011q.m7409f("Alarms");

    /* JADX INFO: renamed from: a */
    public static void m8014a(Context context, C11239j c11239j, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = C7755c.f24456r0;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C7755c.m8017e(intent, c11239j);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C7011q.m7408d().m7410a(f24455a, "Cancelling existing alarm with (workSpecId, systemId) (" + c11239j + ", " + i10 + Separators.RPAREN);
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: b */
    public static void m8015b(Context context, WorkDatabase workDatabase, C11239j c11239j, long j10) {
        C11238i c11238iMo12353p = workDatabase.mo12353p();
        C11236g c11236gM12566l0 = c11238iMo12353p.m12566l0(c11239j);
        if (c11236gM12566l0 != null) {
            int i10 = c11236gM12566l0.f34005c;
            m8014a(context, c11239j, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = C7755c.f24456r0;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C7755c.m8017e(intent, c11239j);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                AbstractC7753a.m8013a(alarmManager, 0, j10, service);
                return;
            }
            return;
        }
        Object objM12351n = workDatabase.m12351n(new CallableC2341y(new C9895g4(workDatabase), 2));
        AbstractC16544l.m18093f(objM12351n, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objM12351n).intValue();
        c11238iMo12353p.m12570o0(new C11236g(c11239j.f34012a, c11239j.f34013b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = C7755c.f24456r0;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C7755c.m8017e(intent2, c11239j);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            AbstractC7753a.m8013a(alarmManager2, 0, j10, service2);
        }
    }
}
