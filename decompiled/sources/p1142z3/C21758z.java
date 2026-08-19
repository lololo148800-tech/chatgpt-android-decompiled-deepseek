package p1142z3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.instrumentation.file.C15378c;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p1073w3.AbstractC20817s;
import p544W9.AbstractC8746y3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: z3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C21758z extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public final Context f69016q0;

    /* JADX INFO: renamed from: r0 */
    public C21743k f69017r0;

    /* JADX INFO: renamed from: s0 */
    public AssetFileDescriptor f69018s0;

    /* JADX INFO: renamed from: t0 */
    public C15378c f69019t0;

    /* JADX INFO: renamed from: u0 */
    public long f69020u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f69021v0;

    public C21758z(Context context) {
        super(false);
        this.f69016q0 = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21757y {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.f69017r0 = c21743k;
        m22237m();
        Uri uriNormalizeScheme = c21743k.f68974a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f69016q0;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C21757y(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C21757y(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C21757y(1004, null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.");
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(Separators.SLASH)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new C21757y(2005, e10, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C21757y(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC9306j0.m9890i(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new C21757y(2005, null, "Resource not found.");
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C21757y(2000, null, "Resource is compressed: " + uriNormalizeScheme);
            }
            this.f69018s0 = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileDescriptor fileDescriptor = this.f69018s0.getFileDescriptor();
            C15378c c15378cM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptor), fileDescriptor);
            this.f69019t0 = c15378cM9493d;
            long j10 = c21743k.f68979f;
            try {
                if (length != -1 && j10 > length) {
                    throw new C21757y(2008, null, null);
                }
                long startOffset = this.f69018s0.getStartOffset();
                long jSkip = c15378cM9493d.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new C21757y(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = c15378cM9493d.getChannel();
                    if (channel.size() == 0) {
                        this.f69020u0 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f69020u0 = size;
                        if (size < 0) {
                            throw new C21757y(2008, null, null);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.f69020u0 = j11;
                    if (j11 < 0) {
                        throw new C21741i(2008);
                    }
                }
                long j12 = c21743k.f68980g;
                if (j12 != -1) {
                    long j13 = this.f69020u0;
                    this.f69020u0 = j13 == -1 ? j12 : Math.min(j13, j12);
                }
                this.f69021v0 = true;
                m22238n(c21743k);
                return j12 != -1 ? j12 : this.f69020u0;
            } catch (C21757y e11) {
                throw e11;
            } catch (IOException e12) {
                throw new C21757y(2000, e12, null);
            }
        } catch (Resources.NotFoundException e13) {
            throw new C21757y(2005, e13, null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p1142z3.InterfaceC21740h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f69017r0 = null;
        try {
            C15378c c15378c = this.f69019t0;
            if (c15378c != null) {
                c15378c.close();
            }
            this.f69019t0 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f69018s0;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f69018s0 = null;
                    if (this.f69021v0) {
                        this.f69021v0 = false;
                        m22236l();
                    }
                } catch (IOException e10) {
                    throw new C21757y(2000, e10, null);
                }
            } catch (Throwable th2) {
                this.f69018s0 = null;
                if (this.f69021v0) {
                    this.f69021v0 = false;
                    m22236l();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new C21757y(2000, e11, null);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        C21743k c21743k = this.f69017r0;
        if (c21743k != null) {
            return c21743k.f68974a;
        }
        return null;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21757y {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f69020u0;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C21757y(2000, e10, null);
            }
        }
        C15378c c15378c = this.f69019t0;
        int i12 = AbstractC20817s.f66106a;
        int i13 = c15378c.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f69020u0 == -1) {
                return -1;
            }
            throw new C21757y(2000, new EOFException(), "End of stream reached having not read sufficient data.");
        }
        long j11 = this.f69020u0;
        if (j11 != -1) {
            this.f69020u0 = j11 - ((long) i13);
        }
        m22235g(i13);
        return i13;
    }
}
