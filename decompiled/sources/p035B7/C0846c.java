package p035B7;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;
import p049Bm.InterfaceC1426a;
import p1155zi.C22007g0;
import p1155zi.C22011h0;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9306j0;
import p749fd.C13625j;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: B7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0846c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2357Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f2358Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0846c(String str, int i10) {
        super(0);
        this.f2357Y = i10;
        this.f2358Z = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String strM22342a = this.f2358Z;
        switch (this.f2357Y) {
            case 0:
                return "Kronos onError @host:" + strM22342a;
            case 1:
                return String.format(Locale.US, "Error while trying to deserialize the serialized UserInfo: %s", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 2:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 3:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 4:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 5:
                if (strM22342a == null) {
                    C22011h0.Companion.getClass();
                    strM22342a = C22007g0.m22342a();
                }
                return new C22011h0(strM22342a);
            case 6:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 7:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 8:
                return String.format(Locale.US, "You set up a DatadogInterceptor for %s, but RUM features are disabled. Make sure you initialized the Datadog SDK with a valid Application Id, and that RUM features are enabled.", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 9:
                return String.format(Locale.US, "Unsupported HTTP method %s reported by OkHttp instrumentation, using GET instead", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 10:
                return "Error parsing source type from NDK crash event: " + strM22342a;
            case 11:
                return String.format(Locale.US, "Unknown RUM event meta type value [%s]", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 12:
                return AbstractC9306j0.m9891j(strM22342a, "] to a valid graphql operation type", new StringBuilder("Unable to convert ["));
            case 13:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 14:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 15:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 16:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 17:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 18:
            case 19:
                return strM22342a;
            case 20:
                return new C13625j(strM22342a);
            case 21:
                return strM22342a;
            case 22:
                return AbstractC9306j0.m9891j(strM22342a, "\" is an invalid tag, and was ignored.", new StringBuilder(Separators.DOUBLE_QUOTE));
            case 23:
                return String.format(Locale.US, "Cannot add event receiver for feature \"%s\", it is not registered.", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 24:
                return String.format(Locale.US, "Feature \"%s\" already has event receiver registered, overwriting it.", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 25:
                return AbstractC9306j0.m9891j(strM22342a, " has already been registered.", new StringBuilder(suYVq.MkhHddSLTwt));
            case 26:
                try {
                    InputStream inputStreamOpenStream = new URL(strM22342a).openStream();
                    try {
                        AbstractC16544l.m18091d(inputStreamOpenStream);
                        C0657F c0657fM1403c = AbstractC0668b.m1403c(AbstractC0668b.m1410j(inputStreamOpenStream));
                        InterfaceC0663L interfaceC0663L = c0657fM1403c.f1921Y;
                        C0675i c0675i = c0657fM1403c.f1922Z;
                        c0675i.mo1339u(interfaceC0663L);
                        String strM1428Z0 = c0675i.m1428Z0();
                        AbstractC7942M5.m8232a(inputStreamOpenStream, null);
                        return strM1428Z0;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(inputStreamOpenStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 27:
                return String.format(Locale.US, "Error while trying to deserialize the NetworkInfo: %s", Arrays.copyOf(new Object[]{strM22342a}, 1));
            case 28:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
            default:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{strM22342a}, 1));
        }
    }
}
