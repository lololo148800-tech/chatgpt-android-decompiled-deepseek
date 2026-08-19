package p1096x2;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p001A.C0013G0;
import p084D4.C1949x0;
import p160G5.p161rK.TVCuK;
import p544W9.AbstractC8447A3;
import p594Y9.C9895g4;
import p784hb.C14438g;
import p826j6.C16137F;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: x2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21108c {

    /* JADX INFO: renamed from: a */
    public static final C1949x0 f67045a = new C1949x0(2);

    /* JADX INFO: renamed from: b */
    public static final C0013G0 f67046b = new C0013G0(21);

    /* JADX INFO: renamed from: a */
    public static C16137F m21579a(Context context, List list) {
        Trace.beginSection(AbstractC8447A3.m9053f("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                C21109d c21109d = (C21109d) list.get(i10);
                ProviderInfo providerInfoM21580b = m21580b(context.getPackageManager(), c21109d, context.getResources());
                if (providerInfoM21580b == null) {
                    return new C16137F(16, (byte) 0);
                }
                arrayList.add(m21581c(context, c21109d, providerInfoM21580b.authority));
            }
            return new C16137F(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m21580b(PackageManager packageManager, C21109d c21109d, Resources resources) {
        Trace.beginSection(AbstractC8447A3.m9053f("FontProvider.getProvider"));
        try {
            List listM19966l = c21109d.f67050d;
            String str = c21109d.f67047a;
            String str2 = c21109d.f67048b;
            if (listM19966l == null) {
                listM19966l = AbstractC18610b.m19966l(resources, 0);
            }
            C21107b c21107b = new C21107b();
            c21107b.f67042a = str;
            c21107b.f67043b = str2;
            c21107b.f67044c = listM19966l;
            C1949x0 c1949x0 = f67045a;
            ProviderInfo providerInfo = (ProviderInfo) c1949x0.m3122g(c21107b);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C0013G0 c0013g0 = f67046b;
            Collections.sort(arrayList, c0013g0);
            for (int i10 = 0; i10 < listM19966l.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM19966l.get(i10));
                Collections.sort(arrayList2, c0013g0);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            c1949x0.m3126k(c21107b, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C21113h[] m21581c(Context context, C21109d c21109d, String str) {
        InterfaceC21106a interfaceC21106a;
        String str2 = TVCuK.FbmyxN;
        Trace.beginSection(AbstractC8447A3.m9053f("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(str2).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(str2).authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                C14438g c14438g = new C14438g();
                c14438g.f45414Y = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                interfaceC21106a = c14438g;
            } else {
                C9895g4 c9895g4 = new C9895g4();
                c9895g4.f29409Y = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                interfaceC21106a = c9895g4;
            }
            Cursor cursorMo10561q = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC8447A3.m9053f("ContentQueryWrapper.query"));
                try {
                    cursorMo10561q = interfaceC21106a.mo10561q(uriBuild, strArr, new String[]{c21109d.f67049c});
                    Trace.endSection();
                    if (cursorMo10561q != null && cursorMo10561q.getCount() > 0) {
                        int columnIndex = cursorMo10561q.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorMo10561q.getColumnIndex("_id");
                        int columnIndex3 = cursorMo10561q.getColumnIndex("file_id");
                        int columnIndex4 = cursorMo10561q.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorMo10561q.getColumnIndex("font_weight");
                        int columnIndex6 = cursorMo10561q.getColumnIndex("font_italic");
                        while (cursorMo10561q.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorMo10561q.getInt(columnIndex) : 0;
                            arrayList2.add(new C21113h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo10561q.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo10561q.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo10561q.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo10561q.getInt(columnIndex5) : RCHTTPStatusCodes.BAD_REQUEST, columnIndex6 != -1 && cursorMo10561q.getInt(columnIndex6) == 1, i10));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorMo10561q != null) {
                        cursorMo10561q.close();
                    }
                    interfaceC21106a.close();
                    return (C21113h[]) arrayList.toArray(new C21113h[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                if (cursorMo10561q != null) {
                    cursorMo10561q.close();
                }
                interfaceC21106a.close();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
