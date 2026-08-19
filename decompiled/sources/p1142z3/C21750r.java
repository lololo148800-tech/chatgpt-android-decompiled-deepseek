package p1142z3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: z3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C21750r extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public RandomAccessFile f69006q0;

    /* JADX INFO: renamed from: r0 */
    public Uri f69007r0;

    /* JADX INFO: renamed from: s0 */
    public long f69008s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f69009t0;

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21749q {
        Uri uri = c21743k.f68974a;
        long j10 = c21743k.f68979f;
        this.f69007r0 = uri;
        m22237m();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f69006q0 = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = c21743k.f68980g;
                if (length == -1) {
                    length = this.f69006q0.length() - j10;
                }
                this.f69008s0 = length;
                if (length < 0) {
                    throw new C21749q(2008, null, null);
                }
                this.f69009t0 = true;
                m22238n(c21743k);
                return this.f69008s0;
            } catch (IOException e10) {
                throw new C21749q(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C21749q((AbstractC20817s.f66106a < 21 || !AbstractC21748p.m22248b(e11.getCause())) ? 2005 : 2006, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM9896o.append(fragment);
            throw new C21749q(1004, e11, sbM9896o.toString());
        } catch (SecurityException e12) {
            throw new C21749q(2006, e12);
        } catch (RuntimeException e13) {
            throw new C21749q(2000, e13);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f69007r0 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f69006q0;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f69006q0 = null;
                if (this.f69009t0) {
                    this.f69009t0 = false;
                    m22236l();
                }
            } catch (IOException e10) {
                throw new C21749q(2000, e10);
            }
        } catch (Throwable th2) {
            this.f69006q0 = null;
            if (this.f69009t0) {
                this.f69009t0 = false;
                m22236l();
            }
            throw th2;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f69007r0;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21749q {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f69008s0;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f69006q0;
            int i12 = AbstractC20817s.f66106a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f69008s0 -= (long) i13;
                m22235g(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new C21749q(2000, e10);
        }
    }
}
