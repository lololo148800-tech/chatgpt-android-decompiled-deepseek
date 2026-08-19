package p1142z3;

import android.content.Context;
import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21734b extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public final AssetManager f68943q0;

    /* JADX INFO: renamed from: r0 */
    public Uri f68944r0;

    /* JADX INFO: renamed from: s0 */
    public InputStream f68945s0;

    /* JADX INFO: renamed from: t0 */
    public long f68946t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f68947u0;

    public C21734b(Context context) {
        super(false);
        this.f68943q0 = context.getAssets();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21733a {
        try {
            Uri uri = c21743k.f68974a;
            long j10 = c21743k.f68979f;
            this.f68944r0 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(Separators.SLASH)) {
                path = path.substring(1);
            }
            m22237m();
            InputStream inputStreamOpen = this.f68943q0.open(path, 1);
            this.f68945s0 = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new C21733a(2008, null);
            }
            long j11 = c21743k.f68980g;
            if (j11 != -1) {
                this.f68946t0 = j11;
            } else {
                long jAvailable = this.f68945s0.available();
                this.f68946t0 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f68946t0 = -1L;
                }
            }
            this.f68947u0 = true;
            m22238n(c21743k);
            return this.f68946t0;
        } catch (C21733a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C21733a(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f68944r0 = null;
        try {
            try {
                InputStream inputStream = this.f68945s0;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f68945s0 = null;
                if (this.f68947u0) {
                    this.f68947u0 = false;
                    m22236l();
                }
            } catch (IOException e10) {
                throw new C21733a(2000, e10);
            }
        } catch (Throwable th2) {
            this.f68945s0 = null;
            if (this.f68947u0) {
                this.f68947u0 = false;
                m22236l();
            }
            throw th2;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f68944r0;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21733a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f68946t0;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C21733a(2000, e10);
            }
        }
        InputStream inputStream = this.f68945s0;
        int i12 = AbstractC20817s.f66106a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f68946t0;
        if (j11 != -1) {
            this.f68946t0 = j11 - ((long) i13);
        }
        m22235g(i13);
        return i13;
    }
}
