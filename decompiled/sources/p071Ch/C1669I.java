package p071Ch;

import ac.C10539a;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import io.sentry.C15358g1;
import io.sentry.C15524y1;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import io.sentry.instrumentation.file.InterfaceC15376a;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.protocol.C15451x;
import io.sentry.util.AbstractC15500e;
import io.sentry.util.AbstractC15503h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;
import p201Hn.C3516e;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p449S9.C7042K;
import p523V9.C7996T4;
import p523V9.C8222w4;
import p523V9.C8246z4;
import p523V9.EnumC7893G4;
import p523V9.EnumC7901H4;
import p523V9.EnumC8214v4;
import p523V9.InterfaceC8224w6;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p615Z6.C10252z0;
import p619Zb.AbstractC10269b;
import p619Zb.C10273f;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C1669I implements InterfaceC8224w6 {

    /* JADX INFO: renamed from: Y */
    public long f4727Y;

    /* JADX INFO: renamed from: Z */
    public final Object f4728Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f4729o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f4730p0;

    /* JADX INFO: renamed from: q0 */
    public Object f4731q0;

    /* JADX INFO: renamed from: r0 */
    public Object f4732r0;

    public /* synthetic */ C1669I(C10273f c10273f, long j10, EnumC7901H4 enumC7901H4, C7042K c7042k, C7042K c7042k2, C10539a c10539a) {
        this.f4728Z = c10273f;
        this.f4727Y = j10;
        this.f4729o0 = enumC7901H4;
        this.f4730p0 = c7042k;
        this.f4731q0 = c7042k2;
        this.f4732r0 = c10539a;
    }

    @Override // p523V9.InterfaceC8224w6
    /* JADX INFO: renamed from: a */
    public C0420b mo2498a() {
        int iLimit;
        EnumC8214v4 enumC8214v4;
        C10273f c10273f = (C10273f) this.f4728Z;
        long j10 = this.f4727Y;
        EnumC7901H4 enumC7901H4 = (EnumC7901H4) this.f4729o0;
        C7042K c7042k = (C7042K) this.f4730p0;
        C7042K c7042k2 = (C7042K) this.f4731q0;
        C10539a c10539a = (C10539a) this.f4732r0;
        c10273f.getClass();
        C2392v c2392v = new C2392v(16, false);
        C2392v c2392v2 = new C2392v(15, false);
        c2392v2.f7436Z = Long.valueOf(j10 & Long.MAX_VALUE);
        c2392v2.f7437o0 = enumC7901H4;
        c2392v2.f7438p0 = Boolean.valueOf(C10273f.f30510j);
        Boolean bool = Boolean.TRUE;
        c2392v2.f7439q0 = bool;
        c2392v2.f7440r0 = bool;
        c2392v.f7436Z = new C8246z4(c2392v2);
        c2392v.f7437o0 = AbstractC10269b.m10866a(c10273f.f30511d);
        c2392v.f7438p0 = c7042k.m7441o();
        c2392v.f7439q0 = c7042k2.m7441o();
        int i10 = c10539a.f31260g;
        if (i10 == -1) {
            Bitmap bitmap = c10539a.f31254a;
            AbstractC20502t.m21157h(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i10 == 17 || i10 == 842094169) {
            ByteBuffer byteBuffer = c10539a.f31255b;
            AbstractC20502t.m21157h(byteBuffer);
            iLimit = byteBuffer.limit();
        } else if (i10 != 35) {
            iLimit = 0;
        } else {
            Image.Plane[] planeArrM10980a = c10539a.m10980a();
            AbstractC20502t.m21157h(planeArrM10980a);
            iLimit = (planeArrM10980a[0].getBuffer().limit() * 3) / 2;
        }
        C15384c c15384c = new C15384c(15, false);
        if (i10 == -1) {
            enumC8214v4 = EnumC8214v4.BITMAP;
        } else if (i10 == 35) {
            enumC8214v4 = EnumC8214v4.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC8214v4 = EnumC8214v4.YV12;
        } else if (i10 != 16) {
            enumC8214v4 = i10 != 17 ? EnumC8214v4.UNKNOWN_FORMAT : EnumC8214v4.NV21;
        } else {
            enumC8214v4 = EnumC8214v4.NV16;
        }
        c15384c.f47967Z = enumC8214v4;
        c15384c.f47968o0 = Integer.valueOf(Integer.MAX_VALUE & iLimit);
        c2392v.f7440r0 = new C8222w4(c15384c);
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30456o0 = c10273f.f30516i ? EnumC7893G4.TYPE_THICK : EnumC7893G4.TYPE_THIN;
        c10252z0.f30457p0 = new C7996T4(c2392v);
        return new C0420b(c10252z0, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m2499b(Closeable closeable) {
        try {
            try {
                closeable.close();
                m2500c();
            } catch (IOException e10) {
                this.f4731q0 = EnumC15147N1.INTERNAL_ERROR;
                InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) this.f4728Z;
                if (interfaceC15154Q != null) {
                    interfaceC15154Q.mo16284o(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            m2500c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2500c() {
        String str;
        List listEmptyList;
        InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) this.f4728Z;
        if (interfaceC15154Q != null) {
            long j10 = this.f4727Y;
            Charset charset = AbstractC15503h.f48425a;
            if (-1000 >= j10 || j10 >= 1000) {
                StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
                while (true) {
                    if (j10 > -999950 && j10 < 999950) {
                        break;
                    }
                    j10 /= 1000;
                    stringCharacterIterator.next();
                }
                str = String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j10 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            } else {
                str = j10 + " B";
            }
            C15524y1 c15524y1 = (C15524y1) this.f4730p0;
            File file = (File) this.f4729o0;
            if (file != null) {
                interfaceC15154Q.mo16282m(file.getName() + " (" + str + Separators.RPAREN);
                if (AbstractC15500e.f48420a || c15524y1.isSendDefaultPii()) {
                    interfaceC15154Q.mo16280k(file.getAbsolutePath(), "file.path");
                }
            } else {
                interfaceC15154Q.mo16282m(str);
            }
            interfaceC15154Q.mo16280k(Long.valueOf(this.f4727Y), "file.size");
            boolean zMo16438a = c15524y1.getMainThreadChecker().mo16438a();
            interfaceC15154Q.mo16280k(Boolean.valueOf(zMo16438a), "blocked_main_thread");
            if (zMo16438a) {
                C9895g4 c9895g4 = (C9895g4) this.f4732r0;
                c9895g4.getClass();
                ArrayList arrayListM10563z = c9895g4.m10563z(new Exception().getStackTrace(), false);
                if (arrayListM10563z == null) {
                    listEmptyList = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(arrayListM10563z.size());
                    for (Object obj : arrayListM10563z) {
                        if (Boolean.TRUE.equals(((C15451x) obj).f48250t0)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList(arrayListM10563z.size());
                        for (Object obj2 : arrayListM10563z) {
                            String str2 = ((C15451x) obj2).f48245o0;
                            if (str2 == null || (!str2.startsWith("sun.") && !str2.startsWith("java.") && !str2.startsWith("android.") && !str2.startsWith("com.android."))) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    listEmptyList = arrayList;
                }
                interfaceC15154Q.mo16280k(listEmptyList, "call_stack");
            }
            interfaceC15154Q.mo16278i((EnumC15147N1) this.f4731q0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: d */
    public Object m2501d(AbstractC19687c abstractC19687c) throws Throwable {
        C1666F c1666f;
        C1669I c1669i;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        C1669I c1669i2;
        C1669I c1669i3;
        long j10;
        InterfaceC4814a interfaceC4814a3;
        C1669I c1669i4;
        InterfaceC4814a interfaceC4814a4;
        InterfaceC4814a interfaceC4814a5;
        if (abstractC19687c instanceof C1666F) {
            c1666f = (C1666F) abstractC19687c;
            int i10 = c1666f.f4722s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1666f.f4722s0 = i10 - Integer.MIN_VALUE;
            } else {
                c1666f = new C1666F(this, abstractC19687c);
            }
        } else {
            c1666f = new C1666F(this, abstractC19687c);
        }
        Object obj = c1666f.f4720q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1666f.f4722s0;
        ?? r6 = 2;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    c1666f.f4716Y = this;
                    C4816c c4816c = (C4816c) this.f4731q0;
                    c1666f.f4717Z = c4816c;
                    c1666f.f4722s0 = 1;
                    if (c4816c.m5448e(null, c1666f) == enumC19250a) {
                        return enumC19250a;
                    }
                    c1669i = this;
                    interfaceC4814a = c4816c;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c1669i4 = c1666f.f4718o0;
                            InterfaceC4814a interfaceC4814a6 = c1666f.f4717Z;
                            c1669i2 = c1666f.f4716Y;
                            AbstractC9233X.m9807c(obj);
                            interfaceC4814a3 = interfaceC4814a6;
                            c1669i4.f4732r0 = obj;
                            interfaceC4814a5 = interfaceC4814a3;
                            c1669i = c1669i2;
                            interfaceC4814a4 = interfaceC4814a5;
                            interfaceC4814a4 = interfaceC4814a;
                            interfaceC4814a4 = interfaceC4814a;
                            interfaceC4814a4 = interfaceC4814a;
                            ((C4816c) interfaceC4814a4).m5450g(null);
                            return c1669i.f4732r0;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = c1666f.f4719p0;
                        c1669i3 = c1666f.f4718o0;
                        InterfaceC4814a interfaceC4814a7 = c1666f.f4717Z;
                        c1669i2 = c1666f.f4716Y;
                        AbstractC9233X.m9807c(obj);
                        interfaceC4814a2 = interfaceC4814a7;
                        c1669i3.f4732r0 = obj;
                        c1669i2.f4727Y = j10 + ((Long) c1669i2.f4729o0).longValue();
                        interfaceC4814a5 = interfaceC4814a2;
                        c1669i = c1669i2;
                        interfaceC4814a4 = interfaceC4814a5;
                        interfaceC4814a4 = interfaceC4814a;
                        interfaceC4814a4 = interfaceC4814a;
                        interfaceC4814a4 = interfaceC4814a;
                        ((C4816c) interfaceC4814a4).m5450g(null);
                        return c1669i.f4732r0;
                    }
                    InterfaceC4814a interfaceC4814a8 = c1666f.f4717Z;
                    c1669i = c1666f.f4716Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a = interfaceC4814a8;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object obj2 = c1669i.f4732r0;
                C1665E c1665e = C1665E.f4715a;
                InterfaceC18776i interfaceC18776i = (InterfaceC18776i) c1669i.f4728Z;
                if (obj2 == c1665e) {
                    C1667G c1667g = new C1667G(c1669i, null);
                    c1666f.f4716Y = c1669i;
                    c1666f.f4717Z = interfaceC4814a;
                    c1666f.f4718o0 = c1669i;
                    c1666f.f4722s0 = 2;
                    Object objM1168P = AbstractC0575H.m1168P(interfaceC18776i, c1667g, c1666f);
                    if (objM1168P == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC4814a3 = interfaceC4814a;
                    obj = objM1168P;
                    c1669i2 = c1669i;
                    c1669i4 = c1669i2;
                    c1669i4.f4732r0 = obj;
                    interfaceC4814a5 = interfaceC4814a3;
                    c1669i = c1669i2;
                    interfaceC4814a4 = interfaceC4814a5;
                } else if (((Long) c1669i.f4729o0) != null && jElapsedRealtime >= c1669i.f4727Y) {
                    C1668H c1668h = new C1668H(c1669i, null);
                    c1666f.f4716Y = c1669i;
                    c1666f.f4717Z = interfaceC4814a;
                    c1666f.f4718o0 = c1669i;
                    c1666f.f4719p0 = jElapsedRealtime;
                    c1666f.f4722s0 = 3;
                    Object objM1168P2 = AbstractC0575H.m1168P(interfaceC18776i, c1668h, c1666f);
                    if (objM1168P2 == enumC19250a) {
                        interfaceC4814a4 = interfaceC4814a;
                        interfaceC4814a4 = interfaceC4814a;
                        return enumC19250a;
                    }
                    interfaceC4814a4 = interfaceC4814a;
                    interfaceC4814a4 = interfaceC4814a;
                    interfaceC4814a2 = interfaceC4814a;
                    obj = objM1168P2;
                    c1669i2 = c1669i;
                    c1669i3 = c1669i2;
                    j10 = jElapsedRealtime;
                    c1669i3.f4732r0 = obj;
                    c1669i2.f4727Y = j10 + ((Long) c1669i2.f4729o0).longValue();
                    interfaceC4814a5 = interfaceC4814a2;
                    c1669i = c1669i2;
                    interfaceC4814a4 = interfaceC4814a5;
                }
                interfaceC4814a4 = interfaceC4814a;
                interfaceC4814a4 = interfaceC4814a;
                interfaceC4814a4 = interfaceC4814a;
                ((C4816c) interfaceC4814a4).m5450g(null);
                return c1669i.f4732r0;
            } catch (Throwable th2) {
                r6 = interfaceC4814a;
                th = th2;
                ((C4816c) r6).m5450g(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m2502e(InterfaceC15376a interfaceC15376a) {
        try {
            Object objCall = interfaceC15376a.call();
            if (objCall instanceof Integer) {
                int iIntValue = ((Integer) objCall).intValue();
                if (iIntValue != -1) {
                    this.f4727Y += (long) iIntValue;
                }
            } else if (objCall instanceof Long) {
                long jLongValue = ((Long) objCall).longValue();
                if (jLongValue != -1) {
                    this.f4727Y += jLongValue;
                }
            }
            return objCall;
        } catch (IOException e10) {
            this.f4731q0 = EnumC15147N1.INTERNAL_ERROR;
            InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) this.f4728Z;
            if (interfaceC15154Q != null) {
                interfaceC15154Q.mo16284o(e10);
            }
            throw e10;
        }
    }

    public C1669I(C1662B c1662b) {
        C3516e context = AbstractC0593T.f1824a;
        AbstractC16544l.m18094g(context, "context");
        this.f4728Z = context;
        this.f4729o0 = null;
        this.f4730p0 = c1662b;
        this.f4731q0 = AbstractC4817d.m5451a();
        this.f4732r0 = C1665E.f4715a;
    }

    public C1669I(InterfaceC15154Q interfaceC15154Q, File file, C15524y1 c15524y1) {
        this.f4731q0 = EnumC15147N1.OK;
        this.f4728Z = interfaceC15154Q;
        this.f4729o0 = file;
        this.f4730p0 = c15524y1;
        this.f4732r0 = new C9895g4(c15524y1);
        C15358g1.m16578n().m16579d("FileIO");
    }
}
