package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import p228J.InterfaceC3839h0;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements InterfaceC3839h0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f32318a;

    static {
        HashSet hashSet = new HashSet();
        f32318a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
