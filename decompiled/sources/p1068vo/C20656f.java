package p1068vo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import p1048uo.C20396c;
import p1048uo.C20407n;
import p1113xn.C21307a;
import p885m4.C17152b;

/* JADX INFO: renamed from: vo.f */
/* JADX INFO: loaded from: classes2.dex */
public class C20656f implements InterfaceC20664n {

    /* JADX INFO: renamed from: f */
    public static final C20655e f65534f = new C20655e();

    /* JADX INFO: renamed from: a */
    public final Class f65535a;

    /* JADX INFO: renamed from: b */
    public final Method f65536b;

    /* JADX INFO: renamed from: c */
    public final Method f65537c;

    /* JADX INFO: renamed from: d */
    public final Method f65538d;

    /* JADX INFO: renamed from: e */
    public final Method f65539e;

    public C20656f(Class cls) throws NoSuchMethodException {
        this.f65535a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC16544l.m18093f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f65536b = declaredMethod;
        this.f65537c = cls.getMethod("setHostname", String.class);
        this.f65538d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f65539e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: a */
    public final boolean mo21201a(SSLSocket sSLSocket) {
        return this.f65535a.isInstance(sSLSocket);
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: b */
    public final boolean mo21202b() {
        boolean z6 = C20396c.f64506e;
        return C20396c.f64506e;
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: c */
    public final String mo21203c(SSLSocket sSLSocket) {
        if (!this.f65535a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f65538d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, C21307a.f67720a);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC16544l.m18089b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p1068vo.InterfaceC20664n
    /* JADX INFO: renamed from: d */
    public final void mo21204d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        if (this.f65535a.isInstance(sSLSocket)) {
            try {
                this.f65536b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f65537c.invoke(sSLSocket, str);
                }
                Method method = this.f65539e;
                C20407n c20407n = C20407n.f64525a;
                method.invoke(sSLSocket, C17152b.m18911h(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
