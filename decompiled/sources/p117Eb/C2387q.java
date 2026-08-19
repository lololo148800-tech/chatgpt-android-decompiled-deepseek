package p117Eb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import p523V9.AbstractC8238y4;
import p746fa.C13606o;

/* JADX INFO: renamed from: Eb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2387q implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final URL f7416Y;

    /* JADX INFO: renamed from: Z */
    public volatile Future f7417Z;

    /* JADX INFO: renamed from: o0 */
    public C13606o f7418o0;

    public C2387q(URL url) {
        this.f7416Y = url;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m3486a() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f7416Y;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM8883g = AbstractC8238y4.m8883g(new C2374d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM8883g.length + " bytes from " + url);
            }
            if (bArrM8883g.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM8883g, 0, bArrM8883g.length);
            if (bitmapDecodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7417Z.cancel(true);
    }
}
