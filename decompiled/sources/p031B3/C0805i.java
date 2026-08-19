package p031B3;

import android.net.Uri;
import io.sentry.android.core.AbstractC15256t;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p158G3.C2983b;
import p164G8.AbstractC3010d;
import p554Wi.C8878e;
import p646aj.C10627g;

/* JADX INFO: renamed from: B3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0805i extends Thread {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2233Y;

    /* JADX INFO: renamed from: Z */
    public final Object f2234Z;

    public /* synthetic */ C0805i(Object obj, int i10) {
        this.f2233Y = i10;
        this.f2234Z = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f2233Y) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                    break;
                } while (((C2983b) this.f2234Z).m3818h());
                return;
            case 1:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f2234Z;
                scheduledExecutorService.shutdown();
                try {
                    if (scheduledExecutorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    scheduledExecutorService.shutdownNow();
                    return;
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
            case 2:
                AbstractC3010d abstractC3010d = (AbstractC3010d) ((WeakReference) this.f2234Z).get();
                if (abstractC3010d != null) {
                    abstractC3010d.close();
                    return;
                }
                return;
            case 3:
                ((C8878e) this.f2234Z).m9553b();
                return;
            case 4:
                FileOutputStream fileOutputStream = ((C10627g) this.f2234Z).f31536e;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
            default:
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap map = (HashMap) this.f2234Z;
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(string);
                            AbstractC15256t.m16482t("HttpUrlPinger", sb2.toString());
                            break;
                        }
                        return;
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e11) {
                    e = e11;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message);
                    AbstractC15256t.m16483u("HttpUrlPinger", sb3.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e12) {
                    String message2 = e12.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    AbstractC15256t.m16483u("HttpUrlPinger", sb4.toString(), e12);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    String message3 = e.getMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb5.append("Error while pinging URL: ");
                    sb5.append(string);
                    sb5.append(". ");
                    sb5.append(message3);
                    AbstractC15256t.m16483u("HttpUrlPinger", sb5.toString(), e);
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805i(C2983b c2983b) {
        super("ExoPlayer:SimpleDecoder");
        this.f2233Y = 0;
        this.f2234Z = c2983b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805i(ScheduledExecutorService scheduledExecutorService) {
        super("dd-exec-shutdown-hook");
        this.f2233Y = 1;
        this.f2234Z = scheduledExecutorService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805i(AbstractC3010d abstractC3010d) {
        super("dd-tracer-shutdown-hook");
        this.f2233Y = 2;
        this.f2234Z = new WeakReference(abstractC3010d);
    }
}
