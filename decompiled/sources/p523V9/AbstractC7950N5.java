package p523V9;

import android.content.Context;
import p001A.C0100z;
import p083D3.C1864b;
import p167Gb.C3030a;
import p331N6.C5676a;
import p561X.C8990d;
import p890mb.C17204a;
import p890mb.C17212i;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.N5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7950N5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25182a;

    /* JADX INFO: renamed from: a */
    public static C17204a m8239a(String str, String str2) {
        C3030a c3030a = new C3030a(str, str2);
        C5676a c5676aM18942a = C17204a.m18942a(C3030a.class);
        c5676aM18942a.f18431b = 1;
        c5676aM18942a.f18435f = new C1864b(c3030a);
        return c5676aM18942a.m6109e();
    }

    /* JADX INFO: renamed from: b */
    public static C17204a m8240b(String str, C8990d c8990d) {
        C5676a c5676aM18942a = C17204a.m18942a(C3030a.class);
        c5676aM18942a.f18431b = 1;
        c5676aM18942a.m6108d(C17212i.m18950a(Context.class));
        c5676aM18942a.f18435f = new C0100z(str, 11, c8990d);
        return c5676aM18942a.m6109e();
    }
}
