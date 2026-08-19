package p470T4;

import android.content.Context;
import android.content.SharedPreferences;
import p134F4.AbstractC2664a;
import p233J4.C4256b;

/* JADX INFO: renamed from: T4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7242g extends AbstractC2664a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f22972c = 1;

    /* JADX INFO: renamed from: d */
    public final Context f22973d;

    public C7242g(Context context, int i10, int i11) {
        super(i10, i11);
        this.f22973d = context;
    }

    @Override // p134F4.AbstractC2664a
    /* JADX INFO: renamed from: a */
    public final void mo3639a(C4256b c4256b) {
        Context context = this.f22973d;
        switch (this.f22972c) {
            case 0:
                if (this.f8175b >= 10) {
                    c4256b.m5019P(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c4256b.m5018E("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c4256b.m5023a();
                    try {
                        c4256b.m5019P(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        c4256b.m5019P(new Object[]{"reschedule_needed", Long.valueOf(j11)});
                        sharedPreferences.edit().clear().apply();
                        c4256b.m5028r0();
                        c4256b.m5027m();
                    } catch (Throwable th2) {
                        c4256b.m5027m();
                        throw th2;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c4256b.m5023a();
                    try {
                        c4256b.m5019P(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        c4256b.m5019P(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        c4256b.m5028r0();
                        return;
                    } finally {
                        c4256b.m5027m();
                    }
                }
                return;
        }
    }

    public C7242g(Context context) {
        super(9, 10);
        this.f22973d = context;
    }
}
