package p182H3;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: H3.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC3203d extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9664a = 1;

    /* JADX INFO: renamed from: b */
    public Object f9665b;

    public /* synthetic */ HandlerC3203d() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f9664a) {
            case 0:
                C3205f c3205f = (C3205f) this.f9665b;
                c3205f.getClass();
                int i10 = message.what;
                C3204e c3204e = null;
                if (i10 == 1) {
                    C3204e c3204e2 = (C3204e) message.obj;
                    try {
                        c3205f.f9673Y.queueInputBuffer(c3204e2.f9666a, 0, c3204e2.f9667b, c3204e2.f9669d, c3204e2.f9670e);
                        break;
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = c3205f.f9676p0;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                    c3204e = c3204e2;
                } else if (i10 == 2) {
                    C3204e c3204e3 = (C3204e) message.obj;
                    int i11 = c3204e3.f9666a;
                    MediaCodec.CryptoInfo cryptoInfo = c3204e3.f9668c;
                    long j10 = c3204e3.f9669d;
                    int i12 = c3204e3.f9670e;
                    try {
                        synchronized (C3205f.f9672t0) {
                            c3205f.f9673Y.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                            break;
                        }
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference2 = c3205f.f9676p0;
                        while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                        }
                    }
                    c3204e = c3204e3;
                } else if (i10 == 3) {
                    c3205f.f9677q0.m1015h();
                } else if (i10 != 4) {
                    AtomicReference atomicReference3 = c3205f.f9676p0;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        c3205f.f9673Y.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e12) {
                        AtomicReference atomicReference4 = c3205f.f9676p0;
                        while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (c3204e != null) {
                    C3205f.m4067b(c3204e);
                    return;
                }
                return;
            default:
                int i13 = message.what;
                if (i13 == -3 || i13 == -2 || i13 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f9665b).get(), message.what);
                    return;
                } else {
                    if (i13 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3203d(C3205f c3205f, Looper looper) {
        super(looper);
        this.f9665b = c3205f;
    }
}
