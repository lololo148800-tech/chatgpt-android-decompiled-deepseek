package p521V6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p1060v9.C20485c;
import p167Gb.C3032c;
import p182H3.C3202c;
import p263K9.C4576X;
import p861l1.xapn.suYVq;
import p885m4.C17152b;

/* JADX INFO: renamed from: V6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7817j implements Parcelable {
    public static final Parcelable.Creator<C7817j> CREATOR = new C4576X(22);

    /* JADX INFO: renamed from: Y */
    public final boolean f24712Y;

    /* JADX INFO: renamed from: Z */
    public final int f24713Z;

    /* JADX INFO: renamed from: o0 */
    public final C7815h f24714o0;

    public C7817j(C7815h c7815h) {
        this.f24712Y = false;
        this.f24713Z = 0;
        this.f24714o0 = c7815h;
    }

    /* JADX INFO: renamed from: b */
    public static C3032c m8082b() {
        C3032c c3032c = new C3032c(23, false);
        c3032c.f9127Z = new C7815h((List) null);
        return c3032c;
    }

    /* JADX INFO: renamed from: c */
    public final C20485c m8084c(Context context, Uri uri) {
        C20485c c20485c = new C20485c();
        c20485c.f65030b = new C3202c();
        c20485c.f65031c = new C17152b();
        c20485c.f65029a = uri;
        int i10 = this.f24713Z;
        if (i10 > 0) {
            int color = context.getColor(i10) | (-16777216);
            C3202c c3202c = (C3202c) c20485c.f65030b;
            c3202c.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
            c3202c.f9663q0 = bundle;
        }
        return c20485c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f24712Y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f24713Z);
        parcel.writeParcelable(this.f24714o0, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public final String m8083a(PackageManager packageManager) {
        C7815h c7815h = this.f24714o0;
        c7815h.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(suYVq.rHqpQxNxP));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? arrayList3 = c7815h.f24704Y;
        boolean z6 = arrayList3 != 0;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (!z6 || arrayList3.contains(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList2.add(resolveInfo.activityInfo.packageName);
                } else {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = new ArrayList();
            if (str != null) {
                arrayList3.add(str);
            }
            arrayList3.addAll(C7815h.f24703Z);
        }
        String strM8078a = C7815h.m8078a(arrayList2, arrayList3, str);
        return strM8078a != null ? strM8078a : C7815h.m8078a(arrayList, arrayList3, str);
    }

    public C7817j(Parcel parcel) {
        this.f24712Y = parcel.readByte() != 0;
        this.f24713Z = parcel.readInt();
        this.f24714o0 = (C7815h) parcel.readParcelable(C7815h.class.getClassLoader());
    }
}
