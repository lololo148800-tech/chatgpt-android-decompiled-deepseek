package p033B5;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Loading;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0565C;
import p025An.C0566C0;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p026Ao.C0654C;
import p1009s9.C19506i;
import p111E5.C2319c;
import p111E5.C2330n;
import p111E5.C2337u;
import p1139z0.C21585H;
import p153Fn.AbstractC2935m;
import p160G5.C2995a;
import p184H5.C3241h;
import p201Hn.C3516e;
import p208I5.C3620a;
import p234J5.C4263a;
import p275Kn.AbstractC4823j;
import p275Kn.C4822i;
import p334Na.AbstractC5695b;
import p374P5.AbstractC6356i;
import p374P5.C6348a;
import p374P5.C6350c;
import p374P5.C6351d;
import p374P5.C6353f;
import p374P5.C6354g;
import p374P5.C6358k;
import p374P5.C6359l;
import p374P5.C6360m;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p374P5.InterfaceC6362o;
import p397Q5.AbstractC6577f;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p397Q5.InterfaceC6580i;
import p496U5.ComponentCallbacks2C7559a;
import p523V9.AbstractC7897H0;
import p571X9.AbstractC9137G4;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9765M;
import p658b5.C11234e;
import p882m1.AbstractC17140a;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: B5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0840x implements InterfaceC0832p {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f2342e = 0;

    /* JADX INFO: renamed from: a */
    public final C0835s f2343a;

    /* JADX INFO: renamed from: b */
    public final C21585H f2344b;

    /* JADX INFO: renamed from: c */
    public final C0823g f2345c;

    /* JADX INFO: renamed from: d */
    public volatile /* synthetic */ int f2346d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C0840x.class, "d");
    }

    public C0840x(C0835s c0835s) {
        int i10 = 3;
        int i11 = 4;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        this.f2343a = c0835s;
        C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a.f3819q0).plus(new C0841y(C0565C.f1783Y, i13)));
        ComponentCallbacks2C7559a componentCallbacks2C7559a = new ComponentCallbacks2C7559a(this);
        C21585H c21585h = new C21585H(this);
        this.f2344b = c21585h;
        C0822f c0822f = new C0822f(c0835s.f2320e);
        Object obj = c0835s.f2317b.f20651n.f2309a.get(AbstractC0833q.f2313a);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            c0822f.f2295d.add(new C0831o(i14));
            c0822f.f2296e.add(new C0831o(i12));
        }
        C4263a c4263a = new C4263a(i13);
        C16527D c16527d = AbstractC16526C.f51263a;
        c0822f.m1880b(c4263a, c16527d.mo5693b(Uri.class));
        c0822f.m1880b(new C4263a(i10), c16527d.mo5693b(Integer.class));
        c0822f.f2294c.add(new C17309l(new C3620a(0), c16527d.mo5693b(C0816A.class)));
        c0822f.m1879a(new C2995a(i13), c16527d.mo5693b(C0816A.class));
        c0822f.m1879a(new C2995a(i11), c16527d.mo5693b(C0816A.class));
        c0822f.m1879a(new C2995a(8), c16527d.mo5693b(C0816A.class));
        c0822f.m1879a(new C2995a(5), c16527d.mo5693b(Drawable.class));
        c0822f.m1879a(new C2995a(i14), c16527d.mo5693b(Bitmap.class));
        C19506i c19506i = AbstractC0834r.f2314a;
        Object obj2 = c0835s.f2317b.f20651n.f2309a.get(AbstractC0834r.f2314a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i15 = AbstractC4823j.f15708a;
        C4822i c4822i = new C4822i(iIntValue, 0);
        int i16 = Build.VERSION.SDK_INT;
        Object obj3 = C2330n.f7237b;
        if (i16 >= 29) {
            Object obj4 = c0835s.f2317b.f20651n.f2309a.get(AbstractC0834r.f2315b);
            C2330n c2330n = (C2330n) (obj4 == null ? obj3 : obj4);
            if (c2330n.equals(obj3) || c2330n.equals(C2330n.f7238c)) {
                c0822f.f2296e.add(new C0820d(new C2337u(c4822i), i14));
            }
        }
        Object obj5 = c0835s.f2317b.f20651n.f2309a.get(AbstractC0834r.f2315b);
        c0822f.f2296e.add(new C0820d(new C2319c(c4822i, (C2330n) (obj5 != null ? obj5 : obj3)), i14));
        c0822f.m1880b(new C4263a(i14), c16527d.mo5693b(File.class));
        c0822f.m1879a(new C2995a(7), c16527d.mo5693b(C0816A.class));
        c0822f.m1879a(new C2995a(i10), c16527d.mo5693b(ByteBuffer.class));
        c0822f.m1880b(new C4263a(i11), c16527d.mo5693b(String.class));
        c0822f.m1880b(new C4263a(i12), c16527d.mo5693b(C0654C.class));
        c0822f.f2294c.add(new C17309l(new C3620a(1), c16527d.mo5693b(C0816A.class)));
        c0822f.f2294c.add(new C17309l(new C3620a(2), c16527d.mo5693b(C0816A.class)));
        c0822f.m1879a(new C2995a(6), c16527d.mo5693b(C0816A.class));
        c0822f.m1879a(new C2995a(i12), c16527d.mo5693b(byte[].class));
        c0822f.f2292a.add(new C3241h(this, componentCallbacks2C7559a, c21585h));
        this.f2345c = new C0823g(AbstractC9137G4.m9680b(c0822f.f2292a), AbstractC9137G4.m9680b(c0822f.f2293b), AbstractC9137G4.m9680b(c0822f.f2294c), AbstractC9137G4.m9680b(c0822f.f2295d), AbstractC9137G4.m9680b(c0822f.f2296e));
        this.f2346d = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c2 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:14:0x0038, B:98:0x01bc, B:100:0x01c2, B:101:0x01d3, B:103:0x01d7, B:106:0x01e3, B:107:0x01e8), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d3 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:14:0x0038, B:98:0x01bc, B:100:0x01c2, B:101:0x01d3, B:103:0x01d7, B:106:0x01e3, B:107:0x01e8), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01d7 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #4 {all -> 0x003d, blocks: (B:14:0x0038, B:98:0x01bc, B:100:0x01c2, B:101:0x01d3, B:103:0x01d7, B:106:0x01e3, B:107:0x01e8), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e3 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #4 {all -> 0x003d, blocks: (B:14:0x0038, B:98:0x01bc, B:100:0x01c2, B:101:0x01d3, B:103:0x01d7, B:106:0x01e3, B:107:0x01e8), top: B:130:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f7 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #0 {all -> 0x0204, blocks: (B:112:0x01f3, B:114:0x01f7, B:119:0x0206, B:120:0x020e), top: B:123:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0206 A[Catch: all -> 0x0204, TRY_ENTER, TryCatch #0 {all -> 0x0204, blocks: (B:112:0x01f3, B:114:0x01f7, B:119:0x0206, B:120:0x020e), top: B:123:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e A[Catch: all -> 0x01e9, TryCatch #1 {all -> 0x01e9, blocks: (B:79:0x0137, B:81:0x013e, B:83:0x0148, B:84:0x0152, B:86:0x0158, B:88:0x0166, B:90:0x0173), top: B:124:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0148 A[Catch: all -> 0x01e9, TryCatch #1 {all -> 0x01e9, blocks: (B:79:0x0137, B:81:0x013e, B:83:0x0148, B:84:0x0152, B:86:0x0158, B:88:0x0166, B:90:0x0173), top: B:124:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0158 A[Catch: all -> 0x01e9, TryCatch #1 {all -> 0x01e9, blocks: (B:79:0x0137, B:81:0x013e, B:83:0x0148, B:84:0x0152, B:86:0x0158, B:88:0x0166, B:90:0x0173), top: B:124:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:92:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x018b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    /* JADX INFO: renamed from: a */
    public final Object m1897a(C6354g c6354g, int i10, AbstractC19687c abstractC19687c) {
        C0838v c0838v;
        InterfaceC6580i interfaceC6580i;
        C6354g c6354gM6972a;
        C0840x c0840x;
        InterfaceC6362o interfaceC6362o;
        C0825i c0825i;
        C0840x c0840x2;
        InterfaceC6362o interfaceC6362o2;
        C0825i c0825i2;
        C6354g c6354g2;
        C6354g c6354g3;
        C11234e c11234e;
        Object objMo2445a;
        C6354g c6354g4;
        InterfaceC0829m interfaceC0829m;
        InterfaceC6362o interfaceC6362o3;
        C0840x c0840x3;
        InterfaceC0829m interfaceC0829m2;
        AsyncImagePainter asyncImagePainter;
        AbstractC17140a abstractC17140aM8193a;
        InterfaceC6357j interfaceC6357j;
        if (abstractC19687c instanceof C0838v) {
            c0838v = (C0838v) abstractC19687c;
            int i11 = c0838v.f2335t0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0838v.f2335t0 = i11 - Integer.MIN_VALUE;
            } else {
                c0838v = new C0838v(this, abstractC19687c);
            }
        } else {
            c0838v = new C0838v(this, abstractC19687c);
        }
        Object objM1168P = c0838v.f2333r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c0838v.f2335t0;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        InterfaceC0829m interfaceC0829m3 = c0838v.f2332q0;
                        c0825i2 = c0838v.f2331p0;
                        c6354g4 = c0838v.f2330o0;
                        interfaceC6362o3 = c0838v.f2329Z;
                        c0840x3 = c0838v.f2328Y;
                        try {
                            AbstractC9233X.m9807c(objM1168P);
                            interfaceC0829m = interfaceC0829m3;
                            c0825i2.getClass();
                            InterfaceC18776i interfaceC18776i = c6354g4.f20667g;
                            C0839w c0839w = new C0839w(c6354g4, c0840x3, (C6579h) objM1168P, c0825i2, interfaceC0829m, null);
                            c0838v.f2328Y = c0840x3;
                            c0838v.f2329Z = interfaceC6362o3;
                            c0838v.f2330o0 = c6354g4;
                            c0838v.f2331p0 = c0825i2;
                            c0838v.f2332q0 = null;
                            c0838v.f2335t0 = 3;
                            objM1168P = AbstractC0575H.m1168P(interfaceC18776i, c0839w, c0838v);
                            if (objM1168P == enumC19250a) {
                                return enumC19250a;
                            }
                            c0825i = c0825i2;
                            c6354g3 = c6354g4;
                            interfaceC6362o = interfaceC6362o3;
                            c0840x = c0840x3;
                        } catch (Throwable th2) {
                            th = th2;
                            c0825i = c0825i2;
                            c6354g3 = c6354g4;
                            interfaceC6362o = interfaceC6362o3;
                            c0840x = c0840x3;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0825i = c0838v.f2331p0;
                        c6354g3 = c0838v.f2330o0;
                        interfaceC6362o = c0838v.f2329Z;
                        c0840x = c0838v.f2328Y;
                        try {
                            AbstractC9233X.m9807c(objM1168P);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    interfaceC6357j = (InterfaceC6357j) objM1168P;
                    if (interfaceC6357j instanceof C6363p) {
                        C11234e c11234e2 = c6354g3.f20663c;
                        c0840x.getClass();
                        C6354g c6354g5 = ((C6363p) interfaceC6357j).f20708b;
                        c0825i.getClass();
                        c6354g5.getClass();
                    } else {
                        if (!(interfaceC6357j instanceof C6350c)) {
                            throw new C0644w();
                        }
                        c0840x.m1899c((C6350c) interfaceC6357j, c6354g3.f20663c, c0825i);
                    }
                    interfaceC6362o.mo6970m();
                    return interfaceC6357j;
                }
                c0825i2 = c0838v.f2331p0;
                c6354g2 = c0838v.f2330o0;
                interfaceC6362o2 = c0838v.f2329Z;
                c0840x2 = c0838v.f2328Y;
                try {
                    AbstractC9233X.m9807c(objM1168P);
                } catch (Throwable th4) {
                    th = th4;
                    c0825i = c0825i2;
                    c6354g3 = c6354g2;
                    interfaceC6362o = interfaceC6362o2;
                    c0840x = c0840x2;
                }
                try {
                    if (th instanceof CancellationException) {
                        C0835s c0835s = c0840x.f2343a;
                        c0825i.getClass();
                        c6354g3.getClass();
                        throw th;
                    }
                    C6350c c6350cM10368a = AbstractC9765M.m10368a(c6354g3, th);
                    c0840x.m1899c(c6350cM10368a, c6354g3.f20663c, c0825i);
                    interfaceC6362o.mo6970m();
                    return c6350cM10368a;
                } catch (Throwable th5) {
                    interfaceC6362o.mo6970m();
                    throw th5;
                }
            }
            AbstractC9233X.m9807c(objM1168P);
            InterfaceC0627n0 interfaceC0627n0M1192u = AbstractC0575H.m1192u(c0838v.getContext());
            boolean z6 = i10 == 0;
            C21585H c21585h = this.f2344b;
            c21585h.getClass();
            C11234e c11234e3 = c6354g.f20663c;
            AbstractC11105n abstractC11105nMo7809i = (AbstractC11105n) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20689f);
            if (abstractC11105nMo7809i == null) {
                if (!z6) {
                    abstractC11105nMo7809i = null;
                    break;
                }
                Object baseContext = c6354g.f20661a;
                while (true) {
                    if (baseContext instanceof InterfaceC11112u) {
                        abstractC11105nMo7809i = ((InterfaceC11112u) baseContext).mo7809i();
                        break;
                    }
                    if (!(baseContext instanceof ContextWrapper)) {
                        abstractC11105nMo7809i = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            InterfaceC6362o c6358k = abstractC11105nMo7809i != null ? new C6358k(abstractC11105nMo7809i, 0, interfaceC0627n0M1192u) : new C6348a(interfaceC0627n0M1192u);
            c6358k.mo6969e();
            C6351d c6351dM6973a = C6354g.m6973a(c6354g);
            c6351dM6973a.f20622b = ((C0840x) c21585h.f68344Z).f2343a.f2317b;
            C6353f c6353f = c6354g.f20680t;
            InterfaceC6580i interfaceC6580i2 = c6353f.f20658g;
            if (interfaceC6580i2 == null) {
                interfaceC6580i = InterfaceC6580i.f21267f0;
                c6351dM6973a.f20633m = interfaceC6580i;
            } else {
                interfaceC6580i = interfaceC6580i2;
            }
            if (c6353f.f20659h == null) {
                c6351dM6973a.f20634n = c6354g.f20677q;
            }
            if (c6353f.f20660i == null) {
                c6351dM6973a.f20635o = (interfaceC6580i2 == null && AbstractC16544l.m18089b(interfaceC6580i, InterfaceC6580i.f21267f0)) ? EnumC6575d.f21259Z : EnumC6575d.f21258Y;
            }
            c6354gM6972a = c6351dM6973a.m6972a();
            C0825i c0825i3 = C0825i.f2305a;
            try {
                if (c6354gM6972a.f20662b.equals(C6359l.f20696a)) {
                    throw new C6360m("The request's data is null.");
                }
                c6358k.start();
                if (i10 == 0) {
                    c0838v.f2328Y = this;
                    c0838v.f2329Z = c6358k;
                    c0838v.f2330o0 = c6354gM6972a;
                    c0838v.f2331p0 = c0825i3;
                    c0838v.f2335t0 = 1;
                    if (c6358k.mo6971n(c0838v) == enumC19250a) {
                        return enumC19250a;
                    }
                    c0840x2 = this;
                    c6354g2 = c6354gM6972a;
                    interfaceC6362o2 = c6358k;
                    c0825i2 = c0825i3;
                } else {
                    c0840x2 = this;
                    interfaceC6362o2 = c6358k;
                    c0825i2 = c0825i3;
                }
                c6354gM6972a.getClass();
                c11234e = c6354gM6972a.f20663c;
                if (c11234e != null) {
                    interfaceC0829m2 = (InterfaceC0829m) c6354gM6972a.f20673m.invoke(c6354gM6972a);
                    if (interfaceC0829m2 == null) {
                        interfaceC0829m2 = (InterfaceC0829m) c6354gM6972a.f20681u.f20645h.invoke(c6354gM6972a);
                    }
                    asyncImagePainter = (AsyncImagePainter) c11234e.f34002o0;
                    if (interfaceC0829m2 != null) {
                        abstractC17140aM8193a = AbstractC7897H0.m8193a(interfaceC0829m2, ((C6354g) c11234e.f34001Z).f20661a, asyncImagePainter.f35902B0);
                    } else {
                        abstractC17140aM8193a = null;
                    }
                    AsyncImagePainter.m13135k(asyncImagePainter, new AsyncImagePainter$State$Loading(abstractC17140aM8193a));
                }
                c0825i2.getClass();
                InterfaceC6580i interfaceC6580i3 = c6354gM6972a.f20676p;
                c0838v.f2328Y = c0840x2;
                c0838v.f2329Z = interfaceC6362o2;
                c0838v.f2330o0 = c6354gM6972a;
                c0838v.f2331p0 = c0825i2;
                c0838v.f2332q0 = null;
                c0838v.f2335t0 = 2;
                objMo2445a = interfaceC6580i3.mo2445a(c0838v);
                if (objMo2445a == enumC19250a) {
                    return enumC19250a;
                }
                c6354g4 = c6354gM6972a;
                interfaceC0829m = null;
                interfaceC6362o3 = interfaceC6362o2;
                c0840x3 = c0840x2;
                objM1168P = objMo2445a;
                c0825i2.getClass();
                InterfaceC18776i interfaceC18776i2 = c6354g4.f20667g;
                C0839w c0839w2 = new C0839w(c6354g4, c0840x3, (C6579h) objM1168P, c0825i2, interfaceC0829m, null);
                c0838v.f2328Y = c0840x3;
                c0838v.f2329Z = interfaceC6362o3;
                c0838v.f2330o0 = c6354g4;
                c0838v.f2331p0 = c0825i2;
                c0838v.f2332q0 = null;
                c0838v.f2335t0 = 3;
                objM1168P = AbstractC0575H.m1168P(interfaceC18776i2, c0839w2, c0838v);
                if (objM1168P == enumC19250a) {
                    return enumC19250a;
                }
                c0825i = c0825i2;
                c6354g3 = c6354g4;
                interfaceC6362o = interfaceC6362o3;
                c0840x = c0840x3;
                interfaceC6357j = (InterfaceC6357j) objM1168P;
                if (interfaceC6357j instanceof C6363p) {
                    C11234e c11234e4 = c6354g3.f20663c;
                    c0840x.getClass();
                    C6354g c6354g6 = ((C6363p) interfaceC6357j).f20708b;
                    c0825i.getClass();
                    c6354g6.getClass();
                } else {
                    if (!(interfaceC6357j instanceof C6350c)) {
                        throw new C0644w();
                    }
                    c0840x.m1899c((C6350c) interfaceC6357j, c6354g3.f20663c, c0825i);
                }
                interfaceC6362o.mo6970m();
                return interfaceC6357j;
            } catch (Throwable th6) {
                th = th6;
                c0840x = this;
                interfaceC6362o = c6358k;
                c0825i = c0825i3;
                c6354g3 = c6354gM6972a;
                if (th instanceof CancellationException) {
                    C6350c c6350cM10368a2 = AbstractC9765M.m10368a(c6354g3, th);
                    c0840x.m1899c(c6350cM10368a2, c6354g3.f20663c, c0825i);
                    interfaceC6362o.mo6970m();
                    return c6350cM10368a2;
                }
                C0835s c0835s2 = c0840x.f2343a;
                c0825i.getClass();
                c6354g3.getClass();
                throw th;
            }
            c6354gM6972a.getClass();
            c11234e = c6354gM6972a.f20663c;
            if (c11234e != null) {
                interfaceC0829m2 = (InterfaceC0829m) c6354gM6972a.f20673m.invoke(c6354gM6972a);
                if (interfaceC0829m2 == null) {
                    interfaceC0829m2 = (InterfaceC0829m) c6354gM6972a.f20681u.f20645h.invoke(c6354gM6972a);
                }
                asyncImagePainter = (AsyncImagePainter) c11234e.f34002o0;
                if (interfaceC0829m2 != null) {
                    abstractC17140aM8193a = AbstractC7897H0.m8193a(interfaceC0829m2, ((C6354g) c11234e.f34001Z).f20661a, asyncImagePainter.f35902B0);
                } else {
                    abstractC17140aM8193a = null;
                }
                AsyncImagePainter.m13135k(asyncImagePainter, new AsyncImagePainter$State$Loading(abstractC17140aM8193a));
            }
            c0825i2.getClass();
            InterfaceC6580i interfaceC6580i4 = c6354gM6972a.f20676p;
            c0838v.f2328Y = c0840x2;
            c0838v.f2329Z = interfaceC6362o2;
            c0838v.f2330o0 = c6354gM6972a;
            c0838v.f2331p0 = c0825i2;
            c0838v.f2332q0 = null;
            c0838v.f2335t0 = 2;
            objMo2445a = interfaceC6580i4.mo2445a(c0838v);
            if (objMo2445a == enumC19250a) {
                return enumC19250a;
            }
            c6354g4 = c6354gM6972a;
            interfaceC0829m = null;
            interfaceC6362o3 = interfaceC6362o2;
            c0840x3 = c0840x2;
            objM1168P = objMo2445a;
            c0825i2.getClass();
            InterfaceC18776i interfaceC18776i3 = c6354g4.f20667g;
            C0839w c0839w3 = new C0839w(c6354g4, c0840x3, (C6579h) objM1168P, c0825i2, interfaceC0829m, null);
            c0838v.f2328Y = c0840x3;
            c0838v.f2329Z = interfaceC6362o3;
            c0838v.f2330o0 = c6354g4;
            c0838v.f2331p0 = c0825i2;
            c0838v.f2332q0 = null;
            c0838v.f2335t0 = 3;
            objM1168P = AbstractC0575H.m1168P(interfaceC18776i3, c0839w3, c0838v);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
            c0825i = c0825i2;
            c6354g3 = c6354g4;
            interfaceC6362o = interfaceC6362o3;
            c0840x = c0840x3;
            interfaceC6357j = (InterfaceC6357j) objM1168P;
            if (interfaceC6357j instanceof C6363p) {
                C11234e c11234e5 = c6354g3.f20663c;
                c0840x.getClass();
                C6354g c6354g7 = ((C6363p) interfaceC6357j).f20708b;
                c0825i.getClass();
                c6354g7.getClass();
            } else {
                if (!(interfaceC6357j instanceof C6350c)) {
                    throw new C0644w();
                }
                c0840x.m1899c((C6350c) interfaceC6357j, c6354g3.f20663c, c0825i);
            }
            interfaceC6362o.mo6970m();
            return interfaceC6357j;
        } catch (Throwable th7) {
            th = th7;
            c0825i = c0825i2;
            interfaceC6362o = interfaceC6362o2;
            c0840x = c0840x2;
            c6354g3 = c6354gM6972a;
            if (th instanceof CancellationException) {
                C6350c c6350cM10368a3 = AbstractC9765M.m10368a(c6354g3, th);
                c0840x.m1899c(c6350cM10368a3, c6354g3.f20663c, c0825i);
                interfaceC6362o.mo6970m();
                return c6350cM10368a3;
            }
            C0835s c0835s3 = c0840x.f2343a;
            c0825i.getClass();
            c6354g3.getClass();
            throw th;
        }
        c6354gM6972a = c6354g2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1898b(C6354g c6354g, AbstractC19687c abstractC19687c) {
        C11234e c11234e = c6354g.f20663c;
        return ((c6354g.f20676p instanceof AbstractC6577f) || ((AbstractC11105n) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20689f)) != null) ? AbstractC0575H.m1183l(new C0837u(this, c6354g, null), abstractC19687c) : m1897a(c6354g, 1, abstractC19687c);
    }

    /* JADX INFO: renamed from: c */
    public final void m1899c(C6350c c6350c, C11234e c11234e, C0825i c0825i) {
        C6354g c6354g = c6350c.f20619b;
        c0825i.getClass();
        c6354g.getClass();
    }
}
