package p385Pj;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p508Uj.AbstractC7701i;
import p508Uj.C7696d;
import p508Uj.C7698f;
import p508Uj.EnumC7699g;
import p523V9.AbstractC8119j5;
import p841k.C16281a;
import p841k.C16290j;
import p859l.AbstractC16651b;
import p859l.C16650a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: Pj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6427b extends AbstractC16651b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20881a;

    public /* synthetic */ C6427b(int i10) {
        this.f20881a = i10;
    }

    @Override // p859l.AbstractC16651b
    public final Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        Class<?> cls = null;
        switch (this.f20881a) {
            case 0:
                C6426a input = (C6426a) obj;
                AbstractC16544l.m18094g(input, "input");
                Intent intent = (Intent) input.f20879a.f42490Y;
                AbstractC16544l.m18093f(intent, "intent");
                intent.setData(Uri.parse(input.f20880b));
                return intent;
            case 1:
                C7696d input2 = (C7696d) obj;
                AbstractC16544l.m18094g(input2, "input");
                try {
                    cls = Class.forName("com.withpersona.sdk2.inquiry.nfc.impl.PassportNfcReaderActivity");
                    break;
                } catch (ClassNotFoundException unused) {
                }
                Intent intent2 = new Intent(context, cls);
                intent2.putExtra("EXTRA_NFC_READER_CONFIG", input2);
                return intent2;
            case 2:
                C16290j c16290j = (C16290j) obj;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent4 = c16290j.f50464Z;
                if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c16290j.f50463Y;
                        AbstractC16544l.m18094g(intentSender, "intentSender");
                        c16290j = new C16290j(intentSender, null, c16290j.f50465o0, c16290j.f50466p0);
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c16290j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent3);
                }
                return intent3;
            case 3:
                String[] input3 = (String[]) obj;
                AbstractC16544l.m18094g(input3, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input3).setType("*/*");
                AbstractC16544l.m18093f(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 4:
                String[] input4 = (String[]) obj;
                AbstractC16544l.m18094g(input4, "input");
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input4).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                AbstractC16544l.m18093f(type2, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type2;
            case 5:
                String[] input5 = (String[]) obj;
                AbstractC16544l.m18094g(input5, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input5);
                AbstractC16544l.m18093f(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 6:
                String input6 = (String) obj;
                AbstractC16544l.m18094g(input6, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input6});
                AbstractC16544l.m18093f(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 7:
                Intent input7 = (Intent) obj;
                AbstractC16544l.m18094g(input7, "input");
                return input7;
            case 8:
                C16290j input8 = (C16290j) obj;
                AbstractC16544l.m18094g(input8, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input8);
                AbstractC16544l.m18093f(intentPutExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra3;
            default:
                Uri input9 = (Uri) obj;
                AbstractC16544l.m18094g(input9, "input");
                Intent intentPutExtra4 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input9);
                AbstractC16544l.m18093f(intentPutExtra4, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
                return intentPutExtra4;
        }
    }

    @Override // p859l.AbstractC16651b
    public C16650a getSynchronousResult(Context context, Object obj) {
        switch (this.f20881a) {
            case 3:
                String[] input = (String[]) obj;
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(input, "input");
                return null;
            case 4:
                String[] input2 = (String[]) obj;
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(input2, "input");
                return null;
            case 5:
                String[] input3 = (String[]) obj;
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(input3, "input");
                if (input3.length == 0) {
                    return new C16650a(C17690x.f56481Y);
                }
                for (String str : input3) {
                    if (AbstractC17803d.m19554a(context, str) != 0) {
                        return null;
                    }
                }
                int iM19257b = AbstractC17660E.m19257b(input3.length);
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (String str2 : input3) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C16650a(linkedHashMap);
            case 6:
                String input4 = (String) obj;
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(input4, "input");
                if (AbstractC17803d.m19554a(context, input4) == 0) {
                    return new C16650a(Boolean.TRUE);
                }
                return null;
            case 7:
            case 8:
            default:
                return super.getSynchronousResult(context, obj);
            case 9:
                Uri input5 = (Uri) obj;
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(input5, "input");
                return null;
        }
    }

    @Override // p859l.AbstractC16651b
    public final Object parseResult(int i10, Intent intent) {
        Bundle extras;
        AbstractC7701i abstractC7701i;
        switch (this.f20881a) {
            case 0:
                return Integer.valueOf(i10);
            case 1:
                return (intent == null || (extras = intent.getExtras()) == null || (abstractC7701i = (AbstractC7701i) AbstractC8119j5.m8621b(extras, "EXTRA_RESULT", AbstractC7701i.class)) == null) ? new C7698f("Unable to extract output from result intent.", EnumC7699g.f24247Y) : abstractC7701i;
            case 2:
                return new C16281a(i10, intent);
            case 3:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 4:
                if (i10 != -1) {
                    intent = null;
                }
                C17689w c17689w = C17689w.f56480Y;
                if (intent == null) {
                    return c17689w;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return c17689w;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        Uri uri = clipData.getItemAt(i11).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            case 5:
                C17690x c17690x = C17690x.f56481Y;
                if (i10 != -1 || intent == null) {
                    return c17690x;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c17690x;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i12 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i12 == 0));
                }
                return AbstractC17659D.m19253o(AbstractC17680n.m19334J0(AbstractC17678l.m19315v(stringArrayExtra), arrayList));
            case 6:
                if (intent == null || i10 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z6 = false;
                if (intArrayExtra2 != null) {
                    for (int i13 : intArrayExtra2) {
                        if (i13 == 0) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
            case 7:
                return new C16281a(i10, intent);
            case 8:
                return new C16281a(i10, intent);
            default:
                return Boolean.valueOf(i10 == -1);
        }
    }
}
