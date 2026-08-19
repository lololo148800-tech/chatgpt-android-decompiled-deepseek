package p111E5;

import android.graphics.ImageDecoder;
import kotlin.jvm.internal.C16556x;
import p033B5.C0817a;
import p275Kn.C4822i;
import p374P5.C6361n;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2340x implements InterfaceC2327k {

    /* JADX INFO: renamed from: a */
    public final ImageDecoder.Source f7264a;

    /* JADX INFO: renamed from: b */
    public final AutoCloseable f7265b;

    /* JADX INFO: renamed from: c */
    public final C6361n f7266c;

    /* JADX INFO: renamed from: d */
    public final C4822i f7267d;

    public C2340x(ImageDecoder.Source source, AutoCloseable autoCloseable, C6361n c6361n, C4822i c4822i) {
        this.f7264a = source;
        this.f7265b = autoCloseable;
        this.f7266c = c6361n;
        this.f7267d = c4822i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p111E5.InterfaceC2327k
    /* JADX INFO: renamed from: a */
    public final Object mo3428a(InterfaceC18770c interfaceC18770c) {
        C2338v c2338v;
        C2340x c2340x;
        C4822i c4822i;
        if (interfaceC18770c instanceof C2338v) {
            c2338v = (C2338v) interfaceC18770c;
            int i10 = c2338v.f7261q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2338v.f7261q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2338v = new C2338v(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c2338v = new C2338v(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c2338v.f7259o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2338v.f7261q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c2338v.f7257Y = this;
            C4822i c4822i2 = this.f7267d;
            c2338v.f7258Z = c4822i2;
            c2338v.f7261q0 = 1;
            if (c4822i2.m5452a(c2338v) == enumC19250a) {
                return enumC19250a;
            }
            c2340x = this;
            c4822i = c4822i2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4822i = c2338v.f7258Z;
            c2340x = c2338v.f7257Y;
            AbstractC9233X.m9807c(obj);
        }
        try {
            AutoCloseable autoCloseable = c2340x.f7265b;
            try {
                C16556x c16556x = new C16556x();
                C2325i c2325i = new C2325i(new C0817a(ImageDecoder.decodeBitmap(c2340x.f7264a, new C2339w(c2340x, c16556x)), true), c16556x.f51285Y);
                AbstractC8706s.m9414b(autoCloseable, null);
                c4822i.m5454c();
                return c2325i;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC8706s.m9414b(autoCloseable, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            c4822i.m5454c();
            throw th4;
        }
    }
}
