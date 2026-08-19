package p539W4;

import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: renamed from: W4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8429e {
    /* JADX INFO: renamed from: a */
    public static int m9035a(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f33725q0;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }
}
