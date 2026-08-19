package com.openai.feature.widget.impl;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p523V9.AbstractC8054b4;
import p672c3.C11585S;
import p672c3.C11586T;
import p672c3.C11587U;
import p672c3.C11589W;
import p672c3.C11590X;
import ph.C18417e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/widget/impl/WidgetReceiver;", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class WidgetReceiver extends AppWidgetProvider {

    /* JADX INFO: renamed from: a */
    public final AbstractC0563B f40339a = AbstractC0593T.f1824a;

    /* JADX INFO: renamed from: b */
    public final C18417e f40340b = new C18417e();

    /* JADX INFO: renamed from: a */
    public static final void m14390a(WidgetReceiver widgetReceiver, InterfaceC0571F interfaceC0571F, Context context) {
        widgetReceiver.getClass();
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C11590X(context, widgetReceiver, null), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        AbstractC8054b4.m8447c(this, this.f40339a, new C11585S(this, context, i10, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        AbstractC8054b4.m8447c(this, this.f40339a, new C11586T(this, context, iArr, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x0047, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x0047, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x0049, B:23:0x0050, B:24:0x0051, B:25:0x0058, B:26:0x0059, B:32:0x006b, B:34:0x007d, B:36:0x0088, B:38:0x0094, B:37:0x0090, B:39:0x0098, B:40:0x009f, B:29:0x0062, B:41:0x00a0), top: B:46:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x0047, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x0047, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x0049, B:23:0x0050, B:24:0x0051, B:25:0x0058, B:26:0x0059, B:32:0x006b, B:34:0x007d, B:36:0x0088, B:38:0x0094, B:37:0x0090, B:39:0x0098, B:40:0x009f, B:29:0x0062, B:41:0x00a0), top: B:46:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[Catch: all -> 0x0047, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x0047, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x0049, B:23:0x0050, B:24:0x0051, B:25:0x0058, B:26:0x0059, B:32:0x006b, B:34:0x007d, B:36:0x0088, B:38:0x0094, B:37:0x0090, B:39:0x0098, B:40:0x009f, B:29:0x0062, B:41:0x00a0), top: B:46:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[Catch: all -> 0x0047, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, all -> 0x0047, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x0049, B:23:0x0050, B:24:0x0051, B:25:0x0058, B:26:0x0059, B:32:0x006b, B:34:0x007d, B:36:0x0088, B:38:0x0094, B:37:0x0090, B:39:0x0098, B:40:0x009f, B:29:0x0062, B:41:0x00a0), top: B:46:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context);
                    packageName = context.getPackageName();
                    canonicalName = getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        AbstractC16544l.m18091d(appWidgetIds);
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    onUpdate(context, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context);
                    packageName = context.getPackageName();
                    canonicalName = getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        AbstractC16544l.m18091d(appWidgetIds);
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    onUpdate(context, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    AbstractC8054b4.m8447c(this, this.f40339a, new C11587U(this, context, intExtra, stringExtra, null));
                    return;
                }
            }
            super.onReceive(context, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AbstractC8054b4.m8447c(this, this.f40339a, new C11589W(this, context, iArr, null));
    }
}
