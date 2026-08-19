package p1016t3;

import java.util.HashSet;

/* JADX INFO: renamed from: t3.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19798y {

    /* JADX INFO: renamed from: a */
    public static final HashSet f62791a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f62792b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m20754a(String str) {
        if (f62791a.add(str)) {
            f62792b += ", " + str;
        }
    }
}
