package p425Ra;

import android.content.Context;
import android.os.Bundle;
import io.sentry.hints.C15370i;
import java.util.ArrayList;
import p572Xa.C9408b;
import p572Xa.C9422p;
import p572Xa.C9427u;
import p594Y9.AbstractC9931m4;
import p746fa.C13599h;
import p882m1.clb.WGTYqNchEpHca;
import p959q8.C18639a;

/* JADX INFO: renamed from: Ra.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6836i {

    /* JADX INFO: renamed from: a */
    public final C9427u f21928a;

    /* JADX INFO: renamed from: b */
    public final String f21929b;

    /* JADX INFO: renamed from: c */
    public final C13599h f21930c;

    /* JADX INFO: renamed from: d */
    public final C18639a f21931d;

    /* JADX INFO: renamed from: e */
    public final C9408b f21932e;

    public C6836i(Context context, C9427u c9427u, C18639a c18639a) {
        C13599h c13599h = new C13599h();
        this.f21930c = c13599h;
        this.f21929b = context.getPackageName();
        this.f21928a = c9427u;
        this.f21931d = c18639a;
        C9408b c9408b = new C9408b(context, c9427u, AbstractC6837j.f21933a, new C15370i(15));
        this.f21932e = c9408b;
        c9408b.m9985a().post(new C6831d(this, c13599h, context));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m7277a(C6836i c6836i, C6842o c6842o, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c6836i.f21929b);
        bundle.putLong("cloud.prj", 4906872596L);
        bundle.putString("nonce", c6842o.f21938a);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(c6842o.f21939b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9422p(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC9931m4.m10591a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7279c(C6836i c6836i) {
        return c6836i.f21930c.f42961a.m15132k() && ((Integer) c6836i.f21930c.f42961a.m15130i()).intValue() < 83420000;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7280d(C6836i c6836i) {
        return c6836i.f21930c.f42961a.m15132k() && ((Integer) c6836i.f21930c.f42961a.m15130i()).intValue() == 0;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m7278b(C6836i c6836i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c6836i.f21929b);
        bundle.putLong("cloud.prj", 4906872596L);
        bundle.putInt(WGTYqNchEpHca.vtWZOh, 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9422p(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC9931m4.m10591a(arrayList)));
        return bundle;
    }
}
