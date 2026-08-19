package io.sentry.hints;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.play_billing.C11986n2;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0669c;
import p026Ao.C0672f;
import p031B3.C0803g;
import p060C6.C1606c;
import p087D7.AbstractC1976c;
import p1050v.InterfaceC20412a;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p112E6.C2350i;
import p113E7.InterfaceC2353a;
import p165G9.C3020f;
import p165G9.InterfaceC3017c;
import p214Ib.C3676s;
import p232J3.InterfaceC4220U;
import p265Kb.InterfaceC4623p;
import p371P1.C6305a;
import p371P1.C6306b;
import p371P1.InterfaceC6307c;
import p384Ph.AbstractC6412b;
import p384Ph.C6411a;
import p384Ph.C6417g;
import p384Ph.C6425o;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p522V8.InterfaceC7838e;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8160o6;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p658b5.C11241l;
import p669c0.AbstractC11556b;
import p669c0.C11555a;
import p676c7.C11688g;
import p774h1.AbstractC14332J;
import p774h1.C14330H;
import p774h1.InterfaceC14339Q;
import p784hb.InterfaceC14441j;
import p909nm.AbstractC17678l;
import p959q8.C18639a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.sentry.hints.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15370i implements InterfaceC2353a, InterfaceC3017c, InterfaceC4220U, InterfaceC4623p, InterfaceC20412a, InterfaceC6307c, InterfaceC14339Q, InterfaceC14441j, InterfaceC7838e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47952Y;

    public /* synthetic */ C15370i(int i10) {
        this.f47952Y = i10;
    }

    /* JADX INFO: renamed from: h */
    public static final void m16623h(C0672f c0672f, long j10, boolean z6) {
        C0672f c0672f2;
        ReentrantLock reentrantLock = C0672f.f1954h;
        if (C0672f.f1958l == null) {
            C0672f.f1958l = new C0672f();
            C0669c c0669c = new C0669c("Okio Watchdog");
            c0669c.setDaemon(true);
            c0669c.start();
        }
        long jNanoTime = System.nanoTime();
        if (j10 != 0 && z6) {
            c0672f.f1961g = Math.min(j10, c0672f.mo1392c() - jNanoTime) + jNanoTime;
        } else if (j10 != 0) {
            c0672f.f1961g = j10 + jNanoTime;
        } else {
            if (!z6) {
                throw new AssertionError();
            }
            c0672f.f1961g = c0672f.mo1392c();
        }
        long j11 = c0672f.f1961g - jNanoTime;
        C0672f c0672f3 = C0672f.f1958l;
        AbstractC16544l.m18091d(c0672f3);
        while (true) {
            c0672f2 = c0672f3.f1960f;
            if (c0672f2 == null || j11 < c0672f2.f1961g - jNanoTime) {
                break;
            }
            AbstractC16544l.m18091d(c0672f2);
            c0672f3 = c0672f2;
        }
        c0672f.f1960f = c0672f2;
        c0672f3.f1960f = c0672f;
        if (c0672f3 == C0672f.f1958l) {
            C0672f.f1955i.signal();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final float m16624j(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fMax;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fMax = fSignum * fArr2[iBinarySearch];
        } else {
            int i10 = -(iBinarySearch + 1);
            int i11 = i10 - 1;
            if (i11 >= fArr.length - 1) {
                float f15 = fArr[fArr.length - 1];
                float f16 = fArr2[fArr.length - 1];
                if (f15 == 0.0f) {
                    return 0.0f;
                }
                return (f16 / f15) * f10;
            }
            if (i11 == -1) {
                float f17 = fArr[0];
                f13 = fArr2[0];
                f14 = f17;
                f12 = 0.0f;
                f11 = 0.0f;
            } else {
                float f18 = fArr[i11];
                float f19 = fArr[i10];
                f11 = fArr2[i11];
                f12 = f18;
                f13 = fArr2[i10];
                f14 = f19;
            }
            fMax = fSignum * (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11);
        }
        return fMax;
    }

    /* JADX INFO: renamed from: k */
    public static C0672f m16625k() throws InterruptedException {
        C0672f c0672f = C0672f.f1958l;
        AbstractC16544l.m18091d(c0672f);
        C0672f c0672f2 = c0672f.f1960f;
        if (c0672f2 == null) {
            long jNanoTime = System.nanoTime();
            C0672f.f1955i.await(C0672f.f1956j, TimeUnit.MILLISECONDS);
            C0672f c0672f3 = C0672f.f1958l;
            AbstractC16544l.m18091d(c0672f3);
            if (c0672f3.f1960f != null || System.nanoTime() - jNanoTime < C0672f.f1957k) {
                return null;
            }
            return C0672f.f1958l;
        }
        long jNanoTime2 = c0672f2.f1961g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0672f.f1955i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0672f c0672f4 = C0672f.f1958l;
        AbstractC16544l.m18091d(c0672f4);
        c0672f4.f1960f = c0672f2.f1960f;
        c0672f2.f1960f = null;
        c0672f2.f1959e = 2;
        return c0672f2;
    }

    /* JADX INFO: renamed from: l */
    public static C2350i m16626l(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C2350i(httpURLConnection, 1);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC6412b m16627m(C1606c e10) {
        String message;
        AbstractC16544l.m18094g(e10, "e");
        Throwable cause = e10.getCause();
        if (cause instanceof C1606c) {
            return m16627m((C1606c) cause);
        }
        if (!(cause instanceof ProtocolException) || (message = cause.getMessage()) == null || !AbstractC21322p.m21667A(message, "403 Forbidden", false)) {
            return null;
        }
        String message2 = cause.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        return new C6417g(null, message2);
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance("SHA-512") : KeyPairGenerator.getInstance("SHA-512", provider);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        return new ArrayList();
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: a */
    public boolean mo4941a() {
        return true;
    }

    @Override // p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        switch (this.f47952Y) {
            case 10:
                return obj;
            default:
                return ((C11986n2) obj).m13346b();
        }
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: c */
    public int mo4943c(long j10) {
        return 0;
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: d */
    public int mo4944d(C15384c c15384c, C0803g c0803g, int i10) {
        c0803g.f2213Z = 4;
        return -4;
    }

    @Override // p165G9.InterfaceC3017c
    /* JADX INFO: renamed from: e */
    public int mo3862e(Context context, String str, boolean z6) {
        return C3020f.m3867d(context, str, z6);
    }

    @Override // p165G9.InterfaceC3017c
    /* JADX INFO: renamed from: f */
    public int mo3863f(Context context, String str) {
        return C3020f.m3865a(context, str);
    }

    @Override // p113E7.InterfaceC2353a
    /* JADX INFO: renamed from: g */
    public String mo3437g(Object obj) {
        C11688g model = (C11688g) obj;
        AbstractC16544l.m18094g(model, "model");
        C3676s c3676s = new C3676s();
        String str = model.f35452a;
        if (str != null) {
            c3676s.m4394v(ParameterNames.f31999ID, str);
        }
        String str2 = model.f35453b;
        if (str2 != null) {
            c3676s.m4394v(DiagnosticsEntry.NAME_KEY, str2);
        }
        String str3 = model.f35454c;
        if (str3 != null) {
            c3676s.m4394v("email", str3);
        }
        for (Map.Entry entry : model.f35455d.entrySet()) {
            String str4 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!AbstractC17678l.m19298e(str4, C11688g.f35451e)) {
                c3676s.m4391s(str4, AbstractC1976c.m3153j(value));
            }
        }
        String string = c3676s.m4390m().toString();
        AbstractC16544l.m18093f(string, "model.toJson().asJsonObject.toString()");
        return string;
    }

    @Override // p371P1.InterfaceC6307c
    /* JADX INFO: renamed from: i */
    public C6306b mo5855i() {
        return new C6306b(AbstractC9393x3.m9974d(new C6305a(Locale.getDefault())));
    }

    @Override // p371P1.InterfaceC6307c
    /* JADX INFO: renamed from: n */
    public Locale mo5859n(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC16544l.m18089b(localeForLanguageTag.toLanguageTag(), "und")) {
            AbstractC15256t.m16465c("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // p774h1.InterfaceC14339Q
    /* JADX INFO: renamed from: o */
    public AbstractC14332J mo4178o(long j10, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b) {
        return new C14330H(AbstractC8096g6.m8568b(0L, j10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public Serializable m16628p(C8915b0 c8915b0, AbstractC19687c abstractC19687c) {
        C6411a c6411a;
        Serializable serializable;
        if (abstractC19687c instanceof C6411a) {
            c6411a = (C6411a) abstractC19687c;
            int i10 = c6411a.f20854p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6411a.f20854p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6411a = new C6411a(this, abstractC19687c);
            }
        } else {
            c6411a = new C6411a(this, abstractC19687c);
        }
        Object objM21171m = c6411a.f20852Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6411a.f20854p0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c8915b0 = c6411a.f20851Y;
                    AbstractC9233X.m9807c(objM21171m);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM21171m);
                }
                serializable = (AbstractC6412b) objM21171m;
                return serializable;
            }
            AbstractC9233X.m9807c(objM21171m);
            C20513d c20513d = C6425o.f20877q0;
            c6411a.f20851Y = c8915b0;
            c6411a.f20854p0 = 1;
            objM21171m = c20513d.m21171m(c8915b0, c6411a);
            if (objM21171m == enumC19250a) {
                return enumC19250a;
            }
            serializable = (C6425o) objM21171m;
            if (serializable == null) {
                C18639a c18639a = C6417g.f20864p0;
                c6411a.f20851Y = null;
                c6411a.f20854p0 = 2;
                objM21171m = c18639a.m20000o(c8915b0, c6411a);
                if (objM21171m == enumC19250a) {
                    return enumC19250a;
                }
                serializable = (AbstractC6412b) objM21171m;
            }
            return serializable;
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(AbstractC6412b.f20856o0, "Unexpected exception parsing Cloudflare error response", e10, null, 4);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16629q(C11241l c11241l, float f10) {
        C11555a c11555a = (C11555a) ((Drawable) c11241l.f34016Y);
        CardView cardView = (CardView) c11241l.f34017Z;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != c11555a.f34924e || c11555a.f34925f != useCompatPadding || c11555a.f34926g != preventCornerOverlap) {
            c11555a.f34924e = f10;
            c11555a.f34925f = useCompatPadding;
            c11555a.f34926g = preventCornerOverlap;
            c11555a.m12933b(null);
            c11555a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c11241l.m12589I(0, 0, 0, 0);
            return;
        }
        C11555a c11555a2 = (C11555a) ((Drawable) c11241l.f34016Y);
        float f11 = c11555a2.f34924e;
        float f12 = c11555a2.f34920a;
        int iCeil = (int) Math.ceil(AbstractC11556b.m12934a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC11556b.m12935b(f11, f12, cardView.getPreventCornerOverlap()));
        c11241l.m12589I(iCeil, iCeil2, iCeil, iCeil2);
    }

    public String toString() {
        switch (this.f47952Y) {
            case 26:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: b */
    public void mo4942b() {
    }
}
