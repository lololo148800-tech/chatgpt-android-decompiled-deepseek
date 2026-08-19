package p273Kl;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.SystemClock;
import bo.AbstractC11516d;
import io.livekit.android.room.RegionSettings;
import java.io.Closeable;
import java.net.URI;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17356w;
import p025An.C0624m;
import p109E3.C2292p;
import p1113xn.AbstractC21329w;
import p402Qc.C6593i;
import p521V6.C7803F;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p791hj.C14522e;
import p974qo.C18792h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4801u0 {

    /* JADX INFO: renamed from: a */
    public final URI f15658a;

    /* JADX INFO: renamed from: b */
    public String f15659b;

    /* JADX INFO: renamed from: c */
    public final C17356w f15660c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11516d f15661d;

    /* JADX INFO: renamed from: e */
    public RegionSettings f15662e;

    /* JADX INFO: renamed from: f */
    public long f15663f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f15664g;

    public C4801u0(URI uri, String token, C17356w okHttpClient, AbstractC11516d json) {
        AbstractC16544l.m18094g(token, "token");
        AbstractC16544l.m18094g(okHttpClient, "okHttpClient");
        AbstractC16544l.m18094g(json, "json");
        this.f15658a = uri;
        this.f15659b = token;
        this.f15660c = okHttpClient;
        this.f15661d = json;
        this.f15664g = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m5436a(AbstractC19687c abstractC19687c) {
        C4797s0 c4797s0;
        String scheme;
        C4801u0 c4801u0;
        if (abstractC19687c instanceof C4797s0) {
            c4797s0 = (C4797s0) abstractC19687c;
            int i10 = c4797s0.f15649p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4797s0.f15649p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4797s0 = new C4797s0(this, abstractC19687c);
            }
        } else {
            c4797s0 = new C4797s0(this, abstractC19687c);
        }
        Object objM1261q = c4797s0.f15647Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4797s0.f15649p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1261q);
            C14522e c14522e = new C14522e(3);
            URI uri = this.f15658a;
            String scheme2 = uri.getScheme();
            AbstractC16544l.m18093f(scheme2, "getScheme(...)");
            if (AbstractC21329w.m21734u(scheme2, "ws", false)) {
                String scheme3 = uri.getScheme();
                AbstractC16544l.m18093f(scheme3, "getScheme(...)");
                scheme = AbstractC21329w.m21732s(scheme3, "ws", "http");
            } else {
                scheme = uri.getScheme();
            }
            String string = new URI(scheme, null, uri.getHost(), uri.getPort(), "/settings".concat("/regions"), null, null).toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            c14522e.m16010B(string);
            c14522e.m16024r(SIPHeaderNames.AUTHORIZATION, "Bearer " + this.f15659b);
            C18792h c18792hM19035b = this.f15660c.m19035b(c14522e.m16017i());
            c4797s0.f15646Y = this;
            c4797s0.f15649p0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c4797s0));
            c0624m.m1262r();
            c0624m.m1264u(new C6593i(c18792hM19035b, 15));
            c18792hM19035b.m20062d(new C7803F(c0624m));
            objM1261q = c0624m.m1261q();
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
            c4801u0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4801u0 = c4797s0.f15646Y;
            AbstractC9233X.m9807c(objM1261q);
        }
        Closeable closeable = (Closeable) objM1261q;
        try {
            C17327D c17327d = (C17327D) closeable;
            if (!c17327d.m18985a()) {
                throw new C2292p("Could not fetch region settings: " + c17327d.f55176p0 + ' ' + c17327d.f55175o0, null);
            }
            AbstractC17329F abstractC17329F = c17327d.f55179s0;
            if (abstractC17329F == null) {
                AbstractC7942M5.m8232a(closeable, null);
                return null;
            }
            String strM18991k = abstractC17329F.m18991k();
            AbstractC7942M5.m8232a(closeable, null);
            AbstractC11516d abstractC11516d = c4801u0.f15661d;
            abstractC11516d.getClass();
            Object objM12903b = abstractC11516d.m12903b(strM18991k, RegionSettings.INSTANCE.serializer());
            c4801u0.f15662e = (RegionSettings) objM12903b;
            c4801u0.f15663f = SystemClock.elapsedRealtime();
            return objM12903b;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(closeable, th2);
                throw th3;
            }
        }
    }
}
