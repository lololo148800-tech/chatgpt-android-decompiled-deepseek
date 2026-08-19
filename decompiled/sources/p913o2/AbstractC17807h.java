package p913o2;

import android.content.Intent;
import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import p341Ni.EnumC5802v;

/* JADX INFO: renamed from: o2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17807h {
    /* JADX INFO: renamed from: a */
    public static ArrayList m19564a(Intent intent) {
        return intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
    }

    /* JADX INFO: renamed from: b */
    public static Object m19565b(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public static Serializable m19566c(Intent intent) {
        return intent.getSerializableExtra("mode", EnumC5802v.class);
    }
}
