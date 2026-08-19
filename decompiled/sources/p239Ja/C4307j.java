package p239Ja;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Bundle;
import android.util.Log;
import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import com.openai.chatgpt.R;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import io.sentry.C15132I1;
import io.sentry.C15134J0;
import io.sentry.InterfaceC15137K0;
import io.sentry.InterfaceC15159S;
import io.sentry.android.core.C15193K;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC15224f;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.android.replay.capture.AbstractC15275f;
import io.sentry.android.replay.capture.C15278i;
import io.sentry.android.replay.capture.C15287r;
import io.sentry.cache.C15329c;
import io.sentry.util.InterfaceC15497b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jm.InterfaceC16271b;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0083q0;
import p006A4.C0359t;
import p049Bm.InterfaceC1436k;
import p1016t3.C19765O;
import p1050v.InterfaceC20412a;
import p1072w2.InterfaceC20790b;
import p1073w3.AbstractC20817s;
import p1113xn.AbstractC21322p;
import p117Eb.C2391u;
import p158G3.C2988g;
import p281L3.C4919f;
import p281L3.C4922i;
import p281L3.InterfaceC4925l;
import p301M.InterfaceC5219a;
import p349O0.InterfaceC5985X;
import p372P3.C6339u;
import p372P3.InterfaceC6324f;
import p402Qc.C6593i;
import p414R.C6777k;
import p414R.C6779m;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8158o4;
import p536W.C8408d;
import p543W8.C8441b;
import p543W8.C8442c;
import p561X.C8990d;
import p561X.C9005s;
import p570X8.C9081i;
import p570X8.C9085m;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9553e;
import p588Y2.C9614S;
import p593Y8.C9682i;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p647ak.C10718n0;
import p663b9.C11262a;
import p663b9.EnumC11264c;
import p723e9.C13350h;
import p723e9.C13352j;
import p729ej.C13414e;
import p745f9.C13589g;
import p745f9.InterfaceC13585c;
import p745f9.InterfaceC13586d;
import p746fa.InterfaceC13596e;
import p747fb.InterfaceFutureC13608b;
import p749fd.C13628m;
import p758g0.C13775m0;
import p767g9.InterfaceC13831b;
import p791hj.C14522e;
import p802i6.InterfaceC14937c;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p841k.InterfaceC16282b;
import p909nm.AbstractC17680n;
import p961qb.C18661b;
import sb.C19517d;
import sb.C19518e;

