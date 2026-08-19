package p993rj;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p874lj.C17057a;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import tj.EnumC19999a;

/* JADX INFO: renamed from: rj.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19055q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f60716Y;

    /* JADX INFO: renamed from: Z */
    public int f60717Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19024D f60718o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19055q(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60718o0 = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19055q(this.f60718o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19055q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1261q;
        C19024D c19024d;
        CameraDevice cameraDevice;
        ArrayList arrayListM19384m;
        Object objM18885c;
        C19038S c19038s;
        CameraDevice cameraDevice2;
        ArrayList arrayListM19384m2;
        Object objM18885c2;
        C19031K c19031k;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60717Z;
        C17057a c17057a = C19031K.f60659j;
        C19024D c19024d2 = this.f60718o0;
        if (i10 != 0) {
            if (i10 == 1) {
                C19024D c19024d3 = (C19024D) this.f60716Y;
                AbstractC9233X.m9807c(obj);
                c19024d = c19024d3;
                objM1261q = obj;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    objM18885c2 = obj;
                    c19031k = (C19031K) objM18885c2;
                    c19024d2.f60631p = c19031k;
                    c19031k.m20293a();
                    return C17296C.f55119a;
                }
                CameraDevice cameraDevice3 = (CameraDevice) this.f60716Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    cameraDevice = cameraDevice3;
                    objM18885c = obj;
                } catch (Exception unused) {
                    cameraDevice2 = cameraDevice3;
                    c19024d2.f60641z = 1.0f;
                    c19024d2.f60613A = c19024d2.m20280b();
                    arrayListM19384m2 = AbstractC17681o.m19384m(c19024d2.f60618c.getHolder().getSurface(), c19024d2.f60613A.getSurface());
                    if (c19024d2.f60620e == EnumC19999a.f63315Z) {
                        arrayListM19384m2.add(c19024d2.f60628m.m20294a());
                    }
                    Handler handler = c19024d2.f60630o;
                    this.f60716Y = null;
                    this.f60717Z = 3;
                    objM18885c2 = c17057a.m18885c(c19024d2.f60617b, c19024d2.f60626k, arrayListM19384m2, cameraDevice2, handler, this);
                    if (objM18885c2 == enumC19250a) {
                        return enumC19250a;
                    }
                    c19031k = (C19031K) objM18885c2;
                    c19024d2.f60631p = c19031k;
                }
            }
            c19024d2.f60631p = (C19031K) objM18885c;
            c19031k = (C19031K) objM18885c;
            c19031k.m20293a();
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        if (c19024d2.f60629n != null) {
            cameraDevice = c19024d2.f60629n;
            if (cameraDevice != null) {
                throw new IllegalStateException("Unable to open camera");
            }
            arrayListM19384m = AbstractC17681o.m19384m(c19024d2.f60618c.getHolder().getSurface(), c19024d2.f60613A.getSurface());
            if (c19024d2.f60620e == EnumC19999a.f63315Z) {
                c19038s = c19024d2.f60628m;
                if (!c19038s.f60694i) {
                    c19038s.f60694i = true;
                    c19038s.m20296c(true);
                }
                arrayListM19384m.add(c19038s.m20294a());
            }
            try {
                C19032L c19032l = c19024d2.f60617b;
                CameraCharacteristics cameraCharacteristics = c19024d2.f60626k;
                Handler handler2 = c19024d2.f60630o;
                this.f60716Y = cameraDevice;
                this.f60717Z = 2;
                objM18885c = c17057a.m18885c(c19032l, cameraCharacteristics, arrayListM19384m, cameraDevice, handler2, this);
                if (objM18885c == enumC19250a) {
                    return enumC19250a;
                }
                c19024d2.f60631p = (C19031K) objM18885c;
                c19031k = (C19031K) objM18885c;
            } catch (Exception unused2) {
                cameraDevice2 = cameraDevice;
                c19024d2.f60641z = 1.0f;
                c19024d2.f60613A = c19024d2.m20280b();
                arrayListM19384m2 = AbstractC17681o.m19384m(c19024d2.f60618c.getHolder().getSurface(), c19024d2.f60613A.getSurface());
                if (c19024d2.f60620e == EnumC19999a.f63315Z) {
                    arrayListM19384m2.add(c19024d2.f60628m.m20294a());
                }
                Handler handler3 = c19024d2.f60630o;
                this.f60716Y = null;
                this.f60717Z = 3;
                objM18885c2 = c17057a.m18885c(c19024d2.f60617b, c19024d2.f60626k, arrayListM19384m2, cameraDevice2, handler3, this);
                if (objM18885c2 == enumC19250a) {
                    return enumC19250a;
                }
                c19031k = (C19031K) objM18885c2;
                c19024d2.f60631p = c19031k;
            }
            c19031k.m20293a();
            return C17296C.f55119a;
        }
        String str = c19024d2.f60617b.f60669a;
        Handler handler4 = c19024d2.f60630o;
        this.f60716Y = c19024d2;
        this.f60717Z = 1;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
        c0624m.m1262r();
        c19024d2.f60625j.openCamera(str, new C19056r(c0624m, c19024d2, str), handler4);
        objM1261q = c0624m.m1261q();
        if (objM1261q == enumC19250a) {
            return enumC19250a;
        }
        c19024d = c19024d2;
        cameraDevice2 = cameraDevice;
        c19024d2.f60641z = 1.0f;
        c19024d2.f60613A = c19024d2.m20280b();
        arrayListM19384m2 = AbstractC17681o.m19384m(c19024d2.f60618c.getHolder().getSurface(), c19024d2.f60613A.getSurface());
        if (c19024d2.f60620e == EnumC19999a.f63315Z) {
            arrayListM19384m2.add(c19024d2.f60628m.m20294a());
        }
        Handler handler5 = c19024d2.f60630o;
        this.f60716Y = null;
        this.f60717Z = 3;
        objM18885c2 = c17057a.m18885c(c19024d2.f60617b, c19024d2.f60626k, arrayListM19384m2, cameraDevice2, handler5, this);
        if (objM18885c2 == enumC19250a) {
            return enumC19250a;
        }
        c19031k = (C19031K) objM18885c2;
        c19024d2.f60631p = c19031k;
        c19031k.m20293a();
        return C17296C.f55119a;
        c19024d.f60629n = (CameraDevice) objM1261q;
        cameraDevice = c19024d2.f60629n;
        if (cameraDevice != null) {
            throw new IllegalStateException("Unable to open camera");
        }
        arrayListM19384m = AbstractC17681o.m19384m(c19024d2.f60618c.getHolder().getSurface(), c19024d2.f60613A.getSurface());
        if (c19024d2.f60620e == EnumC19999a.f63315Z) {
            c19038s = c19024d2.f60628m;
            if (!c19038s.f60694i) {
                c19038s.f60694i = true;
                c19038s.m20296c(true);
            }
            arrayListM19384m.add(c19038s.m20294a());
        }
        C19032L c19032l2 = c19024d2.f60617b;
        CameraCharacteristics cameraCharacteristics2 = c19024d2.f60626k;
        Handler handler6 = c19024d2.f60630o;
        this.f60716Y = cameraDevice;
        this.f60717Z = 2;
        objM18885c = c17057a.m18885c(c19032l2, cameraCharacteristics2, arrayListM19384m, cameraDevice, handler6, this);
        if (objM18885c == enumC19250a) {
            return enumC19250a;
        }
        c19024d2.f60631p = (C19031K) objM18885c;
        c19031k = (C19031K) objM18885c;
        c19031k.m20293a();
        return C17296C.f55119a;
    }
}
