package p112E6;

import android.gov.nist.core.Separators;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import p026Ao.C0657F;
import p779h6.AbstractC14413b;
import p916o5.C17827e;

/* JADX INFO: renamed from: E6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2350i implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7296Y;

    /* JADX INFO: renamed from: Z */
    public final Object f7297Z;

    public /* synthetic */ C2350i(Object obj, int i10) {
        this.f7296Y = i10;
        this.f7297Z = obj;
    }

    /* JADX INFO: renamed from: a */
    public String m3435a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f7297Z;
        boolean z6 = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z6 = true;
            }
        } catch (IOException unused) {
        }
        if (z6) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append(Separators.RETURN);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb3.append(line);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e10) {
            AbstractC14413b.m15914c("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7296Y) {
            case 0:
                ((C0657F) this.f7297Z).close();
                break;
            case 1:
                ((HttpURLConnection) this.f7297Z).disconnect();
                break;
            default:
                ((C17827e) this.f7297Z).close();
                break;
        }
    }

    public C2350i(ArrayList arrayList, C0657F c0657f) {
        this.f7296Y = 0;
        this.f7297Z = c0657f;
    }
}
