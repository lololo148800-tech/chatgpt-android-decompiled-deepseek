package com.datadog.android.rum;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.performance.C15251d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/datadog/android/rum/DdRumContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "dd-sdk-android-rum_release"}, m18068k = 1, m18069mv = {1, 7, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DdRumContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: Y */
    public static int f35997Y;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC16544l.m18094g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        AbstractC16544l.m18094g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC16544l.m18094g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        C15251d.m16452c(this);
        if (f35997Y == 0) {
            Context context = getContext();
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
            Object obj = null;
            runningAppProcessInfo = null;
            Object systemService = context != null ? context.getSystemService("activity") : null;
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            int iMyPid = Process.myPid();
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (Object obj2 : runningAppProcesses) {
                    if (((ActivityManager.RunningAppProcessInfo) obj2).pid == iMyPid) {
                        obj = obj2;
                        break;
                    }
                }
                runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
            }
            int i10 = runningAppProcessInfo != null ? runningAppProcessInfo.importance : 100;
            f35997Y = i10;
            AbstractC15256t.m16482t("DdRumContentProvider", "processImportance:" + i10);
        }
        C15251d.m16453d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC16544l.m18094g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC16544l.m18094g(uri, "uri");
        return 0;
    }
}
