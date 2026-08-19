package p046Bk;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Bk.N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1340N {

    /* JADX INFO: renamed from: a */
    public static final C1342O f3540a = new C1342O(0);

    /* JADX INFO: renamed from: a */
    public static final String m2030a(String str, String str2, String componentName) {
        AbstractC16544l.m18094g(componentName, "componentName");
        Uri uri = Uri.parse(str);
        AbstractC16544l.m18093f(uri, "parse(this)");
        String string = uri.buildUpon().appendQueryParameter("code", str2).appendQueryParameter("component", componentName).build().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
