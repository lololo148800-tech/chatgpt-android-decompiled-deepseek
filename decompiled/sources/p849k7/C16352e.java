package p849k7;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.C17341h;
import mo.C17356w;
import p009A7.C0391a;
import p009A7.C0396f;
import p035B7.C0845b;
import p035B7.InterfaceC0847d;
import p061C7.InterfaceC1612a;
import p1020t7.C19807e;
import p1038uc.C20183a;
import p1100x7.InterfaceC21155a;
import p1145z7.InterfaceC21804a;
import p1145z7.InterfaceC21805b;
import p1145z7.InterfaceC21813j;
import p163G7.InterfaceExecutorServiceC3006a;
import p447S7.InterfaceC7027c;
import p451Sb.C7102a;
import p525Vb.C8258a;
import p561X.C8990d;
import p571X9.AbstractC9227W;
import p641a7.EnumC10517c;
import p661b7.InterfaceC11256c;
import p714e0.C13254b;
import p775h2.AbstractC14376f;
import p780h7.C14419a;
import p780h7.InterfaceC14425g;
import p817j$.util.concurrent.ConcurrentHashMap;
import p867l8.C16831c;
import p874lj.C17057a;
import p885m4.C17155e;
import p909nm.C17690x;
import p959q8.C18639a;
import p983r7.InterfaceC18886d;

/* JADX INFO: renamed from: k7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16352e {

    /* JADX INFO: renamed from: M */
    public static final C8990d f50747M = new C8990d(29);

    /* JADX INFO: renamed from: N */
    public static final long f50748N = TimeUnit.SECONDS.toMillis(45);

    /* JADX INFO: renamed from: O */
    public static final C17341h[] f50749O = {C17341h.f55248r, C17341h.f55249s, C17341h.f55250t, C17341h.f55244n, C17341h.f55245o, C17341h.f55242l, C17341h.f55243m};

    /* JADX INFO: renamed from: A */
    public C0396f f50750A;

    /* JADX INFO: renamed from: B */
    public C0391a f50751B;

    /* JADX INFO: renamed from: C */
    public C14419a f50752C;

    /* JADX INFO: renamed from: D */
    public File f50753D;

    /* JADX INFO: renamed from: E */
    public InterfaceC21804a f50754E;

    /* JADX INFO: renamed from: F */
    public final ConcurrentHashMap f50755F;

    /* JADX INFO: renamed from: G */
    public final C17314q f50756G;

    /* JADX INFO: renamed from: H */
    public final C17314q f50757H;

    /* JADX INFO: renamed from: I */
    public final C17314q f50758I;

    /* JADX INFO: renamed from: J */
    public int f50759J;

    /* JADX INFO: renamed from: K */
    public int f50760K;

    /* JADX INFO: renamed from: L */
    public final int f50761L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f50762a;

    /* JADX INFO: renamed from: b */
    public final C0845b f50763b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f50764c;

    /* JADX INFO: renamed from: d */
    public WeakReference f50765d;

    /* JADX INFO: renamed from: e */
    public C13254b f50766e;

    /* JADX INFO: renamed from: f */
    public InterfaceC18886d f50767f;

    /* JADX INFO: renamed from: g */
    public InterfaceC21813j f50768g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0847d f50769h;

    /* JADX INFO: renamed from: i */
    public InterfaceC21155a f50770i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1612a f50771j;

    /* JADX INFO: renamed from: k */
    public InterfaceC16348a f50772k;

    /* JADX INFO: renamed from: l */
    public C17356w f50773l;

    /* JADX INFO: renamed from: m */
    public C20183a f50774m;

    /* JADX INFO: renamed from: n */
    public String f50775n;

    /* JADX INFO: renamed from: o */
    public String f50776o;

    /* JADX INFO: renamed from: p */
    public InterfaceC21805b f50777p;

    /* JADX INFO: renamed from: q */
    public String f50778q;

    /* JADX INFO: renamed from: r */
    public String f50779r;

    /* JADX INFO: renamed from: s */
    public String f50780s;

    /* JADX INFO: renamed from: t */
    public boolean f50781t;

    /* JADX INFO: renamed from: u */
    public String f50782u;

    /* JADX INFO: renamed from: v */
    public String f50783v;

    /* JADX INFO: renamed from: w */
    public InterfaceC7027c f50784w;

    /* JADX INFO: renamed from: x */
    public EnumC10517c f50785x;

    /* JADX INFO: renamed from: y */
    public String f50786y;

    /* JADX INFO: renamed from: z */
    public InterfaceC14425g f50787z;

    public C16352e(InterfaceC11256c internalLogger, C0845b c0845b, C8990d c8990d) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f50762a = internalLogger;
        this.f50763b = c0845b;
        this.f50764c = new AtomicBoolean(false);
        this.f50765d = new WeakReference(null);
        this.f50766e = new C13254b(C17690x.f56481Y);
        this.f50767f = new C16361n();
        this.f50768g = new C17057a(10);
        this.f50769h = new C18639a(2);
        this.f50770i = new C17155e();
        this.f50771j = new C8258a();
        this.f50772k = new C16355h();
        this.f50775n = "";
        this.f50776o = "";
        this.f50777p = new C16831c();
        this.f50778q = "";
        this.f50779r = "android";
        this.f50780s = "2.14.0";
        this.f50781t = true;
        this.f50782u = "";
        this.f50783v = "";
        this.f50759J = 2;
        this.f50760K = 2;
        this.f50761L = 2;
        this.f50784w = new C7102a(16);
        this.f50785x = EnumC10517c.f31167o0;
        this.f50755F = new ConcurrentHashMap();
        this.f50756G = AbstractC9227W.m9800c(new C16351d(this, 0));
        this.f50757H = AbstractC9227W.m9800c(new C16351d(this, 1));
        this.f50758I = AbstractC9227W.m9800c(new C16351d(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final C19807e m17949a() {
        return new C19807e(AbstractC14376f.m15855u(this.f50759J), 4194304L, 524288L, 500, 64800000L, 536870912L, 5000L);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceExecutorServiceC3006a m17950b() {
        C0391a c0391a = this.f50751B;
        if (c0391a != null) {
            return c0391a;
        }
        AbstractC16544l.m18103p("persistenceExecutorService");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final File m17951c() {
        File file = this.f50753D;
        if (file != null) {
            return file;
        }
        AbstractC16544l.m18103p("storageDir");
        throw null;
    }
}
