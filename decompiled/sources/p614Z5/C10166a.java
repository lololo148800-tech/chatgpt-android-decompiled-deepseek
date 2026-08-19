package p614Z5;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;
import p520V5.C7796y;

/* JADX INFO: renamed from: Z5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10166a {

    /* JADX INFO: renamed from: d */
    public static final Object f30104d = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f30105a;

    /* JADX INFO: renamed from: b */
    public final String f30106b;

    /* JADX INFO: renamed from: c */
    public final Map f30107c;

    public C10166a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f30106b = str;
        } else {
            this.f30106b = str.concat(Separators.SLASH);
        }
        this.f30107c = map;
        if (callback instanceof View) {
            this.f30105a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f30105a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10762a(String str, Bitmap bitmap) {
        synchronized (f30104d) {
            ((C7796y) this.f30107c.get(str)).f24684f = bitmap;
        }
    }
}
