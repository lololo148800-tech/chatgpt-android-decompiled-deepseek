package p111E5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p160G5.C3003i;
import p275Kn.C4822i;
import p374P5.AbstractC6356i;
import p374P5.C6361n;
import p523V9.AbstractC8206u4;

/* JADX INFO: renamed from: E5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2337u implements InterfaceC2326j {

    /* JADX INFO: renamed from: a */
    public final C4822i f7256a;

    public C2337u(C4822i c4822i) {
        this.f7256a = c4822i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    @Override // p111E5.InterfaceC2326j
    /* JADX INFO: renamed from: a */
    public final InterfaceC2327k mo3427a(C3003i c3003i, C6361n c6361n) {
        ImageDecoder.Source sourceCreateSource;
        C0654C c0654cMo3432z0;
        Bitmap.Config configM6975b = AbstractC6356i.m6975b(c6361n);
        if (configM6975b != Bitmap.Config.ARGB_8888 && configM6975b != Bitmap.Config.HARDWARE) {
            return null;
        }
        InterfaceC2333q interfaceC2333q = c3003i.f9028a;
        if (interfaceC2333q.mo3431x0() != AbstractC0682p.f1991a || (c0654cMo3432z0 = interfaceC2333q.mo3432z0()) == null) {
            AbstractC8206u4 abstractC8206u4Mo3430R = interfaceC2333q.mo3430R();
            boolean z6 = abstractC8206u4Mo3430R instanceof C2317a;
            Context context = c6361n.f20697a;
            if (z6) {
                sourceCreateSource = ImageDecoder.createSource(context.getAssets(), ((C2317a) abstractC8206u4Mo3430R).f7208a);
            } else if ((abstractC8206u4Mo3430R instanceof C2323g) && Build.VERSION.SDK_INT >= 29) {
                try {
                    AssetFileDescriptor assetFileDescriptor = ((C2323g) abstractC8206u4Mo3430R).f7223a;
                    Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                    sourceCreateSource = ImageDecoder.createSource(new CallableC2341y(assetFileDescriptor, 0));
                } catch (ErrnoException unused) {
                    sourceCreateSource = null;
                }
            } else if (abstractC8206u4Mo3430R instanceof C2334r) {
                C2334r c2334r = (C2334r) abstractC8206u4Mo3430R;
                if (c2334r.f7249a.equals(context.getPackageName())) {
                    sourceCreateSource = ImageDecoder.createSource(context.getResources(), c2334r.f7250b);
                } else if (abstractC8206u4Mo3430R instanceof C2322f) {
                    sourceCreateSource = ImageDecoder.createSource(((C2322f) abstractC8206u4Mo3430R).f7222a);
                } else {
                    sourceCreateSource = null;
                }
            } else if (abstractC8206u4Mo3430R instanceof C2322f) {
                sourceCreateSource = ImageDecoder.createSource(((C2322f) abstractC8206u4Mo3430R).f7222a);
            } else {
                sourceCreateSource = null;
            }
        } else {
            sourceCreateSource = ImageDecoder.createSource(c0654cMo3432z0.m1322f());
        }
        if (sourceCreateSource == null) {
            return null;
        }
        return new C2340x(sourceCreateSource, c3003i.f9028a, c6361n, this.f7256a);
    }
}
