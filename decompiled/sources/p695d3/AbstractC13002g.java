package p695d3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import mm.C17309l;
import p017Af.C0494y;
import p049Bm.InterfaceC1436k;
import p492U1.C7542g;
import p523V9.AbstractC8127k5;
import p582Xk.HXHG.TfazcFv;
import p656b3.AbstractC11226e;
import p656b3.C11224c;
import p656b3.C11227f;
import p656b3.InterfaceC11222a;
import p672c3.C11571E0;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: d3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13002g {

    /* JADX INFO: renamed from: a */
    public static final C11224c f41257a = new C11224c("android.widget.extra.CHECKED");

    /* JADX INFO: renamed from: b */
    public static Intent m14732b(Context context, Class cls, int i10, C11227f c11227f) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i10);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c11227f.f33982a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C11224c c11224c = (C11224c) entry.getKey();
            arrayList.add(new C17309l(c11224c.f33981a, entry.getValue()));
        }
        C17309l[] c17309lArr = (C17309l[]) arrayList.toArray(new C17309l[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", AbstractC8127k5.m8632a((C17309l[]) Arrays.copyOf(c17309lArr, c17309lArr.length)));
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: c */
    public static final Uri m14733c(C11571E0 c11571e0, int i10, int i11, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i11 == 1) {
            str2 = "ACTIVITY";
        } else if (i11 == 2) {
            str2 = "BROADCAST";
        } else if (i11 == 3) {
            str2 = "SERVICE";
        } else if (i11 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i11 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(c11571e0.f34974b));
        builder.appendQueryParameter("viewId", String.valueOf(i10));
        builder.appendQueryParameter("viewSize", C7542g.m7878c(c11571e0.f34982j));
        builder.appendQueryParameter("extraData", str);
        if (c11571e0.f34978f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(c11571e0.f34983k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(c11571e0.f34984l));
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static final Intent m14734d(InterfaceC11222a interfaceC11222a, C11571E0 c11571e0, int i10, InterfaceC1436k interfaceC1436k) {
        boolean z6 = interfaceC11222a instanceof C13000e;
        int i11 = c11571e0.f34974b;
        if (z6) {
            int i12 = ActionCallbackBroadcastReceiver.f33222a;
            C13000e c13000e = (C13000e) interfaceC11222a;
            return m14731a(m14732b(c11571e0.f34973a, c13000e.f41254a, i11, (C11227f) interfaceC1436k.invoke(c13000e.f41255b)), c11571e0, i10);
        }
        if (!(interfaceC11222a instanceof AbstractC11226e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + interfaceC11222a).toString());
        }
        ComponentName componentName = c11571e0.f34987o;
        if (componentName != null) {
            return m14731a(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i11), c11571e0, i10);
        }
        throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
    }

    /* JADX INFO: renamed from: e */
    public static final PendingIntent m14735e(InterfaceC11222a interfaceC11222a, C11571E0 c11571e0, int i10, InterfaceC1436k interfaceC1436k, int i11) {
        boolean z6 = interfaceC11222a instanceof C13000e;
        int i12 = c11571e0.f34974b;
        Context context = c11571e0.f34973a;
        if (z6) {
            int i13 = ActionCallbackBroadcastReceiver.f33222a;
            C13000e c13000e = (C13000e) interfaceC11222a;
            Intent intentM14732b = m14732b(context, c13000e.f41254a, i12, (C11227f) interfaceC1436k.invoke(c13000e.f41255b));
            intentM14732b.setData(m14733c(c11571e0, i10, 5, ""));
            return PendingIntent.getBroadcast(context, 0, intentM14732b, i11 | 134217728);
        }
        if (!(interfaceC11222a instanceof AbstractC11226e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + interfaceC11222a).toString());
        }
        ComponentName componentName = c11571e0.f34987o;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i12);
        intentPutExtra.setData(m14733c(c11571e0, i10, 5, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, i11 | 134217728);
    }

    /* JADX INFO: renamed from: f */
    public static final void m14736f(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        C0494y c0494y = new C0494y(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 9);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? C13001f.f41256a.m14730a(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        c0494y.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    /* JADX INFO: renamed from: a */
    public static Intent m14731a(Intent intent, C11571E0 c11571e0, int i10) {
        Intent intent2 = new Intent(c11571e0.f34973a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(m14733c(c11571e0, i10, 2, TfazcFv.ZSHhDVQjQlEP));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }
}
