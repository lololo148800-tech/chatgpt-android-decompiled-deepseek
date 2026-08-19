package p1061vb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.javax.sip.C10808o;
import android.location.Location;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import ba.C11269a;
import ec.C13362d;
import java.io.File;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Provider;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0571F;
import p026Ao.C0654C;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p051Bo.AbstractC1457c;
import p083D3.C1875m;
import p1009s9.C19501d;
import p1016t3.C19788o;
import p1036u9.InterfaceC20165k;
import p1043ui.C20292b;
import p1111xl.C21296a;
import p133F3.C2656b;
import p133F3.C2658d;
import p133F3.C2660f;
import p133F3.C2663i;
import p133F3.InterfaceC2661g;
import p140Fa.C2681a;
import p140Fa.C2691k;
import p165G9.C3018d;
import p165G9.InterfaceC3017c;
import p165G9.InterfaceC3019e;
import p209I6.AbstractC3622B;
import p209I6.C3624b;
import p209I6.C3626d;
import p209I6.C3630h;
import p209I6.EnumC3646x;
import p209I6.InterfaceC3647y;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p265Kb.InterfaceC4623p;
import p283L5.AbstractC4941g;
import p328N1.C5574A;
import p328N1.C5605u;
import p328N1.C5609y;
import p328N1.InterfaceC5575B;
import p351O2.C6087a;
import p351O2.InterfaceC6088b;
import p384Ph.C6418h;
import p384Ph.C6421k;
import p384Ph.C6425o;
import p434Rk.C6911c;
import p475T9.AbstractC7279b;
import p475T9.BinderC7280c;
import p475T9.C7281d;
import p475T9.C7290m;
import p477Tb.C7296c;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8199t5;
import p544W9.AbstractC8548R3;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p594Y9.C9841Y4;
import p594Y9.InterfaceC9882e5;
import p746fa.C13599h;
import p782h9.InterfaceC14430a;
import p783ha.AbstractC14431a;
import p784hb.InterfaceC14441j;
import p817j$.util.concurrent.ConcurrentHashMap;
import p885m4.C17151a;
import p939p3.InterfaceC18292b;
import p972qm.InterfaceC18775h;
import p996rm.EnumC19250a;
import pl.C18506a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: vb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20513d implements InterfaceC2661g, InterfaceC3019e, InterfaceC3647y, InterfaceC18775h, InterfaceC4623p, InterfaceC5575B, InterfaceC6088b, InterfaceC20165k, InterfaceC18292b, InterfaceC9882e5, InterfaceC14430a, InterfaceC14441j {

    /* JADX INFO: renamed from: Y */
    public static C20513d f65129Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C20513d f65130Z = new C20513d();

    /* JADX INFO: renamed from: k */
    public static C20513d m21167k(Context context, int i10) {
        AbstractC4941g.m5554M("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC14431a.f45383p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 4);
        AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 9);
        AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C2691k.m3690a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C2681a(0)).m3689a();
        typedArrayObtainStyledAttributes.recycle();
        C20513d c20513d = new C20513d();
        AbstractC4941g.m5557P(rect.left);
        AbstractC4941g.m5557P(rect.top);
        AbstractC4941g.m5557P(rect.right);
        AbstractC4941g.m5557P(rect.bottom);
        return c20513d;
    }

    /* JADX INFO: renamed from: l */
    public static Typeface m21168l(String str, C5609y c5609y, int i10) {
        if (C5605u.m5992a(i10, 0) && AbstractC16544l.m18089b(c5609y, C5609y.f18155r0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM9208a = AbstractC8548R3.m9208a(c5609y, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM9208a) : Typeface.create(str, iM9208a);
    }

    /* JADX INFO: renamed from: n */
    public static C0654C m21169n(String str, boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        C0678l c0678l = AbstractC1457c.f3827a;
        C0675i c0675i = new C0675i();
        c0675i.m1444l1(str);
        return AbstractC1457c.m2073d(c0675i, z6);
    }

    /* JADX INFO: renamed from: o */
    public static C0654C m21170o(File file) {
        String str = C0654C.f1910Z;
        String string = file.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return m21169n(string, false);
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? MessageDigest.getInstance("SHA-512") : MessageDigest.getInstance("SHA-512", provider);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        return new ConcurrentHashMap();
    }

    @Override // p133F3.InterfaceC2661g
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo3634a() {
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        C19501d c19501d;
        C13599h c13599h = (C13599h) obj2;
        C7281d c7281d = (C7281d) obj;
        C11269a c11269a = new C11269a(Long.MAX_VALUE, 0, false, null);
        C19501d[] c19501dArrMo13206k = c7281d.mo13206k();
        C19501d c19501d2 = null;
        if (c19501dArrMo13206k != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= c19501dArrMo13206k.length) {
                    c19501d = null;
                    break;
                }
                c19501d = c19501dArrMo13206k[i10];
                if ("location_updates_with_callback".equals(c19501d.f61946Y)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (c19501d != null && c19501d.m20594b() >= 1) {
                C7290m c7290m = (C7290m) c7281d.m13209q();
                BinderC7280c binderC7280c = new BinderC7280c(c13599h, 1);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i11 = AbstractC7279b.f23071a;
                parcelObtain.writeInt(1);
                c11269a.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                int iM8811j = AbstractC8199t5.m8811j(parcelObtain, 20293);
                AbstractC8199t5.m8813l(parcelObtain, 1, 4);
                parcelObtain.writeInt(4);
                AbstractC8199t5.m8805d(parcelObtain, 3, binderC7280c);
                AbstractC8199t5.m8812k(parcelObtain, iM8811j);
                c7290m.m7743d(parcelObtain, 90);
                return;
            }
        }
        C19501d[] c19501dArrMo13206k2 = c7281d.mo13206k();
        if (c19501dArrMo13206k2 != null) {
            for (C19501d c19501d3 : c19501dArrMo13206k2) {
                if ("get_last_location_with_request".equals(c19501d3.f61946Y)) {
                    c19501d2 = c19501d3;
                    break;
                }
            }
            if (c19501d2 != null && c19501d2.m20594b() >= 1) {
                C7290m c7290m2 = (C7290m) c7281d.m13209q();
                BinderC7280c binderC7280c2 = new BinderC7280c(c13599h, 1);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i12 = AbstractC7279b.f23071a;
                parcelObtain2.writeInt(1);
                c11269a.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeStrongBinder(binderC7280c2);
                c7290m2.m7743d(parcelObtain2, 82);
                return;
            }
        }
        C7290m c7290m3 = (C7290m) c7281d.m13209q();
        Parcel parcelObtain3 = Parcel.obtain();
        parcelObtain3.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Parcel parcelObtain4 = Parcel.obtain();
        try {
            try {
                c7290m3.f23096a.transact(7, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                parcelObtain3.recycle();
                Location location = (Location) AbstractC7279b.m7731a(parcelObtain4, Location.CREATOR);
                parcelObtain4.recycle();
                c13599h.m15114b(location);
            } catch (RuntimeException e10) {
                parcelObtain4.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcelObtain3.recycle();
            throw th2;
        }
    }

    @Override // p209I6.InterfaceC3647y
    /* JADX INFO: renamed from: b */
    public AbstractC3622B mo4344b(C3624b webSocketConnection, C10808o listener, InterfaceC0571F scope) {
        AbstractC16544l.m18094g(webSocketConnection, "webSocketConnection");
        AbstractC16544l.m18094g(listener, "listener");
        AbstractC16544l.m18094g(scope, "scope");
        C3626d c3626d = new C3626d(1, null);
        EnumC3646x enumC3646x = EnumC3646x.f11129Y;
        return new C3630h(c3626d, webSocketConnection, listener, scope, new C17151a());
    }

    @Override // p328N1.InterfaceC5575B
    /* JADX INFO: renamed from: c */
    public Typeface mo5982c(C5609y c5609y, int i10) {
        return m21168l(null, c5609y, i10);
    }

    @Override // p165G9.InterfaceC3019e
    /* JADX INFO: renamed from: d */
    public C3018d mo3864d(Context context, String str, InterfaceC3017c interfaceC3017c) {
        C3018d c3018d = new C3018d();
        int iMo3863f = interfaceC3017c.mo3863f(context, str);
        c3018d.f9092a = iMo3863f;
        if (iMo3863f != 0) {
            c3018d.f9094c = -1;
        } else {
            int iMo3862e = interfaceC3017c.mo3862e(context, str, true);
            c3018d.f9093b = iMo3862e;
            if (iMo3862e != 0) {
                c3018d.f9094c = 1;
            }
        }
        return c3018d;
    }

    @Override // p351O2.InterfaceC6088b
    /* JADX INFO: renamed from: e */
    public Object mo6660e(C6087a c6087a) {
        return C20292b.f64157Y.invoke(c6087a);
    }

    @Override // p133F3.InterfaceC2661g
    /* JADX INFO: renamed from: f */
    public C7296c mo3635f(C2658d c2658d, C19788o c19788o) {
        if (c19788o.f62756q == null) {
            return null;
        }
        return new C7296c(new C2656b(6001, new C2663i()), 10);
    }

    @Override // p133F3.InterfaceC2661g
    /* JADX INFO: renamed from: g */
    public /* synthetic */ C2660f mo3636g(C2658d c2658d, C19788o c19788o) {
        return C2660f.f8171a;
    }

    @Override // p209I6.InterfaceC3647y
    public String getName() {
        return "graphql-transport-ws";
    }

    @Override // p782h9.InterfaceC14430a
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p328N1.InterfaceC5575B
    /* JADX INFO: renamed from: i */
    public Typeface mo5983i(C5574A c5574a, C5609y c5609y, int i10) {
        String strConcat = c5574a.f18075p0;
        int i11 = c5609y.f18160Y / 100;
        if (i11 >= 0 && i11 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i11 && i11 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i11 != 4) {
            if (i11 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i11 || i11 >= 8) && 8 <= i11 && i11 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceM21168l = m21168l(strConcat, c5609y, i10);
            if (!AbstractC16544l.m18089b(typefaceM21168l, Typeface.create(Typeface.DEFAULT, AbstractC8548R3.m9208a(c5609y, i10))) && !AbstractC16544l.m18089b(typefaceM21168l, m21168l(null, c5609y, i10))) {
                typeface = typefaceM21168l;
            }
        }
        return typeface == null ? m21168l(c5574a.f18075p0, c5609y, i10) : typeface;
    }

    @Override // p133F3.InterfaceC2661g
    /* JADX INFO: renamed from: j */
    public int mo3638j(C19788o c19788o) {
        return c19788o.f62756q != null ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: m */
    public Serializable m21171m(C8915b0 c8915b0, AbstractC19687c abstractC19687c) {
        C6418h c6418h;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C6418h) {
            c6418h = (C6418h) abstractC19687c;
            int i10 = c6418h.f20868p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6418h.f20868p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6418h = new C6418h(this, abstractC19687c);
            }
        } else {
            c6418h = new C6418h(this, abstractC19687c);
        }
        Object objM7294a = c6418h.f20866Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6418h.f20868p0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM7294a);
                C6911c c6911cMo7303b = c8915b0.f27285Y.mo7303b();
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C6421k.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C6421k.class);
                } catch (Throwable unused) {
                    interfaceC3777yM18075c = null;
                }
                C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
                c6418h.f20865Y = c8915b0;
                c6418h.f20868p0 = 1;
                objM7294a = c6911cMo7303b.m7294a(c21296a, c6418h);
                if (objM7294a == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8915b0 = c6418h.f20865Y;
                AbstractC9233X.m9807c(objM7294a);
            }
            if (objM7294a != null) {
                return new C6425o(c8915b0, (C6421k) objM7294a);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.openai.network.cloudflare.CloudflareGeoIpError.Detail");
        } catch (IllegalArgumentException | C18506a unused2) {
            return null;
        }
    }

    @Override // p133F3.InterfaceC2661g
    public /* synthetic */ void release() {
    }

    @Override // p594Y9.InterfaceC9882e5
    /* JADX INFO: renamed from: t */
    public Object mo3670t(Object obj) {
        return new C13362d((C9841Y4) obj);
    }

    @Override // p133F3.InterfaceC2661g
    /* JADX INFO: renamed from: h */
    public void mo3637h(Looper looper, C1875m c1875m) {
    }
}
