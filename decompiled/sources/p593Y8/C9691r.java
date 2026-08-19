package p593Y8;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import fo.C13711h;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p115E9.C2360b;
import p329N3.RunnableC5611a;
import p522V8.C7836c;
import p543W8.C8440a;
import p701d9.InterfaceC13048c;
import p723e9.C13350h;
import p723e9.C13352j;
import p782h9.InterfaceC14430a;
import p817j$.util.DesugarCollections;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Y8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9691r {

    /* JADX INFO: renamed from: e */
    public static volatile C9683j f29211e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC14430a f29212a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14430a f29213b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13048c f29214c;

    /* JADX INFO: renamed from: d */
    public final C13350h f29215d;

    public C9691r(InterfaceC14430a interfaceC14430a, InterfaceC14430a interfaceC14430a2, InterfaceC13048c interfaceC13048c, C13350h c13350h, C13352j c13352j) {
        this.f29212a = interfaceC14430a;
        this.f29213b = interfaceC14430a2;
        this.f29214c = interfaceC13048c;
        this.f29215d = c13350h;
        c13352j.getClass();
        c13352j.f42368a.execute(new RunnableC5611a(c13352j, 27));
    }

    /* JADX INFO: renamed from: a */
    public static C9691r m10282a() {
        C9683j c9683j = f29211e;
        if (c9683j != null) {
            return (C9691r) ((InterfaceC17068a) c9683j.f29195q0).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m10283b(Context context) {
        if (f29211e == null) {
            synchronized (C9691r.class) {
                try {
                    if (f29211e == null) {
                        C2360b c2360b = new C2360b();
                        context.getClass();
                        c2360b.f7317Y = context;
                        f29211e = c2360b.m3446a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C9689p m10284c(C8440a c8440a) {
        Set setSingleton;
        byte[] bytes;
        if (c8440a instanceof InterfaceC9684k) {
            c8440a.getClass();
            setSingleton = DesugarCollections.unmodifiableSet(C8440a.f26276d);
        } else {
            setSingleton = Collections.singleton(new C7836c("proto"));
        }
        C13711h c13711hM10270a = C9682i.m10270a();
        c8440a.getClass();
        c13711hM10270a.f43259Z = "cct";
        String str = c8440a.f26279a;
        String str2 = c8440a.f26280b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC10763a.m11055m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c13711hM10270a.f43260o0 = bytes;
        return new C9689p(setSingleton, c13711hM10270a.m15193g(), this);
    }
}
