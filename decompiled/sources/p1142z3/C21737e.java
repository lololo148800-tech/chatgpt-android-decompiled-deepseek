package p1142z3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.instrumentation.file.C15378c;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p1073w3.AbstractC20817s;
import p544W9.AbstractC8746y3;

/* JADX INFO: renamed from: z3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21737e extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public final ContentResolver f68952q0;

    /* JADX INFO: renamed from: r0 */
    public Uri f68953r0;

    /* JADX INFO: renamed from: s0 */
    public AssetFileDescriptor f68954s0;

    /* JADX INFO: renamed from: t0 */
    public C15378c f68955t0;

    /* JADX INFO: renamed from: u0 */
    public long f68956u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f68957v0;

    public C21737e(Context context) {
        super(false);
        this.f68952q0 = context.getContentResolver();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21736d {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c21743k.f68974a.normalizeScheme();
            this.f68953r0 = uriNormalizeScheme;
            m22237m();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f68952q0;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f68954s0 = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C21736d(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
            C15378c c15378cM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptor), fileDescriptor);
            this.f68955t0 = c15378cM9493d;
            long j10 = c21743k.f68979f;
            if (length != -1 && j10 > length) {
                throw new C21736d(2008, null);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = c15378cM9493d.skip(startOffset + j10) - startOffset;
            if (jSkip != j10) {
                throw new C21736d(2008, null);
            }
            if (length == -1) {
                FileChannel channel = c15378cM9493d.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f68956u0 = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f68956u0 = jPosition;
                    if (jPosition < 0) {
                        throw new C21736d(2008, null);
                    }
                }
            } else {
                long j11 = length - jSkip;
                this.f68956u0 = j11;
                if (j11 < 0) {
                    throw new C21736d(2008, null);
                }
            }
            long j12 = c21743k.f68980g;
            if (j12 != -1) {
                long j13 = this.f68956u0;
                this.f68956u0 = j13 == -1 ? j12 : Math.min(j13, j12);
            }
            this.f68957v0 = true;
            m22238n(c21743k);
            return j12 != -1 ? j12 : this.f68956u0;
        } catch (C21736d e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C21736d(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p1142z3.InterfaceC21740h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f68953r0 = null;
        try {
            C15378c c15378c = this.f68955t0;
            if (c15378c != null) {
                c15378c.close();
            }
            this.f68955t0 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f68954s0;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f68954s0 = null;
                    if (this.f68957v0) {
                        this.f68957v0 = false;
                        m22236l();
                    }
                } catch (IOException e10) {
                    throw new C21736d(2000, e10);
                }
            } catch (Throwable th2) {
                this.f68954s0 = null;
                if (this.f68957v0) {
                    this.f68957v0 = false;
                    m22236l();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new C21736d(2000, e11);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f68953r0;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21736d {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f68956u0;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C21736d(2000, e10);
            }
        }
        C15378c c15378c = this.f68955t0;
        int i12 = AbstractC20817s.f66106a;
        int i13 = c15378c.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f68956u0;
        if (j11 != -1) {
            this.f68956u0 = j11 - ((long) i13);
        }
        m22235g(i13);
        return i13;
    }
}
