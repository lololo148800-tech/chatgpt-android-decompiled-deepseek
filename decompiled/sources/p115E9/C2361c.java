package p115E9;

import android.content.Context;

/* JADX INFO: renamed from: E9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2361c {

    /* JADX INFO: renamed from: b */
    public static final C2361c f7318b;

    /* JADX INFO: renamed from: a */
    public C2360b f7319a;

    static {
        C2361c c2361c = new C2361c();
        c2361c.f7319a = null;
        f7318b = c2361c;
    }

    /* JADX INFO: renamed from: a */
    public static C2360b m3449a(Context context) {
        C2360b c2360b;
        C2361c c2361c = f7318b;
        synchronized (c2361c) {
            try {
                if (c2361c.f7319a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c2361c.f7319a = new C2360b(context);
                }
                c2360b = c2361c.f7319a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2360b;
    }
}
