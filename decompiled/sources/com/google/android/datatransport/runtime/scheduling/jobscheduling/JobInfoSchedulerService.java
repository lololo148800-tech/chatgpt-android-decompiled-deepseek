package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import com.auth0.android.request.internal.RunnableC11843b;
import fo.C13711h;
import p001A.C0039U;
import p239Ja.C4307j;
import p593Y8.C9682i;
import p593Y8.C9691r;
import p723e9.C13350h;
import p745f9.C13589g;
import p745f9.InterfaceC13586d;
import p767g9.C13830a;
import p767g9.InterfaceC13832c;
import p805i9.AbstractC14950a;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f36003Y = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        final int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C9691r.m10283b(getApplicationContext());
        C13711h c13711hM10270a = C9682i.m10270a();
        c13711hM10270a.m15184G(string);
        c13711hM10270a.f43261p0 = AbstractC14950a.m16112b(i10);
        if (string2 != null) {
            c13711hM10270a.f43260o0 = Base64.decode(string2, 0);
        }
        final C13350h c13350h = C9691r.m10282a().f29215d;
        final C9682i c9682iM15193g = c13711hM10270a.m15193g();
        final RunnableC11843b runnableC11843b = new RunnableC11843b(this, 4, jobParameters);
        c13350h.getClass();
        c13350h.f42356e.execute(new Runnable() { // from class: e9.e
            @Override // java.lang.Runnable
            public final void run() {
                C9682i c9682i = c9682iM15193g;
                int i12 = i11;
                Runnable runnable = runnableC11843b;
                C13350h c13350h2 = c13350h;
                InterfaceC13832c interfaceC13832c = c13350h2.f42357f;
                try {
                    try {
                        InterfaceC13586d interfaceC13586d = c13350h2.f42354c;
                        Objects.requireNonNull(interfaceC13586d);
                        ((C13589g) interfaceC13832c).m15108P(new C4307j(interfaceC13586d, 17));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) c13350h2.f42352a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((C13589g) interfaceC13832c).m15108P(new C0039U(c13350h2, i12, c9682i));
                        } else {
                            c13350h2.m14940a(c9682i, i12);
                        }
                    } catch (C13830a unused) {
                        c13350h2.f42355d.m14938a(c9682i, i12 + 1, false);
                    }
                } finally {
                    runnable.run();
                }
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
