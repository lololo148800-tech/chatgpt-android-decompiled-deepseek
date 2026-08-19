package p001A;

import android.content.Intent;
import android.content.IntentSender;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17315r;
import p032B4.C0806a;
import p032B4.InterfaceC0808c;
import p1073w3.C20808j;
import p1073w3.InterfaceC20806h;
import p140Fa.C2685e;
import p214Ib.C3676s;
import p228J.AbstractC3842j;
import p228J.InterfaceC3854p;
import p402Qc.C6593i;
import p447S7.C7025a;
import p447S7.C7026b;
import p447S7.C7028d;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p676c7.C11685d;
import p676c7.C11688g;
import p772h.C14227i;
import p775h2.AbstractC14376f;
import p841k.C16285e;
import p841k.InterfaceC16282b;
import p849k7.C16354g;
import p849k7.C16360m;
import p859l.C16650a;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: A.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0078o implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f319Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f320Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f321o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f322p0;

    public /* synthetic */ RunnableC0078o(Object obj, int i10, Object obj2, int i11) {
        this.f319Y = i11;
        this.f320Z = obj;
        this.f321o0 = i10;
        this.f322p0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        C11688g c11688g;
        C17315r c17315r;
        Map mapM19244f;
        Object obj = this.f322p0;
        int i11 = this.f321o0;
        Object obj2 = this.f320Z;
        switch (this.f319Y) {
            case 0:
                ((AbstractC3842j) obj2).mo9c(i11, (C2685e) obj);
                break;
            case 1:
                ((AbstractC3842j) obj2).mo8b(i11, (InterfaceC3854p) obj);
                break;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((C0084r) obj2).f335b).onCaptureSequenceAborted((CameraCaptureSession) obj, i11);
                break;
            case 3:
                ((CameraDevice.StateCallback) ((C0004C) obj2).f16b).onError((CameraDevice) obj, i11);
                break;
            case 4:
                ((InterfaceC0808c) ((C0806a) obj2).f2237c).mo1846i((Serializable) obj, i11);
                break;
            case 5:
                C7026b this$0 = (C7026b) obj2;
                AbstractC16544l.m18094g(this$0, "this$0");
                C16354g c16354g = (C16354g) obj;
                AbstractC14376f.m15825D(i11, "$reportTarget");
                C7028d c7028d = this$0.f22477y0;
                if (c7028d != null) {
                    C3676s c3676s = this$0.f22474v0;
                    C11688g c11688g2 = this$0.f22475w0;
                    C11685d c11685d = this$0.f22476x0;
                    Locale locale = Locale.US;
                    String str = c7028d.f22482d;
                    String str2 = String.format(locale, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{str}, 1));
                    int iM24h = AbstractC0010F.m24h(i11);
                    EnumC11255b enumC11255b = EnumC11255b.f34098Y;
                    String str3 = this$0.f22472t0;
                    String str4 = c7028d.f22484f;
                    long j10 = c7028d.f22480b;
                    if (iM24h != 0) {
                        i10 = i11;
                        if (iM24h == 1) {
                            if (c3676s != null) {
                                try {
                                    C6593i c6593i = new C6593i(c3676s, 7);
                                    c11688g = c11688g2;
                                    try {
                                        c17315r = new C17315r((String) c6593i.invoke(SIPServerTransaction.CONTENT_TYPE_APPLICATION), (String) c6593i.invoke(ParameterNames.SESSION), (String) c6593i.invoke("view"));
                                    } catch (Exception e10) {
                                        e = e10;
                                        AbstractC7889G0.m8184b(this$0.f22469q0, 4, EnumC11255b.f34099Z, C7025a.f22459Z, e, false, 48);
                                        c17315r = new C17315r(null, null, null);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    c11688g = c11688g2;
                                }
                                String str5 = (String) c17315r.f55146Y;
                                String str6 = (String) c17315r.f55147Z;
                                String str7 = (String) c17315r.f55148o0;
                                mapM19244f = (str5 == null || str6 == null || str7 == null) ? AbstractC17659D.m19244f(new C17309l("error.stack", str4), new C17309l("error.source_type", str3)) : AbstractC17659D.m19244f(new C17309l("session_id", str6), new C17309l("application_id", str5), new C17309l("view.id", str7), new C17309l("error.stack", str4), new C17309l("error.source_type", str3));
                            } else {
                                c11688g = c11688g2;
                                mapM19244f = AbstractC17659D.m19244f(new C17309l("error.stack", str4), new C17309l("error.source_type", str3));
                            }
                            C16360m c16360mMo15458n = c16354g.mo15458n("logs");
                            if (c16360mMo15458n != null) {
                                c16360mMo15458n.m17960a(AbstractC17659D.m19244f(new C17309l("loggerName", "ndk_crash"), new C17309l("type", "ndk_crash"), new C17309l("message", str2), new C17309l("attributes", mapM19244f), new C17309l(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(j10)), new C17309l("networkInfo", c11685d), new C17309l("userInfo", c11688g)));
                                this$0 = this$0;
                            } else {
                                this$0 = this$0;
                                AbstractC7889G0.m8184b(this$0.f22469q0, 3, enumC11255b, C7025a.f22461p0, null, false, 56);
                            }
                        }
                        break;
                    } else {
                        i10 = i11;
                        if (c3676s != null) {
                            C16360m c16360mMo15458n2 = c16354g.mo15458n("rum");
                            if (c16360mMo15458n2 != null) {
                                c16360mMo15458n2.m17960a(AbstractC17659D.m19244f(new C17309l("type", "ndk_crash"), new C17309l("sourceType", str3), new C17309l(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(j10)), new C17309l("timeSinceAppStartMs", c7028d.f22481c), new C17309l("signalName", str), new C17309l("stacktrace", str4), new C17309l("message", str2), new C17309l("lastViewEvent", c3676s)));
                            } else {
                                AbstractC7889G0.m8184b(this$0.f22469q0, 3, enumC11255b, C7025a.f22462q0, null, false, 56);
                            }
                        }
                    }
                } else {
                    i10 = i11;
                }
                int iM24h2 = AbstractC0010F.m24h(i10);
                if (iM24h2 == 0) {
                    this$0.f22464A0 = true;
                } else if (iM24h2 == 1) {
                    this$0.f22478z0 = true;
                }
                if (this$0.f22464A0 && this$0.f22478z0) {
                    this$0.f22474v0 = null;
                    this$0.f22476x0 = null;
                    this$0.f22475w0 = null;
                    this$0.f22477y0 = null;
                    break;
                }
                break;
            case 6:
                C14227i this$1 = (C14227i) obj2;
                AbstractC16544l.m18094g(this$1, "this$0");
                Serializable serializable = ((C16650a) obj).f53351a;
                String str8 = (String) this$1.f44670a.get(Integer.valueOf(i11));
                if (str8 != null) {
                    C16285e c16285e = (C16285e) this$1.f44674e.get(str8);
                    if ((c16285e != null ? c16285e.f50454a : null) == null) {
                        this$1.f44676g.remove(str8);
                        this$1.f44675f.put(str8, serializable);
                    } else {
                        InterfaceC16282b interfaceC16282b = c16285e.f50454a;
                        if (this$1.f44673d.remove(str8)) {
                            interfaceC16282b.mo3484d(serializable);
                        }
                    }
                    break;
                }
                break;
            case 7:
                C14227i this$2 = (C14227i) obj2;
                AbstractC16544l.m18094g(this$2, "this$0");
                IntentSender.SendIntentException e12 = (IntentSender.SendIntentException) obj;
                AbstractC16544l.m18094g(e12, "$e");
                this$2.m15528a(i11, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e12));
                break;
            default:
                for (C20808j c20808j : (CopyOnWriteArraySet) obj2) {
                    if (!c20808j.f66082d) {
                        if (i11 != -1) {
                            c20808j.f66080b.m366c(i11);
                        }
                        c20808j.f66081c = true;
                        ((InterfaceC20806h) obj).invoke(c20808j.f66079a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0078o(Object obj, Object obj2, int i10, int i11) {
        this.f319Y = i11;
        this.f320Z = obj;
        this.f322p0 = obj2;
        this.f321o0 = i10;
    }
}
