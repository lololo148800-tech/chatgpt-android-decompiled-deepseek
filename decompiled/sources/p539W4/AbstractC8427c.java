package p539W4;

import android.app.job.JobParameters;
import android.net.Uri;

/* JADX INFO: renamed from: W4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8427c {
    /* JADX INFO: renamed from: a */
    public static String[] m9032a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    /* JADX INFO: renamed from: b */
    public static Uri[] m9033b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
