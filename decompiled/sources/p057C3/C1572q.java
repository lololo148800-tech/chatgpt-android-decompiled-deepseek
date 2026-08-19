package p057C3;

import android.content.Context;
import android.os.Looper;
import p001A.C0030P;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: C3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1572q {

    /* JADX INFO: renamed from: a */
    public final Context f4397a;

    /* JADX INFO: renamed from: b */
    public final C20813o f4398b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10536i f4399c;

    /* JADX INFO: renamed from: d */
    public InterfaceC10536i f4400d;

    /* JADX INFO: renamed from: e */
    public final C1570o f4401e;

    /* JADX INFO: renamed from: f */
    public final C1571p f4402f;

    /* JADX INFO: renamed from: g */
    public final C1570o f4403g;

    /* JADX INFO: renamed from: h */
    public final C0030P f4404h;

    /* JADX INFO: renamed from: i */
    public final Looper f4405i;

    /* JADX INFO: renamed from: j */
    public final int f4406j;

    /* JADX INFO: renamed from: k */
    public C19778e f4407k;

    /* JADX INFO: renamed from: l */
    public final int f4408l;

    /* JADX INFO: renamed from: m */
    public final boolean f4409m;

    /* JADX INFO: renamed from: n */
    public final C1561g0 f4410n;

    /* JADX INFO: renamed from: o */
    public final C1560g f4411o;

    /* JADX INFO: renamed from: p */
    public final long f4412p;

    /* JADX INFO: renamed from: q */
    public final long f4413q;

    /* JADX INFO: renamed from: r */
    public final boolean f4414r;

    /* JADX INFO: renamed from: s */
    public boolean f4415s;

    /* JADX INFO: renamed from: t */
    public final String f4416t;

    public C1572q(Context context, InterfaceC10536i interfaceC10536i, InterfaceC10536i interfaceC10536i2) {
        C1570o c1570o = new C1570o(context, 1);
        C1571p c1571p = new C1571p(0);
        C1570o c1570o2 = new C1570o(context, 2);
        C0030P c0030p = new C0030P(11);
        context.getClass();
        this.f4397a = context;
        this.f4399c = interfaceC10536i;
        this.f4400d = interfaceC10536i2;
        this.f4401e = c1570o;
        this.f4402f = c1571p;
        this.f4403g = c1570o2;
        this.f4404h = c0030p;
        int i10 = AbstractC20817s.f66106a;
        Looper looperMyLooper = Looper.myLooper();
        this.f4405i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f4407k = C19778e.f62665d;
        this.f4408l = 1;
        this.f4409m = true;
        this.f4410n = C1561g0.f4355c;
        this.f4411o = new C1560g(AbstractC20817s.m21390D(20L), AbstractC20817s.m21390D(500L));
        this.f4398b = C20813o.f66098a;
        this.f4412p = 500L;
        this.f4413q = 2000L;
        this.f4414r = true;
        this.f4416t = "";
        this.f4406j = -1000;
    }
}
