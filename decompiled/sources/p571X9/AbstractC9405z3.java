package p571X9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: X9.z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9405z3 {
    /* JADX INFO: renamed from: a */
    public static final Intent m9981a(Context context, String str, List list) {
        AbstractC16544l.m18094g(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            launchIntentForPackage.addFlags(((Number) it.next()).intValue());
        }
        launchIntentForPackage.setData(Uri.parse("https://chatgpt.com/".concat(str)));
        return launchIntentForPackage;
    }
}