/* JADX INFO: renamed from: Ja.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4307j implements InterfaceC4925l, InterfaceC10143j, InterfaceC6324f, InterfaceC5219a, InterfaceC20412a, InterfaceC16271b, InterfaceC9553e, InterfaceC20790b, InterfaceC14937c, InterfaceC13831b, InterfaceC16282b, InterfaceC13596e, InterfaceC15137K0, InterfaceC15497b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13995Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f13996Z;

    public /* synthetic */ C4307j(Object obj, int i10) {
        this.f13995Y = i10;
        this.f13996Z = obj;
    }

    /* JADX INFO: renamed from: l */
    private final void m5055l(C15134J0 scope) {
        SentryNavigationListener this$0 = (SentryNavigationListener) this.f13996Z;
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(scope, "scope");
        synchronized (scope.f47125m) {
            if (AbstractC16544l.m18089b(scope.f47113a, this$0.f47646g)) {
                scope.m16304a();
            }
        }
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        boolean z6 = false;
        Object obj = this.f13996Z;
        switch (this.f13995Y) {
            case 16:
                C13589g c13589g = (C13589g) ((InterfaceC13585c) obj);
                c13589g.getClass();
                int i10 = C11262a.f34115e;
                C2391u c2391u = new C2391u(12, z6);
                c2391u.f7430o0 = null;
                c2391u.f7431p0 = new ArrayList();
                c2391u.f7432q0 = null;
                c2391u.f7429Z = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM15109a = c13589g.m15109a();
                sQLiteDatabaseM15109a.beginTransaction();
                try {
                    C11262a c11262a = (C11262a) C13589g.m15105T(sQLiteDatabaseM15109a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0083q0(c13589g, map, c2391u, 11));
                    sQLiteDatabaseM15109a.setTransactionSuccessful();
                    return c11262a;
                } finally {
                    sQLiteDatabaseM15109a.endTransaction();
                }
            case 17:
                C13589g c13589g2 = (C13589g) ((InterfaceC13586d) obj);
                long time = c13589g2.f42951Z.getTime() - c13589g2.f42953p0.f42942d;
                SQLiteDatabase sQLiteDatabaseM15109a2 = c13589g2.m15109a();
                sQLiteDatabaseM15109a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseM15109a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c13589g2.m15107E(cursorRawQuery.getInt(0), EnumC11264c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM15109a2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM15109a2.setTransactionSuccessful();
                    sQLiteDatabaseM15109a2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th3) {
                    sQLiteDatabaseM15109a2.endTransaction();
                    throw th3;
                }
            case 18:
                C13589g c13589g3 = (C13589g) ((C13350h) obj).f42360i;
                SQLiteDatabase sQLiteDatabaseM15109a3 = c13589g3.m15109a();
                sQLiteDatabaseM15109a3.beginTransaction();
                try {
                    sQLiteDatabaseM15109a3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM15109a3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c13589g3.f42951Z.getTime()).execute();
                    sQLiteDatabaseM15109a3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM15109a3.endTransaction();
                }
            default:
                C13352j c13352j = (C13352j) obj;
                Iterator it = ((Iterable) ((C13589g) c13352j.f42369b).m15110k(new C8990d(6))).iterator();
                while (it.hasNext()) {
                    c13352j.f42370c.m14938a((C9682i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        return (InterfaceFutureC13608b) ((C6593i) this.f13996Z).invoke(obj);
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f13995Y) {
            case 3:
                C6777k c6777k = (C6777k) this.f13996Z;
                c6777k.f21759p = c10142i;
                return "SettableFuture hashCode: " + c6777k.hashCode();
            case 4:
                ((C6779m) this.f13996Z).f21787w0 = c10142i;
                return "SurfaceOutputImpl close future complete";
            default:
                ((C9005s) this.f13996Z).f27480k.set(c10142i);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // p372P3.InterfaceC6324f
    /* JADX INFO: renamed from: c */
    public long mo3666c(long j10) {
        C6339u c6339u = (C6339u) this.f13996Z;
        return AbstractC20817s.m21409j((j10 * ((long) c6339u.f20569e)) / 1000000, 0L, c6339u.f20574j - 1);
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        ((InterfaceC1436k) ((InterfaceC5985X) this.f13996Z).getValue()).invoke(obj);
    }

    @Override // p586Y0.InterfaceC9553e
    public void dispose() {
        C13775m0 c13775m0 = (C13775m0) this.f13996Z;
        synchronized (AbstractC9562n.f28759b) {
            AbstractC9562n.f28765h = AbstractC17680n.m19357g0((Iterable) AbstractC9562n.f28765h, c13775m0);
        }
        AbstractC9562n.m10077a();
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public void mo390f(C15134J0 it) {
        C15132I1 c15132i1;
        switch (this.f13995Y) {
            case 22:
                C15193K c15193k = (C15193K) this.f13996Z;
                if (c15193k.f47337Y.get() != 0 || (c15132i1 = it.f47123k) == null) {
                    return;
                }
                Date date = c15132i1.f47099Y;
                if ((date == null ? null : (Date) date.clone()) != null) {
                    AtomicLong atomicLong = c15193k.f47337Y;
                    Date date2 = c15132i1.f47099Y;
                    atomicLong.set((date2 != null ? (Date) date2.clone() : null).getTime());
                    c15193k.f47338Z.set(true);
                    return;
                }
                return;
            case 23:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f13996Z;
                C15132I1 c15132i2 = it.f47123k;
                if (c15132i2 != null) {
                    Date date3 = c15132i2.f47099Y;
                    if ((date3 == null ? null : (Date) date3.clone()) != null) {
                        atomicBoolean.set(true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                GestureDetectorOnGestureListenerC15224f gestureDetectorOnGestureListenerC15224f = (GestureDetectorOnGestureListenerC15224f) this.f13996Z;
                gestureDetectorOnGestureListenerC15224f.getClass();
                synchronized (it.f47125m) {
                    if (it.f47113a == gestureDetectorOnGestureListenerC15224f.f47495e) {
                        it.m16304a();
                    }
                    break;
                }
                return;
            case 25:
                m5054k(it);
                return;
            case 26:
                m5055l(it);
                return;
            case 27:
                C15278i this$0 = (C15278i) this.f13996Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18094g(it, "it");
                it.m16305b(this$0.m16498j());
                return;
            default:
                C15287r this$1 = (C15287r) this.f13996Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                AbstractC16544l.m18094g(it, "it");
                it.m16305b(this$1.m16498j());
                String str = it.f47115c;
                this$1.f47718m.setValue(this$1, AbstractC15275f.f47705r[2], str != null ? AbstractC21322p.m21703k0('.', str, str) : null);
                return;
        }
    }

    @Override // io.sentry.util.InterfaceC15497b
    /* JADX INFO: renamed from: g */
    public Object mo5056g() {
        return ((C15329c) this.f13996Z).f47877Y.getSerializer();
    }

    @Override // p802i6.InterfaceC14937c
    public Integer getValue() {
        C10718n0 this$0 = (C10718n0) this.f13996Z;
        AbstractC16544l.m18094g(this$0, "this$0");
        Context context = this$0.f31844a.f34747a.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        return Integer.valueOf(AbstractC8040Z5.m8408d(context, R.attr.colorPrimary));
    }

    /* JADX INFO: renamed from: h */
    public C2988g m5057h(Object obj) throws IOException {
        C8441b c8441b = (C8441b) obj;
        C8442c c8442c = (C8442c) this.f13996Z;
        URL url = c8441b.f26281a;
        String strM8719d = AbstractC8158o4.m8719d("CctTransportBackend");
        if (Log.isLoggable(strM8719d, 4)) {
            Log.i(strM8719d, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) c8441b.f26281a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c8442c.f26290g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(SIPHeaderNames.USER_AGENT, "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
        String str = c8441b.f26283c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C13414e c13414e = c8442c.f26284a;
                    C9081i c9081i = c8441b.f26282b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C19517d c19517d = (C19517d) c13414e.f42490Y;
                    C19518e c19518e = new C19518e(bufferedWriter, c19517d.f61982Y, c19517d.f61983Z, c19517d.f61984o0, c19517d.f61985p0);
                    c19518e.m20618f(c9081i);
                    c19518e.m20620h();
                    c19518e.f61987b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strM8719d2 = AbstractC8158o4.m8719d("CctTransportBackend");
                    if (Log.isLoggable(strM8719d2, 4)) {
                        Log.i(strM8719d2, String.format("Status Code: %d", numValueOf));
                    }
                    AbstractC8158o4.m8716a(httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_TYPE), "CctTransportBackend", "Content-Type: %s");
                    AbstractC8158o4.m8716a(httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_ENCODING), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C2988g(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C2988g(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C2988g c2988g = new C2988g(responseCode, null, C9085m.m9626a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f27851a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c2988g;
                        } catch (Throwable th2) {
                            if (gZIPInputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        if (inputStream == null) {
                            throw th4;
                        }
                        try {
                            inputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                if (outputStream == null) {
                    throw th8;
                }
                try {
                    outputStream.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (ConnectException e10) {
            e = e10;
            AbstractC8158o4.m8718c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2988g(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            AbstractC8158o4.m8718c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2988g(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            AbstractC8158o4.m8718c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2988g(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        } catch (C18661b e13) {
            e = e13;
            AbstractC8158o4.m8718c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2988g(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        }
    }

    @Override // p281L3.InterfaceC4925l
    /* JADX INFO: renamed from: i */
    public C11294T mo393i(int i10, C19765O c19765o, int[] iArr) {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        for (int i11 = 0; i11 < c19765o.f62602a; i11++) {
            int i12 = i11;
            c11333zM12690s.m12762a(new C4919f(i10, c19765o, i12, (C4922i) this.f13996Z, iArr[i11]));
        }
        return c11333zM12690s.m12768j();
    }

    /* JADX INFO: renamed from: j */
    public void m5058j(String str, Bundle bundle) {
        int i10 = InquiryActivity.f40657O0;
        InquiryActivity this$0 = (InquiryActivity) this.f13996Z;
        AbstractC16544l.m18094g(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // p1072w2.InterfaceC20790b
    public void onCancel() {
        C9614S this$0 = (C9614S) this.f13996Z;
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.m10155a();
    }

    @Override // p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        ((C13628m) this.f13996Z).invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    private final void m5054k(C15134J0 c15134j0) {
        InterfaceC15159S transaction = (InterfaceC15159S) this.f13996Z;
        AbstractC16544l.m18094g(transaction, "$transaction");
        AbstractC16544l.m18094g(c15134j0, FpwNpGDhomXHZ.drxcRDcaOTF);
        synchronized (c15134j0.f47125m) {
            if (c15134j0.f47113a == null) {
                c15134j0.m16307d(transaction);
            }
        }
    }

    @Override // jm.InterfaceC16271b
    /* JADX INFO: renamed from: e */
    public void mo389e(String key, String value) {
        C14522e c14522e = (C14522e) this.f13996Z;
        AbstractC16544l.m18093f(key, "key");
        c14522e.m16030x(key);
        switch (key.hashCode()) {
            case -1682961930:
                if (!key.equals("x-datadog-origin")) {
                    return;
                }
                break;
            case 304080974:
                if (!key.equals(VjclRfeKsMflo.tmAPz)) {
                    return;
                }
                break;
            case 1316815593:
                if (!key.equals("x-datadog-tags")) {
                    return;
                }
                break;
            case 1767467379:
                if (!key.equals("x-datadog-trace-id")) {
                    return;
                }
                break;
            default:
                return;
        }
        AbstractC16544l.m18093f(value, "value");
        c14522e.m16012b(key, value);
    }

    @Override // p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo22421apply(Object obj) {
        return (C8408d) ((C0359t) this.f13996Z).invoke(obj);
    }
}
