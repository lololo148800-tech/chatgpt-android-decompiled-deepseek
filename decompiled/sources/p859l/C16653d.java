package p859l;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p315Me.Myis.CxcULo;
import p544W9.AbstractC8711s4;
import p841k.C16291k;
import p909nm.C17689w;

/* JADX INFO: renamed from: l.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16653d extends AbstractC16651b {

    /* JADX INFO: renamed from: a */
    public final int f53353a;

    public C16653d(int i10) {
        this.f53353a = i10;
        if (i10 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // p859l.AbstractC16651b
    public final C16650a getSynchronousResult(Context context, Object obj) {
        C16291k input = (C16291k) obj;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(input, "input");
        return null;
    }

    @Override // p859l.AbstractC16651b
    public final Object parseResult(int i10, Intent intent) {
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
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    @Override // p859l.AbstractC16651b
    public final Intent createIntent(Context context, Object obj) {
        boolean z6;
        C16291k input = (C16291k) obj;
        AbstractC16544l.m18094g(input, "input");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            z6 = true;
        } else {
            z6 = false;
            if (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2) {
                z6 = true;
            }
        }
        int i11 = this.f53353a;
        if (z6) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(AbstractC8711s4.m9417a(input.f50467a));
            if (i11 > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i11);
            return intent;
        }
        if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveInfoResolveActivity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(AbstractC8711s4.m9417a(input.f50467a));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", i11);
            return intent2;
        }
        PackageManager packageManager = context.getPackageManager();
        String str = CxcULo.SGZdXDeLNzPLxJ;
        if (packageManager.resolveActivity(new Intent(str), 1114112) != null) {
            ResolveInfo resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(new Intent(str), 1114112);
            if (resolveInfoResolveActivity2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoResolveActivity2.activityInfo;
            Intent intent3 = new Intent(str);
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i11);
            return intent3;
        }
        Intent intent4 = new Intent(lZYtIbClQJm.kgbzWSDV);
        intent4.setType(AbstractC8711s4.m9417a(input.f50467a));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }
}
