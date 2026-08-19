package p723e9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import p522V8.EnumC7837d;
import p523V9.AbstractC8158o4;
import p593Y8.C9682i;
import p745f9.C13589g;
import p745f9.InterfaceC13586d;
import p805i9.AbstractC14950a;

/* JADX INFO: renamed from: e9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13345c {

    /* JADX INFO: renamed from: a */
    public final Context f42333a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13586d f42334b;

    /* JADX INFO: renamed from: c */
    public final C13343a f42335c;

    public C13345c(Context context, InterfaceC13586d interfaceC13586d, C13343a c13343a) {
        this.f42333a = context;
        this.f42334b = interfaceC13586d;
        this.f42335c = c13343a;
    }

    /* JADX INFO: renamed from: a */
    public final void m14938a(C9682i c9682i, int i10, boolean z6) {
        Context context = this.f42333a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c9682i.f29188a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC7837d enumC7837d = c9682i.f29190c;
        adler32.update(byteBufferAllocate.putInt(AbstractC14950a.m16111a(enumC7837d)).array());
        byte[] bArr = c9682i.f29189b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    AbstractC8158o4.m8716a(c9682i, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM15109a = ((C13589g) this.f42334b).m15109a();
        String strValueOf = String.valueOf(AbstractC14950a.m16111a(enumC7837d));
        String str = c9682i.f29188a;
        Cursor cursorRawQuery = sQLiteDatabaseM15109a.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C13343a c13343a = this.f42335c;
            Long l4 = lValueOf;
            builder.setMinimumLatency(c13343a.m14937a(enumC7837d, jLongValue, i10));
            Set set = ((C13344b) c13343a.f42329b.get(enumC7837d)).f42332c;
            if (set.contains(EnumC13346d.f42336Y)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC13346d.f42338o0)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC13346d.f42337Z)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC14950a.m16111a(enumC7837d));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c9682i, Integer.valueOf(value), Long.valueOf(c13343a.m14937a(enumC7837d, jLongValue, i10)), l4, Integer.valueOf(i10)};
            String strM8719d = AbstractC8158o4.m8719d("JobInfoScheduler");
            if (Log.isLoggable(strM8719d, 3)) {
                Log.d(strM8719d, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }
}
